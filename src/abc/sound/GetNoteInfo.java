package abc.sound;

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
    private Stack<List<Single>> stack = new Stack<>();
    
    public List<Single> getSingles() {
        return stack.get(0);
    }
    @Override
    public void enterEveryRule(ParserRuleContext arg0) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void exitEveryRule(ParserRuleContext arg0) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void visitErrorNode(ErrorNode arg0) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void visitTerminal(TerminalNode arg0) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void enterPitch(PitchContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void exitPitch(PitchContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void enterRest(RestContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void exitRest(RestContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void enterNote(NoteContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void exitNote(NoteContext ctx) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void enterAbcmusic(AbcmusicContext ctx) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void exitAbcmusic(AbcmusicContext ctx) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void enterAbcline(AbclineContext ctx) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void exitAbcline(AbclineContext ctx) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void enterElement(ElementContext ctx) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void exitElement(ElementContext ctx) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void enterNoteelement(NoteelementContext ctx) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void exitNoteelement(NoteelementContext ctx) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void enterNoteorrest(NoteorrestContext ctx) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void exitNoteorrest(NoteorrestContext ctx) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void enterOctave(OctaveContext ctx) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void exitOctave(OctaveContext ctx) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void enterNotelength(NotelengthContext ctx) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void exitNotelength(NotelengthContext ctx) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void enterNotelengthstrict(NotelengthstrictContext ctx) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void exitNotelengthstrict(NotelengthstrictContext ctx) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void enterAccidental(AccidentalContext ctx) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void exitAccidental(AccidentalContext ctx) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void enterBasenote(BasenoteContext ctx) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void exitBasenote(BasenoteContext ctx) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void enterTupletelement(TupletelementContext ctx) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void exitTupletelement(TupletelementContext ctx) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void enterTupletspec(TupletspecContext ctx) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void exitTupletspec(TupletspecContext ctx) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void enterMultinote(MultinoteContext ctx) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void exitMultinote(MultinoteContext ctx) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void enterBarline(BarlineContext ctx) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void exitBarline(BarlineContext ctx) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void enterNthrepeat(NthrepeatContext ctx) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void exitNthrepeat(NthrepeatContext ctx) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void enterMidtunefield(MidtunefieldContext ctx) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void exitMidtunefield(MidtunefieldContext ctx) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void enterFieldvoice(FieldvoiceContext ctx) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void exitFieldvoice(FieldvoiceContext ctx) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void enterComment(CommentContext ctx) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void exitComment(CommentContext ctx) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void enterEndofline(EndoflineContext ctx) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void exitEndofline(EndoflineContext ctx) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void enterAnything(AnythingContext ctx) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void exitAnything(AnythingContext ctx) {
        // TODO Auto-generated method stub
        
    }

}
