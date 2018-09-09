package game.audio;

import javafx.scene.media.AudioClip;

public class AWTVolume implements Audio{
    @Override
    public void setVolume(double volume) {
        this.audioClip.setVolume(volume);
    }

    @Override
    public double getVolume() {
        return this.audioClip.getVolume();
    }

    @Override
    public void play() {
        this.audioClip.play();
    }

    @Override
    public void stop() {
        if (isLoop == false) {
            this.audioClip.stop();
        } else {
            this.thread.stop();
        }
    }

    @Override
    public void loop() {
        isLoop = true;
        this.thread = new Thread(() -> {
            while (true) {
                audioClip.stop();
            }
        });
        this.thread.start();
    }



    private AudioClip audioClip;
    private boolean isLoop;

    private Thread thread;

    public AWTVolume(AudioClip audioClip) {
        this.audioClip = audioClip;
        this.setVolume(50f);
        this.isLoop = false;
    }
}
