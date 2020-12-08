import sys
from antlr4 import *
from .parser.bashGrammarParser import bashGrammarParser
from .parser.bashGrammarVisitor import bashGrammarVisitor
from .parser.bashGrammarListener import bashGrammarListener

insert_data = []
var = []
file = []
commands = []
files = []

parent = "main"

class fileBashListener(bashGrammarVisitor):

	def __init__(self, filename):
		global file
		with open(filename) as f:
			file = f.readlines()

	def visitCode(self, ctx:bashGrammarParser.CodeContext):
		global var,file,commands, insert_data,files 
		self.visitChildren(ctx)

		# clearing the global variables here so that they are not affected on next run
		var_local = var
		insert_data_local = insert_data
		commands_local = commands
		files_local = files
		var = []
		insert_data = []
		commands = []
		files = []
		return var_local, insert_data_local, commands_local, files_local

	def visitAssignment(self, ctx:bashGrammarParser.AssignmentContext):
		global var, insert_data
		variable = ctx.VAR(0).getText()
		print("variable->", variable)
		line = ctx.start.line
		var += [(parent, variable, line)]
		insert_data += [((line, -1), f"echo \"At line no. {line}, {variable}=${variable}\"\n")]
		return self.visitChildren(ctx)

	def visitLinux_command(self, ctx:bashGrammarParser.Linux_commandContext):
		global commands
		info  = ""
		info += f"{ctx.COMMAND()}; "
		for item in ctx.tag():
			info += f"{item.getText()} "

		for item in ctx.command_data():
			info += f"{item.getText()} "

		info += f"; line : {ctx.start.line}"

		commands.append(info)

		return self.visitChildren(ctx)

	def visitAdvanced_assignment(self, ctx:bashGrammarParser.Advanced_assignmentContext):
		global var, insert_data
		variable = ctx.VAR(0).getText()
		line = ctx.start.line
		var += [(parent, variable, line)]
		insert_data += [((line, -1), f"echo \"At line no. {line}, {variable}=${variable}\"\n")]
		return self.visitChildren(ctx)

	def visitSed(self, ctx:bashGrammarParser.SedContext):
		global commands,files
		info = f"sed; flags: "
		for item in ctx.tag():
			info+= f"{item.getText()} "

		if ctx.string().getText() != None:
			info += f"{ctx.string().getText()}"

		info += f" line : {ctx.start.line}"
		commands.append(info)

		if ctx.VAR() != None:
			files.append(f"line : {ctx.start.line} : {ctx.VAR()}")

		if ctx.FILENAME() != None:
			files.append(f"line : {ctx.start.line} : {ctx.FILENAME()}")

		return self.visitChildren(ctx)
		
	def visitIncrement(self, ctx:bashGrammarParser.IncrementContext):
		global var, insert_data
		line = ctx.start.line
		variable = ctx.VAR(0).getText()
		insert_data += [((line, -1), f"echo \"At line no. {line}, {variable}=${variable}\"\n")]
		return self.visitChildren(ctx)


	def visitRedirect(self, ctx:bashGrammarParser.RedirectContext):
		global files

		for item in ctx.VAR():
			files.append(f"line : {ctx.start.line} : {item.getText()}")

		for item in ctx.FILENAME():
			files.append(f"line : {ctx.start.line} : {item.getText()}")

		return self.visitChildren(ctx)

	def visitFunction_def(self, ctx:bashGrammarParser.Function_defContext):
		global insert_data, file, parent
		function_name = ctx.VAR().getText()
		parent = function_name
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
		self.visitChildren(ctx)
		parent = "main"
		return

 

	def visitFunction_call(self, ctx:bashGrammarParser.Function_callContext):
		global var, parent
		function = ctx.VAR()
		line = ctx.start.line
		var += [(parent, f"function {function} called", line)]
		return self.visitChildren(ctx)

