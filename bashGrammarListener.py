# Generated from bashGrammar.g4 by ANTLR 4.8
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .bashGrammarParser import bashGrammarParser
else:
    from bashGrammarParser import bashGrammarParser

# This class defines a complete listener for a parse tree produced by bashGrammarParser.
class bashGrammarListener(ParseTreeListener):

    # Enter a parse tree produced by bashGrammarParser#code.
    def enterCode(self, ctx:bashGrammarParser.CodeContext):
        pass

    # Exit a parse tree produced by bashGrammarParser#code.
    def exitCode(self, ctx:bashGrammarParser.CodeContext):
        pass


    # Enter a parse tree produced by bashGrammarParser#bashScript.
    def enterBashScript(self, ctx:bashGrammarParser.BashScriptContext):
        pass

    # Exit a parse tree produced by bashGrammarParser#bashScript.
    def exitBashScript(self, ctx:bashGrammarParser.BashScriptContext):
        pass


    # Enter a parse tree produced by bashGrammarParser#for_loop.
    def enterFor_loop(self, ctx:bashGrammarParser.For_loopContext):
        pass

    # Exit a parse tree produced by bashGrammarParser#for_loop.
    def exitFor_loop(self, ctx:bashGrammarParser.For_loopContext):
        pass


    # Enter a parse tree produced by bashGrammarParser#inside_for.
    def enterInside_for(self, ctx:bashGrammarParser.Inside_forContext):
        pass

    # Exit a parse tree produced by bashGrammarParser#inside_for.
    def exitInside_for(self, ctx:bashGrammarParser.Inside_forContext):
        pass


    # Enter a parse tree produced by bashGrammarParser#linux_command.
    def enterLinux_command(self, ctx:bashGrammarParser.Linux_commandContext):
        pass

    # Exit a parse tree produced by bashGrammarParser#linux_command.
    def exitLinux_command(self, ctx:bashGrammarParser.Linux_commandContext):
        pass


    # Enter a parse tree produced by bashGrammarParser#assignment.
    def enterAssignment(self, ctx:bashGrammarParser.AssignmentContext):
        pass

    # Exit a parse tree produced by bashGrammarParser#assignment.
    def exitAssignment(self, ctx:bashGrammarParser.AssignmentContext):
        pass


    # Enter a parse tree produced by bashGrammarParser#command_data.
    def enterCommand_data(self, ctx:bashGrammarParser.Command_dataContext):
        pass

    # Exit a parse tree produced by bashGrammarParser#command_data.
    def exitCommand_data(self, ctx:bashGrammarParser.Command_dataContext):
        pass


    # Enter a parse tree produced by bashGrammarParser#comparison.
    def enterComparison(self, ctx:bashGrammarParser.ComparisonContext):
        pass

    # Exit a parse tree produced by bashGrammarParser#comparison.
    def exitComparison(self, ctx:bashGrammarParser.ComparisonContext):
        pass


    # Enter a parse tree produced by bashGrammarParser#increment.
    def enterIncrement(self, ctx:bashGrammarParser.IncrementContext):
        pass

    # Exit a parse tree produced by bashGrammarParser#increment.
    def exitIncrement(self, ctx:bashGrammarParser.IncrementContext):
        pass


    # Enter a parse tree produced by bashGrammarParser#space.
    def enterSpace(self, ctx:bashGrammarParser.SpaceContext):
        pass

    # Exit a parse tree produced by bashGrammarParser#space.
    def exitSpace(self, ctx:bashGrammarParser.SpaceContext):
        pass


    # Enter a parse tree produced by bashGrammarParser#string.
    def enterString(self, ctx:bashGrammarParser.StringContext):
        pass

    # Exit a parse tree produced by bashGrammarParser#string.
    def exitString(self, ctx:bashGrammarParser.StringContext):
        pass



del bashGrammarParser