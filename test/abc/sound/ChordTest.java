package abc.sound;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class ChordTest {
    
    //TESTING STRATEGY:
    //Methods to test: getSingles, getDuration, transpose, toString
   
    //getSingles():
    //-1, 2+ singles
    //-just rests, just notes, both
    
    //getDuration():
    //-1, 2+ singles in chord
    //singles of different durations in one chord
    //-(duration must be > 0 as part of the Rep Invariant)
    
    //transpose():
    //-Within 0, 1, 2+ octaves
    //-semitonesUp = negative/positive
    
    //toString():
    //-1, 2+ singles
    //-just rests, just notes, both
    
//    @Test
//    public void testGetSinglesOneNote() {
//        List<Single> notes = new ArrayList<>();
//        notes.add(new Note(new Pitch('C'), 10));
//        Chord chord = new Chord(notes);
//        assertEquals(chord.getSingles(), Arrays.asList(new Note(new Pitch('C'), 10)));
//    }
//    
//    @Test
//    public void testGetSinglesOneRest() {
//        List<Single> notes = new ArrayList<>();
//        notes.add(new Note(new Pitch('C'), 10));
//        Chord chord = new Chord(notes);
//        assertEquals(chord.getSingles(), Arrays.asList(new Note(new Pitch('C'), 10)));
//    }
}
