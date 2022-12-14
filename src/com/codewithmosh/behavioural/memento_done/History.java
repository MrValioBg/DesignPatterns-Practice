package com.codewithmosh.behavioural.memento_done;

import java.util.ArrayDeque;
import java.util.Deque;

public class History {

    private final Deque<DocumentState> states = new ArrayDeque<>();

    public void push(DocumentState state) {
        states.push(state);
    }

    public DocumentState pop() {
        return states.pop();
    }

}
