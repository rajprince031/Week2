public class LibraryManagementSystem{
    public static void main(String[] agrs){

        // Creating Book objects
        Book book = new Book("Harry Potter","JK Rollin", "0111CS211120");


        //Checking the instance
        if(book instanceof Book)
        {  
            System.out.println("Before updating Library Name:");
            System.out.println("book is an instance of Book");

            //Display the library name
            Book.displayLibraryName();
            // Displaying Book details
            book.displayBookDetails();


            // Updating the Library name
            Book.updateLibraryName("Kanchaa Library");

            // Displaying Book details after updating the Library name
            System.out.println("\nAfter updating Library Name:");

            //Display the library name
            Book.displayLibraryName();
            book.displayBookDetails();
        }else{
            System.out.println("book is not an instance of Book");
        }

        
    }
}