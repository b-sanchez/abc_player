package abc.sound;

import java.io.IOException;
import java.util.Collections;

import java.util.List;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;

public class Music {
    
    //Datatype Definition
    // Music = List<Singles>

    
    private final List<Single> singles;

    //Rep Invariant:
    //-this.getDuration() > 0
    //Abstraction Function AF(value):
    //-
    //Safety from Rep Exposure:
    //-
    
    /**
     * Constructor for Music object
     * @param measures: List of Measure objects to be played in the Music
     */
    public Music(List<Single> singles){
        this.singles = singles;
    }
    
    /**
     * Returns the time duration of the piece to be played
     * @return int duration of piece
     */
    public int getDuration() {
        // TODO Auto-generated method stub
        return 0;
    }
    
    /**
     * Returns the list of measures to be played in the measure
     * @return List of measures in the Music object
     */
    public List<Single> getSingles(){
        return Collections.unmodifiableList(this.singles);
    }
    
    /**
     * Transposes the measures in a piece up by a certain number of semitones
     * @param semitonesUp: integer number of semitones to transpose each measure up 
     * @return the piece of Music whose meaures are transposed up by given number of semitones
     */
    public Music transpose() {
        // TODO Auto-generated method stub
        return null;
    }
    
    /**
     * Returns the piece of Music as a String representation of the measures within it
     * @return String representation of Music object
     */
    @Override
    public String toString() {
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
            for(int i = 0; i <= that.getSingles().size(); i++){
                if(!(this.getSingles().get(i).equals(that.getSingles().get(i)))){
                    return false;
                }
            }
            return true;
        }
        return false;
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
