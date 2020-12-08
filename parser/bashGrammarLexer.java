// Generated from bashGrammar.g4 by ANTLR 4.9
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
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, OPEN_PAR=2, CLOSE_PAR=3, OPEN_CUR=4, CLOSE_CUR=5, OPEN_BOX=6, 
		CLOSE_BOX=7, PIPE=8, RHS_ASSIGNMENT=9, SINGLE_STRING=10, DOUBLE_STRING=11, 
		COMMENT=12, SPACE=13, FUNCTION=14, IF=15, THEN=16, ELIF=17, ELSE=18, FI=19, 
		FOR=20, WHILE=21, DO=22, SED=23, BREAK=24, CONTINUE=25, DONE=26, COMMAND=27, 
		VAR=28, WEBSITE=29, FILENAME=30, BASH_VAR=31, INCREMENT=32, NEGNEG=33, 
		NEG=34, PLUSPLUS=35, NEGEQUAL=36, PLUSEQUAL=37, MULEQUAL=38, DIVEQUAL=39, 
		COMPARE=40, FULL_TAG=41, SINGLE_TAG=42, VAL=43, ASSIGN=44, SEMICOLON=45, 
		LOGICAL_OP=46, BLOB=47, OTHER=48;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "PLUS", "MINUS", "MULTIPLY", "DIVIDE", "OPEN_PAR", "CLOSE_PAR", 
			"OPEN_CUR", "CLOSE_CUR", "OPEN_BOX", "CLOSE_BOX", "PIPE", "RHS_ASSIGNMENT", 
			"SINGLE_STRING", "DOUBLE_STRING", "COMMENT", "SPACE", "FUNCTION", "IF", 
			"THEN", "ELIF", "ELSE", "FI", "FOR", "WHILE", "DO", "SED", "BREAK", "CONTINUE", 
			"DONE", "COMMAND", "VAR", "WEBSITE", "FILENAME", "BASH_VAR", "INCREMENT", 
			"NEGNEG", "NEG", "PLUSPLUS", "NEGEQUAL", "PLUSEQUAL", "MULEQUAL", "DIVEQUAL", 
			"COMPARE", "FULL_TAG", "SINGLE_TAG", "VAL", "ASSIGN", "SEMICOLON", "LOGICAL_OP", 
			"BLOB", "OTHER"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'('", "')'", "'{'", "'}'", "'['", "']'", "'|'", null, null, 
			null, null, null, "'function'", "'if'", "'then'", "'elif'", "'else'", 
			"'fi'", "'for'", "'while'", "'do'", "'sed'", "'break'", "'continue'", 
			"'done'", null, null, null, null, null, null, "'--'", "'-'", "'++'", 
			"'-='", "'+='", "'*='", "'/='", null, null, null, null, "'='", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "OPEN_PAR", "CLOSE_PAR", "OPEN_CUR", "CLOSE_CUR", "OPEN_BOX", 
			"CLOSE_BOX", "PIPE", "RHS_ASSIGNMENT", "SINGLE_STRING", "DOUBLE_STRING", 
			"COMMENT", "SPACE", "FUNCTION", "IF", "THEN", "ELIF", "ELSE", "FI", "FOR", 
			"WHILE", "DO", "SED", "BREAK", "CONTINUE", "DONE", "COMMAND", "VAR", 
			"WEBSITE", "FILENAME", "BASH_VAR", "INCREMENT", "NEGNEG", "NEG", "PLUSPLUS", 
			"NEGEQUAL", "PLUSEQUAL", "MULEQUAL", "DIVEQUAL", "COMPARE", "FULL_TAG", 
			"SINGLE_TAG", "VAL", "ASSIGN", "SEMICOLON", "LOGICAL_OP", "BLOB", "OTHER"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\62\u01ae\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3"+
		"\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\7\16"+
		"\u0088\n\16\f\16\16\16\u008b\13\16\3\16\3\16\3\16\3\16\3\16\6\16\u0092"+
		"\n\16\r\16\16\16\u0093\3\16\5\16\u0097\n\16\3\17\3\17\6\17\u009b\n\17"+
		"\r\17\16\17\u009c\3\17\3\17\3\20\3\20\6\20\u00a3\n\20\r\20\16\20\u00a4"+
		"\3\20\3\20\3\21\3\21\7\21\u00ab\n\21\f\21\16\21\u00ae\13\21\3\21\3\21"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3"+
		" \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u010e"+
		"\n \3!\3!\5!\u0112\n!\3!\6!\u0115\n!\r!\16!\u0116\7!\u0119\n!\f!\16!\u011c"+
		"\13!\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u0124\n\"\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\5\"\u012d\n\"\3\"\3\"\3\"\5\"\u0132\n\"\3\"\3\"\3\"\3\"\3\"\3\"\6\"\u013a"+
		"\n\"\r\"\16\"\u013b\3\"\3\"\6\"\u0140\n\"\r\"\16\"\u0141\3\"\3\"\6\"\u0146"+
		"\n\"\r\"\16\"\u0147\3\"\5\"\u014b\n\"\7\"\u014d\n\"\f\"\16\"\u0150\13"+
		"\"\3#\3#\3#\3#\3$\3$\3$\3%\3%\3%\3%\3%\3%\5%\u015f\n%\3&\3&\3&\3\'\3\'"+
		"\3(\3(\3(\3)\3)\3)\3*\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\5-"+
		"\u017c\n-\3.\3.\6.\u0180\n.\r.\16.\u0181\3.\7.\u0185\n.\f.\16.\u0188\13"+
		".\3/\3/\6/\u018c\n/\r/\16/\u018d\3/\7/\u0191\n/\f/\16/\u0194\13/\3\60"+
		"\5\60\u0197\n\60\3\60\6\60\u019a\n\60\r\60\16\60\u019b\3\61\3\61\3\62"+
		"\3\62\3\63\3\63\3\63\3\63\5\63\u01a6\n\63\3\64\6\64\u01a9\n\64\r\64\16"+
		"\64\u01aa\3\65\3\65\4\u0089\u01aa\2\66\3\3\5\2\7\2\t\2\13\2\r\4\17\5\21"+
		"\6\23\7\25\b\27\t\31\n\33\13\35\f\37\r!\16#\17%\20\'\21)\22+\23-\24/\25"+
		"\61\26\63\27\65\30\67\319\32;\33=\34?\35A\36C\37E G!I\"K#M$O%Q&S\'U(W"+
		")Y*[+],_-a.c/e\60g\61i\62\3\2\20\b\2##&(,<B\\``c|\3\2))\3\2$$\4\2\f\f"+
		"\17\17\5\2\13\f\17\17\"\"\4\2C\\c|\6\2\62;C\\aac|\4\2\62;c|\3\2c|\6\2"+
		"%%\62;C\\c|\4\2>>@@\5\2\62;C\\c|\6\2\62;??C\\c|\t\2##%(,\60\62;B\\``c"+
		"|\2\u01d2\2\3\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2"+
		"\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2"+
		"C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3"+
		"\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2"+
		"\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2"+
		"i\3\2\2\2\3k\3\2\2\2\5m\3\2\2\2\7o\3\2\2\2\tq\3\2\2\2\13s\3\2\2\2\ru\3"+
		"\2\2\2\17w\3\2\2\2\21y\3\2\2\2\23{\3\2\2\2\25}\3\2\2\2\27\177\3\2\2\2"+
		"\31\u0081\3\2\2\2\33\u0096\3\2\2\2\35\u0098\3\2\2\2\37\u00a0\3\2\2\2!"+
		"\u00a8\3\2\2\2#\u00b1\3\2\2\2%\u00b3\3\2\2\2\'\u00bc\3\2\2\2)\u00bf\3"+
		"\2\2\2+\u00c4\3\2\2\2-\u00c9\3\2\2\2/\u00ce\3\2\2\2\61\u00d1\3\2\2\2\63"+
		"\u00d5\3\2\2\2\65\u00db\3\2\2\2\67\u00de\3\2\2\29\u00e2\3\2\2\2;\u00e8"+
		"\3\2\2\2=\u00f1\3\2\2\2?\u010d\3\2\2\2A\u010f\3\2\2\2C\u0131\3\2\2\2E"+
		"\u0151\3\2\2\2G\u0155\3\2\2\2I\u015e\3\2\2\2K\u0160\3\2\2\2M\u0163\3\2"+
		"\2\2O\u0165\3\2\2\2Q\u0168\3\2\2\2S\u016b\3\2\2\2U\u016e\3\2\2\2W\u0171"+
		"\3\2\2\2Y\u017b\3\2\2\2[\u017d\3\2\2\2]\u0189\3\2\2\2_\u0196\3\2\2\2a"+
		"\u019d\3\2\2\2c\u019f\3\2\2\2e\u01a5\3\2\2\2g\u01a8\3\2\2\2i\u01ac\3\2"+
		"\2\2kl\7.\2\2l\4\3\2\2\2mn\7-\2\2n\6\3\2\2\2op\7/\2\2p\b\3\2\2\2qr\7,"+
		"\2\2r\n\3\2\2\2st\7\61\2\2t\f\3\2\2\2uv\7*\2\2v\16\3\2\2\2wx\7+\2\2x\20"+
		"\3\2\2\2yz\7}\2\2z\22\3\2\2\2{|\7\177\2\2|\24\3\2\2\2}~\7]\2\2~\26\3\2"+
		"\2\2\177\u0080\7_\2\2\u0080\30\3\2\2\2\u0081\u0082\7~\2\2\u0082\32\3\2"+
		"\2\2\u0083\u0084\7&\2\2\u0084\u0085\7}\2\2\u0085\u0089\3\2\2\2\u0086\u0088"+
		"\13\2\2\2\u0087\u0086\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u008a\3\2\2\2"+
		"\u0089\u0087\3\2\2\2\u008a\u008c\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u0097"+
		"\7\177\2\2\u008d\u008e\7&\2\2\u008e\u008f\7*\2\2\u008f\u0091\3\2\2\2\u0090"+
		"\u0092\t\2\2\2\u0091\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0091\3\2"+
		"\2\2\u0093\u0094\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0097\7+\2\2\u0096"+
		"\u0083\3\2\2\2\u0096\u008d\3\2\2\2\u0097\34\3\2\2\2\u0098\u009a\7)\2\2"+
		"\u0099\u009b\n\3\2\2\u009a\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009a"+
		"\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\7)\2\2\u009f"+
		"\36\3\2\2\2\u00a0\u00a2\7$\2\2\u00a1\u00a3\n\4\2\2\u00a2\u00a1\3\2\2\2"+
		"\u00a3\u00a4\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6"+
		"\3\2\2\2\u00a6\u00a7\7$\2\2\u00a7 \3\2\2\2\u00a8\u00ac\7%\2\2\u00a9\u00ab"+
		"\n\5\2\2\u00aa\u00a9\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac"+
		"\u00ad\3\2\2\2\u00ad\u00af\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b0\b\21"+
		"\2\2\u00b0\"\3\2\2\2\u00b1\u00b2\t\6\2\2\u00b2$\3\2\2\2\u00b3\u00b4\7"+
		"h\2\2\u00b4\u00b5\7w\2\2\u00b5\u00b6\7p\2\2\u00b6\u00b7\7e\2\2\u00b7\u00b8"+
		"\7v\2\2\u00b8\u00b9\7k\2\2\u00b9\u00ba\7q\2\2\u00ba\u00bb\7p\2\2\u00bb"+
		"&\3\2\2\2\u00bc\u00bd\7k\2\2\u00bd\u00be\7h\2\2\u00be(\3\2\2\2\u00bf\u00c0"+
		"\7v\2\2\u00c0\u00c1\7j\2\2\u00c1\u00c2\7g\2\2\u00c2\u00c3\7p\2\2\u00c3"+
		"*\3\2\2\2\u00c4\u00c5\7g\2\2\u00c5\u00c6\7n\2\2\u00c6\u00c7\7k\2\2\u00c7"+
		"\u00c8\7h\2\2\u00c8,\3\2\2\2\u00c9\u00ca\7g\2\2\u00ca\u00cb\7n\2\2\u00cb"+
		"\u00cc\7u\2\2\u00cc\u00cd\7g\2\2\u00cd.\3\2\2\2\u00ce\u00cf\7h\2\2\u00cf"+
		"\u00d0\7k\2\2\u00d0\60\3\2\2\2\u00d1\u00d2\7h\2\2\u00d2\u00d3\7q\2\2\u00d3"+
		"\u00d4\7t\2\2\u00d4\62\3\2\2\2\u00d5\u00d6\7y\2\2\u00d6\u00d7\7j\2\2\u00d7"+
		"\u00d8\7k\2\2\u00d8\u00d9\7n\2\2\u00d9\u00da\7g\2\2\u00da\64\3\2\2\2\u00db"+
		"\u00dc\7f\2\2\u00dc\u00dd\7q\2\2\u00dd\66\3\2\2\2\u00de\u00df\7u\2\2\u00df"+
		"\u00e0\7g\2\2\u00e0\u00e1\7f\2\2\u00e18\3\2\2\2\u00e2\u00e3\7d\2\2\u00e3"+
		"\u00e4\7t\2\2\u00e4\u00e5\7g\2\2\u00e5\u00e6\7c\2\2\u00e6\u00e7\7m\2\2"+
		"\u00e7:\3\2\2\2\u00e8\u00e9\7e\2\2\u00e9\u00ea\7q\2\2\u00ea\u00eb\7p\2"+
		"\2\u00eb\u00ec\7v\2\2\u00ec\u00ed\7k\2\2\u00ed\u00ee\7p\2\2\u00ee\u00ef"+
		"\7w\2\2\u00ef\u00f0\7g\2\2\u00f0<\3\2\2\2\u00f1\u00f2\7f\2\2\u00f2\u00f3"+
		"\7q\2\2\u00f3\u00f4\7p\2\2\u00f4\u00f5\7g\2\2\u00f5>\3\2\2\2\u00f6\u00f7"+
		"\7g\2\2\u00f7\u00f8\7e\2\2\u00f8\u00f9\7j\2\2\u00f9\u010e\7q\2\2\u00fa"+
		"\u00fb\7e\2\2\u00fb\u00fc\7c\2\2\u00fc\u010e\7v\2\2\u00fd\u00fe\7n\2\2"+
		"\u00fe\u010e\7u\2\2\u00ff\u0100\7n\2\2\u0100\u010e\7n\2\2\u0101\u0102"+
		"\7v\2\2\u0102\u0103\7k\2\2\u0103\u0104\7o\2\2\u0104\u010e\7g\2\2\u0105"+
		"\u0106\7y\2\2\u0106\u0107\7i\2\2\u0107\u0108\7g\2\2\u0108\u010e\7v\2\2"+
		"\u0109\u010a\7e\2\2\u010a\u010e\7f\2\2\u010b\u010c\7v\2\2\u010c\u010e"+
		"\7t\2\2\u010d\u00f6\3\2\2\2\u010d\u00fa\3\2\2\2\u010d\u00fd\3\2\2\2\u010d"+
		"\u00ff\3\2\2\2\u010d\u0101\3\2\2\2\u010d\u0105\3\2\2\2\u010d\u0109\3\2"+
		"\2\2\u010d\u010b\3\2\2\2\u010e@\3\2\2\2\u010f\u011a\t\7\2\2\u0110\u0112"+
		"\5M\'\2\u0111\u0110\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0114\3\2\2\2\u0113"+
		"\u0115\t\b\2\2\u0114\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0114\3\2"+
		"\2\2\u0116\u0117\3\2\2\2\u0117\u0119\3\2\2\2\u0118\u0111\3\2\2\2\u0119"+
		"\u011c\3\2\2\2\u011a\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011bB\3\2\2\2"+
		"\u011c\u011a\3\2\2\2\u011d\u011e\7j\2\2\u011e\u011f\7v\2\2\u011f\u0120"+
		"\7v\2\2\u0120\u0121\7r\2\2\u0121\u0123\3\2\2\2\u0122\u0124\7u\2\2\u0123"+
		"\u0122\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u012d\3\2\2\2\u0125\u0126\7h"+
		"\2\2\u0126\u0127\7v\2\2\u0127\u012d\7r\2\2\u0128\u0129\7u\2\2\u0129\u012a"+
		"\7o\2\2\u012a\u012b\7v\2\2\u012b\u012d\7r\2\2\u012c\u011d\3\2\2\2\u012c"+
		"\u0125\3\2\2\2\u012c\u0128\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u012f\7<"+
		"\2\2\u012f\u0130\7\61\2\2\u0130\u0132\7\61\2\2\u0131\u012c\3\2\2\2\u0131"+
		"\u0132\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0134\7y\2\2\u0134\u0135\7y\2"+
		"\2\u0135\u0136\7y\2\2\u0136\u0137\7\60\2\2\u0137\u0139\3\2\2\2\u0138\u013a"+
		"\t\t\2\2\u0139\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u0139\3\2\2\2\u013b"+
		"\u013c\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013f\7\60\2\2\u013e\u0140\t"+
		"\n\2\2\u013f\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u013f\3\2\2\2\u0141"+
		"\u0142\3\2\2\2\u0142\u014e\3\2\2\2\u0143\u0145\7\61\2\2\u0144\u0146\t"+
		"\13\2\2\u0145\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0145\3\2\2\2\u0147"+
		"\u0148\3\2\2\2\u0148\u014a\3\2\2\2\u0149\u014b\7\61\2\2\u014a\u0149\3"+
		"\2\2\2\u014a\u014b\3\2\2\2\u014b\u014d\3\2\2\2\u014c\u0143\3\2\2\2\u014d"+
		"\u0150\3\2\2\2\u014e\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014fD\3\2\2\2"+
		"\u0150\u014e\3\2\2\2\u0151\u0152\5A!\2\u0152\u0153\7\60\2\2\u0153\u0154"+
		"\5A!\2\u0154F\3\2\2\2\u0155\u0156\7&\2\2\u0156\u0157\5A!\2\u0157H\3\2"+
		"\2\2\u0158\u015f\5K&\2\u0159\u015f\5O(\2\u015a\u015f\5Q)\2\u015b\u015f"+
		"\5S*\2\u015c\u015f\5U+\2\u015d\u015f\5W,\2\u015e\u0158\3\2\2\2\u015e\u0159"+
		"\3\2\2\2\u015e\u015a\3\2\2\2\u015e\u015b\3\2\2\2\u015e\u015c\3\2\2\2\u015e"+
		"\u015d\3\2\2\2\u015fJ\3\2\2\2\u0160\u0161\7/\2\2\u0161\u0162\7/\2\2\u0162"+
		"L\3\2\2\2\u0163\u0164\7/\2\2\u0164N\3\2\2\2\u0165\u0166\7-\2\2\u0166\u0167"+
		"\7-\2\2\u0167P\3\2\2\2\u0168\u0169\7/\2\2\u0169\u016a\7?\2\2\u016aR\3"+
		"\2\2\2\u016b\u016c\7-\2\2\u016c\u016d\7?\2\2\u016dT\3\2\2\2\u016e\u016f"+
		"\7,\2\2\u016f\u0170\7?\2\2\u0170V\3\2\2\2\u0171\u0172\7\61\2\2\u0172\u0173"+
		"\7?\2\2\u0173X\3\2\2\2\u0174\u0175\7>\2\2\u0175\u017c\7?\2\2\u0176\u0177"+
		"\7@\2\2\u0177\u017c\7?\2\2\u0178\u017c\t\f\2\2\u0179\u017a\7?\2\2\u017a"+
		"\u017c\7?\2\2\u017b\u0174\3\2\2\2\u017b\u0176\3\2\2\2\u017b\u0178\3\2"+
		"\2\2\u017b\u0179\3\2\2\2\u017cZ\3\2\2\2\u017d\u017f\5K&\2\u017e\u0180"+
		"\t\r\2\2\u017f\u017e\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u017f\3\2\2\2\u0181"+
		"\u0182\3\2\2\2\u0182\u0186\3\2\2\2\u0183\u0185\t\16\2\2\u0184\u0183\3"+
		"\2\2\2\u0185\u0188\3\2\2\2\u0186\u0184\3\2\2\2\u0186\u0187\3\2\2\2\u0187"+
		"\\\3\2\2\2\u0188\u0186\3\2\2\2\u0189\u018b\5M\'\2\u018a\u018c\t\r\2\2"+
		"\u018b\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018b\3\2\2\2\u018d\u018e"+
		"\3\2\2\2\u018e\u0192\3\2\2\2\u018f\u0191\t\16\2\2\u0190\u018f\3\2\2\2"+
		"\u0191\u0194\3\2\2\2\u0192\u0190\3\2\2\2\u0192\u0193\3\2\2\2\u0193^\3"+
		"\2\2\2\u0194\u0192\3\2\2\2\u0195\u0197\5M\'\2\u0196\u0195\3\2\2\2\u0196"+
		"\u0197\3\2\2\2\u0197\u0199\3\2\2\2\u0198\u019a\t\r\2\2\u0199\u0198\3\2"+
		"\2\2\u019a\u019b\3\2\2\2\u019b\u0199\3\2\2\2\u019b\u019c\3\2\2\2\u019c"+
		"`\3\2\2\2\u019d\u019e\7?\2\2\u019eb\3\2\2\2\u019f\u01a0\7=\2\2\u01a0d"+
		"\3\2\2\2\u01a1\u01a2\7~\2\2\u01a2\u01a6\7~\2\2\u01a3\u01a4\7(\2\2\u01a4"+
		"\u01a6\7(\2\2\u01a5\u01a1\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a6f\3\2\2\2\u01a7"+
		"\u01a9\t\17\2\2\u01a8\u01a7\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ab\3"+
		"\2\2\2\u01aa\u01a8\3\2\2\2\u01abh\3\2\2\2\u01ac\u01ad\13\2\2\2\u01adj"+
		"\3\2\2\2\37\2\u0089\u0093\u0096\u009c\u00a4\u00ac\u010d\u0111\u0116\u011a"+
		"\u0123\u012c\u0131\u013b\u0141\u0147\u014a\u014e\u015e\u017b\u0181\u0186"+
		"\u018d\u0192\u0196\u019b\u01a5\u01aa\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}