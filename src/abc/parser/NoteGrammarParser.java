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
    T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, 
    T__16=17, T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, 
    T__23=24, T__24=25, T__25=26, T__26=27, T__27=28, NONBASENOTE=29, DIGIT=30, 
    NEWLINE=31, WHITESPACE=32;
  public static final int
    RULE_abcmusic = 0, RULE_abcline = 1, RULE_element = 2, RULE_noteelement = 3, 
    RULE_note = 4, RULE_noteorrest = 5, RULE_pitch = 6, RULE_octave = 7, 
    RULE_notelength = 8, RULE_notelengthstrict = 9, RULE_accidental = 10, 
    RULE_basenote = 11, RULE_rest = 12, RULE_tupletelement = 13, RULE_tupletspec = 14, 
    RULE_multinote = 15, RULE_barline = 16, RULE_nthrepeat = 17, RULE_midtunefield = 18, 
    RULE_fieldvoice = 19, RULE_comment = 20, RULE_endofline = 21, RULE_anything = 22;
  public static final String[] ruleNames = {
    "abcmusic", "abcline", "element", "noteelement", "note", "noteorrest", 
    "pitch", "octave", "notelength", "notelengthstrict", "accidental", "basenote", 
    "rest", "tupletelement", "tupletspec", "multinote", "barline", "nthrepeat", 
    "midtunefield", "fieldvoice", "comment", "endofline", "anything"
  };

  private static final String[] _LITERAL_NAMES = {
    null, "'''", "','", "'/'", "'^'", "'_'", "'='", "'C'", "'D'", "'E'", 
    "'F'", "'G'", "'A'", "'B'", "'c'", "'d'", "'e'", "'f'", "'g'", "'a'", 
    "'b'", "'z'", "'('", "'['", "']'", "'|'", "':'", "'V'", "'%'"
  };
  private static final String[] _SYMBOLIC_NAMES = {
    null, null, null, null, null, null, null, null, null, null, null, null, 
    null, null, null, null, null, null, null, null, null, null, null, null, 
    null, null, null, null, null, "NONBASENOTE", "DIGIT", "NEWLINE", "WHITESPACE"
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
  public static class AbcmusicContext extends ParserRuleContext {
    public TerminalNode EOF() { return getToken(NoteGrammarParser.EOF, 0); }
    public List<AbclineContext> abcline() {
      return getRuleContexts(AbclineContext.class);
    }
    public AbclineContext abcline(int i) {
      return getRuleContext(AbclineContext.class,i);
    }
    public AbcmusicContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_abcmusic; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof NoteGrammarListener ) ((NoteGrammarListener)listener).enterAbcmusic(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof NoteGrammarListener ) ((NoteGrammarListener)listener).exitAbcmusic(this);
    }
  }

  public final AbcmusicContext abcmusic() throws RecognitionException {
    AbcmusicContext _localctx = new AbcmusicContext(_ctx, getState());
    enterRule(_localctx, 0, RULE_abcmusic);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(47); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(46);
        abcline();
        }
        }
        setState(49); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << WHITESPACE))) != 0) );
      setState(51);
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

  public static class AbclineContext extends ParserRuleContext {
    public TerminalNode NEWLINE() { return getToken(NoteGrammarParser.NEWLINE, 0); }
    public List<ElementContext> element() {
      return getRuleContexts(ElementContext.class);
    }
    public ElementContext element(int i) {
      return getRuleContext(ElementContext.class,i);
    }
    public MidtunefieldContext midtunefield() {
      return getRuleContext(MidtunefieldContext.class,0);
    }
    public CommentContext comment() {
      return getRuleContext(CommentContext.class,0);
    }
    public AbclineContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_abcline; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof NoteGrammarListener ) ((NoteGrammarListener)listener).enterAbcline(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof NoteGrammarListener ) ((NoteGrammarListener)listener).exitAbcline(this);
    }
  }

  public final AbclineContext abcline() throws RecognitionException {
    AbclineContext _localctx = new AbclineContext(_ctx, getState());
    enterRule(_localctx, 2, RULE_abcline);
    int _la;
    try {
      setState(62);
      switch (_input.LA(1)) {
      case T__3:
      case T__4:
      case T__5:
      case T__6:
      case T__7:
      case T__8:
      case T__9:
      case T__10:
      case T__11:
      case T__12:
      case T__13:
      case T__14:
      case T__15:
      case T__16:
      case T__17:
      case T__18:
      case T__19:
      case T__20:
      case T__21:
      case T__22:
      case T__24:
      case T__25:
      case WHITESPACE:
        enterOuterAlt(_localctx, 1);
        {
        setState(54); 
        _errHandler.sync(this);
        _la = _input.LA(1);
        do {
          {
          {
          setState(53);
          element();
          }
          }
          setState(56); 
          _errHandler.sync(this);
          _la = _input.LA(1);
        } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__24) | (1L << T__25) | (1L << WHITESPACE))) != 0) );
        setState(58);
        match(NEWLINE);
        }
        break;
      case T__26:
        enterOuterAlt(_localctx, 2);
        {
        setState(60);
        midtunefield();
        }
        break;
      case T__27:
        enterOuterAlt(_localctx, 3);
        {
        setState(61);
        comment();
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

  public static class ElementContext extends ParserRuleContext {
    public NoteelementContext noteelement() {
      return getRuleContext(NoteelementContext.class,0);
    }
    public TupletelementContext tupletelement() {
      return getRuleContext(TupletelementContext.class,0);
    }
    public BarlineContext barline() {
      return getRuleContext(BarlineContext.class,0);
    }
    public NthrepeatContext nthrepeat() {
      return getRuleContext(NthrepeatContext.class,0);
    }
    public TerminalNode WHITESPACE() { return getToken(NoteGrammarParser.WHITESPACE, 0); }
    public ElementContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_element; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof NoteGrammarListener ) ((NoteGrammarListener)listener).enterElement(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof NoteGrammarListener ) ((NoteGrammarListener)listener).exitElement(this);
    }
  }

  public final ElementContext element() throws RecognitionException {
    ElementContext _localctx = new ElementContext(_ctx, getState());
    enterRule(_localctx, 4, RULE_element);
    try {
      setState(69);
      switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
      case 1:
        enterOuterAlt(_localctx, 1);
        {
        setState(64);
        noteelement();
        }
        break;
      case 2:
        enterOuterAlt(_localctx, 2);
        {
        setState(65);
        tupletelement();
        }
        break;
      case 3:
        enterOuterAlt(_localctx, 3);
        {
        setState(66);
        barline();
        }
        break;
      case 4:
        enterOuterAlt(_localctx, 4);
        {
        setState(67);
        nthrepeat();
        }
        break;
      case 5:
        enterOuterAlt(_localctx, 5);
        {
        setState(68);
        match(WHITESPACE);
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

  public static class NoteelementContext extends ParserRuleContext {
    public NoteContext note() {
      return getRuleContext(NoteContext.class,0);
    }
    public MultinoteContext multinote() {
      return getRuleContext(MultinoteContext.class,0);
    }
    public NoteelementContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_noteelement; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof NoteGrammarListener ) ((NoteGrammarListener)listener).enterNoteelement(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof NoteGrammarListener ) ((NoteGrammarListener)listener).exitNoteelement(this);
    }
  }

  public final NoteelementContext noteelement() throws RecognitionException {
    NoteelementContext _localctx = new NoteelementContext(_ctx, getState());
    enterRule(_localctx, 6, RULE_noteelement);
    try {
      setState(73);
      switch (_input.LA(1)) {
      case T__3:
      case T__4:
      case T__5:
      case T__6:
      case T__7:
      case T__8:
      case T__9:
      case T__10:
      case T__11:
      case T__12:
      case T__13:
      case T__14:
      case T__15:
      case T__16:
      case T__17:
      case T__18:
      case T__19:
      case T__20:
        enterOuterAlt(_localctx, 1);
        {
        setState(71);
        note();
        }
        break;
      case T__22:
        enterOuterAlt(_localctx, 2);
        {
        setState(72);
        multinote();
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

  public static class NoteContext extends ParserRuleContext {
    public NoteorrestContext noteorrest() {
      return getRuleContext(NoteorrestContext.class,0);
    }
    public NotelengthContext notelength() {
      return getRuleContext(NotelengthContext.class,0);
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
    enterRule(_localctx, 8, RULE_note);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(75);
      noteorrest();
      setState(76);
      notelength();
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

  public static class NoteorrestContext extends ParserRuleContext {
    public PitchContext pitch() {
      return getRuleContext(PitchContext.class,0);
    }
    public RestContext rest() {
      return getRuleContext(RestContext.class,0);
    }
    public NoteorrestContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_noteorrest; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof NoteGrammarListener ) ((NoteGrammarListener)listener).enterNoteorrest(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof NoteGrammarListener ) ((NoteGrammarListener)listener).exitNoteorrest(this);
    }
  }

  public final NoteorrestContext noteorrest() throws RecognitionException {
    NoteorrestContext _localctx = new NoteorrestContext(_ctx, getState());
    enterRule(_localctx, 10, RULE_noteorrest);
    try {
      setState(80);
      switch (_input.LA(1)) {
      case T__3:
      case T__4:
      case T__5:
      case T__6:
      case T__7:
      case T__8:
      case T__9:
      case T__10:
      case T__11:
      case T__12:
      case T__13:
      case T__14:
      case T__15:
      case T__16:
      case T__17:
      case T__18:
      case T__19:
        enterOuterAlt(_localctx, 1);
        {
        setState(78);
        pitch();
        }
        break;
      case T__20:
        enterOuterAlt(_localctx, 2);
        {
        setState(79);
        rest();
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

  public static class PitchContext extends ParserRuleContext {
    public BasenoteContext basenote() {
      return getRuleContext(BasenoteContext.class,0);
    }
    public AccidentalContext accidental() {
      return getRuleContext(AccidentalContext.class,0);
    }
    public OctaveContext octave() {
      return getRuleContext(OctaveContext.class,0);
    }
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
    enterRule(_localctx, 12, RULE_pitch);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(83);
      _la = _input.LA(1);
      if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5))) != 0)) {
        {
        setState(82);
        accidental();
        }
      }

      setState(85);
      basenote();
      setState(87);
      _la = _input.LA(1);
      if (_la==T__0 || _la==T__1) {
        {
        setState(86);
        octave();
        }
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

  public static class OctaveContext extends ParserRuleContext {
    public OctaveContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_octave; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof NoteGrammarListener ) ((NoteGrammarListener)listener).enterOctave(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof NoteGrammarListener ) ((NoteGrammarListener)listener).exitOctave(this);
    }
  }

  public final OctaveContext octave() throws RecognitionException {
    OctaveContext _localctx = new OctaveContext(_ctx, getState());
    enterRule(_localctx, 14, RULE_octave);
    int _la;
    try {
      setState(99);
      switch (_input.LA(1)) {
      case T__0:
        enterOuterAlt(_localctx, 1);
        {
        setState(90); 
        _errHandler.sync(this);
        _la = _input.LA(1);
        do {
          {
          {
          setState(89);
          match(T__0);
          }
          }
          setState(92); 
          _errHandler.sync(this);
          _la = _input.LA(1);
        } while ( _la==T__0 );
        }
        break;
      case T__1:
        enterOuterAlt(_localctx, 2);
        {
        setState(95); 
        _errHandler.sync(this);
        _la = _input.LA(1);
        do {
          {
          {
          setState(94);
          match(T__1);
          }
          }
          setState(97); 
          _errHandler.sync(this);
          _la = _input.LA(1);
        } while ( _la==T__1 );
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

  public static class NotelengthContext extends ParserRuleContext {
    public List<TerminalNode> DIGIT() { return getTokens(NoteGrammarParser.DIGIT); }
    public TerminalNode DIGIT(int i) {
      return getToken(NoteGrammarParser.DIGIT, i);
    }
    public NotelengthContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_notelength; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof NoteGrammarListener ) ((NoteGrammarListener)listener).enterNotelength(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof NoteGrammarListener ) ((NoteGrammarListener)listener).exitNotelength(this);
    }
  }

  public final NotelengthContext notelength() throws RecognitionException {
    NotelengthContext _localctx = new NotelengthContext(_ctx, getState());
    enterRule(_localctx, 16, RULE_notelength);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(106);
      _la = _input.LA(1);
      if (_la==DIGIT) {
        {
        setState(102); 
        _errHandler.sync(this);
        _la = _input.LA(1);
        do {
          {
          {
          setState(101);
          match(DIGIT);
          }
          }
          setState(104); 
          _errHandler.sync(this);
          _la = _input.LA(1);
        } while ( _la==DIGIT );
        }
      }

      setState(116);
      _la = _input.LA(1);
      if (_la==T__2) {
        {
        setState(108);
        match(T__2);
        setState(114);
        _la = _input.LA(1);
        if (_la==DIGIT) {
          {
          setState(110); 
          _errHandler.sync(this);
          _la = _input.LA(1);
          do {
            {
            {
            setState(109);
            match(DIGIT);
            }
            }
            setState(112); 
            _errHandler.sync(this);
            _la = _input.LA(1);
          } while ( _la==DIGIT );
          }
        }

        }
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

  public static class NotelengthstrictContext extends ParserRuleContext {
    public List<TerminalNode> DIGIT() { return getTokens(NoteGrammarParser.DIGIT); }
    public TerminalNode DIGIT(int i) {
      return getToken(NoteGrammarParser.DIGIT, i);
    }
    public NotelengthstrictContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_notelengthstrict; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof NoteGrammarListener ) ((NoteGrammarListener)listener).enterNotelengthstrict(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof NoteGrammarListener ) ((NoteGrammarListener)listener).exitNotelengthstrict(this);
    }
  }

  public final NotelengthstrictContext notelengthstrict() throws RecognitionException {
    NotelengthstrictContext _localctx = new NotelengthstrictContext(_ctx, getState());
    enterRule(_localctx, 18, RULE_notelengthstrict);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(119); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(118);
        match(DIGIT);
        }
        }
        setState(121); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( _la==DIGIT );
      setState(123);
      match(T__2);
      setState(125); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(124);
        match(DIGIT);
        }
        }
        setState(127); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( _la==DIGIT );
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

  public static class AccidentalContext extends ParserRuleContext {
    public AccidentalContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_accidental; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof NoteGrammarListener ) ((NoteGrammarListener)listener).enterAccidental(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof NoteGrammarListener ) ((NoteGrammarListener)listener).exitAccidental(this);
    }
  }

  public final AccidentalContext accidental() throws RecognitionException {
    AccidentalContext _localctx = new AccidentalContext(_ctx, getState());
    enterRule(_localctx, 20, RULE_accidental);
    try {
      setState(136);
      switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
      case 1:
        enterOuterAlt(_localctx, 1);
        {
        setState(129);
        match(T__3);
        }
        break;
      case 2:
        enterOuterAlt(_localctx, 2);
        {
        {
        setState(130);
        match(T__3);
        setState(131);
        match(T__3);
        }
        }
        break;
      case 3:
        enterOuterAlt(_localctx, 3);
        {
        setState(132);
        match(T__4);
        }
        break;
      case 4:
        enterOuterAlt(_localctx, 4);
        {
        {
        setState(133);
        match(T__4);
        setState(134);
        match(T__4);
        }
        }
        break;
      case 5:
        enterOuterAlt(_localctx, 5);
        {
        setState(135);
        match(T__5);
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

  public static class BasenoteContext extends ParserRuleContext {
    public BasenoteContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_basenote; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof NoteGrammarListener ) ((NoteGrammarListener)listener).enterBasenote(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof NoteGrammarListener ) ((NoteGrammarListener)listener).exitBasenote(this);
    }
  }

  public final BasenoteContext basenote() throws RecognitionException {
    BasenoteContext _localctx = new BasenoteContext(_ctx, getState());
    enterRule(_localctx, 22, RULE_basenote);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(138);
      _la = _input.LA(1);
      if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19))) != 0)) ) {
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

  public static class RestContext extends ParserRuleContext {
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
    enterRule(_localctx, 24, RULE_rest);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(140);
      match(T__20);
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

  public static class TupletelementContext extends ParserRuleContext {
    public TupletspecContext tupletspec() {
      return getRuleContext(TupletspecContext.class,0);
    }
    public List<NoteelementContext> noteelement() {
      return getRuleContexts(NoteelementContext.class);
    }
    public NoteelementContext noteelement(int i) {
      return getRuleContext(NoteelementContext.class,i);
    }
    public TupletelementContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_tupletelement; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof NoteGrammarListener ) ((NoteGrammarListener)listener).enterTupletelement(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof NoteGrammarListener ) ((NoteGrammarListener)listener).exitTupletelement(this);
    }
  }

  public final TupletelementContext tupletelement() throws RecognitionException {
    TupletelementContext _localctx = new TupletelementContext(_ctx, getState());
    enterRule(_localctx, 26, RULE_tupletelement);
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
      setState(142);
      tupletspec();
      setState(144); 
      _errHandler.sync(this);
      _alt = 1;
      do {
        switch (_alt) {
        case 1:
          {
          {
          setState(143);
          noteelement();
          }
          }
          break;
        default:
          throw new NoViableAltException(this);
        }
        setState(146); 
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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

  public static class TupletspecContext extends ParserRuleContext {
    public TerminalNode DIGIT() { return getToken(NoteGrammarParser.DIGIT, 0); }
    public TupletspecContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_tupletspec; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof NoteGrammarListener ) ((NoteGrammarListener)listener).enterTupletspec(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof NoteGrammarListener ) ((NoteGrammarListener)listener).exitTupletspec(this);
    }
  }

  public final TupletspecContext tupletspec() throws RecognitionException {
    TupletspecContext _localctx = new TupletspecContext(_ctx, getState());
    enterRule(_localctx, 28, RULE_tupletspec);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(148);
      match(T__21);
      setState(149);
      match(DIGIT);
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

  public static class MultinoteContext extends ParserRuleContext {
    public List<NoteContext> note() {
      return getRuleContexts(NoteContext.class);
    }
    public NoteContext note(int i) {
      return getRuleContext(NoteContext.class,i);
    }
    public MultinoteContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_multinote; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof NoteGrammarListener ) ((NoteGrammarListener)listener).enterMultinote(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof NoteGrammarListener ) ((NoteGrammarListener)listener).exitMultinote(this);
    }
  }

  public final MultinoteContext multinote() throws RecognitionException {
    MultinoteContext _localctx = new MultinoteContext(_ctx, getState());
    enterRule(_localctx, 30, RULE_multinote);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(151);
      match(T__22);
      setState(153); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(152);
        note();
        }
        }
        setState(155); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20))) != 0) );
      setState(157);
      match(T__23);
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

  public static class BarlineContext extends ParserRuleContext {
    public BarlineContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_barline; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof NoteGrammarListener ) ((NoteGrammarListener)listener).enterBarline(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof NoteGrammarListener ) ((NoteGrammarListener)listener).exitBarline(this);
    }
  }

  public final BarlineContext barline() throws RecognitionException {
    BarlineContext _localctx = new BarlineContext(_ctx, getState());
    enterRule(_localctx, 32, RULE_barline);
    try {
      setState(170);
      switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
      case 1:
        enterOuterAlt(_localctx, 1);
        {
        setState(159);
        match(T__24);
        }
        break;
      case 2:
        enterOuterAlt(_localctx, 2);
        {
        {
        setState(160);
        match(T__24);
        setState(161);
        match(T__24);
        }
        }
        break;
      case 3:
        enterOuterAlt(_localctx, 3);
        {
        {
        setState(162);
        match(T__22);
        setState(163);
        match(T__24);
        }
        }
        break;
      case 4:
        enterOuterAlt(_localctx, 4);
        {
        {
        setState(164);
        match(T__24);
        setState(165);
        match(T__23);
        }
        }
        break;
      case 5:
        enterOuterAlt(_localctx, 5);
        {
        {
        setState(166);
        match(T__25);
        setState(167);
        match(T__24);
        }
        }
        break;
      case 6:
        enterOuterAlt(_localctx, 6);
        {
        {
        setState(168);
        match(T__24);
        setState(169);
        match(T__25);
        }
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

  public static class NthrepeatContext extends ParserRuleContext {
    public TerminalNode DIGIT() { return getToken(NoteGrammarParser.DIGIT, 0); }
    public NthrepeatContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_nthrepeat; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof NoteGrammarListener ) ((NoteGrammarListener)listener).enterNthrepeat(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof NoteGrammarListener ) ((NoteGrammarListener)listener).exitNthrepeat(this);
    }
  }

  public final NthrepeatContext nthrepeat() throws RecognitionException {
    NthrepeatContext _localctx = new NthrepeatContext(_ctx, getState());
    enterRule(_localctx, 34, RULE_nthrepeat);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(172);
      match(T__22);
      setState(173);
      match(DIGIT);
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

  public static class MidtunefieldContext extends ParserRuleContext {
    public FieldvoiceContext fieldvoice() {
      return getRuleContext(FieldvoiceContext.class,0);
    }
    public MidtunefieldContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_midtunefield; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof NoteGrammarListener ) ((NoteGrammarListener)listener).enterMidtunefield(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof NoteGrammarListener ) ((NoteGrammarListener)listener).exitMidtunefield(this);
    }
  }

  public final MidtunefieldContext midtunefield() throws RecognitionException {
    MidtunefieldContext _localctx = new MidtunefieldContext(_ctx, getState());
    enterRule(_localctx, 36, RULE_midtunefield);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(175);
      fieldvoice();
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

  public static class FieldvoiceContext extends ParserRuleContext {
    public AnythingContext anything() {
      return getRuleContext(AnythingContext.class,0);
    }
    public EndoflineContext endofline() {
      return getRuleContext(EndoflineContext.class,0);
    }
    public FieldvoiceContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_fieldvoice; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof NoteGrammarListener ) ((NoteGrammarListener)listener).enterFieldvoice(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof NoteGrammarListener ) ((NoteGrammarListener)listener).exitFieldvoice(this);
    }
  }

  public final FieldvoiceContext fieldvoice() throws RecognitionException {
    FieldvoiceContext _localctx = new FieldvoiceContext(_ctx, getState());
    enterRule(_localctx, 38, RULE_fieldvoice);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(177);
      match(T__26);
      setState(178);
      match(T__25);
      setState(179);
      anything();
      setState(180);
      endofline();
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

  public static class CommentContext extends ParserRuleContext {
    public AnythingContext anything() {
      return getRuleContext(AnythingContext.class,0);
    }
    public TerminalNode NEWLINE() { return getToken(NoteGrammarParser.NEWLINE, 0); }
    public CommentContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_comment; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof NoteGrammarListener ) ((NoteGrammarListener)listener).enterComment(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof NoteGrammarListener ) ((NoteGrammarListener)listener).exitComment(this);
    }
  }

  public final CommentContext comment() throws RecognitionException {
    CommentContext _localctx = new CommentContext(_ctx, getState());
    enterRule(_localctx, 40, RULE_comment);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(182);
      match(T__27);
      setState(183);
      anything();
      setState(184);
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

  public static class EndoflineContext extends ParserRuleContext {
    public CommentContext comment() {
      return getRuleContext(CommentContext.class,0);
    }
    public TerminalNode NEWLINE() { return getToken(NoteGrammarParser.NEWLINE, 0); }
    public EndoflineContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_endofline; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof NoteGrammarListener ) ((NoteGrammarListener)listener).enterEndofline(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof NoteGrammarListener ) ((NoteGrammarListener)listener).exitEndofline(this);
    }
  }

  public final EndoflineContext endofline() throws RecognitionException {
    EndoflineContext _localctx = new EndoflineContext(_ctx, getState());
    enterRule(_localctx, 42, RULE_endofline);
    try {
      setState(188);
      switch (_input.LA(1)) {
      case T__27:
        enterOuterAlt(_localctx, 1);
        {
        setState(186);
        comment();
        }
        break;
      case NEWLINE:
        enterOuterAlt(_localctx, 2);
        {
        setState(187);
        match(NEWLINE);
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

  public static class AnythingContext extends ParserRuleContext {
    public List<BasenoteContext> basenote() {
      return getRuleContexts(BasenoteContext.class);
    }
    public BasenoteContext basenote(int i) {
      return getRuleContext(BasenoteContext.class,i);
    }
    public List<TerminalNode> NONBASENOTE() { return getTokens(NoteGrammarParser.NONBASENOTE); }
    public TerminalNode NONBASENOTE(int i) {
      return getToken(NoteGrammarParser.NONBASENOTE, i);
    }
    public List<RestContext> rest() {
      return getRuleContexts(RestContext.class);
    }
    public RestContext rest(int i) {
      return getRuleContext(RestContext.class,i);
    }
    public List<TerminalNode> DIGIT() { return getTokens(NoteGrammarParser.DIGIT); }
    public TerminalNode DIGIT(int i) {
      return getToken(NoteGrammarParser.DIGIT, i);
    }
    public AnythingContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_anything; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof NoteGrammarListener ) ((NoteGrammarListener)listener).enterAnything(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof NoteGrammarListener ) ((NoteGrammarListener)listener).exitAnything(this);
    }
  }

  public final AnythingContext anything() throws RecognitionException {
    AnythingContext _localctx = new AnythingContext(_ctx, getState());
    enterRule(_localctx, 44, RULE_anything);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(194); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        setState(194);
        switch (_input.LA(1)) {
        case T__6:
        case T__7:
        case T__8:
        case T__9:
        case T__10:
        case T__11:
        case T__12:
        case T__13:
        case T__14:
        case T__15:
        case T__16:
        case T__17:
        case T__18:
        case T__19:
          {
          setState(190);
          basenote();
          }
          break;
        case NONBASENOTE:
          {
          setState(191);
          match(NONBASENOTE);
          }
          break;
        case T__20:
          {
          setState(192);
          rest();
          }
          break;
        case DIGIT:
          {
          setState(193);
          match(DIGIT);
          }
          break;
        default:
          throw new NoViableAltException(this);
        }
        }
        setState(196); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << NONBASENOTE) | (1L << DIGIT))) != 0) );
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
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\"\u00c9\4\2\t\2"+
      "\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
      "\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4"+
      "\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t"+
      "\30\3\2\6\2\62\n\2\r\2\16\2\63\3\2\3\2\3\3\6\39\n\3\r\3\16\3:\3\3"+
      "\3\3\3\3\3\3\5\3A\n\3\3\4\3\4\3\4\3\4\3\4\5\4H\n\4\3\5\3\5\5\5L\n"+
      "\5\3\6\3\6\3\6\3\7\3\7\5\7S\n\7\3\b\5\bV\n\b\3\b\3\b\5\bZ\n\b\3\t"+
      "\6\t]\n\t\r\t\16\t^\3\t\6\tb\n\t\r\t\16\tc\5\tf\n\t\3\n\6\ni\n\n\r"+
      "\n\16\nj\5\nm\n\n\3\n\3\n\6\nq\n\n\r\n\16\nr\5\nu\n\n\5\nw\n\n\3\13"+
      "\6\13z\n\13\r\13\16\13{\3\13\3\13\6\13\u0080\n\13\r\13\16\13\u0081"+
      "\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u008b\n\f\3\r\3\r\3\16\3\16\3\17"+
      "\3\17\6\17\u0093\n\17\r\17\16\17\u0094\3\20\3\20\3\20\3\21\3\21\6"+
      "\21\u009c\n\21\r\21\16\21\u009d\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
      "\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00ad\n\22\3\23\3\23\3\23\3\24"+
      "\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\5\27"+
      "\u00bf\n\27\3\30\3\30\3\30\3\30\6\30\u00c5\n\30\r\30\16\30\u00c6\3"+
      "\30\2\2\31\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\2\3\3\2"+
      "\t\26\u00d7\2\61\3\2\2\2\4@\3\2\2\2\6G\3\2\2\2\bK\3\2\2\2\nM\3\2\2"+
      "\2\fR\3\2\2\2\16U\3\2\2\2\20e\3\2\2\2\22l\3\2\2\2\24y\3\2\2\2\26\u008a"+
      "\3\2\2\2\30\u008c\3\2\2\2\32\u008e\3\2\2\2\34\u0090\3\2\2\2\36\u0096"+
      "\3\2\2\2 \u0099\3\2\2\2\"\u00ac\3\2\2\2$\u00ae\3\2\2\2&\u00b1\3\2"+
      "\2\2(\u00b3\3\2\2\2*\u00b8\3\2\2\2,\u00be\3\2\2\2.\u00c4\3\2\2\2\60"+
      "\62\5\4\3\2\61\60\3\2\2\2\62\63\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2"+
      "\2\64\65\3\2\2\2\65\66\7\2\2\3\66\3\3\2\2\2\679\5\6\4\28\67\3\2\2"+
      "\29:\3\2\2\2:8\3\2\2\2:;\3\2\2\2;<\3\2\2\2<=\7!\2\2=A\3\2\2\2>A\5"+
      "&\24\2?A\5*\26\2@8\3\2\2\2@>\3\2\2\2@?\3\2\2\2A\5\3\2\2\2BH\5\b\5"+
      "\2CH\5\34\17\2DH\5\"\22\2EH\5$\23\2FH\7\"\2\2GB\3\2\2\2GC\3\2\2\2"+
      "GD\3\2\2\2GE\3\2\2\2GF\3\2\2\2H\7\3\2\2\2IL\5\n\6\2JL\5 \21\2KI\3"+
      "\2\2\2KJ\3\2\2\2L\t\3\2\2\2MN\5\f\7\2NO\5\22\n\2O\13\3\2\2\2PS\5\16"+
      "\b\2QS\5\32\16\2RP\3\2\2\2RQ\3\2\2\2S\r\3\2\2\2TV\5\26\f\2UT\3\2\2"+
      "\2UV\3\2\2\2VW\3\2\2\2WY\5\30\r\2XZ\5\20\t\2YX\3\2\2\2YZ\3\2\2\2Z"+
      "\17\3\2\2\2[]\7\3\2\2\\[\3\2\2\2]^\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_f"+
      "\3\2\2\2`b\7\4\2\2a`\3\2\2\2bc\3\2\2\2ca\3\2\2\2cd\3\2\2\2df\3\2\2"+
      "\2e\\\3\2\2\2ea\3\2\2\2f\21\3\2\2\2gi\7 \2\2hg\3\2\2\2ij\3\2\2\2j"+
      "h\3\2\2\2jk\3\2\2\2km\3\2\2\2lh\3\2\2\2lm\3\2\2\2mv\3\2\2\2nt\7\5"+
      "\2\2oq\7 \2\2po\3\2\2\2qr\3\2\2\2rp\3\2\2\2rs\3\2\2\2su\3\2\2\2tp"+
      "\3\2\2\2tu\3\2\2\2uw\3\2\2\2vn\3\2\2\2vw\3\2\2\2w\23\3\2\2\2xz\7 "+
      "\2\2yx\3\2\2\2z{\3\2\2\2{y\3\2\2\2{|\3\2\2\2|}\3\2\2\2}\177\7\5\2"+
      "\2~\u0080\7 \2\2\177~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\177\3\2\2"+
      "\2\u0081\u0082\3\2\2\2\u0082\25\3\2\2\2\u0083\u008b\7\6\2\2\u0084"+
      "\u0085\7\6\2\2\u0085\u008b\7\6\2\2\u0086\u008b\7\7\2\2\u0087\u0088"+
      "\7\7\2\2\u0088\u008b\7\7\2\2\u0089\u008b\7\b\2\2\u008a\u0083\3\2\2"+
      "\2\u008a\u0084\3\2\2\2\u008a\u0086\3\2\2\2\u008a\u0087\3\2\2\2\u008a"+
      "\u0089\3\2\2\2\u008b\27\3\2\2\2\u008c\u008d\t\2\2\2\u008d\31\3\2\2"+
      "\2\u008e\u008f\7\27\2\2\u008f\33\3\2\2\2\u0090\u0092\5\36\20\2\u0091"+
      "\u0093\5\b\5\2\u0092\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0092"+
      "\3\2\2\2\u0094\u0095\3\2\2\2\u0095\35\3\2\2\2\u0096\u0097\7\30\2\2"+
      "\u0097\u0098\7 \2\2\u0098\37\3\2\2\2\u0099\u009b\7\31\2\2\u009a\u009c"+
      "\5\n\6\2\u009b\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009b\3\2\2"+
      "\2\u009d\u009e\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\7\32\2\2\u00a0"+
      "!\3\2\2\2\u00a1\u00ad\7\33\2\2\u00a2\u00a3\7\33\2\2\u00a3\u00ad\7"+
      "\33\2\2\u00a4\u00a5\7\31\2\2\u00a5\u00ad\7\33\2\2\u00a6\u00a7\7\33"+
      "\2\2\u00a7\u00ad\7\32\2\2\u00a8\u00a9\7\34\2\2\u00a9\u00ad\7\33\2"+
      "\2\u00aa\u00ab\7\33\2\2\u00ab\u00ad\7\34\2\2\u00ac\u00a1\3\2\2\2\u00ac"+
      "\u00a2\3\2\2\2\u00ac\u00a4\3\2\2\2\u00ac\u00a6\3\2\2\2\u00ac\u00a8"+
      "\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad#\3\2\2\2\u00ae\u00af\7\31\2\2\u00af"+
      "\u00b0\7 \2\2\u00b0%\3\2\2\2\u00b1\u00b2\5(\25\2\u00b2\'\3\2\2\2\u00b3"+
      "\u00b4\7\35\2\2\u00b4\u00b5\7\34\2\2\u00b5\u00b6\5.\30\2\u00b6\u00b7"+
      "\5,\27\2\u00b7)\3\2\2\2\u00b8\u00b9\7\36\2\2\u00b9\u00ba\5.\30\2\u00ba"+
      "\u00bb\7!\2\2\u00bb+\3\2\2\2\u00bc\u00bf\5*\26\2\u00bd\u00bf\7!\2"+
      "\2\u00be\u00bc\3\2\2\2\u00be\u00bd\3\2\2\2\u00bf-\3\2\2\2\u00c0\u00c5"+
      "\5\30\r\2\u00c1\u00c5\7\37\2\2\u00c2\u00c5\5\32\16\2\u00c3\u00c5\7"+
      " \2\2\u00c4\u00c0\3\2\2\2\u00c4\u00c1\3\2\2\2\u00c4\u00c2\3\2\2\2"+
      "\u00c4\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6"+
      "\u00c7\3\2\2\2\u00c7/\3\2\2\2\33\63:@GKRUY^cejlrtv{\u0081\u008a\u0094"+
      "\u009d\u00ac\u00be\u00c4\u00c6";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}