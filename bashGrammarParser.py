# Generated from bashGrammar.g4 by ANTLR 4.8
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO


def serializedATN():
    with StringIO() as buf:
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\23")
        buf.write("z\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b")
        buf.write("\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\3\2\7\2\32\n\2")
        buf.write("\f\2\16\2\35\13\2\3\2\3\2\3\3\3\3\3\3\6\3$\n\3\r\3\16")
        buf.write("\3%\3\4\3\4\3\4\3\4\3\4\5\4-\n\4\3\4\3\4\5\4\61\n\4\3")
        buf.write("\4\6\4\64\n\4\r\4\16\4\65\3\4\5\49\n\4\3\4\3\4\5\4=\n")
        buf.write("\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\5\6G\n\6\3\6\6\6J\n")
        buf.write("\6\r\6\16\6K\3\6\5\6O\n\6\3\6\5\6R\n\6\3\7\3\7\3\7\3\7")
        buf.write("\3\7\5\7Y\n\7\3\7\5\7\\\n\7\3\7\5\7_\n\7\3\b\6\bb\n\b")
        buf.write("\r\b\16\bc\3\b\3\b\3\b\3\b\5\bj\n\b\3\t\3\t\3\t\3\t\3")
        buf.write("\n\3\n\3\n\3\13\6\13t\n\13\r\13\16\13u\3\f\3\f\3\f\2\2")
        buf.write("\r\2\4\6\b\n\f\16\20\22\24\26\2\3\3\2\3\4\2\u0085\2\33")
        buf.write("\3\2\2\2\4#\3\2\2\2\6\'\3\2\2\2\b>\3\2\2\2\nD\3\2\2\2")
        buf.write("\fS\3\2\2\2\16i\3\2\2\2\20k\3\2\2\2\22o\3\2\2\2\24s\3")
        buf.write("\2\2\2\26w\3\2\2\2\30\32\5\4\3\2\31\30\3\2\2\2\32\35\3")
        buf.write("\2\2\2\33\31\3\2\2\2\33\34\3\2\2\2\34\36\3\2\2\2\35\33")
        buf.write("\3\2\2\2\36\37\7\2\2\3\37\3\3\2\2\2 $\5\6\4\2!$\5\f\7")
        buf.write("\2\"$\5\n\6\2# \3\2\2\2#!\3\2\2\2#\"\3\2\2\2$%\3\2\2\2")
        buf.write("%#\3\2\2\2%&\3\2\2\2&\5\3\2\2\2\'(\7\7\2\2()\7\13\2\2")
        buf.write(")*\5\b\5\2*,\7\f\2\2+-\5\24\13\2,+\3\2\2\2,-\3\2\2\2-")
        buf.write(".\3\2\2\2.\60\7\b\2\2/\61\5\24\13\2\60/\3\2\2\2\60\61")
        buf.write("\3\2\2\2\61\63\3\2\2\2\62\64\5\f\7\2\63\62\3\2\2\2\64")
        buf.write("\65\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\668\3\2\2\2\67")
        buf.write("9\5\24\13\28\67\3\2\2\289\3\2\2\29:\3\2\2\2:<\7\t\2\2")
        buf.write(";=\5\24\13\2<;\3\2\2\2<=\3\2\2\2=\7\3\2\2\2>?\5\f\7\2")
        buf.write("?@\7\20\2\2@A\5\20\t\2AB\7\20\2\2BC\5\22\n\2C\t\3\2\2")
        buf.write("\2DF\7\n\2\2EG\5\24\13\2FE\3\2\2\2FG\3\2\2\2GI\3\2\2\2")
        buf.write("HJ\5\16\b\2IH\3\2\2\2JK\3\2\2\2KI\3\2\2\2KL\3\2\2\2LN")
        buf.write("\3\2\2\2MO\7\20\2\2NM\3\2\2\2NO\3\2\2\2OQ\3\2\2\2PR\5")
        buf.write("\24\13\2QP\3\2\2\2QR\3\2\2\2R\13\3\2\2\2ST\7\r\2\2TX\7")
        buf.write("\17\2\2UY\5\26\f\2VY\7\16\2\2WY\7\r\2\2XU\3\2\2\2XV\3")
        buf.write("\2\2\2XW\3\2\2\2Y[\3\2\2\2Z\\\7\20\2\2[Z\3\2\2\2[\\\3")
        buf.write("\2\2\2\\^\3\2\2\2]_\5\24\13\2^]\3\2\2\2^_\3\2\2\2_\r\3")
        buf.write("\2\2\2`b\7\23\2\2a`\3\2\2\2bc\3\2\2\2ca\3\2\2\2cd\3\2")
        buf.write("\2\2dj\3\2\2\2ej\5\26\f\2fj\7\r\2\2gj\7\16\2\2hj\5\24")
        buf.write("\13\2ia\3\2\2\2ie\3\2\2\2if\3\2\2\2ig\3\2\2\2ih\3\2\2")
        buf.write("\2j\17\3\2\2\2kl\7\r\2\2lm\7\22\2\2mn\7\16\2\2n\21\3\2")
        buf.write("\2\2op\7\r\2\2pq\7\21\2\2q\23\3\2\2\2rt\7\6\2\2sr\3\2")
        buf.write("\2\2tu\3\2\2\2us\3\2\2\2uv\3\2\2\2v\25\3\2\2\2wx\t\2\2")
        buf.write("\2x\27\3\2\2\2\24\33#%,\60\658<FKNQX[^ciu")
        return buf.getvalue()


class bashGrammarParser ( Parser ):

    grammarFileName = "bashGrammar.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                     "<INVALID>", "'for'", "'do'", "'done'", "<INVALID>", 
                     "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                     "'='", "';'" ]

    symbolicNames = [ "<INVALID>", "SINGLE_STRING", "DOUBLE_STRING", "COMMENT", 
                      "SPACE", "FOR", "DO", "DONE", "COMMAND", "OPEN_FOR_BRACKET", 
                      "CLOSE_FOR_BRACKET", "VAR", "VAL", "EQUALS", "SEMICOLON", 
                      "INCREMENT", "COMPARE", "OTHER" ]

    RULE_code = 0
    RULE_bashScript = 1
    RULE_for_loop = 2
    RULE_inside_for = 3
    RULE_linux_command = 4
    RULE_assignment = 5
    RULE_command_data = 6
    RULE_comparison = 7
    RULE_increment = 8
    RULE_space = 9
    RULE_string = 10

    ruleNames =  [ "code", "bashScript", "for_loop", "inside_for", "linux_command", 
                   "assignment", "command_data", "comparison", "increment", 
                   "space", "string" ]

    EOF = Token.EOF
    SINGLE_STRING=1
    DOUBLE_STRING=2
    COMMENT=3
    SPACE=4
    FOR=5
    DO=6
    DONE=7
    COMMAND=8
    OPEN_FOR_BRACKET=9
    CLOSE_FOR_BRACKET=10
    VAR=11
    VAL=12
    EQUALS=13
    SEMICOLON=14
    INCREMENT=15
    COMPARE=16
    OTHER=17

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.8")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class CodeContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def EOF(self):
            return self.getToken(bashGrammarParser.EOF, 0)

        def bashScript(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(bashGrammarParser.BashScriptContext)
            else:
                return self.getTypedRuleContext(bashGrammarParser.BashScriptContext,i)


        def getRuleIndex(self):
            return bashGrammarParser.RULE_code

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterCode" ):
                listener.enterCode(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitCode" ):
                listener.exitCode(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitCode" ):
                return visitor.visitCode(self)
            else:
                return visitor.visitChildren(self)




    def code(self):

        localctx = bashGrammarParser.CodeContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_code)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 25
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << bashGrammarParser.FOR) | (1 << bashGrammarParser.COMMAND) | (1 << bashGrammarParser.VAR))) != 0):
                self.state = 22
                self.bashScript()
                self.state = 27
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 28
            self.match(bashGrammarParser.EOF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class BashScriptContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def for_loop(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(bashGrammarParser.For_loopContext)
            else:
                return self.getTypedRuleContext(bashGrammarParser.For_loopContext,i)


        def assignment(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(bashGrammarParser.AssignmentContext)
            else:
                return self.getTypedRuleContext(bashGrammarParser.AssignmentContext,i)


        def linux_command(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(bashGrammarParser.Linux_commandContext)
            else:
                return self.getTypedRuleContext(bashGrammarParser.Linux_commandContext,i)


        def getRuleIndex(self):
            return bashGrammarParser.RULE_bashScript

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterBashScript" ):
                listener.enterBashScript(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitBashScript" ):
                listener.exitBashScript(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitBashScript" ):
                return visitor.visitBashScript(self)
            else:
                return visitor.visitChildren(self)




    def bashScript(self):

        localctx = bashGrammarParser.BashScriptContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_bashScript)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 33 
            self._errHandler.sync(self)
            _alt = 1
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt == 1:
                    self.state = 33
                    self._errHandler.sync(self)
                    token = self._input.LA(1)
                    if token in [bashGrammarParser.FOR]:
                        self.state = 30
                        self.for_loop()
                        pass
                    elif token in [bashGrammarParser.VAR]:
                        self.state = 31
                        self.assignment()
                        pass
                    elif token in [bashGrammarParser.COMMAND]:
                        self.state = 32
                        self.linux_command()
                        pass
                    else:
                        raise NoViableAltException(self)


                else:
                    raise NoViableAltException(self)
                self.state = 35 
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,2,self._ctx)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class For_loopContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def FOR(self):
            return self.getToken(bashGrammarParser.FOR, 0)

        def OPEN_FOR_BRACKET(self):
            return self.getToken(bashGrammarParser.OPEN_FOR_BRACKET, 0)

        def inside_for(self):
            return self.getTypedRuleContext(bashGrammarParser.Inside_forContext,0)


        def CLOSE_FOR_BRACKET(self):
            return self.getToken(bashGrammarParser.CLOSE_FOR_BRACKET, 0)

        def DO(self):
            return self.getToken(bashGrammarParser.DO, 0)

        def DONE(self):
            return self.getToken(bashGrammarParser.DONE, 0)

        def space(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(bashGrammarParser.SpaceContext)
            else:
                return self.getTypedRuleContext(bashGrammarParser.SpaceContext,i)


        def assignment(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(bashGrammarParser.AssignmentContext)
            else:
                return self.getTypedRuleContext(bashGrammarParser.AssignmentContext,i)


        def getRuleIndex(self):
            return bashGrammarParser.RULE_for_loop

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFor_loop" ):
                listener.enterFor_loop(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFor_loop" ):
                listener.exitFor_loop(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitFor_loop" ):
                return visitor.visitFor_loop(self)
            else:
                return visitor.visitChildren(self)




    def for_loop(self):

        localctx = bashGrammarParser.For_loopContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_for_loop)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 37
            self.match(bashGrammarParser.FOR)
            self.state = 38
            self.match(bashGrammarParser.OPEN_FOR_BRACKET)
            self.state = 39
            self.inside_for()
            self.state = 40
            self.match(bashGrammarParser.CLOSE_FOR_BRACKET)
            self.state = 42
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==bashGrammarParser.SPACE:
                self.state = 41
                self.space()


            self.state = 44
            self.match(bashGrammarParser.DO)
            self.state = 46
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==bashGrammarParser.SPACE:
                self.state = 45
                self.space()


            self.state = 49 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 48
                self.assignment()
                self.state = 51 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not (_la==bashGrammarParser.VAR):
                    break

            self.state = 54
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==bashGrammarParser.SPACE:
                self.state = 53
                self.space()


            self.state = 56
            self.match(bashGrammarParser.DONE)
            self.state = 58
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==bashGrammarParser.SPACE:
                self.state = 57
                self.space()


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Inside_forContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def assignment(self):
            return self.getTypedRuleContext(bashGrammarParser.AssignmentContext,0)


        def SEMICOLON(self, i:int=None):
            if i is None:
                return self.getTokens(bashGrammarParser.SEMICOLON)
            else:
                return self.getToken(bashGrammarParser.SEMICOLON, i)

        def comparison(self):
            return self.getTypedRuleContext(bashGrammarParser.ComparisonContext,0)


        def increment(self):
            return self.getTypedRuleContext(bashGrammarParser.IncrementContext,0)


        def getRuleIndex(self):
            return bashGrammarParser.RULE_inside_for

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterInside_for" ):
                listener.enterInside_for(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitInside_for" ):
                listener.exitInside_for(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitInside_for" ):
                return visitor.visitInside_for(self)
            else:
                return visitor.visitChildren(self)




    def inside_for(self):

        localctx = bashGrammarParser.Inside_forContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_inside_for)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 60
            self.assignment()
            self.state = 61
            self.match(bashGrammarParser.SEMICOLON)
            self.state = 62
            self.comparison()
            self.state = 63
            self.match(bashGrammarParser.SEMICOLON)
            self.state = 64
            self.increment()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Linux_commandContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def COMMAND(self):
            return self.getToken(bashGrammarParser.COMMAND, 0)

        def space(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(bashGrammarParser.SpaceContext)
            else:
                return self.getTypedRuleContext(bashGrammarParser.SpaceContext,i)


        def command_data(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(bashGrammarParser.Command_dataContext)
            else:
                return self.getTypedRuleContext(bashGrammarParser.Command_dataContext,i)


        def SEMICOLON(self):
            return self.getToken(bashGrammarParser.SEMICOLON, 0)

        def getRuleIndex(self):
            return bashGrammarParser.RULE_linux_command

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterLinux_command" ):
                listener.enterLinux_command(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitLinux_command" ):
                listener.exitLinux_command(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitLinux_command" ):
                return visitor.visitLinux_command(self)
            else:
                return visitor.visitChildren(self)




    def linux_command(self):

        localctx = bashGrammarParser.Linux_commandContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_linux_command)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 66
            self.match(bashGrammarParser.COMMAND)
            self.state = 68
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,8,self._ctx)
            if la_ == 1:
                self.state = 67
                self.space()


            self.state = 71 
            self._errHandler.sync(self)
            _alt = 1
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt == 1:
                    self.state = 70
                    self.command_data()

                else:
                    raise NoViableAltException(self)
                self.state = 73 
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,9,self._ctx)

            self.state = 76
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==bashGrammarParser.SEMICOLON:
                self.state = 75
                self.match(bashGrammarParser.SEMICOLON)


            self.state = 79
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==bashGrammarParser.SPACE:
                self.state = 78
                self.space()


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class AssignmentContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def VAR(self, i:int=None):
            if i is None:
                return self.getTokens(bashGrammarParser.VAR)
            else:
                return self.getToken(bashGrammarParser.VAR, i)

        def EQUALS(self):
            return self.getToken(bashGrammarParser.EQUALS, 0)

        def string(self):
            return self.getTypedRuleContext(bashGrammarParser.StringContext,0)


        def VAL(self):
            return self.getToken(bashGrammarParser.VAL, 0)

        def SEMICOLON(self):
            return self.getToken(bashGrammarParser.SEMICOLON, 0)

        def space(self):
            return self.getTypedRuleContext(bashGrammarParser.SpaceContext,0)


        def getRuleIndex(self):
            return bashGrammarParser.RULE_assignment

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterAssignment" ):
                listener.enterAssignment(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitAssignment" ):
                listener.exitAssignment(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitAssignment" ):
                return visitor.visitAssignment(self)
            else:
                return visitor.visitChildren(self)




    def assignment(self):

        localctx = bashGrammarParser.AssignmentContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_assignment)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 81
            self.match(bashGrammarParser.VAR)
            self.state = 82
            self.match(bashGrammarParser.EQUALS)
            self.state = 86
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [bashGrammarParser.SINGLE_STRING, bashGrammarParser.DOUBLE_STRING]:
                self.state = 83
                self.string()
                pass
            elif token in [bashGrammarParser.VAL]:
                self.state = 84
                self.match(bashGrammarParser.VAL)
                pass
            elif token in [bashGrammarParser.VAR]:
                self.state = 85
                self.match(bashGrammarParser.VAR)
                pass
            else:
                raise NoViableAltException(self)

            self.state = 89
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,13,self._ctx)
            if la_ == 1:
                self.state = 88
                self.match(bashGrammarParser.SEMICOLON)


            self.state = 92
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,14,self._ctx)
            if la_ == 1:
                self.state = 91
                self.space()


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Command_dataContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def string(self):
            return self.getTypedRuleContext(bashGrammarParser.StringContext,0)


        def VAR(self):
            return self.getToken(bashGrammarParser.VAR, 0)

        def VAL(self):
            return self.getToken(bashGrammarParser.VAL, 0)

        def space(self):
            return self.getTypedRuleContext(bashGrammarParser.SpaceContext,0)


        def OTHER(self, i:int=None):
            if i is None:
                return self.getTokens(bashGrammarParser.OTHER)
            else:
                return self.getToken(bashGrammarParser.OTHER, i)

        def getRuleIndex(self):
            return bashGrammarParser.RULE_command_data

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterCommand_data" ):
                listener.enterCommand_data(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitCommand_data" ):
                listener.exitCommand_data(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitCommand_data" ):
                return visitor.visitCommand_data(self)
            else:
                return visitor.visitChildren(self)




    def command_data(self):

        localctx = bashGrammarParser.Command_dataContext(self, self._ctx, self.state)
        self.enterRule(localctx, 12, self.RULE_command_data)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 103
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [bashGrammarParser.OTHER]:
                self.state = 95 
                self._errHandler.sync(self)
                _alt = 1
                while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                    if _alt == 1:
                        self.state = 94
                        self.match(bashGrammarParser.OTHER)

                    else:
                        raise NoViableAltException(self)
                    self.state = 97 
                    self._errHandler.sync(self)
                    _alt = self._interp.adaptivePredict(self._input,15,self._ctx)

                pass
            elif token in [bashGrammarParser.SINGLE_STRING, bashGrammarParser.DOUBLE_STRING]:
                self.state = 99
                self.string()
                pass
            elif token in [bashGrammarParser.VAR]:
                self.state = 100
                self.match(bashGrammarParser.VAR)
                pass
            elif token in [bashGrammarParser.VAL]:
                self.state = 101
                self.match(bashGrammarParser.VAL)
                pass
            elif token in [bashGrammarParser.SPACE]:
                self.state = 102
                self.space()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ComparisonContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def VAR(self):
            return self.getToken(bashGrammarParser.VAR, 0)

        def COMPARE(self):
            return self.getToken(bashGrammarParser.COMPARE, 0)

        def VAL(self):
            return self.getToken(bashGrammarParser.VAL, 0)

        def getRuleIndex(self):
            return bashGrammarParser.RULE_comparison

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterComparison" ):
                listener.enterComparison(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitComparison" ):
                listener.exitComparison(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitComparison" ):
                return visitor.visitComparison(self)
            else:
                return visitor.visitChildren(self)




    def comparison(self):

        localctx = bashGrammarParser.ComparisonContext(self, self._ctx, self.state)
        self.enterRule(localctx, 14, self.RULE_comparison)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 105
            self.match(bashGrammarParser.VAR)
            self.state = 106
            self.match(bashGrammarParser.COMPARE)
            self.state = 107
            self.match(bashGrammarParser.VAL)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class IncrementContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def VAR(self):
            return self.getToken(bashGrammarParser.VAR, 0)

        def INCREMENT(self):
            return self.getToken(bashGrammarParser.INCREMENT, 0)

        def getRuleIndex(self):
            return bashGrammarParser.RULE_increment

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterIncrement" ):
                listener.enterIncrement(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitIncrement" ):
                listener.exitIncrement(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitIncrement" ):
                return visitor.visitIncrement(self)
            else:
                return visitor.visitChildren(self)




    def increment(self):

        localctx = bashGrammarParser.IncrementContext(self, self._ctx, self.state)
        self.enterRule(localctx, 16, self.RULE_increment)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 109
            self.match(bashGrammarParser.VAR)
            self.state = 110
            self.match(bashGrammarParser.INCREMENT)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class SpaceContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def SPACE(self, i:int=None):
            if i is None:
                return self.getTokens(bashGrammarParser.SPACE)
            else:
                return self.getToken(bashGrammarParser.SPACE, i)

        def getRuleIndex(self):
            return bashGrammarParser.RULE_space

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterSpace" ):
                listener.enterSpace(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitSpace" ):
                listener.exitSpace(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitSpace" ):
                return visitor.visitSpace(self)
            else:
                return visitor.visitChildren(self)




    def space(self):

        localctx = bashGrammarParser.SpaceContext(self, self._ctx, self.state)
        self.enterRule(localctx, 18, self.RULE_space)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 113 
            self._errHandler.sync(self)
            _alt = 1
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt == 1:
                    self.state = 112
                    self.match(bashGrammarParser.SPACE)

                else:
                    raise NoViableAltException(self)
                self.state = 115 
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,17,self._ctx)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class StringContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def SINGLE_STRING(self):
            return self.getToken(bashGrammarParser.SINGLE_STRING, 0)

        def DOUBLE_STRING(self):
            return self.getToken(bashGrammarParser.DOUBLE_STRING, 0)

        def getRuleIndex(self):
            return bashGrammarParser.RULE_string

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterString" ):
                listener.enterString(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitString" ):
                listener.exitString(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitString" ):
                return visitor.visitString(self)
            else:
                return visitor.visitChildren(self)




    def string(self):

        localctx = bashGrammarParser.StringContext(self, self._ctx, self.state)
        self.enterRule(localctx, 20, self.RULE_string)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 117
            _la = self._input.LA(1)
            if not(_la==bashGrammarParser.SINGLE_STRING or _la==bashGrammarParser.DOUBLE_STRING):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





