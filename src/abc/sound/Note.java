package abc.sound;

public class Note implements Single {
    
    private static final int ARBITRARY_PRIME = 17;
    private final Pitch pitch;
    private final int duration;
    
    
    //Rep Invariant:
    //-this.duration > 0
    //Abstraction Function AF(value):
    //-represents a note in a piece of music that has a defined pitch and duration represented as pitch and duration
    //Safety from Rep Exposure:
    //-pitch is a Pitch (immutable) that is private/final 
    //-duration is immutable, private/final
    
    /**
     * Constructor for a Single that is a note
     * @param pitch a Pitch object representing the Note's pitch
     * @param duration an integer length for the note to be played
     */
    public Note(Pitch pitch, int duration){
        this.pitch = pitch;
        this.duration = duration;
        checkRep();
    }

    @Override
    public String getType() {
        return "note";
    }

    @Override
    public Single transpose(int semitonesUp) {
        checkRep();
        //Base step for transposition -- use Pitch's transpose function to transpose this Note object
        return new Note(this.pitch.transpose(semitonesUp), this.duration);
    }

    /**
     * Returns the pitch associated with this Note
     * @return pitch associated with this note
     */
    public Pitch getPitch() {
        return this.pitch;
    }

    @Override
    public int getDuration() {
        return this.duration;
    }
    
    @Override
    public String toString() {
        checkRep();
        //Just return the String of the pitch of the note
        return this.pitch.toString();
    }
    
    @Override
    public int hashCode() {
        return ARBITRARY_PRIME;
    }
    
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Note){
            Note that = (Note) obj;
            //A note is equal to another note if they have the same pitch and same duration
            return (that.getPitch().equals(this.getPitch())) && (that.getDuration() == this.getDuration());
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
