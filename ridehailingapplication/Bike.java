package com.ridehailingapplication;

public class Bike extends Vehicle{
    //Instance variables
    private String location;

    //Getters and Setters
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Bike(String VEHICLE_ID, String driverName, double ratePerKm, double distance, String location) {
        super(VEHICLE_ID, driverName, ratePerKm, distance);
        this.location = location;
    }

    @Override
    public double calculateFare(double distance) {
        return getDistance() * getRatePerKm();
    }

    @Override
    public String getCurrentLocation() {
        return this.location;
    }

    @Override
    public void updateLocation(String location) {
        this.location = location;
    }
}
