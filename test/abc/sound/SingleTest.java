package abc.sound;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class SingleTest {
    
    //TESTING STRATEGY:
    
    //Types to test: Note and Rest
    //Methods to test: getType, getDuration, transpose, toString
    
    //getType():
    //-Note/Rest/Chord
    
    //getDuration():
    //-Rest/Note/Chord (duration must be > 0 as part of the Rep Invariant)
    //for 
    
    //transpose():
    //-Note/Rest/Chord
    //-Within 0, 1, 2+ octaves
    //-semitonesUp = negative/positive
    
    //toString():
    //-Note, Rest, Chord
    
    //getType: Note
    @Test
    public void testGetTypeNote(){
        Single note = new Note(new Pitch('C') ,10);
        assertEquals(note.getType(), "note");
    }
    
    //getType: Rest
    @Test
    public void testGetTypeRest(){
        Single rest = new Rest(10);
        assertEquals(rest.getType(), "rest");
    }
    
    //getType: Chord
    @Test
    public void testGetTypeChord(){
        List<Note> notes = new ArrayList<>();
        notes.add(new Note(new Pitch('C') ,10));
        Single chord = new Chord(notes);
        assertEquals(chord.getType(), "chord");
    }
    
    //getDuration: Note
    @Test
    public void testGetDurationNote(){
        Single note = new Note(new Pitch('C') ,10);
        assertEquals(note.getDuration(), 10);
    }
    
    //getDuration: Rest
    @Test
    public void testGetDurationRest(){
        Single rest = new Rest(10);
        assertEquals(rest.getDuration(), 10);
    }
    
    //transpose: Rest
    @Test
    public void testTransposeRest(){
        Single rest = new Rest(10);
        assertEquals(rest.transpose(12), new Rest(10));
    }
    
    //transpose: Note, within one octave, semitonesUp +
    @Test
    public void testTransposeNoteUpWithinOne(){
        Single note = new Note(new Pitch('C') ,10);
        assertEquals(note.transpose(2), new Note(new Pitch('D') ,10));
    }
    
    //transpose: Note, within two octaves, semitonesUp +
    @Test
    public void testTransposeNoteUpWithinTwo(){
        Single note = new Note(new Pitch('C') ,10);
        assertEquals(note.transpose(Pitch.OCTAVE+2), new Note(new Pitch('D').transpose(Pitch.OCTAVE) ,10));
    }
    
    //transpose: Note, within one octave, semitonesUp -
    @Test
    public void testTransposeNoteDownWithinOne(){
        Single note = new Note(new Pitch('C') ,10);
        assertEquals(note.transpose(-Pitch.OCTAVE), new Note(new Pitch('C').transpose(-Pitch.OCTAVE) , 10));
    }
}
