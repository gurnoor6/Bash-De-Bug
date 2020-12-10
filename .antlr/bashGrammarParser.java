// Generated from d:\IITB CSE\sem3\CS 251\main_project\Bash-De-Bug\bashGrammar.g4 by ANTLR 4.8
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
			setState(66);
			inside_for();
			setState(67);
			match(CLOSE_BRACKETS);
			setState(69);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(68);
				space();
				}
				break;
			}
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(71);
				match(SEMICOLON);
				}
			}

			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(74);
				space();
				}
			}

			setState(77);
			match(DO);
			setState(79);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(78);
				space();
				}
				break;
			}
			setState(81);
			expressions();
			setState(82);
			match(DONE);
			setState(84);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(83);
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
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(86);
				assignment();
				}
			}

			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(89);
				match(T__0);
				setState(90);
				assignment();
				}
				}
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(96);
			match(SEMICOLON);
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(97);
				space();
				}
				break;
			}
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << VAR) | (1L << VAL) | (1L << BLOB))) != 0)) {
				{
				setState(100);
				condition();
				}
			}

			setState(110);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(103);
					match(LOGICAL_OP);
					setState(105);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						setState(104);
						space();
						}
						break;
					}
					setState(107);
					condition();
					}
					} 
				}
				setState(112);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			setState(113);
			match(SEMICOLON);
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(114);
				space();
				}
				break;
			}
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR || _la==INCREMENT) {
				{
				setState(117);
				increment();
				}
			}

			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(120);
				match(T__0);
				setState(121);
				increment();
				}
				}
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(127);
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
			setState(130);
			match(IF);
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(131);
				space();
				}
			}

			setState(134);
			match(OPEN_BRACKETS);
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(135);
				space();
				}
				break;
			}
			setState(138);
			condition();
			setState(146);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(139);
					match(LOGICAL_OP);
					setState(141);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						setState(140);
						space();
						}
						break;
					}
					setState(143);
					condition();
					}
					} 
				}
				setState(148);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			setState(149);
			match(CLOSE_BRACKETS);
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(150);
				space();
				}
				break;
			}
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(153);
				match(SEMICOLON);
				}
			}

			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(156);
				space();
				}
			}

			setState(159);
			match(THEN);
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(160);
				space();
				}
				break;
			}
			setState(163);
			expressions();
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELIF) {
				{
				{
				setState(164);
				match(ELIF);
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE) {
					{
					setState(165);
					space();
					}
				}

				setState(168);
				match(OPEN_BRACKETS);
				setState(170);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(169);
					space();
					}
					break;
				}
				setState(172);
				condition();
				setState(177);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(173);
						match(LOGICAL_OP);
						setState(174);
						condition();
						}
						} 
					}
					setState(179);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				}
				setState(180);
				match(CLOSE_BRACKETS);
				setState(182);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(181);
					space();
					}
					break;
				}
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(184);
					match(SEMICOLON);
					}
				}

				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE) {
					{
					setState(187);
					space();
					}
				}

				setState(190);
				match(THEN);
				setState(192);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(191);
					space();
					}
					break;
				}
				setState(194);
				expressions();
				}
				}
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(201);
			match(ELSE);
			setState(203);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(202);
				space();
				}
				break;
			}
			setState(205);
			expressions();
			setState(206);
			match(FI);
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(207);
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
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(210);
				space();
				}
			}

			setState(214); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(213);
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
				setState(216); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << VAL) | (1L << BLOB))) != 0) );
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(218);
				space();
				}
			}

			setState(221);
			match(COMPARE);
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(222);
				space();
				}
			}

			setState(232); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(232);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(225);
					string();
					}
					break;
				case 2:
					{
					setState(226);
					match(VAR);
					}
					break;
				case 3:
					{
					setState(227);
					match(VAL);
					}
					break;
				case 4:
					{
					setState(228);
					match(BLOB);
					}
					break;
				case 5:
					{
					setState(229);
					match(BASH_VAR);
					}
					break;
				case 6:
					{
					setState(230);
					match(RHS_ASSIGNMENT);
					}
					break;
				case 7:
					{
					setState(231);
					match(BLOB);
					}
					break;
				}
				}
				setState(234); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SINGLE_STRING) | (1L << DOUBLE_STRING) | (1L << RHS_ASSIGNMENT) | (1L << VAR) | (1L << BASH_VAR) | (1L << VAL) | (1L << BLOB))) != 0) );
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(236);
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
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
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
			setState(239);
			match(COMMAND);
			setState(241);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(240);
				space();
				}
				break;
			}
			setState(250);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					setState(248);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case VAR:
						{
						setState(243);
						match(VAR);
						}
						break;
					case VAL:
						{
						setState(244);
						match(VAL);
						}
						break;
					case BLOB:
						{
						setState(245);
						match(BLOB);
						}
						break;
					case BASH_VAR:
						{
						setState(246);
						match(BASH_VAR);
						}
						break;
					case SINGLE_STRING:
					case DOUBLE_STRING:
						{
						setState(247);
						string();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(252);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			}
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(253);
				match(SEMICOLON);
				}
			}

			setState(257);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(256);
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
			setState(259);
			match(VAR);
			setState(260);
			match(ASSIGN);
			setState(267); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(267);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case SINGLE_STRING:
					case DOUBLE_STRING:
						{
						setState(261);
						string();
						}
						break;
					case VAL:
						{
						setState(262);
						match(VAL);
						}
						break;
					case VAR:
						{
						setState(263);
						match(VAR);
						}
						break;
					case BASH_VAR:
						{
						setState(264);
						match(BASH_VAR);
						}
						break;
					case RHS_ASSIGNMENT:
						{
						setState(265);
						match(RHS_ASSIGNMENT);
						}
						break;
					case BLOB:
						{
						setState(266);
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
				setState(269); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(272);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(271);
				match(SEMICOLON);
				}
				break;
			}
			setState(275);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(274);
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
			setState(277);
			match(OPEN_BRACKETS);
			setState(279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(278);
				space();
				}
			}

			setState(281);
			match(VAR);
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
			_la = _input.LA(1);
			if ( !(_la==ASSIGN || _la==INCREMENT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(286);
				space();
				}
			}

			setState(295); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(295);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SINGLE_STRING:
				case DOUBLE_STRING:
					{
					setState(289);
					string();
					}
					break;
				case VAL:
					{
					setState(290);
					match(VAL);
					}
					break;
				case VAR:
					{
					setState(291);
					match(VAR);
					}
					break;
				case BASH_VAR:
					{
					setState(292);
					match(BASH_VAR);
					}
					break;
				case RHS_ASSIGNMENT:
					{
					setState(293);
					match(RHS_ASSIGNMENT);
					}
					break;
				case BLOB:
					{
					setState(294);
					match(BLOB);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(297); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SINGLE_STRING) | (1L << DOUBLE_STRING) | (1L << RHS_ASSIGNMENT) | (1L << VAR) | (1L << BASH_VAR) | (1L << VAL) | (1L << BLOB))) != 0) );
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
		public TerminalNode BLOB() { return getToken(bashGrammarParser.BLOB, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode BASH_VAR() { return getToken(bashGrammarParser.BASH_VAR, 0); }
		public TerminalNode VAR() { return getToken(bashGrammarParser.VAR, 0); }
		public TerminalNode VAL() { return getToken(bashGrammarParser.VAL, 0); }
		public SpaceContext space() {
			return getRuleContext(SpaceContext.class,0);
		}
		public TerminalNode OTHER() { return getToken(bashGrammarParser.OTHER, 0); }
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
			setState(316);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BLOB:
				{
				setState(309);
				match(BLOB);
				}
				break;
			case SINGLE_STRING:
			case DOUBLE_STRING:
				{
				setState(310);
				string();
				}
				break;
			case BASH_VAR:
				{
				setState(311);
				match(BASH_VAR);
				}
				break;
			case VAR:
				{
				setState(312);
				match(VAR);
				}
				break;
			case VAL:
				{
				setState(313);
				match(VAL);
				}
				break;
			case SPACE:
				{
				setState(314);
				space();
				}
				break;
			case OTHER:
				{
				setState(315);
				match(OTHER);
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
			setState(318);
			match(VAR);
			setState(319);
			match(COMPARE);
			setState(320);
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
			setState(333);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				{
				setState(322);
				match(VAR);
				setState(323);
				match(INCREMENT);
				setState(329);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BLOB:
					{
					setState(324);
					match(BLOB);
					}
					break;
				case VAR:
					{
					setState(325);
					match(VAR);
					}
					break;
				case VAL:
					{
					setState(326);
					match(VAL);
					}
					break;
				case SINGLE_STRING:
				case DOUBLE_STRING:
					{
					setState(327);
					string();
					}
					break;
				case BASH_VAR:
					{
					setState(328);
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
				setState(331);
				match(INCREMENT);
				setState(332);
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
			setState(336); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(335);
					match(SPACE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(338); 
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
			setState(340);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\35\u0159\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\7\2\"\n\2\f\2"+
		"\16\2%\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\6\3/\n\3\r\3\16\3\60\3\4\3"+
		"\4\3\4\3\4\3\4\7\48\n\4\f\4\16\4;\13\4\3\4\5\4>\n\4\3\5\3\5\5\5B\n\5\3"+
		"\5\3\5\3\5\3\5\5\5H\n\5\3\5\5\5K\n\5\3\5\5\5N\n\5\3\5\3\5\5\5R\n\5\3\5"+
		"\3\5\3\5\5\5W\n\5\3\6\5\6Z\n\6\3\6\3\6\7\6^\n\6\f\6\16\6a\13\6\3\6\3\6"+
		"\5\6e\n\6\3\6\5\6h\n\6\3\6\3\6\5\6l\n\6\3\6\7\6o\n\6\f\6\16\6r\13\6\3"+
		"\6\3\6\5\6v\n\6\3\6\5\6y\n\6\3\6\3\6\7\6}\n\6\f\6\16\6\u0080\13\6\3\6"+
		"\5\6\u0083\n\6\3\7\3\7\5\7\u0087\n\7\3\7\3\7\5\7\u008b\n\7\3\7\3\7\3\7"+
		"\5\7\u0090\n\7\3\7\7\7\u0093\n\7\f\7\16\7\u0096\13\7\3\7\3\7\5\7\u009a"+
		"\n\7\3\7\5\7\u009d\n\7\3\7\5\7\u00a0\n\7\3\7\3\7\5\7\u00a4\n\7\3\7\3\7"+
		"\3\7\5\7\u00a9\n\7\3\7\3\7\5\7\u00ad\n\7\3\7\3\7\3\7\7\7\u00b2\n\7\f\7"+
		"\16\7\u00b5\13\7\3\7\3\7\5\7\u00b9\n\7\3\7\5\7\u00bc\n\7\3\7\5\7\u00bf"+
		"\n\7\3\7\3\7\5\7\u00c3\n\7\3\7\3\7\7\7\u00c7\n\7\f\7\16\7\u00ca\13\7\3"+
		"\7\3\7\5\7\u00ce\n\7\3\7\3\7\3\7\5\7\u00d3\n\7\3\b\5\b\u00d6\n\b\3\b\6"+
		"\b\u00d9\n\b\r\b\16\b\u00da\3\b\5\b\u00de\n\b\3\b\3\b\5\b\u00e2\n\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\6\b\u00eb\n\b\r\b\16\b\u00ec\3\b\5\b\u00f0"+
		"\n\b\3\t\3\t\5\t\u00f4\n\t\3\t\3\t\3\t\3\t\3\t\7\t\u00fb\n\t\f\t\16\t"+
		"\u00fe\13\t\3\t\5\t\u0101\n\t\3\t\5\t\u0104\n\t\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\6\n\u010e\n\n\r\n\16\n\u010f\3\n\5\n\u0113\n\n\3\n\5\n\u0116"+
		"\n\n\3\13\3\13\5\13\u011a\n\13\3\13\3\13\5\13\u011e\n\13\3\13\3\13\5\13"+
		"\u0122\n\13\3\13\3\13\3\13\3\13\3\13\3\13\6\13\u012a\n\13\r\13\16\13\u012b"+
		"\3\13\5\13\u012f\n\13\3\13\3\13\5\13\u0133\n\13\3\13\5\13\u0136\n\13\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u013f\n\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\5\16\u014c\n\16\3\16\3\16\5\16\u0150\n\16\3\17\6"+
		"\17\u0153\n\17\r\17\16\17\u0154\3\20\3\20\3\20\6p\u0094\u00b3\u00fc\2"+
		"\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\5\5\2\24\24\26\26\34\34\4"+
		"\2\27\27\32\32\3\2\4\5\2\u01ad\2#\3\2\2\2\4.\3\2\2\2\69\3\2\2\2\b?\3\2"+
		"\2\2\nY\3\2\2\2\f\u0084\3\2\2\2\16\u00d5\3\2\2\2\20\u00f1\3\2\2\2\22\u0105"+
		"\3\2\2\2\24\u0117\3\2\2\2\26\u013e\3\2\2\2\30\u0140\3\2\2\2\32\u014f\3"+
		"\2\2\2\34\u0152\3\2\2\2\36\u0156\3\2\2\2 \"\5\4\3\2! \3\2\2\2\"%\3\2\2"+
		"\2#!\3\2\2\2#$\3\2\2\2$&\3\2\2\2%#\3\2\2\2&\'\7\2\2\3\'\3\3\2\2\2(/\5"+
		"\b\5\2)/\5\22\n\2*/\5\20\t\2+/\5\34\17\2,/\5\24\13\2-/\5\f\7\2.(\3\2\2"+
		"\2.)\3\2\2\2.*\3\2\2\2.+\3\2\2\2.,\3\2\2\2.-\3\2\2\2/\60\3\2\2\2\60.\3"+
		"\2\2\2\60\61\3\2\2\2\61\5\3\2\2\2\628\5\b\5\2\638\5\22\n\2\648\5\20\t"+
		"\2\658\5\24\13\2\668\5\f\7\2\67\62\3\2\2\2\67\63\3\2\2\2\67\64\3\2\2\2"+
		"\67\65\3\2\2\2\67\66\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:=\3\2\2\2"+
		";9\3\2\2\2<>\5\34\17\2=<\3\2\2\2=>\3\2\2\2>\7\3\2\2\2?A\7\r\2\2@B\5\34"+
		"\17\2A@\3\2\2\2AB\3\2\2\2BC\3\2\2\2CD\7\22\2\2DE\5\n\6\2EG\7\23\2\2FH"+
		"\5\34\17\2GF\3\2\2\2GH\3\2\2\2HJ\3\2\2\2IK\7\30\2\2JI\3\2\2\2JK\3\2\2"+
		"\2KM\3\2\2\2LN\5\34\17\2ML\3\2\2\2MN\3\2\2\2NO\3\2\2\2OQ\7\16\2\2PR\5"+
		"\34\17\2QP\3\2\2\2QR\3\2\2\2RS\3\2\2\2ST\5\6\4\2TV\7\17\2\2UW\5\34\17"+
		"\2VU\3\2\2\2VW\3\2\2\2W\t\3\2\2\2XZ\5\22\n\2YX\3\2\2\2YZ\3\2\2\2Z_\3\2"+
		"\2\2[\\\7\3\2\2\\^\5\22\n\2][\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`b"+
		"\3\2\2\2a_\3\2\2\2bd\7\30\2\2ce\5\34\17\2dc\3\2\2\2de\3\2\2\2eg\3\2\2"+
		"\2fh\5\16\b\2gf\3\2\2\2gh\3\2\2\2hp\3\2\2\2ik\7\31\2\2jl\5\34\17\2kj\3"+
		"\2\2\2kl\3\2\2\2lm\3\2\2\2mo\5\16\b\2ni\3\2\2\2or\3\2\2\2pq\3\2\2\2pn"+
		"\3\2\2\2qs\3\2\2\2rp\3\2\2\2su\7\30\2\2tv\5\34\17\2ut\3\2\2\2uv\3\2\2"+
		"\2vx\3\2\2\2wy\5\32\16\2xw\3\2\2\2xy\3\2\2\2y~\3\2\2\2z{\7\3\2\2{}\5\32"+
		"\16\2|z\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0082\3\2\2"+
		"\2\u0080~\3\2\2\2\u0081\u0083\5\34\17\2\u0082\u0081\3\2\2\2\u0082\u0083"+
		"\3\2\2\2\u0083\13\3\2\2\2\u0084\u0086\7\b\2\2\u0085\u0087\5\34\17\2\u0086"+
		"\u0085\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008a\7\22"+
		"\2\2\u0089\u008b\5\34\17\2\u008a\u0089\3\2\2\2\u008a\u008b\3\2\2\2\u008b"+
		"\u008c\3\2\2\2\u008c\u0094\5\16\b\2\u008d\u008f\7\31\2\2\u008e\u0090\5"+
		"\34\17\2\u008f\u008e\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\3\2\2\2\u0091"+
		"\u0093\5\16\b\2\u0092\u008d\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0095\3"+
		"\2\2\2\u0094\u0092\3\2\2\2\u0095\u0097\3\2\2\2\u0096\u0094\3\2\2\2\u0097"+
		"\u0099\7\23\2\2\u0098\u009a\5\34\17\2\u0099\u0098\3\2\2\2\u0099\u009a"+
		"\3\2\2\2\u009a\u009c\3\2\2\2\u009b\u009d\7\30\2\2\u009c\u009b\3\2\2\2"+
		"\u009c\u009d\3\2\2\2\u009d\u009f\3\2\2\2\u009e\u00a0\5\34\17\2\u009f\u009e"+
		"\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a3\7\t\2\2\u00a2"+
		"\u00a4\5\34\17\2\u00a3\u00a2\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\3"+
		"\2\2\2\u00a5\u00c8\5\6\4\2\u00a6\u00a8\7\n\2\2\u00a7\u00a9\5\34\17\2\u00a8"+
		"\u00a7\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ac\7\22"+
		"\2\2\u00ab\u00ad\5\34\17\2\u00ac\u00ab\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad"+
		"\u00ae\3\2\2\2\u00ae\u00b3\5\16\b\2\u00af\u00b0\7\31\2\2\u00b0\u00b2\5"+
		"\16\b\2\u00b1\u00af\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b3"+
		"\u00b1\3\2\2\2\u00b4\u00b6\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00b8\7\23"+
		"\2\2\u00b7\u00b9\5\34\17\2\u00b8\u00b7\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9"+
		"\u00bb\3\2\2\2\u00ba\u00bc\7\30\2\2\u00bb\u00ba\3\2\2\2\u00bb\u00bc\3"+
		"\2\2\2\u00bc\u00be\3\2\2\2\u00bd\u00bf\5\34\17\2\u00be\u00bd\3\2\2\2\u00be"+
		"\u00bf\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c2\7\t\2\2\u00c1\u00c3\5\34"+
		"\17\2\u00c2\u00c1\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4"+
		"\u00c5\5\6\4\2\u00c5\u00c7\3\2\2\2\u00c6\u00a6\3\2\2\2\u00c7\u00ca\3\2"+
		"\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00cb\3\2\2\2\u00ca"+
		"\u00c8\3\2\2\2\u00cb\u00cd\7\13\2\2\u00cc\u00ce\5\34\17\2\u00cd\u00cc"+
		"\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\5\6\4\2\u00d0"+
		"\u00d2\7\f\2\2\u00d1\u00d3\5\34\17\2\u00d2\u00d1\3\2\2\2\u00d2\u00d3\3"+
		"\2\2\2\u00d3\r\3\2\2\2\u00d4\u00d6\5\34\17\2\u00d5\u00d4\3\2\2\2\u00d5"+
		"\u00d6\3\2\2\2\u00d6\u00d8\3\2\2\2\u00d7\u00d9\t\2\2\2\u00d8\u00d7\3\2"+
		"\2\2\u00d9\u00da\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db"+
		"\u00dd\3\2\2\2\u00dc\u00de\5\34\17\2\u00dd\u00dc\3\2\2\2\u00dd\u00de\3"+
		"\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e1\7\33\2\2\u00e0\u00e2\5\34\17\2"+
		"\u00e1\u00e0\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00ea\3\2\2\2\u00e3\u00eb"+
		"\5\36\20\2\u00e4\u00eb\7\24\2\2\u00e5\u00eb\7\26\2\2\u00e6\u00eb\7\34"+
		"\2\2\u00e7\u00eb\7\25\2\2\u00e8\u00eb\7\21\2\2\u00e9\u00eb\7\34\2\2\u00ea"+
		"\u00e3\3\2\2\2\u00ea\u00e4\3\2\2\2\u00ea\u00e5\3\2\2\2\u00ea\u00e6\3\2"+
		"\2\2\u00ea\u00e7\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00e9\3\2\2\2\u00eb"+
		"\u00ec\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ef\3\2"+
		"\2\2\u00ee\u00f0\5\34\17\2\u00ef\u00ee\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0"+
		"\17\3\2\2\2\u00f1\u00f3\7\20\2\2\u00f2\u00f4\5\34\17\2\u00f3\u00f2\3\2"+
		"\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00fc\3\2\2\2\u00f5\u00fb\7\24\2\2\u00f6"+
		"\u00fb\7\26\2\2\u00f7\u00fb\7\34\2\2\u00f8\u00fb\7\25\2\2\u00f9\u00fb"+
		"\5\36\20\2\u00fa\u00f5\3\2\2\2\u00fa\u00f6\3\2\2\2\u00fa\u00f7\3\2\2\2"+
		"\u00fa\u00f8\3\2\2\2\u00fa\u00f9\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc\u00fd"+
		"\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff"+
		"\u0101\7\30\2\2\u0100\u00ff\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0103\3"+
		"\2\2\2\u0102\u0104\5\34\17\2\u0103\u0102\3\2\2\2\u0103\u0104\3\2\2\2\u0104"+
		"\21\3\2\2\2\u0105\u0106\7\24\2\2\u0106\u010d\7\27\2\2\u0107\u010e\5\36"+
		"\20\2\u0108\u010e\7\26\2\2\u0109\u010e\7\24\2\2\u010a\u010e\7\25\2\2\u010b"+
		"\u010e\7\21\2\2\u010c\u010e\7\34\2\2\u010d\u0107\3\2\2\2\u010d\u0108\3"+
		"\2\2\2\u010d\u0109\3\2\2\2\u010d\u010a\3\2\2\2\u010d\u010b\3\2\2\2\u010d"+
		"\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2"+
		"\2\2\u0110\u0112\3\2\2\2\u0111\u0113\7\30\2\2\u0112\u0111\3\2\2\2\u0112"+
		"\u0113\3\2\2\2\u0113\u0115\3\2\2\2\u0114\u0116\5\34\17\2\u0115\u0114\3"+
		"\2\2\2\u0115\u0116\3\2\2\2\u0116\23\3\2\2\2\u0117\u0119\7\22\2\2\u0118"+
		"\u011a\5\34\17\2\u0119\u0118\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011b\3"+
		"\2\2\2\u011b\u011d\7\24\2\2\u011c\u011e\5\34\17\2\u011d\u011c\3\2\2\2"+
		"\u011d\u011e\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0121\t\3\2\2\u0120\u0122"+
		"\5\34\17\2\u0121\u0120\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0129\3\2\2\2"+
		"\u0123\u012a\5\36\20\2\u0124\u012a\7\26\2\2\u0125\u012a\7\24\2\2\u0126"+
		"\u012a\7\25\2\2\u0127\u012a\7\21\2\2\u0128\u012a\7\34\2\2\u0129\u0123"+
		"\3\2\2\2\u0129\u0124\3\2\2\2\u0129\u0125\3\2\2\2\u0129\u0126\3\2\2\2\u0129"+
		"\u0127\3\2\2\2\u0129\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u0129\3\2"+
		"\2\2\u012b\u012c\3\2\2\2\u012c\u012e\3\2\2\2\u012d\u012f\5\34\17\2\u012e"+
		"\u012d\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0132\7\23"+
		"\2\2\u0131\u0133\7\30\2\2\u0132\u0131\3\2\2\2\u0132\u0133\3\2\2\2\u0133"+
		"\u0135\3\2\2\2\u0134\u0136\5\34\17\2\u0135\u0134\3\2\2\2\u0135\u0136\3"+
		"\2\2\2\u0136\25\3\2\2\2\u0137\u013f\7\34\2\2\u0138\u013f\5\36\20\2\u0139"+
		"\u013f\7\25\2\2\u013a\u013f\7\24\2\2\u013b\u013f\7\26\2\2\u013c\u013f"+
		"\5\34\17\2\u013d\u013f\7\35\2\2\u013e\u0137\3\2\2\2\u013e\u0138\3\2\2"+
		"\2\u013e\u0139\3\2\2\2\u013e\u013a\3\2\2\2\u013e\u013b\3\2\2\2\u013e\u013c"+
		"\3\2\2\2\u013e\u013d\3\2\2\2\u013f\27\3\2\2\2\u0140\u0141\7\24\2\2\u0141"+
		"\u0142\7\33\2\2\u0142\u0143\7\26\2\2\u0143\31\3\2\2\2\u0144\u0145\7\24"+
		"\2\2\u0145\u014b\7\32\2\2\u0146\u014c\7\34\2\2\u0147\u014c\7\24\2\2\u0148"+
		"\u014c\7\26\2\2\u0149\u014c\5\36\20\2\u014a\u014c\7\25\2\2\u014b\u0146"+
		"\3\2\2\2\u014b\u0147\3\2\2\2\u014b\u0148\3\2\2\2\u014b\u0149\3\2\2\2\u014b"+
		"\u014a\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u0150\3\2\2\2\u014d\u014e\7\32"+
		"\2\2\u014e\u0150\7\24\2\2\u014f\u0144\3\2\2\2\u014f\u014d\3\2\2\2\u0150"+
		"\33\3\2\2\2\u0151\u0153\7\7\2\2\u0152\u0151\3\2\2\2\u0153\u0154\3\2\2"+
		"\2\u0154\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155\35\3\2\2\2\u0156\u0157"+
		"\t\4\2\2\u0157\37\3\2\2\2F#.\60\679=AGJMQVY_dgkpux~\u0082\u0086\u008a"+
		"\u008f\u0094\u0099\u009c\u009f\u00a3\u00a8\u00ac\u00b3\u00b8\u00bb\u00be"+
		"\u00c2\u00c8\u00cd\u00d2\u00d5\u00da\u00dd\u00e1\u00ea\u00ec\u00ef\u00f3"+
		"\u00fa\u00fc\u0100\u0103\u010d\u010f\u0112\u0115\u0119\u011d\u0121\u0129"+
		"\u012b\u012e\u0132\u0135\u013e\u014b\u014f\u0154";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}