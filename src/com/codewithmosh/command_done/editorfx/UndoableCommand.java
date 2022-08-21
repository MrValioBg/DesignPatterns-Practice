package com.codewithmosh.command_done.editorfx;

public interface UndoableCommand extends Command {
    void unExecute();
}
