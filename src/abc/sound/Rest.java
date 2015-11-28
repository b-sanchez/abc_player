package abc.sound;

public class Rest implements Single {
    
    private final int duration;
    
    /**
     * Constructor for a Single that is a rest
     * @param duration: an integer length for the rest to be held
     */
    public Rest(int duration){
        this.duration = duration;
    }

    @Override
    public String getType() {
        return "rest";
    }

    @Override
    public Single transpose(int semitonesUp) {
        return this;
    }

    @Override
    public Pitch getPitch() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int getDuration() {
        return this.duration;
    }
    
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return 0;
    }
    
    @Override
    public boolean equals() {
        // TODO Auto-generated method stub
        return false;
    }
    
}
