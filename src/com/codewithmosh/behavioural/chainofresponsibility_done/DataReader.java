package com.codewithmosh.behavioural.chainofresponsibility_done;

import com.codewithmosh.behavioural.chainofresponsibility_done.spreadsheeds.ExcelSpreadSheet;
import com.codewithmosh.behavioural.chainofresponsibility_done.spreadsheeds.NumberSpreadSheet;
import com.codewithmosh.behavioural.chainofresponsibility_done.spreadsheeds.QuickBook;

public class DataReader {

    public void read(String fileName) {
        var quickBookFile = new QuickBook(null);
        var numbersSheet = new NumberSpreadSheet(quickBookFile);
        var excelSheet = new ExcelSpreadSheet(numbersSheet);

        excelSheet.read(fileName);
    }
}
