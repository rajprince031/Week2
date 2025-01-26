package com.ecommerce;


public class Clothing extends Product{
    //Constructor
    public Clothing(String PRODUCT_ID, String productName, double price) {
        super(PRODUCT_ID, productName, price);
    }

    @Override
    public double calculateDiscount() {
        //Clothing gets 20% discount
        return getPrice() * 0.20;
    }

    @Override
    public double calculateFinalPrice() {
        return (getPrice() + calculateTax() - calculateDiscount());
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.18;
    }

    @Override
    public String getTaxDetails() {
        return "Tax on cloths is 18%";
    }
}
