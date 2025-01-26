package com.bankingsystem;

public class SavingsAccount extends BankAccount {
    //Instance Variables
    private double interestRate;

    //Constructor
    public SavingsAccount(String ACCOUNT_NUMBER, String holderName, double balance, double interestRate) {
        super(ACCOUNT_NUMBER, holderName, balance);
        this.interestRate = interestRate;
    }

    // Getter and Setter methods for encapsulation
    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public double calculateInterest() {
        return getBalance() * (interestRate / 100);
    }


}