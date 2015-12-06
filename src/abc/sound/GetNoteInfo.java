package abc.sound;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

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
    
    public GetNoteInfo(String name) {
        nameOfVoice = name;
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
                duration = 24;
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
                    pitchAfterAccidentalParse = basenote;
                } 
                else if(ctx.noteorrest().pitch().accidental()==null){
                    pitchAfterAccidentalParse = basenote.transpose(this.accidentalMap.get(mapKey));
                }
                else if((this.accidentalMap.containsKey(mapKey) && this.accidentalMap.get(mapKey)==1) || ctx.noteorrest().pitch().accidental().getText().equals("^")) {
                    pitchAfterAccidentalParse = basenote.transpose(1);
                    accidentalMap.put(mapKey, 1);
                }
                else if((this.accidentalMap.containsKey(mapKey) && this.accidentalMap.get(mapKey)==-2) || ctx.noteorrest().pitch().accidental().getText().equals("__")) {
                    pitchAfterAccidentalParse = basenote.transpose(-2);
                    accidentalMap.put(mapKey, -2);
                }
                else if((this.accidentalMap.containsKey(mapKey) && this.accidentalMap.get(mapKey)==-1) || ctx.noteorrest().pitch().accidental().getText().equals("_")) {
                    pitchAfterAccidentalParse = basenote.transpose(-1);
                    accidentalMap.put(mapKey, -1);
                }
                else if(ctx.noteorrest().pitch().accidental().getText().equals("=")) {
                    pitchAfterAccidentalParse = basenote;
                    accidentalMap.put(mapKey, 0);
                }
                else {
                    pitchAfterAccidentalParse = basenote.transpose(2); //If ^^
                    accidentalMap.put(mapKey, 2);
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
                }
                else {
                    Set<Note> notes = new HashSet<>();
                    for(Single note: notesInElement) {
                        notes.add((Note)note);
                    }
                    singlesInVoice.add(new Chord(notes));
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
            }
            else if(single.getType().equals("note")) {
                singlesInVoice.add(new Note(((Note)single).getPitch(), scaleDurationToTuplet(single.getDuration(), ctx)));
            }
            else {
                for(Note note: ((Chord)single).getNotes()) {
                    singlesInVoice.add(new Note(((Note)note).getPitch(), scaleDurationToTuplet(note.getDuration(), ctx)));
                }
            }
        }
        notesInElement = new ArrayList<>();
        isInTupletElement = false;
    }
    
    public static int scaleDurationToTuplet(int duration, TupletelementContext ctx) {
        if(ctx.tupletspec().getText().charAt(1)==2) {
            return duration*3/2;
        }
        else if(ctx.tupletspec().getText().charAt(1)==3) {
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
        this.accidentalMap.clear();
    }

    @Override
    public void enterNthrepeat(NthrepeatContext ctx) { }

    @Override
    public void exitNthrepeat(NthrepeatContext ctx) { }

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
