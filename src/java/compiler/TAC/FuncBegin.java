package TAC;

public class FuncBegin implements NoeudAST {
    private String functionName;

    public FuncBegin(String functionName) {
        this.functionName = functionName;
    }

    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    @Override
    public String toString() {
        return "function : " + functionName  + " {";
    }
}
