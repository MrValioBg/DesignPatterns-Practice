package com.codewithmosh.chainofresponsibility_done.spreadsheeds;

import com.codewithmosh.chainofresponsibility_done.spreadsheeds.handler.FormatHandler;

public class NumberSpreadSheet extends FormatHandler {

    private static final String FORMAT = ".numbers";

    public NumberSpreadSheet(FormatHandler next) {
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
