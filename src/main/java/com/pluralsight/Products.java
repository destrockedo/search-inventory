package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Products {
    private String name;
    private double price;
    private int id;

    public Products(String name, double price, int id) {
        this.name = name;
        this.price = price;
        this.id = id;
    }
    public static ArrayList<Products> getInventory() {

        ArrayList<Products> inventory = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("inventory.csv"))) {

            String line;

            while ((line = reader.readLine()) != null) {

                String[] parts = line.split("\\|");

                int id = Integer.parseInt(parts[0]);
                String name = parts[1];
                double price = Double.parseDouble(parts[2]);

                Products product = new Products(name, price, id);

                inventory.add(product);
            }

        } catch (IOException e) {
            System.out.println("Error reading inventory: " + e.getMessage());
        }

        return inventory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Product | " + name + " | " + price + " | " + id;
                /*"Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';*/
    }
}
