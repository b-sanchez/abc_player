package abc.sound;


public interface Single {
    
    /**
     * Returns whether Single object is a "note" or a "rest" or a "chord"
     * @return a String of "note" or "rest" or "chord", depending on type of Single object
     */
    public String getType();
    
    /**
     * Transposes the Single object up by a certain number of semitones, which does nothing for a Rest
     * @param semitonesUp: integer number of semitones to transpose the Single object up, can be negative
     * @return the Single that is transposed up by the given number of semitones
     */
    public Single transpose(int semitonesUp);
    
    /**
     * Returns the integer duration of the Single
     * @return duration of the Single object
     */
    public int getDuration();
    
    
}
