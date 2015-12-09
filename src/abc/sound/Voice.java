package abc.sound;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import abc.parser.NoteGrammarLexer;
import abc.parser.NoteGrammarParser;

public class Voice {
    
    private static final int ARBITRARY_PRIME = 17;
    private final String name;
    private final List<Single> singles;
    private final String key;



    //Rep Invariant:
    //-this.getDuration() > 0
    //Abstraction Function AF(value):
    //-represents a voice that contains singles (Rests, Notes, Chords) to be played represented by singles
    //Safety from Rep Exposure:
    //-singles is List of an immutable type Single, and is private and final and not passed in any mutable form)
    
    /**
     * Parse a Voice as a list of Singles.
     * @param file abc file to parse
     * @param name the name of the voice
     * @param key the key that the voice should be played in
     * @return List of Singles representing the voice
     * @throws IOException 
     * @throws IllegalArgumentException if the expression is invalid
     */
  
    public static List<Single> parseSingles(File file, String name, String key) throws IOException {
        try {
            String input2 = "";
            boolean stop = false;
            for(String line: Files.readAllLines(file.toPath())) {
                if(stop) {
                    if(!line.equals("")) {
                        input2+=line+'\r'+'\n';
                    }
                }
                else {
                    if(line.charAt(0)=='K') {
                        stop=true;
                    }
                }
            }
            String input3 = input2.replaceAll(" ","!");
            String input4 = input3.replaceAll("\t","!");
            CharStream stream2 = new ANTLRInputStream(input4);
            NoteGrammarLexer lexer2 = new NoteGrammarLexer(stream2);
            TokenStream tokens2 = new CommonTokenStream(lexer2);
            NoteGrammarParser parser2 = new NoteGrammarParser(tokens2);
            lexer2.reportErrorsAsExceptions();
            parser2.reportErrorsAsExceptions();
            ParseTree tree2 = parser2.abcmusic();
            GetNoteInfo infoGetter2 = new GetNoteInfo(name, key);
            new ParseTreeWalker().walk(infoGetter2, tree2);
            return infoGetter2.getSingles();
        } catch(RuntimeException e) {
            throw new IllegalArgumentException();
        }
    }
   
    /**
     * Constructor for Voice object
     * @param file the abc file that the voice comes from 
     * @param name the name of the voice
     * @param key the key the voice should be played in
     * @throws IOException 
     */
    public Voice( File file, String name, String key) throws IOException{
        this.name = name;
        this.singles = Voice.parseSingles(file, name, key);
        this.key = key;
        checkRep();
    }
    
    /**
     * Constructor for Voice object
     * @param singles List of Single objects to be played in the Voice
     * @param name the name of the voice
     * @param key the key that the voice should be played in
     */
    public Voice(List<Single> singles, String name, String key){
        this.singles = singles;
        this.name = name;
        this.key = key;
        checkRep();
    }
    
    /**
     * Returns the time duration of the voice to be played
     * @return int duration of the voice
     */
    public int getDuration() {
        //Duration of voice is the sum of all of the durations of the singles in it
        int duration = 0;
        for (Single single: this.singles){
            duration += single.getDuration();
        }
        return duration;
    }
    
    /**
     * Returns the name of the voice
     * @return String name of the voice
     */
    public String getName(){
        return this.name;
    }
    
    /**
     * Returns the key of the voice
     * @return String key of the voice
     */
    public String getKey(){
        return this.key;
    }
    
    /**
     * Returns the list of singles to be played in the Voice
     * @return List of Singles in the Voice object
     */
    public List<Single> getSingles(){
        checkRep();
        return Collections.unmodifiableList(this.singles);
    }
    
    /**
     * Transposes the voice up by a certain number of semitones
     * @param semitonesUp integer number of semitones to transpose each single up, can be negative 
     * @return a Voice transposed up by the given number of semitones
     */
    public Voice transpose(int semitonesUp) {
        checkRep();
        List<Single> transposedList = new ArrayList<Single>();
        for(Single single: singles){
            transposedList.add(single.transpose(semitonesUp));
        }
        checkRep();
        return new Voice(transposedList, this.getName(), this.getKey());
    }
    
    /**
     * Returns the Voice as a String representation of the Singles within it
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
    
    @Override
    public int hashCode() {
        return ARBITRARY_PRIME;
    }
    
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Voice){
            Voice that = (Voice) obj;
            //Have to have same number of measures
            if(this.getSingles().size() != that.getSingles().size()){
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
    
    private void checkRep(){
        assert this.getDuration() > 0;
    }
    
    
}
