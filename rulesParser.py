# Generated from rules.g4 by ANTLR 4.8
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
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\13")
        buf.write("\33\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\3\2\6\2\f\n\2\r\2")
        buf.write("\16\2\r\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3")
        buf.write("\5\2\2\6\2\4\6\b\2\4\4\2\3\4\t\t\4\3\6\6\n\n\2\27\2\13")
        buf.write("\3\2\2\2\4\17\3\2\2\2\6\24\3\2\2\2\b\30\3\2\2\2\n\f\5")
        buf.write("\4\3\2\13\n\3\2\2\2\f\r\3\2\2\2\r\13\3\2\2\2\r\16\3\2")
        buf.write("\2\2\16\3\3\2\2\2\17\20\7\3\2\2\20\21\7\b\2\2\21\22\t")
        buf.write("\2\2\2\22\23\t\3\2\2\23\5\3\2\2\2\24\25\7\4\2\2\25\26")
        buf.write("\7\7\2\2\26\27\7\4\2\2\27\7\3\2\2\2\30\31\7\t\2\2\31\t")
        buf.write("\3\2\2\2\3\r")
        return buf.getvalue()


class rulesParser ( Parser ):

    grammarFileName = "rules.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                     "'\n'", "'+'", "'='", "<INVALID>", "';'" ]

    symbolicNames = [ "<INVALID>", "VAR", "NUMBER", "WHITESPACE", "NEWLINE", 
                      "PLUS", "ASSIGNMENT", "STRING", "SEMICOLON", "WILDCARD" ]

    RULE_line = 0
    RULE_assign = 1
    RULE_addition = 2
    RULE_strings = 3

    ruleNames =  [ "line", "assign", "addition", "strings" ]

    EOF = Token.EOF
    VAR=1
    NUMBER=2
    WHITESPACE=3
    NEWLINE=4
    PLUS=5
    ASSIGNMENT=6
    STRING=7
    SEMICOLON=8
    WILDCARD=9

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.8")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class LineContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def assign(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(rulesParser.AssignContext)
            else:
                return self.getTypedRuleContext(rulesParser.AssignContext,i)


        def getRuleIndex(self):
            return rulesParser.RULE_line

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterLine" ):
                listener.enterLine(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitLine" ):
                listener.exitLine(self)




    def line(self):

        localctx = rulesParser.LineContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_line)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 9 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 8
                self.assign()
                self.state = 11 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not (_la==rulesParser.VAR):
                    break

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class AssignContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def VAR(self, i:int=None):
            if i is None:
                return self.getTokens(rulesParser.VAR)
            else:
                return self.getToken(rulesParser.VAR, i)

        def ASSIGNMENT(self):
            return self.getToken(rulesParser.ASSIGNMENT, 0)

        def NUMBER(self):
            return self.getToken(rulesParser.NUMBER, 0)

        def STRING(self):
            return self.getToken(rulesParser.STRING, 0)

        def NEWLINE(self):
            return self.getToken(rulesParser.NEWLINE, 0)

        def SEMICOLON(self):
            return self.getToken(rulesParser.SEMICOLON, 0)

        def EOF(self):
            return self.getToken(rulesParser.EOF, 0)

        def getRuleIndex(self):
            return rulesParser.RULE_assign

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterAssign" ):
                listener.enterAssign(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitAssign" ):
                listener.exitAssign(self)




    def assign(self):

        localctx = rulesParser.AssignContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_assign)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 13
            self.match(rulesParser.VAR)
            self.state = 14
            self.match(rulesParser.ASSIGNMENT)
            self.state = 15
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << rulesParser.VAR) | (1 << rulesParser.NUMBER) | (1 << rulesParser.STRING))) != 0)):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
            self.state = 16
            _la = self._input.LA(1)
            if not(((((_la - -1)) & ~0x3f) == 0 and ((1 << (_la - -1)) & ((1 << (rulesParser.EOF - -1)) | (1 << (rulesParser.NEWLINE - -1)) | (1 << (rulesParser.SEMICOLON - -1)))) != 0)):
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


    class AdditionContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def NUMBER(self, i:int=None):
            if i is None:
                return self.getTokens(rulesParser.NUMBER)
            else:
                return self.getToken(rulesParser.NUMBER, i)

        def PLUS(self):
            return self.getToken(rulesParser.PLUS, 0)

        def getRuleIndex(self):
            return rulesParser.RULE_addition

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterAddition" ):
                listener.enterAddition(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitAddition" ):
                listener.exitAddition(self)




    def addition(self):

        localctx = rulesParser.AdditionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_addition)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 18
            self.match(rulesParser.NUMBER)
            self.state = 19
            self.match(rulesParser.PLUS)
            self.state = 20
            self.match(rulesParser.NUMBER)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class StringsContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def STRING(self):
            return self.getToken(rulesParser.STRING, 0)

        def getRuleIndex(self):
            return rulesParser.RULE_strings

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterStrings" ):
                listener.enterStrings(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitStrings" ):
                listener.exitStrings(self)




    def strings(self):

        localctx = rulesParser.StringsContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_strings)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 22
            self.match(rulesParser.STRING)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





