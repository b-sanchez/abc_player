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
    ENDING=17, ANYTHING=18, NEWLINE=19, LETTER=20, LILZ=21, SPACES=22;
  public static final int
    RULE_duration = 0, RULE_pitch = 1, RULE_rest = 2, RULE_note = 3, RULE_chord = 4, 
    RULE_tuplet = 5, RULE_single = 6, RULE_repeatsec = 7, RULE_section = 8, 
    RULE_voice = 9, RULE_root = 10;
  public static final String[] ruleNames = {
    "duration", "pitch", "rest", "note", "chord", "tuplet", "single", "repeatsec", 
    "section", "voice", "root"
  };

  private static final String[] _LITERAL_NAMES = {
    null, "'/'", "'='", "'_'", "'^'", "','", "'''", "'['", "']'", "'('", 
    "'V'", "':'", null, null, null, "'|'", null, null, null, null, null, 
    "'z'"
  };
  private static final String[] _SYMBOLIC_NAMES = {
    null, null, null, null, null, null, null, null, null, null, null, null, 
    "NUM", "OPENR", "CLOSER", "BAR", "ENDMAJOR", "ENDING", "ANYTHING", "NEWLINE", 
    "LETTER", "LILZ", "SPACES"
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
      setState(29);
      switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
      case 1:
        enterOuterAlt(_localctx, 1);
        {
        {
        setState(22);
        match(T__0);
        setState(23);
        match(NUM);
        }
        }
        break;
      case 2:
        enterOuterAlt(_localctx, 2);
        {
        setState(24);
        match(T__0);
        }
        break;
      case 3:
        enterOuterAlt(_localctx, 3);
        {
        {
        setState(25);
        match(NUM);
        setState(26);
        match(T__0);
        setState(27);
        match(NUM);
        }
        }
        break;
      case 4:
        enterOuterAlt(_localctx, 4);
        {
        setState(28);
        match(NUM);
        }
        break;
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
      setState(34);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3))) != 0)) {
        {
        {
        setState(31);
        _la = _input.LA(1);
        if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3))) != 0)) ) {
        _errHandler.recoverInline(this);
        } else {
          consume();
        }
        }
        }
        setState(36);
        _errHandler.sync(this);
        _la = _input.LA(1);
      }
      setState(37);
      match(LETTER);
      setState(42);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while (_la==T__4 || _la==T__5) {
        {
        setState(40);
        switch (_input.LA(1)) {
        case T__4:
          {
          setState(38);
          match(T__4);
          }
          break;
        case T__5:
          {
          {
          setState(39);
          match(T__5);
          }
          }
          break;
        default:
          throw new NoViableAltException(this);
        }
        }
        setState(44);
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
    public TerminalNode LILZ() { return getToken(NoteGrammarParser.LILZ, 0); }
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
      setState(45);
      match(LILZ);
      setState(46);
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
      setState(48);
      pitch();
      setState(49);
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
      setState(51);
      match(T__6);
      setState(53); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(52);
        note();
        }
        }
        setState(55); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << LETTER))) != 0) );
      setState(57);
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
      setState(59);
      match(T__8);
      setState(60);
      match(NUM);
      setState(62); 
      _errHandler.sync(this);
      _alt = 1;
      do {
        switch (_alt) {
        case 1:
          {
          {
          setState(61);
          note();
          }
          }
          break;
        default:
          throw new NoViableAltException(this);
        }
        setState(64); 
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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
      setState(70);
      switch (_input.LA(1)) {
      case T__6:
        enterOuterAlt(_localctx, 1);
        {
        setState(66);
        chord();
        }
        break;
      case T__1:
      case T__2:
      case T__3:
      case LETTER:
        enterOuterAlt(_localctx, 2);
        {
        setState(67);
        note();
        }
        break;
      case LILZ:
        enterOuterAlt(_localctx, 3);
        {
        setState(68);
        rest();
        }
        break;
      case T__8:
        enterOuterAlt(_localctx, 4);
        {
        setState(69);
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
      setState(73);
      _la = _input.LA(1);
      if (_la==OPENR || _la==ENDMAJOR) {
        {
        setState(72);
        _la = _input.LA(1);
        if ( !(_la==OPENR || _la==ENDMAJOR) ) {
        _errHandler.recoverInline(this);
        } else {
          consume();
        }
        }
      }

      setState(77); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        setState(77);
        switch (_input.LA(1)) {
        case T__1:
        case T__2:
        case T__3:
        case T__6:
        case T__8:
        case LETTER:
        case LILZ:
          {
          setState(75);
          single();
          }
          break;
        case ENDING:
          {
          setState(76);
          match(ENDING);
          }
          break;
        default:
          throw new NoViableAltException(this);
        }
        }
        setState(79); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__6) | (1L << T__8) | (1L << ENDING) | (1L << LETTER) | (1L << LILZ))) != 0) );
      setState(81);
      match(CLOSER);
      setState(83);
      switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
      case 1:
        {
        setState(82);
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
      setState(87); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        setState(87);
        switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
        case 1:
          {
          setState(85);
          single();
          }
          break;
        case 2:
          {
          setState(86);
          repeatsec();
          }
          break;
        }
        }
        setState(89); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__6) | (1L << T__8) | (1L << OPENR) | (1L << ENDMAJOR) | (1L << ENDING) | (1L << LETTER) | (1L << LILZ))) != 0) );
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
      setState(93);
      match(T__9);
      setState(94);
      match(T__10);
      setState(95);
      match(ANYTHING);
      setState(96);
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
    public TerminalNode ENDMAJOR() { return getToken(NoteGrammarParser.ENDMAJOR, 0); }
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
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
      setState(102); 
      _errHandler.sync(this);
      _alt = 1;
      do {
        switch (_alt) {
        case 1:
          {
          {
          setState(99);
          _la = _input.LA(1);
          if (_la==T__9) {
            {
            setState(98);
            voice();
            }
          }

          setState(101);
          section();
          }
          }
          break;
        default:
          throw new NoViableAltException(this);
        }
        setState(104); 
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,14,_ctx);
      } while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
      setState(107);
      _la = _input.LA(1);
      if (_la==ENDMAJOR) {
        {
        setState(106);
        match(ENDMAJOR);
        }
      }

      setState(109);
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
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\30r\4\2\t\2\4\3"+
      "\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
      "\t\13\4\f\t\f\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2 \n\2\3\3\7\3#\n\3\f"+
      "\3\16\3&\13\3\3\3\3\3\3\3\7\3+\n\3\f\3\16\3.\13\3\3\4\3\4\3\4\3\5"+
      "\3\5\3\5\3\6\3\6\6\68\n\6\r\6\16\69\3\6\3\6\3\7\3\7\3\7\6\7A\n\7\r"+
      "\7\16\7B\3\b\3\b\3\b\3\b\5\bI\n\b\3\t\5\tL\n\t\3\t\3\t\6\tP\n\t\r"+
      "\t\16\tQ\3\t\3\t\5\tV\n\t\3\n\3\n\6\nZ\n\n\r\n\16\n[\3\n\3\n\3\13"+
      "\3\13\3\13\3\13\3\13\3\f\5\ff\n\f\3\f\6\fi\n\f\r\f\16\fj\3\f\5\fn"+
      "\n\f\3\f\3\f\3\f\2\2\r\2\4\6\b\n\f\16\20\22\24\26\2\4\3\2\4\6\4\2"+
      "\17\17\22\22z\2\37\3\2\2\2\4$\3\2\2\2\6/\3\2\2\2\b\62\3\2\2\2\n\65"+
      "\3\2\2\2\f=\3\2\2\2\16H\3\2\2\2\20K\3\2\2\2\22Y\3\2\2\2\24_\3\2\2"+
      "\2\26h\3\2\2\2\30\31\7\3\2\2\31 \7\16\2\2\32 \7\3\2\2\33\34\7\16\2"+
      "\2\34\35\7\3\2\2\35 \7\16\2\2\36 \7\16\2\2\37\30\3\2\2\2\37\32\3\2"+
      "\2\2\37\33\3\2\2\2\37\36\3\2\2\2 \3\3\2\2\2!#\t\2\2\2\"!\3\2\2\2#"+
      "&\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%\'\3\2\2\2&$\3\2\2\2\',\7\26\2\2(+"+
      "\7\7\2\2)+\7\b\2\2*(\3\2\2\2*)\3\2\2\2+.\3\2\2\2,*\3\2\2\2,-\3\2\2"+
      "\2-\5\3\2\2\2.,\3\2\2\2/\60\7\27\2\2\60\61\5\2\2\2\61\7\3\2\2\2\62"+
      "\63\5\4\3\2\63\64\5\2\2\2\64\t\3\2\2\2\65\67\7\t\2\2\668\5\b\5\2\67"+
      "\66\3\2\2\289\3\2\2\29\67\3\2\2\29:\3\2\2\2:;\3\2\2\2;<\7\n\2\2<\13"+
      "\3\2\2\2=>\7\13\2\2>@\7\16\2\2?A\5\b\5\2@?\3\2\2\2AB\3\2\2\2B@\3\2"+
      "\2\2BC\3\2\2\2C\r\3\2\2\2DI\5\n\6\2EI\5\b\5\2FI\5\6\4\2GI\5\f\7\2"+
      "HD\3\2\2\2HE\3\2\2\2HF\3\2\2\2HG\3\2\2\2I\17\3\2\2\2JL\t\3\2\2KJ\3"+
      "\2\2\2KL\3\2\2\2LO\3\2\2\2MP\5\16\b\2NP\7\23\2\2OM\3\2\2\2ON\3\2\2"+
      "\2PQ\3\2\2\2QO\3\2\2\2QR\3\2\2\2RS\3\2\2\2SU\7\20\2\2TV\7\23\2\2U"+
      "T\3\2\2\2UV\3\2\2\2V\21\3\2\2\2WZ\5\16\b\2XZ\5\20\t\2YW\3\2\2\2YX"+
      "\3\2\2\2Z[\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\]\3\2\2\2]^\7\25\2\2^\23"+
      "\3\2\2\2_`\7\f\2\2`a\7\r\2\2ab\7\24\2\2bc\7\25\2\2c\25\3\2\2\2df\5"+
      "\24\13\2ed\3\2\2\2ef\3\2\2\2fg\3\2\2\2gi\5\22\n\2he\3\2\2\2ij\3\2"+
      "\2\2jh\3\2\2\2jk\3\2\2\2km\3\2\2\2ln\7\22\2\2ml\3\2\2\2mn\3\2\2\2"+
      "no\3\2\2\2op\7\2\2\3p\27\3\2\2\2\22\37$*,9BHKOQUY[ejm";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}