package com.bankingsystem;

public class Main {
    public static void main(String[] args) {
        // Create accounts
        BankAccount savings = new SavingsAccount("001", "Prince", 1000, 5);
        BankAccount current = new CurrentAccount("002", "Bittu", 2000,2);

        // Deposit and withdraw
        savings.deposit(500);
        current.withdraw(100);

        // Calculate interest
        System.out.println("Savings Interest: Rs" + savings.calculateInterest());
        System.out.println("Current Interest: Rs" + current.calculateInterest());

        //Check for Loan
        savings.calculateLoanEligibility();
        savings.applyForLoan(2000);

        current.calculateLoanEligibility();
        current.applyForLoan(900);

        //Display Account details
        savings.displayDetails();
        current.displayDetails();
    }
}
