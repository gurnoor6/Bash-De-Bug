// Generated from d:\IITB CSE\sem3\CS 251\main_project\Bash-De-Bug\parser\bashGrammar.g4 by ANTLR 4.8
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
		ELIF=8, ELSE=9, FI=10, FOR=11, DO=12, DONE=13, COMMAND=14, RHS_ASSIGNMENT=15, 
		OPEN_BRACKETS=16, CLOSE_BRACKETS=17, VAR=18, BASH_VAR=19, VAL=20, ASSIGN=21, 
		SEMICOLON=22, LOGICAL_OP=23, INCREMENT=24, COMPARE=25, BLOB=26, OTHER=27;
	public static final int
		RULE_code = 0, RULE_bashScript = 1, RULE_expressions = 2, RULE_for_loop = 3, 
		RULE_inside_for = 4, RULE_ifElse = 5, RULE_condition = 6, RULE_linux_command = 7, 
		RULE_assignment = 8, RULE_advanced_assignment = 9, RULE_command_data = 10, 
		RULE_comparison = 11, RULE_increment = 12, RULE_space = 13, RULE_string = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"code", "bashScript", "expressions", "for_loop", "inside_for", "ifElse", 
			"condition", "linux_command", "assignment", "advanced_assignment", "command_data", 
			"comparison", "increment", "space", "string"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", null, null, null, null, "'if'", "'then'", "'elif'", "'else'", 
			"'fi'", "'for'", "'do'", "'done'", null, null, null, null, null, null, 
			null, "'='", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "SINGLE_STRING", "DOUBLE_STRING", "COMMENT", "SPACE", "IF", 
			"THEN", "ELIF", "ELSE", "FI", "FOR", "DO", "DONE", "COMMAND", "RHS_ASSIGNMENT", 
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
	}

	public final CodeContext code() throws RecognitionException {
		CodeContext _localctx = new CodeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_code);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << IF) | (1L << FOR) | (1L << COMMAND) | (1L << OPEN_BRACKETS) | (1L << VAR))) != 0)) {
				{
				{
				setState(30);
				bashScript();
				}
				}
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(36);
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
		public BashScriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bashScript; }
	}

	public final BashScriptContext bashScript() throws RecognitionException {
		BashScriptContext _localctx = new BashScriptContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_bashScript);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(44); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(44);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case FOR:
						{
						setState(38);
						for_loop();
						}
						break;
					case VAR:
						{
						setState(39);
						assignment();
						}
						break;
					case COMMAND:
						{
						setState(40);
						linux_command();
						}
						break;
					case SPACE:
						{
						setState(41);
						space();
						}
						break;
					case OPEN_BRACKETS:
						{
						setState(42);
						advanced_assignment();
						}
						break;
					case IF:
						{
						setState(43);
						ifElse();
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
				setState(46); 
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
	}

	public final ExpressionsContext expressions() throws RecognitionException {
		ExpressionsContext _localctx = new ExpressionsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expressions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOR) | (1L << COMMAND) | (1L << OPEN_BRACKETS) | (1L << VAR))) != 0)) {
				{
				setState(53);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FOR:
					{
					setState(48);
					for_loop();
					}
					break;
				case VAR:
					{
					setState(49);
					assignment();
					}
					break;
				case COMMAND:
					{
					setState(50);
					linux_command();
					}
					break;
				case OPEN_BRACKETS:
					{
					setState(51);
					advanced_assignment();
					}
					break;
				case IF:
					{
					setState(52);
					ifElse();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(58);
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
	}

	public final For_loopContext for_loop() throws RecognitionException {
		For_loopContext _localctx = new For_loopContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_for_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(FOR);
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(62);
				space();
				}
			}

			setState(65);
			match(OPEN_BRACKETS);
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(66);
				space();
				}
			}

			setState(69);
			inside_for();
			setState(70);
			match(CLOSE_BRACKETS);
			setState(72);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(71);
				space();
				}
				break;
			}
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(74);
				match(SEMICOLON);
				}
			}

			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(77);
				space();
				}
			}

			setState(80);
			match(DO);
			setState(82);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(81);
				space();
				}
				break;
			}
			setState(84);
			expressions();
			setState(85);
			match(DONE);
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(86);
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
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(89);
				assignment();
				}
			}

			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(92);
				match(T__0);
				setState(93);
				assignment();
				}
				}
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(99);
			match(SEMICOLON);
			setState(101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(100);
				space();
				}
				break;
			}
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << VAR) | (1L << VAL) | (1L << BLOB))) != 0)) {
				{
				setState(103);
				condition();
				}
			}

			setState(113);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(106);
					match(LOGICAL_OP);
					setState(108);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						setState(107);
						space();
						}
						break;
					}
					setState(110);
					condition();
					}
					} 
				}
				setState(115);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			setState(116);
			match(SEMICOLON);
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(117);
				space();
				}
				break;
			}
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR || _la==INCREMENT) {
				{
				setState(120);
				increment();
				}
			}

			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(123);
				match(T__0);
				setState(124);
				increment();
				}
				}
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(130);
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
	}

	public final IfElseContext ifElse() throws RecognitionException {
		IfElseContext _localctx = new IfElseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ifElse);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(IF);
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(134);
				space();
				}
			}

			setState(137);
			match(OPEN_BRACKETS);
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(138);
				space();
				}
				break;
			}
			setState(141);
			condition();
			setState(149);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(142);
					match(LOGICAL_OP);
					setState(144);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						setState(143);
						space();
						}
						break;
					}
					setState(146);
					condition();
					}
					} 
				}
				setState(151);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			setState(152);
			match(CLOSE_BRACKETS);
			setState(154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(153);
				space();
				}
				break;
			}
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(156);
				match(SEMICOLON);
				}
			}

			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(159);
				space();
				}
			}

			setState(162);
			match(THEN);
			setState(164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(163);
				space();
				}
				break;
			}
			setState(166);
			expressions();
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELIF) {
				{
				{
				setState(167);
				match(ELIF);
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE) {
					{
					setState(168);
					space();
					}
				}

				setState(171);
				match(OPEN_BRACKETS);
				setState(173);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(172);
					space();
					}
					break;
				}
				setState(175);
				condition();
				setState(180);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(176);
						match(LOGICAL_OP);
						setState(177);
						condition();
						}
						} 
					}
					setState(182);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				}
				setState(183);
				match(CLOSE_BRACKETS);
				setState(185);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(184);
					space();
					}
					break;
				}
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(187);
					match(SEMICOLON);
					}
				}

				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE) {
					{
					setState(190);
					space();
					}
				}

				setState(193);
				match(THEN);
				setState(195);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(194);
					space();
					}
					break;
				}
				setState(197);
				expressions();
				}
				}
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(204);
			match(ELSE);
			setState(206);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(205);
				space();
				}
				break;
			}
			setState(208);
			expressions();
			setState(209);
			match(FI);
			setState(211);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(210);
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
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(213);
				space();
				}
			}

			setState(217); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(216);
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
				setState(219); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << VAL) | (1L << BLOB))) != 0) );
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(221);
				space();
				}
			}

			setState(224);
			match(COMPARE);
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(225);
				space();
				}
			}

			setState(235); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(235);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(228);
					string();
					}
					break;
				case 2:
					{
					setState(229);
					match(VAR);
					}
					break;
				case 3:
					{
					setState(230);
					match(VAL);
					}
					break;
				case 4:
					{
					setState(231);
					match(BLOB);
					}
					break;
				case 5:
					{
					setState(232);
					match(BASH_VAR);
					}
					break;
				case 6:
					{
					setState(233);
					match(RHS_ASSIGNMENT);
					}
					break;
				case 7:
					{
					setState(234);
					match(BLOB);
					}
					break;
				}
				}
				setState(237); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SINGLE_STRING) | (1L << DOUBLE_STRING) | (1L << RHS_ASSIGNMENT) | (1L << VAR) | (1L << BASH_VAR) | (1L << VAL) | (1L << BLOB))) != 0) );
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(239);
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
	}

	public final Linux_commandContext linux_command() throws RecognitionException {
		Linux_commandContext _localctx = new Linux_commandContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_linux_command);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(COMMAND);
			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(243);
				space();
				}
				break;
			}
			setState(249);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(246);
					command_data();
					}
					} 
				}
				setState(251);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			}
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(252);
				match(SEMICOLON);
				}
			}

			setState(256);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(255);
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
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_assignment);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(VAR);
			setState(259);
			match(ASSIGN);
			setState(266); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(266);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case SINGLE_STRING:
					case DOUBLE_STRING:
						{
						setState(260);
						string();
						}
						break;
					case VAL:
						{
						setState(261);
						match(VAL);
						}
						break;
					case VAR:
						{
						setState(262);
						match(VAR);
						}
						break;
					case BASH_VAR:
						{
						setState(263);
						match(BASH_VAR);
						}
						break;
					case RHS_ASSIGNMENT:
						{
						setState(264);
						match(RHS_ASSIGNMENT);
						}
						break;
					case BLOB:
						{
						setState(265);
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
				setState(268); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(271);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(270);
				match(SEMICOLON);
				}
				break;
			}
			setState(274);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(273);
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
	}

	public final Advanced_assignmentContext advanced_assignment() throws RecognitionException {
		Advanced_assignmentContext _localctx = new Advanced_assignmentContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_advanced_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(OPEN_BRACKETS);
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(277);
				space();
				}
			}

			setState(280);
			match(VAR);
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(281);
				space();
				}
			}

			setState(284);
			_la = _input.LA(1);
			if ( !(_la==ASSIGN || _la==INCREMENT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(286);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(285);
				space();
				}
				break;
			}
			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SINGLE_STRING) | (1L << DOUBLE_STRING) | (1L << RHS_ASSIGNMENT) | (1L << VAR) | (1L << BASH_VAR) | (1L << VAL) | (1L << BLOB))) != 0)) {
				{
				setState(294);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SINGLE_STRING:
				case DOUBLE_STRING:
					{
					setState(288);
					string();
					}
					break;
				case VAL:
					{
					setState(289);
					match(VAL);
					}
					break;
				case VAR:
					{
					setState(290);
					match(VAR);
					}
					break;
				case BASH_VAR:
					{
					setState(291);
					match(BASH_VAR);
					}
					break;
				case RHS_ASSIGNMENT:
					{
					setState(292);
					match(RHS_ASSIGNMENT);
					}
					break;
				case BLOB:
					{
					setState(293);
					match(BLOB);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(298);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(299);
				space();
				}
			}

			setState(302);
			match(CLOSE_BRACKETS);
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(303);
				match(SEMICOLON);
				}
			}

			setState(307);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				{
				setState(306);
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
		public Command_dataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command_data; }
	}

	public final Command_dataContext command_data() throws RecognitionException {
		Command_dataContext _localctx = new Command_dataContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_command_data);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				{
				setState(309);
				match(VAR);
				}
				break;
			case VAL:
				{
				setState(310);
				match(VAL);
				}
				break;
			case BLOB:
				{
				setState(311);
				match(BLOB);
				}
				break;
			case BASH_VAR:
				{
				setState(312);
				match(BASH_VAR);
				}
				break;
			case SINGLE_STRING:
			case DOUBLE_STRING:
				{
				setState(313);
				string();
				}
				break;
			case INCREMENT:
				{
				setState(314);
				match(INCREMENT);
				}
				break;
			case OTHER:
				{
				setState(315);
				match(OTHER);
				}
				break;
			case SPACE:
				{
				setState(316);
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
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_comparison);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			match(VAR);
			setState(320);
			match(COMPARE);
			setState(321);
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
	}

	public final IncrementContext increment() throws RecognitionException {
		IncrementContext _localctx = new IncrementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_increment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				{
				setState(323);
				match(VAR);
				setState(324);
				match(INCREMENT);
				setState(330);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BLOB:
					{
					setState(325);
					match(BLOB);
					}
					break;
				case VAR:
					{
					setState(326);
					match(VAR);
					}
					break;
				case VAL:
					{
					setState(327);
					match(VAL);
					}
					break;
				case SINGLE_STRING:
				case DOUBLE_STRING:
					{
					setState(328);
					string();
					}
					break;
				case BASH_VAR:
					{
					setState(329);
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
				setState(332);
				match(INCREMENT);
				setState(333);
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
	}

	public final SpaceContext space() throws RecognitionException {
		SpaceContext _localctx = new SpaceContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_space);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(337); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(336);
					match(SPACE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(339); 
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
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\35\u015a\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\7\2\"\n\2\f\2"+
		"\16\2%\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\6\3/\n\3\r\3\16\3\60\3\4\3"+
		"\4\3\4\3\4\3\4\7\48\n\4\f\4\16\4;\13\4\3\4\5\4>\n\4\3\5\3\5\5\5B\n\5\3"+
		"\5\3\5\5\5F\n\5\3\5\3\5\3\5\5\5K\n\5\3\5\5\5N\n\5\3\5\5\5Q\n\5\3\5\3\5"+
		"\5\5U\n\5\3\5\3\5\3\5\5\5Z\n\5\3\6\5\6]\n\6\3\6\3\6\7\6a\n\6\f\6\16\6"+
		"d\13\6\3\6\3\6\5\6h\n\6\3\6\5\6k\n\6\3\6\3\6\5\6o\n\6\3\6\7\6r\n\6\f\6"+
		"\16\6u\13\6\3\6\3\6\5\6y\n\6\3\6\5\6|\n\6\3\6\3\6\7\6\u0080\n\6\f\6\16"+
		"\6\u0083\13\6\3\6\5\6\u0086\n\6\3\7\3\7\5\7\u008a\n\7\3\7\3\7\5\7\u008e"+
		"\n\7\3\7\3\7\3\7\5\7\u0093\n\7\3\7\7\7\u0096\n\7\f\7\16\7\u0099\13\7\3"+
		"\7\3\7\5\7\u009d\n\7\3\7\5\7\u00a0\n\7\3\7\5\7\u00a3\n\7\3\7\3\7\5\7\u00a7"+
		"\n\7\3\7\3\7\3\7\5\7\u00ac\n\7\3\7\3\7\5\7\u00b0\n\7\3\7\3\7\3\7\7\7\u00b5"+
		"\n\7\f\7\16\7\u00b8\13\7\3\7\3\7\5\7\u00bc\n\7\3\7\5\7\u00bf\n\7\3\7\5"+
		"\7\u00c2\n\7\3\7\3\7\5\7\u00c6\n\7\3\7\3\7\7\7\u00ca\n\7\f\7\16\7\u00cd"+
		"\13\7\3\7\3\7\5\7\u00d1\n\7\3\7\3\7\3\7\5\7\u00d6\n\7\3\b\5\b\u00d9\n"+
		"\b\3\b\6\b\u00dc\n\b\r\b\16\b\u00dd\3\b\5\b\u00e1\n\b\3\b\3\b\5\b\u00e5"+
		"\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\6\b\u00ee\n\b\r\b\16\b\u00ef\3\b\5\b"+
		"\u00f3\n\b\3\t\3\t\5\t\u00f7\n\t\3\t\7\t\u00fa\n\t\f\t\16\t\u00fd\13\t"+
		"\3\t\5\t\u0100\n\t\3\t\5\t\u0103\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\6"+
		"\n\u010d\n\n\r\n\16\n\u010e\3\n\5\n\u0112\n\n\3\n\5\n\u0115\n\n\3\13\3"+
		"\13\5\13\u0119\n\13\3\13\3\13\5\13\u011d\n\13\3\13\3\13\5\13\u0121\n\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u0129\n\13\f\13\16\13\u012c\13\13"+
		"\3\13\5\13\u012f\n\13\3\13\3\13\5\13\u0133\n\13\3\13\5\13\u0136\n\13\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0140\n\f\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\5\16\u014d\n\16\3\16\3\16\5\16\u0151\n\16\3"+
		"\17\6\17\u0154\n\17\r\17\16\17\u0155\3\20\3\20\3\20\6s\u0097\u00b6\u00fb"+
		"\2\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\5\5\2\24\24\26\26\34\34"+
		"\4\2\27\27\32\32\3\2\4\5\2\u01ac\2#\3\2\2\2\4.\3\2\2\2\69\3\2\2\2\b?\3"+
		"\2\2\2\n\\\3\2\2\2\f\u0087\3\2\2\2\16\u00d8\3\2\2\2\20\u00f4\3\2\2\2\22"+
		"\u0104\3\2\2\2\24\u0116\3\2\2\2\26\u013f\3\2\2\2\30\u0141\3\2\2\2\32\u0150"+
		"\3\2\2\2\34\u0153\3\2\2\2\36\u0157\3\2\2\2 \"\5\4\3\2! \3\2\2\2\"%\3\2"+
		"\2\2#!\3\2\2\2#$\3\2\2\2$&\3\2\2\2%#\3\2\2\2&\'\7\2\2\3\'\3\3\2\2\2(/"+
		"\5\b\5\2)/\5\22\n\2*/\5\20\t\2+/\5\34\17\2,/\5\24\13\2-/\5\f\7\2.(\3\2"+
		"\2\2.)\3\2\2\2.*\3\2\2\2.+\3\2\2\2.,\3\2\2\2.-\3\2\2\2/\60\3\2\2\2\60"+
		".\3\2\2\2\60\61\3\2\2\2\61\5\3\2\2\2\628\5\b\5\2\638\5\22\n\2\648\5\20"+
		"\t\2\658\5\24\13\2\668\5\f\7\2\67\62\3\2\2\2\67\63\3\2\2\2\67\64\3\2\2"+
		"\2\67\65\3\2\2\2\67\66\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:=\3\2\2"+
		"\2;9\3\2\2\2<>\5\34\17\2=<\3\2\2\2=>\3\2\2\2>\7\3\2\2\2?A\7\r\2\2@B\5"+
		"\34\17\2A@\3\2\2\2AB\3\2\2\2BC\3\2\2\2CE\7\22\2\2DF\5\34\17\2ED\3\2\2"+
		"\2EF\3\2\2\2FG\3\2\2\2GH\5\n\6\2HJ\7\23\2\2IK\5\34\17\2JI\3\2\2\2JK\3"+
		"\2\2\2KM\3\2\2\2LN\7\30\2\2ML\3\2\2\2MN\3\2\2\2NP\3\2\2\2OQ\5\34\17\2"+
		"PO\3\2\2\2PQ\3\2\2\2QR\3\2\2\2RT\7\16\2\2SU\5\34\17\2TS\3\2\2\2TU\3\2"+
		"\2\2UV\3\2\2\2VW\5\6\4\2WY\7\17\2\2XZ\5\34\17\2YX\3\2\2\2YZ\3\2\2\2Z\t"+
		"\3\2\2\2[]\5\22\n\2\\[\3\2\2\2\\]\3\2\2\2]b\3\2\2\2^_\7\3\2\2_a\5\22\n"+
		"\2`^\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2ce\3\2\2\2db\3\2\2\2eg\7\30"+
		"\2\2fh\5\34\17\2gf\3\2\2\2gh\3\2\2\2hj\3\2\2\2ik\5\16\b\2ji\3\2\2\2jk"+
		"\3\2\2\2ks\3\2\2\2ln\7\31\2\2mo\5\34\17\2nm\3\2\2\2no\3\2\2\2op\3\2\2"+
		"\2pr\5\16\b\2ql\3\2\2\2ru\3\2\2\2st\3\2\2\2sq\3\2\2\2tv\3\2\2\2us\3\2"+
		"\2\2vx\7\30\2\2wy\5\34\17\2xw\3\2\2\2xy\3\2\2\2y{\3\2\2\2z|\5\32\16\2"+
		"{z\3\2\2\2{|\3\2\2\2|\u0081\3\2\2\2}~\7\3\2\2~\u0080\5\32\16\2\177}\3"+
		"\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082"+
		"\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0086\5\34\17\2\u0085\u0084\3"+
		"\2\2\2\u0085\u0086\3\2\2\2\u0086\13\3\2\2\2\u0087\u0089\7\b\2\2\u0088"+
		"\u008a\5\34\17\2\u0089\u0088\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b\3"+
		"\2\2\2\u008b\u008d\7\22\2\2\u008c\u008e\5\34\17\2\u008d\u008c\3\2\2\2"+
		"\u008d\u008e\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0097\5\16\b\2\u0090\u0092"+
		"\7\31\2\2\u0091\u0093\5\34\17\2\u0092\u0091\3\2\2\2\u0092\u0093\3\2\2"+
		"\2\u0093\u0094\3\2\2\2\u0094\u0096\5\16\b\2\u0095\u0090\3\2\2\2\u0096"+
		"\u0099\3\2\2\2\u0097\u0098\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u009a\3\2"+
		"\2\2\u0099\u0097\3\2\2\2\u009a\u009c\7\23\2\2\u009b\u009d\5\34\17\2\u009c"+
		"\u009b\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009f\3\2\2\2\u009e\u00a0\7\30"+
		"\2\2\u009f\u009e\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a2\3\2\2\2\u00a1"+
		"\u00a3\5\34\17\2\u00a2\u00a1\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\3"+
		"\2\2\2\u00a4\u00a6\7\t\2\2\u00a5\u00a7\5\34\17\2\u00a6\u00a5\3\2\2\2\u00a6"+
		"\u00a7\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00cb\5\6\4\2\u00a9\u00ab\7\n"+
		"\2\2\u00aa\u00ac\5\34\17\2\u00ab\u00aa\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac"+
		"\u00ad\3\2\2\2\u00ad\u00af\7\22\2\2\u00ae\u00b0\5\34\17\2\u00af\u00ae"+
		"\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b6\5\16\b\2"+
		"\u00b2\u00b3\7\31\2\2\u00b3\u00b5\5\16\b\2\u00b4\u00b2\3\2\2\2\u00b5\u00b8"+
		"\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00b9\3\2\2\2\u00b8"+
		"\u00b6\3\2\2\2\u00b9\u00bb\7\23\2\2\u00ba\u00bc\5\34\17\2\u00bb\u00ba"+
		"\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00be\3\2\2\2\u00bd\u00bf\7\30\2\2"+
		"\u00be\u00bd\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c1\3\2\2\2\u00c0\u00c2"+
		"\5\34\17\2\u00c1\u00c0\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\3\2\2\2"+
		"\u00c3\u00c5\7\t\2\2\u00c4\u00c6\5\34\17\2\u00c5\u00c4\3\2\2\2\u00c5\u00c6"+
		"\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\5\6\4\2\u00c8\u00ca\3\2\2\2\u00c9"+
		"\u00a9\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2"+
		"\2\2\u00cc\u00ce\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00d0\7\13\2\2\u00cf"+
		"\u00d1\5\34\17\2\u00d0\u00cf\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\3"+
		"\2\2\2\u00d2\u00d3\5\6\4\2\u00d3\u00d5\7\f\2\2\u00d4\u00d6\5\34\17\2\u00d5"+
		"\u00d4\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\r\3\2\2\2\u00d7\u00d9\5\34\17"+
		"\2\u00d8\u00d7\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00db\3\2\2\2\u00da\u00dc"+
		"\t\2\2\2\u00db\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd"+
		"\u00de\3\2\2\2\u00de\u00e0\3\2\2\2\u00df\u00e1\5\34\17\2\u00e0\u00df\3"+
		"\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e4\7\33\2\2\u00e3"+
		"\u00e5\5\34\17\2\u00e4\u00e3\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00ed\3"+
		"\2\2\2\u00e6\u00ee\5\36\20\2\u00e7\u00ee\7\24\2\2\u00e8\u00ee\7\26\2\2"+
		"\u00e9\u00ee\7\34\2\2\u00ea\u00ee\7\25\2\2\u00eb\u00ee\7\21\2\2\u00ec"+
		"\u00ee\7\34\2\2\u00ed\u00e6\3\2\2\2\u00ed\u00e7\3\2\2\2\u00ed\u00e8\3"+
		"\2\2\2\u00ed\u00e9\3\2\2\2\u00ed\u00ea\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed"+
		"\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2"+
		"\2\2\u00f0\u00f2\3\2\2\2\u00f1\u00f3\5\34\17\2\u00f2\u00f1\3\2\2\2\u00f2"+
		"\u00f3\3\2\2\2\u00f3\17\3\2\2\2\u00f4\u00f6\7\20\2\2\u00f5\u00f7\5\34"+
		"\17\2\u00f6\u00f5\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00fb\3\2\2\2\u00f8"+
		"\u00fa\5\26\f\2\u00f9\u00f8\3\2\2\2\u00fa\u00fd\3\2\2\2\u00fb\u00fc\3"+
		"\2\2\2\u00fb\u00f9\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fe"+
		"\u0100\7\30\2\2\u00ff\u00fe\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0102\3"+
		"\2\2\2\u0101\u0103\5\34\17\2\u0102\u0101\3\2\2\2\u0102\u0103\3\2\2\2\u0103"+
		"\21\3\2\2\2\u0104\u0105\7\24\2\2\u0105\u010c\7\27\2\2\u0106\u010d\5\36"+
		"\20\2\u0107\u010d\7\26\2\2\u0108\u010d\7\24\2\2\u0109\u010d\7\25\2\2\u010a"+
		"\u010d\7\21\2\2\u010b\u010d\7\34\2\2\u010c\u0106\3\2\2\2\u010c\u0107\3"+
		"\2\2\2\u010c\u0108\3\2\2\2\u010c\u0109\3\2\2\2\u010c\u010a\3\2\2\2\u010c"+
		"\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2"+
		"\2\2\u010f\u0111\3\2\2\2\u0110\u0112\7\30\2\2\u0111\u0110\3\2\2\2\u0111"+
		"\u0112\3\2\2\2\u0112\u0114\3\2\2\2\u0113\u0115\5\34\17\2\u0114\u0113\3"+
		"\2\2\2\u0114\u0115\3\2\2\2\u0115\23\3\2\2\2\u0116\u0118\7\22\2\2\u0117"+
		"\u0119\5\34\17\2\u0118\u0117\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011a\3"+
		"\2\2\2\u011a\u011c\7\24\2\2\u011b\u011d\5\34\17\2\u011c\u011b\3\2\2\2"+
		"\u011c\u011d\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u0120\t\3\2\2\u011f\u0121"+
		"\5\34\17\2\u0120\u011f\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u012a\3\2\2\2"+
		"\u0122\u0129\5\36\20\2\u0123\u0129\7\26\2\2\u0124\u0129\7\24\2\2\u0125"+
		"\u0129\7\25\2\2\u0126\u0129\7\21\2\2\u0127\u0129\7\34\2\2\u0128\u0122"+
		"\3\2\2\2\u0128\u0123\3\2\2\2\u0128\u0124\3\2\2\2\u0128\u0125\3\2\2\2\u0128"+
		"\u0126\3\2\2\2\u0128\u0127\3\2\2\2\u0129\u012c\3\2\2\2\u012a\u0128\3\2"+
		"\2\2\u012a\u012b\3\2\2\2\u012b\u012e\3\2\2\2\u012c\u012a\3\2\2\2\u012d"+
		"\u012f\5\34\17\2\u012e\u012d\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0130\3"+
		"\2\2\2\u0130\u0132\7\23\2\2\u0131\u0133\7\30\2\2\u0132\u0131\3\2\2\2\u0132"+
		"\u0133\3\2\2\2\u0133\u0135\3\2\2\2\u0134\u0136\5\34\17\2\u0135\u0134\3"+
		"\2\2\2\u0135\u0136\3\2\2\2\u0136\25\3\2\2\2\u0137\u0140\7\24\2\2\u0138"+
		"\u0140\7\26\2\2\u0139\u0140\7\34\2\2\u013a\u0140\7\25\2\2\u013b\u0140"+
		"\5\36\20\2\u013c\u0140\7\32\2\2\u013d\u0140\7\35\2\2\u013e\u0140\5\34"+
		"\17\2\u013f\u0137\3\2\2\2\u013f\u0138\3\2\2\2\u013f\u0139\3\2\2\2\u013f"+
		"\u013a\3\2\2\2\u013f\u013b\3\2\2\2\u013f\u013c\3\2\2\2\u013f\u013d\3\2"+
		"\2\2\u013f\u013e\3\2\2\2\u0140\27\3\2\2\2\u0141\u0142\7\24\2\2\u0142\u0143"+
		"\7\33\2\2\u0143\u0144\7\26\2\2\u0144\31\3\2\2\2\u0145\u0146\7\24\2\2\u0146"+
		"\u014c\7\32\2\2\u0147\u014d\7\34\2\2\u0148\u014d\7\24\2\2\u0149\u014d"+
		"\7\26\2\2\u014a\u014d\5\36\20\2\u014b\u014d\7\25\2\2\u014c\u0147\3\2\2"+
		"\2\u014c\u0148\3\2\2\2\u014c\u0149\3\2\2\2\u014c\u014a\3\2\2\2\u014c\u014b"+
		"\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u0151\3\2\2\2\u014e\u014f\7\32\2\2"+
		"\u014f\u0151\7\24\2\2\u0150\u0145\3\2\2\2\u0150\u014e\3\2\2\2\u0151\33"+
		"\3\2\2\2\u0152\u0154\7\7\2\2\u0153\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155"+
		"\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156\35\3\2\2\2\u0157\u0158\t\4\2"+
		"\2\u0158\37\3\2\2\2F#.\60\679=AEJMPTY\\bgjnsx{\u0081\u0085\u0089\u008d"+
		"\u0092\u0097\u009c\u009f\u00a2\u00a6\u00ab\u00af\u00b6\u00bb\u00be\u00c1"+
		"\u00c5\u00cb\u00d0\u00d5\u00d8\u00dd\u00e0\u00e4\u00ed\u00ef\u00f2\u00f6"+
		"\u00fb\u00ff\u0102\u010c\u010e\u0111\u0114\u0118\u011c\u0120\u0128\u012a"+
		"\u012e\u0132\u0135\u013f\u014c\u0150\u0155";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}