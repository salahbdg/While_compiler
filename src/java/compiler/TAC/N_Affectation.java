package TAC;

public class N_Affectation implements NoeudAST {
    private N_Variable variable;
    private N_Expression expression;

    public N_Affectation(N_Variable variable, N_Expression expression) {
        this.variable = variable;
        this.expression = expression;
    }

    public N_Variable getVariable() {
        return this.variable;
    }

    public void setVariable(N_Variable variable) {
        this.variable = variable;
    }

    public N_Expression getExpression() {
        return this.expression;
    }

    public void setExpression(N_Expression expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        return this.variable + " := " + this.expression;
    }
}
