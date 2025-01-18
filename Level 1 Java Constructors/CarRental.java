
import java.util.Scanner;

//Create the CarRental to print the Booking details of CarRent
public class CarRental{
    public static void main(String[] agrs){

        //Create a Car object to store the Car details using constructor.
        Car car1 = new Car("Prince Raj","Dodge Challenger",5,100);
        Car car2 = new Car("Bittu Raj","Audi",8,110);
        Car car3 = new Car("Virani Singh","BMW",19,113);

        //Display all Car Details
        car1.display();
        car2.display();
        car3.display();
    }
}