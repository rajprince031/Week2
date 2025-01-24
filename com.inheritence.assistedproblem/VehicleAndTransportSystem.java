class Vehicle{
    
    //instance variable
    private int maxSpeed;
    private String fuelType;

    //Constructor to initialize Class details 
    Vehicle(int maxSpeed, String fuelType){
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }
    
    // Instance method to display details
    public void displayDetails(){
        System.out.println("Max Speed : "+ this.maxSpeed);
        System.out.println("Fuel Type : "+ this.fuelType);
    }

}
class Car extends Vehicle{
    //instance variable
    private int seatCapcity;

    //Constructor to initialize Class details 
    Car(int maxSpeed, String fuelType, int seatCapcity){
        // Calling the parent class constructor
        super(maxSpeed, fuelType);
        this.seatCapcity = seatCapcity;
    }

    @Override
    public void displayDetails(){
        System.out.println("Display details of Car");
        super.displayDetails();
        System.out.println("Seat Capacity : "+this.seatCapcity);
    }
}
class Truck extends Vehicle{
    //instance variable
    private int capcity;

    //Constructor to initialize Class details 
    Truck(int maxSpeed, String fuelType, int capcity){
        // Calling the parent class constructor
        super(maxSpeed, fuelType);
        this.capcity = capcity;
    }

    @Override
    public void displayDetails(){
        System.out.println("Display details of Truck");
        super.displayDetails();
        System.out.println("Truck Capacity : "+this.capcity);
    }
}
class Motorcycle extends Vehicle{
    //instance variable
    private int stockEngine;

    //Constructor to initialize Class details 
    Motorcycle(int maxSpeed, String fuelType, int stockEngine){
        // Calling the parent class constructor
        super(maxSpeed, fuelType);
        this.stockEngine = stockEngine;
    }

    @Override
    public void displayDetails(){
        System.out.println("Display details of Motorcycle");
        super.displayDetails();
        System.out.println("Stock Engine : "+this.stockEngine);
    }
}

public class VehicleAndTransportSystem {
    public static void main(String[] agrs){
        //Creating object of Car class
        Car car = new Car(280, "Disel", 5);
        car.displayDetails();

        //Creating object of Truck class
        Truck truck = new Truck(190, "petrol", 30000);
        truck.displayDetails();

        //Creating object of Motorcycle class
        Motorcycle motorcycle = new Motorcycle(300, "pertrol", 4);
        motorcycle.displayDetails();
    }
}
