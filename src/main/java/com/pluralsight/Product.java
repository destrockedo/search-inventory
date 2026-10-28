/*package com.pluralsight;

import java.util.ArrayList;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public static ArrayList<Product> getInventory() {

        ArrayList<Product> inventory = new ArrayList<>();

        inventory.add(new Product("Laptop", 799.99, 5));
        inventory.add(new Product("Mouse", 29.99, 10));
        inventory.add(new Product("Keyboard", 59.99, 8));
        inventory.add(new Product("Monitor", 199.99, 4));
        inventory.add(new Product("Headphones", 89.99, 6));

        return inventory;
    }

    @Override
    public String toString() {
        return "Product | " + name + " | " + price + " | " + quantity;
                /*"Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
*/