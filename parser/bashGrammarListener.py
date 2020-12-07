# Generated from bashGrammar.g4 by ANTLR 4.9
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


    # Enter a parse tree produced by bashGrammarParser#expressions.
    def enterExpressions(self, ctx:bashGrammarParser.ExpressionsContext):
        pass

    # Exit a parse tree produced by bashGrammarParser#expressions.
    def exitExpressions(self, ctx:bashGrammarParser.ExpressionsContext):
        pass


    # Enter a parse tree produced by bashGrammarParser#loops.
    def enterLoops(self, ctx:bashGrammarParser.LoopsContext):
        pass

    # Exit a parse tree produced by bashGrammarParser#loops.
    def exitLoops(self, ctx:bashGrammarParser.LoopsContext):
        pass


    # Enter a parse tree produced by bashGrammarParser#while_loop.
    def enterWhile_loop(self, ctx:bashGrammarParser.While_loopContext):
        pass

    # Exit a parse tree produced by bashGrammarParser#while_loop.
    def exitWhile_loop(self, ctx:bashGrammarParser.While_loopContext):
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


    # Enter a parse tree produced by bashGrammarParser#ifElse.
    def enterIfElse(self, ctx:bashGrammarParser.IfElseContext):
        pass

    # Exit a parse tree produced by bashGrammarParser#ifElse.
    def exitIfElse(self, ctx:bashGrammarParser.IfElseContext):
        pass


    # Enter a parse tree produced by bashGrammarParser#function_def.
    def enterFunction_def(self, ctx:bashGrammarParser.Function_defContext):
        pass

    # Exit a parse tree produced by bashGrammarParser#function_def.
    def exitFunction_def(self, ctx:bashGrammarParser.Function_defContext):
        pass


    # Enter a parse tree produced by bashGrammarParser#function_call.
    def enterFunction_call(self, ctx:bashGrammarParser.Function_callContext):
        pass

    # Exit a parse tree produced by bashGrammarParser#function_call.
    def exitFunction_call(self, ctx:bashGrammarParser.Function_callContext):
        pass


    # Enter a parse tree produced by bashGrammarParser#multi_conditions.
    def enterMulti_conditions(self, ctx:bashGrammarParser.Multi_conditionsContext):
        pass

    # Exit a parse tree produced by bashGrammarParser#multi_conditions.
    def exitMulti_conditions(self, ctx:bashGrammarParser.Multi_conditionsContext):
        pass


    # Enter a parse tree produced by bashGrammarParser#condition.
    def enterCondition(self, ctx:bashGrammarParser.ConditionContext):
        pass

    # Exit a parse tree produced by bashGrammarParser#condition.
    def exitCondition(self, ctx:bashGrammarParser.ConditionContext):
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


    # Enter a parse tree produced by bashGrammarParser#advanced_assignment.
    def enterAdvanced_assignment(self, ctx:bashGrammarParser.Advanced_assignmentContext):
        pass

    # Exit a parse tree produced by bashGrammarParser#advanced_assignment.
    def exitAdvanced_assignment(self, ctx:bashGrammarParser.Advanced_assignmentContext):
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


    # Enter a parse tree produced by bashGrammarParser#open_bracket.
    def enterOpen_bracket(self, ctx:bashGrammarParser.Open_bracketContext):
        pass

    # Exit a parse tree produced by bashGrammarParser#open_bracket.
    def exitOpen_bracket(self, ctx:bashGrammarParser.Open_bracketContext):
        pass


    # Enter a parse tree produced by bashGrammarParser#close_bracket.
    def enterClose_bracket(self, ctx:bashGrammarParser.Close_bracketContext):
        pass

    # Exit a parse tree produced by bashGrammarParser#close_bracket.
    def exitClose_bracket(self, ctx:bashGrammarParser.Close_bracketContext):
        pass


    # Enter a parse tree produced by bashGrammarParser#sed_flag.
    def enterSed_flag(self, ctx:bashGrammarParser.Sed_flagContext):
        pass

    # Exit a parse tree produced by bashGrammarParser#sed_flag.
    def exitSed_flag(self, ctx:bashGrammarParser.Sed_flagContext):
        pass


    # Enter a parse tree produced by bashGrammarParser#sed.
    def enterSed(self, ctx:bashGrammarParser.SedContext):
        pass

    # Exit a parse tree produced by bashGrammarParser#sed.
    def exitSed(self, ctx:bashGrammarParser.SedContext):
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