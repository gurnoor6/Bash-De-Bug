// Generated from bashGrammar.g4 by ANTLR 4.9
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
	 * Visit a parse tree produced by {@link bashGrammarParser#function_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_def(bashGrammarParser.Function_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link bashGrammarParser#sed}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSed(bashGrammarParser.SedContext ctx);
	/**
	 * Visit a parse tree produced by {@link bashGrammarParser#linux_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinux_command(bashGrammarParser.Linux_commandContext ctx);
	/**
	 * Visit a parse tree produced by {@link bashGrammarParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(bashGrammarParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link bashGrammarParser#conditions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditions(bashGrammarParser.ConditionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link bashGrammarParser#condition1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition1(bashGrammarParser.Condition1Context ctx);
	/**
	 * Visit a parse tree produced by {@link bashGrammarParser#condition1_base}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition1_base(bashGrammarParser.Condition1_baseContext ctx);
	/**
	 * Visit a parse tree produced by {@link bashGrammarParser#condition2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition2(bashGrammarParser.Condition2Context ctx);
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
	 * Visit a parse tree produced by {@link bashGrammarParser#redirect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRedirect(bashGrammarParser.RedirectContext ctx);
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
	 * Visit a parse tree produced by {@link bashGrammarParser#tag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTag(bashGrammarParser.TagContext ctx);
	/**
	 * Visit a parse tree produced by {@link bashGrammarParser#open_bracket}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpen_bracket(bashGrammarParser.Open_bracketContext ctx);
	/**
	 * Visit a parse tree produced by {@link bashGrammarParser#close_bracket}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClose_bracket(bashGrammarParser.Close_bracketContext ctx);
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