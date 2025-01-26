package com.hospitalpatientmanagement;

import java.util.ArrayList;
import java.util.List;

public class OutPatient extends Patient {
    //Instance variables
    private double consultationFee;
    private double additionalTreatmentCost;
    private List<String> medicalRecords;

    // Constructor
    public OutPatient(String patientId, String name, int age, double consultationFee, double additionalTreatmentCost) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
        this.additionalTreatmentCost = additionalTreatmentCost;
        medicalRecords = new ArrayList<>();
    }

    @Override
    public double calculateBill() {
        return consultationFee + additionalTreatmentCost; // Billing logic for OutPatient
    }

    // Getter and Setter methods
    public double getConsultationFee() {
        return consultationFee;
    }

    public void setConsultationFee(double consultationFee) {
        this.consultationFee = consultationFee;
    }

    public double getAdditionalTreatmentCost() {
        return additionalTreatmentCost;
    }

    public void setAdditionalTreatmentCost(double additionalTreatmentCost) {
        this.additionalTreatmentCost = additionalTreatmentCost;
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
