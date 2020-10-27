// Generated from d:\IITB CSE\sem3\CS 251\main_project\Bash-De-Bug\bashGrammar.g4 by ANTLR 4.8
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
		SINGLE_STRING=1, DOUBLE_STRING=2, COMMENT=3, SPACE=4, IF=5, THEN=6, ELIF=7, 
		ELSE=8, FI=9, FOR=10, DO=11, DONE=12, COMMAND=13, RHS_ASSIGNMENT=14, OPEN_BRACKETS=15, 
		CLOSE_BRACKETS=16, VAR=17, BASH_VAR=18, VAL=19, ASSIGN=20, SEMICOLON=21, 
		LOGICAL_OP=22, INCREMENT=23, COMPARE=24, BLOB=25, OTHER=26;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PLUS", "MINUS", "MULTIPLY", "DIVIDE", "OPERATOR", "SINGLE_STRING", "DOUBLE_STRING", 
			"COMMENT", "SPACE", "IF", "THEN", "ELIF", "ELSE", "FI", "FOR", "DO", 
			"DONE", "COMMAND", "RHS_ASSIGNMENT", "OPEN_BRACKETS", "CLOSE_BRACKETS", 
			"VAR", "BASH_VAR", "VAL", "ASSIGN", "SEMICOLON", "LOGICAL_OP", "INCREMENT", 
			"COMPARE", "BLOB", "OTHER"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'if'", "'then'", "'elif'", "'else'", "'fi'", 
			"'for'", "'do'", "'done'", null, null, null, null, null, null, null, 
			"'='", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SINGLE_STRING", "DOUBLE_STRING", "COMMENT", "SPACE", "IF", "THEN", 
			"ELIF", "ELSE", "FI", "FOR", "DO", "DONE", "COMMAND", "RHS_ASSIGNMENT", 
			"OPEN_BRACKETS", "CLOSE_BRACKETS", "VAR", "BASH_VAR", "VAL", "ASSIGN", 
			"SEMICOLON", "LOGICAL_OP", "INCREMENT", "COMPARE", "BLOB", "OTHER"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\34\u00fb\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\5\6N\n\6\3\7\3\7\6\7"+
		"R\n\7\r\7\16\7S\3\7\3\7\3\b\3\b\6\bZ\n\b\r\b\16\b[\3\b\3\b\3\t\3\t\7\t"+
		"b\n\t\f\t\16\te\13\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3"+
		"\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\5\23\u009f\n\23\3\24\3\24\3\24\3\24\7\24\u00a5\n\24\f\24\16\24"+
		"\u00a8\13\24\3\24\3\24\3\24\3\24\3\24\6\24\u00af\n\24\r\24\16\24\u00b0"+
		"\3\24\5\24\u00b4\n\24\3\25\3\25\3\25\3\25\5\25\u00ba\n\25\3\26\3\26\3"+
		"\26\3\26\5\26\u00c0\n\26\3\27\3\27\7\27\u00c4\n\27\f\27\16\27\u00c7\13"+
		"\27\3\30\3\30\3\30\3\31\5\31\u00cd\n\31\3\31\6\31\u00d0\n\31\r\31\16\31"+
		"\u00d1\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\34\5\34\u00dc\n\34\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u00ea\n\35"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u00f3\n\36\3\37\6\37\u00f6\n"+
		"\37\r\37\16\37\u00f7\3 \3 \4\u00a6\u00f7\2!\3\2\5\2\7\2\t\2\13\2\r\3\17"+
		"\4\21\5\23\6\25\7\27\b\31\t\33\n\35\13\37\f!\r#\16%\17\'\20)\21+\22-\23"+
		"/\24\61\25\63\26\65\27\67\309\31;\32=\33?\34\3\2\13\3\2))\3\2$$\4\2\f"+
		"\f\17\17\5\2\13\f\17\17\"\"\t\2##&(,\60\62;B\\``c|\5\2C\\aac|\6\2\62;"+
		"C\\aac|\5\2\62;C\\c|\4\2>>@@\2\u0112\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2"+
		"\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2"+
		"\2\3A\3\2\2\2\5C\3\2\2\2\7E\3\2\2\2\tG\3\2\2\2\13M\3\2\2\2\rO\3\2\2\2"+
		"\17W\3\2\2\2\21_\3\2\2\2\23h\3\2\2\2\25j\3\2\2\2\27m\3\2\2\2\31r\3\2\2"+
		"\2\33w\3\2\2\2\35|\3\2\2\2\37\177\3\2\2\2!\u0083\3\2\2\2#\u0086\3\2\2"+
		"\2%\u009e\3\2\2\2\'\u00b3\3\2\2\2)\u00b9\3\2\2\2+\u00bf\3\2\2\2-\u00c1"+
		"\3\2\2\2/\u00c8\3\2\2\2\61\u00cc\3\2\2\2\63\u00d3\3\2\2\2\65\u00d5\3\2"+
		"\2\2\67\u00db\3\2\2\29\u00e9\3\2\2\2;\u00f2\3\2\2\2=\u00f5\3\2\2\2?\u00f9"+
		"\3\2\2\2AB\7-\2\2B\4\3\2\2\2CD\7/\2\2D\6\3\2\2\2EF\7,\2\2F\b\3\2\2\2G"+
		"H\7\61\2\2H\n\3\2\2\2IN\5\3\2\2JN\5\5\3\2KN\5\7\4\2LN\5\t\5\2MI\3\2\2"+
		"\2MJ\3\2\2\2MK\3\2\2\2ML\3\2\2\2N\f\3\2\2\2OQ\7)\2\2PR\n\2\2\2QP\3\2\2"+
		"\2RS\3\2\2\2SQ\3\2\2\2ST\3\2\2\2TU\3\2\2\2UV\7)\2\2V\16\3\2\2\2WY\7$\2"+
		"\2XZ\n\3\2\2YX\3\2\2\2Z[\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\]\3\2\2\2]^\7$"+
		"\2\2^\20\3\2\2\2_c\7%\2\2`b\n\4\2\2a`\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3"+
		"\2\2\2df\3\2\2\2ec\3\2\2\2fg\b\t\2\2g\22\3\2\2\2hi\t\5\2\2i\24\3\2\2\2"+
		"jk\7k\2\2kl\7h\2\2l\26\3\2\2\2mn\7v\2\2no\7j\2\2op\7g\2\2pq\7p\2\2q\30"+
		"\3\2\2\2rs\7g\2\2st\7n\2\2tu\7k\2\2uv\7h\2\2v\32\3\2\2\2wx\7g\2\2xy\7"+
		"n\2\2yz\7u\2\2z{\7g\2\2{\34\3\2\2\2|}\7h\2\2}~\7k\2\2~\36\3\2\2\2\177"+
		"\u0080\7h\2\2\u0080\u0081\7q\2\2\u0081\u0082\7t\2\2\u0082 \3\2\2\2\u0083"+
		"\u0084\7f\2\2\u0084\u0085\7q\2\2\u0085\"\3\2\2\2\u0086\u0087\7f\2\2\u0087"+
		"\u0088\7q\2\2\u0088\u0089\7p\2\2\u0089\u008a\7g\2\2\u008a$\3\2\2\2\u008b"+
		"\u008c\7g\2\2\u008c\u008d\7e\2\2\u008d\u008e\7j\2\2\u008e\u009f\7q\2\2"+
		"\u008f\u0090\7e\2\2\u0090\u0091\7c\2\2\u0091\u009f\7v\2\2\u0092\u0093"+
		"\7n\2\2\u0093\u009f\7u\2\2\u0094\u0095\7n\2\2\u0095\u009f\7n\2\2\u0096"+
		"\u0097\7v\2\2\u0097\u0098\7k\2\2\u0098\u0099\7o\2\2\u0099\u009f\7g\2\2"+
		"\u009a\u009b\7y\2\2\u009b\u009c\7i\2\2\u009c\u009d\7g\2\2\u009d\u009f"+
		"\7v\2\2\u009e\u008b\3\2\2\2\u009e\u008f\3\2\2\2\u009e\u0092\3\2\2\2\u009e"+
		"\u0094\3\2\2\2\u009e\u0096\3\2\2\2\u009e\u009a\3\2\2\2\u009f&\3\2\2\2"+
		"\u00a0\u00a1\7&\2\2\u00a1\u00a2\7}\2\2\u00a2\u00a6\3\2\2\2\u00a3\u00a5"+
		"\13\2\2\2\u00a4\u00a3\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a7\3\2\2\2"+
		"\u00a6\u00a4\3\2\2\2\u00a7\u00a9\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00b4"+
		"\7\177\2\2\u00aa\u00ab\7&\2\2\u00ab\u00ac\7*\2\2\u00ac\u00ae\3\2\2\2\u00ad"+
		"\u00af\t\6\2\2\u00ae\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00ae\3\2"+
		"\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b4\7+\2\2\u00b3"+
		"\u00a0\3\2\2\2\u00b3\u00aa\3\2\2\2\u00b4(\3\2\2\2\u00b5\u00b6\7*\2\2\u00b6"+
		"\u00ba\7*\2\2\u00b7\u00b8\7]\2\2\u00b8\u00ba\7]\2\2\u00b9\u00b5\3\2\2"+
		"\2\u00b9\u00b7\3\2\2\2\u00ba*\3\2\2\2\u00bb\u00bc\7+\2\2\u00bc\u00c0\7"+
		"+\2\2\u00bd\u00be\7_\2\2\u00be\u00c0\7_\2\2\u00bf\u00bb\3\2\2\2\u00bf"+
		"\u00bd\3\2\2\2\u00c0,\3\2\2\2\u00c1\u00c5\t\7\2\2\u00c2\u00c4\t\b\2\2"+
		"\u00c3\u00c2\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6"+
		"\3\2\2\2\u00c6.\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00c9\7&\2\2\u00c9\u00ca"+
		"\5-\27\2\u00ca\60\3\2\2\2\u00cb\u00cd\7/\2\2\u00cc\u00cb\3\2\2\2\u00cc"+
		"\u00cd\3\2\2\2\u00cd\u00cf\3\2\2\2\u00ce\u00d0\t\t\2\2\u00cf\u00ce\3\2"+
		"\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2"+
		"\62\3\2\2\2\u00d3\u00d4\7?\2\2\u00d4\64\3\2\2\2\u00d5\u00d6\7=\2\2\u00d6"+
		"\66\3\2\2\2\u00d7\u00d8\7~\2\2\u00d8\u00dc\7~\2\2\u00d9\u00da\7(\2\2\u00da"+
		"\u00dc\7(\2\2\u00db\u00d7\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc8\3\2\2\2\u00dd"+
		"\u00de\7-\2\2\u00de\u00ea\7-\2\2\u00df\u00e0\7/\2\2\u00e0\u00ea\7/\2\2"+
		"\u00e1\u00e2\7-\2\2\u00e2\u00ea\7?\2\2\u00e3\u00e4\7/\2\2\u00e4\u00ea"+
		"\7?\2\2\u00e5\u00e6\7\61\2\2\u00e6\u00ea\7?\2\2\u00e7\u00e8\7,\2\2\u00e8"+
		"\u00ea\7?\2\2\u00e9\u00dd\3\2\2\2\u00e9\u00df\3\2\2\2\u00e9\u00e1\3\2"+
		"\2\2\u00e9\u00e3\3\2\2\2\u00e9\u00e5\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea"+
		":\3\2\2\2\u00eb\u00ec\7>\2\2\u00ec\u00f3\7?\2\2\u00ed\u00ee\7@\2\2\u00ee"+
		"\u00f3\7?\2\2\u00ef\u00f3\t\n\2\2\u00f0\u00f1\7?\2\2\u00f1\u00f3\7?\2"+
		"\2\u00f2\u00eb\3\2\2\2\u00f2\u00ed\3\2\2\2\u00f2\u00ef\3\2\2\2\u00f2\u00f0"+
		"\3\2\2\2\u00f3<\3\2\2\2\u00f4\u00f6\t\6\2\2\u00f5\u00f4\3\2\2\2\u00f6"+
		"\u00f7\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8>\3\2\2\2"+
		"\u00f9\u00fa\13\2\2\2\u00fa@\3\2\2\2\24\2MS[c\u009e\u00a6\u00b0\u00b3"+
		"\u00b9\u00bf\u00c5\u00cc\u00d1\u00db\u00e9\u00f2\u00f7\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}