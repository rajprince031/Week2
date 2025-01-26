package com.bankingsystem;

public class CurrentAccount extends BankAccount {
    //Instance variables
    private double interestRate;

    //Constructor
    public CurrentAccount(String ACCOUNT_NUMBER, String holderName, double balance, double interestRate) {
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
