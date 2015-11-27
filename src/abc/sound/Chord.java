package abc.sound;

import java.util.Collections;
import java.util.List;

public class Chord {
    
    private final List<Single> singles;
    
    /**
     * Constructor for Chord object
     * @param singles: List of Single objects to be played in the Chord
     */
    public Chord(List<Single> singles){
        this.singles = singles;
    }
    
    /**
     * Returns the length of the chord to be played
     * @return int length of chord
     */
    public int getDuration() {
        // TODO Auto-generated method stub
        return 0;
    }
    
    /**
     * Returns the list of Singles (Notes or Rests) to be played in the chord
     * @return List of Singles in the chord
     */
    public List<Single> getSingles(){
        return Collections.unmodifiableList(this.singles);
    }
    
    /**
     * Transposes a Chord up by a certain number of semitones
     * @param semitonesUp: integer number of semitones to transpose the chord up 
     * @return the Chord whose Singles (notes or rests) are transposed up by given number of semitones
     */
    public Chord transpose(int semitonesUp) {
        // TODO Auto-generated method stub
        return null;
    }
    
    /**
     * Returns the Chord as a String representation of the Singles with it
     * @return String representation of Chord
     */
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return null;
    }
    
    /**
     * Returns integer hashCode for this chord according to the Object contract
     * @return int hashCode for the Chord (two equivalent chords have the same hashcode)
     */
    @Override
    public int hashCode() {
        return 17;
    }
    
    /**
     * Determines equality of two Chord objects by checking for structural equality
     * @param that: Object to compare this Chord with
     * @return true if two Chord objects are identical 
     */
    public boolean equals(Object that) {
        // TODO Auto-generated method stub
        return false;
    }
}
