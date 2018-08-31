package javaobservable;

import designpatterns.observerpattern.interfaces.Observer;

import javax.annotation.processing.SupportedSourceVersion;

public class ObserverDemo {

    public static void main(String[] args) {
        BeingObserved beingObserved = new BeingObserved();
        Observer1 observer1 = new Observer1();
        Observer2 observer2 = new Observer2();
        Observer3 observer3 = new Observer3();
        beingObserved.addObserver(observer3);
        beingObserved.addObserver(observer2);
        beingObserved.addObserver(observer1);
        int count = beingObserved.countObservers();
        System.out.println("No of Observers " + count);


        beingObserved.increment();
        beingObserved.func1();
        beingObserved.func2();
        beingObserved.func3();
    }
}
