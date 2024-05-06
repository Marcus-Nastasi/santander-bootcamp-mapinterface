package com.santander.mapinterface.searchMap;

public class Product {

    private final int id;
    private final String name;
    private final int quantity;
    private final double price;

    public Product(int id, String name, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public String toString() {
        return(
            "Product{" + "id=" + id +
            ", name='" + name + '\'' +
            ", quantity=" + quantity +
            ", price=" + price + '}'
        );
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }
}


