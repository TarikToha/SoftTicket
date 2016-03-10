package multimedia;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Sounds {
    private String name;
    private AudioInputStream ais;
    private Clip clip; 
    private final String address, ext;

    public Sounds() {
        address = "ReSource\\MultiMedia\\Sounds\\";
        ext = ".wav";
    }
        
    private void player(String name){
        this.name = address + name + ext ;
        try {
            ais = AudioSystem.getAudioInputStream(new File(this.name).getAbsoluteFile());
            clip = AudioSystem.getClip();
            clip.open(ais);
            clip.start();
        } catch (Exception ex) {}
    }   
    public void shortHorn(){
        player("hornShort");
    }
    
    public void shortWhistle(){
        player("whistleShort");
    }
    
    public void longHorn(){
        player("hornLong");
    }
    
    public void longWhistle(){
        player("whistleLong");
    }
    
    public void openingSound(){
        player("passingHorn");
    }
    
    public void schSound(){
        player("goingWhistle");
    }
    
    public void rfSound(){
        player("goingHorn");
    }
    
    public void ticketSound(){
        player("departing");
    }

    
}
