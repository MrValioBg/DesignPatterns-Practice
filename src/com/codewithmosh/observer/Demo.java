package com.codewithmosh.observer;

public class Demo {

    public static void goShowMe() {

        var statusBar = new StatusBar();
        var stockViewList = new StockListView();

        var stockCoolish = new Stock("cool", 7);
        var stockFoolish = new Stock("fool", 7);

        stockCoolish.addObserver(statusBar);
        stockCoolish.addObserver(stockViewList);
        stockFoolish.addObserver(statusBar);

        System.out.println("Updating stock coolish...");
        stockCoolish.setPrice(3);


        System.out.println("Updating stock foolish... Bull run?");
        stockFoolish.setPrice(225);

    }
}
