package java.antlr;
// Generated from while.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link whileParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface whileVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link whileParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(whileParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link whileParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(whileParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link whileParser#definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition(whileParser.DefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link whileParser#input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput(whileParser.InputContext ctx);
	/**
	 * Visit a parse tree produced by {@link whileParser#output}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput(whileParser.OutputContext ctx);
	/**
	 * Visit a parse tree produced by {@link whileParser#vars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVars(whileParser.VarsContext ctx);
	/**
	 * Visit a parse tree produced by {@link whileParser#exprs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprs(whileParser.ExprsContext ctx);
	/**
	 * Visit a parse tree produced by {@link whileParser#commands}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommands(whileParser.CommandsContext ctx);
	/**
	 * Visit a parse tree produced by {@link whileParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(whileParser.CommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link whileParser#exprBase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprBase(whileParser.ExprBaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link whileParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(whileParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link whileParser#lExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLExpr(whileParser.LExprContext ctx);
}