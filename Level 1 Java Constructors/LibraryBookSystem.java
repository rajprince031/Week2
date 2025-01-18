import java.util.Scanner;

public class LibraryBookSystem {
    public static void main(String[] agrs){

        //Create a Book object to store the book details using constructor.
        Book1 book1 = new Book1("Two States","Chetan Bhagat",299);
        Book1 book2 = new Book1("Twisted Love","Ana Huang",399);

        //Call the borrow method
        book1.borrowBook();
        book1.borrowBook();
    

        //Call the display method to print the details of book
        book1.display();
        book2.display();
    }
}
