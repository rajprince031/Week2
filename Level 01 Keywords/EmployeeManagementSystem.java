public class  EmployeeManagementSystem{
    public static void main(String[] agrs){

        // Creating Employee objects
        Employee employee = new Employee("Prince Raj","Software Engineer", "0111CS211120");



        //Checking the instance
        if(employee instanceof Employee)
        {  
            System.out.println("employee is an instance of Employee");

            System.out.println("Before updating company Name:");
            // Displaying Employee details
            employee.displayEmployeeDetails();
            // Updating the Company name for all Employee
            Employee.updateCompanyName("Accenture");

            // Displaying Employee details after updating the Company name
            System.out.println("\nAfter updating Company Name");
            employee.displayEmployeeDetails();
        }else{
            System.out.println("employee is not an instance of Employee");
        }

        //Print the total Number of Employees
        Employee.getTotalEmployees();
    }
}