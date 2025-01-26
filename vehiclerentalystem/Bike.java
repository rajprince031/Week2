package com.vehiclerentalystem;

public class Bike extends Vehicle{
    private String insurancePolicyNumber;
    public Bike(String vehicleNumber, String type, double rentalRate, int days, String insurancePolicyNumber) {
        super(vehicleNumber, type, rentalRate, days);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    public String getInsurancePolicyNumber() {
        return insurancePolicyNumber;
    }

    public void setInsurancePolicyNumber(String insurancePolicyNumber) {
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        //Bike are slightly cheaper than car
        return getDays() * getRentalRate() * 0.8;
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
