package TAC;

//Represente un saut inconditionnel vers un label (un autre point)
public class Goto extends Instruction{
  private Label label;

  Goto(Label l) {
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
