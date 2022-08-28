package com.codewithmosh.behavioural.visitor_done.operations;

public class AddReverbOperation implements Operation {
    @Override
    public void applyFactSegment() {
        System.out.println("Add reverb - Fact Segment");
    }

    @Override
    public void applyFormatSegment() {
        System.out.println("Add reverb - Format Segment");
    }
}
