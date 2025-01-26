package com.ecommerce;

public abstract class Product implements Taxable {
    private final String PRODUCT_ID;
    private String productName;
    private double price;

    //Constructor
    public Product(String PRODUCT_ID, String productName, double price) {
        this.PRODUCT_ID = PRODUCT_ID;
        this.productName = productName;
        this.price = price;
    }

    // Getter and Setter methods for encapsulation
    public String getPRODUCT_ID() {
        return PRODUCT_ID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Abstract method to be implemented by subclasses
    public abstract double calculateDiscount();
    public abstract double calculateFinalPrice();

    // Concrete method to display employee details
    public void displayDetails() {
        System.out.println("Product ID: " + this.PRODUCT_ID);
        System.out.println("Product Name: " + this.productName);
        System.out.println("Price: Rs" + this.price);
        System.out.println("Discount: Rs" + calculateDiscount());
        System.out.println(getTaxDetails());
        System.out.println("Final Price: Rs" + calculateFinalPrice());

        System.out.println("-------------------------------------------------");

    }
}
