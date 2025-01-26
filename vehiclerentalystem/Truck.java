package com.vehiclerentalystem;

public class Truck extends Vehicle {
    private String insurancePolicyNumber;

    public Truck(String vehicleNumber, String type, double rentalRate, int days, String insurancePolicyNumber) {
        super(vehicleNumber, type, rentalRate, days);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        //Truck are more expensive
        return getDays() * getRentalRate() * 1.5;
    }

    @Override
    public void getInsuranceDetails() {
        System.out.println("Insurance Policy Number: " + insurancePolicyNumber + ", Coverage: Basic");
    }

    @Override
    public double calculateInsurance() {
        return 0.08 * getRentalRate();
    }

}
