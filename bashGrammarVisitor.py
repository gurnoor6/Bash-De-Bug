# Generated from bashGrammar.g4 by ANTLR 4.8
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .bashGrammarParser import bashGrammarParser
else:
    from bashGrammarParser import bashGrammarParser

# This class defines a complete generic visitor for a parse tree produced by bashGrammarParser.

class bashGrammarVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by bashGrammarParser#code.
    def visitCode(self, ctx:bashGrammarParser.CodeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by bashGrammarParser#bashScript.
    def visitBashScript(self, ctx:bashGrammarParser.BashScriptContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by bashGrammarParser#for_loop.
    def visitFor_loop(self, ctx:bashGrammarParser.For_loopContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by bashGrammarParser#inside_for.
    def visitInside_for(self, ctx:bashGrammarParser.Inside_forContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by bashGrammarParser#linux_command.
    def visitLinux_command(self, ctx:bashGrammarParser.Linux_commandContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by bashGrammarParser#assignment.
    def visitAssignment(self, ctx:bashGrammarParser.AssignmentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by bashGrammarParser#advanced_assignment.
    def visitAdvanced_assignment(self, ctx:bashGrammarParser.Advanced_assignmentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by bashGrammarParser#command_data.
    def visitCommand_data(self, ctx:bashGrammarParser.Command_dataContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by bashGrammarParser#comparison.
    def visitComparison(self, ctx:bashGrammarParser.ComparisonContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by bashGrammarParser#increment.
    def visitIncrement(self, ctx:bashGrammarParser.IncrementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by bashGrammarParser#space.
    def visitSpace(self, ctx:bashGrammarParser.SpaceContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by bashGrammarParser#string.
    def visitString(self, ctx:bashGrammarParser.StringContext):
        return self.visitChildren(ctx)



del bashGrammarParser