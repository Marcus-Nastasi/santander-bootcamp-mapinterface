package com.santander.mapinterface.searchMap;

import java.util.HashMap;
import java.util.Map;

public class Stock {

    private final Map<Integer, Product> productStock = new HashMap<>();

    public Stock() {}

    public void addProduct(int id, String name, int qnt, double price) {
        this.productStock.put(id, new Product(id, name, qnt, price));
    }

    public void showAll() {
        System.out.println(this.productStock);
    }


}
