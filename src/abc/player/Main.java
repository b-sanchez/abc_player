package abc.player;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

import abc.sound.Music;

/**
 * Main entry point of your application.
 */
public class Main {

    /**
     * Plays the input file using Java MIDI API and displays
     * header information to the standard output stream.
     * 
     * (Your code should not exit the application abnormally using
     * System.exit().)
     * 
     * @param file the name of input abc file
     * @throws IOException 
     */
    public static void play(String file) throws IOException {
        //Create a Music object from the file name and call its play method
        Music music = new Music(new File(file));
        //System.out.println(music.);
        music.play();
    }

    /**
     * Read inputed file path from the console and play the corresponding abc file
     * @param args unused
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            final String fileText = in.readLine();
            
            if (fileText.isEmpty()) {
                return; // exits the program
            }
            
            play(fileText);
        }
            
        //play("sample_abc/fur_elise.abc");
        //play("sample_abc/piece1.abc");
        //play("sample_abc/piece2.abc");
        //play("sample_abc/abc_song.abc");
        //play("sample_abc/invention.abc");
        //play("sample_abc/little_night_music.abc");
        //play("sample_abc/paddy.abc");
        //play("sample_abc/prelude.abc");
        //play("sample_abc/sample1.abc");
        //play("sample_abc/sample2.abc");
        //play("sample_abc/sample3.abc");
        //play("sample_abc/scale.abc");
        //play("sample_abc/waxies_dargle.abc");
    }
}
