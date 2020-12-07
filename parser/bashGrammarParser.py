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
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3!")
        buf.write("\u0194\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7")
        buf.write("\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16")
        buf.write("\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22\3\2\7\2")
        buf.write("&\n\2\f\2\16\2)\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3")
        buf.write("\3\6\3\64\n\3\r\3\16\3\65\3\4\3\4\3\4\3\4\3\4\7\4=\n\4")
        buf.write("\f\4\16\4@\13\4\3\4\5\4C\n\4\3\5\3\5\5\5G\n\5\3\5\3\5")
        buf.write("\5\5K\n\5\3\5\3\5\3\5\5\5P\n\5\3\5\5\5S\n\5\3\5\5\5V\n")
        buf.write("\5\3\5\3\5\5\5Z\n\5\3\5\3\5\3\5\5\5_\n\5\3\6\5\6b\n\6")
        buf.write("\3\6\3\6\7\6f\n\6\f\6\16\6i\13\6\3\6\3\6\5\6m\n\6\3\6")
        buf.write("\5\6p\n\6\3\6\3\6\5\6t\n\6\3\6\7\6w\n\6\f\6\16\6z\13\6")
        buf.write("\3\6\3\6\5\6~\n\6\3\6\5\6\u0081\n\6\3\6\3\6\7\6\u0085")
        buf.write("\n\6\f\6\16\6\u0088\13\6\3\6\5\6\u008b\n\6\3\7\3\7\5\7")
        buf.write("\u008f\n\7\3\7\3\7\5\7\u0093\n\7\3\7\3\7\3\7\5\7\u0098")
        buf.write("\n\7\3\7\7\7\u009b\n\7\f\7\16\7\u009e\13\7\3\7\3\7\5\7")
        buf.write("\u00a2\n\7\3\7\5\7\u00a5\n\7\3\7\5\7\u00a8\n\7\3\7\3\7")
        buf.write("\5\7\u00ac\n\7\3\7\3\7\3\7\5\7\u00b1\n\7\3\7\3\7\5\7\u00b5")
        buf.write("\n\7\3\7\3\7\3\7\7\7\u00ba\n\7\f\7\16\7\u00bd\13\7\3\7")
        buf.write("\3\7\5\7\u00c1\n\7\3\7\5\7\u00c4\n\7\3\7\5\7\u00c7\n\7")
        buf.write("\3\7\3\7\5\7\u00cb\n\7\3\7\3\7\7\7\u00cf\n\7\f\7\16\7")
        buf.write("\u00d2\13\7\3\7\3\7\5\7\u00d6\n\7\3\7\3\7\3\7\5\7\u00db")
        buf.write("\n\7\3\b\5\b\u00de\n\b\3\b\6\b\u00e1\n\b\r\b\16\b\u00e2")
        buf.write("\3\b\5\b\u00e6\n\b\3\b\3\b\5\b\u00ea\n\b\3\b\3\b\3\b\3")
        buf.write("\b\3\b\3\b\3\b\6\b\u00f3\n\b\r\b\16\b\u00f4\3\b\5\b\u00f8")
        buf.write("\n\b\3\t\3\t\5\t\u00fc\n\t\3\t\7\t\u00ff\n\t\f\t\16\t")
        buf.write("\u0102\13\t\3\t\5\t\u0105\n\t\3\t\5\t\u0108\n\t\3\n\3")
        buf.write("\n\3\n\3\n\3\n\3\n\3\n\3\n\6\n\u0112\n\n\r\n\16\n\u0113")
        buf.write("\3\n\5\n\u0117\n\n\3\n\5\n\u011a\n\n\3\13\3\13\5\13\u011e")
        buf.write("\n\13\3\13\3\13\5\13\u0122\n\13\3\13\3\13\5\13\u0126\n")
        buf.write("\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u012e\n\13\f\13")
        buf.write("\16\13\u0131\13\13\3\13\5\13\u0134\n\13\3\13\3\13\5\13")
        buf.write("\u0138\n\13\3\13\5\13\u013b\n\13\3\f\3\f\3\f\3\f\3\f\3")
        buf.write("\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0149\n\f\3\r\3\r\3\r\3")
        buf.write("\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0156\n\16")
        buf.write("\3\16\3\16\5\16\u015a\n\16\3\17\6\17\u015d\n\17\r\17\16")
        buf.write("\17\u015e\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\5\22")
        buf.write("\u0169\n\22\7\22\u016b\n\22\f\22\16\22\u016e\13\22\3\22")
        buf.write("\3\22\3\22\3\22\3\22\7\22\u0175\n\22\f\22\16\22\u0178")
        buf.write("\13\22\3\22\7\22\u017b\n\22\f\22\16\22\u017e\13\22\3\22")
        buf.write("\7\22\u0181\n\22\f\22\16\22\u0184\13\22\3\22\3\22\7\22")
        buf.write("\u0188\n\22\f\22\16\22\u018b\13\22\3\22\3\22\5\22\u018f")
        buf.write("\n\22\3\22\5\22\u0192\n\22\3\22\6x\u009c\u00bb\u0100\2")
        buf.write("\23\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\7\5\2")
        buf.write("\25\25\32\32  \4\2\33\33\36\36\3\2\4\5\4\2\30\30\32\32")
        buf.write("\4\2\25\25\27\27\2\u01f1\2\'\3\2\2\2\4\63\3\2\2\2\6>\3")
        buf.write("\2\2\2\bD\3\2\2\2\na\3\2\2\2\f\u008c\3\2\2\2\16\u00dd")
        buf.write("\3\2\2\2\20\u00f9\3\2\2\2\22\u0109\3\2\2\2\24\u011b\3")
        buf.write("\2\2\2\26\u0148\3\2\2\2\30\u014a\3\2\2\2\32\u0159\3\2")
        buf.write("\2\2\34\u015c\3\2\2\2\36\u0160\3\2\2\2 \u0162\3\2\2\2")
        buf.write("\"\u0164\3\2\2\2$&\5\4\3\2%$\3\2\2\2&)\3\2\2\2\'%\3\2")
        buf.write("\2\2\'(\3\2\2\2(*\3\2\2\2)\'\3\2\2\2*+\7\2\2\3+\3\3\2")
        buf.write("\2\2,\64\5\b\5\2-\64\5\22\n\2.\64\5\20\t\2/\64\5\34\17")
        buf.write("\2\60\64\5\24\13\2\61\64\5\f\7\2\62\64\5\"\22\2\63,\3")
        buf.write("\2\2\2\63-\3\2\2\2\63.\3\2\2\2\63/\3\2\2\2\63\60\3\2\2")
        buf.write("\2\63\61\3\2\2\2\63\62\3\2\2\2\64\65\3\2\2\2\65\63\3\2")
        buf.write("\2\2\65\66\3\2\2\2\66\5\3\2\2\2\67=\5\b\5\28=\5\22\n\2")
        buf.write("9=\5\20\t\2:=\5\24\13\2;=\5\f\7\2<\67\3\2\2\2<8\3\2\2")
        buf.write("\2<9\3\2\2\2<:\3\2\2\2<;\3\2\2\2=@\3\2\2\2><\3\2\2\2>")
        buf.write("?\3\2\2\2?B\3\2\2\2@>\3\2\2\2AC\5\34\17\2BA\3\2\2\2BC")
        buf.write("\3\2\2\2C\7\3\2\2\2DF\7\r\2\2EG\5\34\17\2FE\3\2\2\2FG")
        buf.write("\3\2\2\2GH\3\2\2\2HJ\7\23\2\2IK\5\34\17\2JI\3\2\2\2JK")
        buf.write("\3\2\2\2KL\3\2\2\2LM\5\n\6\2MO\7\24\2\2NP\5\34\17\2ON")
        buf.write("\3\2\2\2OP\3\2\2\2PR\3\2\2\2QS\7\34\2\2RQ\3\2\2\2RS\3")
        buf.write("\2\2\2SU\3\2\2\2TV\5\34\17\2UT\3\2\2\2UV\3\2\2\2VW\3\2")
        buf.write("\2\2WY\7\16\2\2XZ\5\34\17\2YX\3\2\2\2YZ\3\2\2\2Z[\3\2")
        buf.write("\2\2[\\\5\6\4\2\\^\7\17\2\2]_\5\34\17\2^]\3\2\2\2^_\3")
        buf.write("\2\2\2_\t\3\2\2\2`b\5\22\n\2a`\3\2\2\2ab\3\2\2\2bg\3\2")
        buf.write("\2\2cd\7\3\2\2df\5\22\n\2ec\3\2\2\2fi\3\2\2\2ge\3\2\2")
        buf.write("\2gh\3\2\2\2hj\3\2\2\2ig\3\2\2\2jl\7\34\2\2km\5\34\17")
        buf.write("\2lk\3\2\2\2lm\3\2\2\2mo\3\2\2\2np\5\16\b\2on\3\2\2\2")
        buf.write("op\3\2\2\2px\3\2\2\2qs\7\35\2\2rt\5\34\17\2sr\3\2\2\2")
        buf.write("st\3\2\2\2tu\3\2\2\2uw\5\16\b\2vq\3\2\2\2wz\3\2\2\2xy")
        buf.write("\3\2\2\2xv\3\2\2\2y{\3\2\2\2zx\3\2\2\2{}\7\34\2\2|~\5")
        buf.write("\34\17\2}|\3\2\2\2}~\3\2\2\2~\u0080\3\2\2\2\177\u0081")
        buf.write("\5\32\16\2\u0080\177\3\2\2\2\u0080\u0081\3\2\2\2\u0081")
        buf.write("\u0086\3\2\2\2\u0082\u0083\7\3\2\2\u0083\u0085\5\32\16")
        buf.write("\2\u0084\u0082\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084")
        buf.write("\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u008a\3\2\2\2\u0088")
        buf.write("\u0086\3\2\2\2\u0089\u008b\5\34\17\2\u008a\u0089\3\2\2")
        buf.write("\2\u008a\u008b\3\2\2\2\u008b\13\3\2\2\2\u008c\u008e\7")
        buf.write("\b\2\2\u008d\u008f\5\34\17\2\u008e\u008d\3\2\2\2\u008e")
        buf.write("\u008f\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0092\7\23\2")
        buf.write("\2\u0091\u0093\5\34\17\2\u0092\u0091\3\2\2\2\u0092\u0093")
        buf.write("\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u009c\5\16\b\2\u0095")
        buf.write("\u0097\7\35\2\2\u0096\u0098\5\34\17\2\u0097\u0096\3\2")
        buf.write("\2\2\u0097\u0098\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009b")
        buf.write("\5\16\b\2\u009a\u0095\3\2\2\2\u009b\u009e\3\2\2\2\u009c")
        buf.write("\u009d\3\2\2\2\u009c\u009a\3\2\2\2\u009d\u009f\3\2\2\2")
        buf.write("\u009e\u009c\3\2\2\2\u009f\u00a1\7\24\2\2\u00a0\u00a2")
        buf.write("\5\34\17\2\u00a1\u00a0\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2")
        buf.write("\u00a4\3\2\2\2\u00a3\u00a5\7\34\2\2\u00a4\u00a3\3\2\2")
        buf.write("\2\u00a4\u00a5\3\2\2\2\u00a5\u00a7\3\2\2\2\u00a6\u00a8")
        buf.write("\5\34\17\2\u00a7\u00a6\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8")
        buf.write("\u00a9\3\2\2\2\u00a9\u00ab\7\t\2\2\u00aa\u00ac\5\34\17")
        buf.write("\2\u00ab\u00aa\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad")
        buf.write("\3\2\2\2\u00ad\u00d0\5\6\4\2\u00ae\u00b0\7\n\2\2\u00af")
        buf.write("\u00b1\5\34\17\2\u00b0\u00af\3\2\2\2\u00b0\u00b1\3\2\2")
        buf.write("\2\u00b1\u00b2\3\2\2\2\u00b2\u00b4\7\23\2\2\u00b3\u00b5")
        buf.write("\5\34\17\2\u00b4\u00b3\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5")
        buf.write("\u00b6\3\2\2\2\u00b6\u00bb\5\16\b\2\u00b7\u00b8\7\35\2")
        buf.write("\2\u00b8\u00ba\5\16\b\2\u00b9\u00b7\3\2\2\2\u00ba\u00bd")
        buf.write("\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc")
        buf.write("\u00be\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00c0\7\24\2")
        buf.write("\2\u00bf\u00c1\5\34\17\2\u00c0\u00bf\3\2\2\2\u00c0\u00c1")
        buf.write("\3\2\2\2\u00c1\u00c3\3\2\2\2\u00c2\u00c4\7\34\2\2\u00c3")
        buf.write("\u00c2\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c6\3\2\2\2")
        buf.write("\u00c5\u00c7\5\34\17\2\u00c6\u00c5\3\2\2\2\u00c6\u00c7")
        buf.write("\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00ca\7\t\2\2\u00c9")
        buf.write("\u00cb\5\34\17\2\u00ca\u00c9\3\2\2\2\u00ca\u00cb\3\2\2")
        buf.write("\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\5\6\4\2\u00cd\u00cf")
        buf.write("\3\2\2\2\u00ce\u00ae\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0")
        buf.write("\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d3\3\2\2\2")
        buf.write("\u00d2\u00d0\3\2\2\2\u00d3\u00d5\7\13\2\2\u00d4\u00d6")
        buf.write("\5\34\17\2\u00d5\u00d4\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6")
        buf.write("\u00d7\3\2\2\2\u00d7\u00d8\5\6\4\2\u00d8\u00da\7\f\2\2")
        buf.write("\u00d9\u00db\5\34\17\2\u00da\u00d9\3\2\2\2\u00da\u00db")
        buf.write("\3\2\2\2\u00db\r\3\2\2\2\u00dc\u00de\5\34\17\2\u00dd\u00dc")
        buf.write("\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00e0\3\2\2\2\u00df")
        buf.write("\u00e1\t\2\2\2\u00e0\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2")
        buf.write("\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e5\3")
        buf.write("\2\2\2\u00e4\u00e6\5\34\17\2\u00e5\u00e4\3\2\2\2\u00e5")
        buf.write("\u00e6\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e9\7\37\2")
        buf.write("\2\u00e8\u00ea\5\34\17\2\u00e9\u00e8\3\2\2\2\u00e9\u00ea")
        buf.write("\3\2\2\2\u00ea\u00f2\3\2\2\2\u00eb\u00f3\5\36\20\2\u00ec")
        buf.write("\u00f3\7\25\2\2\u00ed\u00f3\7\32\2\2\u00ee\u00f3\7 \2")
        buf.write("\2\u00ef\u00f3\7\31\2\2\u00f0\u00f3\7\22\2\2\u00f1\u00f3")
        buf.write("\7 \2\2\u00f2\u00eb\3\2\2\2\u00f2\u00ec\3\2\2\2\u00f2")
        buf.write("\u00ed\3\2\2\2\u00f2\u00ee\3\2\2\2\u00f2\u00ef\3\2\2\2")
        buf.write("\u00f2\u00f0\3\2\2\2\u00f2\u00f1\3\2\2\2\u00f3\u00f4\3")
        buf.write("\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f7")
        buf.write("\3\2\2\2\u00f6\u00f8\5\34\17\2\u00f7\u00f6\3\2\2\2\u00f7")
        buf.write("\u00f8\3\2\2\2\u00f8\17\3\2\2\2\u00f9\u00fb\7\21\2\2\u00fa")
        buf.write("\u00fc\5\34\17\2\u00fb\u00fa\3\2\2\2\u00fb\u00fc\3\2\2")
        buf.write("\2\u00fc\u0100\3\2\2\2\u00fd\u00ff\5\26\f\2\u00fe\u00fd")
        buf.write("\3\2\2\2\u00ff\u0102\3\2\2\2\u0100\u0101\3\2\2\2\u0100")
        buf.write("\u00fe\3\2\2\2\u0101\u0104\3\2\2\2\u0102\u0100\3\2\2\2")
        buf.write("\u0103\u0105\7\34\2\2\u0104\u0103\3\2\2\2\u0104\u0105")
        buf.write("\3\2\2\2\u0105\u0107\3\2\2\2\u0106\u0108\5\34\17\2\u0107")
        buf.write("\u0106\3\2\2\2\u0107\u0108\3\2\2\2\u0108\21\3\2\2\2\u0109")
        buf.write("\u010a\7\25\2\2\u010a\u0111\7\33\2\2\u010b\u0112\5\36")
        buf.write("\20\2\u010c\u0112\7\32\2\2\u010d\u0112\7\25\2\2\u010e")
        buf.write("\u0112\7\31\2\2\u010f\u0112\7\22\2\2\u0110\u0112\7 \2")
        buf.write("\2\u0111\u010b\3\2\2\2\u0111\u010c\3\2\2\2\u0111\u010d")
        buf.write("\3\2\2\2\u0111\u010e\3\2\2\2\u0111\u010f\3\2\2\2\u0111")
        buf.write("\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0111\3\2\2\2")
        buf.write("\u0113\u0114\3\2\2\2\u0114\u0116\3\2\2\2\u0115\u0117\7")
        buf.write("\34\2\2\u0116\u0115\3\2\2\2\u0116\u0117\3\2\2\2\u0117")
        buf.write("\u0119\3\2\2\2\u0118\u011a\5\34\17\2\u0119\u0118\3\2\2")
        buf.write("\2\u0119\u011a\3\2\2\2\u011a\23\3\2\2\2\u011b\u011d\7")
        buf.write("\23\2\2\u011c\u011e\5\34\17\2\u011d\u011c\3\2\2\2\u011d")
        buf.write("\u011e\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0121\7\25\2")
        buf.write("\2\u0120\u0122\5\34\17\2\u0121\u0120\3\2\2\2\u0121\u0122")
        buf.write("\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0125\t\3\2\2\u0124")
        buf.write("\u0126\5\34\17\2\u0125\u0124\3\2\2\2\u0125\u0126\3\2\2")
        buf.write("\2\u0126\u012f\3\2\2\2\u0127\u012e\5\36\20\2\u0128\u012e")
        buf.write("\7\32\2\2\u0129\u012e\7\25\2\2\u012a\u012e\7\31\2\2\u012b")
        buf.write("\u012e\7\22\2\2\u012c\u012e\7 \2\2\u012d\u0127\3\2\2\2")
        buf.write("\u012d\u0128\3\2\2\2\u012d\u0129\3\2\2\2\u012d\u012a\3")
        buf.write("\2\2\2\u012d\u012b\3\2\2\2\u012d\u012c\3\2\2\2\u012e\u0131")
        buf.write("\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130")
        buf.write("\u0133\3\2\2\2\u0131\u012f\3\2\2\2\u0132\u0134\5\34\17")
        buf.write("\2\u0133\u0132\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0135")
        buf.write("\3\2\2\2\u0135\u0137\7\24\2\2\u0136\u0138\7\34\2\2\u0137")
        buf.write("\u0136\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u013a\3\2\2\2")
        buf.write("\u0139\u013b\5\34\17\2\u013a\u0139\3\2\2\2\u013a\u013b")
        buf.write("\3\2\2\2\u013b\25\3\2\2\2\u013c\u0149\7\25\2\2\u013d\u0149")
        buf.write("\7\32\2\2\u013e\u0149\7 \2\2\u013f\u0149\7\31\2\2\u0140")
        buf.write("\u0149\5\36\20\2\u0141\u0149\7\36\2\2\u0142\u0149\7!\2")
        buf.write("\2\u0143\u0149\5\34\17\2\u0144\u0149\5 \21\2\u0145\u0149")
        buf.write("\7\27\2\2\u0146\u0149\7\26\2\2\u0147\u0149\7\22\2\2\u0148")
        buf.write("\u013c\3\2\2\2\u0148\u013d\3\2\2\2\u0148\u013e\3\2\2\2")
        buf.write("\u0148\u013f\3\2\2\2\u0148\u0140\3\2\2\2\u0148\u0141\3")
        buf.write("\2\2\2\u0148\u0142\3\2\2\2\u0148\u0143\3\2\2\2\u0148\u0144")
        buf.write("\3\2\2\2\u0148\u0145\3\2\2\2\u0148\u0146\3\2\2\2\u0148")
        buf.write("\u0147\3\2\2\2\u0149\27\3\2\2\2\u014a\u014b\7\25\2\2\u014b")
        buf.write("\u014c\7\37\2\2\u014c\u014d\7\32\2\2\u014d\31\3\2\2\2")
        buf.write("\u014e\u014f\7\25\2\2\u014f\u0155\7\36\2\2\u0150\u0156")
        buf.write("\7 \2\2\u0151\u0156\7\25\2\2\u0152\u0156\7\32\2\2\u0153")
        buf.write("\u0156\5\36\20\2\u0154\u0156\7\31\2\2\u0155\u0150\3\2")
        buf.write("\2\2\u0155\u0151\3\2\2\2\u0155\u0152\3\2\2\2\u0155\u0153")
        buf.write("\3\2\2\2\u0155\u0154\3\2\2\2\u0155\u0156\3\2\2\2\u0156")
        buf.write("\u015a\3\2\2\2\u0157\u0158\7\36\2\2\u0158\u015a\7\25\2")
        buf.write("\2\u0159\u014e\3\2\2\2\u0159\u0157\3\2\2\2\u015a\33\3")
        buf.write("\2\2\2\u015b\u015d\7\7\2\2\u015c\u015b\3\2\2\2\u015d\u015e")
        buf.write("\3\2\2\2\u015e\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015f")
        buf.write("\35\3\2\2\2\u0160\u0161\t\4\2\2\u0161\37\3\2\2\2\u0162")
        buf.write("\u0163\t\5\2\2\u0163!\3\2\2\2\u0164\u0165\7\20\2\2\u0165")
        buf.write("\u016c\5\34\17\2\u0166\u0168\5 \21\2\u0167\u0169\7\7\2")
        buf.write("\2\u0168\u0167\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u016b")
        buf.write("\3\2\2\2\u016a\u0166\3\2\2\2\u016b\u016e\3\2\2\2\u016c")
        buf.write("\u016a\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u016f\3\2\2\2")
        buf.write("\u016e\u016c\3\2\2\2\u016f\u0170\5\36\20\2\u0170\u0171")
        buf.write("\5\34\17\2\u0171\u0172\t\6\2\2\u0172\u0176\5\34\17\2\u0173")
        buf.write("\u0175\7\37\2\2\u0174\u0173\3\2\2\2\u0175\u0178\3\2\2")
        buf.write("\2\u0176\u0174\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u017c")
        buf.write("\3\2\2\2\u0178\u0176\3\2\2\2\u0179\u017b\7\7\2\2\u017a")
        buf.write("\u0179\3\2\2\2\u017b\u017e\3\2\2\2\u017c\u017a\3\2\2\2")
        buf.write("\u017c\u017d\3\2\2\2\u017d\u0182\3\2\2\2\u017e\u017c\3")
        buf.write("\2\2\2\u017f\u0181\t\6\2\2\u0180\u017f\3\2\2\2\u0181\u0184")
        buf.write("\3\2\2\2\u0182\u0180\3\2\2\2\u0182\u0183\3\2\2\2\u0183")
        buf.write("\u0185\3\2\2\2\u0184\u0182\3\2\2\2\u0185\u0189\7\37\2")
        buf.write("\2\u0186\u0188\7\7\2\2\u0187\u0186\3\2\2\2\u0188\u018b")
        buf.write("\3\2\2\2\u0189\u0187\3\2\2\2\u0189\u018a\3\2\2\2\u018a")
        buf.write("\u018c\3\2\2\2\u018b\u0189\3\2\2\2\u018c\u018e\t\6\2\2")
        buf.write("\u018d\u018f\7\34\2\2\u018e\u018d\3\2\2\2\u018e\u018f")
        buf.write("\3\2\2\2\u018f\u0191\3\2\2\2\u0190\u0192\5\34\17\2\u0191")
        buf.write("\u0190\3\2\2\2\u0191\u0192\3\2\2\2\u0192#\3\2\2\2N\'\63")
        buf.write("\65<>BFJORUY^aglosx}\u0080\u0086\u008a\u008e\u0092\u0097")
        buf.write("\u009c\u00a1\u00a4\u00a7\u00ab\u00b0\u00b4\u00bb\u00c0")
        buf.write("\u00c3\u00c6\u00ca\u00d0\u00d5\u00da\u00dd\u00e2\u00e5")
        buf.write("\u00e9\u00f2\u00f4\u00f7\u00fb\u0100\u0104\u0107\u0111")
        buf.write("\u0113\u0116\u0119\u011d\u0121\u0125\u012d\u012f\u0133")
        buf.write("\u0137\u013a\u0148\u0155\u0159\u015e\u0168\u016c\u0176")
        buf.write("\u017c\u0182\u0189\u018e\u0191")
        return buf.getvalue()


class bashGrammarParser ( Parser ):

    grammarFileName = "bashGrammar.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "','", "<INVALID>", "<INVALID>", "<INVALID>", 
                     "<INVALID>", "'if'", "'then'", "'elif'", "'else'", 
                     "'fi'", "'for'", "'do'", "'done'", "'sed'", "<INVALID>", 
                     "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                     "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                     "<INVALID>", "'='", "';'" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "SINGLE_STRING", "DOUBLE_STRING", 
                      "COMMENT", "SPACE", "IF", "THEN", "ELIF", "ELSE", 
                      "FI", "FOR", "DO", "DONE", "SED", "COMMAND", "RHS_ASSIGNMENT", 
                      "OPEN_BRACKETS", "CLOSE_BRACKETS", "VAR", "WEBSITE", 
                      "FILENAME", "SED_FLAG", "BASH_VAR", "VAL", "ASSIGN", 
                      "SEMICOLON", "LOGICAL_OP", "INCREMENT", "COMPARE", 
                      "BLOB", "OTHER" ]

    RULE_code = 0
    RULE_bashScript = 1
    RULE_expressions = 2
    RULE_for_loop = 3
    RULE_inside_for = 4
    RULE_ifElse = 5
    RULE_condition = 6
    RULE_linux_command = 7
    RULE_assignment = 8
    RULE_advanced_assignment = 9
    RULE_command_data = 10
    RULE_comparison = 11
    RULE_increment = 12
    RULE_space = 13
    RULE_string = 14
    RULE_sed_flag = 15
    RULE_sed = 16

    ruleNames =  [ "code", "bashScript", "expressions", "for_loop", "inside_for", 
                   "ifElse", "condition", "linux_command", "assignment", 
                   "advanced_assignment", "command_data", "comparison", 
                   "increment", "space", "string", "sed_flag", "sed" ]

    EOF = Token.EOF
    T__0=1
    SINGLE_STRING=2
    DOUBLE_STRING=3
    COMMENT=4
    SPACE=5
    IF=6
    THEN=7
    ELIF=8
    ELSE=9
    FI=10
    FOR=11
    DO=12
    DONE=13
    SED=14
    COMMAND=15
    RHS_ASSIGNMENT=16
    OPEN_BRACKETS=17
    CLOSE_BRACKETS=18
    VAR=19
    WEBSITE=20
    FILENAME=21
    SED_FLAG=22
    BASH_VAR=23
    VAL=24
    ASSIGN=25
    SEMICOLON=26
    LOGICAL_OP=27
    INCREMENT=28
    COMPARE=29
    BLOB=30
    OTHER=31

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
            self.state = 37
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << bashGrammarParser.SPACE) | (1 << bashGrammarParser.IF) | (1 << bashGrammarParser.FOR) | (1 << bashGrammarParser.SED) | (1 << bashGrammarParser.COMMAND) | (1 << bashGrammarParser.OPEN_BRACKETS) | (1 << bashGrammarParser.VAR))) != 0):
                self.state = 34
                self.bashScript()
                self.state = 39
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 40
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


        def space(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(bashGrammarParser.SpaceContext)
            else:
                return self.getTypedRuleContext(bashGrammarParser.SpaceContext,i)


        def advanced_assignment(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(bashGrammarParser.Advanced_assignmentContext)
            else:
                return self.getTypedRuleContext(bashGrammarParser.Advanced_assignmentContext,i)


        def ifElse(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(bashGrammarParser.IfElseContext)
            else:
                return self.getTypedRuleContext(bashGrammarParser.IfElseContext,i)


        def sed(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(bashGrammarParser.SedContext)
            else:
                return self.getTypedRuleContext(bashGrammarParser.SedContext,i)


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
            self.state = 49 
            self._errHandler.sync(self)
            _alt = 1
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt == 1:
                    self.state = 49
                    self._errHandler.sync(self)
                    token = self._input.LA(1)
                    if token in [bashGrammarParser.FOR]:
                        self.state = 42
                        self.for_loop()
                        pass
                    elif token in [bashGrammarParser.VAR]:
                        self.state = 43
                        self.assignment()
                        pass
                    elif token in [bashGrammarParser.COMMAND]:
                        self.state = 44
                        self.linux_command()
                        pass
                    elif token in [bashGrammarParser.SPACE]:
                        self.state = 45
                        self.space()
                        pass
                    elif token in [bashGrammarParser.OPEN_BRACKETS]:
                        self.state = 46
                        self.advanced_assignment()
                        pass
                    elif token in [bashGrammarParser.IF]:
                        self.state = 47
                        self.ifElse()
                        pass
                    elif token in [bashGrammarParser.SED]:
                        self.state = 48
                        self.sed()
                        pass
                    else:
                        raise NoViableAltException(self)


                else:
                    raise NoViableAltException(self)
                self.state = 51 
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,2,self._ctx)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ExpressionsContext(ParserRuleContext):

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


        def advanced_assignment(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(bashGrammarParser.Advanced_assignmentContext)
            else:
                return self.getTypedRuleContext(bashGrammarParser.Advanced_assignmentContext,i)


        def ifElse(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(bashGrammarParser.IfElseContext)
            else:
                return self.getTypedRuleContext(bashGrammarParser.IfElseContext,i)


        def space(self):
            return self.getTypedRuleContext(bashGrammarParser.SpaceContext,0)


        def getRuleIndex(self):
            return bashGrammarParser.RULE_expressions

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExpressions" ):
                listener.enterExpressions(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExpressions" ):
                listener.exitExpressions(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitExpressions" ):
                return visitor.visitExpressions(self)
            else:
                return visitor.visitChildren(self)




    def expressions(self):

        localctx = bashGrammarParser.ExpressionsContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_expressions)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 60
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << bashGrammarParser.IF) | (1 << bashGrammarParser.FOR) | (1 << bashGrammarParser.COMMAND) | (1 << bashGrammarParser.OPEN_BRACKETS) | (1 << bashGrammarParser.VAR))) != 0):
                self.state = 58
                self._errHandler.sync(self)
                token = self._input.LA(1)
                if token in [bashGrammarParser.FOR]:
                    self.state = 53
                    self.for_loop()
                    pass
                elif token in [bashGrammarParser.VAR]:
                    self.state = 54
                    self.assignment()
                    pass
                elif token in [bashGrammarParser.COMMAND]:
                    self.state = 55
                    self.linux_command()
                    pass
                elif token in [bashGrammarParser.OPEN_BRACKETS]:
                    self.state = 56
                    self.advanced_assignment()
                    pass
                elif token in [bashGrammarParser.IF]:
                    self.state = 57
                    self.ifElse()
                    pass
                else:
                    raise NoViableAltException(self)

                self.state = 62
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 64
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==bashGrammarParser.SPACE:
                self.state = 63
                self.space()


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

        def OPEN_BRACKETS(self):
            return self.getToken(bashGrammarParser.OPEN_BRACKETS, 0)

        def inside_for(self):
            return self.getTypedRuleContext(bashGrammarParser.Inside_forContext,0)


        def CLOSE_BRACKETS(self):
            return self.getToken(bashGrammarParser.CLOSE_BRACKETS, 0)

        def DO(self):
            return self.getToken(bashGrammarParser.DO, 0)

        def expressions(self):
            return self.getTypedRuleContext(bashGrammarParser.ExpressionsContext,0)


        def DONE(self):
            return self.getToken(bashGrammarParser.DONE, 0)

        def space(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(bashGrammarParser.SpaceContext)
            else:
                return self.getTypedRuleContext(bashGrammarParser.SpaceContext,i)


        def SEMICOLON(self):
            return self.getToken(bashGrammarParser.SEMICOLON, 0)

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
        self.enterRule(localctx, 6, self.RULE_for_loop)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 66
            self.match(bashGrammarParser.FOR)
            self.state = 68
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==bashGrammarParser.SPACE:
                self.state = 67
                self.space()


            self.state = 70
            self.match(bashGrammarParser.OPEN_BRACKETS)
            self.state = 72
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==bashGrammarParser.SPACE:
                self.state = 71
                self.space()


            self.state = 74
            self.inside_for()
            self.state = 75
            self.match(bashGrammarParser.CLOSE_BRACKETS)
            self.state = 77
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,8,self._ctx)
            if la_ == 1:
                self.state = 76
                self.space()


            self.state = 80
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==bashGrammarParser.SEMICOLON:
                self.state = 79
                self.match(bashGrammarParser.SEMICOLON)


            self.state = 83
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==bashGrammarParser.SPACE:
                self.state = 82
                self.space()


            self.state = 85
            self.match(bashGrammarParser.DO)
            self.state = 87
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,11,self._ctx)
            if la_ == 1:
                self.state = 86
                self.space()


            self.state = 89
            self.expressions()
            self.state = 90
            self.match(bashGrammarParser.DONE)
            self.state = 92
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,12,self._ctx)
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


    class Inside_forContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def SEMICOLON(self, i:int=None):
            if i is None:
                return self.getTokens(bashGrammarParser.SEMICOLON)
            else:
                return self.getToken(bashGrammarParser.SEMICOLON, i)

        def assignment(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(bashGrammarParser.AssignmentContext)
            else:
                return self.getTypedRuleContext(bashGrammarParser.AssignmentContext,i)


        def space(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(bashGrammarParser.SpaceContext)
            else:
                return self.getTypedRuleContext(bashGrammarParser.SpaceContext,i)


        def condition(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(bashGrammarParser.ConditionContext)
            else:
                return self.getTypedRuleContext(bashGrammarParser.ConditionContext,i)


        def LOGICAL_OP(self, i:int=None):
            if i is None:
                return self.getTokens(bashGrammarParser.LOGICAL_OP)
            else:
                return self.getToken(bashGrammarParser.LOGICAL_OP, i)

        def increment(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(bashGrammarParser.IncrementContext)
            else:
                return self.getTypedRuleContext(bashGrammarParser.IncrementContext,i)


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
        self.enterRule(localctx, 8, self.RULE_inside_for)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 95
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==bashGrammarParser.VAR:
                self.state = 94
                self.assignment()


            self.state = 101
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==bashGrammarParser.T__0:
                self.state = 97
                self.match(bashGrammarParser.T__0)
                self.state = 98
                self.assignment()
                self.state = 103
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 104
            self.match(bashGrammarParser.SEMICOLON)
            self.state = 106
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,15,self._ctx)
            if la_ == 1:
                self.state = 105
                self.space()


            self.state = 109
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if (((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << bashGrammarParser.SPACE) | (1 << bashGrammarParser.VAR) | (1 << bashGrammarParser.VAL) | (1 << bashGrammarParser.BLOB))) != 0):
                self.state = 108
                self.condition()


            self.state = 118
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,18,self._ctx)
            while _alt!=1 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1+1:
                    self.state = 111
                    self.match(bashGrammarParser.LOGICAL_OP)
                    self.state = 113
                    self._errHandler.sync(self)
                    la_ = self._interp.adaptivePredict(self._input,17,self._ctx)
                    if la_ == 1:
                        self.state = 112
                        self.space()


                    self.state = 115
                    self.condition() 
                self.state = 120
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,18,self._ctx)

            self.state = 121
            self.match(bashGrammarParser.SEMICOLON)
            self.state = 123
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,19,self._ctx)
            if la_ == 1:
                self.state = 122
                self.space()


            self.state = 126
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==bashGrammarParser.VAR or _la==bashGrammarParser.INCREMENT:
                self.state = 125
                self.increment()


            self.state = 132
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==bashGrammarParser.T__0:
                self.state = 128
                self.match(bashGrammarParser.T__0)
                self.state = 129
                self.increment()
                self.state = 134
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 136
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==bashGrammarParser.SPACE:
                self.state = 135
                self.space()


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class IfElseContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def IF(self):
            return self.getToken(bashGrammarParser.IF, 0)

        def OPEN_BRACKETS(self, i:int=None):
            if i is None:
                return self.getTokens(bashGrammarParser.OPEN_BRACKETS)
            else:
                return self.getToken(bashGrammarParser.OPEN_BRACKETS, i)

        def condition(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(bashGrammarParser.ConditionContext)
            else:
                return self.getTypedRuleContext(bashGrammarParser.ConditionContext,i)


        def CLOSE_BRACKETS(self, i:int=None):
            if i is None:
                return self.getTokens(bashGrammarParser.CLOSE_BRACKETS)
            else:
                return self.getToken(bashGrammarParser.CLOSE_BRACKETS, i)

        def THEN(self, i:int=None):
            if i is None:
                return self.getTokens(bashGrammarParser.THEN)
            else:
                return self.getToken(bashGrammarParser.THEN, i)

        def expressions(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(bashGrammarParser.ExpressionsContext)
            else:
                return self.getTypedRuleContext(bashGrammarParser.ExpressionsContext,i)


        def ELSE(self):
            return self.getToken(bashGrammarParser.ELSE, 0)

        def FI(self):
            return self.getToken(bashGrammarParser.FI, 0)

        def space(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(bashGrammarParser.SpaceContext)
            else:
                return self.getTypedRuleContext(bashGrammarParser.SpaceContext,i)


        def LOGICAL_OP(self, i:int=None):
            if i is None:
                return self.getTokens(bashGrammarParser.LOGICAL_OP)
            else:
                return self.getToken(bashGrammarParser.LOGICAL_OP, i)

        def SEMICOLON(self, i:int=None):
            if i is None:
                return self.getTokens(bashGrammarParser.SEMICOLON)
            else:
                return self.getToken(bashGrammarParser.SEMICOLON, i)

        def ELIF(self, i:int=None):
            if i is None:
                return self.getTokens(bashGrammarParser.ELIF)
            else:
                return self.getToken(bashGrammarParser.ELIF, i)

        def getRuleIndex(self):
            return bashGrammarParser.RULE_ifElse

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterIfElse" ):
                listener.enterIfElse(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitIfElse" ):
                listener.exitIfElse(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitIfElse" ):
                return visitor.visitIfElse(self)
            else:
                return visitor.visitChildren(self)




    def ifElse(self):

        localctx = bashGrammarParser.IfElseContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_ifElse)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 138
            self.match(bashGrammarParser.IF)
            self.state = 140
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==bashGrammarParser.SPACE:
                self.state = 139
                self.space()


            self.state = 142
            self.match(bashGrammarParser.OPEN_BRACKETS)
            self.state = 144
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,24,self._ctx)
            if la_ == 1:
                self.state = 143
                self.space()


            self.state = 146
            self.condition()
            self.state = 154
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,26,self._ctx)
            while _alt!=1 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1+1:
                    self.state = 147
                    self.match(bashGrammarParser.LOGICAL_OP)
                    self.state = 149
                    self._errHandler.sync(self)
                    la_ = self._interp.adaptivePredict(self._input,25,self._ctx)
                    if la_ == 1:
                        self.state = 148
                        self.space()


                    self.state = 151
                    self.condition() 
                self.state = 156
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,26,self._ctx)

            self.state = 157
            self.match(bashGrammarParser.CLOSE_BRACKETS)
            self.state = 159
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,27,self._ctx)
            if la_ == 1:
                self.state = 158
                self.space()


            self.state = 162
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==bashGrammarParser.SEMICOLON:
                self.state = 161
                self.match(bashGrammarParser.SEMICOLON)


            self.state = 165
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==bashGrammarParser.SPACE:
                self.state = 164
                self.space()


            self.state = 167
            self.match(bashGrammarParser.THEN)
            self.state = 169
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,30,self._ctx)
            if la_ == 1:
                self.state = 168
                self.space()


            self.state = 171
            self.expressions()
            self.state = 206
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==bashGrammarParser.ELIF:
                self.state = 172
                self.match(bashGrammarParser.ELIF)
                self.state = 174
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==bashGrammarParser.SPACE:
                    self.state = 173
                    self.space()


                self.state = 176
                self.match(bashGrammarParser.OPEN_BRACKETS)
                self.state = 178
                self._errHandler.sync(self)
                la_ = self._interp.adaptivePredict(self._input,32,self._ctx)
                if la_ == 1:
                    self.state = 177
                    self.space()


                self.state = 180
                self.condition()
                self.state = 185
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,33,self._ctx)
                while _alt!=1 and _alt!=ATN.INVALID_ALT_NUMBER:
                    if _alt==1+1:
                        self.state = 181
                        self.match(bashGrammarParser.LOGICAL_OP)
                        self.state = 182
                        self.condition() 
                    self.state = 187
                    self._errHandler.sync(self)
                    _alt = self._interp.adaptivePredict(self._input,33,self._ctx)

                self.state = 188
                self.match(bashGrammarParser.CLOSE_BRACKETS)
                self.state = 190
                self._errHandler.sync(self)
                la_ = self._interp.adaptivePredict(self._input,34,self._ctx)
                if la_ == 1:
                    self.state = 189
                    self.space()


                self.state = 193
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==bashGrammarParser.SEMICOLON:
                    self.state = 192
                    self.match(bashGrammarParser.SEMICOLON)


                self.state = 196
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==bashGrammarParser.SPACE:
                    self.state = 195
                    self.space()


                self.state = 198
                self.match(bashGrammarParser.THEN)
                self.state = 200
                self._errHandler.sync(self)
                la_ = self._interp.adaptivePredict(self._input,37,self._ctx)
                if la_ == 1:
                    self.state = 199
                    self.space()


                self.state = 202
                self.expressions()
                self.state = 208
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 209
            self.match(bashGrammarParser.ELSE)
            self.state = 211
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,39,self._ctx)
            if la_ == 1:
                self.state = 210
                self.space()


            self.state = 213
            self.expressions()
            self.state = 214
            self.match(bashGrammarParser.FI)
            self.state = 216
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,40,self._ctx)
            if la_ == 1:
                self.state = 215
                self.space()


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ConditionContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def COMPARE(self):
            return self.getToken(bashGrammarParser.COMPARE, 0)

        def space(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(bashGrammarParser.SpaceContext)
            else:
                return self.getTypedRuleContext(bashGrammarParser.SpaceContext,i)


        def string(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(bashGrammarParser.StringContext)
            else:
                return self.getTypedRuleContext(bashGrammarParser.StringContext,i)


        def VAR(self, i:int=None):
            if i is None:
                return self.getTokens(bashGrammarParser.VAR)
            else:
                return self.getToken(bashGrammarParser.VAR, i)

        def VAL(self, i:int=None):
            if i is None:
                return self.getTokens(bashGrammarParser.VAL)
            else:
                return self.getToken(bashGrammarParser.VAL, i)

        def BLOB(self, i:int=None):
            if i is None:
                return self.getTokens(bashGrammarParser.BLOB)
            else:
                return self.getToken(bashGrammarParser.BLOB, i)

        def BASH_VAR(self, i:int=None):
            if i is None:
                return self.getTokens(bashGrammarParser.BASH_VAR)
            else:
                return self.getToken(bashGrammarParser.BASH_VAR, i)

        def RHS_ASSIGNMENT(self, i:int=None):
            if i is None:
                return self.getTokens(bashGrammarParser.RHS_ASSIGNMENT)
            else:
                return self.getToken(bashGrammarParser.RHS_ASSIGNMENT, i)

        def getRuleIndex(self):
            return bashGrammarParser.RULE_condition

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterCondition" ):
                listener.enterCondition(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitCondition" ):
                listener.exitCondition(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitCondition" ):
                return visitor.visitCondition(self)
            else:
                return visitor.visitChildren(self)




    def condition(self):

        localctx = bashGrammarParser.ConditionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 12, self.RULE_condition)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 219
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==bashGrammarParser.SPACE:
                self.state = 218
                self.space()


            self.state = 222 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 221
                _la = self._input.LA(1)
                if not((((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << bashGrammarParser.VAR) | (1 << bashGrammarParser.VAL) | (1 << bashGrammarParser.BLOB))) != 0)):
                    self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()
                self.state = 224 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not ((((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << bashGrammarParser.VAR) | (1 << bashGrammarParser.VAL) | (1 << bashGrammarParser.BLOB))) != 0)):
                    break

            self.state = 227
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==bashGrammarParser.SPACE:
                self.state = 226
                self.space()


            self.state = 229
            self.match(bashGrammarParser.COMPARE)
            self.state = 231
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==bashGrammarParser.SPACE:
                self.state = 230
                self.space()


            self.state = 240 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 240
                self._errHandler.sync(self)
                la_ = self._interp.adaptivePredict(self._input,45,self._ctx)
                if la_ == 1:
                    self.state = 233
                    self.string()
                    pass

                elif la_ == 2:
                    self.state = 234
                    self.match(bashGrammarParser.VAR)
                    pass

                elif la_ == 3:
                    self.state = 235
                    self.match(bashGrammarParser.VAL)
                    pass

                elif la_ == 4:
                    self.state = 236
                    self.match(bashGrammarParser.BLOB)
                    pass

                elif la_ == 5:
                    self.state = 237
                    self.match(bashGrammarParser.BASH_VAR)
                    pass

                elif la_ == 6:
                    self.state = 238
                    self.match(bashGrammarParser.RHS_ASSIGNMENT)
                    pass

                elif la_ == 7:
                    self.state = 239
                    self.match(bashGrammarParser.BLOB)
                    pass


                self.state = 242 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not ((((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << bashGrammarParser.SINGLE_STRING) | (1 << bashGrammarParser.DOUBLE_STRING) | (1 << bashGrammarParser.RHS_ASSIGNMENT) | (1 << bashGrammarParser.VAR) | (1 << bashGrammarParser.BASH_VAR) | (1 << bashGrammarParser.VAL) | (1 << bashGrammarParser.BLOB))) != 0)):
                    break

            self.state = 245
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==bashGrammarParser.SPACE:
                self.state = 244
                self.space()


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
        self.enterRule(localctx, 14, self.RULE_linux_command)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 247
            self.match(bashGrammarParser.COMMAND)
            self.state = 249
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,48,self._ctx)
            if la_ == 1:
                self.state = 248
                self.space()


            self.state = 254
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,49,self._ctx)
            while _alt!=1 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1+1:
                    self.state = 251
                    self.command_data() 
                self.state = 256
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,49,self._ctx)

            self.state = 258
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==bashGrammarParser.SEMICOLON:
                self.state = 257
                self.match(bashGrammarParser.SEMICOLON)


            self.state = 261
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,51,self._ctx)
            if la_ == 1:
                self.state = 260
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

        def ASSIGN(self):
            return self.getToken(bashGrammarParser.ASSIGN, 0)

        def string(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(bashGrammarParser.StringContext)
            else:
                return self.getTypedRuleContext(bashGrammarParser.StringContext,i)


        def VAL(self, i:int=None):
            if i is None:
                return self.getTokens(bashGrammarParser.VAL)
            else:
                return self.getToken(bashGrammarParser.VAL, i)

        def BASH_VAR(self, i:int=None):
            if i is None:
                return self.getTokens(bashGrammarParser.BASH_VAR)
            else:
                return self.getToken(bashGrammarParser.BASH_VAR, i)

        def RHS_ASSIGNMENT(self, i:int=None):
            if i is None:
                return self.getTokens(bashGrammarParser.RHS_ASSIGNMENT)
            else:
                return self.getToken(bashGrammarParser.RHS_ASSIGNMENT, i)

        def BLOB(self, i:int=None):
            if i is None:
                return self.getTokens(bashGrammarParser.BLOB)
            else:
                return self.getToken(bashGrammarParser.BLOB, i)

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
        self.enterRule(localctx, 16, self.RULE_assignment)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 263
            self.match(bashGrammarParser.VAR)
            self.state = 264
            self.match(bashGrammarParser.ASSIGN)
            self.state = 271 
            self._errHandler.sync(self)
            _alt = 1
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt == 1:
                    self.state = 271
                    self._errHandler.sync(self)
                    token = self._input.LA(1)
                    if token in [bashGrammarParser.SINGLE_STRING, bashGrammarParser.DOUBLE_STRING]:
                        self.state = 265
                        self.string()
                        pass
                    elif token in [bashGrammarParser.VAL]:
                        self.state = 266
                        self.match(bashGrammarParser.VAL)
                        pass
                    elif token in [bashGrammarParser.VAR]:
                        self.state = 267
                        self.match(bashGrammarParser.VAR)
                        pass
                    elif token in [bashGrammarParser.BASH_VAR]:
                        self.state = 268
                        self.match(bashGrammarParser.BASH_VAR)
                        pass
                    elif token in [bashGrammarParser.RHS_ASSIGNMENT]:
                        self.state = 269
                        self.match(bashGrammarParser.RHS_ASSIGNMENT)
                        pass
                    elif token in [bashGrammarParser.BLOB]:
                        self.state = 270
                        self.match(bashGrammarParser.BLOB)
                        pass
                    else:
                        raise NoViableAltException(self)


                else:
                    raise NoViableAltException(self)
                self.state = 273 
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,53,self._ctx)

            self.state = 276
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,54,self._ctx)
            if la_ == 1:
                self.state = 275
                self.match(bashGrammarParser.SEMICOLON)


            self.state = 279
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,55,self._ctx)
            if la_ == 1:
                self.state = 278
                self.space()


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Advanced_assignmentContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def OPEN_BRACKETS(self):
            return self.getToken(bashGrammarParser.OPEN_BRACKETS, 0)

        def VAR(self, i:int=None):
            if i is None:
                return self.getTokens(bashGrammarParser.VAR)
            else:
                return self.getToken(bashGrammarParser.VAR, i)

        def CLOSE_BRACKETS(self):
            return self.getToken(bashGrammarParser.CLOSE_BRACKETS, 0)

        def ASSIGN(self):
            return self.getToken(bashGrammarParser.ASSIGN, 0)

        def INCREMENT(self):
            return self.getToken(bashGrammarParser.INCREMENT, 0)

        def space(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(bashGrammarParser.SpaceContext)
            else:
                return self.getTypedRuleContext(bashGrammarParser.SpaceContext,i)


        def string(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(bashGrammarParser.StringContext)
            else:
                return self.getTypedRuleContext(bashGrammarParser.StringContext,i)


        def VAL(self, i:int=None):
            if i is None:
                return self.getTokens(bashGrammarParser.VAL)
            else:
                return self.getToken(bashGrammarParser.VAL, i)

        def BASH_VAR(self, i:int=None):
            if i is None:
                return self.getTokens(bashGrammarParser.BASH_VAR)
            else:
                return self.getToken(bashGrammarParser.BASH_VAR, i)

        def RHS_ASSIGNMENT(self, i:int=None):
            if i is None:
                return self.getTokens(bashGrammarParser.RHS_ASSIGNMENT)
            else:
                return self.getToken(bashGrammarParser.RHS_ASSIGNMENT, i)

        def BLOB(self, i:int=None):
            if i is None:
                return self.getTokens(bashGrammarParser.BLOB)
            else:
                return self.getToken(bashGrammarParser.BLOB, i)

        def SEMICOLON(self):
            return self.getToken(bashGrammarParser.SEMICOLON, 0)

        def getRuleIndex(self):
            return bashGrammarParser.RULE_advanced_assignment

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterAdvanced_assignment" ):
                listener.enterAdvanced_assignment(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitAdvanced_assignment" ):
                listener.exitAdvanced_assignment(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitAdvanced_assignment" ):
                return visitor.visitAdvanced_assignment(self)
            else:
                return visitor.visitChildren(self)




    def advanced_assignment(self):

        localctx = bashGrammarParser.Advanced_assignmentContext(self, self._ctx, self.state)
        self.enterRule(localctx, 18, self.RULE_advanced_assignment)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 281
            self.match(bashGrammarParser.OPEN_BRACKETS)
            self.state = 283
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==bashGrammarParser.SPACE:
                self.state = 282
                self.space()


            self.state = 285
            self.match(bashGrammarParser.VAR)
            self.state = 287
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==bashGrammarParser.SPACE:
                self.state = 286
                self.space()


            self.state = 289
            _la = self._input.LA(1)
            if not(_la==bashGrammarParser.ASSIGN or _la==bashGrammarParser.INCREMENT):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
            self.state = 291
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,58,self._ctx)
            if la_ == 1:
                self.state = 290
                self.space()


            self.state = 301
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << bashGrammarParser.SINGLE_STRING) | (1 << bashGrammarParser.DOUBLE_STRING) | (1 << bashGrammarParser.RHS_ASSIGNMENT) | (1 << bashGrammarParser.VAR) | (1 << bashGrammarParser.BASH_VAR) | (1 << bashGrammarParser.VAL) | (1 << bashGrammarParser.BLOB))) != 0):
                self.state = 299
                self._errHandler.sync(self)
                token = self._input.LA(1)
                if token in [bashGrammarParser.SINGLE_STRING, bashGrammarParser.DOUBLE_STRING]:
                    self.state = 293
                    self.string()
                    pass
                elif token in [bashGrammarParser.VAL]:
                    self.state = 294
                    self.match(bashGrammarParser.VAL)
                    pass
                elif token in [bashGrammarParser.VAR]:
                    self.state = 295
                    self.match(bashGrammarParser.VAR)
                    pass
                elif token in [bashGrammarParser.BASH_VAR]:
                    self.state = 296
                    self.match(bashGrammarParser.BASH_VAR)
                    pass
                elif token in [bashGrammarParser.RHS_ASSIGNMENT]:
                    self.state = 297
                    self.match(bashGrammarParser.RHS_ASSIGNMENT)
                    pass
                elif token in [bashGrammarParser.BLOB]:
                    self.state = 298
                    self.match(bashGrammarParser.BLOB)
                    pass
                else:
                    raise NoViableAltException(self)

                self.state = 303
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 305
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==bashGrammarParser.SPACE:
                self.state = 304
                self.space()


            self.state = 307
            self.match(bashGrammarParser.CLOSE_BRACKETS)
            self.state = 309
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==bashGrammarParser.SEMICOLON:
                self.state = 308
                self.match(bashGrammarParser.SEMICOLON)


            self.state = 312
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,63,self._ctx)
            if la_ == 1:
                self.state = 311
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

        def VAR(self):
            return self.getToken(bashGrammarParser.VAR, 0)

        def VAL(self):
            return self.getToken(bashGrammarParser.VAL, 0)

        def BLOB(self):
            return self.getToken(bashGrammarParser.BLOB, 0)

        def BASH_VAR(self):
            return self.getToken(bashGrammarParser.BASH_VAR, 0)

        def string(self):
            return self.getTypedRuleContext(bashGrammarParser.StringContext,0)


        def INCREMENT(self):
            return self.getToken(bashGrammarParser.INCREMENT, 0)

        def OTHER(self):
            return self.getToken(bashGrammarParser.OTHER, 0)

        def space(self):
            return self.getTypedRuleContext(bashGrammarParser.SpaceContext,0)


        def sed_flag(self):
            return self.getTypedRuleContext(bashGrammarParser.Sed_flagContext,0)


        def FILENAME(self):
            return self.getToken(bashGrammarParser.FILENAME, 0)

        def WEBSITE(self):
            return self.getToken(bashGrammarParser.WEBSITE, 0)

        def RHS_ASSIGNMENT(self):
            return self.getToken(bashGrammarParser.RHS_ASSIGNMENT, 0)

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
        self.enterRule(localctx, 20, self.RULE_command_data)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 326
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,64,self._ctx)
            if la_ == 1:
                self.state = 314
                self.match(bashGrammarParser.VAR)
                pass

            elif la_ == 2:
                self.state = 315
                self.match(bashGrammarParser.VAL)
                pass

            elif la_ == 3:
                self.state = 316
                self.match(bashGrammarParser.BLOB)
                pass

            elif la_ == 4:
                self.state = 317
                self.match(bashGrammarParser.BASH_VAR)
                pass

            elif la_ == 5:
                self.state = 318
                self.string()
                pass

            elif la_ == 6:
                self.state = 319
                self.match(bashGrammarParser.INCREMENT)
                pass

            elif la_ == 7:
                self.state = 320
                self.match(bashGrammarParser.OTHER)
                pass

            elif la_ == 8:
                self.state = 321
                self.space()
                pass

            elif la_ == 9:
                self.state = 322
                self.sed_flag()
                pass

            elif la_ == 10:
                self.state = 323
                self.match(bashGrammarParser.FILENAME)
                pass

            elif la_ == 11:
                self.state = 324
                self.match(bashGrammarParser.WEBSITE)
                pass

            elif la_ == 12:
                self.state = 325
                self.match(bashGrammarParser.RHS_ASSIGNMENT)
                pass


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
        self.enterRule(localctx, 22, self.RULE_comparison)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 328
            self.match(bashGrammarParser.VAR)
            self.state = 329
            self.match(bashGrammarParser.COMPARE)
            self.state = 330
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

        def VAR(self, i:int=None):
            if i is None:
                return self.getTokens(bashGrammarParser.VAR)
            else:
                return self.getToken(bashGrammarParser.VAR, i)

        def INCREMENT(self):
            return self.getToken(bashGrammarParser.INCREMENT, 0)

        def BLOB(self):
            return self.getToken(bashGrammarParser.BLOB, 0)

        def VAL(self):
            return self.getToken(bashGrammarParser.VAL, 0)

        def string(self):
            return self.getTypedRuleContext(bashGrammarParser.StringContext,0)


        def BASH_VAR(self):
            return self.getToken(bashGrammarParser.BASH_VAR, 0)

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
        self.enterRule(localctx, 24, self.RULE_increment)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 343
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [bashGrammarParser.VAR]:
                self.state = 332
                self.match(bashGrammarParser.VAR)
                self.state = 333
                self.match(bashGrammarParser.INCREMENT)
                self.state = 339
                self._errHandler.sync(self)
                token = self._input.LA(1)
                if token in [bashGrammarParser.BLOB]:
                    self.state = 334
                    self.match(bashGrammarParser.BLOB)
                    pass
                elif token in [bashGrammarParser.VAR]:
                    self.state = 335
                    self.match(bashGrammarParser.VAR)
                    pass
                elif token in [bashGrammarParser.VAL]:
                    self.state = 336
                    self.match(bashGrammarParser.VAL)
                    pass
                elif token in [bashGrammarParser.SINGLE_STRING, bashGrammarParser.DOUBLE_STRING]:
                    self.state = 337
                    self.string()
                    pass
                elif token in [bashGrammarParser.BASH_VAR]:
                    self.state = 338
                    self.match(bashGrammarParser.BASH_VAR)
                    pass
                elif token in [bashGrammarParser.T__0, bashGrammarParser.SPACE, bashGrammarParser.CLOSE_BRACKETS]:
                    pass
                else:
                    pass
                pass
            elif token in [bashGrammarParser.INCREMENT]:
                self.state = 341
                self.match(bashGrammarParser.INCREMENT)
                self.state = 342
                self.match(bashGrammarParser.VAR)
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
        self.enterRule(localctx, 26, self.RULE_space)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 346 
            self._errHandler.sync(self)
            _alt = 1
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt == 1:
                    self.state = 345
                    self.match(bashGrammarParser.SPACE)

                else:
                    raise NoViableAltException(self)
                self.state = 348 
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,67,self._ctx)

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
        self.enterRule(localctx, 28, self.RULE_string)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 350
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


    class Sed_flagContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def VAL(self):
            return self.getToken(bashGrammarParser.VAL, 0)

        def SED_FLAG(self):
            return self.getToken(bashGrammarParser.SED_FLAG, 0)

        def getRuleIndex(self):
            return bashGrammarParser.RULE_sed_flag

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterSed_flag" ):
                listener.enterSed_flag(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitSed_flag" ):
                listener.exitSed_flag(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitSed_flag" ):
                return visitor.visitSed_flag(self)
            else:
                return visitor.visitChildren(self)




    def sed_flag(self):

        localctx = bashGrammarParser.Sed_flagContext(self, self._ctx, self.state)
        self.enterRule(localctx, 30, self.RULE_sed_flag)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 352
            _la = self._input.LA(1)
            if not(_la==bashGrammarParser.SED_FLAG or _la==bashGrammarParser.VAL):
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


    class SedContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def SED(self):
            return self.getToken(bashGrammarParser.SED, 0)

        def space(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(bashGrammarParser.SpaceContext)
            else:
                return self.getTypedRuleContext(bashGrammarParser.SpaceContext,i)


        def string(self):
            return self.getTypedRuleContext(bashGrammarParser.StringContext,0)


        def COMPARE(self, i:int=None):
            if i is None:
                return self.getTokens(bashGrammarParser.COMPARE)
            else:
                return self.getToken(bashGrammarParser.COMPARE, i)

        def FILENAME(self, i:int=None):
            if i is None:
                return self.getTokens(bashGrammarParser.FILENAME)
            else:
                return self.getToken(bashGrammarParser.FILENAME, i)

        def VAR(self, i:int=None):
            if i is None:
                return self.getTokens(bashGrammarParser.VAR)
            else:
                return self.getToken(bashGrammarParser.VAR, i)

        def sed_flag(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(bashGrammarParser.Sed_flagContext)
            else:
                return self.getTypedRuleContext(bashGrammarParser.Sed_flagContext,i)


        def SPACE(self, i:int=None):
            if i is None:
                return self.getTokens(bashGrammarParser.SPACE)
            else:
                return self.getToken(bashGrammarParser.SPACE, i)

        def SEMICOLON(self):
            return self.getToken(bashGrammarParser.SEMICOLON, 0)

        def getRuleIndex(self):
            return bashGrammarParser.RULE_sed

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterSed" ):
                listener.enterSed(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitSed" ):
                listener.exitSed(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitSed" ):
                return visitor.visitSed(self)
            else:
                return visitor.visitChildren(self)




    def sed(self):

        localctx = bashGrammarParser.SedContext(self, self._ctx, self.state)
        self.enterRule(localctx, 32, self.RULE_sed)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 354
            self.match(bashGrammarParser.SED)
            self.state = 355
            self.space()
            self.state = 362
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==bashGrammarParser.SED_FLAG or _la==bashGrammarParser.VAL:
                self.state = 356
                self.sed_flag()
                self.state = 358
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==bashGrammarParser.SPACE:
                    self.state = 357
                    self.match(bashGrammarParser.SPACE)


                self.state = 364
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 365
            self.string()
            self.state = 366
            self.space()
            self.state = 367
            _la = self._input.LA(1)
            if not(_la==bashGrammarParser.VAR or _la==bashGrammarParser.FILENAME):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
            self.state = 368
            self.space()
            self.state = 372
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,70,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    self.state = 369
                    self.match(bashGrammarParser.COMPARE) 
                self.state = 374
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,70,self._ctx)

            self.state = 378
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==bashGrammarParser.SPACE:
                self.state = 375
                self.match(bashGrammarParser.SPACE)
                self.state = 380
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 384
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==bashGrammarParser.VAR or _la==bashGrammarParser.FILENAME:
                self.state = 381
                _la = self._input.LA(1)
                if not(_la==bashGrammarParser.VAR or _la==bashGrammarParser.FILENAME):
                    self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()
                self.state = 386
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 387
            self.match(bashGrammarParser.COMPARE)
            self.state = 391
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==bashGrammarParser.SPACE:
                self.state = 388
                self.match(bashGrammarParser.SPACE)
                self.state = 393
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 394
            _la = self._input.LA(1)
            if not(_la==bashGrammarParser.VAR or _la==bashGrammarParser.FILENAME):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
            self.state = 396
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==bashGrammarParser.SEMICOLON:
                self.state = 395
                self.match(bashGrammarParser.SEMICOLON)


            self.state = 399
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,75,self._ctx)
            if la_ == 1:
                self.state = 398
                self.space()


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





