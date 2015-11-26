package abc.sound;

import java.util.Collections;
import java.util.List;

public class Measure {
    
    private final List<Chord> chords;
    
    public Measure(List<Chord> chords){
        this.chords = chords;
    }

    public int getDuration() {
        // TODO Auto-generated method stub
        return 0;
    }
    
    public List<Chord> getChords(){
        return Collections.unmodifiableList(this.chords);
    }
    
    public Measure transpose() {
        // TODO Auto-generated method stub
        return null;
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
    
    public boolean equals() {
        // TODO Auto-generated method stub
        return false;
    }
    
}
