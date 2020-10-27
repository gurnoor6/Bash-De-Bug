// Generated from bashGrammar.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class bashGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SINGLE_STRING=1, DOUBLE_STRING=2, COMMENT=3, SPACE=4, FOR=5, DO=6, DONE=7, 
		COMMAND=8, RHS_ASSIGNMENT=9, OPEN_FOR_BRACKET=10, CLOSE_FOR_BRACKET=11, 
		VAR=12, BASH_VAR=13, VAL=14, EQUALS=15, SEMICOLON=16, INCREMENT=17, COMPARE=18, 
		BLOB=19, OTHER=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PLUS", "MINUS", "MULTIPLY", "DIVIDE", "OPERATOR", "SINGLE_STRING", "DOUBLE_STRING", 
			"COMMENT", "SPACE", "FOR", "DO", "DONE", "COMMAND", "RHS_ASSIGNMENT", 
			"OPEN_FOR_BRACKET", "CLOSE_FOR_BRACKET", "VAR", "BASH_VAR", "VAL", "EQUALS", 
			"SEMICOLON", "INCREMENT", "COMPARE", "BLOB", "OTHER"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'for'", "'do'", "'done'", null, null, 
			null, null, null, null, null, "'='", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SINGLE_STRING", "DOUBLE_STRING", "COMMENT", "SPACE", "FOR", "DO", 
			"DONE", "COMMAND", "RHS_ASSIGNMENT", "OPEN_FOR_BRACKET", "CLOSE_FOR_BRACKET", 
			"VAR", "BASH_VAR", "VAL", "EQUALS", "SEMICOLON", "INCREMENT", "COMPARE", 
			"BLOB", "OTHER"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public bashGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "bashGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\26\u00c5\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\5\6B\n"+
		"\6\3\7\3\7\6\7F\n\7\r\7\16\7G\3\7\3\7\3\b\3\b\6\bN\n\b\r\b\16\bO\3\b\3"+
		"\b\3\t\3\t\7\tV\n\t\f\t\16\tY\13\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16~\n\16"+
		"\3\17\3\17\3\17\3\17\7\17\u0084\n\17\f\17\16\17\u0087\13\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\5\20\u008f\n\20\3\21\3\21\3\21\3\21\5\21\u0095\n"+
		"\21\3\22\3\22\7\22\u0099\n\22\f\22\16\22\u009c\13\22\3\23\3\23\3\23\3"+
		"\24\6\24\u00a2\n\24\r\24\16\24\u00a3\3\25\3\25\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u00b6\n\27\3\30\3\30"+
		"\3\30\3\30\3\30\5\30\u00bd\n\30\3\31\6\31\u00c0\n\31\r\31\16\31\u00c1"+
		"\3\32\3\32\4\u0085\u00c1\2\33\3\2\5\2\7\2\t\2\13\2\r\3\17\4\21\5\23\6"+
		"\25\7\27\b\31\t\33\n\35\13\37\f!\r#\16%\17\'\20)\21+\22-\23/\24\61\25"+
		"\63\26\3\2\13\3\2))\3\2$$\4\2\f\f\17\17\5\2\13\f\17\17\"\"\5\2C\\aac|"+
		"\6\2\62;C\\aac|\5\2\62;C\\c|\4\2>>@@\t\2##&(,\60\62;B\\``c|\2\u00d7\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\3\65\3\2\2\2\5\67\3\2\2\2\79\3\2\2"+
		"\2\t;\3\2\2\2\13A\3\2\2\2\rC\3\2\2\2\17K\3\2\2\2\21S\3\2\2\2\23\\\3\2"+
		"\2\2\25^\3\2\2\2\27b\3\2\2\2\31e\3\2\2\2\33}\3\2\2\2\35\177\3\2\2\2\37"+
		"\u008e\3\2\2\2!\u0094\3\2\2\2#\u0096\3\2\2\2%\u009d\3\2\2\2\'\u00a1\3"+
		"\2\2\2)\u00a5\3\2\2\2+\u00a7\3\2\2\2-\u00b5\3\2\2\2/\u00bc\3\2\2\2\61"+
		"\u00bf\3\2\2\2\63\u00c3\3\2\2\2\65\66\7-\2\2\66\4\3\2\2\2\678\7/\2\28"+
		"\6\3\2\2\29:\7,\2\2:\b\3\2\2\2;<\7\61\2\2<\n\3\2\2\2=B\5\3\2\2>B\5\5\3"+
		"\2?B\5\7\4\2@B\5\t\5\2A=\3\2\2\2A>\3\2\2\2A?\3\2\2\2A@\3\2\2\2B\f\3\2"+
		"\2\2CE\7)\2\2DF\n\2\2\2ED\3\2\2\2FG\3\2\2\2GE\3\2\2\2GH\3\2\2\2HI\3\2"+
		"\2\2IJ\7)\2\2J\16\3\2\2\2KM\7$\2\2LN\n\3\2\2ML\3\2\2\2NO\3\2\2\2OM\3\2"+
		"\2\2OP\3\2\2\2PQ\3\2\2\2QR\7$\2\2R\20\3\2\2\2SW\7%\2\2TV\n\4\2\2UT\3\2"+
		"\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2XZ\3\2\2\2YW\3\2\2\2Z[\b\t\2\2[\22\3"+
		"\2\2\2\\]\t\5\2\2]\24\3\2\2\2^_\7h\2\2_`\7q\2\2`a\7t\2\2a\26\3\2\2\2b"+
		"c\7f\2\2cd\7q\2\2d\30\3\2\2\2ef\7f\2\2fg\7q\2\2gh\7p\2\2hi\7g\2\2i\32"+
		"\3\2\2\2jk\7g\2\2kl\7e\2\2lm\7j\2\2m~\7q\2\2no\7e\2\2op\7c\2\2p~\7v\2"+
		"\2qr\7n\2\2r~\7u\2\2st\7n\2\2t~\7n\2\2uv\7v\2\2vw\7k\2\2wx\7o\2\2x~\7"+
		"g\2\2yz\7y\2\2z{\7i\2\2{|\7g\2\2|~\7v\2\2}j\3\2\2\2}n\3\2\2\2}q\3\2\2"+
		"\2}s\3\2\2\2}u\3\2\2\2}y\3\2\2\2~\34\3\2\2\2\177\u0080\7&\2\2\u0080\u0081"+
		"\7}\2\2\u0081\u0085\3\2\2\2\u0082\u0084\13\2\2\2\u0083\u0082\3\2\2\2\u0084"+
		"\u0087\3\2\2\2\u0085\u0086\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u0088\3\2"+
		"\2\2\u0087\u0085\3\2\2\2\u0088\u0089\7\177\2\2\u0089\36\3\2\2\2\u008a"+
		"\u008b\7*\2\2\u008b\u008f\7*\2\2\u008c\u008d\7]\2\2\u008d\u008f\7]\2\2"+
		"\u008e\u008a\3\2\2\2\u008e\u008c\3\2\2\2\u008f \3\2\2\2\u0090\u0091\7"+
		"+\2\2\u0091\u0095\7+\2\2\u0092\u0093\7_\2\2\u0093\u0095\7_\2\2\u0094\u0090"+
		"\3\2\2\2\u0094\u0092\3\2\2\2\u0095\"\3\2\2\2\u0096\u009a\t\6\2\2\u0097"+
		"\u0099\t\7\2\2\u0098\u0097\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3\2"+
		"\2\2\u009a\u009b\3\2\2\2\u009b$\3\2\2\2\u009c\u009a\3\2\2\2\u009d\u009e"+
		"\7&\2\2\u009e\u009f\5#\22\2\u009f&\3\2\2\2\u00a0\u00a2\t\b\2\2\u00a1\u00a0"+
		"\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4"+
		"(\3\2\2\2\u00a5\u00a6\7?\2\2\u00a6*\3\2\2\2\u00a7\u00a8\7=\2\2\u00a8,"+
		"\3\2\2\2\u00a9\u00aa\7-\2\2\u00aa\u00b6\7-\2\2\u00ab\u00ac\7/\2\2\u00ac"+
		"\u00b6\7/\2\2\u00ad\u00ae\7-\2\2\u00ae\u00b6\7?\2\2\u00af\u00b0\7/\2\2"+
		"\u00b0\u00b6\7?\2\2\u00b1\u00b2\7\61\2\2\u00b2\u00b6\7?\2\2\u00b3\u00b4"+
		"\7,\2\2\u00b4\u00b6\7?\2\2\u00b5\u00a9\3\2\2\2\u00b5\u00ab\3\2\2\2\u00b5"+
		"\u00ad\3\2\2\2\u00b5\u00af\3\2\2\2\u00b5\u00b1\3\2\2\2\u00b5\u00b3\3\2"+
		"\2\2\u00b6.\3\2\2\2\u00b7\u00b8\7>\2\2\u00b8\u00bd\7?\2\2\u00b9\u00ba"+
		"\7@\2\2\u00ba\u00bd\7?\2\2\u00bb\u00bd\t\t\2\2\u00bc\u00b7\3\2\2\2\u00bc"+
		"\u00b9\3\2\2\2\u00bc\u00bb\3\2\2\2\u00bd\60\3\2\2\2\u00be\u00c0\t\n\2"+
		"\2\u00bf\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c1\u00bf"+
		"\3\2\2\2\u00c2\62\3\2\2\2\u00c3\u00c4\13\2\2\2\u00c4\64\3\2\2\2\20\2A"+
		"GOW}\u0085\u008e\u0094\u009a\u00a3\u00b5\u00bc\u00c1\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}