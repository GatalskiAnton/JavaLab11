package GUI;

import Observer.*;
import Subject.KeySubject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GUI extends JFrame {
    private KeySubject keySubject;
    private LabelObserver labelObserver;
    private ListModelObserver listModelObserver;

    public GUI(String title) throws HeadlessException {
        super(title);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        labelObserver = new LabelObserver();
        listModelObserver = new ListModelObserver();

        keySubject = new KeySubject();

        keySubject.addObserver(labelObserver);
        keySubject.addObserver(listModelObserver);

        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                keySubject.notifyObservers(e);
            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

        JPanel mainPanel = new JPanel(new FlowLayout());
        mainPanel.add(labelObserver);
        JList list = new JList(listModelObserver);
        mainPanel.add(list);
        add(mainPanel, BorderLayout.CENTER);
    }
}
