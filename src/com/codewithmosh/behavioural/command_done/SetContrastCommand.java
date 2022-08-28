package com.codewithmosh.behavioural.command_done;

import com.codewithmosh.behavioural.command_done.editorfx.AbstractUndoableCommand;
import com.codewithmosh.behavioural.command_done.editorfx.History;
import com.codewithmosh.behavioural.command_done.editorfx.VideoEditor;

public class SetContrastCommand extends AbstractUndoableCommand {

    private final float prevContrast;
    private final float contrast;

    public SetContrastCommand(float contrast, VideoEditor editor, History history) {
        super(editor, history);

        this.contrast = contrast;
        this.prevContrast = editor.getContrast();
    }

    @Override
    public void doExecute() {
        editor.setContrast(contrast);
    }

    @Override
    public void unExecute() {
        editor.setContrast(prevContrast);
    }
}
