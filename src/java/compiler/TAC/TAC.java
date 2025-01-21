package java.compiler.TAC;

public class TAC {
  public enum OpCode {
      ASSIGN, ADD, SUB, MULT, DIV, PRINT, GOTO, IF_TRUE, IF_FALSE, LABEL
  }

  private OpCode op;
  private String arg1, arg2, result;

  public TAC(OpCode op, String arg1, String arg2, String result) {
      this.op = op;
      this.arg1 = arg1;
      this.arg2 = arg2;
      this.result = result;
  }

  @Override
  public String toString() {
      switch (op) {
          case ASSIGN: return result + " = " + arg1;
          case ADD: return result + " = " + arg1 + " + " + arg2;
          case SUB: return result + " = " + arg1 + " - " + arg2;
          case MULT: return result + " = " + arg1 + " * " + arg2;
          case DIV: return result + " = " + arg1 + " / " + arg2;
          case PRINT: return "print " + arg1;
          case GOTO: return "goto " + result;
          case IF_TRUE: return "if " + arg1 + " goto " + result;
          case IF_FALSE: return "ifFalse " + arg1 + " goto " + result;
          case LABEL: return result + ":";
          default: return "";
      }
  }
}