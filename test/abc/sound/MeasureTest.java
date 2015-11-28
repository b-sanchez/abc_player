package abc.sound;

import static org.junit.Assert.*;
import java.util.Collections;
import org.junit.Test;

public class MeasureTest {

    //TESTING STRATEGY:
    //Methods to test: getSingles, getDuration, transpose, toString
        
    //getSingles():
    //-1, 2+ chords
    //-Chords with just rests, just notes, both
    
    //getDuration():
    //-1, 2+ chords
    //-(duration must be > 0 as part of the Rep Invariant)
    
    //transpose():
    //-Within 0, 1, 2+ octaves
    //-semitonesUp = negative/positive
    
    //toString():
    //-1, 2+ chords
    //-chords with just rests, just notes, both
    
    @Test
    public void testGetSingles() {
        //Measure measure = new Measure();
    }
}
