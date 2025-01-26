package com.vehiclerentalystem;

public abstract class Vehicle implements Insurable {
    private final String vehicleNumber;
    private String type;
    private double rentalRate;
    private int days;

    // Constructor
    public Vehicle(String vehicleNumber, String type, double rentalRate, int days) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
        this.days = days;
    }

    //Getter and Setter
    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(double rentalRate) {
        this.rentalRate = rentalRate;
    }

    // Abstract method to be implemented by subclasses
    public abstract double calculateRentalCost(int days);

    // Concrete method to display Vehicle details
    public void displayDetails() {
        System.out.println("Vehicle NUmber: " + this.vehicleNumber);
        System.out.println("Vehicle Type: " + this.type);
        System.out.println("Rental Rate : Rs" + this.rentalRate);
        System.out.println("Total Rental Charge : Rs" + calculateRentalCost(this.days));

    }

}
