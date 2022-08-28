package com.codewithmosh.behavioural.visitor;

import com.codewithmosh.behavioural.visitor.operations.Operation;

public interface Segment {
    void doOperation(Operation operation);
}
