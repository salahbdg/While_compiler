package TAC;

public class Goto extends Instruction{
  private String label;

  Goto(String l) {
    this.label = l;
  }

  public String getLabel() {
    return this.label;
  }

  @Override
  public String toString() {
        return "goto " + this.label;
  }

}
