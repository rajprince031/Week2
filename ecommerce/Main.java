package com.ecommerce;
import java.util.ArrayList;

public class Main {
    public static void main(String[] agrs){
        // Create instances of Electronics, Groceries and Clothing
        Product electronics = new Electronics("1234","Head Phone", 449);
        Product groceries = new Groceries("4567","vegetables", 120);
        Product clothing = new Clothing("7890","jeans", 1900);

        // Create a list of products
        ArrayList<Product> products = new ArrayList<>();
        products.add(electronics);
        products.add(groceries);
        products.add(clothing);

        //Iterate and print the details of products
        for(Product product : products){
            product.displayDetails();
            product.getTaxDetails();
        }
    }
}
