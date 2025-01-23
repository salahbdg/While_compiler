package TAC;

public class FuncBegin extends Instruction {
    private String functionName;

    public FuncBegin(String functionName) {
        this.functionName = functionName;
    }

    public String getFunctionName() {
        return this.functionName;
    }

    public void setFunctionName(String n) {
        this.functionName = n;
    }

    @Override
    public String toString() {
        return "function : " + this.functionName  + " {";
    }
}
