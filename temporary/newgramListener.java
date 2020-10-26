// Generated from newgram.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link newgramParser}.
 */
public interface newgramListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link newgramParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(newgramParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link newgramParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(newgramParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link newgramParser#iff}.
	 * @param ctx the parse tree
	 */
	void enterIff(newgramParser.IffContext ctx);
	/**
	 * Exit a parse tree produced by {@link newgramParser#iff}.
	 * @param ctx the parse tree
	 */
	void exitIff(newgramParser.IffContext ctx);
}