package com.codewithmosh.chainofresponsibility_done.spreadsheeds;

import com.codewithmosh.chainofresponsibility_done.spreadsheeds.handler.FormatHandler;

public class ExcelSpreadSheet extends FormatHandler {

    private static final String FORMAT = ".xls";
    public ExcelSpreadSheet(FormatHandler next) {
        super(next);
    }

    @Override
    protected boolean doHandle(String fileName) {
        return fileName.endsWith(FORMAT);
    }

}
