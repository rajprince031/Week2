package com.fooddeliverysystem;

public class NonVegItem extends FoodItem {
    //Constructor
    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * 0.10;
    }

    @Override
    public void getDiscountDetails() {
        System.out.println("10% discount on Non-Veg Item");
    }
}
