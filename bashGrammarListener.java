// Generated from .\bashGrammar.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link bashGrammarParser}.
 */
public interface bashGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link bashGrammarParser#code}.
	 * @param ctx the parse tree
	 */
	void enterCode(bashGrammarParser.CodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link bashGrammarParser#code}.
	 * @param ctx the parse tree
	 */
	void exitCode(bashGrammarParser.CodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link bashGrammarParser#bashScript}.
	 * @param ctx the parse tree
	 */
	void enterBashScript(bashGrammarParser.BashScriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link bashGrammarParser#bashScript}.
	 * @param ctx the parse tree
	 */
	void exitBashScript(bashGrammarParser.BashScriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link bashGrammarParser#expressions}.
	 * @param ctx the parse tree
	 */
	void enterExpressions(bashGrammarParser.ExpressionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link bashGrammarParser#expressions}.
	 * @param ctx the parse tree
	 */
	void exitExpressions(bashGrammarParser.ExpressionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link bashGrammarParser#loops}.
	 * @param ctx the parse tree
	 */
	void enterLoops(bashGrammarParser.LoopsContext ctx);
	/**
	 * Exit a parse tree produced by {@link bashGrammarParser#loops}.
	 * @param ctx the parse tree
	 */
	void exitLoops(bashGrammarParser.LoopsContext ctx);
	/**
	 * Enter a parse tree produced by {@link bashGrammarParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void enterWhile_loop(bashGrammarParser.While_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link bashGrammarParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void exitWhile_loop(bashGrammarParser.While_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link bashGrammarParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void enterFor_loop(bashGrammarParser.For_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link bashGrammarParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void exitFor_loop(bashGrammarParser.For_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link bashGrammarParser#inside_for}.
	 * @param ctx the parse tree
	 */
	void enterInside_for(bashGrammarParser.Inside_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link bashGrammarParser#inside_for}.
	 * @param ctx the parse tree
	 */
	void exitInside_for(bashGrammarParser.Inside_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link bashGrammarParser#ifElse}.
	 * @param ctx the parse tree
	 */
	void enterIfElse(bashGrammarParser.IfElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link bashGrammarParser#ifElse}.
	 * @param ctx the parse tree
	 */
	void exitIfElse(bashGrammarParser.IfElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link bashGrammarParser#multi_conditions}.
	 * @param ctx the parse tree
	 */
	void enterMulti_conditions(bashGrammarParser.Multi_conditionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link bashGrammarParser#multi_conditions}.
	 * @param ctx the parse tree
	 */
	void exitMulti_conditions(bashGrammarParser.Multi_conditionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link bashGrammarParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(bashGrammarParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link bashGrammarParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(bashGrammarParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link bashGrammarParser#linux_command}.
	 * @param ctx the parse tree
	 */
	void enterLinux_command(bashGrammarParser.Linux_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link bashGrammarParser#linux_command}.
	 * @param ctx the parse tree
	 */
	void exitLinux_command(bashGrammarParser.Linux_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link bashGrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(bashGrammarParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link bashGrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(bashGrammarParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link bashGrammarParser#advanced_assignment}.
	 * @param ctx the parse tree
	 */
	void enterAdvanced_assignment(bashGrammarParser.Advanced_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link bashGrammarParser#advanced_assignment}.
	 * @param ctx the parse tree
	 */
	void exitAdvanced_assignment(bashGrammarParser.Advanced_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link bashGrammarParser#command_data}.
	 * @param ctx the parse tree
	 */
	void enterCommand_data(bashGrammarParser.Command_dataContext ctx);
	/**
	 * Exit a parse tree produced by {@link bashGrammarParser#command_data}.
	 * @param ctx the parse tree
	 */
	void exitCommand_data(bashGrammarParser.Command_dataContext ctx);
	/**
	 * Enter a parse tree produced by {@link bashGrammarParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(bashGrammarParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link bashGrammarParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(bashGrammarParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link bashGrammarParser#increment}.
	 * @param ctx the parse tree
	 */
	void enterIncrement(bashGrammarParser.IncrementContext ctx);
	/**
	 * Exit a parse tree produced by {@link bashGrammarParser#increment}.
	 * @param ctx the parse tree
	 */
	void exitIncrement(bashGrammarParser.IncrementContext ctx);
	/**
	 * Enter a parse tree produced by {@link bashGrammarParser#space}.
	 * @param ctx the parse tree
	 */
	void enterSpace(bashGrammarParser.SpaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link bashGrammarParser#space}.
	 * @param ctx the parse tree
	 */
	void exitSpace(bashGrammarParser.SpaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link bashGrammarParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(bashGrammarParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link bashGrammarParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(bashGrammarParser.StringContext ctx);
}