// Generated from HeadingGrammar.g4 by ANTLR 4.5.1

package abc.parser;
// Do not edit this .java file! Edit the .g4 file and re-run Antlr.

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HeadingGrammarParser}.
 */
public interface HeadingGrammarListener extends ParseTreeListener {
  /**
   * Enter a parse tree produced by {@link HeadingGrammarParser#index}.
   * @param ctx the parse tree
   */
  void enterIndex(HeadingGrammarParser.IndexContext ctx);
  /**
   * Exit a parse tree produced by {@link HeadingGrammarParser#index}.
   * @param ctx the parse tree
   */
  void exitIndex(HeadingGrammarParser.IndexContext ctx);
  /**
   * Enter a parse tree produced by {@link HeadingGrammarParser#title}.
   * @param ctx the parse tree
   */
  void enterTitle(HeadingGrammarParser.TitleContext ctx);
  /**
   * Exit a parse tree produced by {@link HeadingGrammarParser#title}.
   * @param ctx the parse tree
   */
  void exitTitle(HeadingGrammarParser.TitleContext ctx);
  /**
   * Enter a parse tree produced by {@link HeadingGrammarParser#composer}.
   * @param ctx the parse tree
   */
  void enterComposer(HeadingGrammarParser.ComposerContext ctx);
  /**
   * Exit a parse tree produced by {@link HeadingGrammarParser#composer}.
   * @param ctx the parse tree
   */
  void exitComposer(HeadingGrammarParser.ComposerContext ctx);
  /**
   * Enter a parse tree produced by {@link HeadingGrammarParser#voice}.
   * @param ctx the parse tree
   */
  void enterVoice(HeadingGrammarParser.VoiceContext ctx);
  /**
   * Exit a parse tree produced by {@link HeadingGrammarParser#voice}.
   * @param ctx the parse tree
   */
  void exitVoice(HeadingGrammarParser.VoiceContext ctx);
  /**
   * Enter a parse tree produced by {@link HeadingGrammarParser#meter}.
   * @param ctx the parse tree
   */
  void enterMeter(HeadingGrammarParser.MeterContext ctx);
  /**
   * Exit a parse tree produced by {@link HeadingGrammarParser#meter}.
   * @param ctx the parse tree
   */
  void exitMeter(HeadingGrammarParser.MeterContext ctx);
  /**
   * Enter a parse tree produced by {@link HeadingGrammarParser#length}.
   * @param ctx the parse tree
   */
  void enterLength(HeadingGrammarParser.LengthContext ctx);
  /**
   * Exit a parse tree produced by {@link HeadingGrammarParser#length}.
   * @param ctx the parse tree
   */
  void exitLength(HeadingGrammarParser.LengthContext ctx);
  /**
   * Enter a parse tree produced by {@link HeadingGrammarParser#tempo}.
   * @param ctx the parse tree
   */
  void enterTempo(HeadingGrammarParser.TempoContext ctx);
  /**
   * Exit a parse tree produced by {@link HeadingGrammarParser#tempo}.
   * @param ctx the parse tree
   */
  void exitTempo(HeadingGrammarParser.TempoContext ctx);
  /**
   * Enter a parse tree produced by {@link HeadingGrammarParser#key}.
   * @param ctx the parse tree
   */
  void enterKey(HeadingGrammarParser.KeyContext ctx);
  /**
   * Exit a parse tree produced by {@link HeadingGrammarParser#key}.
   * @param ctx the parse tree
   */
  void exitKey(HeadingGrammarParser.KeyContext ctx);
  /**
   * Enter a parse tree produced by {@link HeadingGrammarParser#root}.
   * @param ctx the parse tree
   */
  void enterRoot(HeadingGrammarParser.RootContext ctx);
  /**
   * Exit a parse tree produced by {@link HeadingGrammarParser#root}.
   * @param ctx the parse tree
   */
  void exitRoot(HeadingGrammarParser.RootContext ctx);
}