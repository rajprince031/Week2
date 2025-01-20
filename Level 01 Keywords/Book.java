public class Book {
    // Instance Variables
    private String title;
    private String author;
    final String ISBN;

    // Class Variable (shared among all products)
    private static String libraryName = "Tituti Library";

    //Create a method to update the library name
    public static void updateLibraryName(String libraryName){
        Book.libraryName = libraryName;
    }

    // Constructor to initialize book details
    Book(String title, String author, String ISBN){
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    //Create a static method to print the library name
    public static void displayLibraryName(){
        System.out.println("Library Name : "+ libraryName);
    }

    // Instance method to display Bank details
    public void displayBookDetails(){
        System.out.println("\nBook Details\n");
        System.out.println("Title : "+this.title);
        System.out.println("Author : "+author);
    }

}
