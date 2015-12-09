package abc.sound;

public class Rest implements Single {
    
    private static final int ARBITRARY_PRIME = 17;
    private final int duration;
 
    //Rep Invariant:
    //-this.duration > 0
    //Abstraction Function AF(value):
    //-represents a rest in the music piece that has a specified duration represented by duration
    //Safety from Rep Exposure:
    //-duration is private and final and immutable
    
    /**
     * Constructor for a Single that is a rest
     * @param duration: an integer length for the rest to be held
     */
    public Rest(int duration){
        this.duration = duration;
        checkRep();
    }

    @Override
    public String getType() {
        return "rest";
    }

    @Override
    public Single transpose(int semitonesUp) {
        checkRep();
        //Nothing to transpose
        return this;
    }

    @Override
    public int getDuration() {
        return this.duration;
    }
    
    @Override
    public String toString() {
        checkRep();
        return "z";
    }
    
    @Override
    public int hashCode() {
        return ARBITRARY_PRIME;
    }
    
    @Override
    public boolean equals(Object obj) {
        //Check if durations are the same for equality
        if(obj instanceof Rest){
            Rest that = (Rest) obj;
            return that.getDuration() == this.getDuration();
         }
         return false;
    }
    
    /**
     * Assert the Rep Invariant
     */
    private void checkRep(){
        assert this.getDuration() > 0;
    }
    
    
}
