package com.ecommerce;

public class Groceries extends Product{
    //Constructor
    public Groceries(String PRODUCT_ID, String productName, double price) {
        super(PRODUCT_ID, productName, price);
    }

    @Override
    public double calculateDiscount() {
        //Groceries gets 20% discount
        return getPrice() * 0.10;
    }

    @Override
    public double calculateFinalPrice() {
        return (getPrice() + calculateTax() - calculateDiscount());
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.12;
    }

    @Override
    public String getTaxDetails() {
        return "Tax on Grocery is 12%";
    }
}
