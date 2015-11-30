package abc.sound;

import java.io.IOException;
import java.util.Collections;
import java.util.Set;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;

public class Chord implements Single {
    
    private final Set<Note> notes;
    
    //Rep Invariant:
    //-this.getDuration() > 0
    //Abstraction Function AF(value):
    //-
    //Safety from Rep Exposure:
    //-
    
    /**
     * Constructor for Chord object
     * @param notes: List of Note objects to be played in the Chord
     */
    public Chord(Set<Note> notes){
        this.notes = notes;
    }
    
    @Override
    public int getDuration() {
        // TODO Auto-generated method stub
        return 0;
    }
    
    /**
     * Returns the list of Notes to be played in the chord
     * @return List of Notes in the chord
     */
    public Set<Note> getNotes(){
        return Collections.unmodifiableSet(this.notes);
    }
    
    @Override
    public Chord transpose(int semitonesUp) {
        // TODO Auto-generated method stub
        return null;
    }
    

    @Override
    public String toString() {
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
