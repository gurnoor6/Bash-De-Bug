// Generated from bashGrammar.g4 by ANTLR 4.8
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