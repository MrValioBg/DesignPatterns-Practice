package com.codewithmosh.mediator_done;

import java.util.ArrayList;
import java.util.List;

public abstract class UIControl {

    private final List<EventHandler> observerList = new ArrayList<>();

    void addEventHandler(EventHandler observer) {
        observerList.add(observer);
    }


    protected void notifyEventHandlers() {
        observerList.forEach(EventHandler::handle);
    }
}
