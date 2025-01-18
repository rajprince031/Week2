
import java.util.Scanner;

//Create the DisplayBookDetails to print the details of Book
public class DisplayBookDetails{
    public static void main(String[] agrs){

        //Create the Scanner class to take a input from the user.
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the title of the Book: ");
        String title = input.nextLine();

        System.out.print("Enter the Author of the Book: ");
        String author = input.nextLine();

        System.out.println("Enter the price of the Book: ");
        double price = input.nextDouble();


        //Create a Book object to store the book details using constructor.
        Book Book1 = new Book(title,author,price);
        Book Book2 = new Book(); // if we not pass the details of the book. it show the message 


        //Call the display method to print the details of book
        Book1.display();
        //Close the input 
        input.close();
    }
}