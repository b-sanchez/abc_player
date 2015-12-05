package abc.sound;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
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
    public void enterNote(NoteContext ctx) { 
        singlesInVoice.add(new Rest(10));
    }

    @Override
    public void exitNote(NoteContext ctx) { }

    @Override
    public void enterAbcmusic(AbcmusicContext ctx) { 
        if(ctx.abcline(0).getText().charAt(0)=='V') {
            multipleVoices = true;
        }
        else {
            multipleVoices = false;
        }
        System.out.println(multipleVoices);
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
    public void exitNoteelement(NoteelementContext ctx) { }

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
    public void enterTupletelement(TupletelementContext ctx) { }

    @Override
    public void exitTupletelement(TupletelementContext ctx) { }

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
    public void exitBarline(BarlineContext ctx) { }

    @Override
    public void enterNthrepeat(NthrepeatContext ctx) { }

    @Override
    public void exitNthrepeat(NthrepeatContext ctx) { }

    @Override
    public void enterMidtunefield(MidtunefieldContext ctx) { }

    @Override
    public void exitMidtunefield(MidtunefieldContext ctx) { }

    @Override
    public void enterFieldvoice(FieldvoiceContext ctx) { }

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
