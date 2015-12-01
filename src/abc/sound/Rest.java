package abc.sound;

import java.io.IOException;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;

public class Rest implements Single {
    
    private final int duration;
 
    //Rep Invariant:
    //-this.duration > 0
    //Abstraction Function AF(value):
    //-represents a rest in the music piece that has a specified duration
    //Safety from Rep Exposure:
    //-duration is private and final (isn't passed between classes)
    
    /**
     * Constructor for a Single that is a rest
     * @param duration: an integer length for the rest to be held
     */
    public Rest(int duration){
        this.duration = duration;
        checkRep();
    }

    @Override
    public String getType() {
        return "rest";
    }

    @Override
    public Single transpose(int semitonesUp) {
        checkRep();
        return this;
    }

    @Override
    public int getDuration() {
        return this.duration;
    }
    
    @Override
    public String toString() {
        checkRep();
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
