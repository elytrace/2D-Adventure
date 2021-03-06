package Main;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;

public class Sound {
    
    Clip clip;
    File soundURL[] = new File[30];
    FloatControl fc;
    int volumeScale = 3;
    float volume;

    public Sound() {

        soundURL[0] = new File("Resources/Sound/BlueBoyAdventure.wav");
        soundURL[1] = new File("Resources/Sound/coin.wav");
        soundURL[2] = new File("Resources/Sound/powerup.wav");
        soundURL[3] = new File("Resources/Sound/unlock.wav");
        soundURL[4] = new File("Resources/Sound/fanfare.wav");
        soundURL[5] = new File("Resources/Sound/hitmonster.wav");
        soundURL[6] = new File("Resources/Sound/receivedamage.wav");
        soundURL[7] = new File("Resources/Sound/swingweapon.wav");
        // soundURL[7] = new File("Resources/Sound/nao_se.wav");
        soundURL[8] = new File("Resources/Sound/levelup.wav");
        soundURL[9] = new File("Resources/Sound/cursor.wav");
        soundURL[10] = new File("Resources/Sound/burning.wav");
        soundURL[11] = new File("Resources/Sound/cuttree.wav");
        soundURL[12] = new File("Resources/Sound/gameover.wav");
        soundURL[13] = new File("Resources/Sound/stairs.wav");
        
    }

    public void setFile(int i) {

        try {

            AudioInputStream ais = AudioSystem.getAudioInputStream(soundURL[i]);
            clip = AudioSystem.getClip();
            clip.open(ais);
            fc = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
            checkVolume();
        }
        catch(Exception e) {

        }
    }

    public void play() {

        clip.start();
    }

    public void loop() {

        clip.loop(Clip.LOOP_CONTINUOUSLY);
    }

    public void stop() {

        clip.stop();
    }

    public void checkVolume() {

        switch(volumeScale) {
            case 0: volume = -80f; break;
            case 1: volume = -20f; break;
            case 2: volume = -12f; break;
            case 3: volume = -5f; break;
            case 4: volume = 1f; break;
            case 5: volume = 6f; break;
        }
        fc.setValue(volume);
    }
}
