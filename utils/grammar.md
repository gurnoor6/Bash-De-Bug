# BASH Grammar
@tableofcontents

All the tokens of the tokeniser as well as the rules of parser are defined in the file [grammar](https://github.com/gurnoor6/Bash-De-Bug/blob/master/utils/parser/bashGrammar.g4). 

## Tokens

1. **Basic identifiers**: These include symbols like '=', ;', '+', '-', all kinds of opening and closing brackets etc. This also included a space identifier that combined ' ', \n', '\t' and '\r' as one token. 
2. **2-letter identifiers**: These include combinations like '==', '--', '*=' etc. These had higher priority than the single letter ones.
3. **Keywords**: These included patterns like 'if', 'else', 'then', 'for', 'while', 'fi', 'function' etc.
4. Variables, strings, command, command tags identifiers are some of the complex identifiers. These had the highest priority among the conflicting preferences.
5. Tags are further bifurcated in single (the usual short form tags, mutiple single tags can be combined) and double tags (the usual full form versions).
6. As it is quite difficult to cover the never ending grammar of bash, rest are given token named "BLOB".

## Rules
These define how the tokens are combined to get executable syntax. We will cover some major rules here, rest are similar with possibly different constraints and can be seen in the grammar file.

1. Rule *for_loop* defines how tokens/rules combine to give a for loop syntax. This is defined over additional rule *inside_for* for loop assignments, conditions and increments, these are again defined using combination of rules *conditions*, *assignment*, *advanced_assignments* etc. *while_loop* rule is also similarly defined.
2. Rule *ifElse* is also defined using executable combination rule *conditions* and tokens *if*, *else*, *then* and *fi*.
3. Rules *linux_command* and *sed* define syntax of commands like cat, echo, sed etc. This also uses rule *tags*, therefore given tags in the file can be extracted from the parse tree.
4. Rules *function_def* is defined using tokens *FUNCTION*, *OPEN_PAR*, *OPEN_CUR* etc. 

Note that many rules including *loops*, *ifElse*, *linux_commands* have recursive definitions i.e. they can have themselves(or in general any *expression* inside them) thus, defining nested conditionals, loops and piped linux commands.
