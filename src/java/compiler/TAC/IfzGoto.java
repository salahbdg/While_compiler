package TAC;

public class IfzGoto extends Instruction {
  
    private Label targetLabel; 
    private String conditionVar; 

    public IfzGoto(Label targetLabel, String conditionVar ) {
        this.targetLabel = targetLabel;
        this.conditionVar = conditionVar;
    }

    public String getConditionVar() {
        return this.conditionVar;
    }
  
    public void setConditionVar(String conditionVar) {
        this.conditionVar = conditionVar;
    }

    public Label getTargetLabel() {
        return this.targetLabel;
    }

    public void setTargetLabel(Label targetLabel) {
        this.targetLabel = targetLabel;
    }

  @Override
  public String toString() {
        return "ifz " + this.conditionVar + " goto " + this.targetLabel.getName();
  }

}
