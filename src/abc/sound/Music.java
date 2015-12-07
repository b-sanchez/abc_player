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

import abc.parser.*;

public class Music {
    
    //Datatype Definition
    // Music = List<Voices>
    // Voices = List<Singles>

    
    private final List<Voice> voices;
    private final Map<String,String> infoMap;

    //Rep Invariant:
    //-this.getDuration() > 0
    //-duration of all Voice objects in voices are the same
    //Abstraction Function AF(value):
    //-represents a piece of music that contains voices to be played
    //Safety from Rep Exposure:
    //-voices is List of immutable Voice objects, which contains immutable Singles, and is private and final (not passed between classes)
    
    /**
     * Parse a Music.
     * @param input expression to parse, as defined in the PS3 handout.
     * @return expression AST for the input
     * @throws IOException 
     * @throws IllegalArgumentException if the expression is invalid
     */
    public static Map<String,String> parseInfo(File file) throws IOException {
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
    public Music(List<Voice> voices){
        this.voices = voices;
        this.infoMap = new HashMap<String,String>();
    }
    
    public Music(File file) throws IOException {
        this.infoMap = Music.parseInfo(file);
        List<Voice> voices = new ArrayList<>();
        for(String thing: this.infoMap.keySet()) {
            if(thing.charAt(0)=='V') {
                voices.add(new Voice(infoMap.get(thing), file, this.infoMap.get("K")));
            }
        }
        if(voices.isEmpty()) {
            voices.add(new Voice("only", file, this.infoMap.get("K")));
        }
        this.voices =  voices;
        for(Voice voice: this.voices) {
            System.out.println("LOOK AT ME " + voice.getName().toString());
        }
    }
    
    /**
     * Returns the time duration of the piece to be played
     * @return int duration of piece
     */
    public int getDuration() {
        //According to RI, all voices must have same duration, which is duration of the Music
        int duration = voices.get(0).getDuration();
        return duration;
    }
    
    /**
     * Returns the list of singles to be played in the measure
     * @return List of measures in the Music object
     */
    public List<Voice> getVoices(){
        checkRep();
        return Collections.unmodifiableList(this.voices);
    }
    
    /**
     * Transposes the singles (chord, note, or rest) in a piece up by a certain number of semitones
     * @param semitonesUp: integer number of semitones to transpose each single up 
     * @return the piece of Music whose singles are transposed up by given number of semitones
     */
    public Music transpose(int semitonesUp) {
        checkRep();
        List<Voice> transposedList = new ArrayList<Voice>();
        for(Voice voice: voices){
            transposedList.add(voice.transpose(semitonesUp));
        }
        checkRep();
        return new Music(transposedList);
    }
    
    /**
     * Returns the piece of Music as a String representation of the voices within it
     * @return String representation of Music object
     */
    @Override
    public String toString() {
        checkRep();
        StringBuilder piece = new StringBuilder();
        for(Voice voice: voices){
            piece.append(voice.toString());
            piece.append("\n");
        }
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
            if(that.getVoices().size() != that.getVoices().size()){
                return false;
            }
            //Check for both order and that all measures inside inside are equal
            for(int i = 0; i < that.getVoices().size(); i++){
                if(!(this.getVoices().get(i).equals(that.getVoices().get(i)))){
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
        //-this.getDuration() > 0
        assert this.getDuration() > 0;
        //-duration of all Voice objects in voices are the same
        int duration = voices.get(0).getDuration();
        for(Voice voice: voices){
            if(voice.getDuration() != duration){
                assert false;
            }
        }
    }
    
    /**
     * Plays the Music piece.
     * addNote(base, tick, duration) schedules a note with pitch value 'base'
     * starting at 'tick' to be played for 'duration' number of ticks. For example,
     * addNote(new Pitch('C').toMidiNote(), 10, 1) plays the middle C at
     * time step 10 for half the duration of a beat.
     */
    public void play(){
        int tempo = 100;
        try {
            if(this.infoMap.containsKey("Q")){
                tempo = Integer.parseInt(this.infoMap.get("Q").split("=")[1]);
                if (this.infoMap.get("Q").split("=")[0].contains("/")){
                    tempo = tempo * 8;
                    tempo = tempo / Integer.parseInt(this.infoMap.get("Q").split("=")[0].substring(2));
                }
                else{
                    tempo = tempo * Integer.parseInt(this.infoMap.get("Q").split("=")[0]);
                }
            }
            else if(this.infoMap.containsKey("L")){
                if (this.infoMap.get("L").contains("/")){
                    tempo = tempo * 8;
                    tempo = tempo / Integer.parseInt(this.infoMap.get("L").substring(2));
                }
                else{
                    tempo = tempo * Integer.parseInt(this.infoMap.get("L"));
                } 
            }
            else if(this.infoMap.containsKey("M")){
                if (Integer.parseInt(this.infoMap.get("M").substring(0,1)) / Integer.parseInt(this.infoMap.get("M").substring(2,3)) >= .75){
                    tempo = tempo / 1; 
                }
                else{
                    tempo = tempo / 2;
                }
            }
            else{
                tempo = tempo / 1;
            }
            
            SequencePlayer player = new SequencePlayer(tempo, 48);
            for (Voice voice: voices){
                int counter = 0;
                for(Single single : voice.getSingles()){
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
                    counter += single.getDuration();
                }
            }
            System.out.println(player);
            player.play();
            try {
                System.in.read();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        } catch (MidiUnavailableException | InvalidMidiDataException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
}
