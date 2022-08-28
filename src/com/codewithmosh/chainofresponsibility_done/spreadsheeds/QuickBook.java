package com.codewithmosh.chainofresponsibility_done.spreadsheeds;

import com.codewithmosh.chainofresponsibility_done.spreadsheeds.handler.FormatHandler;

public class QuickBook extends FormatHandler {

    private static final String FORMAT = ".qbw";

    public QuickBook(FormatHandler next) {
        super(next);
    }

    @Override
    protected boolean doHandle(String fileName) {
        return fileName.endsWith(FORMAT);
    }
}
