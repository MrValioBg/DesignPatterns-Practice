package com.codewithmosh.observer;

import java.util.ArrayList;
import java.util.List;

public class StockListView implements Observer {
    private List<Stock> stocks = new ArrayList<>();

    public void addStock(Stock stock) {
        stocks.add(stock);

    }

    public void show() {
        System.out.println("StockViewList");
        for (var stock : stocks)
            System.out.println(stock);
    }

    @Override
    public void priceUpdated() {
        System.out.println("Price is Updated in the StockListView");
        show();
    }
}
