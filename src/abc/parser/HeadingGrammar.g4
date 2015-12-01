/*
 * Compile all your grammars using
 *       java -jar ../../../lib/antlr.jar *.g4
 * then Refresh in Eclipse.
 */
grammar HeadingGrammar;
import Configuration;

NUMBER: [ ]? [0-9]+;
LETTER: [A-G];
SIGNATURE: LETTER('^' | '_')? 'm'?;
NEWLINE: '\n'|'\r''\n';
RATIONAL: NUMBER '/' NUMBER;
duration: (RATIONAL | NUMBER);
ANYTHING: ([A-Z] | [a-z] | [ ] | NUMBER | ['!' '@' '#' '$' '%' '^' '&' '*' '(' ')' '~' '`' '{' '}' '|' '[' '"' ''' '<' '>' '?' ',' '.' ])+;
index: 'X'':'NUMBER NEWLINE;
title: 'T'':' ANYTHING NEWLINE;
composer: 'C'':' ANYTHING NEWLINE;
voice: 'V'':' (ANYTHING|NUMBER) NEWLINE;
meter: 'M'':'(RATIONAL|'C'|'C''|') NEWLINE;
length: 'L'':'duration NEWLINE;
tempo: 'Q'':'duration'='NUMBER NEWLINE;
key: 'K'':'(SIGNATURE|LETTER|'C') NEWLINE;
root: (index | title | composer | voice | meter | length | tempo | key)+ EOF;

SPACES : [ ]+ -> skip;