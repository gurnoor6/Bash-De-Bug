// Generated from bashGrammar.g4 by ANTLR 4.9
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
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, OPEN_PAR=2, CLOSE_PAR=3, OPEN_CUR=4, CLOSE_CUR=5, OPEN_BOX=6, 
		CLOSE_BOX=7, RHS_ASSIGNMENT=8, SINGLE_STRING=9, DOUBLE_STRING=10, COMMENT=11, 
		SPACE=12, FUNCTION=13, IF=14, THEN=15, ELIF=16, ELSE=17, FI=18, FOR=19, 
		WHILE=20, DO=21, SED=22, SED_FLAG=23, BREAK=24, CONTINUE=25, DONE=26, 
		COMMAND=27, VAR=28, WEBSITE=29, FILENAME=30, BASH_VAR=31, VAL=32, ASSIGN=33, 
		SEMICOLON=34, LOGICAL_OP=35, INCREMENT=36, COMPARE=37, BLOB=38, OTHER=39;
	public static final int
		RULE_code = 0, RULE_bashScript = 1, RULE_expressions = 2, RULE_loops = 3, 
		RULE_while_loop = 4, RULE_for_loop = 5, RULE_inside_for = 6, RULE_ifElse = 7, 
		RULE_function_def = 8, RULE_function_call = 9, RULE_multi_conditions = 10, 
		RULE_condition = 11, RULE_linux_command = 12, RULE_assignment = 13, RULE_advanced_assignment = 14, 
		RULE_command_data = 15, RULE_comparison = 16, RULE_increment = 17, RULE_open_bracket = 18, 
		RULE_close_bracket = 19, RULE_sed_flag = 20, RULE_sed = 21, RULE_space = 22, 
		RULE_string = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"code", "bashScript", "expressions", "loops", "while_loop", "for_loop", 
			"inside_for", "ifElse", "function_def", "function_call", "multi_conditions", 
			"condition", "linux_command", "assignment", "advanced_assignment", "command_data", 
			"comparison", "increment", "open_bracket", "close_bracket", "sed_flag", 
			"sed", "space", "string"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'('", "')'", "'{'", "'}'", "'['", "']'", null, null, null, 
			null, null, "'function'", "'if'", "'then'", "'elif'", "'else'", "'fi'", 
			"'for'", "'while'", "'do'", "'sed'", null, "'break'", "'continue'", "'done'", 
			null, null, null, null, null, null, "'='", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "OPEN_PAR", "CLOSE_PAR", "OPEN_CUR", "CLOSE_CUR", "OPEN_BOX", 
			"CLOSE_BOX", "RHS_ASSIGNMENT", "SINGLE_STRING", "DOUBLE_STRING", "COMMENT", 
			"SPACE", "FUNCTION", "IF", "THEN", "ELIF", "ELSE", "FI", "FOR", "WHILE", 
			"DO", "SED", "SED_FLAG", "BREAK", "CONTINUE", "DONE", "COMMAND", "VAR", 
			"WEBSITE", "FILENAME", "BASH_VAR", "VAL", "ASSIGN", "SEMICOLON", "LOGICAL_OP", 
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
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAR) | (1L << OPEN_CUR) | (1L << OPEN_BOX) | (1L << SPACE) | (1L << FUNCTION) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << SED) | (1L << COMMAND) | (1L << VAR))) != 0)) {
				{
				{
				setState(48);
				bashScript();
				}
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(54);
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
		public List<Function_callContext> function_call() {
			return getRuleContexts(Function_callContext.class);
		}
		public Function_callContext function_call(int i) {
			return getRuleContext(Function_callContext.class,i);
		}
		public List<Function_defContext> function_def() {
			return getRuleContexts(Function_defContext.class);
		}
		public Function_defContext function_def(int i) {
			return getRuleContext(Function_defContext.class,i);
		}
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
			setState(65); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(65);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						setState(56);
						function_call();
						}
						break;
					case 2:
						{
						setState(57);
						function_def();
						}
						break;
					case 3:
						{
						setState(58);
						loops();
						}
						break;
					case 4:
						{
						setState(59);
						assignment();
						}
						break;
					case 5:
						{
						setState(60);
						linux_command();
						}
						break;
					case 6:
						{
						setState(61);
						space();
						}
						break;
					case 7:
						{
						setState(62);
						advanced_assignment();
						}
						break;
					case 8:
						{
						setState(63);
						ifElse();
						}
						break;
					case 9:
						{
						setState(64);
						sed();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(67); 
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
		public List<Function_callContext> function_call() {
			return getRuleContexts(Function_callContext.class);
		}
		public Function_callContext function_call(int i) {
			return getRuleContext(Function_callContext.class,i);
		}
		public List<Function_defContext> function_def() {
			return getRuleContexts(Function_defContext.class);
		}
		public Function_defContext function_def(int i) {
			return getRuleContext(Function_defContext.class,i);
		}
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
		public List<SedContext> sed() {
			return getRuleContexts(SedContext.class);
		}
		public SedContext sed(int i) {
			return getRuleContext(SedContext.class,i);
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
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAR) | (1L << OPEN_CUR) | (1L << OPEN_BOX) | (1L << FUNCTION) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << SED) | (1L << BREAK) | (1L << CONTINUE) | (1L << COMMAND) | (1L << VAR))) != 0)) {
				{
				setState(85);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(69);
					function_call();
					}
					break;
				case 2:
					{
					setState(70);
					function_def();
					}
					break;
				case 3:
					{
					setState(71);
					loops();
					}
					break;
				case 4:
					{
					setState(72);
					assignment();
					}
					break;
				case 5:
					{
					setState(73);
					linux_command();
					}
					break;
				case 6:
					{
					setState(74);
					advanced_assignment();
					}
					break;
				case 7:
					{
					setState(75);
					ifElse();
					}
					break;
				case 8:
					{
					setState(76);
					sed();
					}
					break;
				case 9:
					{
					setState(77);
					match(BREAK);
					setState(79);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						setState(78);
						space();
						}
						break;
					}
					}
					break;
				case 10:
					{
					setState(81);
					match(CONTINUE);
					setState(83);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						setState(82);
						space();
						}
						break;
					}
					}
					break;
				}
				}
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(91);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(90);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bashGrammarListener ) ((bashGrammarListener)listener).enterLoops(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bashGrammarListener ) ((bashGrammarListener)listener).exitLoops(this);
		}
	}

	public final LoopsContext loops() throws RecognitionException {
		LoopsContext _localctx = new LoopsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_loops);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				{
				setState(93);
				while_loop();
				}
				break;
			case FOR:
				{
				setState(94);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bashGrammarListener ) ((bashGrammarListener)listener).enterWhile_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bashGrammarListener ) ((bashGrammarListener)listener).exitWhile_loop(this);
		}
	}

	public final While_loopContext while_loop() throws RecognitionException {
		While_loopContext _localctx = new While_loopContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_while_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(WHILE);
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(98);
				space();
				}
			}

			setState(101);
			multi_conditions();
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(102);
				match(SEMICOLON);
				}
			}

			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(105);
				space();
				}
			}

			setState(108);
			match(DO);
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(109);
				space();
				}
				break;
			}
			setState(112);
			expressions();
			setState(113);
			match(DONE);
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(114);
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
		public List<Open_bracketContext> open_bracket() {
			return getRuleContexts(Open_bracketContext.class);
		}
		public Open_bracketContext open_bracket(int i) {
			return getRuleContext(Open_bracketContext.class,i);
		}
		public Inside_forContext inside_for() {
			return getRuleContext(Inside_forContext.class,0);
		}
		public List<Close_bracketContext> close_bracket() {
			return getRuleContexts(Close_bracketContext.class);
		}
		public Close_bracketContext close_bracket(int i) {
			return getRuleContext(Close_bracketContext.class,i);
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
		enterRule(_localctx, 10, RULE_for_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(FOR);
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(118);
				space();
				}
			}

			setState(121);
			open_bracket();
			setState(122);
			open_bracket();
			setState(123);
			inside_for();
			setState(124);
			close_bracket();
			setState(125);
			close_bracket();
			setState(127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(126);
				space();
				}
				break;
			}
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(129);
				match(SEMICOLON);
				}
			}

			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(132);
				space();
				}
			}

			setState(135);
			match(DO);
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(136);
				space();
				}
				break;
			}
			setState(139);
			expressions();
			setState(140);
			match(DONE);
			setState(142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(141);
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
		enterRule(_localctx, 12, RULE_inside_for);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(144);
				space();
				}
			}

			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(147);
				assignment();
				}
			}

			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(150);
				match(T__0);
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE) {
					{
					setState(151);
					space();
					}
				}

				setState(154);
				assignment();
				}
				}
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(160);
			match(SEMICOLON);
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(161);
				space();
				}
				break;
			}
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << VAR) | (1L << VAL) | (1L << BLOB))) != 0)) {
				{
				setState(164);
				condition();
				}
			}

			setState(174);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(167);
					match(LOGICAL_OP);
					setState(169);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
					case 1:
						{
						setState(168);
						space();
						}
						break;
					}
					setState(171);
					condition();
					}
					} 
				}
				setState(176);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			setState(177);
			match(SEMICOLON);
			setState(179);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(178);
				space();
				}
				break;
			}
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR || _la==INCREMENT) {
				{
				setState(181);
				increment();
				}
			}

			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(184);
				match(T__0);
				setState(185);
				increment();
				}
				}
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(191);
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
		public List<Open_bracketContext> open_bracket() {
			return getRuleContexts(Open_bracketContext.class);
		}
		public Open_bracketContext open_bracket(int i) {
			return getRuleContext(Open_bracketContext.class,i);
		}
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public List<Close_bracketContext> close_bracket() {
			return getRuleContexts(Close_bracketContext.class);
		}
		public Close_bracketContext close_bracket(int i) {
			return getRuleContext(Close_bracketContext.class,i);
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
		enterRule(_localctx, 14, RULE_ifElse);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(IF);
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
			multi_conditions();
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(199);
				match(SEMICOLON);
				}
			}

			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(202);
				space();
				}
			}

			setState(205);
			match(THEN);
			setState(207);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(206);
				space();
				}
				break;
			}
			setState(209);
			expressions();
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELIF) {
				{
				{
				setState(210);
				match(ELIF);
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE) {
					{
					setState(211);
					space();
					}
				}

				setState(214);
				open_bracket();
				setState(215);
				open_bracket();
				setState(217);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(216);
					space();
					}
					break;
				}
				setState(219);
				condition();
				setState(224);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(220);
						match(LOGICAL_OP);
						setState(221);
						condition();
						}
						} 
					}
					setState(226);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				}
				setState(227);
				close_bracket();
				setState(228);
				close_bracket();
				setState(230);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(229);
					space();
					}
					break;
				}
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(232);
					match(SEMICOLON);
					}
				}

				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE) {
					{
					setState(235);
					space();
					}
				}

				setState(238);
				match(THEN);
				setState(240);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(239);
					space();
					}
					break;
				}
				setState(242);
				expressions();
				}
				}
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(249);
				match(ELSE);
				setState(251);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(250);
					space();
					}
					break;
				}
				setState(253);
				expressions();
				}
			}

			setState(256);
			match(FI);
			setState(258);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(257);
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

	public static class Function_defContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(bashGrammarParser.FUNCTION, 0); }
		public TerminalNode VAR() { return getToken(bashGrammarParser.VAR, 0); }
		public TerminalNode OPEN_PAR() { return getToken(bashGrammarParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(bashGrammarParser.CLOSE_PAR, 0); }
		public TerminalNode OPEN_CUR() { return getToken(bashGrammarParser.OPEN_CUR, 0); }
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public TerminalNode CLOSE_CUR() { return getToken(bashGrammarParser.CLOSE_CUR, 0); }
		public List<SpaceContext> space() {
			return getRuleContexts(SpaceContext.class);
		}
		public SpaceContext space(int i) {
			return getRuleContext(SpaceContext.class,i);
		}
		public Function_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bashGrammarListener ) ((bashGrammarListener)listener).enterFunction_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bashGrammarListener ) ((bashGrammarListener)listener).exitFunction_def(this);
		}
	}

	public final Function_defContext function_def() throws RecognitionException {
		Function_defContext _localctx = new Function_defContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_function_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(FUNCTION);
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(261);
				space();
				}
			}

			setState(264);
			match(VAR);
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(265);
				space();
				}
			}

			setState(268);
			match(OPEN_PAR);
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(269);
				space();
				}
			}

			setState(272);
			match(CLOSE_PAR);
			setState(274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(273);
				space();
				}
			}

			setState(276);
			match(OPEN_CUR);
			setState(278);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(277);
				space();
				}
				break;
			}
			setState(280);
			expressions();
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
			match(CLOSE_CUR);
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

	public static class Function_callContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(bashGrammarParser.VAR, 0); }
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
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bashGrammarListener ) ((bashGrammarListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bashGrammarListener ) ((bashGrammarListener)listener).exitFunction_call(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_function_call);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(VAR);
			setState(288);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(287);
				space();
				}
				break;
			}
			setState(293);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(290);
					command_data();
					}
					} 
				}
				setState(295);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			}
			setState(297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(296);
				match(SEMICOLON);
				}
			}

			setState(300);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(299);
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
		public List<Open_bracketContext> open_bracket() {
			return getRuleContexts(Open_bracketContext.class);
		}
		public Open_bracketContext open_bracket(int i) {
			return getRuleContext(Open_bracketContext.class,i);
		}
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public List<Close_bracketContext> close_bracket() {
			return getRuleContexts(Close_bracketContext.class);
		}
		public Close_bracketContext close_bracket(int i) {
			return getRuleContext(Close_bracketContext.class,i);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bashGrammarListener ) ((bashGrammarListener)listener).enterMulti_conditions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bashGrammarListener ) ((bashGrammarListener)listener).exitMulti_conditions(this);
		}
	}

	public final Multi_conditionsContext multi_conditions() throws RecognitionException {
		Multi_conditionsContext _localctx = new Multi_conditionsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_multi_conditions);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			open_bracket();
			setState(303);
			open_bracket();
			setState(305);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(304);
				space();
				}
				break;
			}
			setState(307);
			condition();
			setState(315);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(308);
					match(LOGICAL_OP);
					setState(310);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
					case 1:
						{
						setState(309);
						space();
						}
						break;
					}
					setState(312);
					condition();
					}
					} 
				}
				setState(317);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			}
			setState(318);
			close_bracket();
			setState(319);
			close_bracket();
			setState(321);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(320);
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
		enterRule(_localctx, 22, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(323);
				space();
				}
			}

			setState(327); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(326);
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
				setState(329); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << VAL) | (1L << BLOB))) != 0) );
			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(331);
				space();
				}
			}

			setState(334);
			match(COMPARE);
			setState(336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(335);
				space();
				}
			}

			setState(345); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(345);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
				case 1:
					{
					setState(338);
					string();
					}
					break;
				case 2:
					{
					setState(339);
					match(VAR);
					}
					break;
				case 3:
					{
					setState(340);
					match(VAL);
					}
					break;
				case 4:
					{
					setState(341);
					match(BLOB);
					}
					break;
				case 5:
					{
					setState(342);
					match(BASH_VAR);
					}
					break;
				case 6:
					{
					setState(343);
					match(RHS_ASSIGNMENT);
					}
					break;
				case 7:
					{
					setState(344);
					match(BLOB);
					}
					break;
				}
				}
				setState(347); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RHS_ASSIGNMENT) | (1L << SINGLE_STRING) | (1L << DOUBLE_STRING) | (1L << VAR) | (1L << BASH_VAR) | (1L << VAL) | (1L << BLOB))) != 0) );
			setState(350);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(349);
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
		enterRule(_localctx, 24, RULE_linux_command);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			match(COMMAND);
			setState(354);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				{
				setState(353);
				space();
				}
				break;
			}
			setState(359);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(356);
					command_data();
					}
					} 
				}
				setState(361);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			}
			setState(363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(362);
				match(SEMICOLON);
				}
			}

			setState(366);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				{
				setState(365);
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
		enterRule(_localctx, 26, RULE_assignment);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			match(VAR);
			setState(369);
			match(ASSIGN);
			setState(376); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(376);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case SINGLE_STRING:
					case DOUBLE_STRING:
						{
						setState(370);
						string();
						}
						break;
					case VAL:
						{
						setState(371);
						match(VAL);
						}
						break;
					case VAR:
						{
						setState(372);
						match(VAR);
						}
						break;
					case BASH_VAR:
						{
						setState(373);
						match(BASH_VAR);
						}
						break;
					case RHS_ASSIGNMENT:
						{
						setState(374);
						match(RHS_ASSIGNMENT);
						}
						break;
					case BLOB:
						{
						setState(375);
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
				setState(378); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(381);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				setState(380);
				match(SEMICOLON);
				}
				break;
			}
			setState(384);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				setState(383);
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
		public List<Open_bracketContext> open_bracket() {
			return getRuleContexts(Open_bracketContext.class);
		}
		public Open_bracketContext open_bracket(int i) {
			return getRuleContext(Open_bracketContext.class,i);
		}
		public List<TerminalNode> VAR() { return getTokens(bashGrammarParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(bashGrammarParser.VAR, i);
		}
		public List<Close_bracketContext> close_bracket() {
			return getRuleContexts(Close_bracketContext.class);
		}
		public Close_bracketContext close_bracket(int i) {
			return getRuleContext(Close_bracketContext.class,i);
		}
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
		enterRule(_localctx, 28, RULE_advanced_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			open_bracket();
			setState(387);
			open_bracket();
			setState(389);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(388);
				space();
				}
			}

			setState(391);
			match(VAR);
			setState(393);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(392);
				space();
				}
			}

			setState(395);
			_la = _input.LA(1);
			if ( !(_la==ASSIGN || _la==INCREMENT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(397);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				{
				setState(396);
				space();
				}
				break;
			}
			setState(407);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RHS_ASSIGNMENT) | (1L << SINGLE_STRING) | (1L << DOUBLE_STRING) | (1L << VAR) | (1L << BASH_VAR) | (1L << VAL) | (1L << BLOB))) != 0)) {
				{
				setState(405);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SINGLE_STRING:
				case DOUBLE_STRING:
					{
					setState(399);
					string();
					}
					break;
				case VAL:
					{
					setState(400);
					match(VAL);
					}
					break;
				case VAR:
					{
					setState(401);
					match(VAR);
					}
					break;
				case BASH_VAR:
					{
					setState(402);
					match(BASH_VAR);
					}
					break;
				case RHS_ASSIGNMENT:
					{
					setState(403);
					match(RHS_ASSIGNMENT);
					}
					break;
				case BLOB:
					{
					setState(404);
					match(BLOB);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(409);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(411);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(410);
				space();
				}
			}

			setState(413);
			close_bracket();
			setState(414);
			close_bracket();
			setState(416);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(415);
				match(SEMICOLON);
				}
			}

			setState(419);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				{
				setState(418);
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
		enterRule(_localctx, 30, RULE_command_data);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				{
				setState(421);
				match(VAR);
				}
				break;
			case 2:
				{
				setState(422);
				match(VAL);
				}
				break;
			case 3:
				{
				setState(423);
				match(BLOB);
				}
				break;
			case 4:
				{
				setState(424);
				match(BASH_VAR);
				}
				break;
			case 5:
				{
				setState(425);
				string();
				}
				break;
			case 6:
				{
				setState(426);
				match(INCREMENT);
				}
				break;
			case 7:
				{
				setState(427);
				match(OTHER);
				}
				break;
			case 8:
				{
				setState(428);
				space();
				}
				break;
			case 9:
				{
				setState(429);
				sed_flag();
				}
				break;
			case 10:
				{
				setState(430);
				match(FILENAME);
				}
				break;
			case 11:
				{
				setState(431);
				match(WEBSITE);
				}
				break;
			case 12:
				{
				setState(432);
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
		enterRule(_localctx, 32, RULE_comparison);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			match(VAR);
			setState(436);
			match(COMPARE);
			setState(437);
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
		enterRule(_localctx, 34, RULE_increment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				{
				setState(439);
				match(VAR);
				setState(440);
				match(INCREMENT);
				setState(446);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BLOB:
					{
					setState(441);
					match(BLOB);
					}
					break;
				case VAR:
					{
					setState(442);
					match(VAR);
					}
					break;
				case VAL:
					{
					setState(443);
					match(VAL);
					}
					break;
				case SINGLE_STRING:
				case DOUBLE_STRING:
					{
					setState(444);
					string();
					}
					break;
				case BASH_VAR:
					{
					setState(445);
					match(BASH_VAR);
					}
					break;
				case T__0:
				case CLOSE_PAR:
				case CLOSE_CUR:
				case CLOSE_BOX:
				case SPACE:
					break;
				default:
					break;
				}
				}
				break;
			case INCREMENT:
				{
				setState(448);
				match(INCREMENT);
				setState(449);
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

	public static class Open_bracketContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR() { return getToken(bashGrammarParser.OPEN_PAR, 0); }
		public TerminalNode OPEN_CUR() { return getToken(bashGrammarParser.OPEN_CUR, 0); }
		public TerminalNode OPEN_BOX() { return getToken(bashGrammarParser.OPEN_BOX, 0); }
		public Open_bracketContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_open_bracket; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bashGrammarListener ) ((bashGrammarListener)listener).enterOpen_bracket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bashGrammarListener ) ((bashGrammarListener)listener).exitOpen_bracket(this);
		}
	}

	public final Open_bracketContext open_bracket() throws RecognitionException {
		Open_bracketContext _localctx = new Open_bracketContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_open_bracket);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAR) | (1L << OPEN_CUR) | (1L << OPEN_BOX))) != 0)) ) {
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

	public static class Close_bracketContext extends ParserRuleContext {
		public TerminalNode CLOSE_PAR() { return getToken(bashGrammarParser.CLOSE_PAR, 0); }
		public TerminalNode CLOSE_CUR() { return getToken(bashGrammarParser.CLOSE_CUR, 0); }
		public TerminalNode CLOSE_BOX() { return getToken(bashGrammarParser.CLOSE_BOX, 0); }
		public Close_bracketContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_close_bracket; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bashGrammarListener ) ((bashGrammarListener)listener).enterClose_bracket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bashGrammarListener ) ((bashGrammarListener)listener).exitClose_bracket(this);
		}
	}

	public final Close_bracketContext close_bracket() throws RecognitionException {
		Close_bracketContext _localctx = new Close_bracketContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_close_bracket);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLOSE_PAR) | (1L << CLOSE_CUR) | (1L << CLOSE_BOX))) != 0)) ) {
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
		enterRule(_localctx, 40, RULE_sed_flag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
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
		enterRule(_localctx, 42, RULE_sed);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			match(SED);
			setState(459);
			space();
			setState(466);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SED_FLAG || _la==VAL) {
				{
				{
				setState(460);
				sed_flag();
				setState(462);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE) {
					{
					setState(461);
					match(SPACE);
					}
				}

				}
				}
				setState(468);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(469);
			string();
			setState(470);
			space();
			setState(471);
			_la = _input.LA(1);
			if ( !(_la==VAR || _la==FILENAME) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(472);
			space();
			setState(476);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(473);
					match(COMPARE);
					}
					} 
				}
				setState(478);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
			}
			setState(482);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(479);
				match(SPACE);
				}
				}
				setState(484);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(488);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAR || _la==FILENAME) {
				{
				{
				setState(485);
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
				setState(490);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(491);
			match(COMPARE);
			setState(495);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(492);
				match(SPACE);
				}
				}
				setState(497);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(498);
			_la = _input.LA(1);
			if ( !(_la==VAR || _la==FILENAME) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(500);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(499);
				match(SEMICOLON);
				}
			}

			setState(503);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				{
				setState(502);
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
		enterRule(_localctx, 44, RULE_space);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(506); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(505);
					match(SPACE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(508); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
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
		enterRule(_localctx, 46, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3)\u0203\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\7\2\64\n\2\f\2\16\2\67\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\6\3D\n\3\r\3\16\3E\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4"+
		"R\n\4\3\4\3\4\5\4V\n\4\7\4X\n\4\f\4\16\4[\13\4\3\4\5\4^\n\4\3\5\3\5\5"+
		"\5b\n\5\3\6\3\6\5\6f\n\6\3\6\3\6\5\6j\n\6\3\6\5\6m\n\6\3\6\3\6\5\6q\n"+
		"\6\3\6\3\6\3\6\5\6v\n\6\3\7\3\7\5\7z\n\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0082"+
		"\n\7\3\7\5\7\u0085\n\7\3\7\5\7\u0088\n\7\3\7\3\7\5\7\u008c\n\7\3\7\3\7"+
		"\3\7\5\7\u0091\n\7\3\b\5\b\u0094\n\b\3\b\5\b\u0097\n\b\3\b\3\b\5\b\u009b"+
		"\n\b\3\b\7\b\u009e\n\b\f\b\16\b\u00a1\13\b\3\b\3\b\5\b\u00a5\n\b\3\b\5"+
		"\b\u00a8\n\b\3\b\3\b\5\b\u00ac\n\b\3\b\7\b\u00af\n\b\f\b\16\b\u00b2\13"+
		"\b\3\b\3\b\5\b\u00b6\n\b\3\b\5\b\u00b9\n\b\3\b\3\b\7\b\u00bd\n\b\f\b\16"+
		"\b\u00c0\13\b\3\b\5\b\u00c3\n\b\3\t\3\t\5\t\u00c7\n\t\3\t\3\t\5\t\u00cb"+
		"\n\t\3\t\5\t\u00ce\n\t\3\t\3\t\5\t\u00d2\n\t\3\t\3\t\3\t\5\t\u00d7\n\t"+
		"\3\t\3\t\3\t\5\t\u00dc\n\t\3\t\3\t\3\t\7\t\u00e1\n\t\f\t\16\t\u00e4\13"+
		"\t\3\t\3\t\3\t\5\t\u00e9\n\t\3\t\5\t\u00ec\n\t\3\t\5\t\u00ef\n\t\3\t\3"+
		"\t\5\t\u00f3\n\t\3\t\3\t\7\t\u00f7\n\t\f\t\16\t\u00fa\13\t\3\t\3\t\5\t"+
		"\u00fe\n\t\3\t\5\t\u0101\n\t\3\t\3\t\5\t\u0105\n\t\3\n\3\n\5\n\u0109\n"+
		"\n\3\n\3\n\5\n\u010d\n\n\3\n\3\n\5\n\u0111\n\n\3\n\3\n\5\n\u0115\n\n\3"+
		"\n\3\n\5\n\u0119\n\n\3\n\3\n\5\n\u011d\n\n\3\n\3\n\3\13\3\13\5\13\u0123"+
		"\n\13\3\13\7\13\u0126\n\13\f\13\16\13\u0129\13\13\3\13\5\13\u012c\n\13"+
		"\3\13\5\13\u012f\n\13\3\f\3\f\3\f\5\f\u0134\n\f\3\f\3\f\3\f\5\f\u0139"+
		"\n\f\3\f\7\f\u013c\n\f\f\f\16\f\u013f\13\f\3\f\3\f\3\f\5\f\u0144\n\f\3"+
		"\r\5\r\u0147\n\r\3\r\6\r\u014a\n\r\r\r\16\r\u014b\3\r\5\r\u014f\n\r\3"+
		"\r\3\r\5\r\u0153\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\6\r\u015c\n\r\r\r\16"+
		"\r\u015d\3\r\5\r\u0161\n\r\3\16\3\16\5\16\u0165\n\16\3\16\7\16\u0168\n"+
		"\16\f\16\16\16\u016b\13\16\3\16\5\16\u016e\n\16\3\16\5\16\u0171\n\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\6\17\u017b\n\17\r\17\16\17\u017c"+
		"\3\17\5\17\u0180\n\17\3\17\5\17\u0183\n\17\3\20\3\20\3\20\5\20\u0188\n"+
		"\20\3\20\3\20\5\20\u018c\n\20\3\20\3\20\5\20\u0190\n\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\7\20\u0198\n\20\f\20\16\20\u019b\13\20\3\20\5\20\u019e"+
		"\n\20\3\20\3\20\3\20\5\20\u01a3\n\20\3\20\5\20\u01a6\n\20\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u01b4\n\21\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u01c1\n\23\3\23"+
		"\3\23\5\23\u01c5\n\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27"+
		"\5\27\u01d1\n\27\7\27\u01d3\n\27\f\27\16\27\u01d6\13\27\3\27\3\27\3\27"+
		"\3\27\3\27\7\27\u01dd\n\27\f\27\16\27\u01e0\13\27\3\27\7\27\u01e3\n\27"+
		"\f\27\16\27\u01e6\13\27\3\27\7\27\u01e9\n\27\f\27\16\27\u01ec\13\27\3"+
		"\27\3\27\7\27\u01f0\n\27\f\27\16\27\u01f3\13\27\3\27\3\27\5\27\u01f7\n"+
		"\27\3\27\5\27\u01fa\n\27\3\30\6\30\u01fd\n\30\r\30\16\30\u01fe\3\31\3"+
		"\31\3\31\7\u00b0\u00e2\u0127\u013d\u0169\2\32\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\2\t\5\2\36\36\"\"((\4\2##&&\5\2\4\4\6\6\b"+
		"\b\5\2\5\5\7\7\t\t\4\2\31\31\"\"\4\2\36\36  \3\2\13\f\2\u0274\2\65\3\2"+
		"\2\2\4C\3\2\2\2\6Y\3\2\2\2\ba\3\2\2\2\nc\3\2\2\2\fw\3\2\2\2\16\u0093\3"+
		"\2\2\2\20\u00c4\3\2\2\2\22\u0106\3\2\2\2\24\u0120\3\2\2\2\26\u0130\3\2"+
		"\2\2\30\u0146\3\2\2\2\32\u0162\3\2\2\2\34\u0172\3\2\2\2\36\u0184\3\2\2"+
		"\2 \u01b3\3\2\2\2\"\u01b5\3\2\2\2$\u01c4\3\2\2\2&\u01c6\3\2\2\2(\u01c8"+
		"\3\2\2\2*\u01ca\3\2\2\2,\u01cc\3\2\2\2.\u01fc\3\2\2\2\60\u0200\3\2\2\2"+
		"\62\64\5\4\3\2\63\62\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2"+
		"\668\3\2\2\2\67\65\3\2\2\289\7\2\2\39\3\3\2\2\2:D\5\24\13\2;D\5\22\n\2"+
		"<D\5\b\5\2=D\5\34\17\2>D\5\32\16\2?D\5.\30\2@D\5\36\20\2AD\5\20\t\2BD"+
		"\5,\27\2C:\3\2\2\2C;\3\2\2\2C<\3\2\2\2C=\3\2\2\2C>\3\2\2\2C?\3\2\2\2C"+
		"@\3\2\2\2CA\3\2\2\2CB\3\2\2\2DE\3\2\2\2EC\3\2\2\2EF\3\2\2\2F\5\3\2\2\2"+
		"GX\5\24\13\2HX\5\22\n\2IX\5\b\5\2JX\5\34\17\2KX\5\32\16\2LX\5\36\20\2"+
		"MX\5\20\t\2NX\5,\27\2OQ\7\32\2\2PR\5.\30\2QP\3\2\2\2QR\3\2\2\2RX\3\2\2"+
		"\2SU\7\33\2\2TV\5.\30\2UT\3\2\2\2UV\3\2\2\2VX\3\2\2\2WG\3\2\2\2WH\3\2"+
		"\2\2WI\3\2\2\2WJ\3\2\2\2WK\3\2\2\2WL\3\2\2\2WM\3\2\2\2WN\3\2\2\2WO\3\2"+
		"\2\2WS\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2\\^\5"+
		".\30\2]\\\3\2\2\2]^\3\2\2\2^\7\3\2\2\2_b\5\n\6\2`b\5\f\7\2a_\3\2\2\2a"+
		"`\3\2\2\2b\t\3\2\2\2ce\7\26\2\2df\5.\30\2ed\3\2\2\2ef\3\2\2\2fg\3\2\2"+
		"\2gi\5\26\f\2hj\7$\2\2ih\3\2\2\2ij\3\2\2\2jl\3\2\2\2km\5.\30\2lk\3\2\2"+
		"\2lm\3\2\2\2mn\3\2\2\2np\7\27\2\2oq\5.\30\2po\3\2\2\2pq\3\2\2\2qr\3\2"+
		"\2\2rs\5\6\4\2su\7\34\2\2tv\5.\30\2ut\3\2\2\2uv\3\2\2\2v\13\3\2\2\2wy"+
		"\7\25\2\2xz\5.\30\2yx\3\2\2\2yz\3\2\2\2z{\3\2\2\2{|\5&\24\2|}\5&\24\2"+
		"}~\5\16\b\2~\177\5(\25\2\177\u0081\5(\25\2\u0080\u0082\5.\30\2\u0081\u0080"+
		"\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0084\3\2\2\2\u0083\u0085\7$\2\2\u0084"+
		"\u0083\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0087\3\2\2\2\u0086\u0088\5."+
		"\30\2\u0087\u0086\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\3\2\2\2\u0089"+
		"\u008b\7\27\2\2\u008a\u008c\5.\30\2\u008b\u008a\3\2\2\2\u008b\u008c\3"+
		"\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e\5\6\4\2\u008e\u0090\7\34\2\2\u008f"+
		"\u0091\5.\30\2\u0090\u008f\3\2\2\2\u0090\u0091\3\2\2\2\u0091\r\3\2\2\2"+
		"\u0092\u0094\5.\30\2\u0093\u0092\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0096"+
		"\3\2\2\2\u0095\u0097\5\34\17\2\u0096\u0095\3\2\2\2\u0096\u0097\3\2\2\2"+
		"\u0097\u009f\3\2\2\2\u0098\u009a\7\3\2\2\u0099\u009b\5.\30\2\u009a\u0099"+
		"\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009e\5\34\17\2"+
		"\u009d\u0098\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0"+
		"\3\2\2\2\u00a0\u00a2\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a4\7$\2\2\u00a3"+
		"\u00a5\5.\30\2\u00a4\u00a3\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a7\3\2"+
		"\2\2\u00a6\u00a8\5\30\r\2\u00a7\u00a6\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8"+
		"\u00b0\3\2\2\2\u00a9\u00ab\7%\2\2\u00aa\u00ac\5.\30\2\u00ab\u00aa\3\2"+
		"\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00af\5\30\r\2\u00ae"+
		"\u00a9\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b0\u00ae\3\2"+
		"\2\2\u00b1\u00b3\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00b5\7$\2\2\u00b4"+
		"\u00b6\5.\30\2\u00b5\u00b4\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b8\3\2"+
		"\2\2\u00b7\u00b9\5$\23\2\u00b8\u00b7\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9"+
		"\u00be\3\2\2\2\u00ba\u00bb\7\3\2\2\u00bb\u00bd\5$\23\2\u00bc\u00ba\3\2"+
		"\2\2\u00bd\u00c0\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf"+
		"\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1\u00c3\5.\30\2\u00c2\u00c1\3\2"+
		"\2\2\u00c2\u00c3\3\2\2\2\u00c3\17\3\2\2\2\u00c4\u00c6\7\20\2\2\u00c5\u00c7"+
		"\5.\30\2\u00c6\u00c5\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8"+
		"\u00ca\5\26\f\2\u00c9\u00cb\7$\2\2\u00ca\u00c9\3\2\2\2\u00ca\u00cb\3\2"+
		"\2\2\u00cb\u00cd\3\2\2\2\u00cc\u00ce\5.\30\2\u00cd\u00cc\3\2\2\2\u00cd"+
		"\u00ce\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d1\7\21\2\2\u00d0\u00d2\5"+
		".\30\2\u00d1\u00d0\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3"+
		"\u00f8\5\6\4\2\u00d4\u00d6\7\22\2\2\u00d5\u00d7\5.\30\2\u00d6\u00d5\3"+
		"\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9\5&\24\2\u00d9"+
		"\u00db\5&\24\2\u00da\u00dc\5.\30\2\u00db\u00da\3\2\2\2\u00db\u00dc\3\2"+
		"\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00e2\5\30\r\2\u00de\u00df\7%\2\2\u00df"+
		"\u00e1\5\30\r\2\u00e0\u00de\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e3\3"+
		"\2\2\2\u00e2\u00e0\3\2\2\2\u00e3\u00e5\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5"+
		"\u00e6\5(\25\2\u00e6\u00e8\5(\25\2\u00e7\u00e9\5.\30\2\u00e8\u00e7\3\2"+
		"\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00eb\3\2\2\2\u00ea\u00ec\7$\2\2\u00eb"+
		"\u00ea\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ee\3\2\2\2\u00ed\u00ef\5."+
		"\30\2\u00ee\u00ed\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0"+
		"\u00f2\7\21\2\2\u00f1\u00f3\5.\30\2\u00f2\u00f1\3\2\2\2\u00f2\u00f3\3"+
		"\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f5\5\6\4\2\u00f5\u00f7\3\2\2\2\u00f6"+
		"\u00d4\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2"+
		"\2\2\u00f9\u0100\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00fd\7\23\2\2\u00fc"+
		"\u00fe\5.\30\2\u00fd\u00fc\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00ff\3\2"+
		"\2\2\u00ff\u0101\5\6\4\2\u0100\u00fb\3\2\2\2\u0100\u0101\3\2\2\2\u0101"+
		"\u0102\3\2\2\2\u0102\u0104\7\24\2\2\u0103\u0105\5.\30\2\u0104\u0103\3"+
		"\2\2\2\u0104\u0105\3\2\2\2\u0105\21\3\2\2\2\u0106\u0108\7\17\2\2\u0107"+
		"\u0109\5.\30\2\u0108\u0107\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010a\3\2"+
		"\2\2\u010a\u010c\7\36\2\2\u010b\u010d\5.\30\2\u010c\u010b\3\2\2\2\u010c"+
		"\u010d\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u0110\7\4\2\2\u010f\u0111\5."+
		"\30\2\u0110\u010f\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0112\3\2\2\2\u0112"+
		"\u0114\7\5\2\2\u0113\u0115\5.\30\2\u0114\u0113\3\2\2\2\u0114\u0115\3\2"+
		"\2\2\u0115\u0116\3\2\2\2\u0116\u0118\7\6\2\2\u0117\u0119\5.\30\2\u0118"+
		"\u0117\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011c\5\6"+
		"\4\2\u011b\u011d\5.\30\2\u011c\u011b\3\2\2\2\u011c\u011d\3\2\2\2\u011d"+
		"\u011e\3\2\2\2\u011e\u011f\7\7\2\2\u011f\23\3\2\2\2\u0120\u0122\7\36\2"+
		"\2\u0121\u0123\5.\30\2\u0122\u0121\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0127"+
		"\3\2\2\2\u0124\u0126\5 \21\2\u0125\u0124\3\2\2\2\u0126\u0129\3\2\2\2\u0127"+
		"\u0128\3\2\2\2\u0127\u0125\3\2\2\2\u0128\u012b\3\2\2\2\u0129\u0127\3\2"+
		"\2\2\u012a\u012c\7$\2\2\u012b\u012a\3\2\2\2\u012b\u012c\3\2\2\2\u012c"+
		"\u012e\3\2\2\2\u012d\u012f\5.\30\2\u012e\u012d\3\2\2\2\u012e\u012f\3\2"+
		"\2\2\u012f\25\3\2\2\2\u0130\u0131\5&\24\2\u0131\u0133\5&\24\2\u0132\u0134"+
		"\5.\30\2\u0133\u0132\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0135\3\2\2\2\u0135"+
		"\u013d\5\30\r\2\u0136\u0138\7%\2\2\u0137\u0139\5.\30\2\u0138\u0137\3\2"+
		"\2\2\u0138\u0139\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013c\5\30\r\2\u013b"+
		"\u0136\3\2\2\2\u013c\u013f\3\2\2\2\u013d\u013e\3\2\2\2\u013d\u013b\3\2"+
		"\2\2\u013e\u0140\3\2\2\2\u013f\u013d\3\2\2\2\u0140\u0141\5(\25\2\u0141"+
		"\u0143\5(\25\2\u0142\u0144\5.\30\2\u0143\u0142\3\2\2\2\u0143\u0144\3\2"+
		"\2\2\u0144\27\3\2\2\2\u0145\u0147\5.\30\2\u0146\u0145\3\2\2\2\u0146\u0147"+
		"\3\2\2\2\u0147\u0149\3\2\2\2\u0148\u014a\t\2\2\2\u0149\u0148\3\2\2\2\u014a"+
		"\u014b\3\2\2\2\u014b\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014e\3\2"+
		"\2\2\u014d\u014f\5.\30\2\u014e\u014d\3\2\2\2\u014e\u014f\3\2\2\2\u014f"+
		"\u0150\3\2\2\2\u0150\u0152\7\'\2\2\u0151\u0153\5.\30\2\u0152\u0151\3\2"+
		"\2\2\u0152\u0153\3\2\2\2\u0153\u015b\3\2\2\2\u0154\u015c\5\60\31\2\u0155"+
		"\u015c\7\36\2\2\u0156\u015c\7\"\2\2\u0157\u015c\7(\2\2\u0158\u015c\7!"+
		"\2\2\u0159\u015c\7\n\2\2\u015a\u015c\7(\2\2\u015b\u0154\3\2\2\2\u015b"+
		"\u0155\3\2\2\2\u015b\u0156\3\2\2\2\u015b\u0157\3\2\2\2\u015b\u0158\3\2"+
		"\2\2\u015b\u0159\3\2\2\2\u015b\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d"+
		"\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u0160\3\2\2\2\u015f\u0161\5."+
		"\30\2\u0160\u015f\3\2\2\2\u0160\u0161\3\2\2\2\u0161\31\3\2\2\2\u0162\u0164"+
		"\7\35\2\2\u0163\u0165\5.\30\2\u0164\u0163\3\2\2\2\u0164\u0165\3\2\2\2"+
		"\u0165\u0169\3\2\2\2\u0166\u0168\5 \21\2\u0167\u0166\3\2\2\2\u0168\u016b"+
		"\3\2\2\2\u0169\u016a\3\2\2\2\u0169\u0167\3\2\2\2\u016a\u016d\3\2\2\2\u016b"+
		"\u0169\3\2\2\2\u016c\u016e\7$\2\2\u016d\u016c\3\2\2\2\u016d\u016e\3\2"+
		"\2\2\u016e\u0170\3\2\2\2\u016f\u0171\5.\30\2\u0170\u016f\3\2\2\2\u0170"+
		"\u0171\3\2\2\2\u0171\33\3\2\2\2\u0172\u0173\7\36\2\2\u0173\u017a\7#\2"+
		"\2\u0174\u017b\5\60\31\2\u0175\u017b\7\"\2\2\u0176\u017b\7\36\2\2\u0177"+
		"\u017b\7!\2\2\u0178\u017b\7\n\2\2\u0179\u017b\7(\2\2\u017a\u0174\3\2\2"+
		"\2\u017a\u0175\3\2\2\2\u017a\u0176\3\2\2\2\u017a\u0177\3\2\2\2\u017a\u0178"+
		"\3\2\2\2\u017a\u0179\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017a\3\2\2\2\u017c"+
		"\u017d\3\2\2\2\u017d\u017f\3\2\2\2\u017e\u0180\7$\2\2\u017f\u017e\3\2"+
		"\2\2\u017f\u0180\3\2\2\2\u0180\u0182\3\2\2\2\u0181\u0183\5.\30\2\u0182"+
		"\u0181\3\2\2\2\u0182\u0183\3\2\2\2\u0183\35\3\2\2\2\u0184\u0185\5&\24"+
		"\2\u0185\u0187\5&\24\2\u0186\u0188\5.\30\2\u0187\u0186\3\2\2\2\u0187\u0188"+
		"\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u018b\7\36\2\2\u018a\u018c\5.\30\2"+
		"\u018b\u018a\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018f"+
		"\t\3\2\2\u018e\u0190\5.\30\2\u018f\u018e\3\2\2\2\u018f\u0190\3\2\2\2\u0190"+
		"\u0199\3\2\2\2\u0191\u0198\5\60\31\2\u0192\u0198\7\"\2\2\u0193\u0198\7"+
		"\36\2\2\u0194\u0198\7!\2\2\u0195\u0198\7\n\2\2\u0196\u0198\7(\2\2\u0197"+
		"\u0191\3\2\2\2\u0197\u0192\3\2\2\2\u0197\u0193\3\2\2\2\u0197\u0194\3\2"+
		"\2\2\u0197\u0195\3\2\2\2\u0197\u0196\3\2\2\2\u0198\u019b\3\2\2\2\u0199"+
		"\u0197\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u019d\3\2\2\2\u019b\u0199\3\2"+
		"\2\2\u019c\u019e\5.\30\2\u019d\u019c\3\2\2\2\u019d\u019e\3\2\2\2\u019e"+
		"\u019f\3\2\2\2\u019f\u01a0\5(\25\2\u01a0\u01a2\5(\25\2\u01a1\u01a3\7$"+
		"\2\2\u01a2\u01a1\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a5\3\2\2\2\u01a4"+
		"\u01a6\5.\30\2\u01a5\u01a4\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\37\3\2\2"+
		"\2\u01a7\u01b4\7\36\2\2\u01a8\u01b4\7\"\2\2\u01a9\u01b4\7(\2\2\u01aa\u01b4"+
		"\7!\2\2\u01ab\u01b4\5\60\31\2\u01ac\u01b4\7&\2\2\u01ad\u01b4\7)\2\2\u01ae"+
		"\u01b4\5.\30\2\u01af\u01b4\5*\26\2\u01b0\u01b4\7 \2\2\u01b1\u01b4\7\37"+
		"\2\2\u01b2\u01b4\7\n\2\2\u01b3\u01a7\3\2\2\2\u01b3\u01a8\3\2\2\2\u01b3"+
		"\u01a9\3\2\2\2\u01b3\u01aa\3\2\2\2\u01b3\u01ab\3\2\2\2\u01b3\u01ac\3\2"+
		"\2\2\u01b3\u01ad\3\2\2\2\u01b3\u01ae\3\2\2\2\u01b3\u01af\3\2\2\2\u01b3"+
		"\u01b0\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b3\u01b2\3\2\2\2\u01b4!\3\2\2\2"+
		"\u01b5\u01b6\7\36\2\2\u01b6\u01b7\7\'\2\2\u01b7\u01b8\7\"\2\2\u01b8#\3"+
		"\2\2\2\u01b9\u01ba\7\36\2\2\u01ba\u01c0\7&\2\2\u01bb\u01c1\7(\2\2\u01bc"+
		"\u01c1\7\36\2\2\u01bd\u01c1\7\"\2\2\u01be\u01c1\5\60\31\2\u01bf\u01c1"+
		"\7!\2\2\u01c0\u01bb\3\2\2\2\u01c0\u01bc\3\2\2\2\u01c0\u01bd\3\2\2\2\u01c0"+
		"\u01be\3\2\2\2\u01c0\u01bf\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c5\3\2"+
		"\2\2\u01c2\u01c3\7&\2\2\u01c3\u01c5\7\36\2\2\u01c4\u01b9\3\2\2\2\u01c4"+
		"\u01c2\3\2\2\2\u01c5%\3\2\2\2\u01c6\u01c7\t\4\2\2\u01c7\'\3\2\2\2\u01c8"+
		"\u01c9\t\5\2\2\u01c9)\3\2\2\2\u01ca\u01cb\t\6\2\2\u01cb+\3\2\2\2\u01cc"+
		"\u01cd\7\30\2\2\u01cd\u01d4\5.\30\2\u01ce\u01d0\5*\26\2\u01cf\u01d1\7"+
		"\16\2\2\u01d0\u01cf\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01d3\3\2\2\2\u01d2"+
		"\u01ce\3\2\2\2\u01d3\u01d6\3\2\2\2\u01d4\u01d2\3\2\2\2\u01d4\u01d5\3\2"+
		"\2\2\u01d5\u01d7\3\2\2\2\u01d6\u01d4\3\2\2\2\u01d7\u01d8\5\60\31\2\u01d8"+
		"\u01d9\5.\30\2\u01d9\u01da\t\7\2\2\u01da\u01de\5.\30\2\u01db\u01dd\7\'"+
		"\2\2\u01dc\u01db\3\2\2\2\u01dd\u01e0\3\2\2\2\u01de\u01dc\3\2\2\2\u01de"+
		"\u01df\3\2\2\2\u01df\u01e4\3\2\2\2\u01e0\u01de\3\2\2\2\u01e1\u01e3\7\16"+
		"\2\2\u01e2\u01e1\3\2\2\2\u01e3\u01e6\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e4"+
		"\u01e5\3\2\2\2\u01e5\u01ea\3\2\2\2\u01e6\u01e4\3\2\2\2\u01e7\u01e9\t\7"+
		"\2\2\u01e8\u01e7\3\2\2\2\u01e9\u01ec\3\2\2\2\u01ea\u01e8\3\2\2\2\u01ea"+
		"\u01eb\3\2\2\2\u01eb\u01ed\3\2\2\2\u01ec\u01ea\3\2\2\2\u01ed\u01f1\7\'"+
		"\2\2\u01ee\u01f0\7\16\2\2\u01ef\u01ee\3\2\2\2\u01f0\u01f3\3\2\2\2\u01f1"+
		"\u01ef\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01f4\3\2\2\2\u01f3\u01f1\3\2"+
		"\2\2\u01f4\u01f6\t\7\2\2\u01f5\u01f7\7$\2\2\u01f6\u01f5\3\2\2\2\u01f6"+
		"\u01f7\3\2\2\2\u01f7\u01f9\3\2\2\2\u01f8\u01fa\5.\30\2\u01f9\u01f8\3\2"+
		"\2\2\u01f9\u01fa\3\2\2\2\u01fa-\3\2\2\2\u01fb\u01fd\7\16\2\2\u01fc\u01fb"+
		"\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe\u01fc\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff"+
		"/\3\2\2\2\u0200\u0201\t\b\2\2\u0201\61\3\2\2\2b\65CEQUWY]aeilpuy\u0081"+
		"\u0084\u0087\u008b\u0090\u0093\u0096\u009a\u009f\u00a4\u00a7\u00ab\u00b0"+
		"\u00b5\u00b8\u00be\u00c2\u00c6\u00ca\u00cd\u00d1\u00d6\u00db\u00e2\u00e8"+
		"\u00eb\u00ee\u00f2\u00f8\u00fd\u0100\u0104\u0108\u010c\u0110\u0114\u0118"+
		"\u011c\u0122\u0127\u012b\u012e\u0133\u0138\u013d\u0143\u0146\u014b\u014e"+
		"\u0152\u015b\u015d\u0160\u0164\u0169\u016d\u0170\u017a\u017c\u017f\u0182"+
		"\u0187\u018b\u018f\u0197\u0199\u019d\u01a2\u01a5\u01b3\u01c0\u01c4\u01d0"+
		"\u01d4\u01de\u01e4\u01ea\u01f1\u01f6\u01f9\u01fe";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}