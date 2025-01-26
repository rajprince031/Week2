package com.fooddeliverysystem;

public abstract class FoodItem implements Discountable {
    //Instance variables
    private String itemName;
    private double price;
    private int quantity;


    // Getter and Setter methods for encapsulation
    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Abstract method to be implemented by subclasses
    public abstract double calculateTotalPrice();

    // Concrete method to display Food Item details
    public void getItemDetails(){
        System.out.println("Item Name: "+this.itemName);
        System.out.println("Price: "+this.price);
        System.out.println("Total price : "+calculateTotalPrice());
    }
}
