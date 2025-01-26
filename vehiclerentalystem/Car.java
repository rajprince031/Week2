package com.vehiclerentalystem;

public class Car extends Vehicle{
    private String insurancePolicyNumber;
    public Car(String vehicleNumber, String type, double rentalRate, int days, String insurancePolicyNumber) {
        super(vehicleNumber, type, rentalRate, days);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getDays() * getRentalRate();
    }

    @Override
    public void getInsuranceDetails() {
        System.out.println("Insurance Policy Number: " + insurancePolicyNumber + ", Coverage: Basic");
    }

    @Override
    public double calculateInsurance() {
        return 0.05 * getRentalRate();
    }

}
