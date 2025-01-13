package java.compiler;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.CommonTree;
import java.util.List;

public class Compiler {
  public static void main(String[] args) throws Exception {
    WhileLexer lexer = new WhileLexer(new ANTLRInputStream(System.in));
    WhileParser parser = new WhileParser(new CommonTokenStream(lexer));
    WhileParser.program_return result = parser.program();

    CommonTree ast = (CommonTree) result.getTree();
    TACGenerator tacGenerator = new TACGenerator();
    List<TAC> tacInstructions = tacGenerator.generate(ast);

    for (TAC instruction : tacInstructions) {
        System.out.println(instruction);
    }
  }
}