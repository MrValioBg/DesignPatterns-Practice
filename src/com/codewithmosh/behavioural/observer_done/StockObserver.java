package com.codewithmosh.behavioural.observer_done;

public interface StockObserver {

    void priceUpdated();

    void addStock(Stock stock);
}
