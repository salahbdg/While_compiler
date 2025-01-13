package java.antlr;
// Generated from while.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link whileParser}.
 */
public interface whileListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link whileParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(whileParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link whileParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(whileParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link whileParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(whileParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link whileParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(whileParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link whileParser#definition}.
	 * @param ctx the parse tree
	 */
	void enterDefinition(whileParser.DefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link whileParser#definition}.
	 * @param ctx the parse tree
	 */
	void exitDefinition(whileParser.DefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link whileParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(whileParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link whileParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(whileParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by {@link whileParser#output}.
	 * @param ctx the parse tree
	 */
	void enterOutput(whileParser.OutputContext ctx);
	/**
	 * Exit a parse tree produced by {@link whileParser#output}.
	 * @param ctx the parse tree
	 */
	void exitOutput(whileParser.OutputContext ctx);
	/**
	 * Enter a parse tree produced by {@link whileParser#vars}.
	 * @param ctx the parse tree
	 */
	void enterVars(whileParser.VarsContext ctx);
	/**
	 * Exit a parse tree produced by {@link whileParser#vars}.
	 * @param ctx the parse tree
	 */
	void exitVars(whileParser.VarsContext ctx);
	/**
	 * Enter a parse tree produced by {@link whileParser#exprs}.
	 * @param ctx the parse tree
	 */
	void enterExprs(whileParser.ExprsContext ctx);
	/**
	 * Exit a parse tree produced by {@link whileParser#exprs}.
	 * @param ctx the parse tree
	 */
	void exitExprs(whileParser.ExprsContext ctx);
	/**
	 * Enter a parse tree produced by {@link whileParser#commands}.
	 * @param ctx the parse tree
	 */
	void enterCommands(whileParser.CommandsContext ctx);
	/**
	 * Exit a parse tree produced by {@link whileParser#commands}.
	 * @param ctx the parse tree
	 */
	void exitCommands(whileParser.CommandsContext ctx);
	/**
	 * Enter a parse tree produced by {@link whileParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(whileParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link whileParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(whileParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link whileParser#exprBase}.
	 * @param ctx the parse tree
	 */
	void enterExprBase(whileParser.ExprBaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link whileParser#exprBase}.
	 * @param ctx the parse tree
	 */
	void exitExprBase(whileParser.ExprBaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link whileParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(whileParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link whileParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(whileParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link whileParser#lExpr}.
	 * @param ctx the parse tree
	 */
	void enterLExpr(whileParser.LExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link whileParser#lExpr}.
	 * @param ctx the parse tree
	 */
	void exitLExpr(whileParser.LExprContext ctx);
}