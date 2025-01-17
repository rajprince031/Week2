
import java.util.Scanner;

//Create a DisplayItemDetails class to print the item details
public class DisplayItemDetails{
    public static void main(String[] agrs){

        //Create object of Scanner class to take a input from the user
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the name of the Item: ");
        String name = input.nextLine();

        System.out.print("Enter the code of the Item: ");
        String code = input.nextLine();

        System.out.print("Enter the price of the Item: ");
        double price = input.nextDouble();
        
        System.out.print("Enter the quantity of the Item: ");
        int quantity = input.nextInt();

        //Create object of Item class and pass the detials of Item using constructor.
        Item Item = new Item(name,code,price,quantity);

        Item.display();
        //Close the input 
        input.close();
    }
}