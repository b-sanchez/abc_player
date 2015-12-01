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
   * Enter a parse tree produced by {@link NoteGrammarParser#duration}.
   * @param ctx the parse tree
   */
  void enterDuration(NoteGrammarParser.DurationContext ctx);
  /**
   * Exit a parse tree produced by {@link NoteGrammarParser#duration}.
   * @param ctx the parse tree
   */
  void exitDuration(NoteGrammarParser.DurationContext ctx);
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
   * Enter a parse tree produced by {@link NoteGrammarParser#chord}.
   * @param ctx the parse tree
   */
  void enterChord(NoteGrammarParser.ChordContext ctx);
  /**
   * Exit a parse tree produced by {@link NoteGrammarParser#chord}.
   * @param ctx the parse tree
   */
  void exitChord(NoteGrammarParser.ChordContext ctx);
  /**
   * Enter a parse tree produced by {@link NoteGrammarParser#tuplet}.
   * @param ctx the parse tree
   */
  void enterTuplet(NoteGrammarParser.TupletContext ctx);
  /**
   * Exit a parse tree produced by {@link NoteGrammarParser#tuplet}.
   * @param ctx the parse tree
   */
  void exitTuplet(NoteGrammarParser.TupletContext ctx);
  /**
   * Enter a parse tree produced by {@link NoteGrammarParser#single}.
   * @param ctx the parse tree
   */
  void enterSingle(NoteGrammarParser.SingleContext ctx);
  /**
   * Exit a parse tree produced by {@link NoteGrammarParser#single}.
   * @param ctx the parse tree
   */
  void exitSingle(NoteGrammarParser.SingleContext ctx);
  /**
   * Enter a parse tree produced by {@link NoteGrammarParser#repeatsec}.
   * @param ctx the parse tree
   */
  void enterRepeatsec(NoteGrammarParser.RepeatsecContext ctx);
  /**
   * Exit a parse tree produced by {@link NoteGrammarParser#repeatsec}.
   * @param ctx the parse tree
   */
  void exitRepeatsec(NoteGrammarParser.RepeatsecContext ctx);
  /**
   * Enter a parse tree produced by {@link NoteGrammarParser#section}.
   * @param ctx the parse tree
   */
  void enterSection(NoteGrammarParser.SectionContext ctx);
  /**
   * Exit a parse tree produced by {@link NoteGrammarParser#section}.
   * @param ctx the parse tree
   */
  void exitSection(NoteGrammarParser.SectionContext ctx);
  /**
   * Enter a parse tree produced by {@link NoteGrammarParser#voice}.
   * @param ctx the parse tree
   */
  void enterVoice(NoteGrammarParser.VoiceContext ctx);
  /**
   * Exit a parse tree produced by {@link NoteGrammarParser#voice}.
   * @param ctx the parse tree
   */
  void exitVoice(NoteGrammarParser.VoiceContext ctx);
  /**
   * Enter a parse tree produced by {@link NoteGrammarParser#root}.
   * @param ctx the parse tree
   */
  void enterRoot(NoteGrammarParser.RootContext ctx);
  /**
   * Exit a parse tree produced by {@link NoteGrammarParser#root}.
   * @param ctx the parse tree
   */
  void exitRoot(NoteGrammarParser.RootContext ctx);
}