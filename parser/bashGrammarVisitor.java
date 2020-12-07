// Generated from bashGrammar.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link bashGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface bashGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link bashGrammarParser#code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode(bashGrammarParser.CodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link bashGrammarParser#bashScript}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBashScript(bashGrammarParser.BashScriptContext ctx);
	/**
	 * Visit a parse tree produced by {@link bashGrammarParser#expressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressions(bashGrammarParser.ExpressionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link bashGrammarParser#loops}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoops(bashGrammarParser.LoopsContext ctx);
	/**
	 * Visit a parse tree produced by {@link bashGrammarParser#while_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_loop(bashGrammarParser.While_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link bashGrammarParser#for_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_loop(bashGrammarParser.For_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link bashGrammarParser#inside_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInside_for(bashGrammarParser.Inside_forContext ctx);
	/**
	 * Visit a parse tree produced by {@link bashGrammarParser#ifElse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElse(bashGrammarParser.IfElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link bashGrammarParser#multi_conditions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulti_conditions(bashGrammarParser.Multi_conditionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link bashGrammarParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(bashGrammarParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link bashGrammarParser#linux_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinux_command(bashGrammarParser.Linux_commandContext ctx);
	/**
	 * Visit a parse tree produced by {@link bashGrammarParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(bashGrammarParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link bashGrammarParser#advanced_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdvanced_assignment(bashGrammarParser.Advanced_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link bashGrammarParser#command_data}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand_data(bashGrammarParser.Command_dataContext ctx);
	/**
	 * Visit a parse tree produced by {@link bashGrammarParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(bashGrammarParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link bashGrammarParser#increment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrement(bashGrammarParser.IncrementContext ctx);
	/**
	 * Visit a parse tree produced by {@link bashGrammarParser#space}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpace(bashGrammarParser.SpaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link bashGrammarParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(bashGrammarParser.StringContext ctx);
}