import java.util.HashSet;
import java.util.Observable;
import java.util.Observer;
import java.util.Set;

public abstract class Subject {
    private Set<Observer> observers = new HashSet<Observer>();
    private Observable Observable;

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(Observable, this);
        }
    }
}