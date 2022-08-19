package com.codewithmosh.command.editorfx;

public interface UndoableCommand extends Command {
    void unExecute();
}
