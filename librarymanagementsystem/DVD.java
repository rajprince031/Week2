package com.librarymanagementsystem;

public class DVD extends LibraryItem{
    //instance variables
    private boolean isAvailable;

    // Getter and Setter methods for encapsulation
    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    //Constructor
    public DVD(int ITEM_ID, String title, String author, boolean isAvailable) {
        super(ITEM_ID, title, author);
        this.isAvailable = isAvailable;
    }

    @Override
    public int getLoanDuration() {
        return 3;
    }

    @Override
    public void reserveItem() {
        this.isAvailable = false;
        System.out.println(getTitle()+" is Reserved");
    }

    @Override
    public void checkAvailability() {
        if(isAvailable){
            System.out.println(getTitle()+" is Available");
        }else{
            System.out.println(getTitle()+" is  Unavailable");
        }
    }
}
