package com.fooddeliverysystem;


public class Main {
    public static void main(String[] args) {
        // Create accounts
        FoodItem vegItem = new VegItem("Panner Paratha", 299, 4);
        FoodItem nonVegItem = new NonVegItem("Chicken chilli", 399, 2);

        // Display FoodItem detail
        vegItem.getItemDetails();
        vegItem.getDiscountDetails();
        vegItem.calculateTotalPrice();
        System.out.println("Final price after discount: Rs"+(vegItem.calculateTotalPrice() - vegItem.applyDiscount()));
        System.out.println("------------------------------------------------");


        nonVegItem.getItemDetails();
        nonVegItem.getDiscountDetails();
        nonVegItem.calculateTotalPrice();
        System.out.println("Final price after discount"+(vegItem.calculateTotalPrice() - vegItem.applyDiscount()));
        System.out.println("------------------------------------------------");

    }
}
