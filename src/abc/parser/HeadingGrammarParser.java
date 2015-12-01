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
    NUMBER=10, C=11, CBAR=12, SIGNATURE=13, NEWLINE=14, RATIONAL=15, ANYTHING=16, 
    SPACES=17;
  public static final int
    RULE_duration = 0, RULE_index = 1, RULE_title = 2, RULE_composer = 3, 
    RULE_voice = 4, RULE_meter = 5, RULE_length = 6, RULE_tempo = 7, RULE_key = 8, 
    RULE_root = 9;
  public static final String[] ruleNames = {
    "duration", "index", "title", "composer", "voice", "meter", "length", 
    "tempo", "key", "root"
  };

  private static final String[] _LITERAL_NAMES = {
    null, "'X'", "':'", "'T'", "'V'", "'M'", "'L'", "'Q'", "'='", "'K'", 
    null, "'C'"
  };
  private static final String[] _SYMBOLIC_NAMES = {
    null, null, null, null, null, null, null, null, null, null, "NUMBER", 
    "C", "CBAR", "SIGNATURE", "NEWLINE", "RATIONAL", "ANYTHING", "SPACES"
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
  public static class DurationContext extends ParserRuleContext {
    public TerminalNode RATIONAL() { return getToken(HeadingGrammarParser.RATIONAL, 0); }
    public TerminalNode NUMBER() { return getToken(HeadingGrammarParser.NUMBER, 0); }
    public DurationContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_duration; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof HeadingGrammarListener ) ((HeadingGrammarListener)listener).enterDuration(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof HeadingGrammarListener ) ((HeadingGrammarListener)listener).exitDuration(this);
    }
  }

  public final DurationContext duration() throws RecognitionException {
    DurationContext _localctx = new DurationContext(_ctx, getState());
    enterRule(_localctx, 0, RULE_duration);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(20);
      _la = _input.LA(1);
      if ( !(_la==NUMBER || _la==RATIONAL) ) {
      _errHandler.recoverInline(this);
      } else {
        consume();
      }
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
    enterRule(_localctx, 2, RULE_index);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(22);
      match(T__0);
      setState(23);
      match(T__1);
      setState(24);
      match(NUMBER);
      setState(25);
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
    enterRule(_localctx, 4, RULE_title);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(27);
      match(T__2);
      setState(28);
      match(T__1);
      setState(29);
      match(ANYTHING);
      setState(30);
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
    public TerminalNode C() { return getToken(HeadingGrammarParser.C, 0); }
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
    enterRule(_localctx, 6, RULE_composer);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(32);
      match(C);
      setState(33);
      match(T__1);
      setState(34);
      match(ANYTHING);
      setState(35);
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
    public TerminalNode NEWLINE() { return getToken(HeadingGrammarParser.NEWLINE, 0); }
    public TerminalNode ANYTHING() { return getToken(HeadingGrammarParser.ANYTHING, 0); }
    public TerminalNode NUMBER() { return getToken(HeadingGrammarParser.NUMBER, 0); }
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
    enterRule(_localctx, 8, RULE_voice);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(37);
      match(T__3);
      setState(38);
      match(T__1);
      setState(39);
      _la = _input.LA(1);
      if ( !(_la==NUMBER || _la==ANYTHING) ) {
      _errHandler.recoverInline(this);
      } else {
        consume();
      }
      setState(40);
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
    public TerminalNode NEWLINE() { return getToken(HeadingGrammarParser.NEWLINE, 0); }
    public TerminalNode RATIONAL() { return getToken(HeadingGrammarParser.RATIONAL, 0); }
    public TerminalNode C() { return getToken(HeadingGrammarParser.C, 0); }
    public TerminalNode CBAR() { return getToken(HeadingGrammarParser.CBAR, 0); }
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
    enterRule(_localctx, 10, RULE_meter);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(42);
      match(T__4);
      setState(43);
      match(T__1);
      setState(44);
      _la = _input.LA(1);
      if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << C) | (1L << CBAR) | (1L << RATIONAL))) != 0)) ) {
      _errHandler.recoverInline(this);
      } else {
        consume();
      }
      setState(45);
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
    public DurationContext duration() {
      return getRuleContext(DurationContext.class,0);
    }
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
    enterRule(_localctx, 12, RULE_length);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(47);
      match(T__5);
      setState(48);
      match(T__1);
      setState(49);
      duration();
      setState(50);
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
    public DurationContext duration() {
      return getRuleContext(DurationContext.class,0);
    }
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
    enterRule(_localctx, 14, RULE_tempo);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(52);
      match(T__6);
      setState(53);
      match(T__1);
      setState(54);
      duration();
      setState(55);
      match(T__7);
      setState(56);
      match(NUMBER);
      setState(57);
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
    public TerminalNode NEWLINE() { return getToken(HeadingGrammarParser.NEWLINE, 0); }
    public TerminalNode SIGNATURE() { return getToken(HeadingGrammarParser.SIGNATURE, 0); }
    public TerminalNode C() { return getToken(HeadingGrammarParser.C, 0); }
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
    enterRule(_localctx, 16, RULE_key);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(59);
      match(T__8);
      setState(60);
      match(T__1);
      setState(61);
      _la = _input.LA(1);
      if ( !(_la==C || _la==SIGNATURE) ) {
      _errHandler.recoverInline(this);
      } else {
        consume();
      }
      setState(62);
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
    public TerminalNode EOF() { return getToken(HeadingGrammarParser.EOF, 0); }
    public List<IndexContext> index() {
      return getRuleContexts(IndexContext.class);
    }
    public IndexContext index(int i) {
      return getRuleContext(IndexContext.class,i);
    }
    public List<TitleContext> title() {
      return getRuleContexts(TitleContext.class);
    }
    public TitleContext title(int i) {
      return getRuleContext(TitleContext.class,i);
    }
    public List<ComposerContext> composer() {
      return getRuleContexts(ComposerContext.class);
    }
    public ComposerContext composer(int i) {
      return getRuleContext(ComposerContext.class,i);
    }
    public List<VoiceContext> voice() {
      return getRuleContexts(VoiceContext.class);
    }
    public VoiceContext voice(int i) {
      return getRuleContext(VoiceContext.class,i);
    }
    public List<MeterContext> meter() {
      return getRuleContexts(MeterContext.class);
    }
    public MeterContext meter(int i) {
      return getRuleContext(MeterContext.class,i);
    }
    public List<LengthContext> length() {
      return getRuleContexts(LengthContext.class);
    }
    public LengthContext length(int i) {
      return getRuleContext(LengthContext.class,i);
    }
    public List<TempoContext> tempo() {
      return getRuleContexts(TempoContext.class);
    }
    public TempoContext tempo(int i) {
      return getRuleContext(TempoContext.class,i);
    }
    public List<KeyContext> key() {
      return getRuleContexts(KeyContext.class);
    }
    public KeyContext key(int i) {
      return getRuleContext(KeyContext.class,i);
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
    enterRule(_localctx, 18, RULE_root);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(72); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        setState(72);
        switch (_input.LA(1)) {
        case T__0:
          {
          setState(64);
          index();
          }
          break;
        case T__2:
          {
          setState(65);
          title();
          }
          break;
        case C:
          {
          setState(66);
          composer();
          }
          break;
        case T__3:
          {
          setState(67);
          voice();
          }
          break;
        case T__4:
          {
          setState(68);
          meter();
          }
          break;
        case T__5:
          {
          setState(69);
          length();
          }
          break;
        case T__6:
          {
          setState(70);
          tempo();
          }
          break;
        case T__8:
          {
          setState(71);
          key();
          }
          break;
        default:
          throw new NoViableAltException(this);
        }
        }
        setState(74); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__8) | (1L << C))) != 0) );
      setState(76);
      match(EOF);
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
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\23Q\4\2\t\2\4\3"+
      "\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
      "\t\13\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5"+
      "\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3"+
      "\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
      "\3\13\3\13\3\13\3\13\3\13\6\13K\n\13\r\13\16\13L\3\13\3\13\3\13\2"+
      "\2\f\2\4\6\b\n\f\16\20\22\24\2\6\4\2\f\f\21\21\4\2\f\f\22\22\4\2\r"+
      "\16\21\21\4\2\r\r\17\17N\2\26\3\2\2\2\4\30\3\2\2\2\6\35\3\2\2\2\b"+
      "\"\3\2\2\2\n\'\3\2\2\2\f,\3\2\2\2\16\61\3\2\2\2\20\66\3\2\2\2\22="+
      "\3\2\2\2\24J\3\2\2\2\26\27\t\2\2\2\27\3\3\2\2\2\30\31\7\3\2\2\31\32"+
      "\7\4\2\2\32\33\7\f\2\2\33\34\7\20\2\2\34\5\3\2\2\2\35\36\7\5\2\2\36"+
      "\37\7\4\2\2\37 \7\22\2\2 !\7\20\2\2!\7\3\2\2\2\"#\7\r\2\2#$\7\4\2"+
      "\2$%\7\22\2\2%&\7\20\2\2&\t\3\2\2\2\'(\7\6\2\2()\7\4\2\2)*\t\3\2\2"+
      "*+\7\20\2\2+\13\3\2\2\2,-\7\7\2\2-.\7\4\2\2./\t\4\2\2/\60\7\20\2\2"+
      "\60\r\3\2\2\2\61\62\7\b\2\2\62\63\7\4\2\2\63\64\5\2\2\2\64\65\7\20"+
      "\2\2\65\17\3\2\2\2\66\67\7\t\2\2\678\7\4\2\289\5\2\2\29:\7\n\2\2:"+
      ";\7\f\2\2;<\7\20\2\2<\21\3\2\2\2=>\7\13\2\2>?\7\4\2\2?@\t\5\2\2@A"+
      "\7\20\2\2A\23\3\2\2\2BK\5\4\3\2CK\5\6\4\2DK\5\b\5\2EK\5\n\6\2FK\5"+
      "\f\7\2GK\5\16\b\2HK\5\20\t\2IK\5\22\n\2JB\3\2\2\2JC\3\2\2\2JD\3\2"+
      "\2\2JE\3\2\2\2JF\3\2\2\2JG\3\2\2\2JH\3\2\2\2JI\3\2\2\2KL\3\2\2\2L"+
      "J\3\2\2\2LM\3\2\2\2MN\3\2\2\2NO\7\2\2\3O\25\3\2\2\2\4JL";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}