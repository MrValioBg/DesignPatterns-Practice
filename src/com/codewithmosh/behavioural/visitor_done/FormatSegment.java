package com.codewithmosh.behavioural.visitor_done;

import com.codewithmosh.behavioural.visitor_done.operations.Operation;

public class FormatSegment implements Segment {

    @Override
    public void doOperation(Operation operation) {
        operation.applyFormatSegment();
    }
}
