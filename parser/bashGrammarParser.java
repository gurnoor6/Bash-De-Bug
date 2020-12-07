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
		T__0=1, SINGLE_STRING=2, DOUBLE_STRING=3, COMMENT=4, SPACE=5, IF=6, THEN=7, 
		ELIF=8, ELSE=9, FI=10, FOR=11, DO=12, DONE=13, SED=14, COMMAND=15, RHS_ASSIGNMENT=16, 
		OPEN_BRACKETS=17, CLOSE_BRACKETS=18, VAR=19, WEBSITE=20, FILENAME=21, 
		SED_FLAG=22, BASH_VAR=23, VAL=24, ASSIGN=25, SEMICOLON=26, LOGICAL_OP=27, 
		INCREMENT=28, COMPARE=29, BLOB=30, OTHER=31;
	public static final int
		RULE_code = 0, RULE_bashScript = 1, RULE_expressions = 2, RULE_for_loop = 3, 
		RULE_inside_for = 4, RULE_ifElse = 5, RULE_condition = 6, RULE_linux_command = 7, 
		RULE_assignment = 8, RULE_advanced_assignment = 9, RULE_command_data = 10, 
		RULE_comparison = 11, RULE_increment = 12, RULE_space = 13, RULE_string = 14, 
		RULE_sed_flag = 15, RULE_sed = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"code", "bashScript", "expressions", "for_loop", "inside_for", "ifElse", 
			"condition", "linux_command", "assignment", "advanced_assignment", "command_data", 
			"comparison", "increment", "space", "string", "sed_flag", "sed"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", null, null, null, null, "'if'", "'then'", "'elif'", "'else'", 
			"'fi'", "'for'", "'do'", "'done'", "'sed'", null, null, null, null, null, 
			null, null, null, null, null, "'='", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "SINGLE_STRING", "DOUBLE_STRING", "COMMENT", "SPACE", "IF", 
			"THEN", "ELIF", "ELSE", "FI", "FOR", "DO", "DONE", "SED", "COMMAND", 
			"RHS_ASSIGNMENT", "OPEN_BRACKETS", "CLOSE_BRACKETS", "VAR", "WEBSITE", 
			"FILENAME", "SED_FLAG", "BASH_VAR", "VAL", "ASSIGN", "SEMICOLON", "LOGICAL_OP", 
			"INCREMENT", "COMPARE", "BLOB", "OTHER"
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
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << IF) | (1L << FOR) | (1L << SED) | (1L << COMMAND) | (1L << OPEN_BRACKETS) | (1L << VAR))) != 0)) {
				{
				{
				setState(34);
				bashScript();
				}
				}
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(40);
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
		public List<SpaceContext> space() {
			return getRuleContexts(SpaceContext.class);
		}
		public SpaceContext space(int i) {
			return getRuleContext(SpaceContext.class,i);
		}
		public List<Advanced_assignmentContext> advanced_assignment() {
			return getRuleContexts(Advanced_assignmentContext.class);
		}
		public Advanced_assignmentContext advanced_assignment(int i) {
			return getRuleContext(Advanced_assignmentContext.class,i);
		}
		public List<IfElseContext> ifElse() {
			return getRuleContexts(IfElseContext.class);
		}
		public IfElseContext ifElse(int i) {
			return getRuleContext(IfElseContext.class,i);
		}
		public List<SedContext> sed() {
			return getRuleContexts(SedContext.class);
		}
		public SedContext sed(int i) {
			return getRuleContext(SedContext.class,i);
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
			setState(49); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(49);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case FOR:
						{
						setState(42);
						for_loop();
						}
						break;
					case VAR:
						{
						setState(43);
						assignment();
						}
						break;
					case COMMAND:
						{
						setState(44);
						linux_command();
						}
						break;
					case SPACE:
						{
						setState(45);
						space();
						}
						break;
					case OPEN_BRACKETS:
						{
						setState(46);
						advanced_assignment();
						}
						break;
					case IF:
						{
						setState(47);
						ifElse();
						}
						break;
					case SED:
						{
						setState(48);
						sed();
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
				setState(51); 
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

	public static class ExpressionsContext extends ParserRuleContext {
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
		public List<Advanced_assignmentContext> advanced_assignment() {
			return getRuleContexts(Advanced_assignmentContext.class);
		}
		public Advanced_assignmentContext advanced_assignment(int i) {
			return getRuleContext(Advanced_assignmentContext.class,i);
		}
		public List<IfElseContext> ifElse() {
			return getRuleContexts(IfElseContext.class);
		}
		public IfElseContext ifElse(int i) {
			return getRuleContext(IfElseContext.class,i);
		}
		public SpaceContext space() {
			return getRuleContext(SpaceContext.class,0);
		}
		public ExpressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bashGrammarListener ) ((bashGrammarListener)listener).enterExpressions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bashGrammarListener ) ((bashGrammarListener)listener).exitExpressions(this);
		}
	}

	public final ExpressionsContext expressions() throws RecognitionException {
		ExpressionsContext _localctx = new ExpressionsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expressions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOR) | (1L << COMMAND) | (1L << OPEN_BRACKETS) | (1L << VAR))) != 0)) {
				{
				setState(58);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FOR:
					{
					setState(53);
					for_loop();
					}
					break;
				case VAR:
					{
					setState(54);
					assignment();
					}
					break;
				case COMMAND:
					{
					setState(55);
					linux_command();
					}
					break;
				case OPEN_BRACKETS:
					{
					setState(56);
					advanced_assignment();
					}
					break;
				case IF:
					{
					setState(57);
					ifElse();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(63);
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

	public static class For_loopContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(bashGrammarParser.FOR, 0); }
		public TerminalNode OPEN_BRACKETS() { return getToken(bashGrammarParser.OPEN_BRACKETS, 0); }
		public Inside_forContext inside_for() {
			return getRuleContext(Inside_forContext.class,0);
		}
		public TerminalNode CLOSE_BRACKETS() { return getToken(bashGrammarParser.CLOSE_BRACKETS, 0); }
		public TerminalNode DO() { return getToken(bashGrammarParser.DO, 0); }
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public TerminalNode DONE() { return getToken(bashGrammarParser.DONE, 0); }
		public List<SpaceContext> space() {
			return getRuleContexts(SpaceContext.class);
		}
		public SpaceContext space(int i) {
			return getRuleContext(SpaceContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(bashGrammarParser.SEMICOLON, 0); }
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
		enterRule(_localctx, 6, RULE_for_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(FOR);
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(67);
				space();
				}
			}

			setState(70);
			match(OPEN_BRACKETS);
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(71);
				space();
				}
			}

			setState(74);
			inside_for();
			setState(75);
			match(CLOSE_BRACKETS);
			setState(77);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(76);
				space();
				}
				break;
			}
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(79);
				match(SEMICOLON);
				}
			}

			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(82);
				space();
				}
			}

			setState(85);
			match(DO);
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(86);
				space();
				}
				break;
			}
			setState(89);
			expressions();
			setState(90);
			match(DONE);
			setState(92);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(91);
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

	public static class Inside_forContext extends ParserRuleContext {
		public List<TerminalNode> SEMICOLON() { return getTokens(bashGrammarParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(bashGrammarParser.SEMICOLON, i);
		}
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public List<SpaceContext> space() {
			return getRuleContexts(SpaceContext.class);
		}
		public SpaceContext space(int i) {
			return getRuleContext(SpaceContext.class,i);
		}
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public List<TerminalNode> LOGICAL_OP() { return getTokens(bashGrammarParser.LOGICAL_OP); }
		public TerminalNode LOGICAL_OP(int i) {
			return getToken(bashGrammarParser.LOGICAL_OP, i);
		}
		public List<IncrementContext> increment() {
			return getRuleContexts(IncrementContext.class);
		}
		public IncrementContext increment(int i) {
			return getRuleContext(IncrementContext.class,i);
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
		enterRule(_localctx, 8, RULE_inside_for);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(94);
				assignment();
				}
			}

			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(97);
				match(T__0);
				setState(98);
				assignment();
				}
				}
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(104);
			match(SEMICOLON);
			setState(106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(105);
				space();
				}
				break;
			}
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << VAR) | (1L << VAL) | (1L << BLOB))) != 0)) {
				{
				setState(108);
				condition();
				}
			}

			setState(118);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(111);
					match(LOGICAL_OP);
					setState(113);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						setState(112);
						space();
						}
						break;
					}
					setState(115);
					condition();
					}
					} 
				}
				setState(120);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			setState(121);
			match(SEMICOLON);
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(122);
				space();
				}
				break;
			}
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR || _la==INCREMENT) {
				{
				setState(125);
				increment();
				}
			}

			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(128);
				match(T__0);
				setState(129);
				increment();
				}
				}
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(135);
				space();
				}
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

	public static class IfElseContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(bashGrammarParser.IF, 0); }
		public List<TerminalNode> OPEN_BRACKETS() { return getTokens(bashGrammarParser.OPEN_BRACKETS); }
		public TerminalNode OPEN_BRACKETS(int i) {
			return getToken(bashGrammarParser.OPEN_BRACKETS, i);
		}
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public List<TerminalNode> CLOSE_BRACKETS() { return getTokens(bashGrammarParser.CLOSE_BRACKETS); }
		public TerminalNode CLOSE_BRACKETS(int i) {
			return getToken(bashGrammarParser.CLOSE_BRACKETS, i);
		}
		public List<TerminalNode> THEN() { return getTokens(bashGrammarParser.THEN); }
		public TerminalNode THEN(int i) {
			return getToken(bashGrammarParser.THEN, i);
		}
		public List<ExpressionsContext> expressions() {
			return getRuleContexts(ExpressionsContext.class);
		}
		public ExpressionsContext expressions(int i) {
			return getRuleContext(ExpressionsContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(bashGrammarParser.ELSE, 0); }
		public TerminalNode FI() { return getToken(bashGrammarParser.FI, 0); }
		public List<SpaceContext> space() {
			return getRuleContexts(SpaceContext.class);
		}
		public SpaceContext space(int i) {
			return getRuleContext(SpaceContext.class,i);
		}
		public List<TerminalNode> LOGICAL_OP() { return getTokens(bashGrammarParser.LOGICAL_OP); }
		public TerminalNode LOGICAL_OP(int i) {
			return getToken(bashGrammarParser.LOGICAL_OP, i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(bashGrammarParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(bashGrammarParser.SEMICOLON, i);
		}
		public List<TerminalNode> ELIF() { return getTokens(bashGrammarParser.ELIF); }
		public TerminalNode ELIF(int i) {
			return getToken(bashGrammarParser.ELIF, i);
		}
		public IfElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifElse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bashGrammarListener ) ((bashGrammarListener)listener).enterIfElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bashGrammarListener ) ((bashGrammarListener)listener).exitIfElse(this);
		}
	}

	public final IfElseContext ifElse() throws RecognitionException {
		IfElseContext _localctx = new IfElseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ifElse);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(IF);
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(139);
				space();
				}
			}

			setState(142);
			match(OPEN_BRACKETS);
			setState(144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(143);
				space();
				}
				break;
			}
			setState(146);
			condition();
			setState(154);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(147);
					match(LOGICAL_OP);
					setState(149);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						setState(148);
						space();
						}
						break;
					}
					setState(151);
					condition();
					}
					} 
				}
				setState(156);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			setState(157);
			match(CLOSE_BRACKETS);
			setState(159);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(158);
				space();
				}
				break;
			}
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(161);
				match(SEMICOLON);
				}
			}

			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(164);
				space();
				}
			}

			setState(167);
			match(THEN);
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(168);
				space();
				}
				break;
			}
			setState(171);
			expressions();
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELIF) {
				{
				{
				setState(172);
				match(ELIF);
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE) {
					{
					setState(173);
					space();
					}
				}

				setState(176);
				match(OPEN_BRACKETS);
				setState(178);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(177);
					space();
					}
					break;
				}
				setState(180);
				condition();
				setState(185);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(181);
						match(LOGICAL_OP);
						setState(182);
						condition();
						}
						} 
					}
					setState(187);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				}
				setState(188);
				match(CLOSE_BRACKETS);
				setState(190);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(189);
					space();
					}
					break;
				}
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(192);
					match(SEMICOLON);
					}
				}

				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE) {
					{
					setState(195);
					space();
					}
				}

				setState(198);
				match(THEN);
				setState(200);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(199);
					space();
					}
					break;
				}
				setState(202);
				expressions();
				}
				}
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(209);
			match(ELSE);
			setState(211);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(210);
				space();
				}
				break;
			}
			setState(213);
			expressions();
			setState(214);
			match(FI);
			setState(216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(215);
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

	public static class ConditionContext extends ParserRuleContext {
		public TerminalNode COMPARE() { return getToken(bashGrammarParser.COMPARE, 0); }
		public List<SpaceContext> space() {
			return getRuleContexts(SpaceContext.class);
		}
		public SpaceContext space(int i) {
			return getRuleContext(SpaceContext.class,i);
		}
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public List<TerminalNode> VAR() { return getTokens(bashGrammarParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(bashGrammarParser.VAR, i);
		}
		public List<TerminalNode> VAL() { return getTokens(bashGrammarParser.VAL); }
		public TerminalNode VAL(int i) {
			return getToken(bashGrammarParser.VAL, i);
		}
		public List<TerminalNode> BLOB() { return getTokens(bashGrammarParser.BLOB); }
		public TerminalNode BLOB(int i) {
			return getToken(bashGrammarParser.BLOB, i);
		}
		public List<TerminalNode> BASH_VAR() { return getTokens(bashGrammarParser.BASH_VAR); }
		public TerminalNode BASH_VAR(int i) {
			return getToken(bashGrammarParser.BASH_VAR, i);
		}
		public List<TerminalNode> RHS_ASSIGNMENT() { return getTokens(bashGrammarParser.RHS_ASSIGNMENT); }
		public TerminalNode RHS_ASSIGNMENT(int i) {
			return getToken(bashGrammarParser.RHS_ASSIGNMENT, i);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bashGrammarListener ) ((bashGrammarListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bashGrammarListener ) ((bashGrammarListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(218);
				space();
				}
			}

			setState(222); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(221);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << VAL) | (1L << BLOB))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(224); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << VAL) | (1L << BLOB))) != 0) );
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(226);
				space();
				}
			}

			setState(229);
			match(COMPARE);
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(230);
				space();
				}
			}

			setState(240); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(240);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(233);
					string();
					}
					break;
				case 2:
					{
					setState(234);
					match(VAR);
					}
					break;
				case 3:
					{
					setState(235);
					match(VAL);
					}
					break;
				case 4:
					{
					setState(236);
					match(BLOB);
					}
					break;
				case 5:
					{
					setState(237);
					match(BASH_VAR);
					}
					break;
				case 6:
					{
					setState(238);
					match(RHS_ASSIGNMENT);
					}
					break;
				case 7:
					{
					setState(239);
					match(BLOB);
					}
					break;
				}
				}
				setState(242); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SINGLE_STRING) | (1L << DOUBLE_STRING) | (1L << RHS_ASSIGNMENT) | (1L << VAR) | (1L << BASH_VAR) | (1L << VAL) | (1L << BLOB))) != 0) );
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(244);
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
		enterRule(_localctx, 14, RULE_linux_command);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(COMMAND);
			setState(249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(248);
				space();
				}
				break;
			}
			setState(254);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(251);
					command_data();
					}
					} 
				}
				setState(256);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			}
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(257);
				match(SEMICOLON);
				}
			}

			setState(261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(260);
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
		public TerminalNode ASSIGN() { return getToken(bashGrammarParser.ASSIGN, 0); }
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public List<TerminalNode> VAL() { return getTokens(bashGrammarParser.VAL); }
		public TerminalNode VAL(int i) {
			return getToken(bashGrammarParser.VAL, i);
		}
		public List<TerminalNode> BASH_VAR() { return getTokens(bashGrammarParser.BASH_VAR); }
		public TerminalNode BASH_VAR(int i) {
			return getToken(bashGrammarParser.BASH_VAR, i);
		}
		public List<TerminalNode> RHS_ASSIGNMENT() { return getTokens(bashGrammarParser.RHS_ASSIGNMENT); }
		public TerminalNode RHS_ASSIGNMENT(int i) {
			return getToken(bashGrammarParser.RHS_ASSIGNMENT, i);
		}
		public List<TerminalNode> BLOB() { return getTokens(bashGrammarParser.BLOB); }
		public TerminalNode BLOB(int i) {
			return getToken(bashGrammarParser.BLOB, i);
		}
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
		enterRule(_localctx, 16, RULE_assignment);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(VAR);
			setState(264);
			match(ASSIGN);
			setState(271); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(271);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case SINGLE_STRING:
					case DOUBLE_STRING:
						{
						setState(265);
						string();
						}
						break;
					case VAL:
						{
						setState(266);
						match(VAL);
						}
						break;
					case VAR:
						{
						setState(267);
						match(VAR);
						}
						break;
					case BASH_VAR:
						{
						setState(268);
						match(BASH_VAR);
						}
						break;
					case RHS_ASSIGNMENT:
						{
						setState(269);
						match(RHS_ASSIGNMENT);
						}
						break;
					case BLOB:
						{
						setState(270);
						match(BLOB);
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
				setState(273); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(276);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(275);
				match(SEMICOLON);
				}
				break;
			}
			setState(279);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(278);
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

	public static class Advanced_assignmentContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACKETS() { return getToken(bashGrammarParser.OPEN_BRACKETS, 0); }
		public List<TerminalNode> VAR() { return getTokens(bashGrammarParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(bashGrammarParser.VAR, i);
		}
		public TerminalNode CLOSE_BRACKETS() { return getToken(bashGrammarParser.CLOSE_BRACKETS, 0); }
		public TerminalNode ASSIGN() { return getToken(bashGrammarParser.ASSIGN, 0); }
		public TerminalNode INCREMENT() { return getToken(bashGrammarParser.INCREMENT, 0); }
		public List<SpaceContext> space() {
			return getRuleContexts(SpaceContext.class);
		}
		public SpaceContext space(int i) {
			return getRuleContext(SpaceContext.class,i);
		}
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public List<TerminalNode> VAL() { return getTokens(bashGrammarParser.VAL); }
		public TerminalNode VAL(int i) {
			return getToken(bashGrammarParser.VAL, i);
		}
		public List<TerminalNode> BASH_VAR() { return getTokens(bashGrammarParser.BASH_VAR); }
		public TerminalNode BASH_VAR(int i) {
			return getToken(bashGrammarParser.BASH_VAR, i);
		}
		public List<TerminalNode> RHS_ASSIGNMENT() { return getTokens(bashGrammarParser.RHS_ASSIGNMENT); }
		public TerminalNode RHS_ASSIGNMENT(int i) {
			return getToken(bashGrammarParser.RHS_ASSIGNMENT, i);
		}
		public List<TerminalNode> BLOB() { return getTokens(bashGrammarParser.BLOB); }
		public TerminalNode BLOB(int i) {
			return getToken(bashGrammarParser.BLOB, i);
		}
		public TerminalNode SEMICOLON() { return getToken(bashGrammarParser.SEMICOLON, 0); }
		public Advanced_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_advanced_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bashGrammarListener ) ((bashGrammarListener)listener).enterAdvanced_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bashGrammarListener ) ((bashGrammarListener)listener).exitAdvanced_assignment(this);
		}
	}

	public final Advanced_assignmentContext advanced_assignment() throws RecognitionException {
		Advanced_assignmentContext _localctx = new Advanced_assignmentContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_advanced_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(OPEN_BRACKETS);
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(282);
				space();
				}
			}

			setState(285);
			match(VAR);
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(286);
				space();
				}
			}

			setState(289);
			_la = _input.LA(1);
			if ( !(_la==ASSIGN || _la==INCREMENT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(291);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(290);
				space();
				}
				break;
			}
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SINGLE_STRING) | (1L << DOUBLE_STRING) | (1L << RHS_ASSIGNMENT) | (1L << VAR) | (1L << BASH_VAR) | (1L << VAL) | (1L << BLOB))) != 0)) {
				{
				setState(299);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SINGLE_STRING:
				case DOUBLE_STRING:
					{
					setState(293);
					string();
					}
					break;
				case VAL:
					{
					setState(294);
					match(VAL);
					}
					break;
				case VAR:
					{
					setState(295);
					match(VAR);
					}
					break;
				case BASH_VAR:
					{
					setState(296);
					match(BASH_VAR);
					}
					break;
				case RHS_ASSIGNMENT:
					{
					setState(297);
					match(RHS_ASSIGNMENT);
					}
					break;
				case BLOB:
					{
					setState(298);
					match(BLOB);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(303);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(304);
				space();
				}
			}

			setState(307);
			match(CLOSE_BRACKETS);
			setState(309);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(308);
				match(SEMICOLON);
				}
			}

			setState(312);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				{
				setState(311);
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
		public TerminalNode VAR() { return getToken(bashGrammarParser.VAR, 0); }
		public TerminalNode VAL() { return getToken(bashGrammarParser.VAL, 0); }
		public TerminalNode BLOB() { return getToken(bashGrammarParser.BLOB, 0); }
		public TerminalNode BASH_VAR() { return getToken(bashGrammarParser.BASH_VAR, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode INCREMENT() { return getToken(bashGrammarParser.INCREMENT, 0); }
		public TerminalNode OTHER() { return getToken(bashGrammarParser.OTHER, 0); }
		public SpaceContext space() {
			return getRuleContext(SpaceContext.class,0);
		}
		public Sed_flagContext sed_flag() {
			return getRuleContext(Sed_flagContext.class,0);
		}
		public TerminalNode FILENAME() { return getToken(bashGrammarParser.FILENAME, 0); }
		public TerminalNode WEBSITE() { return getToken(bashGrammarParser.WEBSITE, 0); }
		public TerminalNode RHS_ASSIGNMENT() { return getToken(bashGrammarParser.RHS_ASSIGNMENT, 0); }
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
		enterRule(_localctx, 20, RULE_command_data);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				{
				setState(314);
				match(VAR);
				}
				break;
			case 2:
				{
				setState(315);
				match(VAL);
				}
				break;
			case 3:
				{
				setState(316);
				match(BLOB);
				}
				break;
			case 4:
				{
				setState(317);
				match(BASH_VAR);
				}
				break;
			case 5:
				{
				setState(318);
				string();
				}
				break;
			case 6:
				{
				setState(319);
				match(INCREMENT);
				}
				break;
			case 7:
				{
				setState(320);
				match(OTHER);
				}
				break;
			case 8:
				{
				setState(321);
				space();
				}
				break;
			case 9:
				{
				setState(322);
				sed_flag();
				}
				break;
			case 10:
				{
				setState(323);
				match(FILENAME);
				}
				break;
			case 11:
				{
				setState(324);
				match(WEBSITE);
				}
				break;
			case 12:
				{
				setState(325);
				match(RHS_ASSIGNMENT);
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
		enterRule(_localctx, 22, RULE_comparison);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			match(VAR);
			setState(329);
			match(COMPARE);
			setState(330);
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
		public List<TerminalNode> VAR() { return getTokens(bashGrammarParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(bashGrammarParser.VAR, i);
		}
		public TerminalNode INCREMENT() { return getToken(bashGrammarParser.INCREMENT, 0); }
		public TerminalNode BLOB() { return getToken(bashGrammarParser.BLOB, 0); }
		public TerminalNode VAL() { return getToken(bashGrammarParser.VAL, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode BASH_VAR() { return getToken(bashGrammarParser.BASH_VAR, 0); }
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
		enterRule(_localctx, 24, RULE_increment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				{
				setState(332);
				match(VAR);
				setState(333);
				match(INCREMENT);
				setState(339);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BLOB:
					{
					setState(334);
					match(BLOB);
					}
					break;
				case VAR:
					{
					setState(335);
					match(VAR);
					}
					break;
				case VAL:
					{
					setState(336);
					match(VAL);
					}
					break;
				case SINGLE_STRING:
				case DOUBLE_STRING:
					{
					setState(337);
					string();
					}
					break;
				case BASH_VAR:
					{
					setState(338);
					match(BASH_VAR);
					}
					break;
				case T__0:
				case SPACE:
				case CLOSE_BRACKETS:
					break;
				default:
					break;
				}
				}
				break;
			case INCREMENT:
				{
				setState(341);
				match(INCREMENT);
				setState(342);
				match(VAR);
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
		enterRule(_localctx, 26, RULE_space);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(346); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(345);
					match(SPACE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(348); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
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
		enterRule(_localctx, 28, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
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

	public static class Sed_flagContext extends ParserRuleContext {
		public TerminalNode VAL() { return getToken(bashGrammarParser.VAL, 0); }
		public TerminalNode SED_FLAG() { return getToken(bashGrammarParser.SED_FLAG, 0); }
		public Sed_flagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sed_flag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bashGrammarListener ) ((bashGrammarListener)listener).enterSed_flag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bashGrammarListener ) ((bashGrammarListener)listener).exitSed_flag(this);
		}
	}

	public final Sed_flagContext sed_flag() throws RecognitionException {
		Sed_flagContext _localctx = new Sed_flagContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_sed_flag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			_la = _input.LA(1);
			if ( !(_la==SED_FLAG || _la==VAL) ) {
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

	public static class SedContext extends ParserRuleContext {
		public TerminalNode SED() { return getToken(bashGrammarParser.SED, 0); }
		public List<SpaceContext> space() {
			return getRuleContexts(SpaceContext.class);
		}
		public SpaceContext space(int i) {
			return getRuleContext(SpaceContext.class,i);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public List<TerminalNode> COMPARE() { return getTokens(bashGrammarParser.COMPARE); }
		public TerminalNode COMPARE(int i) {
			return getToken(bashGrammarParser.COMPARE, i);
		}
		public List<TerminalNode> FILENAME() { return getTokens(bashGrammarParser.FILENAME); }
		public TerminalNode FILENAME(int i) {
			return getToken(bashGrammarParser.FILENAME, i);
		}
		public List<TerminalNode> VAR() { return getTokens(bashGrammarParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(bashGrammarParser.VAR, i);
		}
		public List<Sed_flagContext> sed_flag() {
			return getRuleContexts(Sed_flagContext.class);
		}
		public Sed_flagContext sed_flag(int i) {
			return getRuleContext(Sed_flagContext.class,i);
		}
		public List<TerminalNode> SPACE() { return getTokens(bashGrammarParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(bashGrammarParser.SPACE, i);
		}
		public TerminalNode SEMICOLON() { return getToken(bashGrammarParser.SEMICOLON, 0); }
		public SedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sed; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bashGrammarListener ) ((bashGrammarListener)listener).enterSed(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bashGrammarListener ) ((bashGrammarListener)listener).exitSed(this);
		}
	}

	public final SedContext sed() throws RecognitionException {
		SedContext _localctx = new SedContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_sed);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			match(SED);
			setState(355);
			space();
			setState(362);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SED_FLAG || _la==VAL) {
				{
				{
				setState(356);
				sed_flag();
				setState(358);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE) {
					{
					setState(357);
					match(SPACE);
					}
				}

				}
				}
				setState(364);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(365);
			string();
			setState(366);
			space();
			setState(367);
			_la = _input.LA(1);
			if ( !(_la==VAR || _la==FILENAME) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(368);
			space();
			setState(372);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(369);
					match(COMPARE);
					}
					} 
				}
				setState(374);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			}
			setState(378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(375);
				match(SPACE);
				}
				}
				setState(380);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAR || _la==FILENAME) {
				{
				{
				setState(381);
				_la = _input.LA(1);
				if ( !(_la==VAR || _la==FILENAME) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(386);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(387);
			match(COMPARE);
			setState(391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(388);
				match(SPACE);
				}
				}
				setState(393);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(394);
			_la = _input.LA(1);
			if ( !(_la==VAR || _la==FILENAME) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(396);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(395);
				match(SEMICOLON);
				}
			}

			setState(399);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				setState(398);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3!\u0194\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\7\2&\n\2\f\2\16\2)\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\6\3\64"+
		"\n\3\r\3\16\3\65\3\4\3\4\3\4\3\4\3\4\7\4=\n\4\f\4\16\4@\13\4\3\4\5\4C"+
		"\n\4\3\5\3\5\5\5G\n\5\3\5\3\5\5\5K\n\5\3\5\3\5\3\5\5\5P\n\5\3\5\5\5S\n"+
		"\5\3\5\5\5V\n\5\3\5\3\5\5\5Z\n\5\3\5\3\5\3\5\5\5_\n\5\3\6\5\6b\n\6\3\6"+
		"\3\6\7\6f\n\6\f\6\16\6i\13\6\3\6\3\6\5\6m\n\6\3\6\5\6p\n\6\3\6\3\6\5\6"+
		"t\n\6\3\6\7\6w\n\6\f\6\16\6z\13\6\3\6\3\6\5\6~\n\6\3\6\5\6\u0081\n\6\3"+
		"\6\3\6\7\6\u0085\n\6\f\6\16\6\u0088\13\6\3\6\5\6\u008b\n\6\3\7\3\7\5\7"+
		"\u008f\n\7\3\7\3\7\5\7\u0093\n\7\3\7\3\7\3\7\5\7\u0098\n\7\3\7\7\7\u009b"+
		"\n\7\f\7\16\7\u009e\13\7\3\7\3\7\5\7\u00a2\n\7\3\7\5\7\u00a5\n\7\3\7\5"+
		"\7\u00a8\n\7\3\7\3\7\5\7\u00ac\n\7\3\7\3\7\3\7\5\7\u00b1\n\7\3\7\3\7\5"+
		"\7\u00b5\n\7\3\7\3\7\3\7\7\7\u00ba\n\7\f\7\16\7\u00bd\13\7\3\7\3\7\5\7"+
		"\u00c1\n\7\3\7\5\7\u00c4\n\7\3\7\5\7\u00c7\n\7\3\7\3\7\5\7\u00cb\n\7\3"+
		"\7\3\7\7\7\u00cf\n\7\f\7\16\7\u00d2\13\7\3\7\3\7\5\7\u00d6\n\7\3\7\3\7"+
		"\3\7\5\7\u00db\n\7\3\b\5\b\u00de\n\b\3\b\6\b\u00e1\n\b\r\b\16\b\u00e2"+
		"\3\b\5\b\u00e6\n\b\3\b\3\b\5\b\u00ea\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\6"+
		"\b\u00f3\n\b\r\b\16\b\u00f4\3\b\5\b\u00f8\n\b\3\t\3\t\5\t\u00fc\n\t\3"+
		"\t\7\t\u00ff\n\t\f\t\16\t\u0102\13\t\3\t\5\t\u0105\n\t\3\t\5\t\u0108\n"+
		"\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\6\n\u0112\n\n\r\n\16\n\u0113\3\n\5"+
		"\n\u0117\n\n\3\n\5\n\u011a\n\n\3\13\3\13\5\13\u011e\n\13\3\13\3\13\5\13"+
		"\u0122\n\13\3\13\3\13\5\13\u0126\n\13\3\13\3\13\3\13\3\13\3\13\3\13\7"+
		"\13\u012e\n\13\f\13\16\13\u0131\13\13\3\13\5\13\u0134\n\13\3\13\3\13\5"+
		"\13\u0138\n\13\3\13\5\13\u013b\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\5\f\u0149\n\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\5\16\u0156\n\16\3\16\3\16\5\16\u015a\n\16\3\17\6\17\u015d\n"+
		"\17\r\17\16\17\u015e\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\5\22\u0169"+
		"\n\22\7\22\u016b\n\22\f\22\16\22\u016e\13\22\3\22\3\22\3\22\3\22\3\22"+
		"\7\22\u0175\n\22\f\22\16\22\u0178\13\22\3\22\7\22\u017b\n\22\f\22\16\22"+
		"\u017e\13\22\3\22\7\22\u0181\n\22\f\22\16\22\u0184\13\22\3\22\3\22\7\22"+
		"\u0188\n\22\f\22\16\22\u018b\13\22\3\22\3\22\5\22\u018f\n\22\3\22\5\22"+
		"\u0192\n\22\3\22\6x\u009c\u00bb\u0100\2\23\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"\2\7\5\2\25\25\32\32  \4\2\33\33\36\36\3\2\4\5\4\2\30\30"+
		"\32\32\4\2\25\25\27\27\2\u01f1\2\'\3\2\2\2\4\63\3\2\2\2\6>\3\2\2\2\bD"+
		"\3\2\2\2\na\3\2\2\2\f\u008c\3\2\2\2\16\u00dd\3\2\2\2\20\u00f9\3\2\2\2"+
		"\22\u0109\3\2\2\2\24\u011b\3\2\2\2\26\u0148\3\2\2\2\30\u014a\3\2\2\2\32"+
		"\u0159\3\2\2\2\34\u015c\3\2\2\2\36\u0160\3\2\2\2 \u0162\3\2\2\2\"\u0164"+
		"\3\2\2\2$&\5\4\3\2%$\3\2\2\2&)\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(*\3\2\2\2"+
		")\'\3\2\2\2*+\7\2\2\3+\3\3\2\2\2,\64\5\b\5\2-\64\5\22\n\2.\64\5\20\t\2"+
		"/\64\5\34\17\2\60\64\5\24\13\2\61\64\5\f\7\2\62\64\5\"\22\2\63,\3\2\2"+
		"\2\63-\3\2\2\2\63.\3\2\2\2\63/\3\2\2\2\63\60\3\2\2\2\63\61\3\2\2\2\63"+
		"\62\3\2\2\2\64\65\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66\5\3\2\2\2\67"+
		"=\5\b\5\28=\5\22\n\29=\5\20\t\2:=\5\24\13\2;=\5\f\7\2<\67\3\2\2\2<8\3"+
		"\2\2\2<9\3\2\2\2<:\3\2\2\2<;\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?B\3"+
		"\2\2\2@>\3\2\2\2AC\5\34\17\2BA\3\2\2\2BC\3\2\2\2C\7\3\2\2\2DF\7\r\2\2"+
		"EG\5\34\17\2FE\3\2\2\2FG\3\2\2\2GH\3\2\2\2HJ\7\23\2\2IK\5\34\17\2JI\3"+
		"\2\2\2JK\3\2\2\2KL\3\2\2\2LM\5\n\6\2MO\7\24\2\2NP\5\34\17\2ON\3\2\2\2"+
		"OP\3\2\2\2PR\3\2\2\2QS\7\34\2\2RQ\3\2\2\2RS\3\2\2\2SU\3\2\2\2TV\5\34\17"+
		"\2UT\3\2\2\2UV\3\2\2\2VW\3\2\2\2WY\7\16\2\2XZ\5\34\17\2YX\3\2\2\2YZ\3"+
		"\2\2\2Z[\3\2\2\2[\\\5\6\4\2\\^\7\17\2\2]_\5\34\17\2^]\3\2\2\2^_\3\2\2"+
		"\2_\t\3\2\2\2`b\5\22\n\2a`\3\2\2\2ab\3\2\2\2bg\3\2\2\2cd\7\3\2\2df\5\22"+
		"\n\2ec\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2hj\3\2\2\2ig\3\2\2\2jl\7\34"+
		"\2\2km\5\34\17\2lk\3\2\2\2lm\3\2\2\2mo\3\2\2\2np\5\16\b\2on\3\2\2\2op"+
		"\3\2\2\2px\3\2\2\2qs\7\35\2\2rt\5\34\17\2sr\3\2\2\2st\3\2\2\2tu\3\2\2"+
		"\2uw\5\16\b\2vq\3\2\2\2wz\3\2\2\2xy\3\2\2\2xv\3\2\2\2y{\3\2\2\2zx\3\2"+
		"\2\2{}\7\34\2\2|~\5\34\17\2}|\3\2\2\2}~\3\2\2\2~\u0080\3\2\2\2\177\u0081"+
		"\5\32\16\2\u0080\177\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0086\3\2\2\2\u0082"+
		"\u0083\7\3\2\2\u0083\u0085\5\32\16\2\u0084\u0082\3\2\2\2\u0085\u0088\3"+
		"\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u008a\3\2\2\2\u0088"+
		"\u0086\3\2\2\2\u0089\u008b\5\34\17\2\u008a\u0089\3\2\2\2\u008a\u008b\3"+
		"\2\2\2\u008b\13\3\2\2\2\u008c\u008e\7\b\2\2\u008d\u008f\5\34\17\2\u008e"+
		"\u008d\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0092\7\23"+
		"\2\2\u0091\u0093\5\34\17\2\u0092\u0091\3\2\2\2\u0092\u0093\3\2\2\2\u0093"+
		"\u0094\3\2\2\2\u0094\u009c\5\16\b\2\u0095\u0097\7\35\2\2\u0096\u0098\5"+
		"\34\17\2\u0097\u0096\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099\3\2\2\2\u0099"+
		"\u009b\5\16\b\2\u009a\u0095\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009d\3"+
		"\2\2\2\u009c\u009a\3\2\2\2\u009d\u009f\3\2\2\2\u009e\u009c\3\2\2\2\u009f"+
		"\u00a1\7\24\2\2\u00a0\u00a2\5\34\17\2\u00a1\u00a0\3\2\2\2\u00a1\u00a2"+
		"\3\2\2\2\u00a2\u00a4\3\2\2\2\u00a3\u00a5\7\34\2\2\u00a4\u00a3\3\2\2\2"+
		"\u00a4\u00a5\3\2\2\2\u00a5\u00a7\3\2\2\2\u00a6\u00a8\5\34\17\2\u00a7\u00a6"+
		"\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ab\7\t\2\2\u00aa"+
		"\u00ac\5\34\17\2\u00ab\u00aa\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\3"+
		"\2\2\2\u00ad\u00d0\5\6\4\2\u00ae\u00b0\7\n\2\2\u00af\u00b1\5\34\17\2\u00b0"+
		"\u00af\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b4\7\23"+
		"\2\2\u00b3\u00b5\5\34\17\2\u00b4\u00b3\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5"+
		"\u00b6\3\2\2\2\u00b6\u00bb\5\16\b\2\u00b7\u00b8\7\35\2\2\u00b8\u00ba\5"+
		"\16\b\2\u00b9\u00b7\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bb"+
		"\u00b9\3\2\2\2\u00bc\u00be\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00c0\7\24"+
		"\2\2\u00bf\u00c1\5\34\17\2\u00c0\u00bf\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1"+
		"\u00c3\3\2\2\2\u00c2\u00c4\7\34\2\2\u00c3\u00c2\3\2\2\2\u00c3\u00c4\3"+
		"\2\2\2\u00c4\u00c6\3\2\2\2\u00c5\u00c7\5\34\17\2\u00c6\u00c5\3\2\2\2\u00c6"+
		"\u00c7\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00ca\7\t\2\2\u00c9\u00cb\5\34"+
		"\17\2\u00ca\u00c9\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc"+
		"\u00cd\5\6\4\2\u00cd\u00cf\3\2\2\2\u00ce\u00ae\3\2\2\2\u00cf\u00d2\3\2"+
		"\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d3\3\2\2\2\u00d2"+
		"\u00d0\3\2\2\2\u00d3\u00d5\7\13\2\2\u00d4\u00d6\5\34\17\2\u00d5\u00d4"+
		"\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\5\6\4\2\u00d8"+
		"\u00da\7\f\2\2\u00d9\u00db\5\34\17\2\u00da\u00d9\3\2\2\2\u00da\u00db\3"+
		"\2\2\2\u00db\r\3\2\2\2\u00dc\u00de\5\34\17\2\u00dd\u00dc\3\2\2\2\u00dd"+
		"\u00de\3\2\2\2\u00de\u00e0\3\2\2\2\u00df\u00e1\t\2\2\2\u00e0\u00df\3\2"+
		"\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3"+
		"\u00e5\3\2\2\2\u00e4\u00e6\5\34\17\2\u00e5\u00e4\3\2\2\2\u00e5\u00e6\3"+
		"\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e9\7\37\2\2\u00e8\u00ea\5\34\17\2"+
		"\u00e9\u00e8\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00f2\3\2\2\2\u00eb\u00f3"+
		"\5\36\20\2\u00ec\u00f3\7\25\2\2\u00ed\u00f3\7\32\2\2\u00ee\u00f3\7 \2"+
		"\2\u00ef\u00f3\7\31\2\2\u00f0\u00f3\7\22\2\2\u00f1\u00f3\7 \2\2\u00f2"+
		"\u00eb\3\2\2\2\u00f2\u00ec\3\2\2\2\u00f2\u00ed\3\2\2\2\u00f2\u00ee\3\2"+
		"\2\2\u00f2\u00ef\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f1\3\2\2\2\u00f3"+
		"\u00f4\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f7\3\2"+
		"\2\2\u00f6\u00f8\5\34\17\2\u00f7\u00f6\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8"+
		"\17\3\2\2\2\u00f9\u00fb\7\21\2\2\u00fa\u00fc\5\34\17\2\u00fb\u00fa\3\2"+
		"\2\2\u00fb\u00fc\3\2\2\2\u00fc\u0100\3\2\2\2\u00fd\u00ff\5\26\f\2\u00fe"+
		"\u00fd\3\2\2\2\u00ff\u0102\3\2\2\2\u0100\u0101\3\2\2\2\u0100\u00fe\3\2"+
		"\2\2\u0101\u0104\3\2\2\2\u0102\u0100\3\2\2\2\u0103\u0105\7\34\2\2\u0104"+
		"\u0103\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0107\3\2\2\2\u0106\u0108\5\34"+
		"\17\2\u0107\u0106\3\2\2\2\u0107\u0108\3\2\2\2\u0108\21\3\2\2\2\u0109\u010a"+
		"\7\25\2\2\u010a\u0111\7\33\2\2\u010b\u0112\5\36\20\2\u010c\u0112\7\32"+
		"\2\2\u010d\u0112\7\25\2\2\u010e\u0112\7\31\2\2\u010f\u0112\7\22\2\2\u0110"+
		"\u0112\7 \2\2\u0111\u010b\3\2\2\2\u0111\u010c\3\2\2\2\u0111\u010d\3\2"+
		"\2\2\u0111\u010e\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0110\3\2\2\2\u0112"+
		"\u0113\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0116\3\2"+
		"\2\2\u0115\u0117\7\34\2\2\u0116\u0115\3\2\2\2\u0116\u0117\3\2\2\2\u0117"+
		"\u0119\3\2\2\2\u0118\u011a\5\34\17\2\u0119\u0118\3\2\2\2\u0119\u011a\3"+
		"\2\2\2\u011a\23\3\2\2\2\u011b\u011d\7\23\2\2\u011c\u011e\5\34\17\2\u011d"+
		"\u011c\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0121\7\25"+
		"\2\2\u0120\u0122\5\34\17\2\u0121\u0120\3\2\2\2\u0121\u0122\3\2\2\2\u0122"+
		"\u0123\3\2\2\2\u0123\u0125\t\3\2\2\u0124\u0126\5\34\17\2\u0125\u0124\3"+
		"\2\2\2\u0125\u0126\3\2\2\2\u0126\u012f\3\2\2\2\u0127\u012e\5\36\20\2\u0128"+
		"\u012e\7\32\2\2\u0129\u012e\7\25\2\2\u012a\u012e\7\31\2\2\u012b\u012e"+
		"\7\22\2\2\u012c\u012e\7 \2\2\u012d\u0127\3\2\2\2\u012d\u0128\3\2\2\2\u012d"+
		"\u0129\3\2\2\2\u012d\u012a\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012c\3\2"+
		"\2\2\u012e\u0131\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130"+
		"\u0133\3\2\2\2\u0131\u012f\3\2\2\2\u0132\u0134\5\34\17\2\u0133\u0132\3"+
		"\2\2\2\u0133\u0134\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0137\7\24\2\2\u0136"+
		"\u0138\7\34\2\2\u0137\u0136\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u013a\3"+
		"\2\2\2\u0139\u013b\5\34\17\2\u013a\u0139\3\2\2\2\u013a\u013b\3\2\2\2\u013b"+
		"\25\3\2\2\2\u013c\u0149\7\25\2\2\u013d\u0149\7\32\2\2\u013e\u0149\7 \2"+
		"\2\u013f\u0149\7\31\2\2\u0140\u0149\5\36\20\2\u0141\u0149\7\36\2\2\u0142"+
		"\u0149\7!\2\2\u0143\u0149\5\34\17\2\u0144\u0149\5 \21\2\u0145\u0149\7"+
		"\27\2\2\u0146\u0149\7\26\2\2\u0147\u0149\7\22\2\2\u0148\u013c\3\2\2\2"+
		"\u0148\u013d\3\2\2\2\u0148\u013e\3\2\2\2\u0148\u013f\3\2\2\2\u0148\u0140"+
		"\3\2\2\2\u0148\u0141\3\2\2\2\u0148\u0142\3\2\2\2\u0148\u0143\3\2\2\2\u0148"+
		"\u0144\3\2\2\2\u0148\u0145\3\2\2\2\u0148\u0146\3\2\2\2\u0148\u0147\3\2"+
		"\2\2\u0149\27\3\2\2\2\u014a\u014b\7\25\2\2\u014b\u014c\7\37\2\2\u014c"+
		"\u014d\7\32\2\2\u014d\31\3\2\2\2\u014e\u014f\7\25\2\2\u014f\u0155\7\36"+
		"\2\2\u0150\u0156\7 \2\2\u0151\u0156\7\25\2\2\u0152\u0156\7\32\2\2\u0153"+
		"\u0156\5\36\20\2\u0154\u0156\7\31\2\2\u0155\u0150\3\2\2\2\u0155\u0151"+
		"\3\2\2\2\u0155\u0152\3\2\2\2\u0155\u0153\3\2\2\2\u0155\u0154\3\2\2\2\u0155"+
		"\u0156\3\2\2\2\u0156\u015a\3\2\2\2\u0157\u0158\7\36\2\2\u0158\u015a\7"+
		"\25\2\2\u0159\u014e\3\2\2\2\u0159\u0157\3\2\2\2\u015a\33\3\2\2\2\u015b"+
		"\u015d\7\7\2\2\u015c\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u015c\3\2"+
		"\2\2\u015e\u015f\3\2\2\2\u015f\35\3\2\2\2\u0160\u0161\t\4\2\2\u0161\37"+
		"\3\2\2\2\u0162\u0163\t\5\2\2\u0163!\3\2\2\2\u0164\u0165\7\20\2\2\u0165"+
		"\u016c\5\34\17\2\u0166\u0168\5 \21\2\u0167\u0169\7\7\2\2\u0168\u0167\3"+
		"\2\2\2\u0168\u0169\3\2\2\2\u0169\u016b\3\2\2\2\u016a\u0166\3\2\2\2\u016b"+
		"\u016e\3\2\2\2\u016c\u016a\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u016f\3\2"+
		"\2\2\u016e\u016c\3\2\2\2\u016f\u0170\5\36\20\2\u0170\u0171\5\34\17\2\u0171"+
		"\u0172\t\6\2\2\u0172\u0176\5\34\17\2\u0173\u0175\7\37\2\2\u0174\u0173"+
		"\3\2\2\2\u0175\u0178\3\2\2\2\u0176\u0174\3\2\2\2\u0176\u0177\3\2\2\2\u0177"+
		"\u017c\3\2\2\2\u0178\u0176\3\2\2\2\u0179\u017b\7\7\2\2\u017a\u0179\3\2"+
		"\2\2\u017b\u017e\3\2\2\2\u017c\u017a\3\2\2\2\u017c\u017d\3\2\2\2\u017d"+
		"\u0182\3\2\2\2\u017e\u017c\3\2\2\2\u017f\u0181\t\6\2\2\u0180\u017f\3\2"+
		"\2\2\u0181\u0184\3\2\2\2\u0182\u0180\3\2\2\2\u0182\u0183\3\2\2\2\u0183"+
		"\u0185\3\2\2\2\u0184\u0182\3\2\2\2\u0185\u0189\7\37\2\2\u0186\u0188\7"+
		"\7\2\2\u0187\u0186\3\2\2\2\u0188\u018b\3\2\2\2\u0189\u0187\3\2\2\2\u0189"+
		"\u018a\3\2\2\2\u018a\u018c\3\2\2\2\u018b\u0189\3\2\2\2\u018c\u018e\t\6"+
		"\2\2\u018d\u018f\7\34\2\2\u018e\u018d\3\2\2\2\u018e\u018f\3\2\2\2\u018f"+
		"\u0191\3\2\2\2\u0190\u0192\5\34\17\2\u0191\u0190\3\2\2\2\u0191\u0192\3"+
		"\2\2\2\u0192#\3\2\2\2N\'\63\65<>BFJORUY^aglosx}\u0080\u0086\u008a\u008e"+
		"\u0092\u0097\u009c\u00a1\u00a4\u00a7\u00ab\u00b0\u00b4\u00bb\u00c0\u00c3"+
		"\u00c6\u00ca\u00d0\u00d5\u00da\u00dd\u00e2\u00e5\u00e9\u00f2\u00f4\u00f7"+
		"\u00fb\u0100\u0104\u0107\u0111\u0113\u0116\u0119\u011d\u0121\u0125\u012d"+
		"\u012f\u0133\u0137\u013a\u0148\u0155\u0159\u015e\u0168\u016c\u0176\u017c"+
		"\u0182\u0189\u018e\u0191";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}