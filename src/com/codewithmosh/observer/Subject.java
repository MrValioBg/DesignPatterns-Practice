package com.codewithmosh.observer;

import java.util.HashSet;
import java.util.Set;

public class Subject {

    private final Set<StockObserver> observerSet = new HashSet<>();

    protected void addObserver(StockObserver observer) {
        observerSet.add(observer);
    }

    protected void removeObserver(StockObserver observer) {
        removeObserver(observer);
    }

    protected void notifyObservers() {
        for (StockObserver observer : observerSet) {
            observer.priceUpdated();
        }
    }

}
