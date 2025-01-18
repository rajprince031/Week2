
import java.util.Scanner;

//Create the ComputeAreaOfCircle to print the details of Circle
public class ComputeAreaOfCircle{
    public static void main(String[] agrs){

        //Create the Scanner class to take a input from the user.
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of the Circle (in m):");
        double radius = input.nextDouble();

        //Create a Employee object to store the employee details using constructor.
        Circle Circle1 = new Circle(radius);

        Circle Circle2 = new Circle(); //It print the message that radius is required.

        //Method to compute the area and circumference
        Circle1.computeArea();
        Circle1.computeCircumference();

        //Method to display the area and circumference of circle
        Circle1.displayArea();
        Circle1.displayCircumference();

        //Close the input 
        input.close();
    }
}