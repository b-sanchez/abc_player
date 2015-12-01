/*
 * Compile all your grammars using
 *       java -jar ../../../lib/antlr.jar *.g4
 * then Refresh in Eclipse.
 */
grammar HeadingGrammar;
import Configuration;

NUMBER: [0-9]+;
SIGNATURE: [A-G]('^' | '_')? 'm'?;
ANYTHING: .+;
NEWLINE: \n | \r\n;
RATIONAL: NUMBER '/' NUMBER;
DURATION: RATIONAL | NUMBER;
index: 'X'':'NUMBER NEWLINE;
title: 'T'':'ANYTHING NEWLINE;
composer: 'C'':'ANYTHING NEWLINE;
voice: 'V'':'ANYTHING NEWLINE;
meter: 'M'':'RATIONAL NEWLINE;
length: 'L'':'DURATION NEWLINE;
tempo: 'Q'':'DURATION'='NUMBER NEWLINE;
key: 'K'':'SIGNATURE NEWLINE;
root: index title composer? voice* meter? length? tempo? key;
