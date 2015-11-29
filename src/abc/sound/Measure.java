package abc.sound;

import java.util.Collections;
import java.util.List;

public class Measure {
    
    private final List<Single> singles;
    
    //Rep Invariant:
    //-this.getDuration() > 0
    //Abstraction Function AF(value):
    //-
    //Safety from Rep Exposure:
    //-
    
    /**
     * Constructor for Measure object
     * @param singles: List of Single objects to be played in the Measure
     */
    public Measure(List<Single> singles){
        this.singles = singles;
    }
    
    /**
     * Returns the time duration of the measure to be played
     * @return int duration of measure
     */
    public int getDuration() {
        // TODO Auto-generated method stub
        return 0;
    }
    
    /**
     * Returns the list of Singles to be played in the measure
     * @return List of Singles in the measure
     */
    public List<Single> getSingles(){
        return Collections.unmodifiableList(this.singles);
    }
    
    /**
     * Transposes the Chords in a measure up by a certain number of semitones
     * @param semitonesUp: integer number of semitones to transpose the measure up 
     * @return the Measure whose Chords are transposed up by given number of semitones
     */
    public Measure transpose(int semitonesUp) {
        // TODO Auto-generated method stub
        return null;
    }
    
    /**
     * Returns the Measure as a String representation of the Chords within it
     * @return String representation of Measure
     */
    @Override
    public String toString() {
        //We will probably need to discuss this
        StringBuilder measure = new StringBuilder();
        measure.append("| ");
        for(Single single : singles){
            measure.append(single.toString());
            measure.append(" ");
        }
        return measure.toString();
    }
    
    /**
     * Returns integer hashCode for the Measure according to the Object contract
     * @return int hashCode for the Measure (two equivalent measures have the same hashcode)
     */
    @Override
    public int hashCode() {
        return 17;
    }
    
    /**
     * Determines equality of two Measure objects by checking for structural equality
     * @param that: Object to compare this Measure with
     * @return true if two Measure objects are identical 
     */
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Measure){
            Measure that = (Measure) obj;
            //Have to be of the same size
            if(that.getSingles().size() != that.getSingles().size()){
                return false;
            }
            //Check for both order and that everything inside is equal
            for(int i = 0; i <= that.getSingles().size(); i++){
                if(!(this.getSingles().get(i).equals(that.getSingles().get(i)))){
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    
    
}
