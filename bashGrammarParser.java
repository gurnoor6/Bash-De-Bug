// Generated from bashGrammar.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class bashGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SINGLE_STRING=1, DOUBLE_STRING=2, COMMENT=3, SPACE=4, FOR=5, DO=6, DONE=7, 
		COMMAND=8, RHS_ASSIGNMENT=9, OPEN_FOR_BRACKET=10, CLOSE_FOR_BRACKET=11, 
		VAR=12, BASH_VAR=13, VAL=14, EQUALS=15, SEMICOLON=16, INCREMENT=17, COMPARE=18, 
		OTHER=19;
	public static final int
		RULE_code = 0, RULE_bashScript = 1, RULE_for_loop = 2, RULE_inside_for = 3, 
		RULE_linux_command = 4, RULE_assignment = 5, RULE_command_data = 6, RULE_comparison = 7, 
		RULE_increment = 8, RULE_space = 9, RULE_string = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"code", "bashScript", "for_loop", "inside_for", "linux_command", "assignment", 
			"command_data", "comparison", "increment", "space", "string"
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
			"OTHER"
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

	@Override
	public String getGrammarFileName() { return "bashGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public bashGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CodeContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(bashGrammarParser.EOF, 0); }
		public List<BashScriptContext> bashScript() {
			return getRuleContexts(BashScriptContext.class);
		}
		public BashScriptContext bashScript(int i) {
			return getRuleContext(BashScriptContext.class,i);
		}
		public CodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bashGrammarListener ) ((bashGrammarListener)listener).enterCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bashGrammarListener ) ((bashGrammarListener)listener).exitCode(this);
		}
	}

	public final CodeContext code() throws RecognitionException {
		CodeContext _localctx = new CodeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_code);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << COMMAND) | (1L << VAR))) != 0)) {
				{
				{
				setState(22);
				bashScript();
				}
				}
				setState(27);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(28);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BashScriptContext extends ParserRuleContext {
		public List<For_loopContext> for_loop() {
			return getRuleContexts(For_loopContext.class);
		}
		public For_loopContext for_loop(int i) {
			return getRuleContext(For_loopContext.class,i);
		}
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public List<Linux_commandContext> linux_command() {
			return getRuleContexts(Linux_commandContext.class);
		}
		public Linux_commandContext linux_command(int i) {
			return getRuleContext(Linux_commandContext.class,i);
		}
		public BashScriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bashScript; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bashGrammarListener ) ((bashGrammarListener)listener).enterBashScript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bashGrammarListener ) ((bashGrammarListener)listener).exitBashScript(this);
		}
	}

	public final BashScriptContext bashScript() throws RecognitionException {
		BashScriptContext _localctx = new BashScriptContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_bashScript);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(33); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(33);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case FOR:
						{
						setState(30);
						for_loop();
						}
						break;
					case VAR:
						{
						setState(31);
						assignment();
						}
						break;
					case COMMAND:
						{
						setState(32);
						linux_command();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(35); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_loopContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(bashGrammarParser.FOR, 0); }
		public TerminalNode OPEN_FOR_BRACKET() { return getToken(bashGrammarParser.OPEN_FOR_BRACKET, 0); }
		public Inside_forContext inside_for() {
			return getRuleContext(Inside_forContext.class,0);
		}
		public TerminalNode CLOSE_FOR_BRACKET() { return getToken(bashGrammarParser.CLOSE_FOR_BRACKET, 0); }
		public TerminalNode DO() { return getToken(bashGrammarParser.DO, 0); }
		public TerminalNode DONE() { return getToken(bashGrammarParser.DONE, 0); }
		public List<SpaceContext> space() {
			return getRuleContexts(SpaceContext.class);
		}
		public SpaceContext space(int i) {
			return getRuleContext(SpaceContext.class,i);
		}
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public List<Linux_commandContext> linux_command() {
			return getRuleContexts(Linux_commandContext.class);
		}
		public Linux_commandContext linux_command(int i) {
			return getRuleContext(Linux_commandContext.class,i);
		}
		public For_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bashGrammarListener ) ((bashGrammarListener)listener).enterFor_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bashGrammarListener ) ((bashGrammarListener)listener).exitFor_loop(this);
		}
	}

	public final For_loopContext for_loop() throws RecognitionException {
		For_loopContext _localctx = new For_loopContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_for_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(FOR);
			setState(38);
			match(OPEN_FOR_BRACKET);
			setState(39);
			inside_for();
			setState(40);
			match(CLOSE_FOR_BRACKET);
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(41);
				space();
				}
			}

			setState(44);
			match(DO);
			setState(46);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(45);
				space();
				}
				break;
			}
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMAND || _la==VAR) {
				{
				setState(50);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VAR:
					{
					setState(48);
					assignment();
					}
					break;
				case COMMAND:
					{
					setState(49);
					linux_command();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(55);
				space();
				}
			}

			setState(58);
			match(DONE);
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(59);
				space();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Inside_forContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(bashGrammarParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(bashGrammarParser.SEMICOLON, i);
		}
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public IncrementContext increment() {
			return getRuleContext(IncrementContext.class,0);
		}
		public Inside_forContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inside_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bashGrammarListener ) ((bashGrammarListener)listener).enterInside_for(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bashGrammarListener ) ((bashGrammarListener)listener).exitInside_for(this);
		}
	}

	public final Inside_forContext inside_for() throws RecognitionException {
		Inside_forContext _localctx = new Inside_forContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_inside_for);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(62);
			assignment();
			setState(63);
			match(SEMICOLON);
			setState(64);
			comparison();
			setState(65);
			match(SEMICOLON);
			setState(66);
			increment();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Linux_commandContext extends ParserRuleContext {
		public TerminalNode COMMAND() { return getToken(bashGrammarParser.COMMAND, 0); }
		public List<SpaceContext> space() {
			return getRuleContexts(SpaceContext.class);
		}
		public SpaceContext space(int i) {
			return getRuleContext(SpaceContext.class,i);
		}
		public List<Command_dataContext> command_data() {
			return getRuleContexts(Command_dataContext.class);
		}
		public Command_dataContext command_data(int i) {
			return getRuleContext(Command_dataContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(bashGrammarParser.SEMICOLON, 0); }
		public Linux_commandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linux_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bashGrammarListener ) ((bashGrammarListener)listener).enterLinux_command(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bashGrammarListener ) ((bashGrammarListener)listener).exitLinux_command(this);
		}
	}

	public final Linux_commandContext linux_command() throws RecognitionException {
		Linux_commandContext _localctx = new Linux_commandContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_linux_command);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(COMMAND);
			setState(70);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(69);
				space();
				}
				break;
			}
			setState(73); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(72);
					command_data();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(75); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(77);
				match(SEMICOLON);
				}
			}

			setState(81);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(80);
				space();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public List<TerminalNode> VAR() { return getTokens(bashGrammarParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(bashGrammarParser.VAR, i);
		}
		public TerminalNode EQUALS() { return getToken(bashGrammarParser.EQUALS, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode VAL() { return getToken(bashGrammarParser.VAL, 0); }
		public TerminalNode BASH_VAR() { return getToken(bashGrammarParser.BASH_VAR, 0); }
		public TerminalNode RHS_ASSIGNMENT() { return getToken(bashGrammarParser.RHS_ASSIGNMENT, 0); }
		public TerminalNode SEMICOLON() { return getToken(bashGrammarParser.SEMICOLON, 0); }
		public SpaceContext space() {
			return getRuleContext(SpaceContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bashGrammarListener ) ((bashGrammarListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bashGrammarListener ) ((bashGrammarListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(VAR);
			setState(84);
			match(EQUALS);
			setState(90);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SINGLE_STRING:
			case DOUBLE_STRING:
				{
				setState(85);
				string();
				}
				break;
			case VAL:
				{
				setState(86);
				match(VAL);
				}
				break;
			case VAR:
				{
				setState(87);
				match(VAR);
				}
				break;
			case BASH_VAR:
				{
				setState(88);
				match(BASH_VAR);
				}
				break;
			case RHS_ASSIGNMENT:
				{
				setState(89);
				match(RHS_ASSIGNMENT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(92);
				match(SEMICOLON);
				}
				break;
			}
			setState(96);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(95);
				space();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Command_dataContext extends ParserRuleContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode BASH_VAR() { return getToken(bashGrammarParser.BASH_VAR, 0); }
		public TerminalNode VAR() { return getToken(bashGrammarParser.VAR, 0); }
		public TerminalNode VAL() { return getToken(bashGrammarParser.VAL, 0); }
		public SpaceContext space() {
			return getRuleContext(SpaceContext.class,0);
		}
		public List<TerminalNode> OTHER() { return getTokens(bashGrammarParser.OTHER); }
		public TerminalNode OTHER(int i) {
			return getToken(bashGrammarParser.OTHER, i);
		}
		public Command_dataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command_data; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bashGrammarListener ) ((bashGrammarListener)listener).enterCommand_data(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bashGrammarListener ) ((bashGrammarListener)listener).exitCommand_data(this);
		}
	}

	public final Command_dataContext command_data() throws RecognitionException {
		Command_dataContext _localctx = new Command_dataContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_command_data);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OTHER:
				{
				setState(99); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(98);
						match(OTHER);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(101); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case SINGLE_STRING:
			case DOUBLE_STRING:
				{
				setState(103);
				string();
				}
				break;
			case BASH_VAR:
				{
				setState(104);
				match(BASH_VAR);
				}
				break;
			case VAR:
				{
				setState(105);
				match(VAR);
				}
				break;
			case VAL:
				{
				setState(106);
				match(VAL);
				}
				break;
			case SPACE:
				{
				setState(107);
				space();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparisonContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(bashGrammarParser.VAR, 0); }
		public TerminalNode COMPARE() { return getToken(bashGrammarParser.COMPARE, 0); }
		public TerminalNode VAL() { return getToken(bashGrammarParser.VAL, 0); }
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bashGrammarListener ) ((bashGrammarListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bashGrammarListener ) ((bashGrammarListener)listener).exitComparison(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_comparison);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(VAR);
			setState(111);
			match(COMPARE);
			setState(112);
			match(VAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IncrementContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(bashGrammarParser.VAR, 0); }
		public TerminalNode INCREMENT() { return getToken(bashGrammarParser.INCREMENT, 0); }
		public IncrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_increment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bashGrammarListener ) ((bashGrammarListener)listener).enterIncrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bashGrammarListener ) ((bashGrammarListener)listener).exitIncrement(this);
		}
	}

	public final IncrementContext increment() throws RecognitionException {
		IncrementContext _localctx = new IncrementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_increment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(VAR);
			setState(115);
			match(INCREMENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SpaceContext extends ParserRuleContext {
		public List<TerminalNode> SPACE() { return getTokens(bashGrammarParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(bashGrammarParser.SPACE, i);
		}
		public SpaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_space; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bashGrammarListener ) ((bashGrammarListener)listener).enterSpace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bashGrammarListener ) ((bashGrammarListener)listener).exitSpace(this);
		}
	}

	public final SpaceContext space() throws RecognitionException {
		SpaceContext _localctx = new SpaceContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_space);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(118); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(117);
					match(SPACE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(120); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringContext extends ParserRuleContext {
		public TerminalNode SINGLE_STRING() { return getToken(bashGrammarParser.SINGLE_STRING, 0); }
		public TerminalNode DOUBLE_STRING() { return getToken(bashGrammarParser.DOUBLE_STRING, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bashGrammarListener ) ((bashGrammarListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bashGrammarListener ) ((bashGrammarListener)listener).exitString(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			_la = _input.LA(1);
			if ( !(_la==SINGLE_STRING || _la==DOUBLE_STRING) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\25\177\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\7\2\32\n\2\f\2\16\2\35\13\2\3\2\3\2\3\3\3\3\3\3\6\3$\n"+
		"\3\r\3\16\3%\3\4\3\4\3\4\3\4\3\4\5\4-\n\4\3\4\3\4\5\4\61\n\4\3\4\3\4\7"+
		"\4\65\n\4\f\4\16\48\13\4\3\4\5\4;\n\4\3\4\3\4\5\4?\n\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\5\6I\n\6\3\6\6\6L\n\6\r\6\16\6M\3\6\5\6Q\n\6\3\6\5\6"+
		"T\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7]\n\7\3\7\5\7`\n\7\3\7\5\7c\n\7\3"+
		"\b\6\bf\n\b\r\b\16\bg\3\b\3\b\3\b\3\b\3\b\5\bo\n\b\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\13\6\13y\n\13\r\13\16\13z\3\f\3\f\3\f\2\2\r\2\4\6\b\n\f\16"+
		"\20\22\24\26\2\3\3\2\3\4\2\u008e\2\33\3\2\2\2\4#\3\2\2\2\6\'\3\2\2\2\b"+
		"@\3\2\2\2\nF\3\2\2\2\fU\3\2\2\2\16n\3\2\2\2\20p\3\2\2\2\22t\3\2\2\2\24"+
		"x\3\2\2\2\26|\3\2\2\2\30\32\5\4\3\2\31\30\3\2\2\2\32\35\3\2\2\2\33\31"+
		"\3\2\2\2\33\34\3\2\2\2\34\36\3\2\2\2\35\33\3\2\2\2\36\37\7\2\2\3\37\3"+
		"\3\2\2\2 $\5\6\4\2!$\5\f\7\2\"$\5\n\6\2# \3\2\2\2#!\3\2\2\2#\"\3\2\2\2"+
		"$%\3\2\2\2%#\3\2\2\2%&\3\2\2\2&\5\3\2\2\2\'(\7\7\2\2()\7\f\2\2)*\5\b\5"+
		"\2*,\7\r\2\2+-\5\24\13\2,+\3\2\2\2,-\3\2\2\2-.\3\2\2\2.\60\7\b\2\2/\61"+
		"\5\24\13\2\60/\3\2\2\2\60\61\3\2\2\2\61\66\3\2\2\2\62\65\5\f\7\2\63\65"+
		"\5\n\6\2\64\62\3\2\2\2\64\63\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2\66\67\3"+
		"\2\2\2\67:\3\2\2\28\66\3\2\2\29;\5\24\13\2:9\3\2\2\2:;\3\2\2\2;<\3\2\2"+
		"\2<>\7\t\2\2=?\5\24\13\2>=\3\2\2\2>?\3\2\2\2?\7\3\2\2\2@A\5\f\7\2AB\7"+
		"\22\2\2BC\5\20\t\2CD\7\22\2\2DE\5\22\n\2E\t\3\2\2\2FH\7\n\2\2GI\5\24\13"+
		"\2HG\3\2\2\2HI\3\2\2\2IK\3\2\2\2JL\5\16\b\2KJ\3\2\2\2LM\3\2\2\2MK\3\2"+
		"\2\2MN\3\2\2\2NP\3\2\2\2OQ\7\22\2\2PO\3\2\2\2PQ\3\2\2\2QS\3\2\2\2RT\5"+
		"\24\13\2SR\3\2\2\2ST\3\2\2\2T\13\3\2\2\2UV\7\16\2\2V\\\7\21\2\2W]\5\26"+
		"\f\2X]\7\20\2\2Y]\7\16\2\2Z]\7\17\2\2[]\7\13\2\2\\W\3\2\2\2\\X\3\2\2\2"+
		"\\Y\3\2\2\2\\Z\3\2\2\2\\[\3\2\2\2]_\3\2\2\2^`\7\22\2\2_^\3\2\2\2_`\3\2"+
		"\2\2`b\3\2\2\2ac\5\24\13\2ba\3\2\2\2bc\3\2\2\2c\r\3\2\2\2df\7\25\2\2e"+
		"d\3\2\2\2fg\3\2\2\2ge\3\2\2\2gh\3\2\2\2ho\3\2\2\2io\5\26\f\2jo\7\17\2"+
		"\2ko\7\16\2\2lo\7\20\2\2mo\5\24\13\2ne\3\2\2\2ni\3\2\2\2nj\3\2\2\2nk\3"+
		"\2\2\2nl\3\2\2\2nm\3\2\2\2o\17\3\2\2\2pq\7\16\2\2qr\7\24\2\2rs\7\20\2"+
		"\2s\21\3\2\2\2tu\7\16\2\2uv\7\23\2\2v\23\3\2\2\2wy\7\6\2\2xw\3\2\2\2y"+
		"z\3\2\2\2zx\3\2\2\2z{\3\2\2\2{\25\3\2\2\2|}\t\2\2\2}\27\3\2\2\2\25\33"+
		"#%,\60\64\66:>HMPS\\_bgnz";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}