/*
 * Compile all your grammars using
 *       java -jar ../../../lib/antlr.jar *.g4
 * then Refresh in Eclipse.
 */
grammar NoteGrammar;
import Configuration;

NUM: [0-9]+;
OPENR: '|'':';
CLOSER: ':''|';
BAR: '|';
ENDMAJOR: ('[''|') | ('|''|') | ('|'']');
ENDING: '['NUM;
ANYTHING: (LETTER | [H-Z] | [h-y] | LILZ | NUM | ['!' '@' '#' '$' '%' '&' '*' ')' '~' '`' '{' '}' '"' '<' '>' '?' '.' ])+;
NEWLINE: '\n' | '\r''\n';
LETTER: ([A-G]|[a-g]);
LILZ: 'z';
duration: ('/' NUM) | '/' | (NUM '/' NUM) | NUM;
pitch: ('='|'_'|'^')* LETTER (','|('\''))*;
rest: LILZ duration;
note: pitch duration;
chord: '[' note+ ']';
tuplet: '(' NUM note+;
single: chord|note|rest|tuplet;
repeatsec: (OPENR | ENDMAJOR)? (single | ENDING)+ CLOSER ENDING?;
section: (single | repeatsec)+ NEWLINE;
voice: 'V'':' ANYTHING NEWLINE;
root: (voice? section)+ ENDMAJOR? EOF;

SPACES : [ ]+ -> skip;
