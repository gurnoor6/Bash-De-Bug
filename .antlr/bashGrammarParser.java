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
		ELIF=8, ELSE=9, FI=10, FOR=11, WHILE=12, DO=13, BREAK=14, CONTINUE=15, 
		DONE=16, COMMAND=17, RHS_ASSIGNMENT=18, OPEN_BRACKETS=19, CLOSE_BRACKETS=20, 
		VAR=21, BASH_VAR=22, VAL=23, ASSIGN=24, SEMICOLON=25, LOGICAL_OP=26, INCREMENT=27, 
		COMPARE=28, BLOB=29, OTHER=30;
	public static final int
		RULE_code = 0, RULE_bashScript = 1, RULE_expressions = 2, RULE_loops = 3, 
		RULE_while_loop = 4, RULE_for_loop = 5, RULE_inside_for = 6, RULE_ifElse = 7, 
		RULE_multi_conditions = 8, RULE_condition = 9, RULE_linux_command = 10, 
		RULE_assignment = 11, RULE_advanced_assignment = 12, RULE_command_data = 13, 
		RULE_comparison = 14, RULE_increment = 15, RULE_space = 16, RULE_string = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"code", "bashScript", "expressions", "loops", "while_loop", "for_loop", 
			"inside_for", "ifElse", "multi_conditions", "condition", "linux_command", 
			"assignment", "advanced_assignment", "command_data", "comparison", "increment", 
			"space", "string"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", null, null, null, null, "'if'", "'then'", "'elif'", "'else'", 
			"'fi'", "'for'", "'while'", "'do'", "'break'", "'continue'", "'done'", 
			null, null, null, null, null, null, null, "'='", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "SINGLE_STRING", "DOUBLE_STRING", "COMMENT", "SPACE", "IF", 
			"THEN", "ELIF", "ELSE", "FI", "FOR", "WHILE", "DO", "BREAK", "CONTINUE", 
			"DONE", "COMMAND", "RHS_ASSIGNMENT", "OPEN_BRACKETS", "CLOSE_BRACKETS", 
			"VAR", "BASH_VAR", "VAL", "ASSIGN", "SEMICOLON", "LOGICAL_OP", "INCREMENT", 
			"COMPARE", "BLOB", "OTHER"
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
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << COMMAND) | (1L << OPEN_BRACKETS) | (1L << VAR))) != 0)) {
				{
				{
				setState(36);
				bashScript();
				}
				}
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(42);
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
		public List<LoopsContext> loops() {
			return getRuleContexts(LoopsContext.class);
		}
		public LoopsContext loops(int i) {
			return getRuleContext(LoopsContext.class,i);
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
			setState(50); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(50);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case FOR:
					case WHILE:
						{
						setState(44);
						loops();
						}
						break;
					case VAR:
						{
						setState(45);
						assignment();
						}
						break;
					case COMMAND:
						{
						setState(46);
						linux_command();
						}
						break;
					case SPACE:
						{
						setState(47);
						space();
						}
						break;
					case OPEN_BRACKETS:
						{
						setState(48);
						advanced_assignment();
						}
						break;
					case IF:
						{
						setState(49);
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
				setState(52); 
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
		public List<LoopsContext> loops() {
			return getRuleContexts(LoopsContext.class);
		}
		public LoopsContext loops(int i) {
			return getRuleContext(LoopsContext.class,i);
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
		public List<TerminalNode> BREAK() { return getTokens(bashGrammarParser.BREAK); }
		public TerminalNode BREAK(int i) {
			return getToken(bashGrammarParser.BREAK, i);
		}
		public List<TerminalNode> CONTINUE() { return getTokens(bashGrammarParser.CONTINUE); }
		public TerminalNode CONTINUE(int i) {
			return getToken(bashGrammarParser.CONTINUE, i);
		}
		public List<SpaceContext> space() {
			return getRuleContexts(SpaceContext.class);
		}
		public SpaceContext space(int i) {
			return getRuleContext(SpaceContext.class,i);
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
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << BREAK) | (1L << CONTINUE) | (1L << COMMAND) | (1L << OPEN_BRACKETS) | (1L << VAR))) != 0)) {
				{
				setState(67);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FOR:
				case WHILE:
					{
					setState(54);
					loops();
					}
					break;
				case VAR:
					{
					setState(55);
					assignment();
					}
					break;
				case COMMAND:
					{
					setState(56);
					linux_command();
					}
					break;
				case OPEN_BRACKETS:
					{
					setState(57);
					advanced_assignment();
					}
					break;
				case IF:
					{
					setState(58);
					ifElse();
					}
					break;
				case BREAK:
					{
					setState(59);
					match(BREAK);
					setState(61);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						setState(60);
						space();
						}
						break;
					}
					}
					break;
				case CONTINUE:
					{
					setState(63);
					match(CONTINUE);
					setState(65);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						setState(64);
						space();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(72);
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

	public static class LoopsContext extends ParserRuleContext {
		public While_loopContext while_loop() {
			return getRuleContext(While_loopContext.class,0);
		}
		public For_loopContext for_loop() {
			return getRuleContext(For_loopContext.class,0);
		}
		public LoopsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loops; }
	}

	public final LoopsContext loops() throws RecognitionException {
		LoopsContext _localctx = new LoopsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_loops);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				{
				setState(75);
				while_loop();
				}
				break;
			case FOR:
				{
				setState(76);
				for_loop();
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

	public static class While_loopContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(bashGrammarParser.WHILE, 0); }
		public Multi_conditionsContext multi_conditions() {
			return getRuleContext(Multi_conditionsContext.class,0);
		}
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
		public While_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_loop; }
	}

	public final While_loopContext while_loop() throws RecognitionException {
		While_loopContext _localctx = new While_loopContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_while_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(WHILE);
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(80);
				space();
				}
			}

			setState(83);
			multi_conditions();
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(84);
				match(SEMICOLON);
				}
			}

			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(87);
				space();
				}
			}

			setState(90);
			match(DO);
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
			setState(94);
			expressions();
			setState(95);
			match(DONE);
			setState(97);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(96);
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
		enterRule(_localctx, 10, RULE_for_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(FOR);
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(100);
				space();
				}
			}

			setState(103);
			match(OPEN_BRACKETS);
			setState(104);
			inside_for();
			setState(105);
			match(CLOSE_BRACKETS);
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(106);
				space();
				}
				break;
			}
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(109);
				match(SEMICOLON);
				}
			}

			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(112);
				space();
				}
			}

			setState(115);
			match(DO);
			setState(117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(116);
				space();
				}
				break;
			}
			setState(119);
			expressions();
			setState(120);
			match(DONE);
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(121);
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
		enterRule(_localctx, 12, RULE_inside_for);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(124);
				assignment();
				}
			}

			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(127);
				match(T__0);
				setState(128);
				assignment();
				}
				}
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(134);
			match(SEMICOLON);
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(135);
				space();
				}
				break;
			}
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << VAR) | (1L << VAL) | (1L << BLOB))) != 0)) {
				{
				setState(138);
				condition();
				}
			}

			setState(148);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(141);
					match(LOGICAL_OP);
					setState(143);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						setState(142);
						space();
						}
						break;
					}
					setState(145);
					condition();
					}
					} 
				}
				setState(150);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			setState(151);
			match(SEMICOLON);
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(152);
				space();
				}
				break;
			}
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR || _la==INCREMENT) {
				{
				setState(155);
				increment();
				}
			}

			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(158);
				match(T__0);
				setState(159);
				increment();
				}
				}
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(165);
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
		public Multi_conditionsContext multi_conditions() {
			return getRuleContext(Multi_conditionsContext.class,0);
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
		public TerminalNode FI() { return getToken(bashGrammarParser.FI, 0); }
		public List<SpaceContext> space() {
			return getRuleContexts(SpaceContext.class);
		}
		public SpaceContext space(int i) {
			return getRuleContext(SpaceContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(bashGrammarParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(bashGrammarParser.SEMICOLON, i);
		}
		public List<TerminalNode> ELIF() { return getTokens(bashGrammarParser.ELIF); }
		public TerminalNode ELIF(int i) {
			return getToken(bashGrammarParser.ELIF, i);
		}
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
		public TerminalNode ELSE() { return getToken(bashGrammarParser.ELSE, 0); }
		public List<TerminalNode> LOGICAL_OP() { return getTokens(bashGrammarParser.LOGICAL_OP); }
		public TerminalNode LOGICAL_OP(int i) {
			return getToken(bashGrammarParser.LOGICAL_OP, i);
		}
		public IfElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifElse; }
	}

	public final IfElseContext ifElse() throws RecognitionException {
		IfElseContext _localctx = new IfElseContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ifElse);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(IF);
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(169);
				space();
				}
			}

			setState(172);
			multi_conditions();
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(173);
				match(SEMICOLON);
				}
			}

			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(176);
				space();
				}
			}

			setState(179);
			match(THEN);
			setState(181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(180);
				space();
				}
				break;
			}
			setState(183);
			expressions();
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELIF) {
				{
				{
				setState(184);
				match(ELIF);
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE) {
					{
					setState(185);
					space();
					}
				}

				setState(188);
				match(OPEN_BRACKETS);
				setState(190);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(189);
					space();
					}
					break;
				}
				setState(192);
				condition();
				setState(197);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(193);
						match(LOGICAL_OP);
						setState(194);
						condition();
						}
						} 
					}
					setState(199);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				}
				setState(200);
				match(CLOSE_BRACKETS);
				setState(202);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(201);
					space();
					}
					break;
				}
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(204);
					match(SEMICOLON);
					}
				}

				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE) {
					{
					setState(207);
					space();
					}
				}

				setState(210);
				match(THEN);
				setState(212);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(211);
					space();
					}
					break;
				}
				setState(214);
				expressions();
				}
				}
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(221);
				match(ELSE);
				setState(223);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(222);
					space();
					}
					break;
				}
				setState(225);
				expressions();
				}
			}

			setState(228);
			match(FI);
			setState(230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(229);
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

	public static class Multi_conditionsContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACKETS() { return getToken(bashGrammarParser.OPEN_BRACKETS, 0); }
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public TerminalNode CLOSE_BRACKETS() { return getToken(bashGrammarParser.CLOSE_BRACKETS, 0); }
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
		public Multi_conditionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multi_conditions; }
	}

	public final Multi_conditionsContext multi_conditions() throws RecognitionException {
		Multi_conditionsContext _localctx = new Multi_conditionsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_multi_conditions);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(OPEN_BRACKETS);
			setState(234);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(233);
				space();
				}
				break;
			}
			setState(236);
			condition();
			setState(244);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(237);
					match(LOGICAL_OP);
					setState(239);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
					case 1:
						{
						setState(238);
						space();
						}
						break;
					}
					setState(241);
					condition();
					}
					} 
				}
				setState(246);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			}
			setState(247);
			match(CLOSE_BRACKETS);
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
		enterRule(_localctx, 18, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(251);
				space();
				}
			}

			setState(255); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(254);
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
				setState(257); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << VAL) | (1L << BLOB))) != 0) );
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(259);
				space();
				}
			}

			setState(262);
			match(COMPARE);
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(263);
				space();
				}
			}

			setState(273); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(273);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
				case 1:
					{
					setState(266);
					string();
					}
					break;
				case 2:
					{
					setState(267);
					match(VAR);
					}
					break;
				case 3:
					{
					setState(268);
					match(VAL);
					}
					break;
				case 4:
					{
					setState(269);
					match(BLOB);
					}
					break;
				case 5:
					{
					setState(270);
					match(BASH_VAR);
					}
					break;
				case 6:
					{
					setState(271);
					match(RHS_ASSIGNMENT);
					}
					break;
				case 7:
					{
					setState(272);
					match(BLOB);
					}
					break;
				}
				}
				setState(275); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SINGLE_STRING) | (1L << DOUBLE_STRING) | (1L << RHS_ASSIGNMENT) | (1L << VAR) | (1L << BASH_VAR) | (1L << VAL) | (1L << BLOB))) != 0) );
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(277);
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
		enterRule(_localctx, 20, RULE_linux_command);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			match(COMMAND);
			setState(282);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(281);
				space();
				}
				break;
			}
			setState(287);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(284);
					command_data();
					}
					} 
				}
				setState(289);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			}
			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(290);
				match(SEMICOLON);
				}
			}

			setState(294);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(293);
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
		enterRule(_localctx, 22, RULE_assignment);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(VAR);
			setState(297);
			match(ASSIGN);
			setState(304); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(304);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case SINGLE_STRING:
					case DOUBLE_STRING:
						{
						setState(298);
						string();
						}
						break;
					case VAL:
						{
						setState(299);
						match(VAL);
						}
						break;
					case VAR:
						{
						setState(300);
						match(VAR);
						}
						break;
					case BASH_VAR:
						{
						setState(301);
						match(BASH_VAR);
						}
						break;
					case RHS_ASSIGNMENT:
						{
						setState(302);
						match(RHS_ASSIGNMENT);
						}
						break;
					case BLOB:
						{
						setState(303);
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
				setState(306); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(309);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(308);
				match(SEMICOLON);
				}
				break;
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
		enterRule(_localctx, 24, RULE_advanced_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(OPEN_BRACKETS);
			setState(316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(315);
				space();
				}
			}

			setState(318);
			match(VAR);
			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(319);
				space();
				}
			}

			setState(322);
			_la = _input.LA(1);
			if ( !(_la==ASSIGN || _la==INCREMENT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(324);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(323);
				space();
				}
				break;
			}
			setState(334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SINGLE_STRING) | (1L << DOUBLE_STRING) | (1L << RHS_ASSIGNMENT) | (1L << VAR) | (1L << BASH_VAR) | (1L << VAL) | (1L << BLOB))) != 0)) {
				{
				setState(332);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SINGLE_STRING:
				case DOUBLE_STRING:
					{
					setState(326);
					string();
					}
					break;
				case VAL:
					{
					setState(327);
					match(VAL);
					}
					break;
				case VAR:
					{
					setState(328);
					match(VAR);
					}
					break;
				case BASH_VAR:
					{
					setState(329);
					match(BASH_VAR);
					}
					break;
				case RHS_ASSIGNMENT:
					{
					setState(330);
					match(RHS_ASSIGNMENT);
					}
					break;
				case BLOB:
					{
					setState(331);
					match(BLOB);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(336);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(338);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(337);
				space();
				}
			}

			setState(340);
			match(CLOSE_BRACKETS);
			setState(342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(341);
				match(SEMICOLON);
				}
			}

			setState(345);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				{
				setState(344);
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
		public List<TerminalNode> BLOB() { return getTokens(bashGrammarParser.BLOB); }
		public TerminalNode BLOB(int i) {
			return getToken(bashGrammarParser.BLOB, i);
		}
		public List<TerminalNode> INCREMENT() { return getTokens(bashGrammarParser.INCREMENT); }
		public TerminalNode INCREMENT(int i) {
			return getToken(bashGrammarParser.INCREMENT, i);
		}
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public List<TerminalNode> BASH_VAR() { return getTokens(bashGrammarParser.BASH_VAR); }
		public TerminalNode BASH_VAR(int i) {
			return getToken(bashGrammarParser.BASH_VAR, i);
		}
		public List<TerminalNode> VAR() { return getTokens(bashGrammarParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(bashGrammarParser.VAR, i);
		}
		public List<TerminalNode> VAL() { return getTokens(bashGrammarParser.VAL); }
		public TerminalNode VAL(int i) {
			return getToken(bashGrammarParser.VAL, i);
		}
		public List<TerminalNode> OTHER() { return getTokens(bashGrammarParser.OTHER); }
		public TerminalNode OTHER(int i) {
			return getToken(bashGrammarParser.OTHER, i);
		}
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
		enterRule(_localctx, 26, RULE_command_data);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(354); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(354);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case BLOB:
						{
						setState(347);
						match(BLOB);
						}
						break;
					case INCREMENT:
						{
						setState(348);
						match(INCREMENT);
						}
						break;
					case SINGLE_STRING:
					case DOUBLE_STRING:
						{
						setState(349);
						string();
						}
						break;
					case BASH_VAR:
						{
						setState(350);
						match(BASH_VAR);
						}
						break;
					case VAR:
						{
						setState(351);
						match(VAR);
						}
						break;
					case VAL:
						{
						setState(352);
						match(VAL);
						}
						break;
					case OTHER:
						{
						setState(353);
						match(OTHER);
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
				setState(356); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(359);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				setState(358);
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
		enterRule(_localctx, 28, RULE_comparison);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			match(VAR);
			setState(362);
			match(COMPARE);
			setState(363);
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
		enterRule(_localctx, 30, RULE_increment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				{
				setState(365);
				match(VAR);
				setState(366);
				match(INCREMENT);
				setState(372);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BLOB:
					{
					setState(367);
					match(BLOB);
					}
					break;
				case VAR:
					{
					setState(368);
					match(VAR);
					}
					break;
				case VAL:
					{
					setState(369);
					match(VAL);
					}
					break;
				case SINGLE_STRING:
				case DOUBLE_STRING:
					{
					setState(370);
					string();
					}
					break;
				case BASH_VAR:
					{
					setState(371);
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
				setState(374);
				match(INCREMENT);
				setState(375);
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
		enterRule(_localctx, 32, RULE_space);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(379); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(378);
					match(SPACE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(381); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
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
		enterRule(_localctx, 34, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3 \u0184\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\7\2(\n\2\f\2\16\2+\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\6\3\65\n\3\r\3\16\3\66\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4@\n\4\3\4\3\4\5"+
		"\4D\n\4\7\4F\n\4\f\4\16\4I\13\4\3\4\5\4L\n\4\3\5\3\5\5\5P\n\5\3\6\3\6"+
		"\5\6T\n\6\3\6\3\6\5\6X\n\6\3\6\5\6[\n\6\3\6\3\6\5\6_\n\6\3\6\3\6\3\6\5"+
		"\6d\n\6\3\7\3\7\5\7h\n\7\3\7\3\7\3\7\3\7\5\7n\n\7\3\7\5\7q\n\7\3\7\5\7"+
		"t\n\7\3\7\3\7\5\7x\n\7\3\7\3\7\3\7\5\7}\n\7\3\b\5\b\u0080\n\b\3\b\3\b"+
		"\7\b\u0084\n\b\f\b\16\b\u0087\13\b\3\b\3\b\5\b\u008b\n\b\3\b\5\b\u008e"+
		"\n\b\3\b\3\b\5\b\u0092\n\b\3\b\7\b\u0095\n\b\f\b\16\b\u0098\13\b\3\b\3"+
		"\b\5\b\u009c\n\b\3\b\5\b\u009f\n\b\3\b\3\b\7\b\u00a3\n\b\f\b\16\b\u00a6"+
		"\13\b\3\b\5\b\u00a9\n\b\3\t\3\t\5\t\u00ad\n\t\3\t\3\t\5\t\u00b1\n\t\3"+
		"\t\5\t\u00b4\n\t\3\t\3\t\5\t\u00b8\n\t\3\t\3\t\3\t\5\t\u00bd\n\t\3\t\3"+
		"\t\5\t\u00c1\n\t\3\t\3\t\3\t\7\t\u00c6\n\t\f\t\16\t\u00c9\13\t\3\t\3\t"+
		"\5\t\u00cd\n\t\3\t\5\t\u00d0\n\t\3\t\5\t\u00d3\n\t\3\t\3\t\5\t\u00d7\n"+
		"\t\3\t\3\t\7\t\u00db\n\t\f\t\16\t\u00de\13\t\3\t\3\t\5\t\u00e2\n\t\3\t"+
		"\5\t\u00e5\n\t\3\t\3\t\5\t\u00e9\n\t\3\n\3\n\5\n\u00ed\n\n\3\n\3\n\3\n"+
		"\5\n\u00f2\n\n\3\n\7\n\u00f5\n\n\f\n\16\n\u00f8\13\n\3\n\3\n\5\n\u00fc"+
		"\n\n\3\13\5\13\u00ff\n\13\3\13\6\13\u0102\n\13\r\13\16\13\u0103\3\13\5"+
		"\13\u0107\n\13\3\13\3\13\5\13\u010b\n\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\6\13\u0114\n\13\r\13\16\13\u0115\3\13\5\13\u0119\n\13\3\f\3\f\5"+
		"\f\u011d\n\f\3\f\7\f\u0120\n\f\f\f\16\f\u0123\13\f\3\f\5\f\u0126\n\f\3"+
		"\f\5\f\u0129\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\6\r\u0133\n\r\r\r\16"+
		"\r\u0134\3\r\5\r\u0138\n\r\3\r\5\r\u013b\n\r\3\16\3\16\5\16\u013f\n\16"+
		"\3\16\3\16\5\16\u0143\n\16\3\16\3\16\5\16\u0147\n\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\7\16\u014f\n\16\f\16\16\16\u0152\13\16\3\16\5\16\u0155\n"+
		"\16\3\16\3\16\5\16\u0159\n\16\3\16\5\16\u015c\n\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\6\17\u0165\n\17\r\17\16\17\u0166\3\17\5\17\u016a\n\17"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0177\n\21"+
		"\3\21\3\21\5\21\u017b\n\21\3\22\6\22\u017e\n\22\r\22\16\22\u017f\3\23"+
		"\3\23\3\23\6\u0096\u00c7\u00f6\u0121\2\24\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$\2\5\5\2\27\27\31\31\37\37\4\2\32\32\35\35\3\2\4\5\2\u01de"+
		"\2)\3\2\2\2\4\64\3\2\2\2\6G\3\2\2\2\bO\3\2\2\2\nQ\3\2\2\2\fe\3\2\2\2\16"+
		"\177\3\2\2\2\20\u00aa\3\2\2\2\22\u00ea\3\2\2\2\24\u00fe\3\2\2\2\26\u011a"+
		"\3\2\2\2\30\u012a\3\2\2\2\32\u013c\3\2\2\2\34\u0164\3\2\2\2\36\u016b\3"+
		"\2\2\2 \u017a\3\2\2\2\"\u017d\3\2\2\2$\u0181\3\2\2\2&(\5\4\3\2\'&\3\2"+
		"\2\2(+\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*,\3\2\2\2+)\3\2\2\2,-\7\2\2\3-\3\3"+
		"\2\2\2.\65\5\b\5\2/\65\5\30\r\2\60\65\5\26\f\2\61\65\5\"\22\2\62\65\5"+
		"\32\16\2\63\65\5\20\t\2\64.\3\2\2\2\64/\3\2\2\2\64\60\3\2\2\2\64\61\3"+
		"\2\2\2\64\62\3\2\2\2\64\63\3\2\2\2\65\66\3\2\2\2\66\64\3\2\2\2\66\67\3"+
		"\2\2\2\67\5\3\2\2\28F\5\b\5\29F\5\30\r\2:F\5\26\f\2;F\5\32\16\2<F\5\20"+
		"\t\2=?\7\20\2\2>@\5\"\22\2?>\3\2\2\2?@\3\2\2\2@F\3\2\2\2AC\7\21\2\2BD"+
		"\5\"\22\2CB\3\2\2\2CD\3\2\2\2DF\3\2\2\2E8\3\2\2\2E9\3\2\2\2E:\3\2\2\2"+
		"E;\3\2\2\2E<\3\2\2\2E=\3\2\2\2EA\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2"+
		"HK\3\2\2\2IG\3\2\2\2JL\5\"\22\2KJ\3\2\2\2KL\3\2\2\2L\7\3\2\2\2MP\5\n\6"+
		"\2NP\5\f\7\2OM\3\2\2\2ON\3\2\2\2P\t\3\2\2\2QS\7\16\2\2RT\5\"\22\2SR\3"+
		"\2\2\2ST\3\2\2\2TU\3\2\2\2UW\5\22\n\2VX\7\33\2\2WV\3\2\2\2WX\3\2\2\2X"+
		"Z\3\2\2\2Y[\5\"\22\2ZY\3\2\2\2Z[\3\2\2\2[\\\3\2\2\2\\^\7\17\2\2]_\5\""+
		"\22\2^]\3\2\2\2^_\3\2\2\2_`\3\2\2\2`a\5\6\4\2ac\7\22\2\2bd\5\"\22\2cb"+
		"\3\2\2\2cd\3\2\2\2d\13\3\2\2\2eg\7\r\2\2fh\5\"\22\2gf\3\2\2\2gh\3\2\2"+
		"\2hi\3\2\2\2ij\7\25\2\2jk\5\16\b\2km\7\26\2\2ln\5\"\22\2ml\3\2\2\2mn\3"+
		"\2\2\2np\3\2\2\2oq\7\33\2\2po\3\2\2\2pq\3\2\2\2qs\3\2\2\2rt\5\"\22\2s"+
		"r\3\2\2\2st\3\2\2\2tu\3\2\2\2uw\7\17\2\2vx\5\"\22\2wv\3\2\2\2wx\3\2\2"+
		"\2xy\3\2\2\2yz\5\6\4\2z|\7\22\2\2{}\5\"\22\2|{\3\2\2\2|}\3\2\2\2}\r\3"+
		"\2\2\2~\u0080\5\30\r\2\177~\3\2\2\2\177\u0080\3\2\2\2\u0080\u0085\3\2"+
		"\2\2\u0081\u0082\7\3\2\2\u0082\u0084\5\30\r\2\u0083\u0081\3\2\2\2\u0084"+
		"\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0088\3\2"+
		"\2\2\u0087\u0085\3\2\2\2\u0088\u008a\7\33\2\2\u0089\u008b\5\"\22\2\u008a"+
		"\u0089\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008d\3\2\2\2\u008c\u008e\5\24"+
		"\13\2\u008d\u008c\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0096\3\2\2\2\u008f"+
		"\u0091\7\34\2\2\u0090\u0092\5\"\22\2\u0091\u0090\3\2\2\2\u0091\u0092\3"+
		"\2\2\2\u0092\u0093\3\2\2\2\u0093\u0095\5\24\13\2\u0094\u008f\3\2\2\2\u0095"+
		"\u0098\3\2\2\2\u0096\u0097\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u0099\3\2"+
		"\2\2\u0098\u0096\3\2\2\2\u0099\u009b\7\33\2\2\u009a\u009c\5\"\22\2\u009b"+
		"\u009a\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009e\3\2\2\2\u009d\u009f\5 "+
		"\21\2\u009e\u009d\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a4\3\2\2\2\u00a0"+
		"\u00a1\7\3\2\2\u00a1\u00a3\5 \21\2\u00a2\u00a0\3\2\2\2\u00a3\u00a6\3\2"+
		"\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6"+
		"\u00a4\3\2\2\2\u00a7\u00a9\5\"\22\2\u00a8\u00a7\3\2\2\2\u00a8\u00a9\3"+
		"\2\2\2\u00a9\17\3\2\2\2\u00aa\u00ac\7\b\2\2\u00ab\u00ad\5\"\22\2\u00ac"+
		"\u00ab\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00b0\5\22"+
		"\n\2\u00af\u00b1\7\33\2\2\u00b0\u00af\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1"+
		"\u00b3\3\2\2\2\u00b2\u00b4\5\"\22\2\u00b3\u00b2\3\2\2\2\u00b3\u00b4\3"+
		"\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b7\7\t\2\2\u00b6\u00b8\5\"\22\2\u00b7"+
		"\u00b6\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00dc\5\6"+
		"\4\2\u00ba\u00bc\7\n\2\2\u00bb\u00bd\5\"\22\2\u00bc\u00bb\3\2\2\2\u00bc"+
		"\u00bd\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c0\7\25\2\2\u00bf\u00c1\5"+
		"\"\22\2\u00c0\u00bf\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2"+
		"\u00c7\5\24\13\2\u00c3\u00c4\7\34\2\2\u00c4\u00c6\5\24\13\2\u00c5\u00c3"+
		"\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8"+
		"\u00ca\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca\u00cc\7\26\2\2\u00cb\u00cd\5"+
		"\"\22\2\u00cc\u00cb\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cf\3\2\2\2\u00ce"+
		"\u00d0\7\33\2\2\u00cf\u00ce\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d2\3"+
		"\2\2\2\u00d1\u00d3\5\"\22\2\u00d2\u00d1\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3"+
		"\u00d4\3\2\2\2\u00d4\u00d6\7\t\2\2\u00d5\u00d7\5\"\22\2\u00d6\u00d5\3"+
		"\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9\5\6\4\2\u00d9"+
		"\u00db\3\2\2\2\u00da\u00ba\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00da\3\2"+
		"\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00e4\3\2\2\2\u00de\u00dc\3\2\2\2\u00df"+
		"\u00e1\7\13\2\2\u00e0\u00e2\5\"\22\2\u00e1\u00e0\3\2\2\2\u00e1\u00e2\3"+
		"\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e5\5\6\4\2\u00e4\u00df\3\2\2\2\u00e4"+
		"\u00e5\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e8\7\f\2\2\u00e7\u00e9\5\""+
		"\22\2\u00e8\u00e7\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\21\3\2\2\2\u00ea\u00ec"+
		"\7\25\2\2\u00eb\u00ed\5\"\22\2\u00ec\u00eb\3\2\2\2\u00ec\u00ed\3\2\2\2"+
		"\u00ed\u00ee\3\2\2\2\u00ee\u00f6\5\24\13\2\u00ef\u00f1\7\34\2\2\u00f0"+
		"\u00f2\5\"\22\2\u00f1\u00f0\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3\3"+
		"\2\2\2\u00f3\u00f5\5\24\13\2\u00f4\u00ef\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6"+
		"\u00f7\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f7\u00f9\3\2\2\2\u00f8\u00f6\3\2"+
		"\2\2\u00f9\u00fb\7\26\2\2\u00fa\u00fc\5\"\22\2\u00fb\u00fa\3\2\2\2\u00fb"+
		"\u00fc\3\2\2\2\u00fc\23\3\2\2\2\u00fd\u00ff\5\"\22\2\u00fe\u00fd\3\2\2"+
		"\2\u00fe\u00ff\3\2\2\2\u00ff\u0101\3\2\2\2\u0100\u0102\t\2\2\2\u0101\u0100"+
		"\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104"+
		"\u0106\3\2\2\2\u0105\u0107\5\"\22\2\u0106\u0105\3\2\2\2\u0106\u0107\3"+
		"\2\2\2\u0107\u0108\3\2\2\2\u0108\u010a\7\36\2\2\u0109\u010b\5\"\22\2\u010a"+
		"\u0109\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u0113\3\2\2\2\u010c\u0114\5$"+
		"\23\2\u010d\u0114\7\27\2\2\u010e\u0114\7\31\2\2\u010f\u0114\7\37\2\2\u0110"+
		"\u0114\7\30\2\2\u0111\u0114\7\24\2\2\u0112\u0114\7\37\2\2\u0113\u010c"+
		"\3\2\2\2\u0113\u010d\3\2\2\2\u0113\u010e\3\2\2\2\u0113\u010f\3\2\2\2\u0113"+
		"\u0110\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0112\3\2\2\2\u0114\u0115\3\2"+
		"\2\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0118\3\2\2\2\u0117"+
		"\u0119\5\"\22\2\u0118\u0117\3\2\2\2\u0118\u0119\3\2\2\2\u0119\25\3\2\2"+
		"\2\u011a\u011c\7\23\2\2\u011b\u011d\5\"\22\2\u011c\u011b\3\2\2\2\u011c"+
		"\u011d\3\2\2\2\u011d\u0121\3\2\2\2\u011e\u0120\5\34\17\2\u011f\u011e\3"+
		"\2\2\2\u0120\u0123\3\2\2\2\u0121\u0122\3\2\2\2\u0121\u011f\3\2\2\2\u0122"+
		"\u0125\3\2\2\2\u0123\u0121\3\2\2\2\u0124\u0126\7\33\2\2\u0125\u0124\3"+
		"\2\2\2\u0125\u0126\3\2\2\2\u0126\u0128\3\2\2\2\u0127\u0129\5\"\22\2\u0128"+
		"\u0127\3\2\2\2\u0128\u0129\3\2\2\2\u0129\27\3\2\2\2\u012a\u012b\7\27\2"+
		"\2\u012b\u0132\7\32\2\2\u012c\u0133\5$\23\2\u012d\u0133\7\31\2\2\u012e"+
		"\u0133\7\27\2\2\u012f\u0133\7\30\2\2\u0130\u0133\7\24\2\2\u0131\u0133"+
		"\7\37\2\2\u0132\u012c\3\2\2\2\u0132\u012d\3\2\2\2\u0132\u012e\3\2\2\2"+
		"\u0132\u012f\3\2\2\2\u0132\u0130\3\2\2\2\u0132\u0131\3\2\2\2\u0133\u0134"+
		"\3\2\2\2\u0134\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0137\3\2\2\2\u0136"+
		"\u0138\7\33\2\2\u0137\u0136\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u013a\3"+
		"\2\2\2\u0139\u013b\5\"\22\2\u013a\u0139\3\2\2\2\u013a\u013b\3\2\2\2\u013b"+
		"\31\3\2\2\2\u013c\u013e\7\25\2\2\u013d\u013f\5\"\22\2\u013e\u013d\3\2"+
		"\2\2\u013e\u013f\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0142\7\27\2\2\u0141"+
		"\u0143\5\"\22\2\u0142\u0141\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0144\3"+
		"\2\2\2\u0144\u0146\t\3\2\2\u0145\u0147\5\"\22\2\u0146\u0145\3\2\2\2\u0146"+
		"\u0147\3\2\2\2\u0147\u0150\3\2\2\2\u0148\u014f\5$\23\2\u0149\u014f\7\31"+
		"\2\2\u014a\u014f\7\27\2\2\u014b\u014f\7\30\2\2\u014c\u014f\7\24\2\2\u014d"+
		"\u014f\7\37\2\2\u014e\u0148\3\2\2\2\u014e\u0149\3\2\2\2\u014e\u014a\3"+
		"\2\2\2\u014e\u014b\3\2\2\2\u014e\u014c\3\2\2\2\u014e\u014d\3\2\2\2\u014f"+
		"\u0152\3\2\2\2\u0150\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0154\3\2"+
		"\2\2\u0152\u0150\3\2\2\2\u0153\u0155\5\"\22\2\u0154\u0153\3\2\2\2\u0154"+
		"\u0155\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0158\7\26\2\2\u0157\u0159\7"+
		"\33\2\2\u0158\u0157\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015b\3\2\2\2\u015a"+
		"\u015c\5\"\22\2\u015b\u015a\3\2\2\2\u015b\u015c\3\2\2\2\u015c\33\3\2\2"+
		"\2\u015d\u0165\7\37\2\2\u015e\u0165\7\35\2\2\u015f\u0165\5$\23\2\u0160"+
		"\u0165\7\30\2\2\u0161\u0165\7\27\2\2\u0162\u0165\7\31\2\2\u0163\u0165"+
		"\7 \2\2\u0164\u015d\3\2\2\2\u0164\u015e\3\2\2\2\u0164\u015f\3\2\2\2\u0164"+
		"\u0160\3\2\2\2\u0164\u0161\3\2\2\2\u0164\u0162\3\2\2\2\u0164\u0163\3\2"+
		"\2\2\u0165\u0166\3\2\2\2\u0166\u0164\3\2\2\2\u0166\u0167\3\2\2\2\u0167"+
		"\u0169\3\2\2\2\u0168\u016a\5\"\22\2\u0169\u0168\3\2\2\2\u0169\u016a\3"+
		"\2\2\2\u016a\35\3\2\2\2\u016b\u016c\7\27\2\2\u016c\u016d\7\36\2\2\u016d"+
		"\u016e\7\31\2\2\u016e\37\3\2\2\2\u016f\u0170\7\27\2\2\u0170\u0176\7\35"+
		"\2\2\u0171\u0177\7\37\2\2\u0172\u0177\7\27\2\2\u0173\u0177\7\31\2\2\u0174"+
		"\u0177\5$\23\2\u0175\u0177\7\30\2\2\u0176\u0171\3\2\2\2\u0176\u0172\3"+
		"\2\2\2\u0176\u0173\3\2\2\2\u0176\u0174\3\2\2\2\u0176\u0175\3\2\2\2\u0176"+
		"\u0177\3\2\2\2\u0177\u017b\3\2\2\2\u0178\u0179\7\35\2\2\u0179\u017b\7"+
		"\27\2\2\u017a\u016f\3\2\2\2\u017a\u0178\3\2\2\2\u017b!\3\2\2\2\u017c\u017e"+
		"\7\7\2\2\u017d\u017c\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u017d\3\2\2\2\u017f"+
		"\u0180\3\2\2\2\u0180#\3\2\2\2\u0181\u0182\t\4\2\2\u0182%\3\2\2\2P)\64"+
		"\66?CEGKOSWZ^cgmpsw|\177\u0085\u008a\u008d\u0091\u0096\u009b\u009e\u00a4"+
		"\u00a8\u00ac\u00b0\u00b3\u00b7\u00bc\u00c0\u00c7\u00cc\u00cf\u00d2\u00d6"+
		"\u00dc\u00e1\u00e4\u00e8\u00ec\u00f1\u00f6\u00fb\u00fe\u0103\u0106\u010a"+
		"\u0113\u0115\u0118\u011c\u0121\u0125\u0128\u0132\u0134\u0137\u013a\u013e"+
		"\u0142\u0146\u014e\u0150\u0154\u0158\u015b\u0164\u0166\u0169\u0176\u017a"+
		"\u017f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}