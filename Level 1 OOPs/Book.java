
//Create a Book class the store the details of Book
public class Book{

    //Define the attribute of the
    private String title;
    private String author;
    private double price;

    //Create a constructor to assign the value of Book
    public Book(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    //Display the mobile details
    public void display(){
        System.out.println("\nBook Details\n");
        System.out.println("Title : "+this.title);
        System.out.println("Author : "+this.author);
        System.out.println("Price : "+this.price);
    }
}