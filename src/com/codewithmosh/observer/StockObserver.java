package com.codewithmosh.observer;

public interface StockObserver {

    void priceUpdated();

    void addStock(Stock stock);
}
