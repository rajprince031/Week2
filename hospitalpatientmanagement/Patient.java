package com.hospitalpatientmanagement;

public abstract class Patient implements MedicalRecord {
    //Instance variables
    private final String PATIENT_ID;
    private String name;
    private int age;

    // Getter and Setter methods for encapsulation
    public String getPATIENT_ID() {
        return PATIENT_ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Patient(String PATIENT_ID, String name, int age) {
        this.PATIENT_ID = PATIENT_ID;
        this.name = name;
        this.age = age;
    }

    // Abstract method to be implemented by subclasses
    public abstract double calculateBill();

    // Concrete method to display Patient details
    public void getPatientDetails(){
        System.out.println("\nPatient Details\n");
        System.out.println("Name: "+this.name);
        System.out.println("Patient ID: "+this.PATIENT_ID);
        System.out.println("Age : "+this.age);
        System.out.println("Total Bill : "+this.calculateBill());
        System.out.println("---------------------------------------------------");
    }
}
