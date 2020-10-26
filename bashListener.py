import sys
from antlr4 import *
from rulesParser import rulesParser
from rulesListener import rulesListener

class fileBashListener(rulesListener):
	def __init__(self):
		pass

	def enterLine(self, ctx:rulesParser.LineContext):
		v = ctx.assign(0).VAR(0)
		print(v)
	# Exit a parse tree produced by rulesParser#assign.
	def exitLine(self, ctx:rulesParser.LineContext):
		pass