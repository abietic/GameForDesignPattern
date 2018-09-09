package game.menu;

import game.MediaControl;
import game.menu.item.AWTMenuItem;

import javax.swing.*;
import java.util.List;

public abstract class AWTMenu implements Menu{
    private String menuContent;
    private MediaControl mediaControl;
    private List<AWTMenuItem> awtMenuItems;
}
