
import java.util.Scanner;

//Create the ComputeAreaOfCircle to print the details of Circle
public class ComputeAreaOfCircle{
    public static void main(String[] agrs){

        //Create the Scanner class to take a input from the user.
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of the Circle (in m):");
        double radius = input.nextDouble();

        //Create a Employee object to store the employee details using constructor.
        Circle Circle = new Circle(radius);

        //Mehtod to compute the area and circumference
        Circle.computeArea();
        Circle.computeCircumference();

        //Method to display the area and circumference of circle
        Circle.displayArea();
        Circle.displayCircumference();

        //Close the input 
        input.close();
    }
}