# Generated from rules.g4 by ANTLR 4.8
from antlr4 import *
from io import StringIO
from typing.io import TextIO
import sys



def serializedATN():
    with StringIO() as buf:
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\13")
        buf.write("B\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7")
        buf.write("\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3\2\3\2\3\3\6\3\33")
        buf.write("\n\3\r\3\16\3\34\3\3\7\3 \n\3\f\3\16\3#\13\3\3\4\6\4&")
        buf.write("\n\4\r\4\16\4\'\3\5\6\5+\n\5\r\5\16\5,\3\5\3\5\3\6\3\6")
        buf.write("\3\7\3\7\3\b\3\b\3\t\3\t\6\t9\n\t\r\t\16\t:\3\t\3\t\3")
        buf.write("\n\3\n\3\13\3\13\3:\2\f\3\2\5\3\7\4\t\5\13\6\r\7\17\b")
        buf.write("\21\t\23\n\25\13\3\2\6\5\2C\\aac|\3\2\62;\5\2\13\13\17")
        buf.write("\17\"\"\5\2*+C\\c|\2E\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2")
        buf.write("\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2")
        buf.write("\2\2\23\3\2\2\2\2\25\3\2\2\2\3\27\3\2\2\2\5\32\3\2\2\2")
        buf.write("\7%\3\2\2\2\t*\3\2\2\2\13\60\3\2\2\2\r\62\3\2\2\2\17\64")
        buf.write("\3\2\2\2\21\66\3\2\2\2\23>\3\2\2\2\25@\3\2\2\2\27\30\7")
        buf.write("$\2\2\30\4\3\2\2\2\31\33\t\2\2\2\32\31\3\2\2\2\33\34\3")
        buf.write("\2\2\2\34\32\3\2\2\2\34\35\3\2\2\2\35!\3\2\2\2\36 \t\3")
        buf.write("\2\2\37\36\3\2\2\2 #\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"")
        buf.write("\6\3\2\2\2#!\3\2\2\2$&\t\3\2\2%$\3\2\2\2&\'\3\2\2\2\'")
        buf.write("%\3\2\2\2\'(\3\2\2\2(\b\3\2\2\2)+\t\4\2\2*)\3\2\2\2+,")
        buf.write("\3\2\2\2,*\3\2\2\2,-\3\2\2\2-.\3\2\2\2./\b\5\2\2/\n\3")
        buf.write("\2\2\2\60\61\7\f\2\2\61\f\3\2\2\2\62\63\7-\2\2\63\16\3")
        buf.write("\2\2\2\64\65\7?\2\2\65\20\3\2\2\2\668\5\3\2\2\679\13\2")
        buf.write("\2\28\67\3\2\2\29:\3\2\2\2:;\3\2\2\2:8\3\2\2\2;<\3\2\2")
        buf.write("\2<=\5\3\2\2=\22\3\2\2\2>?\7=\2\2?\24\3\2\2\2@A\t\5\2")
        buf.write("\2A\26\3\2\2\2\b\2\34!\',:\3\b\2\2")
        return buf.getvalue()


class rulesLexer(Lexer):

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    VAR = 1
    NUMBER = 2
    WHITESPACE = 3
    NEWLINE = 4
    PLUS = 5
    ASSIGNMENT = 6
    STRING = 7
    SEMICOLON = 8
    WILDCARD = 9

    channelNames = [ u"DEFAULT_TOKEN_CHANNEL", u"HIDDEN" ]

    modeNames = [ "DEFAULT_MODE" ]

    literalNames = [ "<INVALID>",
            "'\n'", "'+'", "'='", "';'" ]

    symbolicNames = [ "<INVALID>",
            "VAR", "NUMBER", "WHITESPACE", "NEWLINE", "PLUS", "ASSIGNMENT", 
            "STRING", "SEMICOLON", "WILDCARD" ]

    ruleNames = [ "DBLQUOTE", "VAR", "NUMBER", "WHITESPACE", "NEWLINE", 
                  "PLUS", "ASSIGNMENT", "STRING", "SEMICOLON", "WILDCARD" ]

    grammarFileName = "rules.g4"

    def __init__(self, input=None, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.8")
        self._interp = LexerATNSimulator(self, self.atn, self.decisionsToDFA, PredictionContextCache())
        self._actions = None
        self._predicates = None


