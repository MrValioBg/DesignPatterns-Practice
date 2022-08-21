package com.codewithmosh.observer;

import java.util.HashSet;
import java.util.Set;

public class Subject {

    private final Set<Observer> observerSet = new HashSet<>();

    protected void addObserver(Observer observer) {
        observerSet.add(observer);
    }

    protected void removeObserver(Observer observer) {
        removeObserver(observer);
    }

    protected void notifyObservers() {
        for (Observer observer : observerSet) {
            observer.priceUpdated();
        }
    }

}
