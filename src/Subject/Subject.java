package Subject;

import Observer.Observer;

import java.awt.event.KeyEvent;

public interface Subject {
    void notifyObservers(KeyEvent key);
    void addObserver(Observer observer);
}
