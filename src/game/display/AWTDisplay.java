package game.display;

import game.display.frame.Frame;
import sun.swing.DefaultLayoutStyle;

import javax.swing.*;
import java.awt.*;

public class AWTDisplay implements Display {
    @Override
    public void init(Frame frame) {
        string2Display = frame.generate();
        textArea = new TextArea();
        textArea.setText(string2Display);
        textArea.setEditable(false);
        this.panel.add("text", textArea);
        this.frame.setVisible(true);
    }

    @Override
    public void change(Frame frame) {
        string2Display = frame.generate();
        textArea.setText(string2Display);
        textArea.setEditable(false);
    }

    @Override
    public void close() {
        this.panel.removeAll();
        this.frame.removeAll();
    }

    @Override
    public void setResolution(int width, int height) {
        this.frame.setSize(width, height);
    }

    private JFrame frame;

    private JPanel panel;

    private String string2Display;

    private TextArea textArea;

    public AWTDisplay(JFrame jFrame) {
        this.frame = jFrame;
        this.frame.setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        this.frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.panel = new JPanel();
        this.frame.add("panel", panel);
    }


    final int DEFAULT_WIDTH = 1024;
    final int DEFAULT_HEIGHT = 768;
}
