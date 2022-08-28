package com.codewithmosh.behavioural.visitor;

import com.codewithmosh.behavioural.visitor.operations.NormalizeOperation;

public class Demo {

    public static void show() {
        var wav = WavFile.read("selfish.wav");
        wav.doOperation(new NormalizeOperation());
    }
}
