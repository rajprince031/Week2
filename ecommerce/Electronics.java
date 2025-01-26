package com.ecommerce;

public class Electronics extends Product{

    //Constructor
    public Electronics(String PRODUCT_ID, String productName, double price) {
        super(PRODUCT_ID, productName, price);
    }

    @Override
    public double calculateDiscount() {
        //Electronics gets 10% discount
        return getPrice() * 0.10;
    }

    @Override
    public double calculateFinalPrice() {
        return (getPrice() + calculateTax() - calculateDiscount());
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.15;
    }

    @Override
    public String getTaxDetails() {
        return "Tax on electronics is 15%";
    }


}
