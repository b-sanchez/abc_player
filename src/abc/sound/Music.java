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

    private static final int TICKS_PER_BEAT = 48;
    private static final int DEFAULT_BEAT_LENGTH = 4;
    private static final int ARBITRARY_PRIME = 17;
    private static final int DEFAULT_TEMPO = 100;
    private final List<Voice> voices;
    private final Map<String,String> infoMap;

    //Rep Invariant:
    //-this.getDuration() > 0
    //-duration of all Voice objects in voices are the same
    //Abstraction Function AF(value):
    //-represents a piece of music that contains voices to be played represented as voices
    //Safety from Rep Exposure:
    //-voices is List of immutable Voice objects, which contains immutable Singles, and is private and final and not passed in any mutable form
    //-
    
    /**
     * Parse a Music.
     * @param file abc file to parse
     * @return a map of all the heading info given by the abc file
     * @throws IOException 
     * @throws IllegalArgumentException if the expression is invalid
     */
    public static Map<String,String> parseInfo(File file) throws IOException {
        try {
            String input = "";
            String input2 = "";
            boolean stop = false;
            List<String> voicesInMap = new ArrayList<>();
            int numVoices = 0;
            Map<String, String> otherVoiceMap = new HashMap<>();
            for(String line: Files.readAllLines(file.toPath())) {
                if(!stop) {
                    input+= line+'\r'+'\n';
                    if(line.charAt(0)=='K') {
                        stop=true;
                    }
                }
                else {
                    input2 += line+'\r'+'\n';
                }
                String newLine = line.replaceAll("\\s+", "");
                if(newLine.length()>=3 && !voicesInMap.contains(newLine.substring(2)) && newLine.charAt(0)=='V') {
                    voicesInMap.add(newLine.substring(2));
                    otherVoiceMap.put("V"+numVoices,newLine.substring(2));
                    numVoices++;
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
            Map<String, String> preVoiceMap = infoGetter.getInfoMap();
            for(String voice: otherVoiceMap.keySet()) {
                if(!preVoiceMap.containsKey(otherVoiceMap)) {
                    preVoiceMap.put(voice, otherVoiceMap.get(voice));
                }
            }
            return preVoiceMap;
        } catch(RuntimeException e) {
            throw new IllegalArgumentException();
        }
    }
    
    
    /**
     * Constructor for Music object
     * @param voices list of Voice objects to be played in the Music
     */
    public Music(List<Voice> voices){
        this.voices = voices;
        this.infoMap = new HashMap<String,String>();
        checkRep();
    }
    
    /**
     * Constructor for Music object
     * @param file abc file to be played in the Music
     */
    public Music(File file) throws IOException {
        this.infoMap = Music.parseInfo(file);
        List<Voice> voices = new ArrayList<>();
        for(String thing: this.infoMap.keySet()) {
            if(thing.charAt(0)=='V') {
                voices.add(new Voice(file, infoMap.get(thing), this.infoMap.get("K")));
            }
        }
        if(voices.isEmpty()) {
            voices.add(new Voice(file, "only", this.infoMap.get("K")));
        }
        this.voices =  voices;
        checkRep();
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
     * Returns the list of voices to be played in the music
     * @return List of voices in the Music object
     */
    public List<Voice> getVoices(){
        checkRep();
        return Collections.unmodifiableList(this.voices);
    }
    
    /**
     * Transposes the Music up by a certain number of semitones
     * @param semitonesUp integer number of semitones to transpose each single up, can be negative
     * @return the piece of Music that is transposed up by given number of semitones
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
    
    @Override
    public int hashCode() {
        return ARBITRARY_PRIME;
    }
    
    @Override
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
     */
    public void play(){
        int tempo;
        if(this.infoMap.containsKey("Q")){
            tempo = Integer.parseInt(this.infoMap.get("Q").split("=")[1]);
        }
        else{
            tempo = DEFAULT_TEMPO;
        }
        if(this.infoMap.containsKey("L")){
            if (this.infoMap.get("L").contains("/")){
                tempo = tempo / DEFAULT_BEAT_LENGTH;
                tempo = tempo * Integer.parseInt(this.infoMap.get("L").substring(2));
            }
            else{
                tempo = tempo / Integer.parseInt(this.infoMap.get("L"));
            } 
        }
        else if(this.infoMap.containsKey("M")){
            if (Double.parseDouble(this.infoMap.get("M").split("/")[0])/Double.parseDouble(this.infoMap.get("M").split("/")[1]) >= .75){
                tempo = tempo * 2;
            }
            else{
                tempo = tempo * 4; 
            }
        }
        try {
            if(this.infoMap.containsKey("Q")){
                if (this.infoMap.get("Q").split("=")[0].contains("/")){
                    tempo = tempo * DEFAULT_BEAT_LENGTH;
                    tempo = tempo / Integer.parseInt(this.infoMap.get("Q").split("=")[0].substring(2));
                }
                else{
                    tempo = tempo * Integer.parseInt(this.infoMap.get("Q").split("=")[0]);
                }
            }
            else if(this.infoMap.containsKey("L")){
                if (this.infoMap.get("L").contains("/")){
                    tempo = tempo * DEFAULT_BEAT_LENGTH;
                    tempo = tempo / Integer.parseInt(this.infoMap.get("L").substring(2));
                }
                else{
                    tempo = tempo * Integer.parseInt(this.infoMap.get("L"));
                } 
            }
            else if(this.infoMap.containsKey("M")){
                if (Double.parseDouble(this.infoMap.get("M").split("/")[0])/Double.parseDouble(this.infoMap.get("M").split("/")[1]) >= .75){
                    tempo = tempo / 2;
                }
                else{
                    tempo = tempo / 4; 
                }
            }
            
            
            SequencePlayer player = new SequencePlayer(tempo, TICKS_PER_BEAT);
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
            checkRep();
            player.play();
            try {
                System.in.read();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (MidiUnavailableException | InvalidMidiDataException e) {
            e.printStackTrace();
        }
        
    }
}
