import sys
from antlr4 import *
from bashGrammarParser import bashGrammarParser
from bashGrammarVisitor import bashGrammarVisitor

var = []

class fileBashListener(bashGrammarVisitor):
	def __init__(self):
		pass

	def visitCode(self, ctx:bashGrammarParser.CodeContext):
		print("visited code")
		self.visitChildren(ctx)
		return var

	def visitAssignment(self, ctx:bashGrammarParser.AssignmentContext):
		print("visited assignment")
		global var
		var+=[ctx.VAR(0).getText()]
		interval = ctx.start
		print(interval.line, interval.column)
		return self.visitChildren(ctx)

