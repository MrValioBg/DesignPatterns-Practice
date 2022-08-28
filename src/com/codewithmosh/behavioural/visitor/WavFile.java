package com.codewithmosh.behavioural.visitor;

import com.codewithmosh.behavioural.visitor.operations.Operation;

import java.util.ArrayList;
import java.util.List;

public class WavFile {
    private final List<Segment> segments = new ArrayList<>();

    public static WavFile read(String fileName) {
        // Simulate reading a wav file and building the segments
        var wavFile = new WavFile();
        wavFile.segments.add(new FormatSegment());
        wavFile.segments.add(new FactSegment());
        return wavFile;
    }


    public void doOperation(Operation operation) {
        segments.forEach(t -> t.doOperation(operation));
    }


}
