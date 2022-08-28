package com.codewithmosh.behavioural.iterator_done;

public interface Iterator<T> {

    T current();
    void next();
    boolean hasNext();
}
