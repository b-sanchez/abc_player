// Generated from NoteGrammar.g4 by ANTLR 4.5.1

package abc.parser;
// Do not edit this .java file! Edit the .g4 file and re-run Antlr.

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link NoteGrammarParser}.
 */
public interface NoteGrammarListener extends ParseTreeListener {
  /**
   * Enter a parse tree produced by {@link NoteGrammarParser#abcmusic}.
   * @param ctx the parse tree
   */
  void enterAbcmusic(NoteGrammarParser.AbcmusicContext ctx);
  /**
   * Exit a parse tree produced by {@link NoteGrammarParser#abcmusic}.
   * @param ctx the parse tree
   */
  void exitAbcmusic(NoteGrammarParser.AbcmusicContext ctx);
  /**
   * Enter a parse tree produced by {@link NoteGrammarParser#abcline}.
   * @param ctx the parse tree
   */
  void enterAbcline(NoteGrammarParser.AbclineContext ctx);
  /**
   * Exit a parse tree produced by {@link NoteGrammarParser#abcline}.
   * @param ctx the parse tree
   */
  void exitAbcline(NoteGrammarParser.AbclineContext ctx);
  /**
   * Enter a parse tree produced by {@link NoteGrammarParser#element}.
   * @param ctx the parse tree
   */
  void enterElement(NoteGrammarParser.ElementContext ctx);
  /**
   * Exit a parse tree produced by {@link NoteGrammarParser#element}.
   * @param ctx the parse tree
   */
  void exitElement(NoteGrammarParser.ElementContext ctx);
  /**
   * Enter a parse tree produced by {@link NoteGrammarParser#noteelement}.
   * @param ctx the parse tree
   */
  void enterNoteelement(NoteGrammarParser.NoteelementContext ctx);
  /**
   * Exit a parse tree produced by {@link NoteGrammarParser#noteelement}.
   * @param ctx the parse tree
   */
  void exitNoteelement(NoteGrammarParser.NoteelementContext ctx);
  /**
   * Enter a parse tree produced by {@link NoteGrammarParser#note}.
   * @param ctx the parse tree
   */
  void enterNote(NoteGrammarParser.NoteContext ctx);
  /**
   * Exit a parse tree produced by {@link NoteGrammarParser#note}.
   * @param ctx the parse tree
   */
  void exitNote(NoteGrammarParser.NoteContext ctx);
  /**
   * Enter a parse tree produced by {@link NoteGrammarParser#noteorrest}.
   * @param ctx the parse tree
   */
  void enterNoteorrest(NoteGrammarParser.NoteorrestContext ctx);
  /**
   * Exit a parse tree produced by {@link NoteGrammarParser#noteorrest}.
   * @param ctx the parse tree
   */
  void exitNoteorrest(NoteGrammarParser.NoteorrestContext ctx);
  /**
   * Enter a parse tree produced by {@link NoteGrammarParser#pitch}.
   * @param ctx the parse tree
   */
  void enterPitch(NoteGrammarParser.PitchContext ctx);
  /**
   * Exit a parse tree produced by {@link NoteGrammarParser#pitch}.
   * @param ctx the parse tree
   */
  void exitPitch(NoteGrammarParser.PitchContext ctx);
  /**
   * Enter a parse tree produced by {@link NoteGrammarParser#octave}.
   * @param ctx the parse tree
   */
  void enterOctave(NoteGrammarParser.OctaveContext ctx);
  /**
   * Exit a parse tree produced by {@link NoteGrammarParser#octave}.
   * @param ctx the parse tree
   */
  void exitOctave(NoteGrammarParser.OctaveContext ctx);
  /**
   * Enter a parse tree produced by {@link NoteGrammarParser#notelength}.
   * @param ctx the parse tree
   */
  void enterNotelength(NoteGrammarParser.NotelengthContext ctx);
  /**
   * Exit a parse tree produced by {@link NoteGrammarParser#notelength}.
   * @param ctx the parse tree
   */
  void exitNotelength(NoteGrammarParser.NotelengthContext ctx);
  /**
   * Enter a parse tree produced by {@link NoteGrammarParser#notelengthstrict}.
   * @param ctx the parse tree
   */
  void enterNotelengthstrict(NoteGrammarParser.NotelengthstrictContext ctx);
  /**
   * Exit a parse tree produced by {@link NoteGrammarParser#notelengthstrict}.
   * @param ctx the parse tree
   */
  void exitNotelengthstrict(NoteGrammarParser.NotelengthstrictContext ctx);
  /**
   * Enter a parse tree produced by {@link NoteGrammarParser#accidental}.
   * @param ctx the parse tree
   */
  void enterAccidental(NoteGrammarParser.AccidentalContext ctx);
  /**
   * Exit a parse tree produced by {@link NoteGrammarParser#accidental}.
   * @param ctx the parse tree
   */
  void exitAccidental(NoteGrammarParser.AccidentalContext ctx);
  /**
   * Enter a parse tree produced by {@link NoteGrammarParser#basenote}.
   * @param ctx the parse tree
   */
  void enterBasenote(NoteGrammarParser.BasenoteContext ctx);
  /**
   * Exit a parse tree produced by {@link NoteGrammarParser#basenote}.
   * @param ctx the parse tree
   */
  void exitBasenote(NoteGrammarParser.BasenoteContext ctx);
  /**
   * Enter a parse tree produced by {@link NoteGrammarParser#rest}.
   * @param ctx the parse tree
   */
  void enterRest(NoteGrammarParser.RestContext ctx);
  /**
   * Exit a parse tree produced by {@link NoteGrammarParser#rest}.
   * @param ctx the parse tree
   */
  void exitRest(NoteGrammarParser.RestContext ctx);
  /**
   * Enter a parse tree produced by {@link NoteGrammarParser#tupletelement}.
   * @param ctx the parse tree
   */
  void enterTupletelement(NoteGrammarParser.TupletelementContext ctx);
  /**
   * Exit a parse tree produced by {@link NoteGrammarParser#tupletelement}.
   * @param ctx the parse tree
   */
  void exitTupletelement(NoteGrammarParser.TupletelementContext ctx);
  /**
   * Enter a parse tree produced by {@link NoteGrammarParser#tupletspec}.
   * @param ctx the parse tree
   */
  void enterTupletspec(NoteGrammarParser.TupletspecContext ctx);
  /**
   * Exit a parse tree produced by {@link NoteGrammarParser#tupletspec}.
   * @param ctx the parse tree
   */
  void exitTupletspec(NoteGrammarParser.TupletspecContext ctx);
  /**
   * Enter a parse tree produced by {@link NoteGrammarParser#multinote}.
   * @param ctx the parse tree
   */
  void enterMultinote(NoteGrammarParser.MultinoteContext ctx);
  /**
   * Exit a parse tree produced by {@link NoteGrammarParser#multinote}.
   * @param ctx the parse tree
   */
  void exitMultinote(NoteGrammarParser.MultinoteContext ctx);
  /**
   * Enter a parse tree produced by {@link NoteGrammarParser#barline}.
   * @param ctx the parse tree
   */
  void enterBarline(NoteGrammarParser.BarlineContext ctx);
  /**
   * Exit a parse tree produced by {@link NoteGrammarParser#barline}.
   * @param ctx the parse tree
   */
  void exitBarline(NoteGrammarParser.BarlineContext ctx);
  /**
   * Enter a parse tree produced by {@link NoteGrammarParser#nthrepeat}.
   * @param ctx the parse tree
   */
  void enterNthrepeat(NoteGrammarParser.NthrepeatContext ctx);
  /**
   * Exit a parse tree produced by {@link NoteGrammarParser#nthrepeat}.
   * @param ctx the parse tree
   */
  void exitNthrepeat(NoteGrammarParser.NthrepeatContext ctx);
  /**
   * Enter a parse tree produced by {@link NoteGrammarParser#midtunefield}.
   * @param ctx the parse tree
   */
  void enterMidtunefield(NoteGrammarParser.MidtunefieldContext ctx);
  /**
   * Exit a parse tree produced by {@link NoteGrammarParser#midtunefield}.
   * @param ctx the parse tree
   */
  void exitMidtunefield(NoteGrammarParser.MidtunefieldContext ctx);
  /**
   * Enter a parse tree produced by {@link NoteGrammarParser#fieldvoice}.
   * @param ctx the parse tree
   */
  void enterFieldvoice(NoteGrammarParser.FieldvoiceContext ctx);
  /**
   * Exit a parse tree produced by {@link NoteGrammarParser#fieldvoice}.
   * @param ctx the parse tree
   */
  void exitFieldvoice(NoteGrammarParser.FieldvoiceContext ctx);
  /**
   * Enter a parse tree produced by {@link NoteGrammarParser#comment}.
   * @param ctx the parse tree
   */
  void enterComment(NoteGrammarParser.CommentContext ctx);
  /**
   * Exit a parse tree produced by {@link NoteGrammarParser#comment}.
   * @param ctx the parse tree
   */
  void exitComment(NoteGrammarParser.CommentContext ctx);
  /**
   * Enter a parse tree produced by {@link NoteGrammarParser#endofline}.
   * @param ctx the parse tree
   */
  void enterEndofline(NoteGrammarParser.EndoflineContext ctx);
  /**
   * Exit a parse tree produced by {@link NoteGrammarParser#endofline}.
   * @param ctx the parse tree
   */
  void exitEndofline(NoteGrammarParser.EndoflineContext ctx);
  /**
   * Enter a parse tree produced by {@link NoteGrammarParser#anything}.
   * @param ctx the parse tree
   */
  void enterAnything(NoteGrammarParser.AnythingContext ctx);
  /**
   * Exit a parse tree produced by {@link NoteGrammarParser#anything}.
   * @param ctx the parse tree
   */
  void exitAnything(NoteGrammarParser.AnythingContext ctx);
}