grammar bashGrammar;

/*
	parser
*/

code		: 	bashScript* EOF;

bashScript	:	assignment+;

assignment	:	VAR EQUALS (string | VAL) SEMICOLON? space?;

space 		:	SPACE+;

string 		:	(SINGLE_STRING | DOUBLE_STRING);


/*
 	lexer tokens
*/
SINGLE_STRING		: '\'' ~('\'')+ '\'';

DOUBLE_STRING		: '"' ~('"')+ '"';

COMMENT				: '#' ~[\r\n]* -> skip;

SPACE				: [ \t\r\n];

VAR					: [a-zA-Z_] [a-zA-Z_0-9]*;

VAL					: [A-Za-z0-9]+;

EQUALS				: '=';

SEMICOLON			: ';';