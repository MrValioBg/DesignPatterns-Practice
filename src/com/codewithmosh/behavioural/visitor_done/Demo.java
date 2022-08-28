package com.codewithmosh.behavioural.visitor_done;

import com.codewithmosh.behavioural.visitor_done.operations.NormalizeOperation;

public class Demo {

    public static void show() {
        var wav = WavFile.read("selfish.wav");
        wav.doOperation(new NormalizeOperation());
    }
}
