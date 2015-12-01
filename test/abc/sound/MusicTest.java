package abc.sound;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class MusicTest {
    
    //TESTING STRATEGY:
    //Methods to test: getSingles, getDuration, transpose, toString
    
    //getSingles():
    //-1, 2+ Singles
    
    //getDuration():
    //-1, 2+ Singles
    //-(duration must be > 0 as part of the Rep Invariant)
    
    //transpose():
    //-Within 0, 1, 2+ octaves
    //-semitonesUp = negative/positive
    
    //toString():
    //-1, 2+ Singles
    @Test
    public void testInfoGetter() throws IOException {
        System.out.println(Music.parseSingles(new File("sample_abc/piece2.abc")));
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
        Music music = new Music(noteList);
        assertEquals(noteList, music.getSingles());
    }
    
    @Test
    public void testGetSinglesOne(){
        List<Single> noteList = new ArrayList<Single>();
        Single note1 = new Note(new Pitch('C'), 12);
        noteList.add(note1);
        Music music = new Music(noteList);
        assertEquals(noteList, music.getSingles());
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
        Music music = new Music(noteList);
        assertEquals(36, music.getDuration());
    }
    
    @Test
    public void testGetDurationSinglesOne(){
        List<Single> noteList = new ArrayList<Single>();
        Single note1 = new Note(new Pitch('C'), 12);
        noteList.add(note1);
        Music music = new Music(noteList);
        assertEquals(12, music.getDuration());
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
        Music music = new Music(noteList);
        Music music2 = new Music(noteList2);
        assertEquals(music2, music.transpose(2));
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
        Music music = new Music(noteList);
        Music music2 = new Music(noteList2);
        assertEquals(music2, music.transpose(-2));
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
        Music music = new Music(noteList);
        Music music2 = new Music(noteList2);
        assertEquals(music2, music.transpose(0));
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
        Music music = new Music(noteList);
        Music music2 = new Music(noteList2);
        assertEquals(music2, music.transpose(14));
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
        Music music = new Music(noteList);
        Music music2 = new Music(noteList2);
        assertEquals(music2, music.transpose(-14));
    }
    
}
