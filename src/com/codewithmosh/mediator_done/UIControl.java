package com.codewithmosh.mediator_done;

import java.util.ArrayList;
import java.util.List;

public abstract class UIControl {

    private final List<Observer> observerList = new ArrayList<>();

    void addEventListener(Observer observer) {
        observerList.add(observer);
    }


    protected void handleEventListener() {
        observerList.forEach(Observer::handle);
    }
}
