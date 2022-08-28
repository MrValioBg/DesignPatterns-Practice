package com.codewithmosh.chainofresponsibility_done.spreadsheeds;

import com.codewithmosh.chainofresponsibility_done.spreadsheeds.handler.FormatHandler;

public class NumberSpreadSheet extends FormatHandler {

    private static final String FORMAT = ".numbers";

    public NumberSpreadSheet(FormatHandler next) {
        super(next);
    }

    @Override
    protected boolean doHandle(String fileName) {
        return fileName.endsWith(FORMAT);
    }


}
