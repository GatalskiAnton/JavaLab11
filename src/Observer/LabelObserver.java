package Observer;

import Observer.Observer;

import javax.swing.*;
import java.awt.event.KeyEvent;

public class LabelObserver extends JLabel implements Observer {
    @Override
    public void update(KeyEvent key) {
        this.setText(String.valueOf(key.getKeyChar()));
    }
}
