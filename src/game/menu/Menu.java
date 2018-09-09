package game.menu;

import game.controller.ControllerListener;
import game.display.frame.Frame;

import java.util.List;

public interface Menu extends Frame {
    List<ControllerListener> getControllerListeners();
    void addControllerLIstener(ControllerListener listener);
}
