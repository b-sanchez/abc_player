package abc.sound;

import static org.junit.Assert.*;
import java.util.Collections;
import org.junit.Test;

public class ChordTest {
    
    //TESTING STRATEGY:
    //Methods to test: getSingles, getDuration, transpose, toString
   
    //getSingles():
    //-1, 2+ singles
    //-just rests, just notes, both
    
    //getDuration():
    //-1, 2+ singles in chord
    //-(duration must be > 0 as part of the Rep Invariant)
    
    //transpose():
    //-Within 0, 1, 2+ octaves
    //-semitonesUp = negative/positive
    
    //toString():
    //-1, 2+ singles
    //-just rests, just notes, both
}
