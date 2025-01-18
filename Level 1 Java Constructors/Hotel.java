public class Hotel {
    private String guestName;
    private String roomType;
    private int nights;

    //Getter and Setters
     public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getNights() {
        return nights;
    }

    public void setNights(int nights) {
        this.nights = nights;
    }

    //Create a parameterized constructor to assign the value of Hotel
    public Hotel(String guestName, String roomType, int nights){
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    //Create a copy constructor
    public Hotel(Hotel hotel){
        this.guestName = hotel.guestName;
        this.roomType = hotel.roomType;
        this.nights = hotel.nights;
    }

     //Display the Booking details
    public void display(){
        System.out.println("\nBooking Details\n");
        System.out.println("Guest Name : "+this.guestName);
        System.out.println("Room Type : "+this.roomType);
        System.out.println("Nights : "+this.nights);
    }
}
