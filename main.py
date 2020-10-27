from parser.bashGrammarLexer import bashGrammarLexer
from parser.bashGrammarParser import bashGrammarParser
from parser.bashGrammarVisitor import bashGrammarVisitor
from antlr4 import *
import sys
from bashListener import fileBashListener
from inserter import *

def main(argv):
	input = FileStream(argv[1])
	lexer = bashGrammarLexer(input)
	stream = CommonTokenStream(lexer)
	parser = bashGrammarParser(stream)
	tree = parser.code()
	visitor = fileBashListener()
	value = visitor.visit(tree)
	# inserter("test.sh",value)
	print('=',value)

if __name__=='__main__':
	if len(sys.argv)!=2:
		print("usage: python3 main.py {bash_file_name}")
		exit()
	main(sys.argv)