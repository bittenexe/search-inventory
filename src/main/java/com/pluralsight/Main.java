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
        ArrayList<Product> product = new ArrayList<>();
        Product p1 = new Product(1, "Strawberry", 1.99);
        product.add(p1);
        return product;

    }


}

