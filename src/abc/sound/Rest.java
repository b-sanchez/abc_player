package abc.sound;

public class Rest implements Single {
    
    private final int duration;
    
    public Rest(int duration){
        this.duration = duration;
    }

    @Override
    public String getType() {
        return "rest";
    }

    @Override
    public Single transpose() {
        // TODO Auto-generated method stub
        return null;
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
