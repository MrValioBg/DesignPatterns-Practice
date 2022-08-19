package com.codewithmosh.command.editorfx;

import java.util.ArrayDeque;
import java.util.Deque;

public class History {

    //Deque -> Double Ended queue; -> allows us to add objects from the front and the end, so can be used as stack
    private final Deque<UndoableCommand> commands = new ArrayDeque<>();

    public void push(UndoableCommand command) {
        commands.push(command);
    }

    public UndoableCommand pop() {
         return commands.pop();
    }

    public int size() {
        return commands.size();
    }

}
