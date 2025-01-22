package TAC;

public class Label extends Instruction {
  
  private String name;

  public Label(String name) {
    this.name =  name;
  }

  public String getName() {
    return this.name;
  }

  @Override
  public String toString() {
    return this.name + ":";
  }

}
