package com.hospitalpatientmanagement;

import java.util.ArrayList;
import java.util.List;

public class InPatient extends Patient {
    //Instance variables
    private int daysStayed;
    private double dailyRate;
    private double treatmentCost;
    private List<String> medicalRecords;

    // Constructor
    public InPatient(String patientId, String name, int age, int daysStayed, double dailyRate, double treatmentCost) {
        super(patientId, name, age);
        this.daysStayed = daysStayed;
        this.dailyRate = dailyRate;
        this.treatmentCost = treatmentCost;
        medicalRecords = new ArrayList<>();
    }

    @Override
    public double calculateBill() {
        return (daysStayed * dailyRate) + treatmentCost; // Billing logic for InPatient
    }

    // Getter and Setter methods
    public int getDaysStayed() {
        return daysStayed;
    }

    public void setDaysStayed(int daysStayed) {
        this.daysStayed = daysStayed;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    public double getTreatmentCost() {
        return treatmentCost;
    }

    public void setTreatmentCost(double treatmentCost) {
        this.treatmentCost = treatmentCost;
    }

    @Override
    public void addRecord(String record) {
        medicalRecords.add(record);
        System.out.println("Record added: " + record);
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical Records for " + getName() + ":");
        for (String record : medicalRecords) {
            System.out.println(record);
        }
    }
}
