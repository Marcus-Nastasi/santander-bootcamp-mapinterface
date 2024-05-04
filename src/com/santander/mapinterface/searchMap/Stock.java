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

    public double totalValue() throws RuntimeException {
        if(this.productStock.isEmpty()) throw new RuntimeException("Empty stock");
        double totalValue = 0.0;
        for(Product p: this.productStock.values()) totalValue += (p.getQuantity() * p.getPrice());
        return totalValue;
    }

    public Product getExpensiver() throws RuntimeException {
        if(this.productStock.isEmpty()) throw new RuntimeException("Empty stock");
        Product product = null;
        double value = 0.0;
        for(Product p: this.productStock.values()) if(p.getPrice() > value) {
            value = p.getPrice();
            product = p;
        }
        return product;
    }
}


