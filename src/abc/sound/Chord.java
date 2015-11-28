package abc.sound;

import java.util.Collections;
import java.util.Set;

public class Chord implements Single {
    
    private final Set<Note> notes;
    
    //Rep Invariant:
    //-this.getDuration() > 0
    //Abstraction Function AF(value):
    //-
    //Safety from Rep Exposure:
    //-
    
    /**
     * Constructor for Chord object
     * @param notes: List of Note objects to be played in the Chord
     */
    public Chord(Set<Note> notes){
        this.notes = notes;
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
     * Returns the list of Notes to be played in the chord
     * @return List of Notes in the chord
     */
    public Set<Note> getSingles(){
        return Collections.unmodifiableSet(this.notes);
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
    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public String getType() {
        return "chord";
    }

}
