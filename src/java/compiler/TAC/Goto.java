package TAC;

public class Goto extends Instruction{
  private Label label;

  Goto(String l) {
    this.label = l;
  }

  public Label getLabel() {
    return this.label;
  }

  @Override
  public String toString() {
        return "goto " + label.getName();
  }

}
