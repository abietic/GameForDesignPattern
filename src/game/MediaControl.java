package game;

import game.display.AWTDisplay;
import game.display.frame.Frame;

import javax.swing.*;
import java.util.List;

public class MediaControl {
    public void changeFrame(Frame frame) {

    }
    public void changeListeners(List oldListeners, List newListeners) {
    }
    private JFrame frame;
    private AWTDisplay awtDisplay;

    public MediaControl() {
        this.frame = new JFrame();
        this.awtDisplay = new AWTDisplay(this.frame);
    }
}
