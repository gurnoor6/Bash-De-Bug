grammar bashGrammar;

/*
	parser
*/

code				: 	bashScript* EOF;

bashScript			:	(for_loop | assignment | linux_command | space | advanced_assignment | ifElse | sed)+;

expressions			:	(for_loop | assignment | linux_command | advanced_assignment | ifElse)* space?;

for_loop 			:	FOR space? OPEN_BRACKETS space? inside_for CLOSE_BRACKETS space? SEMICOLON? space? DO space? expressions DONE space?;

inside_for			:	(assignment? (',' assignment)* SEMICOLON space? condition? (LOGICAL_OP space? condition)*? SEMICOLON space? increment? (',' increment)* space?);

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


linux_command		: 	COMMAND space? command_data*?  SEMICOLON? space?;

assignment			:	VAR ASSIGN (string | VAL | VAR | BASH_VAR | RHS_ASSIGNMENT | BLOB)+ SEMICOLON? space?;

advanced_assignment :	OPEN_BRACKETS space? VAR space? (ASSIGN | INCREMENT) space? (string | VAL | VAR | BASH_VAR | RHS_ASSIGNMENT | BLOB)* space? CLOSE_BRACKETS SEMICOLON? space?;

command_data 		: 	(VAR | VAL | BLOB | BASH_VAR | string | INCREMENT | OTHER | space | sed_flag | FILENAME | WEBSITE | RHS_ASSIGNMENT);

comparison			:	VAR COMPARE VAL;

increment			:	(VAR INCREMENT (BLOB | VAR | VAL | string | BASH_VAR)? | INCREMENT VAR) ;

space 				:	SPACE+;

string 				:	(SINGLE_STRING | DOUBLE_STRING);

sed_flag 			:	( VAL | SED_FLAG);

sed					:	SED space (sed_flag SPACE?)* string space (FILENAME | VAR) space COMPARE* SPACE* (FILENAME | VAR)* COMPARE SPACE* (FILENAME | VAR) SEMICOLON? space?;


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

SED 				: 'sed';

// SED_FLAG 			: '-n' | '-i' | '-e';

COMMAND 			: ('echo' | 'cat' | 'ls' | 'll' | 'time' | 'wget');

// keeping a not ; inside the expression to differentiate it from the for loop one
RHS_ASSIGNMENT		: ('${'.*?'}' | '$('[a-zA-Z0-9@!$^%*&+-.]+')');

OPEN_BRACKETS	    : ('((' | '[[');

CLOSE_BRACKETS	    : ('))' | ']]');

VAR					: [a-zA-Z_] [a-zA-Z_0-9]*;

WEBSITE 			: (( 'http' 's'? | 'ftp' | 'smtp' ) '://' )? ( 'www.' ) [a-z0-9]+ '.' [a-z]+( '/' [a-zA-Z0-9#]+ '/' ?)* ;

FILENAME			: VAR '.' VAR ;

SED_FLAG 		    : ('--' VAR | '--expression=');

// can be used in echo, other variable assignments
BASH_VAR			: '$' VAR;

VAL					: '-'? [A-Za-z0-9]+;

ASSIGN				: '=';

SEMICOLON			: ';';

LOGICAL_OP			: ('||' | '&&');

INCREMENT 			: ('++' | '--' | '+=' | '-=' | '/=' | '*=');

COMPARE 			: ('<=' | '>=' | '<' | '>' | '==');

BLOB                : [a-zA-Z0-9@!$^%*&+-.)(]+?;

OTHER 				: .;


