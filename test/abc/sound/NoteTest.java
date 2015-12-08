package abc.sound;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NoteTest {
    //TESTING STRATEGY:
    
    //Methods to test: getPitch()
    
    //getPitch()
    //a note -1/0/1 octave up
    
    //0 octaves up
    @Test
    public void testGetPitchMiddleC(){
        Note note = new Note(new Pitch('C') ,10);
        assertEquals(note.getPitch(), new Pitch('C'));
    }
    
    //1 octave up
    @Test
    public void testGetPitchHighE(){
        Note note = new Note(new Pitch('E').transpose(Pitch.OCTAVE) ,10);
        assertEquals(note.getPitch(), new Pitch('E').transpose(Pitch.OCTAVE));
    }
    
    //1 octave down
    @Test
    public void testGetPitchLowDFlat(){
        Note note = new Note(new Pitch('D').transpose(-Pitch.OCTAVE-1) ,10);
        assertEquals(note.getPitch(), new Pitch('D').transpose(-Pitch.OCTAVE-1));
    }
}
