package com.ridehailingapplication;


public class Main {
    public static void main(String[] agrs) {
        //Creating objects
        Vehicle car = new Car("1111", "Harry Potter", 100, 85, "Bhopal");
        Vehicle bike = new Bike("2222", "Royn Willigli", 60, 23, "Mumbai");
        Vehicle auto = new Auto("1111", "Harsita", 80, 20, "Pune");

        //Update Location
        car.updateLocation("Panjab");
        auto.updateLocation("Delhi");

        //View location
        car.getCurrentLocation();
        bike.getCurrentLocation();
        auto.getCurrentLocation();


        //Display vehicle Details
        car.getVehicleDetails();
        bike.getVehicleDetails();
        auto.getVehicleDetails();

    }
}
