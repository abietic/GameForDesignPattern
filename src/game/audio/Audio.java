package game.audio;


public interface Audio {
    void setVolume(double volume);
    double getVolume();
    void play();
    void stop();
    void loop();
}
