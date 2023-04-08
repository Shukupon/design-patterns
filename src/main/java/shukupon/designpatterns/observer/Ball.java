package shukupon.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Observerの監視対象であり、状態を持つ抽象クラス.
 * 
 * @author Shukupon
 *
 */
public abstract class Ball {

    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    public abstract void setState(String state);

    public abstract String getState();

}
