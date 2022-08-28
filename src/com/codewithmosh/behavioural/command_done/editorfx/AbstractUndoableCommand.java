package com.codewithmosh.behavioural.command_done.editorfx;


public abstract class AbstractUndoableCommand implements UndoableCommand {
    protected VideoEditor editor;
    protected History history;

    protected AbstractUndoableCommand(VideoEditor editor, History history) {
        this.editor = editor;
        this.history = history;
    }

    @Override
    public void execute() {
        doExecute();
        history.push(this);
    }

    protected abstract void doExecute();
}
