grammar bashGrammar;

/*
	parser
*/

code				: 	bashScript* EOF;

bashScript			:	(for_loop | assignment | linux_command | space | advanced_assignment | ifElse)+;

expressions			:	(for_loop | assignment | linux_command | advanced_assignment | ifElse)* space?;

for_loop 			:	FOR space? OPEN_BRACKETS inside_for CLOSE_BRACKETS space? SEMICOLON? space? DO space? expressions DONE space?;

inside_for			:	(assignment SEMICOLON space? comparison SEMICOLON space? increment space?);

ifElse				:	IF space? OPEN_BRACKETS space? condition (LOGICAL_OP space? condition)*? CLOSE_BRACKETS space? SEMICOLON? space? THEN space?
							expressions
						(ELIF space? OPEN_BRACKETS space? condition (LOGICAL_OP condition)*? CLOSE_BRACKETS space? SEMICOLON? space? THEN space?
							expressions
						)*
						ELSE space?
							expressions
						FI space?
						;

condition			:	space? (VAR | VAL | BLOB)+ space? COMPARE space? (string | VAR | VAL | BLOB | BASH_VAR | RHS_ASSIGNMENT | BLOB)+ space?;  


linux_command		: 	COMMAND space? (VAR | VAL | BLOB | BASH_VAR | string)*?  SEMICOLON? space?;

assignment			:	VAR ASSIGN (string | VAL | VAR | BASH_VAR | RHS_ASSIGNMENT | BLOB)+ SEMICOLON? space?;

advanced_assignment :	OPEN_BRACKETS space? VAR space? (ASSIGN | INCREMENT) space? (string | VAL | VAR | BASH_VAR | RHS_ASSIGNMENT | BLOB)+ space? CLOSE_BRACKETS SEMICOLON? space?;

command_data 		: 	(BLOB | string | BASH_VAR | VAR | VAL | space | OTHER);

comparison			:	VAR COMPARE VAL;

increment			:	(VAR INCREMENT | INCREMENT VAR) ;

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

IF					: 'if';

THEN				: 'then';

ELIF				: 'elif';

ELSE				: 'else';

FI					: 'fi';

FOR					: 'for';

DO 					: 'do';

DONE 				: 'done';

COMMAND 			: ('echo' | 'cat' | 'ls' | 'll' | 'time' | 'wget');

// keeping a not ; inside the expression to differentiate it from the for loop one
RHS_ASSIGNMENT		: ('${'.*?'}' | '$('[a-zA-Z0-9@!$^%*&+-.]+')');

OPEN_BRACKETS	: ('((' | '[[');

CLOSE_BRACKETS	: ('))' | ']]');

VAR					: [a-zA-Z_] [a-zA-Z_0-9]*;

// can be used in echo, other variable assignments
BASH_VAR			: '$' VAR;

VAL					: '-'? [A-Za-z0-9]+;

ASSIGN				: '=';

SEMICOLON			: ';';

LOGICAL_OP			: ('||' | '&&');

INCREMENT 			: ('++' | '--' | '+=' | '-=' | '/=' | '*=');

COMPARE 			: ('<=' | '>=' | '<' | '>' | '==');

BLOB                : [a-zA-Z0-9@!$^%*&+-.]+?;

OTHER 				: .;


