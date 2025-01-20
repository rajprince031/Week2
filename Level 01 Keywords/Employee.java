public class Employee {
    // Instance Variables
    private String name;
    private String designation;
    final String ID;
    private static int totalEmployee = 0;

    // Class Variable (shared among all products)
    private static String companyName = "Capgemini";

    //Create a method to update the company name
    public static void updateCompanyName(String companyName){
        Employee.companyName = companyName;
    }

    // Constructor to initialize employee details
    Employee(String name, String designation, String ID){
        this.name = name;
        this.designation = designation;
        this.ID = ID;
        totalEmployee++;
    }

    //Create a static method to print the number of employees
    public static void getTotalEmployees(){
        System.out.println("Total Employees : "+ totalEmployee);
    }

    // Instance method to display Employee details
    public void displayEmployeeDetails(){
        System.out.println("\nEmployee Details\n");
        System.out.println("Name : "+this.name);
        System.out.println("Designation : "+designation);
        System.out.println("ID : "+ID);
        System.out.println("Company Name : "+Employee.companyName);
    }

}
