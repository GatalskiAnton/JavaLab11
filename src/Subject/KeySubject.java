package Subject;

import Observer.Observer;

import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class KeySubject implements Subject{
    private ArrayList<Observer> observers = new ArrayList<>();
    @Override
    public void notifyObservers(KeyEvent key) {
        for (Observer observer: observers)
            observer.update(key);
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }
}
