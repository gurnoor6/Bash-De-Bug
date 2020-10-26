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
		OPEN_FOR_BRACKET=8, CLOSE_FOR_BRACKET=9, VAR=10, VAL=11, EQUALS=12, SEMICOLON=13, 
		INCREMENT=14, COMPARE=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"SINGLE_STRING", "DOUBLE_STRING", "COMMENT", "SPACE", "FOR", "DO", "DONE", 
			"OPEN_FOR_BRACKET", "CLOSE_FOR_BRACKET", "VAR", "VAL", "EQUALS", "SEMICOLON", 
			"INCREMENT", "COMPARE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'for'", "'do'", "'done'", null, null, 
			null, null, "'='", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SINGLE_STRING", "DOUBLE_STRING", "COMMENT", "SPACE", "FOR", "DO", 
			"DONE", "OPEN_FOR_BRACKET", "CLOSE_FOR_BRACKET", "VAR", "VAL", "EQUALS", 
			"SEMICOLON", "INCREMENT", "COMPARE"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\21q\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\6\2$\n\2\r\2"+
		"\16\2%\3\2\3\2\3\3\3\3\6\3,\n\3\r\3\16\3-\3\3\3\3\3\4\3\4\7\4\64\n\4\f"+
		"\4\16\4\67\13\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\t\3\t\3\t\3\t\5\tM\n\t\3\n\3\n\3\n\3\n\5\nS\n\n\3\13\3\13"+
		"\7\13W\n\13\f\13\16\13Z\13\13\3\f\6\f]\n\f\r\f\16\f^\3\r\3\r\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\5\17i\n\17\3\20\3\20\3\20\3\20\3\20\5\20p\n\20\2"+
		"\2\21\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21\3\2\n\3\2))\3\2$$\4\2\f\f\17\17\5\2\13\f\17\17\"\"\5\2C\\aa"+
		"c|\6\2\62;C\\aac|\5\2\62;C\\c|\4\2>>@@\2z\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\3!\3\2\2\2\5)\3\2\2\2\7\61\3\2\2\2\t:\3\2\2\2"+
		"\13<\3\2\2\2\r@\3\2\2\2\17C\3\2\2\2\21L\3\2\2\2\23R\3\2\2\2\25T\3\2\2"+
		"\2\27\\\3\2\2\2\31`\3\2\2\2\33b\3\2\2\2\35h\3\2\2\2\37o\3\2\2\2!#\7)\2"+
		"\2\"$\n\2\2\2#\"\3\2\2\2$%\3\2\2\2%#\3\2\2\2%&\3\2\2\2&\'\3\2\2\2\'(\7"+
		")\2\2(\4\3\2\2\2)+\7$\2\2*,\n\3\2\2+*\3\2\2\2,-\3\2\2\2-+\3\2\2\2-.\3"+
		"\2\2\2./\3\2\2\2/\60\7$\2\2\60\6\3\2\2\2\61\65\7%\2\2\62\64\n\4\2\2\63"+
		"\62\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\668\3\2\2\2\67\65"+
		"\3\2\2\289\b\4\2\29\b\3\2\2\2:;\t\5\2\2;\n\3\2\2\2<=\7h\2\2=>\7q\2\2>"+
		"?\7t\2\2?\f\3\2\2\2@A\7f\2\2AB\7q\2\2B\16\3\2\2\2CD\7f\2\2DE\7q\2\2EF"+
		"\7p\2\2FG\7g\2\2G\20\3\2\2\2HI\7*\2\2IM\7*\2\2JK\7]\2\2KM\7]\2\2LH\3\2"+
		"\2\2LJ\3\2\2\2M\22\3\2\2\2NO\7+\2\2OS\7+\2\2PQ\7_\2\2QS\7_\2\2RN\3\2\2"+
		"\2RP\3\2\2\2S\24\3\2\2\2TX\t\6\2\2UW\t\7\2\2VU\3\2\2\2WZ\3\2\2\2XV\3\2"+
		"\2\2XY\3\2\2\2Y\26\3\2\2\2ZX\3\2\2\2[]\t\b\2\2\\[\3\2\2\2]^\3\2\2\2^\\"+
		"\3\2\2\2^_\3\2\2\2_\30\3\2\2\2`a\7?\2\2a\32\3\2\2\2bc\7=\2\2c\34\3\2\2"+
		"\2de\7-\2\2ei\7-\2\2fg\7/\2\2gi\7/\2\2hd\3\2\2\2hf\3\2\2\2i\36\3\2\2\2"+
		"jk\7>\2\2kp\7?\2\2lm\7@\2\2mp\7?\2\2np\t\t\2\2oj\3\2\2\2ol\3\2\2\2on\3"+
		"\2\2\2p \3\2\2\2\f\2%-\65LRX^ho\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}