import sys
from antlr4 import *
from bashGrammarParser import bashGrammarParser
from bashGrammarVisitor import bashGrammarVisitor

var = []

class fileBashListener(bashGrammarVisitor):
	def __init__(self):
		pass

	def visitCode(self, ctx:bashGrammarParser.CodeContext):
		# print("visited code")
		self.visitChildren(ctx)
		return var

	def visitAssignment(self, ctx:bashGrammarParser.AssignmentContext):
		global var
		variable = ctx.VAR(0).getText()
		print("variable->",variable)
		line = ctx.start.line
		var+= [(line,variable)]
		return self.visitChildren(ctx)

	def visitLinux_command(self, ctx:bashGrammarParser.Linux_commandContext):
		print("visited linux command -> ", ctx.COMMAND())
		return self.visitChildren(ctx)

