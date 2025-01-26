package com.ridehailingapplication;

public abstract class Vehicle implements GPS{
    //Instance Variable
    private final String VEHICLE_ID;
    private String driverName;
    private double ratePerKm;
    private double  distance;

    //Constructor
    public Vehicle(String VEHICLE_ID, String driverName, double ratePerKm, double  distance) {
        this.VEHICLE_ID = VEHICLE_ID;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
        this.distance = distance;
    }

    public String getVehicleId() {
        return VEHICLE_ID;
    }

    //Getter and Setters
    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    public void setRatePerKm(double ratePerKm) {
        this.ratePerKm = ratePerKm;
    }

    public String getVEHICLE_ID() {
        return VEHICLE_ID;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }
    // Abstract method to be implemented by subclasses
    public abstract double calculateFare(double distance);

    // Concrete method to display Vehicle details
    public void getVehicleDetails() {
        System.out.println("\nVehicle Details\n");
        System.out.println("Vehicle ID: " + this.VEHICLE_ID);
        System.out.println("Driver Name: " + this.driverName);
        System.out.println("Rate (per km) : Rs" + this.ratePerKm);
        System.out.println("Total Fare : Rs" + calculateFare(this.distance));
        System.out.println("-------------------------------------------------");

    }


}
