package abc.sound;

public interface Single {

    public static Single note(Pitch pitch, int duration){
        return new Note(pitch, duration);
    }
    
    
    public static Single rest(int duration){
        return new Rest(duration);
    }
    
    
    public String getType();
    
    
    public Single transpose();
    
    
    public Pitch getPitch();
    
    
    public int getDuration();
    
    
    public boolean equals();
    
}
