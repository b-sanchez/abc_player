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
ANYTHING: .+?;
NEWLINE: '\n' | '\r''\n';
LETTER: [A-G]|[a-g];
duration: NUM? '/'? NUM?;
pitch: ('='|'_'|'^')* LETTER (','|('\''))*;
rest: 'z'duration;
note: pitch duration;
chord: '[' note+ ']';
tuplet: '(' NUM note+;
single: chord|note|rest|tuplet;
repeatsec: (OPENR | ENDMAJOR)? (single | ENDING)+ CLOSER ENDING?;
section: (single | repeatsec)+ NEWLINE;
voice: 'V'':' ANYTHING NEWLINE;
root: (voice? section)+ EOF;


