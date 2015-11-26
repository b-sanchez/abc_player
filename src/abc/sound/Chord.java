package abc.sound;

import java.util.Collections;
import java.util.List;

public class Chord {
    
    private final List<Single> singles;
    
    public Chord(List<Single> singles){
        this.singles = singles;
    }
    
    public int getDuration() {
        // TODO Auto-generated method stub
        return 0;
    }
    
    public List<Single> getSingles(){
        return Collections.unmodifiableList(this.singles);
    }
    
    public Chord transpose() {
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
