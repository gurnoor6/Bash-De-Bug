grammar rules;
/*
*	Parser Rules
*/

line : assign+ ; 
assign : VAR ASSIGNMENT (NUMBER | VAR | STRING) (NEWLINE | SEMICOLON | EOF);
addition : NUMBER PLUS NUMBER;
strings: STRING ;
/*
*	Lexer Rules
*/

fragment DBLQUOTE : '"';
VAR : [a-zA-Z_]+[0-9]*;
NUMBER : [0-9]+ ;
WHITESPACE : [ \t\r]+ -> skip ;
NEWLINE: '\n';
PLUS : '+';
ASSIGNMENT : '=';
STRING: DBLQUOTE .+? DBLQUOTE;
SEMICOLON : ';';
WILDCARD: [a-zA-Z)(] ;