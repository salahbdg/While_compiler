import org.antlr.runtime.tree.CommonTree;
import java.util.ArrayList;
import java.util.List;

public class TACGenerator {
    private List<TAC> instructions = new ArrayList<>();
    private int tempCounter = 0;
    private int labelCounter = 0;

    public List<TAC> generate(CommonTree node) {
        visit(node);
        return instructions;
    }

    private String visit(CommonTree node) {
        switch (node.getText()) {
            case "ASSIGN":
                return handleAssignment(node);
            case "PRINT":
                return handlePrint(node);
            case "WHILE":
                return handleWhile(node);
            case "EXPR":
                return handleExpression(node);
            case "CONDITION":
                return handleCondition(node);
            default:
                // Base case for literals and identifiers
                return node.getText();
        }
    }

    private String handleAssignment(CommonTree node) {
        String varName = node.getChild(0).getText();
        String exprResult = visit((CommonTree) node.getChild(1));
        instructions.add(new TAC(TAC.OpCode.ASSIGN, exprResult, null, varName));
        return varName;
    }

    private String handlePrint(CommonTree node) {
        String exprResult = visit((CommonTree) node.getChild(0));
        instructions.add(new TAC(TAC.OpCode.PRINT, exprResult, null, null));
        return null;
    }

    private String handleWhile(CommonTree node) {
        String startLabel = newLabel();
        String endLabel = newLabel();

        instructions.add(new TAC(TAC.OpCode.LABEL, null, null, startLabel));
        String conditionResult = visit((CommonTree) node.getChild(0));
        instructions.add(new TAC(TAC.OpCode.IF_FALSE, conditionResult, null, endLabel));
        visit((CommonTree) node.getChild(1)); // Visit the block
        instructions.add(new TAC(TAC.OpCode.GOTO, null, null, startLabel));
        instructions.add(new TAC(TAC.OpCode.LABEL, null, null, endLabel));

        return null;
    }

    private String handleExpression(CommonTree node) {
        String left = visit((CommonTree) node.getChild(0));
        String right = visit((CommonTree) node.getChild(1));
        String temp = newTemp();

        switch (node.getText()) {
            case "+": instructions.add(new TAC(TAC.OpCode.ADD, left, right, temp)); break;
            case "-": instructions.add(new TAC(TAC.OpCode.SUB, left, right, temp)); break;
            case "*": instructions.add(new TAC(TAC.OpCode.MULT, left, right, temp)); break;
            case "/": instructions.add(new TAC(TAC.OpCode.DIV, left, right, temp)); break;
        }
        return temp;
    }

    private String handleCondition(CommonTree node) {
        String left = visit((CommonTree) node.getChild(0));
        String right = visit((CommonTree) node.getChild(1));
        String temp = newTemp();

        // Assume boolean comparison emits a temporary result
        instructions.add(new TAC(TAC.OpCode.SUB, left, right, temp)); // Placeholder logic
        return temp;
    }

    private String newTemp() {
        return "t" + (tempCounter++);
    }

    private String newLabel() {
        return "L" + (labelCounter++);
    }
}