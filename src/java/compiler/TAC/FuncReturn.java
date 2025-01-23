package TAC;

// represente une instruction de retour de valeur depuis une fct
public class FuncReturn extends Instruction {
    private String returnVar; 

    public FuncReturn(String v) {
        this.returnVar = v;
    }

    public String getReturnVar() {
        return this.returnVar;
    }

    public void setReturnVar(String v) {
        this.returnVar = v;
    }

    @Override
    public String toString() {
        return "return " + this.returnVar;
    }
}
