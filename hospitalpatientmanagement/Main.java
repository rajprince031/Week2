package com.hospitalpatientmanagement;

public class Main {
    public static void main(String[] agrs){
        //Creating the object of class
        Patient inPatient = new InPatient("1111","Rahul Raj", 22, 5, 1000, 23000);
        Patient outPatient = new OutPatient("1111","Salman Khan", 22, 500, 7000);

        //Add medical Record
        inPatient.addRecord("Dental Checking");
        outPatient.addRecord("Kidney Infection");

        //Display medical Record
        inPatient.viewRecords();
        outPatient.viewRecords();

        //Display  Patient Details
        inPatient.getPatientDetails();
        outPatient.getPatientDetails();
    }
}
