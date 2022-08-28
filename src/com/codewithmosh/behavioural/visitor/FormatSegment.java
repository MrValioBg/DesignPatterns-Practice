package com.codewithmosh.behavioural.visitor;

import com.codewithmosh.behavioural.visitor.operations.Operation;

public class FormatSegment implements Segment {

    @Override
    public void doOperation(Operation operation) {
        operation.applyFormatSegment();
    }
}
