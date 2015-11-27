package abc.sound;

public class Note implements Single {
    
    private final Pitch pitch;
    private final int duration;
    
    public Note(Pitch pitch, int duration){
        this.pitch = pitch;
        this.duration = duration;
    }

    @Override
    public String getType() {
        return "note";
    }

    @Override
    public Single transpose(int semitonesUp) {
        return new Note(this.pitch.transpose(semitonesUp), this.duration);
    }

    @Override
    public Pitch getPitch() {
        return this.pitch;
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
