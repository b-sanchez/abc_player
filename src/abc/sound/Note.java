package abc.sound;

import java.io.IOException;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;

public class Note implements Single {
    
    private final Pitch pitch;
    private final int duration;
    
    
    //Rep Invariant:
    //-this.duration > 0
    //Abstraction Function AF(value):
    //-
    //Safety from Rep Exposure:
    //-
    
    /**
     * Constructor for a Single that is a note
     * @param pitch: a Pitch object representing the Single's pitch
     * @param duration: an integer length for the note to be played
     */
    public Note(Pitch pitch, int duration){
        this.pitch = pitch;
        this.duration = duration;
    }

    @Override
    public String getType() {
        return "note";
    }

    @Override
    public Single transpose(int semitonesUp) {
        return new Note(this.pitch.transpose(semitonesUp), this.duration);
    }

    public Pitch getPitch() {
        return this.pitch;
    }

    @Override
    public int getDuration() {
        return this.duration;
    }
    
    @Override
    public String toString() {
        //Just return the String of the pitch of the note
        return this.pitch.toString();
    }
    
    @Override
    public int hashCode() {
        return 17;
    }
    
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Note){
            Note that = (Note) obj;
            //A note is equal to another note if they have the same pitch and same duration
            return (that.getPitch().equals(this.getPitch())) && (that.getDuration() == this.getDuration());
         }
         return false;
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
