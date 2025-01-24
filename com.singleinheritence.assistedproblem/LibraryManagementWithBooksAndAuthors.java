class Book{
    
    //instance variable
    private String title;
    private int publicationYear;

    
    //Constructor to initialize Class details 
    Book(String title, int publicationYear){
        this.title = title;
        this.publicationYear = publicationYear;
    }
    //Instance metod to display the  details of books
    public void displayDetails(){
        System.out.println("Title : "+this.title);
        System.out.println("Publication Year : "+this.publicationYear);
    }
}

class Author extends Book{
    //instance variable
    private String name;
    private String bio;
    
    //Constructor to initialize Class details 
    Author(String name, String bio, String title, int publicationYear){
        // Calling the parent class constructor
        super(title,publicationYear);
        this.name = name;
        this.bio = bio;
    }

    @Override
    public void displayDetails(){
        System.out.println("Name : "+this.name);
        System.out.println("Bio : "+this.bio);
        super.displayDetails();
    }
}

public class LibraryManagementWithBooksAndAuthors {
    public static void main(String[] agrs){
        //Creating object of Book class
        Book book = new Book("Viraj: The Time Traveller",2024);
        book.displayDetails();

        //Creating object of Author class
        Author author = new Author("Prince Raj", "I am a Software developer but I am going to write the new version of Harry Potter series","Harry Potter -  False Hooks", 2024);
        author.displayDetails();

    }
}
