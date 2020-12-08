grammar bashGrammar;

/*
	parser
*/

code				: 	bashScript* EOF;

bashScript			:	(function_call | function_def | loops | assignment | linux_command | space | advanced_assignment | ifElse | sed)+;

expressions			:	(function_call | function_def | loops | assignment | linux_command | advanced_assignment | ifElse | sed | BREAK space? | CONTINUE space? )* space?;

loops				: 	(while_loop | for_loop);

while_loop			:	WHILE space? condition1 SEMICOLON? space?
						DO space?
							expressions
						DONE space?;

for_loop 			:	FOR space? open_bracket open_bracket inside_for close_bracket close_bracket space? SEMICOLON? space?
						DO space? 
							expressions
						DONE space?;

inside_for			:	(space? assignment? (',' space? assignment)* SEMICOLON space? condition1_base? (LOGICAL_OP space? condition1_base)*? SEMICOLON space? increment? (',' increment)* space?);

ifElse				:	IF space? conditions SEMICOLON? space? THEN space?
							expressions
						(ELIF space? conditions SEMICOLON? space? THEN space?
							expressions
						)*
						(ELSE space?
							expressions
						)?
						FI space?
						;

function_def		:	FUNCTION space? VAR space? OPEN_PAR space? CLOSE_PAR space? OPEN_CUR space? expressions space? CLOSE_CUR;

sed					:	SED space? (tag space?)* string space (FILENAME | VAR) space? redirect? SEMICOLON? space?;

linux_command		: 	COMMAND space? (tag | space | command_data)*? SEMICOLON? space? (PIPE space? (linux_command | sed ))*? space? redirect? space?;

function_call		: 	VAR space? (tag | space | command_data)*? SEMICOLON? space?; 

conditions 			: 	(condition1 | condition2);

condition1			:	open_bracket open_bracket space? condition1_base (LOGICAL_OP space? condition1_base)*? close_bracket close_bracket space?;

condition1_base		:	space? (VAR | VAL | BLOB)+ space? COMPARE space? (string | VAR | VAL | BLOB | BASH_VAR | RHS_ASSIGNMENT | BLOB)+ space?;

condition2			:	OPEN_BOX SPACE (VAL | VAR | BLOB | string)*? space (tag | COMPARE) space (VAL | VAR | BLOB | string)+ SPACE CLOSE_BOX space?;

assignment			:	VAR ASSIGN (string | VAL | VAR | BASH_VAR | RHS_ASSIGNMENT | BLOB)+ SEMICOLON? space?;

// need to write this in proper way

advanced_assignment :	open_bracket open_bracket space? VAR space? (ASSIGN | INCREMENT) space? (string | VAL | VAR | BASH_VAR | RHS_ASSIGNMENT | BLOB)* space? close_bracket close_bracket SEMICOLON? space?;

command_data 		: 	(VAR | VAL | BLOB | BASH_VAR | string | INCREMENT | OTHER | space | FILENAME | WEBSITE | RHS_ASSIGNMENT)+ space?;

redirect			: 	COMPARE* space? (FILENAME | VAR)* COMPARE SPACE* (FILENAME | VAR) space?;

comparison			:	VAR COMPARE VAL;

increment			:	(VAR INCREMENT (BLOB | VAR | VAL | string | BASH_VAR)? | INCREMENT VAR) ;

tag					:	(FULL_TAG | SINGLE_TAG);

open_bracket 		: 	(OPEN_PAR | OPEN_CUR | OPEN_BOX);

close_bracket 		: 	(CLOSE_PAR | CLOSE_CUR | CLOSE_BOX);

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

OPEN_PAR	: '(';

CLOSE_PAR	: ')';

OPEN_CUR	: '{';

CLOSE_CUR	: '}';

OPEN_BOX	: '[';

CLOSE_BOX	: ']';

PIPE		: '|';

// keeping a not ; inside the expression to differentiate it from the for loop one

RHS_ASSIGNMENT		: ('${'.*?'}' | '$('[a-zA-Z0-9@!$^%*&+-.:/ ]+')' | '$(('[a-zA-Z0-9@!$^%*&+-.:/ ]+'))' );

SINGLE_STRING		: '\'' ~('\'')+ '\'';

DOUBLE_STRING		: '"' ~('"')+ '"';

COMMENT				: '#' ~[\r\n]* -> skip;

SPACE				: [ \t\r\n];

FUNCTION 			: 'function';

IF					: 'if';

THEN				: 'then';

ELIF				: 'elif';

ELSE				: 'else';

FI					: 'fi';

FOR					: 'for';

WHILE				: 'while';

DO 					: 'do';

SED 				: 'sed';

BREAK				: 'break';

CONTINUE			: 'continue';

DONE 				: 'done';

COMMAND 			: ('echo' | 'cat' | 'ls' | 'll' | 'time' | 'wget' | 'cd' | 'tr');

VAR					: [a-zA-Z] (NEG? [a-zA-Z_0-9]+)*;

WEBSITE 			: (( 'http' 's'? | 'ftp' | 'smtp' ) '://' )? ( 'www.' ) [a-z0-9]+ '.' [a-z]+( '/' [a-zA-Z0-9#]+ '/' ?)* ;

FILENAME			: VAR '.' VAR ;

// can be used in echo, other variable assignments
BASH_VAR			: '$' VAR ;

INCREMENT 			: (NEGNEG | PLUSPLUS | NEGEQUAL | PLUSEQUAL | MULEQUAL | DIVEQUAL);

NEGNEG				: '--';

NEG  				: '-';

PLUSPLUS			: '++';

NEGEQUAL			: '-=';

PLUSEQUAL			: '+=';

MULEQUAL			: '*=';

DIVEQUAL			: '/=';

COMPARE 			: ('<=' | '>=' | '<' | '>' | '==');

FULL_TAG			: NEGNEG [A-Za-z0-9]+ [A-Za-z0-9=]*;

SINGLE_TAG			: NEG [A-Za-z0-9]+ [A-Za-z0-9=]*;

VAL 				: NEG? [A-Za-z0-9]+;

ASSIGN				: '=';

SEMICOLON			: ';';

LOGICAL_OP			: ('||' | '&&');

BLOB                : [a-zA-Z0-9@!$^%#*&+-.]+?;

OTHER 				: .;


