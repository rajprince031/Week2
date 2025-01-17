
import java.util.Scanner;

//Create the DisplayEmployeeDetails to print the details of Employee
public class DisplayEmployeeDetails{
    public static void main(String[] agrs){

        //Create the Scanner class to take a input from the user.
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the name of the Employee");
        String name = input.nextLine();

        System.out.println("Enter the ID of the Employee");
        String id = input.nextLine();

        System.out.println("Enter the salary of the Employee");
        double salary = input.nextDouble();

        //Create a Employee object to store the employee details using constructor.
        Employee Employee = new Employee(name,id,salary);

        //Call the display method to print the details of employee
        Employee.display();

        //Close the input 
        input.close();
    }
}