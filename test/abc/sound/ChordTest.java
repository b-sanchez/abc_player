package abc.sound;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class ChordTest {
    
    //TESTING STRATEGY:
    //Methods to test: getNotes
   
    //getNotes():
    //-1, 2+ notes
    
    @Test
    public void testGetSinglesOneNote() {
        Set<Note> notes = new HashSet<>();
        notes.add(new Note(new Pitch('C'), 10));
        Chord chord = new Chord(notes);
        assertEquals(chord.getSingles(), new HashSet<>(Arrays.asList(new Note(new Pitch('C'), 10))));
    }
    
    @Test
    public void testGetSinglesMultipleNotes() {
        Set<Note> notes = new HashSet<>();
        notes.add(new Note(new Pitch('C'), 10));
        notes.add(new Note(new Pitch('E'), 10));
        notes.add(new Note(new Pitch('G'), 10));
        Chord chord = new Chord(notes);
        assertEquals(chord.getSingles(), new HashSet<>(Arrays.asList(new Note(new Pitch('C'), 10), new Note(new Pitch('E'), 10), new Note(new Pitch('G'), 10))));
    }
}
