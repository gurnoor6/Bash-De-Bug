# Generated from rules.g4 by ANTLR 4.8
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .rulesParser import rulesParser
else:
    from rulesParser import rulesParser

# This class defines a complete listener for a parse tree produced by rulesParser.
class rulesListener(ParseTreeListener):

    # Enter a parse tree produced by rulesParser#line.
    def enterLine(self, ctx:rulesParser.LineContext):
        pass

    # Exit a parse tree produced by rulesParser#line.
    def exitLine(self, ctx:rulesParser.LineContext):
        pass


    # Enter a parse tree produced by rulesParser#assign.
    def enterAssign(self, ctx:rulesParser.AssignContext):
        pass

    # Exit a parse tree produced by rulesParser#assign.
    def exitAssign(self, ctx:rulesParser.AssignContext):
        pass


    # Enter a parse tree produced by rulesParser#addition.
    def enterAddition(self, ctx:rulesParser.AdditionContext):
        pass

    # Exit a parse tree produced by rulesParser#addition.
    def exitAddition(self, ctx:rulesParser.AdditionContext):
        pass


    # Enter a parse tree produced by rulesParser#strings.
    def enterStrings(self, ctx:rulesParser.StringsContext):
        pass

    # Exit a parse tree produced by rulesParser#strings.
    def exitStrings(self, ctx:rulesParser.StringsContext):
        pass



del rulesParser