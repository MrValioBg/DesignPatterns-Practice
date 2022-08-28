package com.codewithmosh.behavioural.chainofresponsibility_done.spreadsheeds;

import com.codewithmosh.behavioural.chainofresponsibility_done.spreadsheeds.handler.FormatHandler;

public class QuickBook extends FormatHandler {

    private static final String FORMAT = ".qbw";

    public QuickBook(FormatHandler next) {
        super(next);
    }

    @Override
    protected String getExtension() {
        return FORMAT;
    }

    @Override
    protected void doRead(String fileName) {
        System.out.println("Reading file " + fileName + " using " + getClass().getSimpleName());
    }
}
