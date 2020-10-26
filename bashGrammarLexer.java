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
		COMMAND=8, OPEN_FOR_BRACKET=9, CLOSE_FOR_BRACKET=10, VAR=11, VAL=12, EQUALS=13, 
		SEMICOLON=14, INCREMENT=15, COMPARE=16, OTHER=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"SINGLE_STRING", "DOUBLE_STRING", "COMMENT", "SPACE", "FOR", "DO", "DONE", 
			"COMMAND", "OPEN_FOR_BRACKET", "CLOSE_FOR_BRACKET", "VAR", "VAL", "EQUALS", 
			"SEMICOLON", "INCREMENT", "COMPARE", "OTHER"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'for'", "'do'", "'done'", null, null, 
			null, null, null, "'='", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SINGLE_STRING", "DOUBLE_STRING", "COMMENT", "SPACE", "FOR", "DO", 
			"DONE", "COMMAND", "OPEN_FOR_BRACKET", "CLOSE_FOR_BRACKET", "VAR", "VAL", 
			"EQUALS", "SEMICOLON", "INCREMENT", "COMPARE", "OTHER"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\23\u008c\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\3\2\3\2\6\2(\n\2\r\2\16\2)\3\2\3\2\3\3\3\3\6\3\60\n\3\r\3\16\3\61"+
		"\3\3\3\3\3\4\3\4\7\48\n\4\f\4\16\4;\13\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t`\n\t\3\n\3\n\3\n\3\n\5\n"+
		"f\n\n\3\13\3\13\3\13\3\13\5\13l\n\13\3\f\3\f\7\fp\n\f\f\f\16\fs\13\f\3"+
		"\r\6\rv\n\r\r\r\16\rw\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\5\20\u0082"+
		"\n\20\3\21\3\21\3\21\3\21\3\21\5\21\u0089\n\21\3\22\3\22\2\2\23\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23\3\2\n\3\2))\3\2$$\4\2\f\f\17\17\5\2\13\f\17\17\"\"\5\2C\\aac"+
		"|\6\2\62;C\\aac|\5\2\62;C\\c|\4\2>>@@\2\u009a\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\3%\3\2\2\2\5-\3\2\2"+
		"\2\7\65\3\2\2\2\t>\3\2\2\2\13@\3\2\2\2\rD\3\2\2\2\17G\3\2\2\2\21_\3\2"+
		"\2\2\23e\3\2\2\2\25k\3\2\2\2\27m\3\2\2\2\31u\3\2\2\2\33y\3\2\2\2\35{\3"+
		"\2\2\2\37\u0081\3\2\2\2!\u0088\3\2\2\2#\u008a\3\2\2\2%\'\7)\2\2&(\n\2"+
		"\2\2\'&\3\2\2\2()\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*+\3\2\2\2+,\7)\2\2,\4\3"+
		"\2\2\2-/\7$\2\2.\60\n\3\2\2/.\3\2\2\2\60\61\3\2\2\2\61/\3\2\2\2\61\62"+
		"\3\2\2\2\62\63\3\2\2\2\63\64\7$\2\2\64\6\3\2\2\2\659\7%\2\2\668\n\4\2"+
		"\2\67\66\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:<\3\2\2\2;9\3\2\2\2<"+
		"=\b\4\2\2=\b\3\2\2\2>?\t\5\2\2?\n\3\2\2\2@A\7h\2\2AB\7q\2\2BC\7t\2\2C"+
		"\f\3\2\2\2DE\7f\2\2EF\7q\2\2F\16\3\2\2\2GH\7f\2\2HI\7q\2\2IJ\7p\2\2JK"+
		"\7g\2\2K\20\3\2\2\2LM\7g\2\2MN\7e\2\2NO\7j\2\2O`\7q\2\2PQ\7e\2\2QR\7c"+
		"\2\2R`\7v\2\2ST\7n\2\2T`\7u\2\2UV\7n\2\2V`\7n\2\2WX\7v\2\2XY\7k\2\2YZ"+
		"\7o\2\2Z`\7g\2\2[\\\7y\2\2\\]\7i\2\2]^\7g\2\2^`\7v\2\2_L\3\2\2\2_P\3\2"+
		"\2\2_S\3\2\2\2_U\3\2\2\2_W\3\2\2\2_[\3\2\2\2`\22\3\2\2\2ab\7*\2\2bf\7"+
		"*\2\2cd\7]\2\2df\7]\2\2ea\3\2\2\2ec\3\2\2\2f\24\3\2\2\2gh\7+\2\2hl\7+"+
		"\2\2ij\7_\2\2jl\7_\2\2kg\3\2\2\2ki\3\2\2\2l\26\3\2\2\2mq\t\6\2\2np\t\7"+
		"\2\2on\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2r\30\3\2\2\2sq\3\2\2\2tv\t"+
		"\b\2\2ut\3\2\2\2vw\3\2\2\2wu\3\2\2\2wx\3\2\2\2x\32\3\2\2\2yz\7?\2\2z\34"+
		"\3\2\2\2{|\7=\2\2|\36\3\2\2\2}~\7-\2\2~\u0082\7-\2\2\177\u0080\7/\2\2"+
		"\u0080\u0082\7/\2\2\u0081}\3\2\2\2\u0081\177\3\2\2\2\u0082 \3\2\2\2\u0083"+
		"\u0084\7>\2\2\u0084\u0089\7?\2\2\u0085\u0086\7@\2\2\u0086\u0089\7?\2\2"+
		"\u0087\u0089\t\t\2\2\u0088\u0083\3\2\2\2\u0088\u0085\3\2\2\2\u0088\u0087"+
		"\3\2\2\2\u0089\"\3\2\2\2\u008a\u008b\13\2\2\2\u008b$\3\2\2\2\r\2)\619"+
		"_ekqw\u0081\u0088\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}