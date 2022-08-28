package com.codewithmosh.behavioural.visitor_done.operations;

public class NormalizeOperation implements Operation {
    @Override
    public void applyFactSegment() {
        System.out.println("Normalize - Fact Segment");
    }

    @Override
    public void applyFormatSegment() {
        System.out.println("Normalize - Format Segment");
    }
}
