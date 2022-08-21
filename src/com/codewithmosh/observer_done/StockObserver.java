package com.codewithmosh.observer_done;

public interface StockObserver {

    void priceUpdated();

    void addStock(Stock stock);
}
