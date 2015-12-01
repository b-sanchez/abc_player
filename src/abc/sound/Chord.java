package abc.sound;

import java.io.IOException;


import java.util.Collections;
import java.util.HashSet;

import java.util.Set;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;

public class Chord implements Single {
    
    private final Set<Note> notes;
    
    //Rep Invariant:
    //-this.getDuration() > 0
    //-notes is non-empty
    //Abstraction Function AF(value):
    //-represents a chord to be played in a piece of music that contains a set of notes (each of which as a pitch and duration)
    //Safety from Rep Exposure:
    //-notes is Set of immutable Note objects.
    //-notes is final/private, and isn't passed between classes
    
    /**
     * Constructor for Chord object
     * @param notes: List of Note objects to be played in the Chord
     */
    public Chord(Set<Note> notes){
        this.notes = notes;
    }
    
    @Override
    public int getDuration() {
        int longestDuration = 0;
        for (Note note: this.notes){
            if (note.getDuration() > longestDuration){
                longestDuration = note.getDuration();
            }
        }
        return longestDuration;
    }
    
    /**
     * Returns the list of Notes to be played in the chord
     * @return List of Notes in the chord
     */
    public Set<Note> getNotes(){
        checkRep();
        return Collections.unmodifiableSet(this.notes);
    }
    
    @Override
    public Chord transpose(int semitonesUp) {
        checkRep();
        Set<Note> transposedSet = new HashSet<Note>();
        for(Note note: notes){
            transposedSet.add((Note) note.transpose(semitonesUp));
        }
        checkRep();
        return new Chord(transposedSet);
    }
    

    @Override
    public String toString() {
        checkRep();
        //A chord will just be the notes appended together
        StringBuilder finalString = new StringBuilder();
        finalString.append("[");
        for(Note note : notes){
            finalString.append(note.toString());
        }
        finalString.append("]");
        return finalString.toString();
    }

    @Override
    public int hashCode() {
        return 17;
    }
    

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Chord){
           //If the Chords have the same size and have the same notes, then the Chords must be equal
           //No need to check for order
           Chord that = (Chord) obj;
           boolean sameNotes = (that.getNotes().containsAll(this.getNotes()));
           boolean sameLength = that.getNotes().size() == this.getNotes().size();
           return (sameNotes && sameLength);
        }
        return false;
    }

    @Override
    public String getType() {
        return "chord";
    }
    
    /**
     * Assert the Rep Invariant
     */
    private void checkRep(){
        assert this.getDuration() > 0;
    }
    
    @Override
    public void play(){
        try {
            SequencePlayer player = new SequencePlayer(140, 12);
    
        System.out.println(player);

        // play!
        player.play();
        
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        } catch (MidiUnavailableException mue) {
            mue.printStackTrace();
        } catch (InvalidMidiDataException imde) {
            imde.printStackTrace();
        }
    }

}
