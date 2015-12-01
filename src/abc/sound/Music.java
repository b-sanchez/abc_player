package abc.sound;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collections;

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

import abc.parser.*;

public class Music {
    
    //Datatype Definition
    // Music = List<Singles>

    
    private final List<Single> singles;

    //Rep Invariant:
    //-this.getDuration() > 0
    //Abstraction Function AF(value):
    //-represents a piece of music that contains singles (Rests, Notes, Chords) to be played
    //Safety from Rep Exposure:
    //-singles is List of an immutable type Single, and is private and final (not passed between classes)
    
    /**
     * Parse a Music.
     * @param input expression to parse, as defined in the PS3 handout.
     * @return expression AST for the input
     * @throws IOException 
     * @throws IllegalArgumentException if the expression is invalid
     */
    public static Map<String,String> parse(File file) throws IOException {
        try {
            String input = "";
            boolean stop = false;
            for(String line: Files.readAllLines(file.toPath())) {
                if(stop) {
                    input+="";
                }
                else {
                    input+= line+'\r'+'\n';
                    if(line.charAt(0)=='K') {
                        stop=true;
                    }
                }
            }
            System.out.println(input);
            CharStream stream = new ANTLRInputStream(input);
            HeadingGrammarLexer lexer = new HeadingGrammarLexer(stream);
            TokenStream tokens = new CommonTokenStream(lexer);
            HeadingGrammarParser parser = new HeadingGrammarParser(tokens);
            lexer.reportErrorsAsExceptions();
            parser.reportErrorsAsExceptions();
            ParseTree tree = parser.root();
            GetHeadingInfo infoGetter = new GetHeadingInfo();
            new ParseTreeWalker().walk(infoGetter, tree);
            return infoGetter.getInfoMap();
        } catch(RuntimeException e) {
            throw new IllegalArgumentException();
        }
    }
    
    /**
     * Constructor for Music object
     * @param measures: List of Single objects to be played in the Music
     */
    public Music(List<Single> singles){
        this.singles = singles;
    }
    
    /**
     * Returns the time duration of the piece to be played
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
     * Transposes the singles (chord, note, or rest) in a piece up by a certain number of semitones
     * @param semitonesUp: integer number of semitones to transpose each single up 
     * @return the piece of Music whose singles are transposed up by given number of semitones
     */
    public Music transpose(int semitonesUp) {
        checkRep();
        List<Single> transposedList = new ArrayList<Single>();
        for(Single single: singles){
            transposedList.add(single.transpose(semitonesUp));
        }
        checkRep();
        return new Music(transposedList);
    }
    
    /**
     * Returns the piece of Music as a String representation of the measures within it
     * @return String representation of Music object
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
        if(obj instanceof Music){
            Music that = (Music) obj;
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
     * Plays the Music piece.
     * addNote(base, tick, duration) schedules a note with pitch value 'base'
     * starting at 'tick' to be played for 'duration' number of ticks. For example,
     * addNote(new Pitch('C').toMidiNote(), 10, 1) plays the middle C at
     * time step 10 for half the duration of a beat.
     */
    public void play(){
        try {
            SequencePlayer player = new SequencePlayer(140, 12);
    
        System.out.println(player);

        // play!
        player.play();
        
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        } catch (MidiUnavailableException mue) {
            mue.printStackTrace();
        } catch (InvalidMidiDataException imde) {
            imde.printStackTrace();
        }
    }
}
