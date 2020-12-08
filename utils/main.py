from .parser.bashGrammarLexer import bashGrammarLexer
from .parser.bashGrammarParser import bashGrammarParser
from .parser.bashGrammarVisitor import bashGrammarVisitor
from antlr4 import *
import sys
from .bashListener import fileBashListener

def main(argv):
	input = FileStream(argv[1])
	lexer = bashGrammarLexer(input)
	stream = CommonTokenStream(lexer)
	parser = bashGrammarParser(stream)
	tree = parser.code()
	visitor = fileBashListener(argv[1])
	var,insert_data, commands, files  = visitor.visit(tree)
	var = list(set(var))
	insert_data = list(set(insert_data))
	print("len var = ",len(var), " len insert_data = ", len(insert_data))
	print("=",var)
	for item in insert_data:
		print(item)

def get_vars(filename):
	input = FileStream(filename)
	lexer = bashGrammarLexer(input)
	stream = CommonTokenStream(lexer)
	parser = bashGrammarParser(stream)
	tree = parser.code()
	visitor = fileBashListener(filename)
	
	value, insert_data, commands, files  = visitor.visit(tree)
	value = list(set(value))
	insert_data = list(set(insert_data))
	return value, insert_data,commands, files 

if __name__=='__main__':
	if len(sys.argv)!=2:
		print("usage: python3 main.py {bash_file_name}")
		exit()
	main(sys.argv)