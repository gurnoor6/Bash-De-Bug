<<<<<<< HEAD
// Generated from bashGrammar.g4 by ANTLR 4.8
=======
// Generated from bashGrammar.g4 by ANTLR 4.9
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
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
<<<<<<< HEAD
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }
=======
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
<<<<<<< HEAD
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
=======
		T__0=1, OPEN_PAR=2, CLOSE_PAR=3, OPEN_CUR=4, CLOSE_CUR=5, OPEN_BOX=6, 
		CLOSE_BOX=7, RHS_ASSIGNMENT=8, SINGLE_STRING=9, DOUBLE_STRING=10, COMMENT=11, 
		SPACE=12, FUNCTION=13, IF=14, THEN=15, ELIF=16, ELSE=17, FI=18, FOR=19, 
		WHILE=20, DO=21, BREAK=22, CONTINUE=23, DONE=24, COMMAND=25, VAR=26, BASH_VAR=27, 
		VAL=28, ASSIGN=29, SEMICOLON=30, LOGICAL_OP=31, INCREMENT=32, COMPARE=33, 
		BLOB=34, OTHER=35;
	public static final int
		RULE_code = 0, RULE_bashScript = 1, RULE_expressions = 2, RULE_loops = 3, 
		RULE_while_loop = 4, RULE_for_loop = 5, RULE_inside_for = 6, RULE_ifElse = 7, 
		RULE_function_def = 8, RULE_function_call = 9, RULE_multi_conditions = 10, 
		RULE_condition = 11, RULE_linux_command = 12, RULE_assignment = 13, RULE_advanced_assignment = 14, 
		RULE_command_data = 15, RULE_comparison = 16, RULE_increment = 17, RULE_open_bracket = 18, 
		RULE_close_bracket = 19, RULE_space = 20, RULE_string = 21;
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
	private static String[] makeRuleNames() {
		return new String[] {
			"code", "bashScript", "expressions", "loops", "while_loop", "for_loop", 
			"inside_for", "ifElse", "function_def", "function_call", "multi_conditions", 
			"condition", "linux_command", "assignment", "advanced_assignment", "command_data", 
<<<<<<< HEAD
			"comparison", "increment", "space", "string", "sed_flag", "sed"
=======
			"comparison", "increment", "open_bracket", "close_bracket", "space", 
			"string"
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
<<<<<<< HEAD
			null, "','", null, null, null, null, "'if'", "'then'", "'elif'", "'else'", 
			"'fi'", "'for'", "'do'", "'done'", "'sed'", null, null, null, null, null, 
			null, null, null, null, null, "'='", "';'"
=======
			null, "','", "'('", "')'", "'{'", "'}'", "'['", "']'", null, null, null, 
			null, null, "'function'", "'if'", "'then'", "'elif'", "'else'", "'fi'", 
			"'for'", "'while'", "'do'", "'break'", "'continue'", "'done'", null, 
			null, null, null, "'='", "';'"
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
<<<<<<< HEAD
			null, null, "SINGLE_STRING", "DOUBLE_STRING", "COMMENT", "SPACE", "IF", 
			"THEN", "ELIF", "ELSE", "FI", "FOR", "DO", "DONE", "SED", "COMMAND", 
			"RHS_ASSIGNMENT", "OPEN_BRACKETS", "CLOSE_BRACKETS", "VAR", "WEBSITE", 
			"FILENAME", "SED_FLAG", "BASH_VAR", "VAL", "ASSIGN", "SEMICOLON", "LOGICAL_OP", 
			"INCREMENT", "COMPARE", "BLOB", "OTHER"
=======
			null, null, "OPEN_PAR", "CLOSE_PAR", "OPEN_CUR", "CLOSE_CUR", "OPEN_BOX", 
			"CLOSE_BOX", "RHS_ASSIGNMENT", "SINGLE_STRING", "DOUBLE_STRING", "COMMENT", 
			"SPACE", "FUNCTION", "IF", "THEN", "ELIF", "ELSE", "FI", "FOR", "WHILE", 
			"DO", "BREAK", "CONTINUE", "DONE", "COMMAND", "VAR", "BASH_VAR", "VAL", 
			"ASSIGN", "SEMICOLON", "LOGICAL_OP", "INCREMENT", "COMPARE", "BLOB", 
			"OTHER"
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
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
<<<<<<< HEAD
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
=======
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAR) | (1L << OPEN_CUR) | (1L << OPEN_BOX) | (1L << SPACE) | (1L << FUNCTION) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << COMMAND) | (1L << VAR))) != 0)) {
				{
				{
				setState(44);
				bashScript();
				}
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(50);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
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
<<<<<<< HEAD
			setState(49); 
=======
			setState(60); 
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
<<<<<<< HEAD
					setState(49);
=======
					setState(60);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
<<<<<<< HEAD
						setState(42);
						for_loop();
=======
						setState(52);
						function_call();
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
						}
						break;
					case 2:
						{
						setState(53);
						function_def();
						}
						break;
					case 3:
						{
						setState(54);
						loops();
						}
						break;
					case 4:
						{
<<<<<<< HEAD
						setState(43);
=======
						setState(55);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
						assignment();
						}
						break;
					case 5:
						{
<<<<<<< HEAD
						setState(44);
=======
						setState(56);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
						linux_command();
						}
						break;
					case 6:
						{
<<<<<<< HEAD
						setState(45);
=======
						setState(57);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
						space();
						}
						break;
					case 7:
						{
<<<<<<< HEAD
						setState(46);
=======
						setState(58);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
						advanced_assignment();
						}
						break;
					case 8:
						{
<<<<<<< HEAD
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
=======
						setState(59);
						ifElse();
						}
						break;
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
<<<<<<< HEAD
				setState(51); 
=======
				setState(62); 
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
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
<<<<<<< HEAD
			setState(60);
=======
			setState(81);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAR) | (1L << OPEN_CUR) | (1L << OPEN_BOX) | (1L << FUNCTION) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << BREAK) | (1L << CONTINUE) | (1L << COMMAND) | (1L << VAR))) != 0)) {
				{
<<<<<<< HEAD
				setState(58);
=======
				setState(79);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
<<<<<<< HEAD
					setState(53);
					for_loop();
=======
					setState(64);
					function_call();
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
					}
					break;
				case 2:
					{
<<<<<<< HEAD
					setState(54);
=======
					setState(65);
					function_def();
					}
					break;
				case 3:
					{
					setState(66);
					loops();
					}
					break;
				case 4:
					{
					setState(67);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
					assignment();
					}
					break;
				case 5:
					{
<<<<<<< HEAD
					setState(55);
=======
					setState(68);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
					linux_command();
					}
					break;
				case 6:
					{
<<<<<<< HEAD
					setState(56);
=======
					setState(69);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
					advanced_assignment();
					}
					break;
				case 7:
					{
<<<<<<< HEAD
					setState(57);
=======
					setState(70);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
					ifElse();
					}
					break;
				case 8:
					{
					setState(71);
					match(BREAK);
					setState(73);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						setState(72);
						space();
						}
						break;
					}
					}
					break;
				case 9:
					{
					setState(75);
					match(CONTINUE);
					setState(77);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						setState(76);
						space();
						}
						break;
					}
					}
					break;
				}
				}
<<<<<<< HEAD
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(64);
=======
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(85);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(84);
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
			setState(89);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				{
				setState(87);
				while_loop();
				}
				break;
			case FOR:
				{
				setState(88);
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
			setState(91);
			match(WHILE);
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(92);
				space();
				}
			}

			setState(95);
			multi_conditions();
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(96);
				match(SEMICOLON);
				}
			}

			setState(100);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
<<<<<<< HEAD
				setState(63);
=======
				setState(99);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
				space();
				}
			}

			setState(102);
			match(DO);
			setState(104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(103);
				space();
				}
				break;
			}
			setState(106);
			expressions();
			setState(107);
			match(DONE);
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(108);
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
<<<<<<< HEAD
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
=======
			setState(111);
			match(FOR);
			setState(113);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
<<<<<<< HEAD
				setState(71);
=======
				setState(112);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
				space();
				}
			}

<<<<<<< HEAD
			setState(74);
			inside_for();
			setState(75);
			match(CLOSE_BRACKETS);
			setState(77);
=======
			setState(115);
			open_bracket();
			setState(116);
			open_bracket();
			setState(117);
			inside_for();
			setState(118);
			close_bracket();
			setState(119);
			close_bracket();
			setState(121);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
<<<<<<< HEAD
				setState(76);
=======
				setState(120);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
				space();
				}
				break;
			}
<<<<<<< HEAD
			setState(80);
=======
			setState(124);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
<<<<<<< HEAD
				setState(79);
=======
				setState(123);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
				match(SEMICOLON);
				}
			}

<<<<<<< HEAD
			setState(83);
=======
			setState(127);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
<<<<<<< HEAD
				setState(82);
=======
				setState(126);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
				space();
				}
			}

<<<<<<< HEAD
			setState(85);
			match(DO);
			setState(87);
=======
			setState(129);
			match(DO);
			setState(131);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
<<<<<<< HEAD
				setState(86);
=======
				setState(130);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
				space();
				}
				break;
			}
<<<<<<< HEAD
			setState(89);
			expressions();
			setState(90);
			match(DONE);
			setState(92);
=======
			setState(133);
			expressions();
			setState(134);
			match(DONE);
			setState(136);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
<<<<<<< HEAD
				setState(91);
=======
				setState(135);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
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
<<<<<<< HEAD
			setState(95);
=======
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(138);
				space();
				}
			}

			setState(142);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
<<<<<<< HEAD
				setState(94);
=======
				setState(141);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
				assignment();
				}
			}

<<<<<<< HEAD
			setState(101);
=======
			setState(151);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
<<<<<<< HEAD
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
=======
				setState(144);
				match(T__0);
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE) {
					{
					setState(145);
					space();
					}
				}

				setState(148);
				assignment();
				}
				}
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(154);
			match(SEMICOLON);
			setState(156);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
<<<<<<< HEAD
				setState(105);
=======
				setState(155);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
				space();
				}
				break;
			}
<<<<<<< HEAD
			setState(109);
=======
			setState(159);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << VAR) | (1L << VAL) | (1L << BLOB))) != 0)) {
				{
<<<<<<< HEAD
				setState(108);
=======
				setState(158);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
				condition();
				}
			}

<<<<<<< HEAD
			setState(118);
=======
			setState(168);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
<<<<<<< HEAD
					setState(111);
					match(LOGICAL_OP);
					setState(113);
=======
					setState(161);
					match(LOGICAL_OP);
					setState(163);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
					case 1:
						{
<<<<<<< HEAD
						setState(112);
=======
						setState(162);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
						space();
						}
						break;
					}
<<<<<<< HEAD
					setState(115);
=======
					setState(165);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
					condition();
					}
					} 
				}
<<<<<<< HEAD
				setState(120);
=======
				setState(170);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
<<<<<<< HEAD
			setState(121);
			match(SEMICOLON);
			setState(123);
=======
			setState(171);
			match(SEMICOLON);
			setState(173);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
<<<<<<< HEAD
				setState(122);
=======
				setState(172);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
				space();
				}
				break;
			}
<<<<<<< HEAD
			setState(126);
=======
			setState(176);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR || _la==INCREMENT) {
				{
<<<<<<< HEAD
				setState(125);
=======
				setState(175);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
				increment();
				}
			}

<<<<<<< HEAD
			setState(132);
=======
			setState(182);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
<<<<<<< HEAD
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
=======
				setState(178);
				match(T__0);
				setState(179);
				increment();
				}
				}
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(186);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
<<<<<<< HEAD
				setState(135);
=======
				setState(185);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
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
<<<<<<< HEAD
			setState(138);
			match(IF);
			setState(140);
=======
			setState(188);
			match(IF);
			setState(190);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
<<<<<<< HEAD
				setState(139);
=======
				setState(189);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
				space();
				}
			}

<<<<<<< HEAD
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
=======
			setState(192);
			multi_conditions();
			setState(194);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
<<<<<<< HEAD
				setState(161);
=======
				setState(193);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
				match(SEMICOLON);
				}
			}

<<<<<<< HEAD
			setState(165);
=======
			setState(197);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
<<<<<<< HEAD
				setState(164);
=======
				setState(196);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
				space();
				}
			}

<<<<<<< HEAD
			setState(167);
			match(THEN);
			setState(169);
=======
			setState(199);
			match(THEN);
			setState(201);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
<<<<<<< HEAD
				setState(168);
=======
				setState(200);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
				space();
				}
				break;
			}
<<<<<<< HEAD
			setState(171);
			expressions();
			setState(206);
=======
			setState(203);
			expressions();
			setState(240);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELIF) {
				{
				{
<<<<<<< HEAD
				setState(172);
				match(ELIF);
				setState(174);
=======
				setState(204);
				match(ELIF);
				setState(206);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE) {
					{
<<<<<<< HEAD
					setState(173);
=======
					setState(205);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
					space();
					}
				}

<<<<<<< HEAD
				setState(176);
				match(OPEN_BRACKETS);
				setState(178);
=======
				setState(208);
				open_bracket();
				setState(209);
				open_bracket();
				setState(211);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
<<<<<<< HEAD
					setState(177);
=======
					setState(210);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
					space();
					}
					break;
				}
<<<<<<< HEAD
				setState(180);
				condition();
				setState(185);
=======
				setState(213);
				condition();
				setState(218);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
<<<<<<< HEAD
						setState(181);
						match(LOGICAL_OP);
						setState(182);
=======
						setState(214);
						match(LOGICAL_OP);
						setState(215);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
						condition();
						}
						} 
					}
<<<<<<< HEAD
					setState(187);
=======
					setState(220);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				}
<<<<<<< HEAD
				setState(188);
				match(CLOSE_BRACKETS);
				setState(190);
=======
				setState(221);
				close_bracket();
				setState(222);
				close_bracket();
				setState(224);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
<<<<<<< HEAD
					setState(189);
=======
					setState(223);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
					space();
					}
					break;
				}
<<<<<<< HEAD
				setState(193);
=======
				setState(227);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
<<<<<<< HEAD
					setState(192);
=======
					setState(226);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
					match(SEMICOLON);
					}
				}

<<<<<<< HEAD
				setState(196);
=======
				setState(230);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE) {
					{
<<<<<<< HEAD
					setState(195);
=======
					setState(229);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
					space();
					}
				}

<<<<<<< HEAD
				setState(198);
				match(THEN);
				setState(200);
=======
				setState(232);
				match(THEN);
				setState(234);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
<<<<<<< HEAD
					setState(199);
=======
					setState(233);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
					space();
					}
					break;
				}
<<<<<<< HEAD
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
=======
				setState(236);
				expressions();
				}
				}
				setState(242);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(243);
				match(ELSE);
				setState(245);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(244);
					space();
					}
					break;
				}
				setState(247);
				expressions();
				}
			}

			setState(250);
			match(FI);
			setState(252);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(251);
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
			setState(254);
			match(FUNCTION);
			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(255);
				space();
				}
			}

			setState(258);
			match(VAR);
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
			match(OPEN_PAR);
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(263);
				space();
				}
			}

			setState(266);
			match(CLOSE_PAR);
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(267);
				space();
				}
			}

			setState(270);
			match(OPEN_CUR);
			setState(272);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(271);
				space();
				}
				break;
			}
			setState(274);
			expressions();
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(275);
				space();
				}
			}

			setState(278);
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
			setState(280);
			match(VAR);
			setState(282);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(281);
				space();
				}
				break;
			}
			setState(287);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
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
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
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
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
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
			setState(296);
			open_bracket();
			setState(297);
			open_bracket();
			setState(299);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
<<<<<<< HEAD
				setState(210);
=======
				setState(298);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
				space();
				}
				break;
			}
<<<<<<< HEAD
			setState(213);
			expressions();
			setState(214);
			match(FI);
			setState(216);
=======
			setState(301);
			condition();
			setState(309);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(302);
					match(LOGICAL_OP);
					setState(304);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
					case 1:
						{
						setState(303);
						space();
						}
						break;
					}
					setState(306);
					condition();
					}
					} 
				}
				setState(311);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			}
			setState(312);
			close_bracket();
			setState(313);
			close_bracket();
			setState(315);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
<<<<<<< HEAD
				setState(215);
=======
				setState(314);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
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
<<<<<<< HEAD
			setState(219);
=======
			setState(318);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
<<<<<<< HEAD
				setState(218);
=======
				setState(317);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
				space();
				}
			}

<<<<<<< HEAD
			setState(222); 
=======
			setState(321); 
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
<<<<<<< HEAD
				setState(221);
=======
				setState(320);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
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
<<<<<<< HEAD
				setState(224); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << VAL) | (1L << BLOB))) != 0) );
			setState(227);
=======
				setState(323); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << VAL) | (1L << BLOB))) != 0) );
			setState(326);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
<<<<<<< HEAD
				setState(226);
=======
				setState(325);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
				space();
				}
			}

<<<<<<< HEAD
			setState(229);
			match(COMPARE);
			setState(231);
=======
			setState(328);
			match(COMPARE);
			setState(330);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
<<<<<<< HEAD
				setState(230);
=======
				setState(329);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
				space();
				}
			}

<<<<<<< HEAD
			setState(240); 
=======
			setState(339); 
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
<<<<<<< HEAD
				setState(240);
=======
				setState(339);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
				case 1:
					{
<<<<<<< HEAD
					setState(233);
=======
					setState(332);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
					string();
					}
					break;
				case 2:
					{
<<<<<<< HEAD
					setState(234);
=======
					setState(333);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
					match(VAR);
					}
					break;
				case 3:
					{
<<<<<<< HEAD
					setState(235);
=======
					setState(334);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
					match(VAL);
					}
					break;
				case 4:
					{
<<<<<<< HEAD
					setState(236);
=======
					setState(335);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
					match(BLOB);
					}
					break;
				case 5:
					{
<<<<<<< HEAD
					setState(237);
=======
					setState(336);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
					match(BASH_VAR);
					}
					break;
				case 6:
					{
<<<<<<< HEAD
					setState(238);
=======
					setState(337);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
					match(RHS_ASSIGNMENT);
					}
					break;
				case 7:
					{
<<<<<<< HEAD
					setState(239);
=======
					setState(338);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
					match(BLOB);
					}
					break;
				}
				}
<<<<<<< HEAD
				setState(242); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SINGLE_STRING) | (1L << DOUBLE_STRING) | (1L << RHS_ASSIGNMENT) | (1L << VAR) | (1L << BASH_VAR) | (1L << VAL) | (1L << BLOB))) != 0) );
			setState(245);
=======
				setState(341); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RHS_ASSIGNMENT) | (1L << SINGLE_STRING) | (1L << DOUBLE_STRING) | (1L << VAR) | (1L << BASH_VAR) | (1L << VAL) | (1L << BLOB))) != 0) );
			setState(344);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
<<<<<<< HEAD
				setState(244);
=======
				setState(343);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
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
<<<<<<< HEAD
			setState(247);
			match(COMMAND);
			setState(249);
=======
			setState(346);
			match(COMMAND);
			setState(348);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				{
<<<<<<< HEAD
				setState(248);
=======
				setState(347);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
				space();
				}
				break;
			}
<<<<<<< HEAD
			setState(254);
=======
			setState(353);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
<<<<<<< HEAD
					setState(251);
=======
					setState(350);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
					command_data();
					}
					} 
				}
<<<<<<< HEAD
				setState(256);
=======
				setState(355);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			}
<<<<<<< HEAD
			setState(258);
=======
			setState(357);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
<<<<<<< HEAD
				setState(257);
=======
				setState(356);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
				match(SEMICOLON);
				}
			}

<<<<<<< HEAD
			setState(261);
=======
			setState(360);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				{
<<<<<<< HEAD
				setState(260);
=======
				setState(359);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
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
<<<<<<< HEAD
			setState(263);
			match(VAR);
			setState(264);
			match(ASSIGN);
			setState(271); 
=======
			setState(362);
			match(VAR);
			setState(363);
			match(ASSIGN);
			setState(370); 
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
<<<<<<< HEAD
					setState(271);
=======
					setState(370);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case SINGLE_STRING:
					case DOUBLE_STRING:
						{
<<<<<<< HEAD
						setState(265);
=======
						setState(364);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
						string();
						}
						break;
					case VAL:
						{
<<<<<<< HEAD
						setState(266);
=======
						setState(365);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
						match(VAL);
						}
						break;
					case VAR:
						{
<<<<<<< HEAD
						setState(267);
=======
						setState(366);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
						match(VAR);
						}
						break;
					case BASH_VAR:
						{
<<<<<<< HEAD
						setState(268);
=======
						setState(367);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
						match(BASH_VAR);
						}
						break;
					case RHS_ASSIGNMENT:
						{
<<<<<<< HEAD
						setState(269);
=======
						setState(368);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
						match(RHS_ASSIGNMENT);
						}
						break;
					case BLOB:
						{
<<<<<<< HEAD
						setState(270);
=======
						setState(369);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
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
<<<<<<< HEAD
				setState(273); 
=======
				setState(372); 
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
<<<<<<< HEAD
			setState(276);
=======
			setState(375);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
<<<<<<< HEAD
				setState(275);
=======
				setState(374);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
				match(SEMICOLON);
				}
				break;
			}
<<<<<<< HEAD
			setState(279);
=======
			setState(378);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
<<<<<<< HEAD
				setState(278);
=======
				setState(377);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
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
<<<<<<< HEAD
			setState(281);
			match(OPEN_BRACKETS);
			setState(283);
=======
			setState(380);
			open_bracket();
			setState(381);
			open_bracket();
			setState(383);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
<<<<<<< HEAD
				setState(282);
=======
				setState(382);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
				space();
				}
			}

<<<<<<< HEAD
			setState(285);
			match(VAR);
			setState(287);
=======
			setState(385);
			match(VAR);
			setState(387);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
<<<<<<< HEAD
				setState(286);
=======
				setState(386);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
				space();
				}
			}

<<<<<<< HEAD
			setState(289);
=======
			setState(389);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
			_la = _input.LA(1);
			if ( !(_la==ASSIGN || _la==INCREMENT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
<<<<<<< HEAD
			setState(291);
=======
			setState(391);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				{
<<<<<<< HEAD
				setState(290);
=======
				setState(390);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
				space();
				}
				break;
			}
<<<<<<< HEAD
			setState(301);
=======
			setState(401);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RHS_ASSIGNMENT) | (1L << SINGLE_STRING) | (1L << DOUBLE_STRING) | (1L << VAR) | (1L << BASH_VAR) | (1L << VAL) | (1L << BLOB))) != 0)) {
				{
<<<<<<< HEAD
				setState(299);
=======
				setState(399);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SINGLE_STRING:
				case DOUBLE_STRING:
					{
<<<<<<< HEAD
					setState(293);
=======
					setState(393);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
					string();
					}
					break;
				case VAL:
					{
<<<<<<< HEAD
					setState(294);
=======
					setState(394);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
					match(VAL);
					}
					break;
				case VAR:
					{
<<<<<<< HEAD
					setState(295);
=======
					setState(395);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
					match(VAR);
					}
					break;
				case BASH_VAR:
					{
<<<<<<< HEAD
					setState(296);
=======
					setState(396);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
					match(BASH_VAR);
					}
					break;
				case RHS_ASSIGNMENT:
					{
<<<<<<< HEAD
					setState(297);
=======
					setState(397);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
					match(RHS_ASSIGNMENT);
					}
					break;
				case BLOB:
					{
<<<<<<< HEAD
					setState(298);
=======
					setState(398);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
					match(BLOB);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
<<<<<<< HEAD
				setState(303);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(305);
=======
				setState(403);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(405);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
<<<<<<< HEAD
				setState(304);
=======
				setState(404);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
				space();
				}
			}

<<<<<<< HEAD
			setState(307);
			match(CLOSE_BRACKETS);
			setState(309);
=======
			setState(407);
			close_bracket();
			setState(408);
			close_bracket();
			setState(410);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
<<<<<<< HEAD
				setState(308);
=======
				setState(409);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
				match(SEMICOLON);
				}
			}

<<<<<<< HEAD
			setState(312);
=======
			setState(413);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				{
<<<<<<< HEAD
				setState(311);
=======
				setState(412);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
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
		public List<TerminalNode> RHS_ASSIGNMENT() { return getTokens(bashGrammarParser.RHS_ASSIGNMENT); }
		public TerminalNode RHS_ASSIGNMENT(int i) {
			return getToken(bashGrammarParser.RHS_ASSIGNMENT, i);
		}
		public List<TerminalNode> OTHER() { return getTokens(bashGrammarParser.OTHER); }
		public TerminalNode OTHER(int i) {
			return getToken(bashGrammarParser.OTHER, i);
		}
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< HEAD
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
=======
			setState(423); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(423);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case BLOB:
						{
						setState(415);
						match(BLOB);
						}
						break;
					case INCREMENT:
						{
						setState(416);
						match(INCREMENT);
						}
						break;
					case SINGLE_STRING:
					case DOUBLE_STRING:
						{
						setState(417);
						string();
						}
						break;
					case BASH_VAR:
						{
						setState(418);
						match(BASH_VAR);
						}
						break;
					case VAR:
						{
						setState(419);
						match(VAR);
						}
						break;
					case VAL:
						{
						setState(420);
						match(VAL);
						}
						break;
					case RHS_ASSIGNMENT:
						{
						setState(421);
						match(RHS_ASSIGNMENT);
						}
						break;
					case OTHER:
						{
						setState(422);
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
				setState(425); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(428);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				{
				setState(427);
				space();
				}
				break;
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
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
<<<<<<< HEAD
			setState(328);
			match(VAR);
			setState(329);
			match(COMPARE);
			setState(330);
=======
			setState(430);
			match(VAR);
			setState(431);
			match(COMPARE);
			setState(432);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
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
<<<<<<< HEAD
			setState(343);
=======
			setState(445);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				{
<<<<<<< HEAD
				setState(332);
				match(VAR);
				setState(333);
				match(INCREMENT);
				setState(339);
=======
				setState(434);
				match(VAR);
				setState(435);
				match(INCREMENT);
				setState(441);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BLOB:
					{
<<<<<<< HEAD
					setState(334);
=======
					setState(436);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
					match(BLOB);
					}
					break;
				case VAR:
					{
<<<<<<< HEAD
					setState(335);
=======
					setState(437);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
					match(VAR);
					}
					break;
				case VAL:
					{
<<<<<<< HEAD
					setState(336);
=======
					setState(438);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
					match(VAL);
					}
					break;
				case SINGLE_STRING:
				case DOUBLE_STRING:
					{
<<<<<<< HEAD
					setState(337);
=======
					setState(439);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
					string();
					}
					break;
				case BASH_VAR:
					{
<<<<<<< HEAD
					setState(338);
=======
					setState(440);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
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
<<<<<<< HEAD
				setState(341);
				match(INCREMENT);
				setState(342);
=======
				setState(443);
				match(INCREMENT);
				setState(444);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
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
			setState(447);
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
			setState(449);
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
		enterRule(_localctx, 40, RULE_space);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< HEAD
			setState(346); 
=======
			setState(452); 
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
<<<<<<< HEAD
					setState(345);
=======
					setState(451);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
					match(SPACE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
<<<<<<< HEAD
				setState(348); 
=======
				setState(454); 
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
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
		enterRule(_localctx, 42, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< HEAD
			setState(350);
=======
			setState(456);
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
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
<<<<<<< HEAD
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
=======
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3%\u01cd\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\7\2\60\n\2\f\2"+
		"\16\2\63\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\6\3?\n\3\r\3\16"+
		"\3@\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4L\n\4\3\4\3\4\5\4P\n\4\7\4"+
		"R\n\4\f\4\16\4U\13\4\3\4\5\4X\n\4\3\5\3\5\5\5\\\n\5\3\6\3\6\5\6`\n\6\3"+
		"\6\3\6\5\6d\n\6\3\6\5\6g\n\6\3\6\3\6\5\6k\n\6\3\6\3\6\3\6\5\6p\n\6\3\7"+
		"\3\7\5\7t\n\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7|\n\7\3\7\5\7\177\n\7\3\7\5\7"+
		"\u0082\n\7\3\7\3\7\5\7\u0086\n\7\3\7\3\7\3\7\5\7\u008b\n\7\3\b\5\b\u008e"+
		"\n\b\3\b\5\b\u0091\n\b\3\b\3\b\5\b\u0095\n\b\3\b\7\b\u0098\n\b\f\b\16"+
		"\b\u009b\13\b\3\b\3\b\5\b\u009f\n\b\3\b\5\b\u00a2\n\b\3\b\3\b\5\b\u00a6"+
		"\n\b\3\b\7\b\u00a9\n\b\f\b\16\b\u00ac\13\b\3\b\3\b\5\b\u00b0\n\b\3\b\5"+
		"\b\u00b3\n\b\3\b\3\b\7\b\u00b7\n\b\f\b\16\b\u00ba\13\b\3\b\5\b\u00bd\n"+
		"\b\3\t\3\t\5\t\u00c1\n\t\3\t\3\t\5\t\u00c5\n\t\3\t\5\t\u00c8\n\t\3\t\3"+
		"\t\5\t\u00cc\n\t\3\t\3\t\3\t\5\t\u00d1\n\t\3\t\3\t\3\t\5\t\u00d6\n\t\3"+
		"\t\3\t\3\t\7\t\u00db\n\t\f\t\16\t\u00de\13\t\3\t\3\t\3\t\5\t\u00e3\n\t"+
		"\3\t\5\t\u00e6\n\t\3\t\5\t\u00e9\n\t\3\t\3\t\5\t\u00ed\n\t\3\t\3\t\7\t"+
		"\u00f1\n\t\f\t\16\t\u00f4\13\t\3\t\3\t\5\t\u00f8\n\t\3\t\5\t\u00fb\n\t"+
		"\3\t\3\t\5\t\u00ff\n\t\3\n\3\n\5\n\u0103\n\n\3\n\3\n\5\n\u0107\n\n\3\n"+
		"\3\n\5\n\u010b\n\n\3\n\3\n\5\n\u010f\n\n\3\n\3\n\5\n\u0113\n\n\3\n\3\n"+
		"\5\n\u0117\n\n\3\n\3\n\3\13\3\13\5\13\u011d\n\13\3\13\7\13\u0120\n\13"+
		"\f\13\16\13\u0123\13\13\3\13\5\13\u0126\n\13\3\13\5\13\u0129\n\13\3\f"+
		"\3\f\3\f\5\f\u012e\n\f\3\f\3\f\3\f\5\f\u0133\n\f\3\f\7\f\u0136\n\f\f\f"+
		"\16\f\u0139\13\f\3\f\3\f\3\f\5\f\u013e\n\f\3\r\5\r\u0141\n\r\3\r\6\r\u0144"+
		"\n\r\r\r\16\r\u0145\3\r\5\r\u0149\n\r\3\r\3\r\5\r\u014d\n\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\6\r\u0156\n\r\r\r\16\r\u0157\3\r\5\r\u015b\n\r\3\16"+
		"\3\16\5\16\u015f\n\16\3\16\7\16\u0162\n\16\f\16\16\16\u0165\13\16\3\16"+
		"\5\16\u0168\n\16\3\16\5\16\u016b\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\6\17\u0175\n\17\r\17\16\17\u0176\3\17\5\17\u017a\n\17\3\17\5"+
		"\17\u017d\n\17\3\20\3\20\3\20\5\20\u0182\n\20\3\20\3\20\5\20\u0186\n\20"+
		"\3\20\3\20\5\20\u018a\n\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u0192\n"+
		"\20\f\20\16\20\u0195\13\20\3\20\5\20\u0198\n\20\3\20\3\20\3\20\5\20\u019d"+
		"\n\20\3\20\5\20\u01a0\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\6\21"+
		"\u01aa\n\21\r\21\16\21\u01ab\3\21\5\21\u01af\n\21\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u01bc\n\23\3\23\3\23\5\23\u01c0"+
		"\n\23\3\24\3\24\3\25\3\25\3\26\6\26\u01c7\n\26\r\26\16\26\u01c8\3\27\3"+
		"\27\3\27\7\u00aa\u00dc\u0121\u0137\u0163\2\30\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,\2\7\5\2\34\34\36\36$$\4\2\37\37\"\"\5\2\4\4\6"+
		"\6\b\b\5\2\5\5\7\7\t\t\3\2\13\f\2\u0234\2\61\3\2\2\2\4>\3\2\2\2\6S\3\2"+
		"\2\2\b[\3\2\2\2\n]\3\2\2\2\fq\3\2\2\2\16\u008d\3\2\2\2\20\u00be\3\2\2"+
		"\2\22\u0100\3\2\2\2\24\u011a\3\2\2\2\26\u012a\3\2\2\2\30\u0140\3\2\2\2"+
		"\32\u015c\3\2\2\2\34\u016c\3\2\2\2\36\u017e\3\2\2\2 \u01a9\3\2\2\2\"\u01b0"+
		"\3\2\2\2$\u01bf\3\2\2\2&\u01c1\3\2\2\2(\u01c3\3\2\2\2*\u01c6\3\2\2\2,"+
		"\u01ca\3\2\2\2.\60\5\4\3\2/.\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61\62\3"+
		"\2\2\2\62\64\3\2\2\2\63\61\3\2\2\2\64\65\7\2\2\3\65\3\3\2\2\2\66?\5\24"+
		"\13\2\67?\5\22\n\28?\5\b\5\29?\5\34\17\2:?\5\32\16\2;?\5*\26\2<?\5\36"+
		"\20\2=?\5\20\t\2>\66\3\2\2\2>\67\3\2\2\2>8\3\2\2\2>9\3\2\2\2>:\3\2\2\2"+
		">;\3\2\2\2><\3\2\2\2>=\3\2\2\2?@\3\2\2\2@>\3\2\2\2@A\3\2\2\2A\5\3\2\2"+
		"\2BR\5\24\13\2CR\5\22\n\2DR\5\b\5\2ER\5\34\17\2FR\5\32\16\2GR\5\36\20"+
		"\2HR\5\20\t\2IK\7\30\2\2JL\5*\26\2KJ\3\2\2\2KL\3\2\2\2LR\3\2\2\2MO\7\31"+
		"\2\2NP\5*\26\2ON\3\2\2\2OP\3\2\2\2PR\3\2\2\2QB\3\2\2\2QC\3\2\2\2QD\3\2"+
		"\2\2QE\3\2\2\2QF\3\2\2\2QG\3\2\2\2QH\3\2\2\2QI\3\2\2\2QM\3\2\2\2RU\3\2"+
		"\2\2SQ\3\2\2\2ST\3\2\2\2TW\3\2\2\2US\3\2\2\2VX\5*\26\2WV\3\2\2\2WX\3\2"+
		"\2\2X\7\3\2\2\2Y\\\5\n\6\2Z\\\5\f\7\2[Y\3\2\2\2[Z\3\2\2\2\\\t\3\2\2\2"+
		"]_\7\26\2\2^`\5*\26\2_^\3\2\2\2_`\3\2\2\2`a\3\2\2\2ac\5\26\f\2bd\7 \2"+
		"\2cb\3\2\2\2cd\3\2\2\2df\3\2\2\2eg\5*\26\2fe\3\2\2\2fg\3\2\2\2gh\3\2\2"+
		"\2hj\7\27\2\2ik\5*\26\2ji\3\2\2\2jk\3\2\2\2kl\3\2\2\2lm\5\6\4\2mo\7\32"+
		"\2\2np\5*\26\2on\3\2\2\2op\3\2\2\2p\13\3\2\2\2qs\7\25\2\2rt\5*\26\2sr"+
		"\3\2\2\2st\3\2\2\2tu\3\2\2\2uv\5&\24\2vw\5&\24\2wx\5\16\b\2xy\5(\25\2"+
		"y{\5(\25\2z|\5*\26\2{z\3\2\2\2{|\3\2\2\2|~\3\2\2\2}\177\7 \2\2~}\3\2\2"+
		"\2~\177\3\2\2\2\177\u0081\3\2\2\2\u0080\u0082\5*\26\2\u0081\u0080\3\2"+
		"\2\2\u0081\u0082\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0085\7\27\2\2\u0084"+
		"\u0086\5*\26\2\u0085\u0084\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\3\2"+
		"\2\2\u0087\u0088\5\6\4\2\u0088\u008a\7\32\2\2\u0089\u008b\5*\26\2\u008a"+
		"\u0089\3\2\2\2\u008a\u008b\3\2\2\2\u008b\r\3\2\2\2\u008c\u008e\5*\26\2"+
		"\u008d\u008c\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0090\3\2\2\2\u008f\u0091"+
		"\5\34\17\2\u0090\u008f\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0099\3\2\2\2"+
		"\u0092\u0094\7\3\2\2\u0093\u0095\5*\26\2\u0094\u0093\3\2\2\2\u0094\u0095"+
		"\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0098\5\34\17\2\u0097\u0092\3\2\2\2"+
		"\u0098\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009c"+
		"\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u009e\7 \2\2\u009d\u009f\5*\26\2\u009e"+
		"\u009d\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a1\3\2\2\2\u00a0\u00a2\5\30"+
		"\r\2\u00a1\u00a0\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00aa\3\2\2\2\u00a3"+
		"\u00a5\7!\2\2\u00a4\u00a6\5*\26\2\u00a5\u00a4\3\2\2\2\u00a5\u00a6\3\2"+
		"\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a9\5\30\r\2\u00a8\u00a3\3\2\2\2\u00a9"+
		"\u00ac\3\2\2\2\u00aa\u00ab\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ad\3\2"+
		"\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00af\7 \2\2\u00ae\u00b0\5*\26\2\u00af"+
		"\u00ae\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b2\3\2\2\2\u00b1\u00b3\5$"+
		"\23\2\u00b2\u00b1\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b8\3\2\2\2\u00b4"+
		"\u00b5\7\3\2\2\u00b5\u00b7\5$\23\2\u00b6\u00b4\3\2\2\2\u00b7\u00ba\3\2"+
		"\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba"+
		"\u00b8\3\2\2\2\u00bb\u00bd\5*\26\2\u00bc\u00bb\3\2\2\2\u00bc\u00bd\3\2"+
		"\2\2\u00bd\17\3\2\2\2\u00be\u00c0\7\20\2\2\u00bf\u00c1\5*\26\2\u00c0\u00bf"+
		"\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c4\5\26\f\2"+
		"\u00c3\u00c5\7 \2\2\u00c4\u00c3\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c7"+
		"\3\2\2\2\u00c6\u00c8\5*\26\2\u00c7\u00c6\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8"+
		"\u00c9\3\2\2\2\u00c9\u00cb\7\21\2\2\u00ca\u00cc\5*\26\2\u00cb\u00ca\3"+
		"\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00f2\5\6\4\2\u00ce"+
		"\u00d0\7\22\2\2\u00cf\u00d1\5*\26\2\u00d0\u00cf\3\2\2\2\u00d0\u00d1\3"+
		"\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d3\5&\24\2\u00d3\u00d5\5&\24\2\u00d4"+
		"\u00d6\5*\26\2\u00d5\u00d4\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7\3\2"+
		"\2\2\u00d7\u00dc\5\30\r\2\u00d8\u00d9\7!\2\2\u00d9\u00db\5\30\r\2\u00da"+
		"\u00d8\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dc\u00da\3\2"+
		"\2\2\u00dd\u00df\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\u00e0\5(\25\2\u00e0"+
		"\u00e2\5(\25\2\u00e1\u00e3\5*\26\2\u00e2\u00e1\3\2\2\2\u00e2\u00e3\3\2"+
		"\2\2\u00e3\u00e5\3\2\2\2\u00e4\u00e6\7 \2\2\u00e5\u00e4\3\2\2\2\u00e5"+
		"\u00e6\3\2\2\2\u00e6\u00e8\3\2\2\2\u00e7\u00e9\5*\26\2\u00e8\u00e7\3\2"+
		"\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00ec\7\21\2\2\u00eb"+
		"\u00ed\5*\26\2\u00ec\u00eb\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ee\3\2"+
		"\2\2\u00ee\u00ef\5\6\4\2\u00ef\u00f1\3\2\2\2\u00f0\u00ce\3\2\2\2\u00f1"+
		"\u00f4\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00fa\3\2"+
		"\2\2\u00f4\u00f2\3\2\2\2\u00f5\u00f7\7\23\2\2\u00f6\u00f8\5*\26\2\u00f7"+
		"\u00f6\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fb\5\6"+
		"\4\2\u00fa\u00f5\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc"+
		"\u00fe\7\24\2\2\u00fd\u00ff\5*\26\2\u00fe\u00fd\3\2\2\2\u00fe\u00ff\3"+
		"\2\2\2\u00ff\21\3\2\2\2\u0100\u0102\7\17\2\2\u0101\u0103\5*\26\2\u0102"+
		"\u0101\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0106\7\34"+
		"\2\2\u0105\u0107\5*\26\2\u0106\u0105\3\2\2\2\u0106\u0107\3\2\2\2\u0107"+
		"\u0108\3\2\2\2\u0108\u010a\7\4\2\2\u0109\u010b\5*\26\2\u010a\u0109\3\2"+
		"\2\2\u010a\u010b\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010e\7\5\2\2\u010d"+
		"\u010f\5*\26\2\u010e\u010d\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0110\3\2"+
		"\2\2\u0110\u0112\7\6\2\2\u0111\u0113\5*\26\2\u0112\u0111\3\2\2\2\u0112"+
		"\u0113\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0116\5\6\4\2\u0115\u0117\5*"+
		"\26\2\u0116\u0115\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0118\3\2\2\2\u0118"+
		"\u0119\7\7\2\2\u0119\23\3\2\2\2\u011a\u011c\7\34\2\2\u011b\u011d\5*\26"+
		"\2\u011c\u011b\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u0121\3\2\2\2\u011e\u0120"+
		"\5 \21\2\u011f\u011e\3\2\2\2\u0120\u0123\3\2\2\2\u0121\u0122\3\2\2\2\u0121"+
		"\u011f\3\2\2\2\u0122\u0125\3\2\2\2\u0123\u0121\3\2\2\2\u0124\u0126\7 "+
		"\2\2\u0125\u0124\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0128\3\2\2\2\u0127"+
		"\u0129\5*\26\2\u0128\u0127\3\2\2\2\u0128\u0129\3\2\2\2\u0129\25\3\2\2"+
		"\2\u012a\u012b\5&\24\2\u012b\u012d\5&\24\2\u012c\u012e\5*\26\2\u012d\u012c"+
		"\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0137\5\30\r\2"+
		"\u0130\u0132\7!\2\2\u0131\u0133\5*\26\2\u0132\u0131\3\2\2\2\u0132\u0133"+
		"\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0136\5\30\r\2\u0135\u0130\3\2\2\2"+
		"\u0136\u0139\3\2\2\2\u0137\u0138\3\2\2\2\u0137\u0135\3\2\2\2\u0138\u013a"+
		"\3\2\2\2\u0139\u0137\3\2\2\2\u013a\u013b\5(\25\2\u013b\u013d\5(\25\2\u013c"+
		"\u013e\5*\26\2\u013d\u013c\3\2\2\2\u013d\u013e\3\2\2\2\u013e\27\3\2\2"+
		"\2\u013f\u0141\5*\26\2\u0140\u013f\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0143"+
		"\3\2\2\2\u0142\u0144\t\2\2\2\u0143\u0142\3\2\2\2\u0144\u0145\3\2\2\2\u0145"+
		"\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0148\3\2\2\2\u0147\u0149\5*"+
		"\26\2\u0148\u0147\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014a\3\2\2\2\u014a"+
		"\u014c\7#\2\2\u014b\u014d\5*\26\2\u014c\u014b\3\2\2\2\u014c\u014d\3\2"+
		"\2\2\u014d\u0155\3\2\2\2\u014e\u0156\5,\27\2\u014f\u0156\7\34\2\2\u0150"+
		"\u0156\7\36\2\2\u0151\u0156\7$\2\2\u0152\u0156\7\35\2\2\u0153\u0156\7"+
		"\n\2\2\u0154\u0156\7$\2\2\u0155\u014e\3\2\2\2\u0155\u014f\3\2\2\2\u0155"+
		"\u0150\3\2\2\2\u0155\u0151\3\2\2\2\u0155\u0152\3\2\2\2\u0155\u0153\3\2"+
		"\2\2\u0155\u0154\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0155\3\2\2\2\u0157"+
		"\u0158\3\2\2\2\u0158\u015a\3\2\2\2\u0159\u015b\5*\26\2\u015a\u0159\3\2"+
		"\2\2\u015a\u015b\3\2\2\2\u015b\31\3\2\2\2\u015c\u015e\7\33\2\2\u015d\u015f"+
		"\5*\26\2\u015e\u015d\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0163\3\2\2\2\u0160"+
		"\u0162\5 \21\2\u0161\u0160\3\2\2\2\u0162\u0165\3\2\2\2\u0163\u0164\3\2"+
		"\2\2\u0163\u0161\3\2\2\2\u0164\u0167\3\2\2\2\u0165\u0163\3\2\2\2\u0166"+
		"\u0168\7 \2\2\u0167\u0166\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u016a\3\2"+
		"\2\2\u0169\u016b\5*\26\2\u016a\u0169\3\2\2\2\u016a\u016b\3\2\2\2\u016b"+
		"\33\3\2\2\2\u016c\u016d\7\34\2\2\u016d\u0174\7\37\2\2\u016e\u0175\5,\27"+
		"\2\u016f\u0175\7\36\2\2\u0170\u0175\7\34\2\2\u0171\u0175\7\35\2\2\u0172"+
		"\u0175\7\n\2\2\u0173\u0175\7$\2\2\u0174\u016e\3\2\2\2\u0174\u016f\3\2"+
		"\2\2\u0174\u0170\3\2\2\2\u0174\u0171\3\2\2\2\u0174\u0172\3\2\2\2\u0174"+
		"\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0174\3\2\2\2\u0176\u0177\3\2"+
		"\2\2\u0177\u0179\3\2\2\2\u0178\u017a\7 \2\2\u0179\u0178\3\2\2\2\u0179"+
		"\u017a\3\2\2\2\u017a\u017c\3\2\2\2\u017b\u017d\5*\26\2\u017c\u017b\3\2"+
		"\2\2\u017c\u017d\3\2\2\2\u017d\35\3\2\2\2\u017e\u017f\5&\24\2\u017f\u0181"+
		"\5&\24\2\u0180\u0182\5*\26\2\u0181\u0180\3\2\2\2\u0181\u0182\3\2\2\2\u0182"+
		"\u0183\3\2\2\2\u0183\u0185\7\34\2\2\u0184\u0186\5*\26\2\u0185\u0184\3"+
		"\2\2\2\u0185\u0186\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u0189\t\3\2\2\u0188"+
		"\u018a\5*\26\2\u0189\u0188\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u0193\3\2"+
		"\2\2\u018b\u0192\5,\27\2\u018c\u0192\7\36\2\2\u018d\u0192\7\34\2\2\u018e"+
		"\u0192\7\35\2\2\u018f\u0192\7\n\2\2\u0190\u0192\7$\2\2\u0191\u018b\3\2"+
		"\2\2\u0191\u018c\3\2\2\2\u0191\u018d\3\2\2\2\u0191\u018e\3\2\2\2\u0191"+
		"\u018f\3\2\2\2\u0191\u0190\3\2\2\2\u0192\u0195\3\2\2\2\u0193\u0191\3\2"+
		"\2\2\u0193\u0194\3\2\2\2\u0194\u0197\3\2\2\2\u0195\u0193\3\2\2\2\u0196"+
		"\u0198\5*\26\2\u0197\u0196\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u0199\3\2"+
		"\2\2\u0199\u019a\5(\25\2\u019a\u019c\5(\25\2\u019b\u019d\7 \2\2\u019c"+
		"\u019b\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u019f\3\2\2\2\u019e\u01a0\5*"+
		"\26\2\u019f\u019e\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\37\3\2\2\2\u01a1\u01aa"+
		"\7$\2\2\u01a2\u01aa\7\"\2\2\u01a3\u01aa\5,\27\2\u01a4\u01aa\7\35\2\2\u01a5"+
		"\u01aa\7\34\2\2\u01a6\u01aa\7\36\2\2\u01a7\u01aa\7\n\2\2\u01a8\u01aa\7"+
		"%\2\2\u01a9\u01a1\3\2\2\2\u01a9\u01a2\3\2\2\2\u01a9\u01a3\3\2\2\2\u01a9"+
		"\u01a4\3\2\2\2\u01a9\u01a5\3\2\2\2\u01a9\u01a6\3\2\2\2\u01a9\u01a7\3\2"+
		"\2\2\u01a9\u01a8\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ab"+
		"\u01ac\3\2\2\2\u01ac\u01ae\3\2\2\2\u01ad\u01af\5*\26\2\u01ae\u01ad\3\2"+
		"\2\2\u01ae\u01af\3\2\2\2\u01af!\3\2\2\2\u01b0\u01b1\7\34\2\2\u01b1\u01b2"+
		"\7#\2\2\u01b2\u01b3\7\36\2\2\u01b3#\3\2\2\2\u01b4\u01b5\7\34\2\2\u01b5"+
		"\u01bb\7\"\2\2\u01b6\u01bc\7$\2\2\u01b7\u01bc\7\34\2\2\u01b8\u01bc\7\36"+
		"\2\2\u01b9\u01bc\5,\27\2\u01ba\u01bc\7\35\2\2\u01bb\u01b6\3\2\2\2\u01bb"+
		"\u01b7\3\2\2\2\u01bb\u01b8\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bb\u01ba\3\2"+
		"\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01c0\3\2\2\2\u01bd\u01be\7\"\2\2\u01be"+
		"\u01c0\7\34\2\2\u01bf\u01b4\3\2\2\2\u01bf\u01bd\3\2\2\2\u01c0%\3\2\2\2"+
		"\u01c1\u01c2\t\4\2\2\u01c2\'\3\2\2\2\u01c3\u01c4\t\5\2\2\u01c4)\3\2\2"+
		"\2\u01c5\u01c7\7\16\2\2\u01c6\u01c5\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8"+
		"\u01c6\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9+\3\2\2\2\u01ca\u01cb\t\6\2\2"+
		"\u01cb-\3\2\2\2\\\61>@KOQSW[_cfjos{~\u0081\u0085\u008a\u008d\u0090\u0094"+
		"\u0099\u009e\u00a1\u00a5\u00aa\u00af\u00b2\u00b8\u00bc\u00c0\u00c4\u00c7"+
		"\u00cb\u00d0\u00d5\u00dc\u00e2\u00e5\u00e8\u00ec\u00f2\u00f7\u00fa\u00fe"+
		"\u0102\u0106\u010a\u010e\u0112\u0116\u011c\u0121\u0125\u0128\u012d\u0132"+
		"\u0137\u013d\u0140\u0145\u0148\u014c\u0155\u0157\u015a\u015e\u0163\u0167"+
		"\u016a\u0174\u0176\u0179\u017c\u0181\u0185\u0189\u0191\u0193\u0197\u019c"+
		"\u019f\u01a9\u01ab\u01ae\u01bb\u01bf\u01c8";
>>>>>>> 5074812a9eef5190831be8e6581aa425ab10d9ec
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}