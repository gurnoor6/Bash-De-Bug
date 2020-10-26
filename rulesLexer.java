// Generated from rules.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class rulesLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		VAR=1, NUMBER=2, WHITESPACE=3, NEWLINE=4, PLUS=5, ASSIGNMENT=6, STRING=7, 
		SEMICOLON=8, ASSIGN=9;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"DBLQUOTE", "VAR", "NUMBER", "WHITESPACE", "NEWLINE", "PLUS", "ASSIGNMENT", 
			"STRING", "SEMICOLON", "ASSIGN"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'\n'", "'+'", "'='", null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "VAR", "NUMBER", "WHITESPACE", "NEWLINE", "PLUS", "ASSIGNMENT", 
			"STRING", "SEMICOLON", "ASSIGN"
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


	public rulesLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "rules.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\13J\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\3\2\3\3\6\3\33\n\3\r\3\16\3\34\3\3\7\3 \n\3\f\3\16\3#\13\3\3\4"+
		"\6\4&\n\4\r\4\16\4\'\3\5\6\5+\n\5\r\5\16\5,\3\5\3\5\3\6\3\6\3\7\3\7\3"+
		"\b\3\b\3\t\3\t\6\t9\n\t\r\t\16\t:\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\5\13E\n\13\3\13\3\13\5\13I\n\13\3:\2\f\3\2\5\3\7\4\t\5\13\6\r\7\17\b"+
		"\21\t\23\n\25\13\3\2\5\5\2C\\aac|\3\2\62;\5\2\13\13\17\17\"\"\2O\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\3\27\3\2\2\2\5\32\3\2\2\2\7%\3\2"+
		"\2\2\t*\3\2\2\2\13\60\3\2\2\2\r\62\3\2\2\2\17\64\3\2\2\2\21\66\3\2\2\2"+
		"\23>\3\2\2\2\25@\3\2\2\2\27\30\7$\2\2\30\4\3\2\2\2\31\33\t\2\2\2\32\31"+
		"\3\2\2\2\33\34\3\2\2\2\34\32\3\2\2\2\34\35\3\2\2\2\35!\3\2\2\2\36 \t\3"+
		"\2\2\37\36\3\2\2\2 #\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"\6\3\2\2\2#!\3\2"+
		"\2\2$&\t\3\2\2%$\3\2\2\2&\'\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(\b\3\2\2\2)"+
		"+\t\4\2\2*)\3\2\2\2+,\3\2\2\2,*\3\2\2\2,-\3\2\2\2-.\3\2\2\2./\b\5\2\2"+
		"/\n\3\2\2\2\60\61\7\f\2\2\61\f\3\2\2\2\62\63\7-\2\2\63\16\3\2\2\2\64\65"+
		"\7?\2\2\65\20\3\2\2\2\668\5\3\2\2\679\13\2\2\28\67\3\2\2\29:\3\2\2\2:"+
		";\3\2\2\2:8\3\2\2\2;<\3\2\2\2<=\5\3\2\2=\22\3\2\2\2>?\7=\2\2?\24\3\2\2"+
		"\2@A\5\5\3\2AD\5\17\b\2BE\5\7\4\2CE\5\5\3\2DB\3\2\2\2DC\3\2\2\2EH\3\2"+
		"\2\2FI\5\13\6\2GI\5\23\n\2HF\3\2\2\2HG\3\2\2\2I\26\3\2\2\2\n\2\34!\',"+
		":DH\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}