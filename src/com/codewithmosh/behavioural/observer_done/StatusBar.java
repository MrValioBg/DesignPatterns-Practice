package com.codewithmosh.behavioural.observer_done;

import java.util.ArrayList;
import java.util.List;

public class StatusBar implements StockObserver {
    private final List<Stock> stocks = new ArrayList<>();


    public void addStock(Stock stock) {
        stocks.add(stock);
        stock.addObserver(this);
    }

    public void show() {
        System.out.println("StatusBar");
        for (var stock : stocks)
            System.out.println(stock);
    }

    @Override
    public void priceUpdated() {
        System.out.println("Prices are updated in the Status Bar");
        show();
    }
}
