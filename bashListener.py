import sys
from antlr4 import *
from parser.bashGrammarParser import bashGrammarParser
from parser.bashGrammarVisitor import bashGrammarVisitor
from parser.bashGrammarListener import bashGrammarListener

insert_data = []
var = []
file = []

class fileBashListener(bashGrammarVisitor):

	def __init__(self, filename):
		global file
		with open(filename) as f:
			file = f.readlines()

	def visitCode(self, ctx:bashGrammarParser.CodeContext):
		# print("visited code")
		self.visitChildren(ctx)
		return var, insert_data

	def visitAssignment(self, ctx:bashGrammarParser.AssignmentContext):
		global var, insert_data
		variable = ctx.VAR(0).getText()
		print("variable->", variable)
		line = ctx.start.line
		var += [(line, variable)]
		insert_data += [((line, -1), f"echo \"At line no. {line}, {variable}=${variable}\"\n")]

		return self.visitChildren(ctx)

	def visitLinux_command(self, ctx:bashGrammarParser.Linux_commandContext):
		print("visited linux command -> ", ctx.COMMAND())
		return self.visitChildren(ctx)

	def visitAdvanced_assignment(self, ctx:bashGrammarParser.Advanced_assignmentContext):
		global var, insert_data
		variable = ctx.VAR(0).getText()
		line = ctx.start.line
		var += [(line, variable)]
		insert_data += [((line, -1), f"echo \"At line no. {line}, {variable}=${variable}\"\n")]
		return self.visitChildren(ctx)

	def visitSed(self, ctx:bashGrammarParser.SedContext):
		print(" i am here")
		print("ctx: " ,ctx.VAR(1))
		
	def visitIncrement(self, ctx:bashGrammarParser.IncrementContext):
		global var, insert_data
		line = ctx.start.line
		variable = ctx.VAR(0).getText()
		insert_data += [((line, -1), f"echo \"At line no. {line}, {variable}=${variable}\"\n")]
		return self.visitChildren(ctx)

	def visitFunction_def(self, ctx:bashGrammarParser.Function_defContext):
		global insert_data, file
		function_name = ctx.VAR().getText()
		
		start = ctx.start.line
		end = ctx.stop.line
		line_s = start
		line_e = end
		col_e = cole_s = -1

		# print(line_e)
		for line in file[start-1:end]:
			if '{' in line:
				col_s = line.find('{')+1
				break
			line_s += 1

		for line in reversed(file[start-1:end]):
			if '}' in line:
				col_e = line.find('}')
				break
			line_e -= 1

		insert_data += [((line_s, col_s), f"\necho \"Function {function_name} called with args $@\"; echo \"==========\";\n")]
		insert_data += [((line_e, col_e), f"\necho \"==========\"; echo \"Function {function_name} ends\";\n")]

		# print(line_s, col_s)
		# print(line_e, col_e)

		return self.visitChildren(ctx)

