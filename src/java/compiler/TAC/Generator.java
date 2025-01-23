package TAC;

import java.util.ArrayList;
import java.util.List;
import org.antlr.runtime.tree.Tree;

public class Generator {
    private List<Instruction> instructions; // Liste des instructions générées
    private String[] args; // Arguments passés au programme
    private SymbolTable symbolTable; // Table des symboles
    private Tree ast; // Arbre syntaxique abstrait (AST)

    // Constructeur
    public Generator(Tree ast, String[] args, SymbolTable s) throws Exception {
        this.args = args;
        this.symbolTable = s;
        this.instructions = new ArrayList<>();
        this.ast = ast;
        generateFromAST();
    }

    // Génération du code à partir de l'AST
    private void generateFromAST() throws Exception {
        if (!ast.getText().equals("N_Program")) {
            throw new Exception("L'AST doit commencer par un nœud N_Program.");
        }

        initializeArgs(); // Initialiser les arguments comme variables

        for (int i = 0; i < ast.getChildCount(); i++) {
            Tree funcNode = ast.getChild(i);
            processFunction(funcNode);
        }
    }

    // Initialise les arguments passés au programme dans le TAC
    private void initializeArgs() {
        for (int i = 0; i < args.length; i++) {
            String variable = "arg" + i; // Nom des variables générées
            instructions.add(new N_Affectation(variable, args[i])); // Assignation des arguments
        }
    }

    // Traite une fonction dans l'AST
    private void processFunction(Tree functionNode) throws Exception {
        if (!functionNode.getText().equals("N_Function")) {
            throw new Exception("Nœud inattendu : " + functionNode.getText());
        }

        String functionName = functionNode.getChild(0).getText();
        Tree funcBody = functionNode.getChild(1);

        // Ajouter le début de la fonction
        instructions.add(new FuncBegin(functionName));

        // Traiter les commandes dans le corps de la fonction
        processCommands(funcBody);

        // Ajouter la fin de la fonction
        instructions.add(new FuncEnd());
    }

    // Traite une liste de commandes
    private void processCommands(Tree commandsNode) throws Exception {
        for (int i = 0; i < commandsNode.getChildCount(); i++) {
            Tree commandNode = commandsNode.getChild(i);
            processCommand(commandNode);
        }
    }

    // Traite une commande spécifique
    private void processCommand(Tree commandNode) throws Exception {
        switch (commandNode.getText()) {
            case "N_Affectation":
                processAffectation(commandNode);
                break;
            case "N_If":
                processIf(commandNode);
                break;
            case "N_While":
                processWhile(commandNode);
                break;
            case "N_For":
                processFor(commandNode);
                break;
            case "N_Foreach":
                processForeach(commandNode);
                break;
            case "N_Input":
                processInput(commandNode);
                break;
            case "N_Output":
                processOutput(commandNode);
                break;
            case "N_Nope":
                instructions.add(new Nope());
                break;
            default:
                throw new Exception("Commande inconnue : " + commandNode.getText());
        }
    }

    // Traite une instruction d'affectation
    private void processAffectation(Tree affectNode) throws Exception {
        Tree varsNode = affectNode.getChild(0); // Variables
        Tree exprsNode = affectNode.getChild(1); // Expressions

        for (int i = 0; i < varsNode.getChildCount(); i++) {
            String variable = varsNode.getChild(i).getText();
            Tree exprNode = exprsNode.getChild(i);
            String expressionResult = processExprBase(exprNode);
            instructions.add(new N_Affectation(variable, expressionResult));
        }
    }

    // Traite une instruction conditionnelle (if)
    private void processIf(Tree ifNode) throws Exception {
        Tree condition = ifNode.getChild(0); // Condition
        Tree thenCommands = ifNode.getChild(1); // Bloc "then"
        Tree elseCommands = ifNode.getChildCount() > 2 ? ifNode.getChild(2) : null; // Bloc "else"

        Label elseLabel = new Label("else");
        Label endLabel = new Label("endif");

        // Condition
        instructions.add(new IfzGoto(elseLabel, condition.getText()));

        // Bloc "then"
        processCommands(thenCommands);
        instructions.add(new Goto(endLabel));

        // Bloc "else" (si présent)
        if (elseCommands != null) {
            instructions.add(elseLabel);
            processCommands(elseCommands);
        }

        // Fin de l'if
        instructions.add(endLabel);
    }

    // Traite une boucle (while)
    private void processWhile(Tree whileNode) throws Exception {
        Tree condition = whileNode.getChild(0); // Condition
        Tree body = whileNode.getChild(1); // Corps de la boucle

        Label startLabel = new Label("while_start");
        Label endLabel = new Label("while_end");

        // Début de la boucle
        instructions.add(startLabel);

        // Condition
        instructions.add(new IfzGoto(endLabel, condition.getText()));

        // Corps de la boucle
        processCommands(body);

        // Retour au début
        instructions.add(new Goto(startLabel));

        // Fin de la boucle
        instructions.add(endLabel);
    }

    // Traite une boucle for
    private void processFor(Tree forNode) throws Exception {
        Tree iterator = forNode.getChild(0); // Itérateur
        Tree range = forNode.getChild(1); // Plage
        Tree body = forNode.getChild(2); // Corps de la boucle

        Label startLabel = new Label("for_start");
        Label endLabel = new Label("for_end");

        // Initialisation de l'itérateur
        instructions.add(new N_Affectation(iterator.getText(), range.getChild(0).getText()));

        // Début de la boucle
        instructions.add(startLabel);

        // Condition
        instructions.add(new IfzGoto(endLabel, iterator.getText()));

        // Corps de la boucle
        processCommands(body);

        // Mise à jour de l'itérateur
        instructions.add(new N_Affectation(iterator.getText(), iterator.getText() + " + 1"));

        // Retour au début
        instructions.add(new Goto(startLabel));

        // Fin de la boucle
        instructions.add(endLabel);
    }

    // Traite une boucle foreach
    private void processForeach(Tree foreachNode) throws Exception {
        Tree iterator = foreachNode.getChild(0); // Variable itératrice
        Tree collection = foreachNode.getChild(1); // Collection
        Tree body = foreachNode.getChild(2); // Corps de la boucle

        Label startLabel = new Label("foreach_start");
        Label endLabel = new Label("foreach_end");

        // Début de la boucle
        instructions.add(startLabel);

        // Vérification de la collection vide
        instructions.add(new IfzGoto(endLabel, collection.getText()));

        // Assignation de l'itérateur
        instructions.add(new N_Affectation(iterator.getText(), "hd(" + collection.getText() + ")"));

        // Corps de la boucle
        processCommands(body);

        // Mise à jour de la collection
        instructions.add(new N_Affectation(collection.getText(), "tl(" + collection.getText() + ")"));

        // Retour au début
        instructions.add(new Goto(startLabel));

        // Fin de la boucle
        instructions.add(endLabel);
    }

    // Traite une instruction d'entrée
    private void processInput(Tree inputNode) {
        for (int i = 0; i < inputNode.getChildCount(); i++) {
            String variable = inputNode.getChild(i).getText();
            instructions.add(new N_Affectation(variable, "read()"));
        }
    }

    // Traite une instruction de sortie
    private void processOutput(Tree outputNode) {
        for (int i = 0; i < outputNode.getChildCount(); i++) {
            String variable = outputNode.getChild(i).getText();
            instructions.add(new Instruction() {
                @Override
                public String toString() {
                    return "write(" + variable + ")";
                }
            });
        }
    }

    // Traite une expression de base
    private String processExprBase(Tree exprBaseNode) {
        String nodeType = exprBaseNode.getText();
        switch (nodeType) {
            case "N_Variable":
            case "N_Symbol":
                return exprBaseNode.getChild(0).getText();
            case "N_Nil":
                return "nil";
            case "N_Call":
                String functionName = exprBaseNode.getChild(0).getText();
                StringBuilder args = new StringBuilder();
                for (int i = 1; i < exprBaseNode.getChildCount(); i++) {
                    args.append(processExprBase(exprBaseNode.getChild(i))).append(", ");
                }
                if (args.length() > 0) {
                    args.setLength(args.length() - 2); // Supprimer la dernière virgule
                }
                return functionName + "(" + args + ")";
            default:
                throw new IllegalArgumentException("Expression de base non reconnue : " + nodeType);
        }
    }

    // Getter pour récupérer les instructions générées
    public List<Instruction> getInstructions() {
        return instructions;
    }
}
