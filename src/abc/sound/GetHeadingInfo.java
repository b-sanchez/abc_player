package abc.sound;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import abc.parser.HeadingGrammarListener;
import abc.parser.HeadingGrammarParser.ComposerContext;
import abc.parser.HeadingGrammarParser.DurationContext;
import abc.parser.HeadingGrammarParser.IndexContext;
import abc.parser.HeadingGrammarParser.KeyContext;
import abc.parser.HeadingGrammarParser.LengthContext;
import abc.parser.HeadingGrammarParser.MeterContext;
import abc.parser.HeadingGrammarParser.RootContext;
import abc.parser.HeadingGrammarParser.TempoContext;
import abc.parser.HeadingGrammarParser.TitleContext;
import abc.parser.HeadingGrammarParser.VoiceContext;

public class GetHeadingInfo implements HeadingGrammarListener {
    private Stack<Map<String, String>> stack = new Stack<>();
    
    public Map<String,String> getInfoMap() {
        return stack.get(0);
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
    public void enterIndex(IndexContext ctx) { }

    @Override
    public void exitIndex(IndexContext ctx) { 
        //Map<String,String> map = stack.pull();
    }

    @Override
    public void enterTitle(TitleContext ctx) { }

    @Override
    public void exitTitle(TitleContext ctx) { }

    @Override
    public void enterComposer(ComposerContext ctx) { }

    @Override
    public void exitComposer(ComposerContext ctx) { }

    @Override
    public void enterVoice(VoiceContext ctx) { }

    @Override
    public void exitVoice(VoiceContext ctx) { }

    @Override
    public void enterMeter(MeterContext ctx) { }

    @Override
    public void exitMeter(MeterContext ctx) { }

    @Override
    public void enterLength(LengthContext ctx) { }

    @Override
    public void exitLength(LengthContext ctx) { }

    @Override
    public void enterTempo(TempoContext ctx) { }

    @Override
    public void exitTempo(TempoContext ctx) { }

    @Override
    public void enterKey(KeyContext ctx) { }

    @Override
    public void exitKey(KeyContext ctx) { }

    @Override
    public void enterRoot(RootContext ctx) { 
        stack.push(new HashMap<String, String>());
    }

    @Override
    public void exitRoot(RootContext ctx) { }

    @Override
    public void enterDuration(DurationContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void exitDuration(DurationContext ctx) {
        // TODO Auto-generated method stub
        
    }

}
