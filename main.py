from rulesLexer import rulesLexer
from rulesParser import rulesParser
from antlr4 import *
import sys
from bashListener import fileBashListener


def main(argv):
	input = FileStream(argv[1])
	lexer = rulesLexer(input)
	stream = CommonTokenStream(lexer)
	parser = rulesParser(stream)
	tree = parser.line()

	listener = fileBashListener()
	walker = ParseTreeWalker()
	walker.walk(listener,tree)


if __name__=='__main__':
	main(sys.argv)