package com.codewithmosh.behavioural.chainofresponsibility_done;

public class Demo {

    public static void show(String fileName) {
        var dataReader = new DataReader();
        dataReader.read(fileName);
    }
}
