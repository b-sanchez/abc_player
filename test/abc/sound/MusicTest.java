package abc.sound;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class MusicTest {
    
    //TESTING STRATEGY:
    //Methods to test: getVoices, getDuration, transpose, toString
    
    //getVoices():
    //-1, 2+ Voices
    
    //getDuration():
    //-1, 2+ Voices
    //-(duration must be > 0 as part of the Rep Invariant)
    
    //transpose():
    //-Within 0, 1, 2+ octaves
    //-semitonesUp = negative/positive
    
    //toString():
    //-1, 2+ Singles

    @Test
    public void testGetVoicesMultiple(){
        List<Single> noteList = new ArrayList<Single>();
        Single note1 = new Note(new Pitch('C'), 12);
        Single note2 = new Note(new Pitch('E'), 12);
        Single note3 = new Note(new Pitch('G'), 12);
        noteList.add(note1);
        noteList.add(note2);
        noteList.add(note3);
        Voice voice = new Voice(noteList, "voice");
        Voice voice2 = new Voice(noteList, "voice2");
        List<Voice> voiceList = new ArrayList<Voice>();
        voiceList.add(voice);
        voiceList.add(voice2);
        Music music = new Music(voiceList);
        assertEquals(voiceList, music.getVoices());
    }
    
    @Test
    public void testGetVoicesOne(){
        List<Single> noteList = new ArrayList<Single>();
        Single note1 = new Note(new Pitch('C'), 12);
        noteList.add(note1);
        Voice voice = new Voice(noteList, "voice");
        List<Voice> voiceList = new ArrayList<Voice>();
        voiceList.add(voice);
        Music music = new Music(voiceList);
        assertEquals(voiceList, music.getVoices());
    }
    
    @Test
    public void testGetDurationVoicesMultiple(){
        List<Single> noteList = new ArrayList<Single>();
        Single note1 = new Note(new Pitch('C'), 12);
        Single note2 = new Note(new Pitch('E'), 12);
        Single note3 = new Note(new Pitch('G'), 12);
        noteList.add(note1);
        noteList.add(note2);
        noteList.add(note3);
        Voice voice = new Voice(noteList, "voice");
        Voice voice2 = new Voice(noteList, "voice2");
        List<Voice> voiceList = new ArrayList<Voice>();
        voiceList.add(voice);
        voiceList.add(voice2);
        Music music = new Music(voiceList);
        assertEquals(voiceList, music.getVoices());
        assertEquals(36, music.getDuration());
    }
    
    @Test
    public void testGetDurationVoicesOne(){
        List<Single> noteList = new ArrayList<Single>();
        Single note1 = new Note(new Pitch('C'), 12);
        noteList.add(note1);
        Voice voice = new Voice(noteList, "voice");
        List<Voice> voiceList = new ArrayList<Voice>();
        voiceList.add(voice);
        Music music = new Music(voiceList);
        assertEquals(voiceList, music.getVoices());
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
        Voice voice = new Voice(noteList, "voice");
        List<Voice> voiceList = new ArrayList<Voice>();
        voiceList.add(voice);
        List<Single> noteList2 = new ArrayList<Single>();
        Single note4 = new Note(new Pitch('D'), 12);
        Single note5 = new Note(new Pitch('E'), 12);
        Single note6 = new Note(new Pitch('A'), 12);
        noteList2.add(note4);
        noteList2.add(note5);
        noteList2.add(note6);
        Voice voice2 = new Voice(noteList2, "voice2");
        List<Voice> voiceList2 = new ArrayList<Voice>();
        voiceList2.add(voice2);
        Music music = new Music(voiceList);
        Music music2 = new Music(voiceList2);
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
        Voice voice = new Voice(noteList, "voice");
        List<Voice> voiceList = new ArrayList<Voice>();
        voiceList.add(voice);
        List<Single> noteList2 = new ArrayList<Single>();
        Single note4 = new Note(new Pitch('C'), 12);
        Single note5 = new Note(new Pitch('D'), 12);
        Single note6 = new Note(new Pitch('G'), 12);
        noteList2.add(note4);
        noteList2.add(note5);
        noteList2.add(note6);
        Voice voice2 = new Voice(noteList2, "voice2");
        List<Voice> voiceList2 = new ArrayList<Voice>();
        voiceList2.add(voice2);
        Music music = new Music(voiceList);
        Music music2 = new Music(voiceList2);
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
        Voice voice = new Voice(noteList, "voice");
        List<Voice> voiceList = new ArrayList<Voice>();
        voiceList.add(voice);
        List<Single> noteList2 = new ArrayList<Single>();
        Single note4 = new Note(new Pitch('D'), 12);
        Single note5 = new Note(new Pitch('E'), 12);
        Single note6 = new Note(new Pitch('A'), 12);
        noteList2.add(note4);
        noteList2.add(note5);
        noteList2.add(note6);
        Voice voice2 = new Voice(noteList2, "voice2");
        List<Voice> voiceList2 = new ArrayList<Voice>();
        voiceList2.add(voice2);
        Music music = new Music(voiceList);
        Music music2 = new Music(voiceList2);
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
        Voice voice = new Voice(noteList, "voice");
        List<Voice> voiceList = new ArrayList<Voice>();
        voiceList.add(voice);
        List<Single> noteList2 = new ArrayList<Single>();
        Single note4 = new Note(new Pitch('D'), 12);
        Single note5 = new Note(new Pitch('E'), 12);
        Single note6 = new Note(new Pitch('A'), 12);
        noteList2.add(note4.transpose(Pitch.OCTAVE));
        noteList2.add(note5.transpose(Pitch.OCTAVE));
        noteList2.add(note6.transpose(Pitch.OCTAVE));
        Voice voice2 = new Voice(noteList2, "voice2");
        List<Voice> voiceList2 = new ArrayList<Voice>();
        voiceList2.add(voice2);
        Music music = new Music(voiceList);
        Music music2 = new Music(voiceList2);
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
        Voice voice = new Voice(noteList, "voice");
        List<Voice> voiceList = new ArrayList<Voice>();
        voiceList.add(voice);
        List<Single> noteList2 = new ArrayList<Single>();
        Single note4 = new Note(new Pitch('C'), 12);
        Single note5 = new Note(new Pitch('D'), 12);
        Single note6 = new Note(new Pitch('G'), 12);
        noteList2.add(note4.transpose(-Pitch.OCTAVE));
        noteList2.add(note5.transpose(-Pitch.OCTAVE));
        noteList2.add(note6.transpose(-Pitch.OCTAVE));
        Voice voice2 = new Voice(noteList2, "voice2");
        List<Voice> voiceList2 = new ArrayList<Voice>();
        voiceList2.add(voice2);
        Music music = new Music(voiceList);
        Music music2 = new Music(voiceList2);
        assertEquals(music2, music.transpose(-14));
    }
    
}
