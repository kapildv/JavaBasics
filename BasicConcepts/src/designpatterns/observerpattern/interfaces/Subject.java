package designpatterns.observerpattern.interfaces;

public interface Subject {

    void subscribe(Observer observer);

    void unsubscribe(Observer observer);

    void notifyObserver();
}
