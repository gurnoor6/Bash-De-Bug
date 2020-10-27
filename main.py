from bashGrammarLexer import bashGrammarLexer
from bashGrammarParser import bashGrammarParser
from bashGrammarVisitor import bashGrammarVisitor
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
	main(sys.argv)