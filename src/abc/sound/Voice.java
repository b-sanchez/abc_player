package abc.sound;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import abc.parser.HeadingGrammarLexer;
import abc.parser.HeadingGrammarParser;
import abc.parser.NoteGrammarLexer;
import abc.parser.NoteGrammarParser;

public class Voice {
    

    
    private final List<Single> singles;



    //Rep Invariant:
    //-this.getDuration() > 0
    //Abstraction Function AF(value):
    //-represents a voice that contains singles (Rests, Notes, Chords) to be played
    //-infoMap maps the header information of an abc file 
    //Safety from Rep Exposure:
    //-singles is List of an immutable type Single, and is private and final (not passed between classes)
    
    /**
     * Parse a Voice as a list of Singles.
     * @param input expression to parse, as defined in the PS3 handout.
     * @return expression AST for the input
     * @throws IOException 
     * @throws IllegalArgumentException if the expression is invalid
     */
  
    public static List<Single> parseSingles(File file) throws IOException {
        try {
            String input = "";
            String input2 = "";
            boolean stop = false;
            for(String line: Files.readAllLines(file.toPath())) {
                if(stop) {
                    input2+=line+'\r'+'\n';
                }
                else {
                    input+= line+'\r'+'\n';
                    if(line.charAt(0)=='K') {
                        stop=true;
                    }
                }
            }
            System.out.println(input2);
            CharStream stream2 = new ANTLRInputStream(input2);
            NoteGrammarLexer lexer2 = new NoteGrammarLexer(stream2);
            TokenStream tokens2 = new CommonTokenStream(lexer2);
            NoteGrammarParser parser2 = new NoteGrammarParser(tokens2);
            lexer2.reportErrorsAsExceptions();
            parser2.reportErrorsAsExceptions();
            ParseTree tree2 = parser2.abcmusic();
            GetNoteInfo infoGetter2 = new GetNoteInfo();
            new ParseTreeWalker().walk(infoGetter2, tree2);
            return infoGetter2.getSingles();
        } catch(RuntimeException e) {
            throw new IllegalArgumentException();
        }
    }
   
    /**
     * Constructor for Voice object
     * @param measures: List of Single objects to be played in the Voice
     */
    public Voice(List<Single> singles){
        this.singles = singles;
    }
    
    public Voice(File file) throws IOException {
        this.singles = Voice.parseSingles(file);
    }
    
    /**
     * Returns the time duration of the voice to be played
     * @return int duration of piece
     */
    public int getDuration() {
        int duration = 0;
        for (Single single: this.singles){
            duration += single.getDuration();
        }
        return duration;
    }
    
    /**
     * Returns the list of singles to be played in the measure
     * @return List of measures in the Music object
     */
    public List<Single> getSingles(){
        checkRep();
        return Collections.unmodifiableList(this.singles);
    }
    
    /**
     * Transposes the singles (chord, note, or rest) in a voice up by a certain number of semitones
     * @param semitonesUp: integer number of semitones to transpose each single up 
     * @return the Voice whose singles are transposed up by given number of semitones
     */
    public Voice transpose(int semitonesUp) {
        checkRep();
        List<Single> transposedList = new ArrayList<Single>();
        for(Single single: singles){
            transposedList.add(single.transpose(semitonesUp));
        }
        checkRep();
        return new Voice(transposedList);
    }
    
    /**
     * Returns the voice as a String representation of the measures within it
     * @return String representation of Voice object
     */
    @Override
    public String toString() {
        checkRep();
        StringBuilder piece = new StringBuilder();
        for(Single single: singles){
            piece.append(single.toString());
        }
        piece.append("|]");
        return piece.toString();
    }
    
    /**
     * Returns integer hashCode for the piece of Music according to the Object contract
     * @return int hashCode for the piece of Music (two equivalent pieces of Music have the same hashcode)
     */
    @Override
    public int hashCode() {
        return 17;
    }
    
    /**
     * Determines equality of two Music  objects by checking for structural equality
     * @param that: Object to compare this Music with
     * @return true if two Music objects are identical 
     */
    public boolean equals(Object obj) {
        if(obj instanceof Voice){
            Voice that = (Voice) obj;
            //Have to have same number of measures
            if(that.getSingles().size() != that.getSingles().size()){
                return false;
            }
            //Check for both order and that all measures inside inside are equal
            for(int i = 0; i < that.getSingles().size(); i++){
                if(!(this.getSingles().get(i).equals(that.getSingles().get(i)))){
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    
    /**
     * Assert the Rep Invariant
     */
    private void checkRep(){
        assert this.getDuration() > 0;
    }
    
    /**
     * Plays the Singles in this Voice object sequentially
     */
    public void play(){
        try {
            SequencePlayer player = new SequencePlayer(200, 48);
            int counter = 0;
            for(Single single : singles){
                if (single.getType().equals("note")){
                    player.addNote(((Note) single).getPitch().toMidiNote(), counter, single.getDuration());
                }
                else if (single.getType().equals("rest")){
                    player.addNote(0, counter, single.getDuration());
                }
                else{
                    for (Note note: ((Chord) single).getNotes()){
                        player.addNote(note.getPitch().toMidiNote(), counter, note.getDuration());
                    }
                }
            }
        } catch (MidiUnavailableException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InvalidMidiDataException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    
}
