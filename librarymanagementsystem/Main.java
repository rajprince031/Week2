package com.librarymanagementsystem;

public class Main {
    public static void main(String[] agrs){
        //Creating objects
        LibraryItem book = new Book(111,"Harry Potter","JK Rollin", true);
        LibraryItem magazine = new Magazine(222,"MS Dhoni : Success Story","Prince Raj", true);
        LibraryItem dvd = new DVD(333,"Himesh Rashmiya songs","Himesh  Reshmmiya", true);

        //Reserved Book
        book.checkAvailability();
        book.reserveItem();

        dvd.checkAvailability();

        //Display details of item
        book.itemDetails();
        dvd.itemDetails();
        magazine.itemDetails();
    }
}
