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
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3)")
        buf.write("\u0208\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7")
        buf.write("\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16")
        buf.write("\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22\4\23\t\23")
        buf.write("\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31")
        buf.write("\t\31\3\2\7\2\64\n\2\f\2\16\2\67\13\2\3\2\3\2\3\3\3\3")
        buf.write("\3\3\3\3\3\3\3\3\3\3\3\3\3\3\6\3D\n\3\r\3\16\3E\3\4\3")
        buf.write("\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4R\n\4\3\4\3\4\5")
        buf.write("\4V\n\4\7\4X\n\4\f\4\16\4[\13\4\3\4\5\4^\n\4\3\5\3\5\5")
        buf.write("\5b\n\5\3\6\3\6\5\6f\n\6\3\6\3\6\5\6j\n\6\3\6\5\6m\n\6")
        buf.write("\3\6\3\6\5\6q\n\6\3\6\3\6\3\6\5\6v\n\6\3\7\3\7\5\7z\n")
        buf.write("\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0082\n\7\3\7\5\7\u0085")
        buf.write("\n\7\3\7\5\7\u0088\n\7\3\7\3\7\5\7\u008c\n\7\3\7\3\7\3")
        buf.write("\7\5\7\u0091\n\7\3\b\5\b\u0094\n\b\3\b\5\b\u0097\n\b\3")
        buf.write("\b\3\b\5\b\u009b\n\b\3\b\7\b\u009e\n\b\f\b\16\b\u00a1")
        buf.write("\13\b\3\b\3\b\5\b\u00a5\n\b\3\b\5\b\u00a8\n\b\3\b\3\b")
        buf.write("\5\b\u00ac\n\b\3\b\7\b\u00af\n\b\f\b\16\b\u00b2\13\b\3")
        buf.write("\b\3\b\5\b\u00b6\n\b\3\b\5\b\u00b9\n\b\3\b\3\b\7\b\u00bd")
        buf.write("\n\b\f\b\16\b\u00c0\13\b\3\b\5\b\u00c3\n\b\3\t\3\t\5\t")
        buf.write("\u00c7\n\t\3\t\3\t\5\t\u00cb\n\t\3\t\5\t\u00ce\n\t\3\t")
        buf.write("\3\t\5\t\u00d2\n\t\3\t\3\t\3\t\5\t\u00d7\n\t\3\t\3\t\3")
        buf.write("\t\5\t\u00dc\n\t\3\t\3\t\3\t\7\t\u00e1\n\t\f\t\16\t\u00e4")
        buf.write("\13\t\3\t\3\t\3\t\5\t\u00e9\n\t\3\t\5\t\u00ec\n\t\3\t")
        buf.write("\5\t\u00ef\n\t\3\t\3\t\5\t\u00f3\n\t\3\t\3\t\7\t\u00f7")
        buf.write("\n\t\f\t\16\t\u00fa\13\t\3\t\3\t\5\t\u00fe\n\t\3\t\5\t")
        buf.write("\u0101\n\t\3\t\3\t\5\t\u0105\n\t\3\n\3\n\5\n\u0109\n\n")
        buf.write("\3\n\3\n\5\n\u010d\n\n\3\n\3\n\5\n\u0111\n\n\3\n\3\n\5")
        buf.write("\n\u0115\n\n\3\n\3\n\5\n\u0119\n\n\3\n\3\n\5\n\u011d\n")
        buf.write("\n\3\n\3\n\3\13\3\13\5\13\u0123\n\13\3\13\7\13\u0126\n")
        buf.write("\13\f\13\16\13\u0129\13\13\3\13\5\13\u012c\n\13\3\13\5")
        buf.write("\13\u012f\n\13\3\f\3\f\3\f\5\f\u0134\n\f\3\f\3\f\3\f\5")
        buf.write("\f\u0139\n\f\3\f\7\f\u013c\n\f\f\f\16\f\u013f\13\f\3\f")
        buf.write("\3\f\3\f\5\f\u0144\n\f\3\r\5\r\u0147\n\r\3\r\6\r\u014a")
        buf.write("\n\r\r\r\16\r\u014b\3\r\5\r\u014f\n\r\3\r\3\r\5\r\u0153")
        buf.write("\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\6\r\u015c\n\r\r\r\16")
        buf.write("\r\u015d\3\r\5\r\u0161\n\r\3\16\3\16\5\16\u0165\n\16\3")
        buf.write("\16\7\16\u0168\n\16\f\16\16\16\u016b\13\16\3\16\5\16\u016e")
        buf.write("\n\16\3\16\5\16\u0171\n\16\3\17\3\17\3\17\3\17\3\17\3")
        buf.write("\17\3\17\3\17\6\17\u017b\n\17\r\17\16\17\u017c\3\17\5")
        buf.write("\17\u0180\n\17\3\17\5\17\u0183\n\17\3\20\3\20\3\20\5\20")
        buf.write("\u0188\n\20\3\20\3\20\5\20\u018c\n\20\3\20\3\20\5\20\u0190")
        buf.write("\n\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u0198\n\20\f")
        buf.write("\20\16\20\u019b\13\20\3\20\5\20\u019e\n\20\3\20\3\20\3")
        buf.write("\20\5\20\u01a3\n\20\3\20\5\20\u01a6\n\20\3\21\3\21\3\21")
        buf.write("\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\6\21\u01b4")
        buf.write("\n\21\r\21\16\21\u01b5\3\21\5\21\u01b9\n\21\3\22\3\22")
        buf.write("\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u01c6")
        buf.write("\n\23\3\23\3\23\5\23\u01ca\n\23\3\24\3\24\3\25\3\25\3")
        buf.write("\26\3\26\3\27\3\27\3\27\3\27\5\27\u01d6\n\27\7\27\u01d8")
        buf.write("\n\27\f\27\16\27\u01db\13\27\3\27\3\27\3\27\3\27\3\27")
        buf.write("\7\27\u01e2\n\27\f\27\16\27\u01e5\13\27\3\27\7\27\u01e8")
        buf.write("\n\27\f\27\16\27\u01eb\13\27\3\27\7\27\u01ee\n\27\f\27")
        buf.write("\16\27\u01f1\13\27\3\27\3\27\7\27\u01f5\n\27\f\27\16\27")
        buf.write("\u01f8\13\27\3\27\3\27\5\27\u01fc\n\27\3\27\5\27\u01ff")
        buf.write("\n\27\3\30\6\30\u0202\n\30\r\30\16\30\u0203\3\31\3\31")
        buf.write("\3\31\7\u00b0\u00e2\u0127\u013d\u0169\2\32\2\4\6\b\n\f")
        buf.write("\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\2\t\5\2\36\36")
        buf.write("\"\"((\4\2##&&\5\2\4\4\6\6\b\b\5\2\5\5\7\7\t\t\4\2\31")
        buf.write("\31\"\"\4\2\36\36  \3\2\13\f\2\u027b\2\65\3\2\2\2\4C\3")
        buf.write("\2\2\2\6Y\3\2\2\2\ba\3\2\2\2\nc\3\2\2\2\fw\3\2\2\2\16")
        buf.write("\u0093\3\2\2\2\20\u00c4\3\2\2\2\22\u0106\3\2\2\2\24\u0120")
        buf.write("\3\2\2\2\26\u0130\3\2\2\2\30\u0146\3\2\2\2\32\u0162\3")
        buf.write("\2\2\2\34\u0172\3\2\2\2\36\u0184\3\2\2\2 \u01b3\3\2\2")
        buf.write("\2\"\u01ba\3\2\2\2$\u01c9\3\2\2\2&\u01cb\3\2\2\2(\u01cd")
        buf.write("\3\2\2\2*\u01cf\3\2\2\2,\u01d1\3\2\2\2.\u0201\3\2\2\2")
        buf.write("\60\u0205\3\2\2\2\62\64\5\4\3\2\63\62\3\2\2\2\64\67\3")
        buf.write("\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\668\3\2\2\2\67\65\3")
        buf.write("\2\2\289\7\2\2\39\3\3\2\2\2:D\5\24\13\2;D\5\22\n\2<D\5")
        buf.write("\b\5\2=D\5\34\17\2>D\5\32\16\2?D\5.\30\2@D\5\36\20\2A")
        buf.write("D\5\20\t\2BD\5,\27\2C:\3\2\2\2C;\3\2\2\2C<\3\2\2\2C=\3")
        buf.write("\2\2\2C>\3\2\2\2C?\3\2\2\2C@\3\2\2\2CA\3\2\2\2CB\3\2\2")
        buf.write("\2DE\3\2\2\2EC\3\2\2\2EF\3\2\2\2F\5\3\2\2\2GX\5\24\13")
        buf.write("\2HX\5\22\n\2IX\5\b\5\2JX\5\34\17\2KX\5\32\16\2LX\5\36")
        buf.write("\20\2MX\5\20\t\2NX\5,\27\2OQ\7\32\2\2PR\5.\30\2QP\3\2")
        buf.write("\2\2QR\3\2\2\2RX\3\2\2\2SU\7\33\2\2TV\5.\30\2UT\3\2\2")
        buf.write("\2UV\3\2\2\2VX\3\2\2\2WG\3\2\2\2WH\3\2\2\2WI\3\2\2\2W")
        buf.write("J\3\2\2\2WK\3\2\2\2WL\3\2\2\2WM\3\2\2\2WN\3\2\2\2WO\3")
        buf.write("\2\2\2WS\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z]\3\2\2")
        buf.write("\2[Y\3\2\2\2\\^\5.\30\2]\\\3\2\2\2]^\3\2\2\2^\7\3\2\2")
        buf.write("\2_b\5\n\6\2`b\5\f\7\2a_\3\2\2\2a`\3\2\2\2b\t\3\2\2\2")
        buf.write("ce\7\26\2\2df\5.\30\2ed\3\2\2\2ef\3\2\2\2fg\3\2\2\2gi")
        buf.write("\5\26\f\2hj\7$\2\2ih\3\2\2\2ij\3\2\2\2jl\3\2\2\2km\5.")
        buf.write("\30\2lk\3\2\2\2lm\3\2\2\2mn\3\2\2\2np\7\27\2\2oq\5.\30")
        buf.write("\2po\3\2\2\2pq\3\2\2\2qr\3\2\2\2rs\5\6\4\2su\7\34\2\2")
        buf.write("tv\5.\30\2ut\3\2\2\2uv\3\2\2\2v\13\3\2\2\2wy\7\25\2\2")
        buf.write("xz\5.\30\2yx\3\2\2\2yz\3\2\2\2z{\3\2\2\2{|\5&\24\2|}\5")
        buf.write("&\24\2}~\5\16\b\2~\177\5(\25\2\177\u0081\5(\25\2\u0080")
        buf.write("\u0082\5.\30\2\u0081\u0080\3\2\2\2\u0081\u0082\3\2\2\2")
        buf.write("\u0082\u0084\3\2\2\2\u0083\u0085\7$\2\2\u0084\u0083\3")
        buf.write("\2\2\2\u0084\u0085\3\2\2\2\u0085\u0087\3\2\2\2\u0086\u0088")
        buf.write("\5.\30\2\u0087\u0086\3\2\2\2\u0087\u0088\3\2\2\2\u0088")
        buf.write("\u0089\3\2\2\2\u0089\u008b\7\27\2\2\u008a\u008c\5.\30")
        buf.write("\2\u008b\u008a\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d")
        buf.write("\3\2\2\2\u008d\u008e\5\6\4\2\u008e\u0090\7\34\2\2\u008f")
        buf.write("\u0091\5.\30\2\u0090\u008f\3\2\2\2\u0090\u0091\3\2\2\2")
        buf.write("\u0091\r\3\2\2\2\u0092\u0094\5.\30\2\u0093\u0092\3\2\2")
        buf.write("\2\u0093\u0094\3\2\2\2\u0094\u0096\3\2\2\2\u0095\u0097")
        buf.write("\5\34\17\2\u0096\u0095\3\2\2\2\u0096\u0097\3\2\2\2\u0097")
        buf.write("\u009f\3\2\2\2\u0098\u009a\7\3\2\2\u0099\u009b\5.\30\2")
        buf.write("\u009a\u0099\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c\3")
        buf.write("\2\2\2\u009c\u009e\5\34\17\2\u009d\u0098\3\2\2\2\u009e")
        buf.write("\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2")
        buf.write("\u00a0\u00a2\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a4\7")
        buf.write("$\2\2\u00a3\u00a5\5.\30\2\u00a4\u00a3\3\2\2\2\u00a4\u00a5")
        buf.write("\3\2\2\2\u00a5\u00a7\3\2\2\2\u00a6\u00a8\5\30\r\2\u00a7")
        buf.write("\u00a6\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00b0\3\2\2\2")
        buf.write("\u00a9\u00ab\7%\2\2\u00aa\u00ac\5.\30\2\u00ab\u00aa\3")
        buf.write("\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00af")
        buf.write("\5\30\r\2\u00ae\u00a9\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0")
        buf.write("\u00b1\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00b3\3\2\2\2")
        buf.write("\u00b2\u00b0\3\2\2\2\u00b3\u00b5\7$\2\2\u00b4\u00b6\5")
        buf.write(".\30\2\u00b5\u00b4\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b8")
        buf.write("\3\2\2\2\u00b7\u00b9\5$\23\2\u00b8\u00b7\3\2\2\2\u00b8")
        buf.write("\u00b9\3\2\2\2\u00b9\u00be\3\2\2\2\u00ba\u00bb\7\3\2\2")
        buf.write("\u00bb\u00bd\5$\23\2\u00bc\u00ba\3\2\2\2\u00bd\u00c0\3")
        buf.write("\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c2")
        buf.write("\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1\u00c3\5.\30\2\u00c2")
        buf.write("\u00c1\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\17\3\2\2\2\u00c4")
        buf.write("\u00c6\7\20\2\2\u00c5\u00c7\5.\30\2\u00c6\u00c5\3\2\2")
        buf.write("\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00ca")
        buf.write("\5\26\f\2\u00c9\u00cb\7$\2\2\u00ca\u00c9\3\2\2\2\u00ca")
        buf.write("\u00cb\3\2\2\2\u00cb\u00cd\3\2\2\2\u00cc\u00ce\5.\30\2")
        buf.write("\u00cd\u00cc\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\3")
        buf.write("\2\2\2\u00cf\u00d1\7\21\2\2\u00d0\u00d2\5.\30\2\u00d1")
        buf.write("\u00d0\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d3\3\2\2\2")
        buf.write("\u00d3\u00f8\5\6\4\2\u00d4\u00d6\7\22\2\2\u00d5\u00d7")
        buf.write("\5.\30\2\u00d6\u00d5\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7")
        buf.write("\u00d8\3\2\2\2\u00d8\u00d9\5&\24\2\u00d9\u00db\5&\24\2")
        buf.write("\u00da\u00dc\5.\30\2\u00db\u00da\3\2\2\2\u00db\u00dc\3")
        buf.write("\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00e2\5\30\r\2\u00de")
        buf.write("\u00df\7%\2\2\u00df\u00e1\5\30\r\2\u00e0\u00de\3\2\2\2")
        buf.write("\u00e1\u00e4\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e2\u00e0\3")
        buf.write("\2\2\2\u00e3\u00e5\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00e6")
        buf.write("\5(\25\2\u00e6\u00e8\5(\25\2\u00e7\u00e9\5.\30\2\u00e8")
        buf.write("\u00e7\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00eb\3\2\2\2")
        buf.write("\u00ea\u00ec\7$\2\2\u00eb\u00ea\3\2\2\2\u00eb\u00ec\3")
        buf.write("\2\2\2\u00ec\u00ee\3\2\2\2\u00ed\u00ef\5.\30\2\u00ee\u00ed")
        buf.write("\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0")
        buf.write("\u00f2\7\21\2\2\u00f1\u00f3\5.\30\2\u00f2\u00f1\3\2\2")
        buf.write("\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f5")
        buf.write("\5\6\4\2\u00f5\u00f7\3\2\2\2\u00f6\u00d4\3\2\2\2\u00f7")
        buf.write("\u00fa\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2")
        buf.write("\u00f9\u0100\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00fd\7")
        buf.write("\23\2\2\u00fc\u00fe\5.\30\2\u00fd\u00fc\3\2\2\2\u00fd")
        buf.write("\u00fe\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0101\5\6\4\2")
        buf.write("\u0100\u00fb\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0102\3")
        buf.write("\2\2\2\u0102\u0104\7\24\2\2\u0103\u0105\5.\30\2\u0104")
        buf.write("\u0103\3\2\2\2\u0104\u0105\3\2\2\2\u0105\21\3\2\2\2\u0106")
        buf.write("\u0108\7\17\2\2\u0107\u0109\5.\30\2\u0108\u0107\3\2\2")
        buf.write("\2\u0108\u0109\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010c")
        buf.write("\7\36\2\2\u010b\u010d\5.\30\2\u010c\u010b\3\2\2\2\u010c")
        buf.write("\u010d\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u0110\7\4\2\2")
        buf.write("\u010f\u0111\5.\30\2\u0110\u010f\3\2\2\2\u0110\u0111\3")
        buf.write("\2\2\2\u0111\u0112\3\2\2\2\u0112\u0114\7\5\2\2\u0113\u0115")
        buf.write("\5.\30\2\u0114\u0113\3\2\2\2\u0114\u0115\3\2\2\2\u0115")
        buf.write("\u0116\3\2\2\2\u0116\u0118\7\6\2\2\u0117\u0119\5.\30\2")
        buf.write("\u0118\u0117\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011a\3")
        buf.write("\2\2\2\u011a\u011c\5\6\4\2\u011b\u011d\5.\30\2\u011c\u011b")
        buf.write("\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011e\3\2\2\2\u011e")
        buf.write("\u011f\7\7\2\2\u011f\23\3\2\2\2\u0120\u0122\7\36\2\2\u0121")
        buf.write("\u0123\5.\30\2\u0122\u0121\3\2\2\2\u0122\u0123\3\2\2\2")
        buf.write("\u0123\u0127\3\2\2\2\u0124\u0126\5 \21\2\u0125\u0124\3")
        buf.write("\2\2\2\u0126\u0129\3\2\2\2\u0127\u0128\3\2\2\2\u0127\u0125")
        buf.write("\3\2\2\2\u0128\u012b\3\2\2\2\u0129\u0127\3\2\2\2\u012a")
        buf.write("\u012c\7$\2\2\u012b\u012a\3\2\2\2\u012b\u012c\3\2\2\2")
        buf.write("\u012c\u012e\3\2\2\2\u012d\u012f\5.\30\2\u012e\u012d\3")
        buf.write("\2\2\2\u012e\u012f\3\2\2\2\u012f\25\3\2\2\2\u0130\u0131")
        buf.write("\5&\24\2\u0131\u0133\5&\24\2\u0132\u0134\5.\30\2\u0133")
        buf.write("\u0132\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0135\3\2\2\2")
        buf.write("\u0135\u013d\5\30\r\2\u0136\u0138\7%\2\2\u0137\u0139\5")
        buf.write(".\30\2\u0138\u0137\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013a")
        buf.write("\3\2\2\2\u013a\u013c\5\30\r\2\u013b\u0136\3\2\2\2\u013c")
        buf.write("\u013f\3\2\2\2\u013d\u013e\3\2\2\2\u013d\u013b\3\2\2\2")
        buf.write("\u013e\u0140\3\2\2\2\u013f\u013d\3\2\2\2\u0140\u0141\5")
        buf.write("(\25\2\u0141\u0143\5(\25\2\u0142\u0144\5.\30\2\u0143\u0142")
        buf.write("\3\2\2\2\u0143\u0144\3\2\2\2\u0144\27\3\2\2\2\u0145\u0147")
        buf.write("\5.\30\2\u0146\u0145\3\2\2\2\u0146\u0147\3\2\2\2\u0147")
        buf.write("\u0149\3\2\2\2\u0148\u014a\t\2\2\2\u0149\u0148\3\2\2\2")
        buf.write("\u014a\u014b\3\2\2\2\u014b\u0149\3\2\2\2\u014b\u014c\3")
        buf.write("\2\2\2\u014c\u014e\3\2\2\2\u014d\u014f\5.\30\2\u014e\u014d")
        buf.write("\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0150\3\2\2\2\u0150")
        buf.write("\u0152\7\'\2\2\u0151\u0153\5.\30\2\u0152\u0151\3\2\2\2")
        buf.write("\u0152\u0153\3\2\2\2\u0153\u015b\3\2\2\2\u0154\u015c\5")
        buf.write("\60\31\2\u0155\u015c\7\36\2\2\u0156\u015c\7\"\2\2\u0157")
        buf.write("\u015c\7(\2\2\u0158\u015c\7!\2\2\u0159\u015c\7\n\2\2\u015a")
        buf.write("\u015c\7(\2\2\u015b\u0154\3\2\2\2\u015b\u0155\3\2\2\2")
        buf.write("\u015b\u0156\3\2\2\2\u015b\u0157\3\2\2\2\u015b\u0158\3")
        buf.write("\2\2\2\u015b\u0159\3\2\2\2\u015b\u015a\3\2\2\2\u015c\u015d")
        buf.write("\3\2\2\2\u015d\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015e")
        buf.write("\u0160\3\2\2\2\u015f\u0161\5.\30\2\u0160\u015f\3\2\2\2")
        buf.write("\u0160\u0161\3\2\2\2\u0161\31\3\2\2\2\u0162\u0164\7\35")
        buf.write("\2\2\u0163\u0165\5.\30\2\u0164\u0163\3\2\2\2\u0164\u0165")
        buf.write("\3\2\2\2\u0165\u0169\3\2\2\2\u0166\u0168\5 \21\2\u0167")
        buf.write("\u0166\3\2\2\2\u0168\u016b\3\2\2\2\u0169\u016a\3\2\2\2")
        buf.write("\u0169\u0167\3\2\2\2\u016a\u016d\3\2\2\2\u016b\u0169\3")
        buf.write("\2\2\2\u016c\u016e\7$\2\2\u016d\u016c\3\2\2\2\u016d\u016e")
        buf.write("\3\2\2\2\u016e\u0170\3\2\2\2\u016f\u0171\5.\30\2\u0170")
        buf.write("\u016f\3\2\2\2\u0170\u0171\3\2\2\2\u0171\33\3\2\2\2\u0172")
        buf.write("\u0173\7\36\2\2\u0173\u017a\7#\2\2\u0174\u017b\5\60\31")
        buf.write("\2\u0175\u017b\7\"\2\2\u0176\u017b\7\36\2\2\u0177\u017b")
        buf.write("\7!\2\2\u0178\u017b\7\n\2\2\u0179\u017b\7(\2\2\u017a\u0174")
        buf.write("\3\2\2\2\u017a\u0175\3\2\2\2\u017a\u0176\3\2\2\2\u017a")
        buf.write("\u0177\3\2\2\2\u017a\u0178\3\2\2\2\u017a\u0179\3\2\2\2")
        buf.write("\u017b\u017c\3\2\2\2\u017c\u017a\3\2\2\2\u017c\u017d\3")
        buf.write("\2\2\2\u017d\u017f\3\2\2\2\u017e\u0180\7$\2\2\u017f\u017e")
        buf.write("\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0182\3\2\2\2\u0181")
        buf.write("\u0183\5.\30\2\u0182\u0181\3\2\2\2\u0182\u0183\3\2\2\2")
        buf.write("\u0183\35\3\2\2\2\u0184\u0185\5&\24\2\u0185\u0187\5&\24")
        buf.write("\2\u0186\u0188\5.\30\2\u0187\u0186\3\2\2\2\u0187\u0188")
        buf.write("\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u018b\7\36\2\2\u018a")
        buf.write("\u018c\5.\30\2\u018b\u018a\3\2\2\2\u018b\u018c\3\2\2\2")
        buf.write("\u018c\u018d\3\2\2\2\u018d\u018f\t\3\2\2\u018e\u0190\5")
        buf.write(".\30\2\u018f\u018e\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u0199")
        buf.write("\3\2\2\2\u0191\u0198\5\60\31\2\u0192\u0198\7\"\2\2\u0193")
        buf.write("\u0198\7\36\2\2\u0194\u0198\7!\2\2\u0195\u0198\7\n\2\2")
        buf.write("\u0196\u0198\7(\2\2\u0197\u0191\3\2\2\2\u0197\u0192\3")
        buf.write("\2\2\2\u0197\u0193\3\2\2\2\u0197\u0194\3\2\2\2\u0197\u0195")
        buf.write("\3\2\2\2\u0197\u0196\3\2\2\2\u0198\u019b\3\2\2\2\u0199")
        buf.write("\u0197\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u019d\3\2\2\2")
        buf.write("\u019b\u0199\3\2\2\2\u019c\u019e\5.\30\2\u019d\u019c\3")
        buf.write("\2\2\2\u019d\u019e\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a0")
        buf.write("\5(\25\2\u01a0\u01a2\5(\25\2\u01a1\u01a3\7$\2\2\u01a2")
        buf.write("\u01a1\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a5\3\2\2\2")
        buf.write("\u01a4\u01a6\5.\30\2\u01a5\u01a4\3\2\2\2\u01a5\u01a6\3")
        buf.write("\2\2\2\u01a6\37\3\2\2\2\u01a7\u01b4\7\36\2\2\u01a8\u01b4")
        buf.write("\7\"\2\2\u01a9\u01b4\7(\2\2\u01aa\u01b4\7!\2\2\u01ab\u01b4")
        buf.write("\5\60\31\2\u01ac\u01b4\7&\2\2\u01ad\u01b4\7)\2\2\u01ae")
        buf.write("\u01b4\5.\30\2\u01af\u01b4\5*\26\2\u01b0\u01b4\7 \2\2")
        buf.write("\u01b1\u01b4\7\37\2\2\u01b2\u01b4\7\n\2\2\u01b3\u01a7")
        buf.write("\3\2\2\2\u01b3\u01a8\3\2\2\2\u01b3\u01a9\3\2\2\2\u01b3")
        buf.write("\u01aa\3\2\2\2\u01b3\u01ab\3\2\2\2\u01b3\u01ac\3\2\2\2")
        buf.write("\u01b3\u01ad\3\2\2\2\u01b3\u01ae\3\2\2\2\u01b3\u01af\3")
        buf.write("\2\2\2\u01b3\u01b0\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b3\u01b2")
        buf.write("\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b5")
        buf.write("\u01b6\3\2\2\2\u01b6\u01b8\3\2\2\2\u01b7\u01b9\5.\30\2")
        buf.write("\u01b8\u01b7\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9!\3\2\2")
        buf.write("\2\u01ba\u01bb\7\36\2\2\u01bb\u01bc\7\'\2\2\u01bc\u01bd")
        buf.write("\7\"\2\2\u01bd#\3\2\2\2\u01be\u01bf\7\36\2\2\u01bf\u01c5")
        buf.write("\7&\2\2\u01c0\u01c6\7(\2\2\u01c1\u01c6\7\36\2\2\u01c2")
        buf.write("\u01c6\7\"\2\2\u01c3\u01c6\5\60\31\2\u01c4\u01c6\7!\2")
        buf.write("\2\u01c5\u01c0\3\2\2\2\u01c5\u01c1\3\2\2\2\u01c5\u01c2")
        buf.write("\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c5\u01c4\3\2\2\2\u01c5")
        buf.write("\u01c6\3\2\2\2\u01c6\u01ca\3\2\2\2\u01c7\u01c8\7&\2\2")
        buf.write("\u01c8\u01ca\7\36\2\2\u01c9\u01be\3\2\2\2\u01c9\u01c7")
        buf.write("\3\2\2\2\u01ca%\3\2\2\2\u01cb\u01cc\t\4\2\2\u01cc\'\3")
        buf.write("\2\2\2\u01cd\u01ce\t\5\2\2\u01ce)\3\2\2\2\u01cf\u01d0")
        buf.write("\t\6\2\2\u01d0+\3\2\2\2\u01d1\u01d2\7\30\2\2\u01d2\u01d9")
        buf.write("\5.\30\2\u01d3\u01d5\5*\26\2\u01d4\u01d6\7\16\2\2\u01d5")
        buf.write("\u01d4\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d8\3\2\2\2")
        buf.write("\u01d7\u01d3\3\2\2\2\u01d8\u01db\3\2\2\2\u01d9\u01d7\3")
        buf.write("\2\2\2\u01d9\u01da\3\2\2\2\u01da\u01dc\3\2\2\2\u01db\u01d9")
        buf.write("\3\2\2\2\u01dc\u01dd\5\60\31\2\u01dd\u01de\5.\30\2\u01de")
        buf.write("\u01df\t\7\2\2\u01df\u01e3\5.\30\2\u01e0\u01e2\7\'\2\2")
        buf.write("\u01e1\u01e0\3\2\2\2\u01e2\u01e5\3\2\2\2\u01e3\u01e1\3")
        buf.write("\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01e9\3\2\2\2\u01e5\u01e3")
        buf.write("\3\2\2\2\u01e6\u01e8\7\16\2\2\u01e7\u01e6\3\2\2\2\u01e8")
        buf.write("\u01eb\3\2\2\2\u01e9\u01e7\3\2\2\2\u01e9\u01ea\3\2\2\2")
        buf.write("\u01ea\u01ef\3\2\2\2\u01eb\u01e9\3\2\2\2\u01ec\u01ee\t")
        buf.write("\7\2\2\u01ed\u01ec\3\2\2\2\u01ee\u01f1\3\2\2\2\u01ef\u01ed")
        buf.write("\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0\u01f2\3\2\2\2\u01f1")
        buf.write("\u01ef\3\2\2\2\u01f2\u01f6\7\'\2\2\u01f3\u01f5\7\16\2")
        buf.write("\2\u01f4\u01f3\3\2\2\2\u01f5\u01f8\3\2\2\2\u01f6\u01f4")
        buf.write("\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7\u01f9\3\2\2\2\u01f8")
        buf.write("\u01f6\3\2\2\2\u01f9\u01fb\t\7\2\2\u01fa\u01fc\7$\2\2")
        buf.write("\u01fb\u01fa\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc\u01fe\3")
        buf.write("\2\2\2\u01fd\u01ff\5.\30\2\u01fe\u01fd\3\2\2\2\u01fe\u01ff")
        buf.write("\3\2\2\2\u01ff-\3\2\2\2\u0200\u0202\7\16\2\2\u0201\u0200")
        buf.write("\3\2\2\2\u0202\u0203\3\2\2\2\u0203\u0201\3\2\2\2\u0203")
        buf.write("\u0204\3\2\2\2\u0204/\3\2\2\2\u0205\u0206\t\b\2\2\u0206")
        buf.write("\61\3\2\2\2d\65CEQUWY]aeilpuy\u0081\u0084\u0087\u008b")
        buf.write("\u0090\u0093\u0096\u009a\u009f\u00a4\u00a7\u00ab\u00b0")
        buf.write("\u00b5\u00b8\u00be\u00c2\u00c6\u00ca\u00cd\u00d1\u00d6")
        buf.write("\u00db\u00e2\u00e8\u00eb\u00ee\u00f2\u00f8\u00fd\u0100")
        buf.write("\u0104\u0108\u010c\u0110\u0114\u0118\u011c\u0122\u0127")
        buf.write("\u012b\u012e\u0133\u0138\u013d\u0143\u0146\u014b\u014e")
        buf.write("\u0152\u015b\u015d\u0160\u0164\u0169\u016d\u0170\u017a")
        buf.write("\u017c\u017f\u0182\u0187\u018b\u018f\u0197\u0199\u019d")
        buf.write("\u01a2\u01a5\u01b3\u01b5\u01b8\u01c5\u01c9\u01d5\u01d9")
        buf.write("\u01e3\u01e9\u01ef\u01f6\u01fb\u01fe\u0203")
        return buf.getvalue()


class bashGrammarParser ( Parser ):

    grammarFileName = "bashGrammar.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "','", "'('", "')'", "'{'", "'}'", "'['", 
                     "']'", "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                     "<INVALID>", "'function'", "'if'", "'then'", "'elif'", 
                     "'else'", "'fi'", "'for'", "'while'", "'do'", "'sed'", 
                     "<INVALID>", "'break'", "'continue'", "'done'", "<INVALID>", 
                     "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                     "<INVALID>", "'='", "';'" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "OPEN_PAR", "CLOSE_PAR", 
                      "OPEN_CUR", "CLOSE_CUR", "OPEN_BOX", "CLOSE_BOX", 
                      "RHS_ASSIGNMENT", "SINGLE_STRING", "DOUBLE_STRING", 
                      "COMMENT", "SPACE", "FUNCTION", "IF", "THEN", "ELIF", 
                      "ELSE", "FI", "FOR", "WHILE", "DO", "SED", "SED_FLAG", 
                      "BREAK", "CONTINUE", "DONE", "COMMAND", "VAR", "WEBSITE", 
                      "FILENAME", "BASH_VAR", "VAL", "ASSIGN", "SEMICOLON", 
                      "LOGICAL_OP", "INCREMENT", "COMPARE", "BLOB", "OTHER" ]

    RULE_code = 0
    RULE_bashScript = 1
    RULE_expressions = 2
    RULE_loops = 3
    RULE_while_loop = 4
    RULE_for_loop = 5
    RULE_inside_for = 6
    RULE_ifElse = 7
    RULE_function_def = 8
    RULE_function_call = 9
    RULE_multi_conditions = 10
    RULE_condition = 11
    RULE_linux_command = 12
    RULE_assignment = 13
    RULE_advanced_assignment = 14
    RULE_command_data = 15
    RULE_comparison = 16
    RULE_increment = 17
    RULE_open_bracket = 18
    RULE_close_bracket = 19
    RULE_sed_flag = 20
    RULE_sed = 21
    RULE_space = 22
    RULE_string = 23

    ruleNames =  [ "code", "bashScript", "expressions", "loops", "while_loop", 
                   "for_loop", "inside_for", "ifElse", "function_def", "function_call", 
                   "multi_conditions", "condition", "linux_command", "assignment", 
                   "advanced_assignment", "command_data", "comparison", 
                   "increment", "open_bracket", "close_bracket", "sed_flag", 
                   "sed", "space", "string" ]

    EOF = Token.EOF
    T__0=1
    OPEN_PAR=2
    CLOSE_PAR=3
    OPEN_CUR=4
    CLOSE_CUR=5
    OPEN_BOX=6
    CLOSE_BOX=7
    RHS_ASSIGNMENT=8
    SINGLE_STRING=9
    DOUBLE_STRING=10
    COMMENT=11
    SPACE=12
    FUNCTION=13
    IF=14
    THEN=15
    ELIF=16
    ELSE=17
    FI=18
    FOR=19
    WHILE=20
    DO=21
    SED=22
    SED_FLAG=23
    BREAK=24
    CONTINUE=25
    DONE=26
    COMMAND=27
    VAR=28
    WEBSITE=29
    FILENAME=30
    BASH_VAR=31
    VAL=32
    ASSIGN=33
    SEMICOLON=34
    LOGICAL_OP=35
    INCREMENT=36
    COMPARE=37
    BLOB=38
    OTHER=39

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
            self.state = 51
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << bashGrammarParser.OPEN_PAR) | (1 << bashGrammarParser.OPEN_CUR) | (1 << bashGrammarParser.OPEN_BOX) | (1 << bashGrammarParser.SPACE) | (1 << bashGrammarParser.FUNCTION) | (1 << bashGrammarParser.IF) | (1 << bashGrammarParser.FOR) | (1 << bashGrammarParser.WHILE) | (1 << bashGrammarParser.SED) | (1 << bashGrammarParser.COMMAND) | (1 << bashGrammarParser.VAR))) != 0):
                self.state = 48
                self.bashScript()
                self.state = 53
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 54
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

        def function_call(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(bashGrammarParser.Function_callContext)
            else:
                return self.getTypedRuleContext(bashGrammarParser.Function_callContext,i)


        def function_def(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(bashGrammarParser.Function_defContext)
            else:
                return self.getTypedRuleContext(bashGrammarParser.Function_defContext,i)


        def loops(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(bashGrammarParser.LoopsContext)
            else:
                return self.getTypedRuleContext(bashGrammarParser.LoopsContext,i)


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
            self.state = 65 
            self._errHandler.sync(self)
            _alt = 1
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt == 1:
                    self.state = 65
                    self._errHandler.sync(self)
                    la_ = self._interp.adaptivePredict(self._input,1,self._ctx)
                    if la_ == 1:
                        self.state = 56
                        self.function_call()
                        pass

                    elif la_ == 2:
                        self.state = 57
                        self.function_def()
                        pass

                    elif la_ == 3:
                        self.state = 58
                        self.loops()
                        pass

                    elif la_ == 4:
                        self.state = 59
                        self.assignment()
                        pass

                    elif la_ == 5:
                        self.state = 60
                        self.linux_command()
                        pass

                    elif la_ == 6:
                        self.state = 61
                        self.space()
                        pass

                    elif la_ == 7:
                        self.state = 62
                        self.advanced_assignment()
                        pass

                    elif la_ == 8:
                        self.state = 63
                        self.ifElse()
                        pass

                    elif la_ == 9:
                        self.state = 64
                        self.sed()
                        pass



                else:
                    raise NoViableAltException(self)
                self.state = 67 
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

        def function_call(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(bashGrammarParser.Function_callContext)
            else:
                return self.getTypedRuleContext(bashGrammarParser.Function_callContext,i)


        def function_def(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(bashGrammarParser.Function_defContext)
            else:
                return self.getTypedRuleContext(bashGrammarParser.Function_defContext,i)


        def loops(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(bashGrammarParser.LoopsContext)
            else:
                return self.getTypedRuleContext(bashGrammarParser.LoopsContext,i)


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


        def sed(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(bashGrammarParser.SedContext)
            else:
                return self.getTypedRuleContext(bashGrammarParser.SedContext,i)


        def BREAK(self, i:int=None):
            if i is None:
                return self.getTokens(bashGrammarParser.BREAK)
            else:
                return self.getToken(bashGrammarParser.BREAK, i)

        def CONTINUE(self, i:int=None):
            if i is None:
                return self.getTokens(bashGrammarParser.CONTINUE)
            else:
                return self.getToken(bashGrammarParser.CONTINUE, i)

        def space(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(bashGrammarParser.SpaceContext)
            else:
                return self.getTypedRuleContext(bashGrammarParser.SpaceContext,i)


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
            self.state = 87
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << bashGrammarParser.OPEN_PAR) | (1 << bashGrammarParser.OPEN_CUR) | (1 << bashGrammarParser.OPEN_BOX) | (1 << bashGrammarParser.FUNCTION) | (1 << bashGrammarParser.IF) | (1 << bashGrammarParser.FOR) | (1 << bashGrammarParser.WHILE) | (1 << bashGrammarParser.SED) | (1 << bashGrammarParser.BREAK) | (1 << bashGrammarParser.CONTINUE) | (1 << bashGrammarParser.COMMAND) | (1 << bashGrammarParser.VAR))) != 0):
                self.state = 85
                self._errHandler.sync(self)
                la_ = self._interp.adaptivePredict(self._input,5,self._ctx)
                if la_ == 1:
                    self.state = 69
                    self.function_call()
                    pass

                elif la_ == 2:
                    self.state = 70
                    self.function_def()
                    pass

                elif la_ == 3:
                    self.state = 71
                    self.loops()
                    pass

                elif la_ == 4:
                    self.state = 72
                    self.assignment()
                    pass

                elif la_ == 5:
                    self.state = 73
                    self.linux_command()
                    pass

                elif la_ == 6:
                    self.state = 74
                    self.advanced_assignment()
                    pass

                elif la_ == 7:
                    self.state = 75
                    self.ifElse()
                    pass

                elif la_ == 8:
                    self.state = 76
                    self.sed()
                    pass

                elif la_ == 9:
                    self.state = 77
                    self.match(bashGrammarParser.BREAK)
                    self.state = 79
                    self._errHandler.sync(self)
                    la_ = self._interp.adaptivePredict(self._input,3,self._ctx)
                    if la_ == 1:
                        self.state = 78
                        self.space()


                    pass

                elif la_ == 10:
                    self.state = 81
                    self.match(bashGrammarParser.CONTINUE)
                    self.state = 83
                    self._errHandler.sync(self)
                    la_ = self._interp.adaptivePredict(self._input,4,self._ctx)
                    if la_ == 1:
                        self.state = 82
                        self.space()


                    pass


                self.state = 89
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 91
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,7,self._ctx)
            if la_ == 1:
                self.state = 90
                self.space()


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class LoopsContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def while_loop(self):
            return self.getTypedRuleContext(bashGrammarParser.While_loopContext,0)


        def for_loop(self):
            return self.getTypedRuleContext(bashGrammarParser.For_loopContext,0)


        def getRuleIndex(self):
            return bashGrammarParser.RULE_loops

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterLoops" ):
                listener.enterLoops(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitLoops" ):
                listener.exitLoops(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitLoops" ):
                return visitor.visitLoops(self)
            else:
                return visitor.visitChildren(self)




    def loops(self):

        localctx = bashGrammarParser.LoopsContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_loops)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 95
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [bashGrammarParser.WHILE]:
                self.state = 93
                self.while_loop()
                pass
            elif token in [bashGrammarParser.FOR]:
                self.state = 94
                self.for_loop()
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


    class While_loopContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def WHILE(self):
            return self.getToken(bashGrammarParser.WHILE, 0)

        def multi_conditions(self):
            return self.getTypedRuleContext(bashGrammarParser.Multi_conditionsContext,0)


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
            return bashGrammarParser.RULE_while_loop

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterWhile_loop" ):
                listener.enterWhile_loop(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitWhile_loop" ):
                listener.exitWhile_loop(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitWhile_loop" ):
                return visitor.visitWhile_loop(self)
            else:
                return visitor.visitChildren(self)




    def while_loop(self):

        localctx = bashGrammarParser.While_loopContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_while_loop)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 97
            self.match(bashGrammarParser.WHILE)
            self.state = 99
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==bashGrammarParser.SPACE:
                self.state = 98
                self.space()


            self.state = 101
            self.multi_conditions()
            self.state = 103
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==bashGrammarParser.SEMICOLON:
                self.state = 102
                self.match(bashGrammarParser.SEMICOLON)


            self.state = 106
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==bashGrammarParser.SPACE:
                self.state = 105
                self.space()


            self.state = 108
            self.match(bashGrammarParser.DO)
            self.state = 110
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,12,self._ctx)
            if la_ == 1:
                self.state = 109
                self.space()


            self.state = 112
            self.expressions()
            self.state = 113
            self.match(bashGrammarParser.DONE)
            self.state = 115
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,13,self._ctx)
            if la_ == 1:
                self.state = 114
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

        def open_bracket(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(bashGrammarParser.Open_bracketContext)
            else:
                return self.getTypedRuleContext(bashGrammarParser.Open_bracketContext,i)


        def inside_for(self):
            return self.getTypedRuleContext(bashGrammarParser.Inside_forContext,0)


        def close_bracket(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(bashGrammarParser.Close_bracketContext)
            else:
                return self.getTypedRuleContext(bashGrammarParser.Close_bracketContext,i)


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
        self.enterRule(localctx, 10, self.RULE_for_loop)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 117
            self.match(bashGrammarParser.FOR)
            self.state = 119
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==bashGrammarParser.SPACE:
                self.state = 118
                self.space()


            self.state = 121
            self.open_bracket()
            self.state = 122
            self.open_bracket()
            self.state = 123
            self.inside_for()
            self.state = 124
            self.close_bracket()
            self.state = 125
            self.close_bracket()
            self.state = 127
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,15,self._ctx)
            if la_ == 1:
                self.state = 126
                self.space()


            self.state = 130
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==bashGrammarParser.SEMICOLON:
                self.state = 129
                self.match(bashGrammarParser.SEMICOLON)


            self.state = 133
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==bashGrammarParser.SPACE:
                self.state = 132
                self.space()


            self.state = 135
            self.match(bashGrammarParser.DO)
            self.state = 137
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,18,self._ctx)
            if la_ == 1:
                self.state = 136
                self.space()


            self.state = 139
            self.expressions()
            self.state = 140
            self.match(bashGrammarParser.DONE)
            self.state = 142
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,19,self._ctx)
            if la_ == 1:
                self.state = 141
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
        self.enterRule(localctx, 12, self.RULE_inside_for)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 145
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==bashGrammarParser.SPACE:
                self.state = 144
                self.space()


            self.state = 148
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==bashGrammarParser.VAR:
                self.state = 147
                self.assignment()


            self.state = 157
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==bashGrammarParser.T__0:
                self.state = 150
                self.match(bashGrammarParser.T__0)
                self.state = 152
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==bashGrammarParser.SPACE:
                    self.state = 151
                    self.space()


                self.state = 154
                self.assignment()
                self.state = 159
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 160
            self.match(bashGrammarParser.SEMICOLON)
            self.state = 162
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,24,self._ctx)
            if la_ == 1:
                self.state = 161
                self.space()


            self.state = 165
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if (((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << bashGrammarParser.SPACE) | (1 << bashGrammarParser.VAR) | (1 << bashGrammarParser.VAL) | (1 << bashGrammarParser.BLOB))) != 0):
                self.state = 164
                self.condition()


            self.state = 174
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,27,self._ctx)
            while _alt!=1 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1+1:
                    self.state = 167
                    self.match(bashGrammarParser.LOGICAL_OP)
                    self.state = 169
                    self._errHandler.sync(self)
                    la_ = self._interp.adaptivePredict(self._input,26,self._ctx)
                    if la_ == 1:
                        self.state = 168
                        self.space()


                    self.state = 171
                    self.condition() 
                self.state = 176
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,27,self._ctx)

            self.state = 177
            self.match(bashGrammarParser.SEMICOLON)
            self.state = 179
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,28,self._ctx)
            if la_ == 1:
                self.state = 178
                self.space()


            self.state = 182
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==bashGrammarParser.VAR or _la==bashGrammarParser.INCREMENT:
                self.state = 181
                self.increment()


            self.state = 188
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==bashGrammarParser.T__0:
                self.state = 184
                self.match(bashGrammarParser.T__0)
                self.state = 185
                self.increment()
                self.state = 190
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 192
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==bashGrammarParser.SPACE:
                self.state = 191
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

        def multi_conditions(self):
            return self.getTypedRuleContext(bashGrammarParser.Multi_conditionsContext,0)


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


        def FI(self):
            return self.getToken(bashGrammarParser.FI, 0)

        def space(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(bashGrammarParser.SpaceContext)
            else:
                return self.getTypedRuleContext(bashGrammarParser.SpaceContext,i)


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

        def open_bracket(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(bashGrammarParser.Open_bracketContext)
            else:
                return self.getTypedRuleContext(bashGrammarParser.Open_bracketContext,i)


        def condition(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(bashGrammarParser.ConditionContext)
            else:
                return self.getTypedRuleContext(bashGrammarParser.ConditionContext,i)


        def close_bracket(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(bashGrammarParser.Close_bracketContext)
            else:
                return self.getTypedRuleContext(bashGrammarParser.Close_bracketContext,i)


        def ELSE(self):
            return self.getToken(bashGrammarParser.ELSE, 0)

        def LOGICAL_OP(self, i:int=None):
            if i is None:
                return self.getTokens(bashGrammarParser.LOGICAL_OP)
            else:
                return self.getToken(bashGrammarParser.LOGICAL_OP, i)

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
        self.enterRule(localctx, 14, self.RULE_ifElse)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 194
            self.match(bashGrammarParser.IF)
            self.state = 196
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==bashGrammarParser.SPACE:
                self.state = 195
                self.space()


            self.state = 198
            self.multi_conditions()
            self.state = 200
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==bashGrammarParser.SEMICOLON:
                self.state = 199
                self.match(bashGrammarParser.SEMICOLON)


            self.state = 203
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==bashGrammarParser.SPACE:
                self.state = 202
                self.space()


            self.state = 205
            self.match(bashGrammarParser.THEN)
            self.state = 207
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,35,self._ctx)
            if la_ == 1:
                self.state = 206
                self.space()


            self.state = 209
            self.expressions()
            self.state = 246
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==bashGrammarParser.ELIF:
                self.state = 210
                self.match(bashGrammarParser.ELIF)
                self.state = 212
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==bashGrammarParser.SPACE:
                    self.state = 211
                    self.space()


                self.state = 214
                self.open_bracket()
                self.state = 215
                self.open_bracket()
                self.state = 217
                self._errHandler.sync(self)
                la_ = self._interp.adaptivePredict(self._input,37,self._ctx)
                if la_ == 1:
                    self.state = 216
                    self.space()


                self.state = 219
                self.condition()
                self.state = 224
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,38,self._ctx)
                while _alt!=1 and _alt!=ATN.INVALID_ALT_NUMBER:
                    if _alt==1+1:
                        self.state = 220
                        self.match(bashGrammarParser.LOGICAL_OP)
                        self.state = 221
                        self.condition() 
                    self.state = 226
                    self._errHandler.sync(self)
                    _alt = self._interp.adaptivePredict(self._input,38,self._ctx)

                self.state = 227
                self.close_bracket()
                self.state = 228
                self.close_bracket()
                self.state = 230
                self._errHandler.sync(self)
                la_ = self._interp.adaptivePredict(self._input,39,self._ctx)
                if la_ == 1:
                    self.state = 229
                    self.space()


                self.state = 233
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==bashGrammarParser.SEMICOLON:
                    self.state = 232
                    self.match(bashGrammarParser.SEMICOLON)


                self.state = 236
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==bashGrammarParser.SPACE:
                    self.state = 235
                    self.space()


                self.state = 238
                self.match(bashGrammarParser.THEN)
                self.state = 240
                self._errHandler.sync(self)
                la_ = self._interp.adaptivePredict(self._input,42,self._ctx)
                if la_ == 1:
                    self.state = 239
                    self.space()


                self.state = 242
                self.expressions()
                self.state = 248
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 254
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==bashGrammarParser.ELSE:
                self.state = 249
                self.match(bashGrammarParser.ELSE)
                self.state = 251
                self._errHandler.sync(self)
                la_ = self._interp.adaptivePredict(self._input,44,self._ctx)
                if la_ == 1:
                    self.state = 250
                    self.space()


                self.state = 253
                self.expressions()


            self.state = 256
            self.match(bashGrammarParser.FI)
            self.state = 258
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,46,self._ctx)
            if la_ == 1:
                self.state = 257
                self.space()


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Function_defContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def FUNCTION(self):
            return self.getToken(bashGrammarParser.FUNCTION, 0)

        def VAR(self):
            return self.getToken(bashGrammarParser.VAR, 0)

        def OPEN_PAR(self):
            return self.getToken(bashGrammarParser.OPEN_PAR, 0)

        def CLOSE_PAR(self):
            return self.getToken(bashGrammarParser.CLOSE_PAR, 0)

        def OPEN_CUR(self):
            return self.getToken(bashGrammarParser.OPEN_CUR, 0)

        def expressions(self):
            return self.getTypedRuleContext(bashGrammarParser.ExpressionsContext,0)


        def CLOSE_CUR(self):
            return self.getToken(bashGrammarParser.CLOSE_CUR, 0)

        def space(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(bashGrammarParser.SpaceContext)
            else:
                return self.getTypedRuleContext(bashGrammarParser.SpaceContext,i)


        def getRuleIndex(self):
            return bashGrammarParser.RULE_function_def

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFunction_def" ):
                listener.enterFunction_def(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFunction_def" ):
                listener.exitFunction_def(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitFunction_def" ):
                return visitor.visitFunction_def(self)
            else:
                return visitor.visitChildren(self)




    def function_def(self):

        localctx = bashGrammarParser.Function_defContext(self, self._ctx, self.state)
        self.enterRule(localctx, 16, self.RULE_function_def)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 260
            self.match(bashGrammarParser.FUNCTION)
            self.state = 262
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==bashGrammarParser.SPACE:
                self.state = 261
                self.space()


            self.state = 264
            self.match(bashGrammarParser.VAR)
            self.state = 266
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==bashGrammarParser.SPACE:
                self.state = 265
                self.space()


            self.state = 268
            self.match(bashGrammarParser.OPEN_PAR)
            self.state = 270
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==bashGrammarParser.SPACE:
                self.state = 269
                self.space()


            self.state = 272
            self.match(bashGrammarParser.CLOSE_PAR)
            self.state = 274
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==bashGrammarParser.SPACE:
                self.state = 273
                self.space()


            self.state = 276
            self.match(bashGrammarParser.OPEN_CUR)
            self.state = 278
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,51,self._ctx)
            if la_ == 1:
                self.state = 277
                self.space()


            self.state = 280
            self.expressions()
            self.state = 282
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==bashGrammarParser.SPACE:
                self.state = 281
                self.space()


            self.state = 284
            self.match(bashGrammarParser.CLOSE_CUR)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Function_callContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def VAR(self):
            return self.getToken(bashGrammarParser.VAR, 0)

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
            return bashGrammarParser.RULE_function_call

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFunction_call" ):
                listener.enterFunction_call(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFunction_call" ):
                listener.exitFunction_call(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitFunction_call" ):
                return visitor.visitFunction_call(self)
            else:
                return visitor.visitChildren(self)




    def function_call(self):

        localctx = bashGrammarParser.Function_callContext(self, self._ctx, self.state)
        self.enterRule(localctx, 18, self.RULE_function_call)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 286
            self.match(bashGrammarParser.VAR)
            self.state = 288
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,53,self._ctx)
            if la_ == 1:
                self.state = 287
                self.space()


            self.state = 293
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,54,self._ctx)
            while _alt!=1 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1+1:
                    self.state = 290
                    self.command_data() 
                self.state = 295
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,54,self._ctx)

            self.state = 297
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==bashGrammarParser.SEMICOLON:
                self.state = 296
                self.match(bashGrammarParser.SEMICOLON)


            self.state = 300
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,56,self._ctx)
            if la_ == 1:
                self.state = 299
                self.space()


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Multi_conditionsContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def open_bracket(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(bashGrammarParser.Open_bracketContext)
            else:
                return self.getTypedRuleContext(bashGrammarParser.Open_bracketContext,i)


        def condition(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(bashGrammarParser.ConditionContext)
            else:
                return self.getTypedRuleContext(bashGrammarParser.ConditionContext,i)


        def close_bracket(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(bashGrammarParser.Close_bracketContext)
            else:
                return self.getTypedRuleContext(bashGrammarParser.Close_bracketContext,i)


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

        def getRuleIndex(self):
            return bashGrammarParser.RULE_multi_conditions

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterMulti_conditions" ):
                listener.enterMulti_conditions(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitMulti_conditions" ):
                listener.exitMulti_conditions(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitMulti_conditions" ):
                return visitor.visitMulti_conditions(self)
            else:
                return visitor.visitChildren(self)




    def multi_conditions(self):

        localctx = bashGrammarParser.Multi_conditionsContext(self, self._ctx, self.state)
        self.enterRule(localctx, 20, self.RULE_multi_conditions)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 302
            self.open_bracket()
            self.state = 303
            self.open_bracket()
            self.state = 305
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,57,self._ctx)
            if la_ == 1:
                self.state = 304
                self.space()


            self.state = 307
            self.condition()
            self.state = 315
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,59,self._ctx)
            while _alt!=1 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1+1:
                    self.state = 308
                    self.match(bashGrammarParser.LOGICAL_OP)
                    self.state = 310
                    self._errHandler.sync(self)
                    la_ = self._interp.adaptivePredict(self._input,58,self._ctx)
                    if la_ == 1:
                        self.state = 309
                        self.space()


                    self.state = 312
                    self.condition() 
                self.state = 317
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,59,self._ctx)

            self.state = 318
            self.close_bracket()
            self.state = 319
            self.close_bracket()
            self.state = 321
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,60,self._ctx)
            if la_ == 1:
                self.state = 320
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
        self.enterRule(localctx, 22, self.RULE_condition)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 324
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==bashGrammarParser.SPACE:
                self.state = 323
                self.space()


            self.state = 327 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 326
                _la = self._input.LA(1)
                if not((((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << bashGrammarParser.VAR) | (1 << bashGrammarParser.VAL) | (1 << bashGrammarParser.BLOB))) != 0)):
                    self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()
                self.state = 329 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not ((((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << bashGrammarParser.VAR) | (1 << bashGrammarParser.VAL) | (1 << bashGrammarParser.BLOB))) != 0)):
                    break

            self.state = 332
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==bashGrammarParser.SPACE:
                self.state = 331
                self.space()


            self.state = 334
            self.match(bashGrammarParser.COMPARE)
            self.state = 336
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==bashGrammarParser.SPACE:
                self.state = 335
                self.space()


            self.state = 345 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 345
                self._errHandler.sync(self)
                la_ = self._interp.adaptivePredict(self._input,65,self._ctx)
                if la_ == 1:
                    self.state = 338
                    self.string()
                    pass

                elif la_ == 2:
                    self.state = 339
                    self.match(bashGrammarParser.VAR)
                    pass

                elif la_ == 3:
                    self.state = 340
                    self.match(bashGrammarParser.VAL)
                    pass

                elif la_ == 4:
                    self.state = 341
                    self.match(bashGrammarParser.BLOB)
                    pass

                elif la_ == 5:
                    self.state = 342
                    self.match(bashGrammarParser.BASH_VAR)
                    pass

                elif la_ == 6:
                    self.state = 343
                    self.match(bashGrammarParser.RHS_ASSIGNMENT)
                    pass

                elif la_ == 7:
                    self.state = 344
                    self.match(bashGrammarParser.BLOB)
                    pass


                self.state = 347 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not ((((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << bashGrammarParser.RHS_ASSIGNMENT) | (1 << bashGrammarParser.SINGLE_STRING) | (1 << bashGrammarParser.DOUBLE_STRING) | (1 << bashGrammarParser.VAR) | (1 << bashGrammarParser.BASH_VAR) | (1 << bashGrammarParser.VAL) | (1 << bashGrammarParser.BLOB))) != 0)):
                    break

            self.state = 350
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==bashGrammarParser.SPACE:
                self.state = 349
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
        self.enterRule(localctx, 24, self.RULE_linux_command)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 352
            self.match(bashGrammarParser.COMMAND)
            self.state = 354
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,68,self._ctx)
            if la_ == 1:
                self.state = 353
                self.space()


            self.state = 359
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,69,self._ctx)
            while _alt!=1 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1+1:
                    self.state = 356
                    self.command_data() 
                self.state = 361
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,69,self._ctx)

            self.state = 363
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==bashGrammarParser.SEMICOLON:
                self.state = 362
                self.match(bashGrammarParser.SEMICOLON)


            self.state = 366
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,71,self._ctx)
            if la_ == 1:
                self.state = 365
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
        self.enterRule(localctx, 26, self.RULE_assignment)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 368
            self.match(bashGrammarParser.VAR)
            self.state = 369
            self.match(bashGrammarParser.ASSIGN)
            self.state = 376 
            self._errHandler.sync(self)
            _alt = 1
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt == 1:
                    self.state = 376
                    self._errHandler.sync(self)
                    token = self._input.LA(1)
                    if token in [bashGrammarParser.SINGLE_STRING, bashGrammarParser.DOUBLE_STRING]:
                        self.state = 370
                        self.string()
                        pass
                    elif token in [bashGrammarParser.VAL]:
                        self.state = 371
                        self.match(bashGrammarParser.VAL)
                        pass
                    elif token in [bashGrammarParser.VAR]:
                        self.state = 372
                        self.match(bashGrammarParser.VAR)
                        pass
                    elif token in [bashGrammarParser.BASH_VAR]:
                        self.state = 373
                        self.match(bashGrammarParser.BASH_VAR)
                        pass
                    elif token in [bashGrammarParser.RHS_ASSIGNMENT]:
                        self.state = 374
                        self.match(bashGrammarParser.RHS_ASSIGNMENT)
                        pass
                    elif token in [bashGrammarParser.BLOB]:
                        self.state = 375
                        self.match(bashGrammarParser.BLOB)
                        pass
                    else:
                        raise NoViableAltException(self)


                else:
                    raise NoViableAltException(self)
                self.state = 378 
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,73,self._ctx)

            self.state = 381
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,74,self._ctx)
            if la_ == 1:
                self.state = 380
                self.match(bashGrammarParser.SEMICOLON)


            self.state = 384
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,75,self._ctx)
            if la_ == 1:
                self.state = 383
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

        def open_bracket(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(bashGrammarParser.Open_bracketContext)
            else:
                return self.getTypedRuleContext(bashGrammarParser.Open_bracketContext,i)


        def VAR(self, i:int=None):
            if i is None:
                return self.getTokens(bashGrammarParser.VAR)
            else:
                return self.getToken(bashGrammarParser.VAR, i)

        def close_bracket(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(bashGrammarParser.Close_bracketContext)
            else:
                return self.getTypedRuleContext(bashGrammarParser.Close_bracketContext,i)


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
        self.enterRule(localctx, 28, self.RULE_advanced_assignment)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 386
            self.open_bracket()
            self.state = 387
            self.open_bracket()
            self.state = 389
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==bashGrammarParser.SPACE:
                self.state = 388
                self.space()


            self.state = 391
            self.match(bashGrammarParser.VAR)
            self.state = 393
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==bashGrammarParser.SPACE:
                self.state = 392
                self.space()


            self.state = 395
            _la = self._input.LA(1)
            if not(_la==bashGrammarParser.ASSIGN or _la==bashGrammarParser.INCREMENT):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
            self.state = 397
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,78,self._ctx)
            if la_ == 1:
                self.state = 396
                self.space()


            self.state = 407
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << bashGrammarParser.RHS_ASSIGNMENT) | (1 << bashGrammarParser.SINGLE_STRING) | (1 << bashGrammarParser.DOUBLE_STRING) | (1 << bashGrammarParser.VAR) | (1 << bashGrammarParser.BASH_VAR) | (1 << bashGrammarParser.VAL) | (1 << bashGrammarParser.BLOB))) != 0):
                self.state = 405
                self._errHandler.sync(self)
                token = self._input.LA(1)
                if token in [bashGrammarParser.SINGLE_STRING, bashGrammarParser.DOUBLE_STRING]:
                    self.state = 399
                    self.string()
                    pass
                elif token in [bashGrammarParser.VAL]:
                    self.state = 400
                    self.match(bashGrammarParser.VAL)
                    pass
                elif token in [bashGrammarParser.VAR]:
                    self.state = 401
                    self.match(bashGrammarParser.VAR)
                    pass
                elif token in [bashGrammarParser.BASH_VAR]:
                    self.state = 402
                    self.match(bashGrammarParser.BASH_VAR)
                    pass
                elif token in [bashGrammarParser.RHS_ASSIGNMENT]:
                    self.state = 403
                    self.match(bashGrammarParser.RHS_ASSIGNMENT)
                    pass
                elif token in [bashGrammarParser.BLOB]:
                    self.state = 404
                    self.match(bashGrammarParser.BLOB)
                    pass
                else:
                    raise NoViableAltException(self)

                self.state = 409
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 411
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==bashGrammarParser.SPACE:
                self.state = 410
                self.space()


            self.state = 413
            self.close_bracket()
            self.state = 414
            self.close_bracket()
            self.state = 416
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==bashGrammarParser.SEMICOLON:
                self.state = 415
                self.match(bashGrammarParser.SEMICOLON)


            self.state = 419
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,83,self._ctx)
            if la_ == 1:
                self.state = 418
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

        def string(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(bashGrammarParser.StringContext)
            else:
                return self.getTypedRuleContext(bashGrammarParser.StringContext,i)


        def INCREMENT(self, i:int=None):
            if i is None:
                return self.getTokens(bashGrammarParser.INCREMENT)
            else:
                return self.getToken(bashGrammarParser.INCREMENT, i)

        def OTHER(self, i:int=None):
            if i is None:
                return self.getTokens(bashGrammarParser.OTHER)
            else:
                return self.getToken(bashGrammarParser.OTHER, i)

        def space(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(bashGrammarParser.SpaceContext)
            else:
                return self.getTypedRuleContext(bashGrammarParser.SpaceContext,i)


        def sed_flag(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(bashGrammarParser.Sed_flagContext)
            else:
                return self.getTypedRuleContext(bashGrammarParser.Sed_flagContext,i)


        def FILENAME(self, i:int=None):
            if i is None:
                return self.getTokens(bashGrammarParser.FILENAME)
            else:
                return self.getToken(bashGrammarParser.FILENAME, i)

        def WEBSITE(self, i:int=None):
            if i is None:
                return self.getTokens(bashGrammarParser.WEBSITE)
            else:
                return self.getToken(bashGrammarParser.WEBSITE, i)

        def RHS_ASSIGNMENT(self, i:int=None):
            if i is None:
                return self.getTokens(bashGrammarParser.RHS_ASSIGNMENT)
            else:
                return self.getToken(bashGrammarParser.RHS_ASSIGNMENT, i)

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
        self.enterRule(localctx, 30, self.RULE_command_data)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 433 
            self._errHandler.sync(self)
            _alt = 1
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt == 1:
                    self.state = 433
                    self._errHandler.sync(self)
                    la_ = self._interp.adaptivePredict(self._input,84,self._ctx)
                    if la_ == 1:
                        self.state = 421
                        self.match(bashGrammarParser.VAR)
                        pass

                    elif la_ == 2:
                        self.state = 422
                        self.match(bashGrammarParser.VAL)
                        pass

                    elif la_ == 3:
                        self.state = 423
                        self.match(bashGrammarParser.BLOB)
                        pass

                    elif la_ == 4:
                        self.state = 424
                        self.match(bashGrammarParser.BASH_VAR)
                        pass

                    elif la_ == 5:
                        self.state = 425
                        self.string()
                        pass

                    elif la_ == 6:
                        self.state = 426
                        self.match(bashGrammarParser.INCREMENT)
                        pass

                    elif la_ == 7:
                        self.state = 427
                        self.match(bashGrammarParser.OTHER)
                        pass

                    elif la_ == 8:
                        self.state = 428
                        self.space()
                        pass

                    elif la_ == 9:
                        self.state = 429
                        self.sed_flag()
                        pass

                    elif la_ == 10:
                        self.state = 430
                        self.match(bashGrammarParser.FILENAME)
                        pass

                    elif la_ == 11:
                        self.state = 431
                        self.match(bashGrammarParser.WEBSITE)
                        pass

                    elif la_ == 12:
                        self.state = 432
                        self.match(bashGrammarParser.RHS_ASSIGNMENT)
                        pass



                else:
                    raise NoViableAltException(self)
                self.state = 435 
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,85,self._ctx)

            self.state = 438
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,86,self._ctx)
            if la_ == 1:
                self.state = 437
                self.space()


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
        self.enterRule(localctx, 32, self.RULE_comparison)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 440
            self.match(bashGrammarParser.VAR)
            self.state = 441
            self.match(bashGrammarParser.COMPARE)
            self.state = 442
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
        self.enterRule(localctx, 34, self.RULE_increment)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 455
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [bashGrammarParser.VAR]:
                self.state = 444
                self.match(bashGrammarParser.VAR)
                self.state = 445
                self.match(bashGrammarParser.INCREMENT)
                self.state = 451
                self._errHandler.sync(self)
                token = self._input.LA(1)
                if token in [bashGrammarParser.BLOB]:
                    self.state = 446
                    self.match(bashGrammarParser.BLOB)
                    pass
                elif token in [bashGrammarParser.VAR]:
                    self.state = 447
                    self.match(bashGrammarParser.VAR)
                    pass
                elif token in [bashGrammarParser.VAL]:
                    self.state = 448
                    self.match(bashGrammarParser.VAL)
                    pass
                elif token in [bashGrammarParser.SINGLE_STRING, bashGrammarParser.DOUBLE_STRING]:
                    self.state = 449
                    self.string()
                    pass
                elif token in [bashGrammarParser.BASH_VAR]:
                    self.state = 450
                    self.match(bashGrammarParser.BASH_VAR)
                    pass
                elif token in [bashGrammarParser.T__0, bashGrammarParser.CLOSE_PAR, bashGrammarParser.CLOSE_CUR, bashGrammarParser.CLOSE_BOX, bashGrammarParser.SPACE]:
                    pass
                else:
                    pass
                pass
            elif token in [bashGrammarParser.INCREMENT]:
                self.state = 453
                self.match(bashGrammarParser.INCREMENT)
                self.state = 454
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


    class Open_bracketContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def OPEN_PAR(self):
            return self.getToken(bashGrammarParser.OPEN_PAR, 0)

        def OPEN_CUR(self):
            return self.getToken(bashGrammarParser.OPEN_CUR, 0)

        def OPEN_BOX(self):
            return self.getToken(bashGrammarParser.OPEN_BOX, 0)

        def getRuleIndex(self):
            return bashGrammarParser.RULE_open_bracket

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterOpen_bracket" ):
                listener.enterOpen_bracket(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitOpen_bracket" ):
                listener.exitOpen_bracket(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitOpen_bracket" ):
                return visitor.visitOpen_bracket(self)
            else:
                return visitor.visitChildren(self)




    def open_bracket(self):

        localctx = bashGrammarParser.Open_bracketContext(self, self._ctx, self.state)
        self.enterRule(localctx, 36, self.RULE_open_bracket)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 457
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << bashGrammarParser.OPEN_PAR) | (1 << bashGrammarParser.OPEN_CUR) | (1 << bashGrammarParser.OPEN_BOX))) != 0)):
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


    class Close_bracketContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def CLOSE_PAR(self):
            return self.getToken(bashGrammarParser.CLOSE_PAR, 0)

        def CLOSE_CUR(self):
            return self.getToken(bashGrammarParser.CLOSE_CUR, 0)

        def CLOSE_BOX(self):
            return self.getToken(bashGrammarParser.CLOSE_BOX, 0)

        def getRuleIndex(self):
            return bashGrammarParser.RULE_close_bracket

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterClose_bracket" ):
                listener.enterClose_bracket(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitClose_bracket" ):
                listener.exitClose_bracket(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitClose_bracket" ):
                return visitor.visitClose_bracket(self)
            else:
                return visitor.visitChildren(self)




    def close_bracket(self):

        localctx = bashGrammarParser.Close_bracketContext(self, self._ctx, self.state)
        self.enterRule(localctx, 38, self.RULE_close_bracket)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 459
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << bashGrammarParser.CLOSE_PAR) | (1 << bashGrammarParser.CLOSE_CUR) | (1 << bashGrammarParser.CLOSE_BOX))) != 0)):
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
        self.enterRule(localctx, 40, self.RULE_sed_flag)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 461
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
        self.enterRule(localctx, 42, self.RULE_sed)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 463
            self.match(bashGrammarParser.SED)
            self.state = 464
            self.space()
            self.state = 471
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==bashGrammarParser.SED_FLAG or _la==bashGrammarParser.VAL:
                self.state = 465
                self.sed_flag()
                self.state = 467
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==bashGrammarParser.SPACE:
                    self.state = 466
                    self.match(bashGrammarParser.SPACE)


                self.state = 473
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 474
            self.string()
            self.state = 475
            self.space()
            self.state = 476
            _la = self._input.LA(1)
            if not(_la==bashGrammarParser.VAR or _la==bashGrammarParser.FILENAME):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
            self.state = 477
            self.space()
            self.state = 481
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,91,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    self.state = 478
                    self.match(bashGrammarParser.COMPARE) 
                self.state = 483
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,91,self._ctx)

            self.state = 487
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==bashGrammarParser.SPACE:
                self.state = 484
                self.match(bashGrammarParser.SPACE)
                self.state = 489
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 493
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==bashGrammarParser.VAR or _la==bashGrammarParser.FILENAME:
                self.state = 490
                _la = self._input.LA(1)
                if not(_la==bashGrammarParser.VAR or _la==bashGrammarParser.FILENAME):
                    self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()
                self.state = 495
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 496
            self.match(bashGrammarParser.COMPARE)
            self.state = 500
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==bashGrammarParser.SPACE:
                self.state = 497
                self.match(bashGrammarParser.SPACE)
                self.state = 502
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 503
            _la = self._input.LA(1)
            if not(_la==bashGrammarParser.VAR or _la==bashGrammarParser.FILENAME):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
            self.state = 505
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==bashGrammarParser.SEMICOLON:
                self.state = 504
                self.match(bashGrammarParser.SEMICOLON)


            self.state = 508
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,96,self._ctx)
            if la_ == 1:
                self.state = 507
                self.space()


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
        self.enterRule(localctx, 44, self.RULE_space)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 511 
            self._errHandler.sync(self)
            _alt = 1
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt == 1:
                    self.state = 510
                    self.match(bashGrammarParser.SPACE)

                else:
                    raise NoViableAltException(self)
                self.state = 513 
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,97,self._ctx)

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
        self.enterRule(localctx, 46, self.RULE_string)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 515
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





