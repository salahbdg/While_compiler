package TAC;

public class IfzGoto extends Instruction {
  
    private String elseLabel; 
    private String endIfLabel; 
    private String condition; 

    public IfzGoto(String elseLabel, String endIfLabel, String condition) {
        this.elseLabel = elseLabel;
        this.endIfLabel = endIfLabel;
        this.condition = condition;
    }

    public String getElseLabel() {
        return elseLabel;
    }

    public String getEndIfLabel() {
        return endIfLabel;
    }

    public String getCondition() {
        return condition;
    }
  
    public void setCondition(String condition) {
        this.condition = condition;
    }


  @Override
  public String toString() {
    return "ifz " + condition + " goto " + elseLabel;
  }

}
