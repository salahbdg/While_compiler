package TAC;

public class N_Affectation implements NoeudAST {
    private String variableLeft;
    private String variableRight;


    public N_Affectation(String L, String R) {
        this.variableLeft = L;
        this.variableRight = R;
    }

    public String getVariableLeft() {
        return this.variableLeft;
    }

    public void setVariableLeft(String L) {
        this.variableLeft = L;
    }

    public String getVariableRight() {
        return this.variableRight;
    }

    public void setVariableRight(String R) {
        this.variableRight = R;
    }

    @Override
    public String toString() {
        return this.variableLeft + " := " + this.variableRight;
    }
}
