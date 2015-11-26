package abc.sound;

import java.util.Collections;
import java.util.List;

public class Music {
    
    //Datatype Definition
    // Music = List<Measure>
    // Measure = List<Chord>
    // Chord = List<Single>
    
    private final List<Measure> measures;
    
    public Music(List<Measure> measures){
        this.measures = measures;
    }
    
    public int getDuration() {
        // TODO Auto-generated method stub
        return 0;
    }
    
    public List<Measure> getMeasures(){
        return Collections.unmodifiableList(this.measures);
    }
    
    public Music transpose() {
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
