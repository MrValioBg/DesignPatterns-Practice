package com.codewithmosh.behavioural.command_done.editorfx;

public interface UndoableCommand extends Command {
    void unExecute();
}
