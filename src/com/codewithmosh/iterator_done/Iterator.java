package com.codewithmosh.iterator_done;

public interface Iterator<T> {

    T current();
    void next();
    boolean hasNext();
}
