package com.pluralsight;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        ArrayList<Product> inventory = getInventory();
        for (int i = 0; i < inventory.size(); i++) {
            Product currentProduct = inventory.get(i);
            System.out.println(currentProduct.getId() + " " + currentProduct.getName() + " " + currentProduct.getPrice());

        }
    }

    public static ArrayList<Product> getInventory() {
        ArrayList<Product> products = new ArrayList<>();
        Product p1 = new Product(13434, "Strawberries", 1.99);
        Product p2 = new Product(22345, "Grapes", 2.99);
        Product p3 = new Product(10534, "Bananas", .99);
        Product p4 = new Product(69678, "Mangoes", 3.99);
        Product p5 = new Product(26501, "Coconut", 4.99);

        products.add(p1);
        products.add(p2);
        products.add(p3);
        products.add(p4);
        products.add(p5);
        return products;

    }

}

