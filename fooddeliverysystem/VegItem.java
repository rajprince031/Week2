package com.fooddeliverysystem;

public class VegItem extends FoodItem{
    //Constructor
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * 0.15;
    }

    @Override
    public void getDiscountDetails() {
        System.out.println("15% discount on Veg Item");
    }
}
