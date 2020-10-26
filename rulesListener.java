// Generated from rules.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link rulesParser}.
 */
public interface rulesListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link rulesParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(rulesParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(rulesParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#addition}.
	 * @param ctx the parse tree
	 */
	void enterAddition(rulesParser.AdditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#addition}.
	 * @param ctx the parse tree
	 */
	void exitAddition(rulesParser.AdditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#strings}.
	 * @param ctx the parse tree
	 */
	void enterStrings(rulesParser.StringsContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#strings}.
	 * @param ctx the parse tree
	 */
	void exitStrings(rulesParser.StringsContext ctx);
}