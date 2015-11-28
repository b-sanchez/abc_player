package abc.sound;

public interface Single {
    
    /**
     * Returns whether Single object is a "note" or a "rest"
     * @return "note" or "rest", depending on type of Single object
     */
    public String getType();
    
    /**
     * Transposes the Single object up by a certain number of semitones, ONLY if it is a Note
     * @param semitonesUp: integer number of semitones to transpose the Single object up 
     * @return the Single that is transposed up by given number of semitones
     */
    public Single transpose(int semitonesUp);
    
    /**
     * Returns the pitch of the Single, only if it is a Note
     * @return pitch of the Single object
     */
    public Pitch getPitch();
    
    /**
     * Returns the integer duration of the Single
     * @return duration of the Single object
     */
    public int getDuration();
    
    /**
     * Determines equality of two Single objects, according to music theory
     * @param that: Object to compare this Measure with
     * @return true if two Single objects are identical 
     */
    public boolean equals();
    
}
