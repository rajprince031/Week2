package com.bankingsystem;

public abstract class BankAccount implements Loanable {
    //Instance variables
    private final String ACCOUNT_NUMBER;
    private String holderName;
    private double balance;

    // Constructor
    public BankAccount(String ACCOUNT_NUMBER, String holderName, double balance) {
        this.ACCOUNT_NUMBER = ACCOUNT_NUMBER;
        this.holderName = holderName;
        this.balance = balance;
    }

    // Getter and Setter methods for encapsulation
    public String getACCOUNT_NUMBER() {
        return ACCOUNT_NUMBER;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Concrete method to deposit amount
    public void deposit(double amount){
        if(amount < 0){
            System.out.println("Enter valid amount");
            return;
        }
        this.balance = this.balance + amount;
        System.out.println("Deposited: Rs" + amount);

    }

    // Concrete method to withdraw amount
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: Rs" + amount);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    // Abstract method to be implemented by subclasses
    public abstract double calculateInterest();

    @Override
    public void applyForLoan(double loanAmount) {
        if (loanAmount <= 1000) {
            System.out.println("Loan approved for: Rs" + loanAmount);
        } else {
            System.out.println("Loan amount exceeds limit.");
        }
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() >= 500; // Eligible for loan if balance > Rs500
    }


    // Concrete method to display bank details
    public void displayDetails(){
        System.out.println("\nBank Details\n");
        System.out.println("Holder Name: " + this.holderName);
        System.out.println("Account Number: " +this.ACCOUNT_NUMBER);
        System.out.println("Balance: Rs" + this.balance);
        System.out.println("Interest: Rs" + calculateInterest());
        System.out.println("--------------------------------------------------");

    }
}
