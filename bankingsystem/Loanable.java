package com.bankingsystem;

public interface Loanable {
    boolean calculateLoanEligibility();
    void applyForLoan(double loanAmount);

}
