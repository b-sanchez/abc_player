package abc.sound;

import java.io.IOException;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;

public class Rest implements Single {
    
    private final int duration;
 
    //Rep Invariant:
    //-Rest does not have a Pitch
    //-this.duration > 0
    //Abstraction Function AF(value):
    //-
    //Safety from Rep Exposure:
    //-
    
    /**
     * Constructor for a Single that is a rest
     * @param duration: an integer length for the rest to be held
     */
    public Rest(int duration){
        this.duration = duration;
    }

    @Override
    public String getType() {
        return "rest";
    }

    @Override
    public Single transpose(int semitonesUp) {
        return this;
    }

    @Override
    public int getDuration() {
        return this.duration;
    }
    
    @Override
    public String toString() {
        return "z";
    }
    
    @Override
    public int hashCode() {
        return 17;
    }
    
    @Override
    public boolean equals(Object obj) {
        //Check if durations are the same for equality
        if(obj instanceof Rest){
            Rest that = (Rest) obj;
            return that.getDuration() == this.getDuration();
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
