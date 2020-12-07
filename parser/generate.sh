# !bin/bash
java -jar /usr/local/lib/antlr-4.9-complete.jar -Dlanguage=Python3 -visitor bashGrammar.g4;
java -jar /usr/local/lib/antlr-4.9-complete.jar bashGrammar.g4; javac bashGrammar*.java;