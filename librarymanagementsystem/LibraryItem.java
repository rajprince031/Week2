package com.librarymanagementsystem;

public abstract class LibraryItem implements Reservable{
    //instance variables
    private final int ITEM_ID;
    private String title;
    private String author;

    //Constructor
    public LibraryItem(int ITEM_ID, String title, String author) {
        this.ITEM_ID = ITEM_ID;
        this.title = title;
        this.author = author;
    }

    // Getter and Setter methods for encapsulation
    public int getITEM_ID() {
        return ITEM_ID;
    }

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

    // Abstract method to be implemented by subclasses
    public abstract int getLoanDuration();

    // Concrete method to display Item details
    public void itemDetails(){
        System.out.println("\nItem Details\n");
        System.out.println("Item Id: " + this.ITEM_ID);
        System.out.println("Author: " +this.author);
        System.out.println("Title: " + this.title);
        System.out.println("Loan Duration: " + this.getLoanDuration());
        System.out.println("--------------------------------------------------");

    }

}
