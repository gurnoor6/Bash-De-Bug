grammar bashGrammar;

/*
	parser
*/

code				: 	bashScript* EOF;

bashScript			:	(for_loop | assignment | linux_command | space | advanced_assignment)+;

for_loop 			:	FOR OPEN_FOR_BRACKET inside_for CLOSE_FOR_BRACKET space? DO space? (assignment | linux_command | advanced_assignment)* space? DONE space?;

inside_for			:	(assignment SEMICOLON comparison SEMICOLON increment);

linux_command		: 	COMMAND space? .*?  SEMICOLON? space?;

assignment			:	VAR EQUALS (string | VAL | VAR | BASH_VAR | RHS_ASSIGNMENT | BLOB)+ SEMICOLON? space?;

advanced_assignment :	OPEN_FOR_BRACKET VAR (EQUALS | INCREMENT) (string | VAL | VAR | BASH_VAR | RHS_ASSIGNMENT | BLOB)+ CLOSE_FOR_BRACKET SEMICOLON? space?;

command_data 		: 	(BLOB | string | BASH_VAR | VAR | VAL | space| OTHER);

comparison			:	VAR COMPARE VAL;

increment			:	VAR INCREMENT;

space 				:	SPACE+;

string 				:	(SINGLE_STRING | DOUBLE_STRING);


/*
 	lexer tokens
 	specific tokens should remain above the general ones
 	for example, for and do done are above var,val
 	else there will be a mis match
*/
fragment PLUS 		: '+';

fragment MINUS 		: '-';

fragment MULTIPLY 	: '*';

fragment DIVIDE		: '/';	

fragment OPERATOR	: (PLUS | MINUS | MULTIPLY | DIVIDE);

SINGLE_STRING		: '\'' ~('\'')+ '\'';

DOUBLE_STRING		: '"' ~('"')+ '"';

COMMENT				: '#' ~[\r\n]* -> skip;

SPACE				: [ \t\r\n];

FOR					: 'for';

DO 					: 'do';

DONE 				: 'done';

COMMAND 			: ('echo' | 'cat' | 'ls' | 'll' | 'time' | 'wget');

// keeping a not ; inside the expression to differentiate it from the for loop one
RHS_ASSIGNMENT		: ('${'.*?'}' | '$('[a-zA-Z0-9@!$^%*&+-.]+')');

OPEN_FOR_BRACKET	: ('((' | '[[');

CLOSE_FOR_BRACKET	: ('))' | ']]');

VAR					: [a-zA-Z_] [a-zA-Z_0-9]*;

// can be used in echo, other variable assignments
BASH_VAR			: '$' VAR;

VAL					: [A-Za-z0-9]+;

EQUALS				: '=';

SEMICOLON			: ';';

INCREMENT 			: ('++' | '--' | '+=' | '-=' | '/=' | '*=');

COMPARE 			: ('<=' | '>=' | '<' | '>');

BLOB                : [a-zA-Z0-9@!$^%*&+-.]+?;

OTHER 				: .;


