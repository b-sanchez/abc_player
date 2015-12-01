package abc.sound;

import java.util.List;
import java.util.Map;
import java.util.Stack;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import abc.parser.NoteGrammarListener;
import abc.parser.NoteGrammarParser.ChordContext;
import abc.parser.NoteGrammarParser.DurationContext;
import abc.parser.NoteGrammarParser.NoteContext;
import abc.parser.NoteGrammarParser.PitchContext;
import abc.parser.NoteGrammarParser.RepeatsecContext;
import abc.parser.NoteGrammarParser.RestContext;
import abc.parser.NoteGrammarParser.RootContext;
import abc.parser.NoteGrammarParser.SectionContext;
import abc.parser.NoteGrammarParser.SingleContext;
import abc.parser.NoteGrammarParser.TupletContext;
import abc.parser.NoteGrammarParser.VoiceContext;

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
    public void enterDuration(DurationContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void exitDuration(DurationContext ctx) {
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
    public void enterChord(ChordContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void exitChord(ChordContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void enterTuplet(TupletContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void exitTuplet(TupletContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void enterSingle(SingleContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void exitSingle(SingleContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void enterRepeatsec(RepeatsecContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void exitRepeatsec(RepeatsecContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void enterSection(SectionContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void exitSection(SectionContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void enterVoice(VoiceContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void exitVoice(VoiceContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void enterRoot(RootContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void exitRoot(RootContext ctx) {
        // TODO Auto-generated method stub
        
    }

}
