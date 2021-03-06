package designpatterns.observerpattern;

import designpatterns.observerpattern.interfaces.Observer;
import designpatterns.observerpattern.interfaces.Subject;

import java.util.ArrayList;
import java.util.Iterator;

public class CricketData implements Subject {

    private int runs;
    private int wickets;
    private float overs;
    private ArrayList<Observer> observersList;

    CricketData() {
        observersList = new ArrayList<>();
    }

    @Override
    public void subscribe(Observer observer) {
        observersList.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        observersList.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observersList) {
            observer.update(runs, wickets, overs);
        }
    }

    // get latest runs from stadium
    private int getLatestRuns() {
        // return 90 for simplicity
        return 90;
    }

    public void setLatestWickets(int value) {
        // return 2 for simplicity
        wickets = value;
    }

    // get latest wickets from stadium
    private int getLatestWickets() {
        // return 2 for simplicity
        return wickets;
    }

    // get latest overs from stadium
    public void setLatestOvers(float value) {
        overs = value;
    }

    // get latest overs from stadium
    private float getLatestOvers() {
        // return 90 for simplicity
        return overs;
    }

    public void dataChanged() {
        runs = getLatestRuns();
        overs = getLatestOvers();
        wickets = getLatestWickets();
        notifyObserver();
    }
}
