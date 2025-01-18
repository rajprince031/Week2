
//Create a Book class the store the details of Book
public class Book{

    //Define the attribute of the
    private String title;
    private String author;
    private double price;

    //Getter and Setter
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //Create a parameterized constructor to assign the value of Book
    public Book(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    //Create a default Constructor
    public Book(){
        System.out.println("Please enter the details of the book");
    }

    //Display the mobile details
    public void display(){
        System.out.println("\nBook Details\n");
        System.out.println("Title : "+this.title);
        System.out.println("Author : "+this.author);
        System.out.println("Price : "+this.price);
    }
}