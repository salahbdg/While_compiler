package java.compiler.semanticAnalyzer;

import java.compiler.SymbolTable.SymbolTable;

import org.antlr.runtime.tree.CommonTree;

public class SemanticAnalyzer {
    private SymbolTable symbolTable = new SymbolTable();

    public void visit(CommonTree node) {
        switch (node.getText()) {
            case "ASSIGN":
                handleAssignment(node);
                break;
            case "PRINT":
                handlePrint(node);
                break;
            case "WHILE":
                handleWhile(node);
                break;
            case "EXPR":
                evaluateExpression(node);
                break;
            default:
                for (Object child : node.getChildren()) {
                    visit((CommonTree) child);
                }
        }
    }

    private void handleAssignment(CommonTree node) {
        String varName = node.getChild(0).getText();
        CommonTree exprNode = (CommonTree) node.getChild(1);

        // Assume variables are integers or strings for simplicity
        String exprType = evaluateExpression(exprNode);
        if (exprType == null) {
            System.err.println("Error: Invalid expression in assignment to " + varName);
        } else {
            symbolTable.declareVariable(varName, exprType);
        }
    }

    private void handlePrint(CommonTree node) {
        CommonTree exprNode = (CommonTree) node.getChild(0);
        String exprType = evaluateExpression(exprNode);
        if (exprType == null) {
            System.err.println("Error: Invalid expression in print statement");
        }
    }

    private void handleWhile(CommonTree node) {
        CommonTree conditionNode = (CommonTree) node.getChild(0);
        String conditionType = evaluateExpression(conditionNode);
        if (!"boolean".equals(conditionType)) {
            System.err.println("Error: While loop condition must be a boolean");
        }
    }

    private String evaluateExpression(CommonTree node) {
        if (node.getText().matches("\\d+")) {
            return "int";
        } else if (node.getText().startsWith("\"")) {
            return "string";
        } else if (symbolTable.isDeclared(node.getText())) {
            return symbolTable.lookup(node.getText());
        } else if (node.getText().equals("+") || node.getText().equals("-")) {
            String leftType = evaluateExpression((CommonTree) node.getChild(0));
            String rightType = evaluateExpression((CommonTree) node.getChild(1));
            if (!"int".equals(leftType) || !"int".equals(rightType)) {
                System.err.println("Error: Type mismatch in expression at " + node.toStringTree());
                return null;
            }
            return "int";
        }
        System.err.println("Error: Undeclared variable or invalid expression " + node.getText());
        return null;
    }
}