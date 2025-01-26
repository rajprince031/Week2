package com.employeemanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create instances of FullTimeEmployee and PartTimeEmployee
        Employee fullTimeEmployee = new FullTimeEmployee(1, "Alice", 5000);
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee(2, "Bob", 0, 120, 20);  // 120 hours at $20/hr

        // Assign departments
        EmployeeDepartment department = new EmployeeDepartment();
        department.assignDepartment("HR");

        // Display employee details using polymorphism
        List<Employee> employees = new ArrayList<>();
        employees.add(fullTimeEmployee);
        employees.add(partTimeEmployee);

        // Print details of all employees
        for (Employee employee : employees) {
            employee.displayDetails();
            System.out.println(department.getDepartmentDetails());
            System.out.println("-------------------------------");
        }
    }
}

