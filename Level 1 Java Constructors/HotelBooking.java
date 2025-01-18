
import java.util.Scanner;

//Create the HotelBooking to print the Booking details of Hotel
public class HotelBooking{
    public static void main(String[] agrs){

        //Create a Hotel object to store the Hotel details using constructor.
        Hotel hotel1 = new Hotel("Prince Raj","classic",11);
        Hotel hotel2 = new Hotel("virani","permimum",4);
        Hotel hotel3 = new Hotel("Dhani","Single Bed",2);

        Hotel hotel5 = new Hotel(hotel3); // it copy the Hotel4 value in Hotel5
        //Display all Hotel Details
        hotel1.display();
        hotel2.display();
        hotel3.display();
        hotel5.display();

    }
}