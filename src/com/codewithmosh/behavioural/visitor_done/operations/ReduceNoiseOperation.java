package com.codewithmosh.behavioural.visitor_done.operations;

public class ReduceNoiseOperation implements Operation {
    @Override
    public void applyFactSegment() {
        System.out.println("Reduce noise - Fact Segment");
    }

    @Override
    public void applyFormatSegment() {
        System.out.println("Reduce noise - Format Segment");
    }
}
