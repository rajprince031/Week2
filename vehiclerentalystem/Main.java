package com.vehiclerentalystem;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create instances of Bike, Car and Truck.
        Vehicle car = new Car("MP04QA1219","Four Wheeler",100,5, "38276087236");
        Vehicle bike = new Bike("MP04QA1319","Two Wheeler",50,10, "334576087236");
        Vehicle truck = new Truck("MP04QA1214","Ten Wheeler",200,15, "8736415078");

        // Create a list of vehicles
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(car);
        vehicles.add(bike);
        vehicles.add(truck);

        // Calculate and display rental and insurance details for each vehicle
        for (Vehicle vehicle : vehicles) {
            vehicle.displayDetails();
            // Display Insurance details
            vehicle.getInsuranceDetails();
            vehicle.calculateInsurance();
            System.out.println("--------------------------------");
        }
    }
}

