package game.menu.item;

import game.MediaControl;
import game.controller.ControllerEvent;

import java.awt.event.KeyListener;

public abstract class AWTMenuItem extends MenuItem implements KeyListener{

    private MediaControl mediaControl;

    @Override
    public void controllerTyped(ControllerEvent e) {}

    @Override
    public void controllerPressed(ControllerEvent e) {}

    @Override
    public void controllerReleased(ControllerEvent e) {}

}
