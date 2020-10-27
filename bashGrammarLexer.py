# Generated from .\bashGrammar.g4 by ANTLR 4.7.2
from antlr4 import *
from io import StringIO
from typing.io import TextIO
import sys



def serializedATN():
    with StringIO() as buf:
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\35")
        buf.write("\u00ff\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7")
        buf.write("\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r")
        buf.write("\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22\4\23")
        buf.write("\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30")
        buf.write("\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36")
        buf.write("\t\36\4\37\t\37\4 \t \4!\t!\3\2\3\2\3\3\3\3\3\4\3\4\3")
        buf.write("\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\5\7R\n\7\3\b\3\b\6\bV\n")
        buf.write("\b\r\b\16\bW\3\b\3\b\3\t\3\t\6\t^\n\t\r\t\16\t_\3\t\3")
        buf.write("\t\3\n\3\n\7\nf\n\n\f\n\16\ni\13\n\3\n\3\n\3\13\3\13\3")
        buf.write("\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16")
        buf.write("\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21")
        buf.write("\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24")
        buf.write("\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24")
        buf.write("\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00a3\n\24\3\25\3")
        buf.write("\25\3\25\3\25\7\25\u00a9\n\25\f\25\16\25\u00ac\13\25\3")
        buf.write("\25\3\25\3\25\3\25\3\25\6\25\u00b3\n\25\r\25\16\25\u00b4")
        buf.write("\3\25\5\25\u00b8\n\25\3\26\3\26\3\26\3\26\5\26\u00be\n")
        buf.write("\26\3\27\3\27\3\27\3\27\5\27\u00c4\n\27\3\30\3\30\7\30")
        buf.write("\u00c8\n\30\f\30\16\30\u00cb\13\30\3\31\3\31\3\31\3\32")
        buf.write("\5\32\u00d1\n\32\3\32\6\32\u00d4\n\32\r\32\16\32\u00d5")
        buf.write("\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\35\5\35\u00e0\n")
        buf.write("\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36")
        buf.write("\3\36\3\36\5\36\u00ee\n\36\3\37\3\37\3\37\3\37\3\37\3")
        buf.write("\37\3\37\5\37\u00f7\n\37\3 \6 \u00fa\n \r \16 \u00fb\3")
        buf.write("!\3!\4\u00aa\u00fb\2\"\3\3\5\2\7\2\t\2\13\2\r\2\17\4\21")
        buf.write("\5\23\6\25\7\27\b\31\t\33\n\35\13\37\f!\r#\16%\17\'\20")
        buf.write(")\21+\22-\23/\24\61\25\63\26\65\27\67\309\31;\32=\33?")
        buf.write("\34A\35\3\2\13\3\2))\3\2$$\4\2\f\f\17\17\5\2\13\f\17\17")
        buf.write("\"\"\t\2##&(,\60\62;B\\``c|\5\2C\\aac|\6\2\62;C\\aac|")
        buf.write("\5\2\62;C\\c|\4\2>>@@\2\u0116\2\3\3\2\2\2\2\17\3\2\2\2")
        buf.write("\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2")
        buf.write("\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!")
        buf.write("\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2")
        buf.write("\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3")
        buf.write("\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2")
        buf.write("\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\3C\3\2\2\2\5E\3\2\2")
        buf.write("\2\7G\3\2\2\2\tI\3\2\2\2\13K\3\2\2\2\rQ\3\2\2\2\17S\3")
        buf.write("\2\2\2\21[\3\2\2\2\23c\3\2\2\2\25l\3\2\2\2\27n\3\2\2\2")
        buf.write("\31q\3\2\2\2\33v\3\2\2\2\35{\3\2\2\2\37\u0080\3\2\2\2")
        buf.write("!\u0083\3\2\2\2#\u0087\3\2\2\2%\u008a\3\2\2\2\'\u00a2")
        buf.write("\3\2\2\2)\u00b7\3\2\2\2+\u00bd\3\2\2\2-\u00c3\3\2\2\2")
        buf.write("/\u00c5\3\2\2\2\61\u00cc\3\2\2\2\63\u00d0\3\2\2\2\65\u00d7")
        buf.write("\3\2\2\2\67\u00d9\3\2\2\29\u00df\3\2\2\2;\u00ed\3\2\2")
        buf.write("\2=\u00f6\3\2\2\2?\u00f9\3\2\2\2A\u00fd\3\2\2\2CD\7.\2")
        buf.write("\2D\4\3\2\2\2EF\7-\2\2F\6\3\2\2\2GH\7/\2\2H\b\3\2\2\2")
        buf.write("IJ\7,\2\2J\n\3\2\2\2KL\7\61\2\2L\f\3\2\2\2MR\5\5\3\2N")
        buf.write("R\5\7\4\2OR\5\t\5\2PR\5\13\6\2QM\3\2\2\2QN\3\2\2\2QO\3")
        buf.write("\2\2\2QP\3\2\2\2R\16\3\2\2\2SU\7)\2\2TV\n\2\2\2UT\3\2")
        buf.write("\2\2VW\3\2\2\2WU\3\2\2\2WX\3\2\2\2XY\3\2\2\2YZ\7)\2\2")
        buf.write("Z\20\3\2\2\2[]\7$\2\2\\^\n\3\2\2]\\\3\2\2\2^_\3\2\2\2")
        buf.write("_]\3\2\2\2_`\3\2\2\2`a\3\2\2\2ab\7$\2\2b\22\3\2\2\2cg")
        buf.write("\7%\2\2df\n\4\2\2ed\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2")
        buf.write("\2\2hj\3\2\2\2ig\3\2\2\2jk\b\n\2\2k\24\3\2\2\2lm\t\5\2")
        buf.write("\2m\26\3\2\2\2no\7k\2\2op\7h\2\2p\30\3\2\2\2qr\7v\2\2")
        buf.write("rs\7j\2\2st\7g\2\2tu\7p\2\2u\32\3\2\2\2vw\7g\2\2wx\7n")
        buf.write("\2\2xy\7k\2\2yz\7h\2\2z\34\3\2\2\2{|\7g\2\2|}\7n\2\2}")
        buf.write("~\7u\2\2~\177\7g\2\2\177\36\3\2\2\2\u0080\u0081\7h\2\2")
        buf.write("\u0081\u0082\7k\2\2\u0082 \3\2\2\2\u0083\u0084\7h\2\2")
        buf.write("\u0084\u0085\7q\2\2\u0085\u0086\7t\2\2\u0086\"\3\2\2\2")
        buf.write("\u0087\u0088\7f\2\2\u0088\u0089\7q\2\2\u0089$\3\2\2\2")
        buf.write("\u008a\u008b\7f\2\2\u008b\u008c\7q\2\2\u008c\u008d\7p")
        buf.write("\2\2\u008d\u008e\7g\2\2\u008e&\3\2\2\2\u008f\u0090\7g")
        buf.write("\2\2\u0090\u0091\7e\2\2\u0091\u0092\7j\2\2\u0092\u00a3")
        buf.write("\7q\2\2\u0093\u0094\7e\2\2\u0094\u0095\7c\2\2\u0095\u00a3")
        buf.write("\7v\2\2\u0096\u0097\7n\2\2\u0097\u00a3\7u\2\2\u0098\u0099")
        buf.write("\7n\2\2\u0099\u00a3\7n\2\2\u009a\u009b\7v\2\2\u009b\u009c")
        buf.write("\7k\2\2\u009c\u009d\7o\2\2\u009d\u00a3\7g\2\2\u009e\u009f")
        buf.write("\7y\2\2\u009f\u00a0\7i\2\2\u00a0\u00a1\7g\2\2\u00a1\u00a3")
        buf.write("\7v\2\2\u00a2\u008f\3\2\2\2\u00a2\u0093\3\2\2\2\u00a2")
        buf.write("\u0096\3\2\2\2\u00a2\u0098\3\2\2\2\u00a2\u009a\3\2\2\2")
        buf.write("\u00a2\u009e\3\2\2\2\u00a3(\3\2\2\2\u00a4\u00a5\7&\2\2")
        buf.write("\u00a5\u00a6\7}\2\2\u00a6\u00aa\3\2\2\2\u00a7\u00a9\13")
        buf.write("\2\2\2\u00a8\u00a7\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00ab")
        buf.write("\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ad\3\2\2\2\u00ac")
        buf.write("\u00aa\3\2\2\2\u00ad\u00b8\7\177\2\2\u00ae\u00af\7&\2")
        buf.write("\2\u00af\u00b0\7*\2\2\u00b0\u00b2\3\2\2\2\u00b1\u00b3")
        buf.write("\t\6\2\2\u00b2\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4")
        buf.write("\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6\3\2\2\2")
        buf.write("\u00b6\u00b8\7+\2\2\u00b7\u00a4\3\2\2\2\u00b7\u00ae\3")
        buf.write("\2\2\2\u00b8*\3\2\2\2\u00b9\u00ba\7*\2\2\u00ba\u00be\7")
        buf.write("*\2\2\u00bb\u00bc\7]\2\2\u00bc\u00be\7]\2\2\u00bd\u00b9")
        buf.write("\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be,\3\2\2\2\u00bf\u00c0")
        buf.write("\7+\2\2\u00c0\u00c4\7+\2\2\u00c1\u00c2\7_\2\2\u00c2\u00c4")
        buf.write("\7_\2\2\u00c3\u00bf\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4")
        buf.write(".\3\2\2\2\u00c5\u00c9\t\7\2\2\u00c6\u00c8\t\b\2\2\u00c7")
        buf.write("\u00c6\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2")
        buf.write("\u00c9\u00ca\3\2\2\2\u00ca\60\3\2\2\2\u00cb\u00c9\3\2")
        buf.write("\2\2\u00cc\u00cd\7&\2\2\u00cd\u00ce\5/\30\2\u00ce\62\3")
        buf.write("\2\2\2\u00cf\u00d1\7/\2\2\u00d0\u00cf\3\2\2\2\u00d0\u00d1")
        buf.write("\3\2\2\2\u00d1\u00d3\3\2\2\2\u00d2\u00d4\t\t\2\2\u00d3")
        buf.write("\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d3\3\2\2\2")
        buf.write("\u00d5\u00d6\3\2\2\2\u00d6\64\3\2\2\2\u00d7\u00d8\7?\2")
        buf.write("\2\u00d8\66\3\2\2\2\u00d9\u00da\7=\2\2\u00da8\3\2\2\2")
        buf.write("\u00db\u00dc\7~\2\2\u00dc\u00e0\7~\2\2\u00dd\u00de\7(")
        buf.write("\2\2\u00de\u00e0\7(\2\2\u00df\u00db\3\2\2\2\u00df\u00dd")
        buf.write("\3\2\2\2\u00e0:\3\2\2\2\u00e1\u00e2\7-\2\2\u00e2\u00ee")
        buf.write("\7-\2\2\u00e3\u00e4\7/\2\2\u00e4\u00ee\7/\2\2\u00e5\u00e6")
        buf.write("\7-\2\2\u00e6\u00ee\7?\2\2\u00e7\u00e8\7/\2\2\u00e8\u00ee")
        buf.write("\7?\2\2\u00e9\u00ea\7\61\2\2\u00ea\u00ee\7?\2\2\u00eb")
        buf.write("\u00ec\7,\2\2\u00ec\u00ee\7?\2\2\u00ed\u00e1\3\2\2\2\u00ed")
        buf.write("\u00e3\3\2\2\2\u00ed\u00e5\3\2\2\2\u00ed\u00e7\3\2\2\2")
        buf.write("\u00ed\u00e9\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee<\3\2\2")
        buf.write("\2\u00ef\u00f0\7>\2\2\u00f0\u00f7\7?\2\2\u00f1\u00f2\7")
        buf.write("@\2\2\u00f2\u00f7\7?\2\2\u00f3\u00f7\t\n\2\2\u00f4\u00f5")
        buf.write("\7?\2\2\u00f5\u00f7\7?\2\2\u00f6\u00ef\3\2\2\2\u00f6\u00f1")
        buf.write("\3\2\2\2\u00f6\u00f3\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f7")
        buf.write(">\3\2\2\2\u00f8\u00fa\t\6\2\2\u00f9\u00f8\3\2\2\2\u00fa")
        buf.write("\u00fb\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fb\u00f9\3\2\2\2")
        buf.write("\u00fc@\3\2\2\2\u00fd\u00fe\13\2\2\2\u00feB\3\2\2\2\24")
        buf.write("\2QW_g\u00a2\u00aa\u00b4\u00b7\u00bd\u00c3\u00c9\u00d0")
        buf.write("\u00d5\u00df\u00ed\u00f6\u00fb\3\b\2\2")
        return buf.getvalue()


class bashGrammarLexer(Lexer):

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    T__0 = 1
    SINGLE_STRING = 2
    DOUBLE_STRING = 3
    COMMENT = 4
    SPACE = 5
    IF = 6
    THEN = 7
    ELIF = 8
    ELSE = 9
    FI = 10
    FOR = 11
    DO = 12
    DONE = 13
    COMMAND = 14
    RHS_ASSIGNMENT = 15
    OPEN_BRACKETS = 16
    CLOSE_BRACKETS = 17
    VAR = 18
    BASH_VAR = 19
    VAL = 20
    ASSIGN = 21
    SEMICOLON = 22
    LOGICAL_OP = 23
    INCREMENT = 24
    COMPARE = 25
    BLOB = 26
    OTHER = 27

    channelNames = [ u"DEFAULT_TOKEN_CHANNEL", u"HIDDEN" ]

    modeNames = [ "DEFAULT_MODE" ]

    literalNames = [ "<INVALID>",
            "','", "'if'", "'then'", "'elif'", "'else'", "'fi'", "'for'", 
            "'do'", "'done'", "'='", "';'" ]

    symbolicNames = [ "<INVALID>",
            "SINGLE_STRING", "DOUBLE_STRING", "COMMENT", "SPACE", "IF", 
            "THEN", "ELIF", "ELSE", "FI", "FOR", "DO", "DONE", "COMMAND", 
            "RHS_ASSIGNMENT", "OPEN_BRACKETS", "CLOSE_BRACKETS", "VAR", 
            "BASH_VAR", "VAL", "ASSIGN", "SEMICOLON", "LOGICAL_OP", "INCREMENT", 
            "COMPARE", "BLOB", "OTHER" ]

    ruleNames = [ "T__0", "PLUS", "MINUS", "MULTIPLY", "DIVIDE", "OPERATOR", 
                  "SINGLE_STRING", "DOUBLE_STRING", "COMMENT", "SPACE", 
                  "IF", "THEN", "ELIF", "ELSE", "FI", "FOR", "DO", "DONE", 
                  "COMMAND", "RHS_ASSIGNMENT", "OPEN_BRACKETS", "CLOSE_BRACKETS", 
                  "VAR", "BASH_VAR", "VAL", "ASSIGN", "SEMICOLON", "LOGICAL_OP", 
                  "INCREMENT", "COMPARE", "BLOB", "OTHER" ]

    grammarFileName = "bashGrammar.g4"

    def __init__(self, input=None, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.7.2")
        self._interp = LexerATNSimulator(self, self.atn, self.decisionsToDFA, PredictionContextCache())
        self._actions = None
        self._predicates = None


