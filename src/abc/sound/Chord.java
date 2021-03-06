package abc.sound;

import java.util.Collections;
import java.util.HashSet;

import java.util.Set;

public class Chord implements Single {
    
    private static final int ARBITRARY_PRIME = 17;
    private final Set<Note> notes;
    
    //Rep Invariant:
    //-this.getDuration() > 0
    //-notes is non-empty
    //Abstraction Function AF(value):
    //-represents a chord to be played in a piece of music that contains a set of notes represented by notes (each of which as a pitch and duration)
    //Safety from Rep Exposure:
    //-notes is Set of immutable Note objects.
    //-notes is final/private, and isn't passed between classes in any mutable form
    
    /**
     * Constructor for Chord object
     * @param notes: List of Note objects to be played in the Chord
     */
    public Chord(Set<Note> notes){
        this.notes = notes;
    }
    
    @Override
    public int getDuration() {
        //Duration of the Chord is simply the duration of the longest chord
        int longestDuration = 0;
        for (Note note: this.notes){
            if (note.getDuration() > longestDuration){
                longestDuration = note.getDuration();
            }
        }
        return longestDuration;
    }
    
    /**
     * Returns the set of Notes to be played in the chord
     * @return Set of Notes in the chord
     */
    public Set<Note> getNotes(){
        //Immutability
        return Collections.unmodifiableSet(this.notes);
    }
    
    @Override
    public Chord transpose(int semitonesUp) {
        checkRep();
        Set<Note> transposedSet = new HashSet<Note>();
        //Transpose each of the notes in the chord up
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
        return ARBITRARY_PRIME;
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
        assert this.getNotes().size() > 0;
    }
    

}
