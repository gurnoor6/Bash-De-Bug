grammar bashGrammar;

/*
	parser
*/

code		: 	bashScript* EOF;

bashScript	:	(for_loop | assignment)+;

for_loop 	:	FOR OPEN_FOR_BRACKET inside_for CLOSE_FOR_BRACKET space? DO space? assignment+ space? DONE space?;

inside_for	:	(assignment SEMICOLON comparison SEMICOLON increment);

assignment	:	VAR EQUALS (string | VAL | VAR) SEMICOLON? space?;

comparison	:	VAR COMPARE VAL;

increment	:	VAR INCREMENT;

space 		:	SPACE+;

string 		:	(SINGLE_STRING | DOUBLE_STRING);



/*
 	lexer tokens
 	specific tokens should remain above the general ones
 	for example, for and do done are above var,val
 	else there will be a mis match
*/
SINGLE_STRING		: '\'' ~('\'')+ '\'';

DOUBLE_STRING		: '"' ~('"')+ '"';

COMMENT				: '#' ~[\r\n]* -> skip;

SPACE				: [ \t\r\n];

FOR					: 'for';

DO 					: 'do';

DONE 				: 'done';

OPEN_FOR_BRACKET	: ('((' | '[[');

CLOSE_FOR_BRACKET	: ('))' | ']]');

VAR					: [a-zA-Z_] [a-zA-Z_0-9]*;

VAL					: [A-Za-z0-9]+;

EQUALS				: '=';

SEMICOLON			: ';';

INCREMENT 			: ('++' | '--');

COMPARE 			: ('<=' | '>=' | '<' | '>');


