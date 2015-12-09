package abc.sound;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class SingleTest {
    
    //TESTING STRATEGY:
    
    //Types to test: Note, Rest, Chord
    //Methods to test: getType, getDuration, transpose
    
    //getType():
    //-Note/Rest/Chord
    
    //getDuration():
    //-Rest/Note/Chord (duration must be > 0 as part of the Rep Invariant)
    //for Chord, notes of different duration/same duration
    
    //transpose():
    //-Note/Rest/Chord
    //-Within 0, 1, 2+ octaves
    //-semitonesUp = negative/positive
    
    
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
        Set<Note> notes = new HashSet<>();
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
    
    //getDuration: Chord, Notes all same duration
    @Test
    public void testGetDurationChordAllSame(){
        Set<Note> notes = new HashSet<>();
        notes.add(new Note(new Pitch('C') ,10));
        notes.add(new Note(new Pitch('E') ,10));
        Single chord = new Chord(notes);
        assertEquals(chord.getDuration(), 10);
    }
    
    //getDuration: Chord, Notes different durations
    @Test
    public void testGetDurationChordDifferent(){
        Set<Note> notes = new HashSet<>();
        notes.add(new Note(new Pitch('C') ,10));
        notes.add(new Note(new Pitch('E') ,15));
        Single chord = new Chord(notes);
        assertEquals(chord.getDuration(), 15);
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
    
    //transpose: Chord, within one octave, semitonesUp +
    @Test
    public void testTransposeChordUpWithinOne(){
        Set<Note> notes = new HashSet<>();
        notes.add(new Note(new Pitch('C') ,10));
        notes.add(new Note(new Pitch('E') ,15));
        Single chord = new Chord(notes);
        assertEquals(chord.transpose(2), new Chord(transposeSetOfNotes(notes, 2)));
    }
    
    //transpose: Note, within two octaves, semitonesUp +
    @Test
    public void testTransposeChordUpWithinTwo(){
        Set<Note> notes = new HashSet<>();
        notes.add(new Note(new Pitch('C') ,10));
        notes.add(new Note(new Pitch('E') ,15));
        Single chord = new Chord(notes);
        assertEquals(chord.transpose(Pitch.OCTAVE+2), new Chord(transposeSetOfNotes(notes, Pitch.OCTAVE+2)));
    }
    
    //transpose: Note, within one octave, semitonesUp -
    @Test
    public void testTransposeChordDownWithinOne(){
        Set<Note> notes = new HashSet<>();
        notes.add(new Note(new Pitch('C') ,10));
        notes.add(new Note(new Pitch('E') ,15));
        Single chord = new Chord(notes);
        assertEquals(chord.transpose(-3), new Chord(transposeSetOfNotes(notes, -3)));
    }
    
    //helper method, transposes a list of notes up the amount of semitones indicated
    public static Set<Note> transposeSetOfNotes(Set<Note> notes, int semitonesUp) {
        Set<Note> transposedNotes = new HashSet<Note>();
        for(Note note: notes) {
            transposedNotes.add((Note) note.transpose(semitonesUp));
        }
        return transposedNotes;
    }
}
