/*
 * Compile all your grammars using
 *       java -jar ../../../lib/antlr.jar *.g4
 * then Refresh in Eclipse.
 */
grammar NoteGrammar;
import Configuration;

abcmusic: abcline+ EOF;
abcline: (element+ NEWLINE) | midtunefield | comment;
element: noteelement | tupletelement | barline | nthrepeat | WHITESPACE; 

noteelement: note | multinote;

note: noteorrest notelength;
noteorrest: pitch | rest;
pitch: accidental? basenote octave?;
octave: '\''+ | ','+;
notelength: (DIGIT+)? ('/' (DIGIT+)?)?;
notelengthstrict: DIGIT+ '/' DIGIT+;

accidental: '^' | ('^''^') | '_' | ('_''_') | '=';

basenote: 'C' | 'D' | 'E' | 'F' | 'G' | 'A' | 'B' | 'c' | 'd' | 'e' | 'f' | 'g' | 'a' | 'b';

rest: 'z';

tupletelement: tupletspec noteelement+;
tupletspec: '(' DIGIT;

multinote: '[' note+ ']';

barline: '|' | ('|''|') | ('[''|') | ('|'']') | (':''|') | ('|'':');
nthrepeat: '['DIGIT;

midtunefield: fieldvoice;
fieldvoice: 'V'':' anything endofline;

comment: '%' anything? NEWLINE;
endofline: comment | NEWLINE;

NONBASENOTE: ([H-Z] | [h-y] | ['@' '#' '$' '%' '&' '*' ')' '~' '`' '{' '}' '"' '<' '>' '?' '.' ]);
anything: (basenote | NONBASENOTE | rest | DIGIT)+;
DIGIT: [0-9];
NEWLINE: '\n' | '\r' '\n'?;
WHITESPACE: '!'+;
