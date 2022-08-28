package com.codewithmosh.behavioural.chainofresponsibility_done.spreadsheeds;

import com.codewithmosh.behavioural.chainofresponsibility_done.spreadsheeds.handler.FormatHandler;

public class ExcelSpreadSheet extends FormatHandler {

    private static final String FORMAT = ".xls";

    public ExcelSpreadSheet(FormatHandler next) {
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
