package com.codewithmosh.behavioural.command_done;

import com.codewithmosh.behavioural.command_done.editorfx.History;
import com.codewithmosh.behavioural.command_done.editorfx.UndoCommand;
import com.codewithmosh.behavioural.command_done.editorfx.VideoEditor;

public class Demo {

    public static void show() {
        var videoEditor = new VideoEditor();
        var history = new History();

        var cmdContrast = new SetContrastCommand(1.52f, videoEditor, history);
        cmdContrast.execute();

        System.out.println(videoEditor);

        var undoCmd = new UndoCommand(history);
        undoCmd.execute(); // undoing cmd

        System.out.println(videoEditor);

        var cmdText = new SetTextCommand("Text?", videoEditor, history);
        cmdText.execute();

        System.out.println(videoEditor);

        undoCmd.execute();
        System.out.println(videoEditor);
    }
}
