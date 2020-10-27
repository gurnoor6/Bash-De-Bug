from bashGrammarLexer import bashGrammarLexer
from bashGrammarParser import bashGrammarParser
from bashGrammarVisitor import bashGrammarVisitor
from antlr4 import *
import sys
from bashListener import fileBashListener


def main(argv):
	input = FileStream(argv[1])
	lexer = bashGrammarLexer(input)
	stream = CommonTokenStream(lexer)
	parser = bashGrammarParser(stream)
	tree = parser.code()
	visitor = fileBashListener()
	value = visitor.visit(tree)
	print('=',value)

if __name__=='__main__':
	main(sys.argv)