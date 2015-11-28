package abc.sound;

import static org.junit.Assert.*;
import java.util.Collections;
import org.junit.Test;

public class SingleTest {
    
    //TESTING STRATEGY:
    
    //Types to test: Note and Rest
    //Methods to test: getType, getPitch, getDuration, transpose, toString
    
    //getType():
    //-Note/Rest
    
    //getPitch():
    //-Note
    //-0, 1, 2+ octaves up
    
    //getDuration():
    //-Rest/Note (duration must be > 0 as part of the Rep Invariant)
    
    //transpose():
    //-Note/Rest
    //-Within 0, 1, 2+ octaves
    //-semitonesUp = negative/positive
    
    //toString():
    //-Note, Rest
    
    @Test
    public void testGetTypeNote(){
        Single note = new Note(new Pitch('C') ,10);
        assertEquals(note.getType(), "note");
    }
    
    @Test
    public void testGetTypeRest(){
        Single rest = new Rest(10);
        assertEquals(rest.getType(), "rest");
    }
    
    @Test
    public void testGetPitchNote(){
        Single note = new Note(new Pitch('C') ,10);
        assertEquals(note.getPitch(), new Pitch('C'));
    }
    
    @Test
    public void testGetDurationNote(){
        Single note = new Note(new Pitch('C') ,10);
        assertEquals(note.getDuration(), 10);
    }
    
    @Test
    public void testGetDurationRest(){
        Single rest = new Rest(10);
        assertEquals(rest.getDuration(), 10);
    }
    
    @Test
    public void testTransposeRest(){
        Single rest = new Rest(10);
        assertEquals(rest.transpose(12), new Rest(10));
    }
    
    @Test
    public void testTransposeNote(){
        Single note = new Note(new Pitch('C') ,10);
        assertEquals(note.transpose(2), new Note(new Pitch('D') ,10));
    }
}
