//Create a Book1 class the store the details of Book
public class Book1 {
    // Define the attribute of the
    private String title;
    private String author;
    private double price;
    private boolean availability;

    //Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    // Create a parameterized constructor to assign the value of Book
    public Book1(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = true;
    }

    // Create a method the check the availability of the book
    public void borrowBook() {
        if (availability) {
            this.availability = false;
            System.out.println("You have successfully borrowed the book: " + this.title);
        } else {
            System.out.println("Sorry, the book '" + title + "' is currently unavailable.");
        }
    }

    // Display the mobile details
    public void display() {
        System.out.println("\nBook Details\n");
        System.out.println("Title : " + this.title);
        System.out.println("Author : " + this.author);
        System.out.println("Price : " + this.price);
        System.out.println("ailability : " + this.availability);
    }
}
