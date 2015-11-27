package abc.sound;

import java.util.Collections;
import java.util.List;

public class Music {
    
    //Datatype Definition
    // Music = List<Measure>
    // Measure = List<Chord>
    // Chord = List<Single>
    
    private final List<Measure> measures;
    
    /**
     * Constructor for Music object
     * @param measures: List of Measure objects to be played in the Music
     */
    public Music(List<Measure> measures){
        this.measures = measures;
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
    public List<Measure> getMeasures(){
        return Collections.unmodifiableList(this.measures);
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
        // TODO Auto-generated method stub
        return null;
    }
    
    /**
     * Returns integer hashCode for the piece of Music according to the Object contract
     * @return int hashCode for the piece of Music (two equivalent pieces of Music have the same hashcode)
     */
    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return 0;
    }
    
    /**
     * Determines equality of two Music  objects by checking for structural equality
     * @param that: Object to compare this Music with
     * @return true if two Music objects are identical 
     */
    public boolean equals() {
        // TODO Auto-generated method stub
        return false;
    }

}
