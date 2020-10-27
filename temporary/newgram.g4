grammar newgram;

file : iff+ SPACE? EOF;

iff  : IF;

IF	 : ('if' |'else'); 

SPACE : '\n'+;