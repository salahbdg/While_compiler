package TAC;

public class Nope extends Instruction{

  @Override
  public String toString() {
    return "N_Nope";
  }

  @Override
  public String toPython(Indent indent) {
    return indent + "pass";
  }
  
}
