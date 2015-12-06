package abc.sound;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
    
    //play():
    //-Single voice, multiple voices
    //-Voice with rest/without rest
    //-Voice with chords
    
    //TEST NAMES DESCRIBE TESTS
    
    @Test
    public void testEverything() throws IOException {
        Music music = new Music(new File("sample_abc/piece2.abc"));
        music.play();
    }
    @Test
    public void testPlaySingleVoiceNoRests(){
        List<Single> noteList1 = new ArrayList<Single>();
        Single note1 = new Note(new Pitch('C'), 192);
        Single note2 = new Note(new Pitch('F'), 192);
        Single note3 = new Note(new Pitch('G'), 192);
        Single note10 = new Note(new Pitch('F'), 192);
        noteList1.add(note1);
        noteList1.add(note2);
        noteList1.add(note3);
        noteList1.add(note10);
        Voice voice1 = new Voice(noteList1, "voice1");
        List<Voice> voiceList = new ArrayList<Voice>();
        voiceList.add(voice1);
        Music music = new Music(voiceList);
        music.play();
    }
    
    @Test
    public void testPlaySingleVoiceWithRests(){
        List<Single> noteList1 = new ArrayList<Single>();
        Single note1 = new Note(new Pitch('C'), 192);
        Single note2 = new Note(new Pitch('F'), 192);
        Single note3 = new Note(new Pitch('G'), 192);
        Single rest = new Rest(192);
        Single note10 = new Note(new Pitch('F'), 192);
        noteList1.add(note1);
        noteList1.add(note2);
        noteList1.add(note3);
        noteList1.add(rest);
        noteList1.add(note10);
        Voice voice1 = new Voice(noteList1, "voice1");
        List<Voice> voiceList = new ArrayList<Voice>();
        voiceList.add(voice1);
        Music music = new Music(voiceList);
        music.play();
    }
    
    @Test
    public void testPlayVoiceWithChords(){
        List<Single> singlesList = new ArrayList<Single>();
        Set<Note> chordList1 = new HashSet<Note>();
        Single note1 = new Note(new Pitch('C'), 192);
        Single note2 = new Note(new Pitch('E'), 192);
        Single note3 = new Note(new Pitch('G'), 192);
        chordList1.add((Note) note1);
        chordList1.add((Note) note2);
        chordList1.add((Note) note3);
        Single chord1 = new Chord(chordList1);
        
        Set<Note> chordList2 = new HashSet<Note>();
        Single note4 = new Note(new Pitch('F'), 192);
        Single note5 = new Note(new Pitch('A'), 192);
        Single note6 = new Note(new Pitch('C').transpose(Pitch.OCTAVE), 192);
        chordList2.add((Note)note4);
        chordList2.add((Note)note5);
        chordList2.add((Note)note6);
        Single chord2 = new Chord(chordList2);
        
        Set<Note> chordList3 = new HashSet<Note>();
        Single note7 = new Note(new Pitch('G'), 192);
        Single note8 = new Note(new Pitch('B'), 192);
        Single note9 = new Note(new Pitch('D').transpose(Pitch.OCTAVE), 192);
        chordList3.add((Note)note7);
        chordList3.add((Note)note8);
        chordList3.add((Note)note9);
        Single chord3 = new Chord(chordList3);
        
        Set<Note> chordList4 = new HashSet<Note>();
        Single note10 = new Note(new Pitch('C'), 192);
        Single note11 = new Note(new Pitch('E'), 192);
        Single note12 = new Note(new Pitch('G'), 192);
        Single note13 = new Note(new Pitch('C').transpose(Pitch.OCTAVE), 192);
        chordList4.add((Note)note10);
        chordList4.add((Note)note11);
        chordList4.add((Note)note12);
        chordList4.add((Note)note13);
        Single chord4 = new Chord(chordList4);
        
        singlesList.add(chord1);
        singlesList.add(chord2);
        singlesList.add(chord3);
        singlesList.add(chord4);
        
        Voice voice1 = new Voice(singlesList, "voice1");
        List<Voice> voiceList = new ArrayList<Voice>();
        voiceList.add(voice1);
        Music music = new Music(voiceList);
        music.play();
    }
    
    @Test
    public void testPlayMultipleVoices(){
        List<Single> noteList1 = new ArrayList<Single>();
        Single note1 = new Note(new Pitch('C'), 192);
        Single note2 = new Note(new Pitch('F'), 192);
        Single note3 = new Note(new Pitch('G'), 192);
        Single note10 = new Note(new Pitch('C'), 192);
        noteList1.add(note1);
        noteList1.add(note2);
        noteList1.add(note3);
        noteList1.add(note10);
        Voice voice1 = new Voice(noteList1, "voice1");
        List<Single> noteList4 = new ArrayList<Single>();
        Single note4 = new Note(new Pitch('E'), 192);
        Single note5 = new Note(new Pitch('A'), 192);
        Single note6 = new Note(new Pitch('B'), 192);
        Single note11 = new Note(new Pitch('E'), 192);
        noteList4.add(note4);
        noteList4.add(note5);
        noteList4.add(note6);
        noteList4.add(note11);
        Voice voice4 = new Voice(noteList4, "voice4");
        List<Single> noteList5 = new ArrayList<Single>();
        Single note7 = new Note(new Pitch('G'), 192);
        Single note8 = new Note(new Pitch('C').transpose(Pitch.OCTAVE), 192);
        Single note9 = new Note(new Pitch('D').transpose(Pitch.OCTAVE), 192);
        Single note12 = new Note(new Pitch('G'), 192);
        noteList5.add(note7);
        noteList5.add(note8);
        noteList5.add(note9);
        noteList5.add(note12);
        Voice voice5 = new Voice(noteList5, "voice5");
        List<Voice> voiceList = new ArrayList<Voice>();
        voiceList.add(voice1);
        voiceList.add(voice4);
        voiceList.add(voice5);
        Music music = new Music(voiceList);
        music.play();
    }

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
