package abc.sound;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import abc.parser.NoteGrammarListener;
import abc.parser.NoteGrammarParser.AbclineContext;
import abc.parser.NoteGrammarParser.AbcmusicContext;
import abc.parser.NoteGrammarParser.AccidentalContext;
import abc.parser.NoteGrammarParser.AnythingContext;
import abc.parser.NoteGrammarParser.BarlineContext;
import abc.parser.NoteGrammarParser.BasenoteContext;
import abc.parser.NoteGrammarParser.CommentContext;
import abc.parser.NoteGrammarParser.ElementContext;
import abc.parser.NoteGrammarParser.EndoflineContext;
import abc.parser.NoteGrammarParser.FieldvoiceContext;
import abc.parser.NoteGrammarParser.MidtunefieldContext;
import abc.parser.NoteGrammarParser.MultinoteContext;
import abc.parser.NoteGrammarParser.NoteContext;
import abc.parser.NoteGrammarParser.NoteelementContext;
import abc.parser.NoteGrammarParser.NotelengthContext;
import abc.parser.NoteGrammarParser.NotelengthstrictContext;
import abc.parser.NoteGrammarParser.NoteorrestContext;
import abc.parser.NoteGrammarParser.NthrepeatContext;
import abc.parser.NoteGrammarParser.OctaveContext;
import abc.parser.NoteGrammarParser.PitchContext;
import abc.parser.NoteGrammarParser.RestContext;
import abc.parser.NoteGrammarParser.TupletelementContext;
import abc.parser.NoteGrammarParser.TupletspecContext;

public class GetNoteInfo implements NoteGrammarListener {
    private final List<Single> singlesInVoice = new ArrayList<>();
    private boolean multipleVoices;
    private final String nameOfVoice;
    private String currentVoiceBeingParsed;
    private List<Single> notesInElement = new ArrayList<>();
    private final int TICKS_PER_BEAT = 48;
    private boolean isInTupletElement;
    private Map<String,Integer> accidentalMap = new HashMap<>();
    private Map<String,Integer> keyMap = new HashMap<>();
    private String key;
    private List<Single> singlesToRepeat;
    boolean inFirstEnding;
    
    private final Map<String,Integer> cMajorMap;
    private final Map<String,Integer> aMinorMap;
    
    private final Map<String,Integer> gMajorMap;
    private final Map<String,Integer> eMinorMap;
    
    private final Map<String,Integer> dMajorMap;
    private final Map<String,Integer> bMinorMap;
    
    private final Map<String,Integer> aMajorMap;
    private final Map<String,Integer> fSharpMinorMap;
    
    private final Map<String,Integer> eMajorMap;
    private final Map<String,Integer> cSharpMinorMap;
    
    private final Map<String,Integer> bMajorMap;
    private final Map<String,Integer> gSharpMinorMap;
    
    private final Map<String,Integer> fSharpMajorMap;
    private final Map<String,Integer> dSharpMinorMap;
    
    private final Map<String,Integer> cSharpMajorMap;
    private final Map<String,Integer> aSharpMinorMap;
    
    private final Map<String,Integer> fMajorMap;
    private final Map<String,Integer> dMinorMap;
    
    private final Map<String,Integer> bFlatMajorMap;
    private final Map<String,Integer> gMinorMap;
    
    private final Map<String,Integer> eFlatMajorMap;
    private final Map<String,Integer> cMinorMap;
    
    private final Map<String,Integer> aFlatMajorMap;
    private final Map<String,Integer> fMinorMap;
    
    private final Map<String,Integer> dFlatMajorMap;
    private final Map<String,Integer> bFlatMinorMap;
    
    private final Map<String,Integer> gFlatMajorMap;
    private final Map<String,Integer> eFlatMinorMap;
    
    private final Map<String,Integer> cFlatMajorMap;
    private final Map<String,Integer> aFlatMinorMap; 
    
    public GetNoteInfo(String name, String key) {
        nameOfVoice = name;
        this.key = key;
        this.inFirstEnding = false;
        this.singlesToRepeat = new ArrayList<>();
        cMajorMap = new HashMap<>();
        cMajorMap.put("A", 0);
        cMajorMap.put("B", 0);
        cMajorMap.put("C", 0);
        cMajorMap.put("D", 0);
        cMajorMap.put("E", 0);
        cMajorMap.put("F", 0);
        cMajorMap.put("G", 0);
        cMajorMap.put("a", 0);
        cMajorMap.put("b", 0);
        cMajorMap.put("c", 0);
        cMajorMap.put("d", 0);
        cMajorMap.put("e", 0);
        cMajorMap.put("f", 0);
        cMajorMap.put("g", 0);
        aMinorMap = cMajorMap;
        
        gMajorMap = new HashMap<>();
        gMajorMap.put("A", 0);
        gMajorMap.put("B", 0);
        gMajorMap.put("C", 0);
        gMajorMap.put("D", 0);
        gMajorMap.put("E", 0);
        gMajorMap.put("F", 1);
        gMajorMap.put("G", 0);
        gMajorMap.put("a", 0);
        gMajorMap.put("b", 0);
        gMajorMap.put("c", 0);
        gMajorMap.put("d", 0);
        gMajorMap.put("e", 0);
        gMajorMap.put("f", 1);
        gMajorMap.put("g", 0);
        eMinorMap = gMajorMap;
        
        dMajorMap = new HashMap<>();
        dMajorMap.put("A", 0);
        dMajorMap.put("B", 0);
        dMajorMap.put("C", 1);
        dMajorMap.put("D", 0);
        dMajorMap.put("E", 0);
        dMajorMap.put("F", 1);
        dMajorMap.put("G", 0);
        dMajorMap.put("a", 0);
        dMajorMap.put("b", 0);
        dMajorMap.put("c", 1);
        dMajorMap.put("d", 0);
        dMajorMap.put("e", 0);
        dMajorMap.put("f", 1);
        dMajorMap.put("g", 0);
        bMinorMap = dMajorMap;
        
        aMajorMap = new HashMap<>();
        aMajorMap.put("A", 0);
        aMajorMap.put("B", 0);
        aMajorMap.put("C", 1);
        aMajorMap.put("D", 0);
        aMajorMap.put("E", 0);
        aMajorMap.put("F", 1);
        aMajorMap.put("G", 1);
        aMajorMap.put("a", 0);
        aMajorMap.put("b", 0);
        aMajorMap.put("c", 1);
        aMajorMap.put("d", 0);
        aMajorMap.put("e", 0);
        aMajorMap.put("f", 1);
        aMajorMap.put("g", 1);
        fSharpMinorMap = aMajorMap;
        
        eMajorMap = new HashMap<>();
        eMajorMap.put("A", 0);
        eMajorMap.put("B", 0);
        eMajorMap.put("C", 1);
        eMajorMap.put("D", 1);
        eMajorMap.put("E", 0);
        eMajorMap.put("F", 1);
        eMajorMap.put("G", 1);
        eMajorMap.put("a", 0);
        eMajorMap.put("b", 0);
        eMajorMap.put("c", 1);
        eMajorMap.put("d", 1);
        eMajorMap.put("e", 0);
        eMajorMap.put("f", 1);
        eMajorMap.put("g", 1);
        cSharpMinorMap = eMajorMap;
        
        bMajorMap = new HashMap<>();
        bMajorMap.put("A", 1);
        bMajorMap.put("B", 0);
        bMajorMap.put("C", 1);
        bMajorMap.put("D", 1);
        bMajorMap.put("E", 0);
        bMajorMap.put("F", 1);
        bMajorMap.put("G", 1);
        bMajorMap.put("a", 1);
        bMajorMap.put("b", 0);
        bMajorMap.put("c", 1);
        bMajorMap.put("d", 1);
        bMajorMap.put("e", 0);
        bMajorMap.put("f", 1);
        bMajorMap.put("g", 1);
        gSharpMinorMap = bMajorMap;
        
        fSharpMajorMap = new HashMap<>();
        fSharpMajorMap.put("A", 1);
        fSharpMajorMap.put("B", 0);
        fSharpMajorMap.put("C", 1);
        fSharpMajorMap.put("D", 1);
        fSharpMajorMap.put("E", 1);
        fSharpMajorMap.put("F", 1);
        fSharpMajorMap.put("G", 1);
        fSharpMajorMap.put("a", 1);
        fSharpMajorMap.put("b", 0);
        fSharpMajorMap.put("c", 1);
        fSharpMajorMap.put("d", 1);
        fSharpMajorMap.put("e", 1);
        fSharpMajorMap.put("f", 1);
        fSharpMajorMap.put("g", 1);
        dSharpMinorMap = fSharpMajorMap;
        
        cSharpMajorMap = new HashMap<>();
        cSharpMajorMap.put("A", 1);
        cSharpMajorMap.put("B", 1);
        cSharpMajorMap.put("C", 1);
        cSharpMajorMap.put("D", 1);
        cSharpMajorMap.put("E", 1);
        cSharpMajorMap.put("F", 1);
        cSharpMajorMap.put("G", 1);
        cSharpMajorMap.put("a", 1);
        cSharpMajorMap.put("b", 1);
        cSharpMajorMap.put("c", 1);
        cSharpMajorMap.put("d", 1);
        cSharpMajorMap.put("e", 1);
        cSharpMajorMap.put("f", 1);
        cSharpMajorMap.put("g", 1);
        aSharpMinorMap = cSharpMajorMap;
        
        fMajorMap = new HashMap<>();
        fMajorMap.put("A", 0);
        fMajorMap.put("B", -1);
        fMajorMap.put("C", 0);
        fMajorMap.put("D", 0);
        fMajorMap.put("E", 0);
        fMajorMap.put("F", 0);
        fMajorMap.put("G", 0);
        fMajorMap.put("a", 0);
        fMajorMap.put("b", -1);
        fMajorMap.put("c", 0);
        fMajorMap.put("d", 0);
        fMajorMap.put("e", 0);
        fMajorMap.put("f", 0);
        fMajorMap.put("g", 0);
        dMinorMap = fMajorMap;
        
        bFlatMajorMap = new HashMap<>();
        bFlatMajorMap.put("A", 0);
        bFlatMajorMap.put("B", -1);
        bFlatMajorMap.put("C", 0);
        bFlatMajorMap.put("D", 0);
        bFlatMajorMap.put("E", -1);
        bFlatMajorMap.put("F", 0);
        bFlatMajorMap.put("G", 0);
        bFlatMajorMap.put("a", 0);
        bFlatMajorMap.put("b", -1);
        bFlatMajorMap.put("c", 0);
        bFlatMajorMap.put("d", 0);
        bFlatMajorMap.put("e", -1);
        bFlatMajorMap.put("f", 0);
        bFlatMajorMap.put("g", 0);
        gMinorMap = bFlatMajorMap;
        
        eFlatMajorMap = new HashMap<>();
        eFlatMajorMap.put("A", -1);
        eFlatMajorMap.put("B", -1);
        eFlatMajorMap.put("C", 0);
        eFlatMajorMap.put("D", 0);
        eFlatMajorMap.put("E", -1);
        eFlatMajorMap.put("F", 0);
        eFlatMajorMap.put("G", 0);
        eFlatMajorMap.put("a", -1);
        eFlatMajorMap.put("b", -1);
        eFlatMajorMap.put("c", 0);
        eFlatMajorMap.put("d", 0);
        eFlatMajorMap.put("e", -1);
        eFlatMajorMap.put("f", 0);
        eFlatMajorMap.put("g", 0);
        cMinorMap = eFlatMajorMap;
        
        aFlatMajorMap = new HashMap<>();
        aFlatMajorMap.put("A", -1);
        aFlatMajorMap.put("B", -1);
        aFlatMajorMap.put("C", 0);
        aFlatMajorMap.put("D", -1);
        aFlatMajorMap.put("E", -1);
        aFlatMajorMap.put("F", 0);
        aFlatMajorMap.put("G", 0);
        aFlatMajorMap.put("a", -1);
        aFlatMajorMap.put("b", -1);
        aFlatMajorMap.put("c", 0);
        aFlatMajorMap.put("d", -1);
        aFlatMajorMap.put("e", -1);
        aFlatMajorMap.put("f", 0);
        aFlatMajorMap.put("g", 0);
        fMinorMap = aFlatMajorMap;
        
        dFlatMajorMap = new HashMap<>();
        dFlatMajorMap.put("A", -1);
        dFlatMajorMap.put("B", -1);
        dFlatMajorMap.put("C", 0);
        dFlatMajorMap.put("D", -1);
        dFlatMajorMap.put("E", -1);
        dFlatMajorMap.put("F", 0);
        dFlatMajorMap.put("G", -1);
        dFlatMajorMap.put("a", -1);
        dFlatMajorMap.put("b", -1);
        dFlatMajorMap.put("c", 0);
        dFlatMajorMap.put("d", -1);
        dFlatMajorMap.put("e", -1);
        dFlatMajorMap.put("f", 0);
        dFlatMajorMap.put("g", -1);
        bFlatMinorMap = dFlatMajorMap;
        
        gFlatMajorMap = new HashMap<>();
        gFlatMajorMap.put("A", -1);
        gFlatMajorMap.put("B", -1);
        gFlatMajorMap.put("C", -1);
        gFlatMajorMap.put("D", -1);
        gFlatMajorMap.put("E", -1);
        gFlatMajorMap.put("F", 0);
        gFlatMajorMap.put("G", -1);
        gFlatMajorMap.put("a", -1);
        gFlatMajorMap.put("b", -1);
        gFlatMajorMap.put("c", -1);
        gFlatMajorMap.put("d", -1);
        gFlatMajorMap.put("e", -1);
        gFlatMajorMap.put("f", 0);
        gFlatMajorMap.put("g", -1);
        eFlatMinorMap = gFlatMajorMap;
        
        cFlatMajorMap = new HashMap<>();
        cFlatMajorMap.put("A", -1);
        cFlatMajorMap.put("B", -1);
        cFlatMajorMap.put("C", -1);
        cFlatMajorMap.put("D", -1);
        cFlatMajorMap.put("E", -1);
        cFlatMajorMap.put("F", -1);
        cFlatMajorMap.put("G", -1);
        cFlatMajorMap.put("a", -1);
        cFlatMajorMap.put("b", -1);
        cFlatMajorMap.put("c", -1);
        cFlatMajorMap.put("d", -1);
        cFlatMajorMap.put("e", -1);
        cFlatMajorMap.put("f", -1);
        cFlatMajorMap.put("g", -1);
        aFlatMinorMap = cFlatMajorMap;
        
        if(this.key.equals("C")) {
            for(String basenote: cMajorMap.keySet()) {
                keyMap.put(basenote, cMajorMap.get(basenote));
            }
        }
        else if(this.key.equals("Am")) {
            for(String basenote: aMinorMap.keySet()) {
                keyMap.put(basenote, aMinorMap.get(basenote));
            }
        }
        else if(this.key.equals("G")) {
            for(String basenote: gMajorMap.keySet()) {
                keyMap.put(basenote, gMajorMap.get(basenote));
            }
        }
        else if(this.key.equals("Em")) {
            for(String basenote: eMinorMap.keySet()) {
                keyMap.put(basenote, eMinorMap.get(basenote));
            }
        }
        else if(this.key.equals("D")) {
            for(String basenote: dMajorMap.keySet()) {
                keyMap.put(basenote, dMajorMap.get(basenote));
            }
        }
        else if(this.key.equals("Bm")) {
            for(String basenote: bMinorMap.keySet()) {
                keyMap.put(basenote, bMinorMap.get(basenote));
            }
        }
        else if(this.key.equals("A")) {
            for(String basenote: aMajorMap.keySet()) {
                keyMap.put(basenote, aMajorMap.get(basenote));
            }
        }
        else if(this.key.equals("^Fm")) {
            for(String basenote: fSharpMinorMap.keySet()) {
                keyMap.put(basenote, fSharpMinorMap.get(basenote));
            }
        }
        else if(this.key.equals("E")) {
            for(String basenote: eMajorMap.keySet()) {
                keyMap.put(basenote, eMajorMap.get(basenote));
            }
        }
        else if(this.key.equals("^Cm")) {
            for(String basenote: cSharpMinorMap.keySet()) {
                keyMap.put(basenote, cSharpMinorMap.get(basenote));
            }
        }
        else if(this.key.equals("B")) {
            for(String basenote: bMajorMap.keySet()) {
                keyMap.put(basenote, bMajorMap.get(basenote));
            }
        }
        else if(this.key.equals("^Gm")) {
            for(String basenote: gSharpMinorMap.keySet()) {
                keyMap.put(basenote, gSharpMinorMap.get(basenote));
            }
        }
        else if(this.key.equals("^F")) {
            for(String basenote: fSharpMajorMap.keySet()) {
                keyMap.put(basenote, fSharpMajorMap.get(basenote));
            }
        }
        else if(this.key.equals("^Dm")) {
            for(String basenote: dSharpMinorMap.keySet()) {
                keyMap.put(basenote, dSharpMinorMap.get(basenote));
            }
        }
        else if(this.key.equals("^C")) {
            for(String basenote: cSharpMajorMap.keySet()) {
                keyMap.put(basenote, cSharpMajorMap.get(basenote));
            }
        }
        else if(this.key.equals("^Am")) {
            for(String basenote: aSharpMinorMap.keySet()) {
                keyMap.put(basenote, aSharpMinorMap.get(basenote));
            }
        }
        else if(this.key.equals("F")) {
            for(String basenote: fMajorMap.keySet()) {
                keyMap.put(basenote, fMajorMap.get(basenote));
            }
        }
        else if(this.key.equals("Dm")) {
            for(String basenote: dMinorMap.keySet()) {
                keyMap.put(basenote, dMinorMap.get(basenote));
            }
        }
        else if(this.key.equals("_B")) {
            for(String basenote: bFlatMajorMap.keySet()) {
                keyMap.put(basenote, bFlatMajorMap.get(basenote));
            }
        }
        else if(this.key.equals("Gm")) {
            for(String basenote: gMinorMap.keySet()) {
                keyMap.put(basenote, gMinorMap.get(basenote));
            }
        }
        else if(this.key.equals("_E")) {
            for(String basenote: eFlatMajorMap.keySet()) {
                keyMap.put(basenote, eFlatMajorMap.get(basenote));
            }
        }
        else if(this.key.equals("Cm")) {
            for(String basenote: cMinorMap.keySet()) {
                keyMap.put(basenote, cMinorMap.get(basenote));
            }
        }
        else if(this.key.equals("_A")) {
            for(String basenote: aFlatMajorMap.keySet()) {
                keyMap.put(basenote, aFlatMajorMap.get(basenote));
            }
        }
        else if(this.key.equals("Fm")) {
            for(String basenote: fMinorMap.keySet()) {
                keyMap.put(basenote, fMinorMap.get(basenote));
            }
        }
        else if(this.key.equals("_D")) {
            for(String basenote: dFlatMajorMap.keySet()) {
                keyMap.put(basenote, dFlatMajorMap.get(basenote));
            }
        }
        else if(this.key.equals("_Bm")) {
            for(String basenote: bFlatMinorMap.keySet()) {
                keyMap.put(basenote, bFlatMinorMap.get(basenote));
            }
        }
        else if(this.key.equals("_G")) {
            for(String basenote: gFlatMajorMap.keySet()) {
                keyMap.put(basenote, gFlatMajorMap.get(basenote));
            }
        }
        else if(this.key.equals("_Em")) {
            for(String basenote: eFlatMinorMap.keySet()) {
                keyMap.put(basenote, eFlatMinorMap.get(basenote));
            }
        }
        else if(this.key.equals("_C")) {
            for(String basenote: cFlatMajorMap.keySet()) {
                keyMap.put(basenote, cFlatMajorMap.get(basenote));
            }
        }
        else if(this.key.equals("_Am")) {
            for(String basenote: aFlatMinorMap.keySet()) {
                keyMap.put(basenote, aFlatMinorMap.get(basenote));
            }
        }
    }
    
    public List<Single> getSingles() {
        return singlesInVoice;
    }

    @Override
    public void enterEveryRule(ParserRuleContext arg0) { }

    @Override
    public void exitEveryRule(ParserRuleContext arg0) { }

    @Override
    public void visitErrorNode(ErrorNode arg0) { }

    @Override
    public void visitTerminal(TerminalNode arg0) { }

    @Override
    public void enterPitch(PitchContext ctx) { }

    @Override
    public void exitPitch(PitchContext ctx) { }

    @Override
    public void enterRest(RestContext ctx) { }

    @Override
    public void exitRest(RestContext ctx) { }

    @Override
    public void enterNote(NoteContext ctx) { }

    @Override
    public void exitNote(NoteContext ctx) { 
        if(currentVoiceBeingParsed.equals(nameOfVoice) || !multipleVoices) {
            int duration;
            if(ctx.notelength().getText().equals("")) {
                duration = TICKS_PER_BEAT;
            }
            else if(ctx.notelength().getText().equals("/")) {
                duration = TICKS_PER_BEAT/2;
            }
            else if(ctx.notelength().getText().charAt(0)=='/') {
                duration = TICKS_PER_BEAT/Integer.parseInt(ctx.notelength().getText().substring(1));
            }
            else if(ctx.notelength().getText().charAt(ctx.notelength().getText().length()-1)=='/') {
                duration = TICKS_PER_BEAT*Integer.parseInt(ctx.notelength().getText().substring(0,ctx.notelength().getText().length()-1))/2;
            }
            else if(ctx.notelength().getText().indexOf('/')!=-1) {
                int indexOfSlash = ctx.notelength().getText().indexOf('/');
                duration = TICKS_PER_BEAT*Integer.parseInt(ctx.notelength().getText().substring(0, indexOfSlash))/Integer.parseInt(ctx.notelength().getText().substring(indexOfSlash+1));
            }
            else {
                duration = TICKS_PER_BEAT*Integer.parseInt(ctx.notelength().getText());
            }
            
            if(ctx.noteorrest().pitch() != null) {
                //First check if lowercase
                Pitch basenote;
                if(Character.isLowerCase(ctx.noteorrest().pitch().basenote().getText().charAt(0))) {
                    basenote = new Pitch(Character.toUpperCase(ctx.noteorrest().pitch().basenote().getText().charAt(0)));
                    basenote = basenote.transpose(Pitch.OCTAVE);
                }
                else {
                    basenote = new Pitch(ctx.noteorrest().pitch().basenote().getText().charAt(0));
                } 
                Pitch pitchAfterAccidentalParse;
                Pitch pitchAfterAll;
                String mapKey1 = ctx.noteorrest().pitch().basenote().getText();
                String mapKey = mapKey1;
                if(ctx.noteorrest().pitch().octave()!=null) {
                    mapKey = mapKey1 + ctx.noteorrest().pitch().octave().getText();
                }
                if(ctx.noteorrest().pitch().accidental()==null && !this.accidentalMap.containsKey(mapKey)) {
                    pitchAfterAccidentalParse = basenote.transpose(this.keyMap.get(mapKey1));
                } 
                else if(ctx.noteorrest().pitch().accidental()==null){
                    pitchAfterAccidentalParse = basenote.transpose(this.accidentalMap.get(mapKey));
                }
                else if(ctx.noteorrest().pitch().accidental().getText().equals("^")) {
                    pitchAfterAccidentalParse = basenote.transpose(1);
                    accidentalMap.put(mapKey, 1);
                }
                else if((ctx.noteorrest().pitch().accidental().getText().equals("__"))) {
                    pitchAfterAccidentalParse = basenote.transpose(-2);
                    accidentalMap.put(mapKey, -2);
                }
                else if((ctx.noteorrest().pitch().accidental().getText().equals("_"))) {
                    pitchAfterAccidentalParse = basenote.transpose(-1);
                    accidentalMap.put(mapKey, -1);
                }
                else if(ctx.noteorrest().pitch().accidental().getText().equals("=")) {
                    pitchAfterAccidentalParse = basenote;
                    accidentalMap.put(mapKey, 0);
                }
                else if(ctx.noteorrest().pitch().accidental().getText().equals("^^")) {
                    pitchAfterAccidentalParse = basenote.transpose(2); //If ^^
                    accidentalMap.put(mapKey, 2);
                }
                else if ((this.accidentalMap.containsKey(mapKey) && this.accidentalMap.get(mapKey)==1)){
                    pitchAfterAccidentalParse = basenote.transpose(1);
                }
                else if (this.accidentalMap.containsKey(mapKey) && this.accidentalMap.get(mapKey)==-2){
                    pitchAfterAccidentalParse = basenote.transpose(-2);
                }
                else if (this.accidentalMap.containsKey(mapKey) && this.accidentalMap.get(mapKey)==-1){
                    pitchAfterAccidentalParse = basenote.transpose(-1);
                }
                else if (this.accidentalMap.containsKey(mapKey) && this.accidentalMap.get(mapKey)==2){
                    pitchAfterAccidentalParse = basenote.transpose(2);
                }
                else if (this.accidentalMap.containsKey(mapKey) && this.accidentalMap.get(mapKey)==0){
                    pitchAfterAccidentalParse = basenote;
                }
                else{
                    pitchAfterAccidentalParse = basenote.transpose(this.keyMap.get(mapKey1));
                }
                if(ctx.noteorrest().pitch().octave()==null) {
                    pitchAfterAll = pitchAfterAccidentalParse;
                }
                else if(ctx.noteorrest().pitch().octave().getText().charAt(0)==(',')) {
                    pitchAfterAll = pitchAfterAccidentalParse.transpose(-Pitch.OCTAVE*ctx.noteorrest().pitch().octave().getText().length());
                }
                else {
                    pitchAfterAll = pitchAfterAccidentalParse.transpose(Pitch.OCTAVE*ctx.noteorrest().pitch().octave().getText().length());
                }
                notesInElement.add(new Note(pitchAfterAll, duration));
            }
            else {
                notesInElement.add(new Rest(duration));
            }
        }
    }
    

    @Override
    public void enterAbcmusic(AbcmusicContext ctx) { 
        if(ctx.abcline(0).getText().charAt(0)=='V') {
            multipleVoices = true;
        }
        else {
            multipleVoices = false;
            currentVoiceBeingParsed = "only";
        }
        isInTupletElement = false;
        
       
    }

    @Override
    public void exitAbcmusic(AbcmusicContext ctx) { }

    @Override
    public void enterAbcline(AbclineContext ctx) { }

    @Override
    public void exitAbcline(AbclineContext ctx) { }

    @Override
    public void enterElement(ElementContext ctx) { }

    @Override
    public void exitElement(ElementContext ctx) { }

    @Override
    public void enterNoteelement(NoteelementContext ctx) { }

    @Override
    public void exitNoteelement(NoteelementContext ctx) { 
        if(!isInTupletElement) {
            if(currentVoiceBeingParsed.equals(nameOfVoice) || !multipleVoices) {
                if(notesInElement.size()==1) {
                    singlesInVoice.add(notesInElement.get(0));
                    if(!this.inFirstEnding) {
                        this.singlesToRepeat.add(notesInElement.get(0));
                    }
                }
                else {
                    Set<Note> notes = new HashSet<>();
                    for(Single note: notesInElement) {
                        notes.add((Note)note);
                    }
                    singlesInVoice.add(new Chord(notes));
                    if(!this.inFirstEnding) {
                        this.singlesToRepeat.add(new Chord(notes));
                    }
                }
                notesInElement = new ArrayList<>();
            }
        }
    }

    @Override
    public void enterNoteorrest(NoteorrestContext ctx) { }

    @Override
    public void exitNoteorrest(NoteorrestContext ctx) { }

    @Override
    public void enterOctave(OctaveContext ctx) { }

    @Override
    public void exitOctave(OctaveContext ctx) { }

    @Override
    public void enterNotelength(NotelengthContext ctx) { }

    @Override
    public void exitNotelength(NotelengthContext ctx) { }

    @Override
    public void enterNotelengthstrict(NotelengthstrictContext ctx) { }

    @Override
    public void exitNotelengthstrict(NotelengthstrictContext ctx) { }

    @Override
    public void enterAccidental(AccidentalContext ctx) { }

    @Override
    public void exitAccidental(AccidentalContext ctx) { }

    @Override
    public void enterBasenote(BasenoteContext ctx) { }

    @Override
    public void exitBasenote(BasenoteContext ctx) { }

    @Override
    public void enterTupletelement(TupletelementContext ctx) { 
        isInTupletElement = true;
    }

    @Override
    public void exitTupletelement(TupletelementContext ctx) { 
        for(Single single: notesInElement) {
            if(single.getType().equals("rest")) {
                singlesInVoice.add(new Rest(scaleDurationToTuplet(single.getDuration(), ctx)));
                if(!this.inFirstEnding) {
                    this.singlesToRepeat.add(new Rest(scaleDurationToTuplet(single.getDuration(), ctx)));
                }
            }
            else if(single.getType().equals("note")) {
                singlesInVoice.add(new Note(((Note)single).getPitch(), scaleDurationToTuplet(single.getDuration(), ctx)));
                if(!this.inFirstEnding) {
                    this.singlesToRepeat.add(new Note(((Note)single).getPitch(), scaleDurationToTuplet(single.getDuration(), ctx)));
                }
            }
            else {
                for(Note note: ((Chord)single).getNotes()) {
                    singlesInVoice.add(new Note(((Note)note).getPitch(), scaleDurationToTuplet(note.getDuration(), ctx)));
                    if(!this.inFirstEnding) {
                        this.singlesToRepeat.add(new Note(((Note)note).getPitch(), scaleDurationToTuplet(note.getDuration(), ctx)));
                    }
                }
            }
        }
        notesInElement = new ArrayList<>();
        isInTupletElement = false;
    }
    
    public static int scaleDurationToTuplet(int duration, TupletelementContext ctx) {
        if(ctx.tupletspec().getText().charAt(1)=='2') {
            return duration*3/2;
        }
        else if(ctx.tupletspec().getText().charAt(1)=='3') {
            return duration*2/3;
        }
        return duration*3/4;
    }
    
    @Override
    public void enterTupletspec(TupletspecContext ctx) { }

    @Override
    public void exitTupletspec(TupletspecContext ctx) { }

    @Override
    public void enterMultinote(MultinoteContext ctx) { }

    @Override
    public void exitMultinote(MultinoteContext ctx) { }

    @Override
    public void enterBarline(BarlineContext ctx) { }

    @Override
    public void exitBarline(BarlineContext ctx) { 
        accidentalMap.clear();
        
        if(nameOfVoice.equals(currentVoiceBeingParsed)) {
            if(ctx.getText().equals("|:") || ctx.getText().equals("|]")) {
                this.singlesToRepeat.clear();
                this.inFirstEnding = false;
            }
            else if(ctx.getText().equals(":|")) {
                for(Single repeatedSingle: singlesToRepeat) {
                    this.singlesInVoice.add(repeatedSingle);
                }
                this.singlesToRepeat.clear();
                this.inFirstEnding = false;
            }
        }
    }

    @Override
    public void enterNthrepeat(NthrepeatContext ctx) { }

    @Override
    public void exitNthrepeat(NthrepeatContext ctx) { 
        if(nameOfVoice.equals(currentVoiceBeingParsed)) {
            if(ctx.DIGIT().getText().equals("1")) {
                this.inFirstEnding = true;
            }
        }
    }

    @Override
    public void enterMidtunefield(MidtunefieldContext ctx) { }

    @Override
    public void exitMidtunefield(MidtunefieldContext ctx) { }

    @Override
    public void enterFieldvoice(FieldvoiceContext ctx) { 
        currentVoiceBeingParsed = ctx.anything().getText();
    }

    @Override
    public void exitFieldvoice(FieldvoiceContext ctx) { }

    @Override
    public void enterComment(CommentContext ctx) { }

    @Override
    public void exitComment(CommentContext ctx) { }

    @Override
    public void enterEndofline(EndoflineContext ctx) { }

    @Override
    public void exitEndofline(EndoflineContext ctx) { }

    @Override
    public void enterAnything(AnythingContext ctx) { }

    @Override
    public void exitAnything(AnythingContext ctx) { }

}
