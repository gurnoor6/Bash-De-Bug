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