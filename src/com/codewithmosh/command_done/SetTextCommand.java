package com.codewithmosh.command_done;

import com.codewithmosh.command_done.editorfx.AbstractUndoableCommand;
import com.codewithmosh.command_done.editorfx.History;
import com.codewithmosh.command_done.editorfx.VideoEditor;

public class SetTextCommand extends AbstractUndoableCommand {

    private final String text;

    public SetTextCommand(String text, VideoEditor editor, History history) {
        super(editor, history);
        this.text = text;
    }

    @Override
    public void doExecute() {
        editor.setText(text);
    }

    @Override
    public void unExecute() {
        editor.removeText();
    }
}
