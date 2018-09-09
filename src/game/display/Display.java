package game.display;

import game.display.frame.Frame;

public interface Display {
    void init(Frame frame);
    void change(Frame frame);
    void close();
    void setResolution(int width, int height);
}
