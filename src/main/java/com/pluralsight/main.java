package com.pluralsight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import static com.pluralsight.Products.getInventory;

public class main {
    public static void main(String[] args) {
        ArrayList<Products> inventory = getInventory();

        Collections.sort(inventory, Comparator.comparing(Products::getName));

        for (Products product : getInventory()) {
            System.out.println(product);
        }


    }




}
