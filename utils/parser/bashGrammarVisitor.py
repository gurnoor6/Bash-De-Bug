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


    # Visit a parse tree produced by bashGrammarParser#expressions.
    def visitExpressions(self, ctx:bashGrammarParser.ExpressionsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by bashGrammarParser#loops.
    def visitLoops(self, ctx:bashGrammarParser.LoopsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by bashGrammarParser#while_loop.
    def visitWhile_loop(self, ctx:bashGrammarParser.While_loopContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by bashGrammarParser#for_loop.
    def visitFor_loop(self, ctx:bashGrammarParser.For_loopContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by bashGrammarParser#inside_for.
    def visitInside_for(self, ctx:bashGrammarParser.Inside_forContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by bashGrammarParser#ifElse.
    def visitIfElse(self, ctx:bashGrammarParser.IfElseContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by bashGrammarParser#function_def.
    def visitFunction_def(self, ctx:bashGrammarParser.Function_defContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by bashGrammarParser#function_call.
    def visitFunction_call(self, ctx:bashGrammarParser.Function_callContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by bashGrammarParser#multi_conditions.
    def visitMulti_conditions(self, ctx:bashGrammarParser.Multi_conditionsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by bashGrammarParser#condition.
    def visitCondition(self, ctx:bashGrammarParser.ConditionContext):
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


    # Visit a parse tree produced by bashGrammarParser#open_bracket.
    def visitOpen_bracket(self, ctx:bashGrammarParser.Open_bracketContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by bashGrammarParser#close_bracket.
    def visitClose_bracket(self, ctx:bashGrammarParser.Close_bracketContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by bashGrammarParser#sed_flag.
    def visitSed_flag(self, ctx:bashGrammarParser.Sed_flagContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by bashGrammarParser#sed.
    def visitSed(self, ctx:bashGrammarParser.SedContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by bashGrammarParser#space.
    def visitSpace(self, ctx:bashGrammarParser.SpaceContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by bashGrammarParser#string.
    def visitString(self, ctx:bashGrammarParser.StringContext):
        return self.visitChildren(ctx)



del bashGrammarParser