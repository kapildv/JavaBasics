package javaobservable;

import java.util.Observable;

public class BeingObserved extends Observable {
    void increment() {
        setChanged();
        notifyObservers();
    }

    void func1() {
        setChanged();
        System.out.println(" Change status with setChanged :" + hasChanged());
        notifyObservers();
    }

    void func2() {
        setChanged();
        System.out.println(" Change status with setChanged :" + hasChanged());
        notifyObservers();
    }

    void func3() {
        setChanged();
        // clearChanged method removes all the changes made by setChanged method
//        clearChanged();
        System.out.println(" Change status with setChanged :" + hasChanged());
        //Here it will not notify any thing to the update method of the observer class.
        notifyObservers();
    }

}
