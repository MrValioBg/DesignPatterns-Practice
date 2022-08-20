package com.codewithmosh.command;

import com.codewithmosh.command.editorfx.History;
import com.codewithmosh.command.editorfx.UndoCommand;
import com.codewithmosh.command.editorfx.VideoEditor;

public class Demo {

    public static void show() {
        var videoEditor = new VideoEditor();
        var history = new History();

        var cmdContrast = new SetContrastCommand(1.52f, videoEditor, history);
        cmdContrast.execute();
        history.push(cmdContrast);

        System.out.println(videoEditor);

        var undoCmd = new UndoCommand(history);
        undoCmd.execute(); // undoing cmd

        System.out.println(videoEditor);

        var cmdText = new SetTextCommand("Text?", videoEditor, history);
        cmdText.execute();
        history.push(cmdText);


        System.out.println(videoEditor);

        undoCmd.execute();
        System.out.println(videoEditor);
    }
}
