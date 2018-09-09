package game.controller;

public interface ControllerListener {
    void controllerTyped(ControllerEvent e);
    void controllerPressed(ControllerEvent e);
    void controllerReleased(ControllerEvent e);
}
