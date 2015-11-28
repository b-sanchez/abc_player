/*
 * Compile all your grammars using
 *       java -jar ../../../lib/antlr.jar *.g4
 * then Refresh in Eclipse.
 */
grammar Abc;
import Configuration;

NUMBER: [0-9]+;
SIGNATURE: [A-G]('^' | '_')? m?
ANYTHING: .+
NEWLINE: \n | \r\n
rational: NUMBER '/' NUMBER;
duration: RATIONAL | NUMBER;
x: X':'NUMBER NEWLINE
t: T':'ANYTHING NEWLINE
c: C':'ANYTHING NEWLINE
v: V':'ANYTHING NEWLINE
m: M':'RATIONAL NEWLINE
l: L':'DURATION NEWLINE
q: Q':'DURATION'='NUMBER NEWLINE
k: K':'SIGNATURE NEWLINE
root: X T C? V* M? L? Q? K EOF;
