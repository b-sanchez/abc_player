// Generated from HeadingGrammar.g4 by ANTLR 4.5.1

package abc.parser;
// Do not edit this .java file! Edit the .g4 file and re-run Antlr.

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HeadingGrammarParser extends Parser {
  static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

  protected static final DFA[] _decisionToDFA;
  protected static final PredictionContextCache _sharedContextCache =
    new PredictionContextCache();
  public static final int
    T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
    T__9=10, NUMBER=11, SIGNATURE=12, ANYTHING=13, NEWLINE=14, RATIONAL=15, 
    DURATION=16;
  public static final int
    RULE_index = 0, RULE_title = 1, RULE_composer = 2, RULE_voice = 3, RULE_meter = 4, 
    RULE_length = 5, RULE_tempo = 6, RULE_key = 7, RULE_root = 8;
  public static final String[] ruleNames = {
    "index", "title", "composer", "voice", "meter", "length", "tempo", "key", 
    "root"
  };

  private static final String[] _LITERAL_NAMES = {
    null, "'X'", "':'", "'T'", "'C'", "'V'", "'M'", "'L'", "'Q'", "'='", 
    "'K'"
  };
  private static final String[] _SYMBOLIC_NAMES = {
    null, null, null, null, null, null, null, null, null, null, null, "NUMBER", 
    "SIGNATURE", "ANYTHING", "NEWLINE", "RATIONAL", "DURATION"
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

  @Override
  public String getGrammarFileName() { return "HeadingGrammar.g4"; }

  @Override
  public String[] getRuleNames() { return ruleNames; }

  @Override
  public String getSerializedATN() { return _serializedATN; }

  @Override
  public ATN getATN() { return _ATN; }


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

  public HeadingGrammarParser(TokenStream input) {
    super(input);
    _interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
  }
  public static class IndexContext extends ParserRuleContext {
    public TerminalNode NUMBER() { return getToken(HeadingGrammarParser.NUMBER, 0); }
    public TerminalNode NEWLINE() { return getToken(HeadingGrammarParser.NEWLINE, 0); }
    public IndexContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_index; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof HeadingGrammarListener ) ((HeadingGrammarListener)listener).enterIndex(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof HeadingGrammarListener ) ((HeadingGrammarListener)listener).exitIndex(this);
    }
  }

  public final IndexContext index() throws RecognitionException {
    IndexContext _localctx = new IndexContext(_ctx, getState());
    enterRule(_localctx, 0, RULE_index);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(18);
      match(T__0);
      setState(19);
      match(T__1);
      setState(20);
      match(NUMBER);
      setState(21);
      match(NEWLINE);
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class TitleContext extends ParserRuleContext {
    public TerminalNode ANYTHING() { return getToken(HeadingGrammarParser.ANYTHING, 0); }
    public TerminalNode NEWLINE() { return getToken(HeadingGrammarParser.NEWLINE, 0); }
    public TitleContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_title; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof HeadingGrammarListener ) ((HeadingGrammarListener)listener).enterTitle(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof HeadingGrammarListener ) ((HeadingGrammarListener)listener).exitTitle(this);
    }
  }

  public final TitleContext title() throws RecognitionException {
    TitleContext _localctx = new TitleContext(_ctx, getState());
    enterRule(_localctx, 2, RULE_title);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(23);
      match(T__2);
      setState(24);
      match(T__1);
      setState(25);
      match(ANYTHING);
      setState(26);
      match(NEWLINE);
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class ComposerContext extends ParserRuleContext {
    public TerminalNode ANYTHING() { return getToken(HeadingGrammarParser.ANYTHING, 0); }
    public TerminalNode NEWLINE() { return getToken(HeadingGrammarParser.NEWLINE, 0); }
    public ComposerContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_composer; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof HeadingGrammarListener ) ((HeadingGrammarListener)listener).enterComposer(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof HeadingGrammarListener ) ((HeadingGrammarListener)listener).exitComposer(this);
    }
  }

  public final ComposerContext composer() throws RecognitionException {
    ComposerContext _localctx = new ComposerContext(_ctx, getState());
    enterRule(_localctx, 4, RULE_composer);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(28);
      match(T__3);
      setState(29);
      match(T__1);
      setState(30);
      match(ANYTHING);
      setState(31);
      match(NEWLINE);
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class VoiceContext extends ParserRuleContext {
    public TerminalNode ANYTHING() { return getToken(HeadingGrammarParser.ANYTHING, 0); }
    public TerminalNode NEWLINE() { return getToken(HeadingGrammarParser.NEWLINE, 0); }
    public VoiceContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_voice; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof HeadingGrammarListener ) ((HeadingGrammarListener)listener).enterVoice(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof HeadingGrammarListener ) ((HeadingGrammarListener)listener).exitVoice(this);
    }
  }

  public final VoiceContext voice() throws RecognitionException {
    VoiceContext _localctx = new VoiceContext(_ctx, getState());
    enterRule(_localctx, 6, RULE_voice);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(33);
      match(T__4);
      setState(34);
      match(T__1);
      setState(35);
      match(ANYTHING);
      setState(36);
      match(NEWLINE);
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class MeterContext extends ParserRuleContext {
    public TerminalNode RATIONAL() { return getToken(HeadingGrammarParser.RATIONAL, 0); }
    public TerminalNode NEWLINE() { return getToken(HeadingGrammarParser.NEWLINE, 0); }
    public MeterContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_meter; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof HeadingGrammarListener ) ((HeadingGrammarListener)listener).enterMeter(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof HeadingGrammarListener ) ((HeadingGrammarListener)listener).exitMeter(this);
    }
  }

  public final MeterContext meter() throws RecognitionException {
    MeterContext _localctx = new MeterContext(_ctx, getState());
    enterRule(_localctx, 8, RULE_meter);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(38);
      match(T__5);
      setState(39);
      match(T__1);
      setState(40);
      match(RATIONAL);
      setState(41);
      match(NEWLINE);
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class LengthContext extends ParserRuleContext {
    public TerminalNode DURATION() { return getToken(HeadingGrammarParser.DURATION, 0); }
    public TerminalNode NEWLINE() { return getToken(HeadingGrammarParser.NEWLINE, 0); }
    public LengthContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_length; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof HeadingGrammarListener ) ((HeadingGrammarListener)listener).enterLength(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof HeadingGrammarListener ) ((HeadingGrammarListener)listener).exitLength(this);
    }
  }

  public final LengthContext length() throws RecognitionException {
    LengthContext _localctx = new LengthContext(_ctx, getState());
    enterRule(_localctx, 10, RULE_length);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(43);
      match(T__6);
      setState(44);
      match(T__1);
      setState(45);
      match(DURATION);
      setState(46);
      match(NEWLINE);
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class TempoContext extends ParserRuleContext {
    public TerminalNode DURATION() { return getToken(HeadingGrammarParser.DURATION, 0); }
    public TerminalNode NUMBER() { return getToken(HeadingGrammarParser.NUMBER, 0); }
    public TerminalNode NEWLINE() { return getToken(HeadingGrammarParser.NEWLINE, 0); }
    public TempoContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_tempo; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof HeadingGrammarListener ) ((HeadingGrammarListener)listener).enterTempo(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof HeadingGrammarListener ) ((HeadingGrammarListener)listener).exitTempo(this);
    }
  }

  public final TempoContext tempo() throws RecognitionException {
    TempoContext _localctx = new TempoContext(_ctx, getState());
    enterRule(_localctx, 12, RULE_tempo);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(48);
      match(T__7);
      setState(49);
      match(T__1);
      setState(50);
      match(DURATION);
      setState(51);
      match(T__8);
      setState(52);
      match(NUMBER);
      setState(53);
      match(NEWLINE);
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class KeyContext extends ParserRuleContext {
    public TerminalNode SIGNATURE() { return getToken(HeadingGrammarParser.SIGNATURE, 0); }
    public TerminalNode NEWLINE() { return getToken(HeadingGrammarParser.NEWLINE, 0); }
    public KeyContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_key; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof HeadingGrammarListener ) ((HeadingGrammarListener)listener).enterKey(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof HeadingGrammarListener ) ((HeadingGrammarListener)listener).exitKey(this);
    }
  }

  public final KeyContext key() throws RecognitionException {
    KeyContext _localctx = new KeyContext(_ctx, getState());
    enterRule(_localctx, 14, RULE_key);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(55);
      match(T__9);
      setState(56);
      match(T__1);
      setState(57);
      match(SIGNATURE);
      setState(58);
      match(NEWLINE);
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class RootContext extends ParserRuleContext {
    public IndexContext index() {
      return getRuleContext(IndexContext.class,0);
    }
    public TitleContext title() {
      return getRuleContext(TitleContext.class,0);
    }
    public KeyContext key() {
      return getRuleContext(KeyContext.class,0);
    }
    public ComposerContext composer() {
      return getRuleContext(ComposerContext.class,0);
    }
    public List<VoiceContext> voice() {
      return getRuleContexts(VoiceContext.class);
    }
    public VoiceContext voice(int i) {
      return getRuleContext(VoiceContext.class,i);
    }
    public MeterContext meter() {
      return getRuleContext(MeterContext.class,0);
    }
    public LengthContext length() {
      return getRuleContext(LengthContext.class,0);
    }
    public TempoContext tempo() {
      return getRuleContext(TempoContext.class,0);
    }
    public RootContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_root; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof HeadingGrammarListener ) ((HeadingGrammarListener)listener).enterRoot(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof HeadingGrammarListener ) ((HeadingGrammarListener)listener).exitRoot(this);
    }
  }

  public final RootContext root() throws RecognitionException {
    RootContext _localctx = new RootContext(_ctx, getState());
    enterRule(_localctx, 16, RULE_root);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(60);
      index();
      setState(61);
      title();
      setState(63);
      _la = _input.LA(1);
      if (_la==T__3) {
        {
        setState(62);
        composer();
        }
      }

      setState(68);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while (_la==T__4) {
        {
        {
        setState(65);
        voice();
        }
        }
        setState(70);
        _errHandler.sync(this);
        _la = _input.LA(1);
      }
      setState(72);
      _la = _input.LA(1);
      if (_la==T__5) {
        {
        setState(71);
        meter();
        }
      }

      setState(75);
      _la = _input.LA(1);
      if (_la==T__6) {
        {
        setState(74);
        length();
        }
      }

      setState(78);
      _la = _input.LA(1);
      if (_la==T__7) {
        {
        setState(77);
        tempo();
        }
      }

      setState(80);
      key();
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static final String _serializedATN =
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\22U\4\2\t\2\4\3"+
      "\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3"+
      "\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5"+
      "\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3"+
      "\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\5\nB\n\n\3\n\7\nE\n\n\f"+
      "\n\16\nH\13\n\3\n\5\nK\n\n\3\n\5\nN\n\n\3\n\5\nQ\n\n\3\n\3\n\3\n\2"+
      "\2\13\2\4\6\b\n\f\16\20\22\2\2P\2\24\3\2\2\2\4\31\3\2\2\2\6\36\3\2"+
      "\2\2\b#\3\2\2\2\n(\3\2\2\2\f-\3\2\2\2\16\62\3\2\2\2\209\3\2\2\2\22"+
      ">\3\2\2\2\24\25\7\3\2\2\25\26\7\4\2\2\26\27\7\r\2\2\27\30\7\20\2\2"+
      "\30\3\3\2\2\2\31\32\7\5\2\2\32\33\7\4\2\2\33\34\7\17\2\2\34\35\7\20"+
      "\2\2\35\5\3\2\2\2\36\37\7\6\2\2\37 \7\4\2\2 !\7\17\2\2!\"\7\20\2\2"+
      "\"\7\3\2\2\2#$\7\7\2\2$%\7\4\2\2%&\7\17\2\2&\'\7\20\2\2\'\t\3\2\2"+
      "\2()\7\b\2\2)*\7\4\2\2*+\7\21\2\2+,\7\20\2\2,\13\3\2\2\2-.\7\t\2\2"+
      "./\7\4\2\2/\60\7\22\2\2\60\61\7\20\2\2\61\r\3\2\2\2\62\63\7\n\2\2"+
      "\63\64\7\4\2\2\64\65\7\22\2\2\65\66\7\13\2\2\66\67\7\r\2\2\678\7\20"+
      "\2\28\17\3\2\2\29:\7\f\2\2:;\7\4\2\2;<\7\16\2\2<=\7\20\2\2=\21\3\2"+
      "\2\2>?\5\2\2\2?A\5\4\3\2@B\5\6\4\2A@\3\2\2\2AB\3\2\2\2BF\3\2\2\2C"+
      "E\5\b\5\2DC\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2GJ\3\2\2\2HF\3\2"+
      "\2\2IK\5\n\6\2JI\3\2\2\2JK\3\2\2\2KM\3\2\2\2LN\5\f\7\2ML\3\2\2\2M"+
      "N\3\2\2\2NP\3\2\2\2OQ\5\16\b\2PO\3\2\2\2PQ\3\2\2\2QR\3\2\2\2RS\5\20"+
      "\t\2S\23\3\2\2\2\7AFJMP";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}