// Generated from NoteGrammar.g4 by ANTLR 4.5.1

package abc.parser;
// Do not edit this .java file! Edit the .g4 file and re-run Antlr.

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class NoteGrammarLexer extends Lexer {
  static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

  protected static final DFA[] _decisionToDFA;
  protected static final PredictionContextCache _sharedContextCache =
    new PredictionContextCache();
  public static final int
    T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
    T__9=10, T__10=11, NUM=12, OPENR=13, CLOSER=14, BAR=15, ENDMAJOR=16, 
    ENDING=17, ANYTHING=18, NEWLINE=19, LETTER=20, SLASH=21;
  public static String[] modeNames = {
    "DEFAULT_MODE"
  };

  public static final String[] ruleNames = {
    "T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
    "T__9", "T__10", "NUM", "OPENR", "CLOSER", "BAR", "ENDMAJOR", "ENDING", 
    "ANYTHING", "NEWLINE", "LETTER", "SLASH"
  };

  private static final String[] _LITERAL_NAMES = {
    null, "'='", "'_'", "'^'", "','", "'''", "'z'", "'['", "']'", "'('", 
    "'V'", "':'", null, null, null, "'|'", null, null, null, null, null, 
    "'/'"
  };
  private static final String[] _SYMBOLIC_NAMES = {
    null, null, null, null, null, null, null, null, null, null, null, null, 
    "NUM", "OPENR", "CLOSER", "BAR", "ENDMAJOR", "ENDING", "ANYTHING", "NEWLINE", 
    "LETTER", "SLASH"
  };
  public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

  /**
   * @deprecated Use {@link #VOCABULARY} instead.
   */
  @Deprecated
  public static final String[] tokenNames;
  static {
    tokenNames = new String[_SYMBOLIC_NAMES.length];
    for (int i = 0; i < tokenNames.length; i++) {
      tokenNames[i] = VOCABULARY.getLiteralName(i);
      if (tokenNames[i] == null) {
        tokenNames[i] = VOCABULARY.getSymbolicName(i);
      }

      if (tokenNames[i] == null) {
        tokenNames[i] = "<INVALID>";
      }
    }
  }

  @Override
  @Deprecated
  public String[] getTokenNames() {
    return tokenNames;
  }

  @Override

  public Vocabulary getVocabulary() {
    return VOCABULARY;
  }


      // This method makes the parser stop running if it encounters
      // invalid input and throw a RuntimeException.
      public void reportErrorsAsExceptions() {
          // To prevent any reports to standard error, add this line:
          //removeErrorListeners();
          
          addErrorListener(new BaseErrorListener() {
              public void syntaxError(Recognizer<?, ?> recognizer,
                                      Object offendingSymbol, 
                                      int line, int charPositionInLine,
                                      String msg, RecognitionException e) {
                  throw new ParseCancellationException(msg, e);
              }
          });
      }


  public NoteGrammarLexer(CharStream input) {
    super(input);
    _interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
  }

  @Override
  public String getGrammarFileName() { return "NoteGrammar.g4"; }

  @Override
  public String[] getRuleNames() { return ruleNames; }

  @Override
  public String getSerializedATN() { return _serializedATN; }

  @Override
  public String[] getModeNames() { return modeNames; }

  @Override
  public ATN getATN() { return _ATN; }

  public static final String _serializedATN =
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\27l\b\1\4\2\t\2"+
      "\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
      "\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4"+
      "\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\3\3\3\3"+
      "\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3"+
      "\f\3\f\3\r\6\rE\n\r\r\r\16\rF\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3"+
      "\20\3\21\3\21\3\21\3\21\3\21\3\21\5\21W\n\21\3\22\3\22\3\22\3\23\3"+
      "\23\3\23\6\23_\n\23\r\23\16\23`\3\24\3\24\3\24\5\24f\n\24\3\25\5\25"+
      "i\n\25\3\26\3\26\2\2\27\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
      "\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27\3\2\6\3\2"+
      "\62;\5\2\"\"C\\c|\n\2\")+,\60\60>>@Bbb}}\177\u0080\4\2CIcir\2\3\3"+
      "\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
      "\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2"+
      "\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
      "\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\3-\3\2\2"+
      "\2\5/\3\2\2\2\7\61\3\2\2\2\t\63\3\2\2\2\13\65\3\2\2\2\r\67\3\2\2\2"+
      "\179\3\2\2\2\21;\3\2\2\2\23=\3\2\2\2\25?\3\2\2\2\27A\3\2\2\2\31D\3"+
      "\2\2\2\33H\3\2\2\2\35K\3\2\2\2\37N\3\2\2\2!V\3\2\2\2#X\3\2\2\2%^\3"+
      "\2\2\2\'e\3\2\2\2)h\3\2\2\2+j\3\2\2\2-.\7?\2\2.\4\3\2\2\2/\60\7a\2"+
      "\2\60\6\3\2\2\2\61\62\7`\2\2\62\b\3\2\2\2\63\64\7.\2\2\64\n\3\2\2"+
      "\2\65\66\7)\2\2\66\f\3\2\2\2\678\7|\2\28\16\3\2\2\29:\7]\2\2:\20\3"+
      "\2\2\2;<\7_\2\2<\22\3\2\2\2=>\7*\2\2>\24\3\2\2\2?@\7X\2\2@\26\3\2"+
      "\2\2AB\7<\2\2B\30\3\2\2\2CE\t\2\2\2DC\3\2\2\2EF\3\2\2\2FD\3\2\2\2"+
      "FG\3\2\2\2G\32\3\2\2\2HI\7~\2\2IJ\7<\2\2J\34\3\2\2\2KL\7<\2\2LM\7"+
      "~\2\2M\36\3\2\2\2NO\7~\2\2O \3\2\2\2PQ\7]\2\2QW\7~\2\2RS\7~\2\2SW"+
      "\7~\2\2TU\7~\2\2UW\7_\2\2VP\3\2\2\2VR\3\2\2\2VT\3\2\2\2W\"\3\2\2\2"+
      "XY\7]\2\2YZ\5\31\r\2Z$\3\2\2\2[_\t\3\2\2\\_\5\31\r\2]_\t\4\2\2^[\3"+
      "\2\2\2^\\\3\2\2\2^]\3\2\2\2_`\3\2\2\2`^\3\2\2\2`a\3\2\2\2a&\3\2\2"+
      "\2bf\7\f\2\2cd\7\17\2\2df\7\f\2\2eb\3\2\2\2ec\3\2\2\2f(\3\2\2\2gi"+
      "\t\5\2\2hg\3\2\2\2i*\3\2\2\2jk\7\61\2\2k,\3\2\2\2\t\2FV^`eh\2";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}