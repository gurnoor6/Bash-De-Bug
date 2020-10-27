grammar rules;

/*
 * Parser Rules
 */
code : script* EOF;

script : SPACES? (assign | basicAssign)+;

basicAssign : VAR ASSIGN (assign | string | NUMBER | BLOB | VAR)? end+?;

assign : OPEN_FOR_BRACKET ' '* VAR ' '* ASSIGNOPS ' '* (BLOB | NUMBER | VAR) ' '* CLOSE_FOR_BRACKET end+?;

end : ( SEMI | ' ' | SPACES | NEWLINE);

string : (SINGLE_STRING | DOUBLE_STRING);

// ops: (ops | NUMBER | string | VAR) OPS ops SEMI; 

/*
 * Lexer Rules
 */

fragment DIGIT: [0-9];
// fragment SPACE : ' ';

SINGLE_STRING		: '\'' ~('\'')+ '\'';

DOUBLE_STRING		: '"' ~('"')+ '"';

FOR					: 'for';

DO 					: 'do';

DONE 				: 'done';

OPEN_FOR_BRACKET	: ('((' | '[[');

CLOSE_FOR_BRACKET	: ('))' | ']]');

VAR                 : [a-zA-Z_]+ [a-zA-Z0-9]*;

NUMBER              : '-'? DIGIT+ ([.] DIGIT+)?;

SPACES              : ' ' [ \t]+;

COMMENTS            : '#' ~[\r\n]* NEWLINE? -> skip;
// WHITESPACE : [ \t]+ -> skip;

ASSIGNOPS           :  ('+=' | '-=' | '*=' | '/=' );
OPS                 :  ('+' | '-' | '*' | '/' | '%' );

// PLUS                : '+';

// MUL                 : '*';

// MINUS               : '-';

// DIV                 : '/';

// MOD                 : '%';

// LESS                : '<';

// GREATER             : '>';

// EQUAL               : '==';

// PLUSASSIGN          : '+=';

// MINUSASSIGN         : '-=';

// MULASSIGN           : '*=';

// DIVASSIGN           : '/=';

// GREATEREQ           : '>=';

// LESSEQ              : '<=';

ASSIGN              : '=';

SEMI                : ';';

BLOB                : [a-zA-Z0-9@!$^%*&+-.]+;

NEWLINE             : ('\r'? '\n' | '\r')+;