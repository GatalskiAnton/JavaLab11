package Observer;

import Observer.Observer;

import javax.swing.*;
import java.awt.event.KeyEvent;

public class ListModelObserver extends DefaultListModel implements Observer {
    @Override
    public void update(KeyEvent key) {
        this.addElement(key.getKeyCode());
    }
}
