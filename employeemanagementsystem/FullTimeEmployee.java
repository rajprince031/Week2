package com.employeemanagementsystem;

public class FullTimeEmployee extends Employee {
    public FullTimeEmployee(int employeeId, String name, double baseSalary) {
        super(employeeId, name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        // Full-time employee's salary is the base salary
        return getBaseSalary();
    }
}

