// Generated from NoteGrammar.g4 by ANTLR 4.5.1

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
public class NoteGrammarParser extends Parser {
  static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

  protected static final DFA[] _decisionToDFA;
  protected static final PredictionContextCache _sharedContextCache =
    new PredictionContextCache();
  public static final int
    T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
    T__9=10, T__10=11, NUM=12, OPENR=13, CLOSER=14, BAR=15, ENDMAJOR=16, 
    ENDING=17, ANYTHING=18, NEWLINE=19, LETTER=20, SLASH=21;
  public static final int
    RULE_duration = 0, RULE_pitch = 1, RULE_rest = 2, RULE_note = 3, RULE_chord = 4, 
    RULE_tuplet = 5, RULE_single = 6, RULE_repeatsec = 7, RULE_section = 8, 
    RULE_voice = 9, RULE_root = 10;
  public static final String[] ruleNames = {
    "duration", "pitch", "rest", "note", "chord", "tuplet", "single", "repeatsec", 
    "section", "voice", "root"
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

  @Override
  public String getGrammarFileName() { return "NoteGrammar.g4"; }

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

  public NoteGrammarParser(TokenStream input) {
    super(input);
    _interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
  }
  public static class DurationContext extends ParserRuleContext {
    public List<TerminalNode> NUM() { return getTokens(NoteGrammarParser.NUM); }
    public TerminalNode NUM(int i) {
      return getToken(NoteGrammarParser.NUM, i);
    }
    public TerminalNode SLASH() { return getToken(NoteGrammarParser.SLASH, 0); }
    public DurationContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_duration; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof NoteGrammarListener ) ((NoteGrammarListener)listener).enterDuration(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof NoteGrammarListener ) ((NoteGrammarListener)listener).exitDuration(this);
    }
  }

  public final DurationContext duration() throws RecognitionException {
    DurationContext _localctx = new DurationContext(_ctx, getState());
    enterRule(_localctx, 0, RULE_duration);
    try {
      enterOuterAlt(_localctx, 1);
      {
      {
      setState(22);
      match(NUM);
      setState(23);
      match(SLASH);
      setState(24);
      match(NUM);
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

  public static class PitchContext extends ParserRuleContext {
    public TerminalNode LETTER() { return getToken(NoteGrammarParser.LETTER, 0); }
    public PitchContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_pitch; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof NoteGrammarListener ) ((NoteGrammarListener)listener).enterPitch(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof NoteGrammarListener ) ((NoteGrammarListener)listener).exitPitch(this);
    }
  }

  public final PitchContext pitch() throws RecognitionException {
    PitchContext _localctx = new PitchContext(_ctx, getState());
    enterRule(_localctx, 2, RULE_pitch);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(29);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2))) != 0)) {
        {
        {
        setState(26);
        _la = _input.LA(1);
        if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2))) != 0)) ) {
        _errHandler.recoverInline(this);
        } else {
          consume();
        }
        }
        }
        setState(31);
        _errHandler.sync(this);
        _la = _input.LA(1);
      }
      setState(32);
      match(LETTER);
      setState(37);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while (_la==T__3 || _la==T__4) {
        {
        setState(35);
        switch (_input.LA(1)) {
        case T__3:
          {
          setState(33);
          match(T__3);
          }
          break;
        case T__4:
          {
          {
          setState(34);
          match(T__4);
          }
          }
          break;
        default:
          throw new NoViableAltException(this);
        }
        }
        setState(39);
        _errHandler.sync(this);
        _la = _input.LA(1);
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

  public static class RestContext extends ParserRuleContext {
    public DurationContext duration() {
      return getRuleContext(DurationContext.class,0);
    }
    public RestContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_rest; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof NoteGrammarListener ) ((NoteGrammarListener)listener).enterRest(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof NoteGrammarListener ) ((NoteGrammarListener)listener).exitRest(this);
    }
  }

  public final RestContext rest() throws RecognitionException {
    RestContext _localctx = new RestContext(_ctx, getState());
    enterRule(_localctx, 4, RULE_rest);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(40);
      match(T__5);
      setState(41);
      duration();
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

  public static class NoteContext extends ParserRuleContext {
    public PitchContext pitch() {
      return getRuleContext(PitchContext.class,0);
    }
    public DurationContext duration() {
      return getRuleContext(DurationContext.class,0);
    }
    public NoteContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_note; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof NoteGrammarListener ) ((NoteGrammarListener)listener).enterNote(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof NoteGrammarListener ) ((NoteGrammarListener)listener).exitNote(this);
    }
  }

  public final NoteContext note() throws RecognitionException {
    NoteContext _localctx = new NoteContext(_ctx, getState());
    enterRule(_localctx, 6, RULE_note);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(43);
      pitch();
      setState(44);
      duration();
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

  public static class ChordContext extends ParserRuleContext {
    public List<NoteContext> note() {
      return getRuleContexts(NoteContext.class);
    }
    public NoteContext note(int i) {
      return getRuleContext(NoteContext.class,i);
    }
    public ChordContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_chord; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof NoteGrammarListener ) ((NoteGrammarListener)listener).enterChord(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof NoteGrammarListener ) ((NoteGrammarListener)listener).exitChord(this);
    }
  }

  public final ChordContext chord() throws RecognitionException {
    ChordContext _localctx = new ChordContext(_ctx, getState());
    enterRule(_localctx, 8, RULE_chord);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(46);
      match(T__6);
      setState(48); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(47);
        note();
        }
        }
        setState(50); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << LETTER))) != 0) );
      setState(52);
      match(T__7);
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

  public static class TupletContext extends ParserRuleContext {
    public TerminalNode NUM() { return getToken(NoteGrammarParser.NUM, 0); }
    public List<NoteContext> note() {
      return getRuleContexts(NoteContext.class);
    }
    public NoteContext note(int i) {
      return getRuleContext(NoteContext.class,i);
    }
    public TupletContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_tuplet; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof NoteGrammarListener ) ((NoteGrammarListener)listener).enterTuplet(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof NoteGrammarListener ) ((NoteGrammarListener)listener).exitTuplet(this);
    }
  }

  public final TupletContext tuplet() throws RecognitionException {
    TupletContext _localctx = new TupletContext(_ctx, getState());
    enterRule(_localctx, 10, RULE_tuplet);
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
      setState(54);
      match(T__8);
      setState(55);
      match(NUM);
      setState(57); 
      _errHandler.sync(this);
      _alt = 1;
      do {
        switch (_alt) {
        case 1:
          {
          {
          setState(56);
          note();
          }
          }
          break;
        default:
          throw new NoViableAltException(this);
        }
        setState(59); 
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,4,_ctx);
      } while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

  public static class SingleContext extends ParserRuleContext {
    public ChordContext chord() {
      return getRuleContext(ChordContext.class,0);
    }
    public NoteContext note() {
      return getRuleContext(NoteContext.class,0);
    }
    public RestContext rest() {
      return getRuleContext(RestContext.class,0);
    }
    public TupletContext tuplet() {
      return getRuleContext(TupletContext.class,0);
    }
    public SingleContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_single; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof NoteGrammarListener ) ((NoteGrammarListener)listener).enterSingle(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof NoteGrammarListener ) ((NoteGrammarListener)listener).exitSingle(this);
    }
  }

  public final SingleContext single() throws RecognitionException {
    SingleContext _localctx = new SingleContext(_ctx, getState());
    enterRule(_localctx, 12, RULE_single);
    try {
      setState(65);
      switch (_input.LA(1)) {
      case T__6:
        enterOuterAlt(_localctx, 1);
        {
        setState(61);
        chord();
        }
        break;
      case T__0:
      case T__1:
      case T__2:
      case LETTER:
        enterOuterAlt(_localctx, 2);
        {
        setState(62);
        note();
        }
        break;
      case T__5:
        enterOuterAlt(_localctx, 3);
        {
        setState(63);
        rest();
        }
        break;
      case T__8:
        enterOuterAlt(_localctx, 4);
        {
        setState(64);
        tuplet();
        }
        break;
      default:
        throw new NoViableAltException(this);
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

  public static class RepeatsecContext extends ParserRuleContext {
    public TerminalNode CLOSER() { return getToken(NoteGrammarParser.CLOSER, 0); }
    public List<SingleContext> single() {
      return getRuleContexts(SingleContext.class);
    }
    public SingleContext single(int i) {
      return getRuleContext(SingleContext.class,i);
    }
    public List<TerminalNode> ENDING() { return getTokens(NoteGrammarParser.ENDING); }
    public TerminalNode ENDING(int i) {
      return getToken(NoteGrammarParser.ENDING, i);
    }
    public TerminalNode OPENR() { return getToken(NoteGrammarParser.OPENR, 0); }
    public TerminalNode ENDMAJOR() { return getToken(NoteGrammarParser.ENDMAJOR, 0); }
    public RepeatsecContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_repeatsec; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof NoteGrammarListener ) ((NoteGrammarListener)listener).enterRepeatsec(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof NoteGrammarListener ) ((NoteGrammarListener)listener).exitRepeatsec(this);
    }
  }

  public final RepeatsecContext repeatsec() throws RecognitionException {
    RepeatsecContext _localctx = new RepeatsecContext(_ctx, getState());
    enterRule(_localctx, 14, RULE_repeatsec);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(68);
      _la = _input.LA(1);
      if (_la==OPENR || _la==ENDMAJOR) {
        {
        setState(67);
        _la = _input.LA(1);
        if ( !(_la==OPENR || _la==ENDMAJOR) ) {
        _errHandler.recoverInline(this);
        } else {
          consume();
        }
        }
      }

      setState(72); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        setState(72);
        switch (_input.LA(1)) {
        case T__0:
        case T__1:
        case T__2:
        case T__5:
        case T__6:
        case T__8:
        case LETTER:
          {
          setState(70);
          single();
          }
          break;
        case ENDING:
          {
          setState(71);
          match(ENDING);
          }
          break;
        default:
          throw new NoViableAltException(this);
        }
        }
        setState(74); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__5) | (1L << T__6) | (1L << T__8) | (1L << ENDING) | (1L << LETTER))) != 0) );
      setState(76);
      match(CLOSER);
      setState(78);
      switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
      case 1:
        {
        setState(77);
        match(ENDING);
        }
        break;
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

  public static class SectionContext extends ParserRuleContext {
    public TerminalNode NEWLINE() { return getToken(NoteGrammarParser.NEWLINE, 0); }
    public List<SingleContext> single() {
      return getRuleContexts(SingleContext.class);
    }
    public SingleContext single(int i) {
      return getRuleContext(SingleContext.class,i);
    }
    public List<RepeatsecContext> repeatsec() {
      return getRuleContexts(RepeatsecContext.class);
    }
    public RepeatsecContext repeatsec(int i) {
      return getRuleContext(RepeatsecContext.class,i);
    }
    public SectionContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_section; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof NoteGrammarListener ) ((NoteGrammarListener)listener).enterSection(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof NoteGrammarListener ) ((NoteGrammarListener)listener).exitSection(this);
    }
  }

  public final SectionContext section() throws RecognitionException {
    SectionContext _localctx = new SectionContext(_ctx, getState());
    enterRule(_localctx, 16, RULE_section);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(82); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        setState(82);
        switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
        case 1:
          {
          setState(80);
          single();
          }
          break;
        case 2:
          {
          setState(81);
          repeatsec();
          }
          break;
        }
        }
        setState(84); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__5) | (1L << T__6) | (1L << T__8) | (1L << OPENR) | (1L << ENDMAJOR) | (1L << ENDING) | (1L << LETTER))) != 0) );
      setState(86);
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
    public TerminalNode ANYTHING() { return getToken(NoteGrammarParser.ANYTHING, 0); }
    public TerminalNode NEWLINE() { return getToken(NoteGrammarParser.NEWLINE, 0); }
    public VoiceContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_voice; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof NoteGrammarListener ) ((NoteGrammarListener)listener).enterVoice(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof NoteGrammarListener ) ((NoteGrammarListener)listener).exitVoice(this);
    }
  }

  public final VoiceContext voice() throws RecognitionException {
    VoiceContext _localctx = new VoiceContext(_ctx, getState());
    enterRule(_localctx, 18, RULE_voice);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(88);
      match(T__9);
      setState(89);
      match(T__10);
      setState(90);
      match(ANYTHING);
      setState(91);
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
    public TerminalNode EOF() { return getToken(NoteGrammarParser.EOF, 0); }
    public List<SectionContext> section() {
      return getRuleContexts(SectionContext.class);
    }
    public SectionContext section(int i) {
      return getRuleContext(SectionContext.class,i);
    }
    public List<VoiceContext> voice() {
      return getRuleContexts(VoiceContext.class);
    }
    public VoiceContext voice(int i) {
      return getRuleContext(VoiceContext.class,i);
    }
    public RootContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_root; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof NoteGrammarListener ) ((NoteGrammarListener)listener).enterRoot(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof NoteGrammarListener ) ((NoteGrammarListener)listener).exitRoot(this);
    }
  }

  public final RootContext root() throws RecognitionException {
    RootContext _localctx = new RootContext(_ctx, getState());
    enterRule(_localctx, 20, RULE_root);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(97); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(94);
        _la = _input.LA(1);
        if (_la==T__9) {
          {
          setState(93);
          voice();
          }
        }

        setState(96);
        section();
        }
        }
        setState(99); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__5) | (1L << T__6) | (1L << T__8) | (1L << T__9) | (1L << OPENR) | (1L << ENDMAJOR) | (1L << ENDING) | (1L << LETTER))) != 0) );
      setState(101);
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
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\27j\4\2\t\2\4\3"+
      "\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
      "\t\13\4\f\t\f\3\2\3\2\3\2\3\2\3\3\7\3\36\n\3\f\3\16\3!\13\3\3\3\3"+
      "\3\3\3\7\3&\n\3\f\3\16\3)\13\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\6\6"+
      "\63\n\6\r\6\16\6\64\3\6\3\6\3\7\3\7\3\7\6\7<\n\7\r\7\16\7=\3\b\3\b"+
      "\3\b\3\b\5\bD\n\b\3\t\5\tG\n\t\3\t\3\t\6\tK\n\t\r\t\16\tL\3\t\3\t"+
      "\5\tQ\n\t\3\n\3\n\6\nU\n\n\r\n\16\nV\3\n\3\n\3\13\3\13\3\13\3\13\3"+
      "\13\3\f\5\fa\n\f\3\f\6\fd\n\f\r\f\16\fe\3\f\3\f\3\f\2\2\r\2\4\6\b"+
      "\n\f\16\20\22\24\26\2\4\3\2\3\5\4\2\17\17\22\22n\2\30\3\2\2\2\4\37"+
      "\3\2\2\2\6*\3\2\2\2\b-\3\2\2\2\n\60\3\2\2\2\f8\3\2\2\2\16C\3\2\2\2"+
      "\20F\3\2\2\2\22T\3\2\2\2\24Z\3\2\2\2\26c\3\2\2\2\30\31\7\16\2\2\31"+
      "\32\7\27\2\2\32\33\7\16\2\2\33\3\3\2\2\2\34\36\t\2\2\2\35\34\3\2\2"+
      "\2\36!\3\2\2\2\37\35\3\2\2\2\37 \3\2\2\2 \"\3\2\2\2!\37\3\2\2\2\""+
      "\'\7\26\2\2#&\7\6\2\2$&\7\7\2\2%#\3\2\2\2%$\3\2\2\2&)\3\2\2\2\'%\3"+
      "\2\2\2\'(\3\2\2\2(\5\3\2\2\2)\'\3\2\2\2*+\7\b\2\2+,\5\2\2\2,\7\3\2"+
      "\2\2-.\5\4\3\2./\5\2\2\2/\t\3\2\2\2\60\62\7\t\2\2\61\63\5\b\5\2\62"+
      "\61\3\2\2\2\63\64\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65\66\3\2\2"+
      "\2\66\67\7\n\2\2\67\13\3\2\2\289\7\13\2\29;\7\16\2\2:<\5\b\5\2;:\3"+
      "\2\2\2<=\3\2\2\2=;\3\2\2\2=>\3\2\2\2>\r\3\2\2\2?D\5\n\6\2@D\5\b\5"+
      "\2AD\5\6\4\2BD\5\f\7\2C?\3\2\2\2C@\3\2\2\2CA\3\2\2\2CB\3\2\2\2D\17"+
      "\3\2\2\2EG\t\3\2\2FE\3\2\2\2FG\3\2\2\2GJ\3\2\2\2HK\5\16\b\2IK\7\23"+
      "\2\2JH\3\2\2\2JI\3\2\2\2KL\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MN\3\2\2\2N"+
      "P\7\20\2\2OQ\7\23\2\2PO\3\2\2\2PQ\3\2\2\2Q\21\3\2\2\2RU\5\16\b\2S"+
      "U\5\20\t\2TR\3\2\2\2TS\3\2\2\2UV\3\2\2\2VT\3\2\2\2VW\3\2\2\2WX\3\2"+
      "\2\2XY\7\25\2\2Y\23\3\2\2\2Z[\7\f\2\2[\\\7\r\2\2\\]\7\24\2\2]^\7\25"+
      "\2\2^\25\3\2\2\2_a\5\24\13\2`_\3\2\2\2`a\3\2\2\2ab\3\2\2\2bd\5\22"+
      "\n\2c`\3\2\2\2de\3\2\2\2ec\3\2\2\2ef\3\2\2\2fg\3\2\2\2gh\7\2\2\3h"+
      "\27\3\2\2\2\20\37%\'\64=CFJLPTV`e";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}