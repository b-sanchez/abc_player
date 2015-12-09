package abc.sound;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class VoiceTest {
    
    //TESTING STRATEGY:
    //Methods to test: getSingles, getDuration, transpose, parseSingles
    
    //getSingles():
    //-1, 2+ Singles
    
    //getDuration():
    //-1, 2+ Singles
    //-(duration must be > 0 as part of the Rep Invariant)
    
    //transpose():
    //-Within 0, 1, 2+ octaves
    //-semitonesUp = negative/positive
    
    
    @Test
    public void testSingleGetter() throws IOException {
        System.out.println(Voice.parseSingles(new File("sample_abc/fur_elise.abc"), "1", "Am"));
    }
    
    @Test
    public void testGetSinglesMultiple(){
        List<Single> noteList = new ArrayList<Single>();
        Single note1 = new Note(new Pitch('C'), 12);
        Single note2 = new Note(new Pitch('E'), 12);
        Single note3 = new Note(new Pitch('G'), 12);
        noteList.add(note1);
        noteList.add(note2);
        noteList.add(note3);
        Voice voice = new Voice(noteList, "voice", "C");
        assertEquals(noteList, voice.getSingles());
    }
    
    @Test
    public void testGetSinglesOne(){
        List<Single> noteList = new ArrayList<Single>();
        Single note1 = new Note(new Pitch('C'), 12);
        noteList.add(note1);
        Voice voice = new Voice(noteList, "voice", "C");
        assertEquals(noteList, voice.getSingles());
    }
    
    @Test
    public void testGetDurationSinglesMultiple(){
        List<Single> noteList = new ArrayList<Single>();
        Single note1 = new Note(new Pitch('C'), 12);
        Single note2 = new Note(new Pitch('E'), 12);
        Single note3 = new Note(new Pitch('G'), 12);
        noteList.add(note1);
        noteList.add(note2);
        noteList.add(note3);
        Voice voice = new Voice(noteList, "voice", "C");
        assertEquals(36, voice.getDuration());
    }
    
    @Test
    public void testGetDurationSinglesOne(){
        List<Single> noteList = new ArrayList<Single>();
        Single note1 = new Note(new Pitch('C'), 12);
        noteList.add(note1);
        Voice voice = new Voice(noteList, "voice", "C");
        assertEquals(12, voice.getDuration());
    }
    
    @Test
    public void testTransposeUpWithinOne(){
        List<Single> noteList = new ArrayList<Single>();
        Single note1 = new Note(new Pitch('C'), 12);
        Single note2 = new Note(new Pitch('D'), 12);
        Single note3 = new Note(new Pitch('G'), 12);
        noteList.add(note1);
        noteList.add(note2);
        noteList.add(note3);
        List<Single> noteList2 = new ArrayList<Single>();
        Single note4 = new Note(new Pitch('D'), 12);
        Single note5 = new Note(new Pitch('E'), 12);
        Single note6 = new Note(new Pitch('A'), 12);
        noteList2.add(note4);
        noteList2.add(note5);
        noteList2.add(note6);
        Voice voice = new Voice(noteList, "voice", "C");
        Voice voice2 = new Voice(noteList2, "voice2", "C");
        assertEquals(voice2, voice.transpose(2));
    }
    
    @Test
    public void testTransposeDownWithinOne(){
        List<Single> noteList = new ArrayList<Single>();
        Single note1 = new Note(new Pitch('D'), 12);
        Single note2 = new Note(new Pitch('E'), 12);
        Single note3 = new Note(new Pitch('A'), 12);
        noteList.add(note1);
        noteList.add(note2);
        noteList.add(note3);
        List<Single> noteList2 = new ArrayList<Single>();
        Single note4 = new Note(new Pitch('C'), 12);
        Single note5 = new Note(new Pitch('D'), 12);
        Single note6 = new Note(new Pitch('G'), 12);
        noteList2.add(note4);
        noteList2.add(note5);
        noteList2.add(note6);
        Voice voice = new Voice(noteList, "voice", "C");
        Voice voice2 = new Voice(noteList2, "voice2", "C");
        assertEquals(voice2, voice.transpose(-2));
    }
    
    @Test
    public void testTransposeUpZero(){
        List<Single> noteList = new ArrayList<Single>();
        Single note1 = new Note(new Pitch('D'), 12);
        Single note2 = new Note(new Pitch('E'), 12);
        Single note3 = new Note(new Pitch('A'), 12);
        noteList.add(note1);
        noteList.add(note2);
        noteList.add(note3);
        List<Single> noteList2 = new ArrayList<Single>();
        Single note4 = new Note(new Pitch('D'), 12);
        Single note5 = new Note(new Pitch('E'), 12);
        Single note6 = new Note(new Pitch('A'), 12);
        noteList2.add(note4);
        noteList2.add(note5);
        noteList2.add(note6);
        Voice voice = new Voice(noteList, "voice", "C");
        Voice voice2 = new Voice(noteList2, "voice2", "C");
        assertEquals(voice2, voice.transpose(0));
    }
    
    @Test
    public void testTransposeUpWithinTwo(){
        List<Single> noteList = new ArrayList<Single>();
        Single note1 = new Note(new Pitch('C'), 12);
        Single note2 = new Note(new Pitch('D'), 12);
        Single note3 = new Note(new Pitch('G'), 12);
        noteList.add(note1);
        noteList.add(note2);
        noteList.add(note3);
        List<Single> noteList2 = new ArrayList<Single>();
        Single note4 = new Note(new Pitch('D'), 12);
        Single note5 = new Note(new Pitch('E'), 12);
        Single note6 = new Note(new Pitch('A'), 12);
        noteList2.add(note4.transpose(Pitch.OCTAVE));
        noteList2.add(note5.transpose(Pitch.OCTAVE));
        noteList2.add(note6.transpose(Pitch.OCTAVE));
        Voice voice = new Voice(noteList, "voice", "C");
        Voice voice2 = new Voice(noteList2, "voice2", "C");
        assertEquals(voice2, voice.transpose(14));
    }
    
    @Test
    public void testTransposeDownWithinTwo(){
        List<Single> noteList = new ArrayList<Single>();
        Single note1 = new Note(new Pitch('D'), 12);
        Single note2 = new Note(new Pitch('E'), 12);
        Single note3 = new Note(new Pitch('A'), 12);
        noteList.add(note1);
        noteList.add(note2);
        noteList.add(note3);
        List<Single> noteList2 = new ArrayList<Single>();
        Single note4 = new Note(new Pitch('C'), 12);
        Single note5 = new Note(new Pitch('D'), 12);
        Single note6 = new Note(new Pitch('G'), 12);
        noteList2.add(note4.transpose(-Pitch.OCTAVE));
        noteList2.add(note5.transpose(-Pitch.OCTAVE));
        noteList2.add(note6.transpose(-Pitch.OCTAVE));
        Voice voice = new Voice(noteList, "voice", "C");
        Voice voice2 = new Voice(noteList2, "voice2", "C");
        assertEquals(voice2, voice.transpose(-14));
    }
    
}
