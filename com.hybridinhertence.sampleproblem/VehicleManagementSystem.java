class Vehicle{
    //instance variable
    protected int maxSpeed;
    protected String model;

    //Constructor to initialize Class details
    Vehicle(String model, int maxSpeed){
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    //Instance method to display the  details of Vehicle
    public void vehicleDetails(){
        System.out.println("Model : "+this.model);
        System.out.println("Max Speed : "+this.maxSpeed);
    }


}


// Refuelable interface: Interface for refuel method
interface Refuelable{
    void refuel();  // Abstract method
} 

class ElectricVehicle extends Vehicle{
    //Constructor to initialize Class details
    ElectricVehicle(String model, int maxSpeed){
        // Calling the parent class constructor
        super(model,maxSpeed);
    }


    //Instance method
    public void recharge() {
        System.out.println(this.model+" is a Electric Vehicle. It can be recharge.");
    }

    @Override
    public void vehicleDetails(){
        System.out.println(" Vehicle Details");
        super.vehicleDetails();
    }
}

class PetrolVehicle extends Vehicle implements Refuelable{
    //Constructor to initialize Class details
    PetrolVehicle(String model, int maxSpeed){
        // Calling the parent class constructor
        super(model,maxSpeed);
    }

    // Implementing refuel() from Refuelable interface
    public void refuel() {
        System.out.println(this.model+" is a Petrol Vehicle. It can be refuel.");
    }

    @Override
    public void vehicleDetails(){
        System.out.println(" Vehicle Details");
        super.vehicleDetails();
    }
    

}


public class VehicleManagementSystem {
    public static void main(String[] agrs){
        //Creating object of PetrolVehicle class
       PetrolVehicle petrolVehicle = new PetrolVehicle("Prince Raj",22);
       petrolVehicle.vehicleDetails();
       petrolVehicle.refuel();

        //Creating object of ElectricVehicle class
        ElectricVehicle electricVehicle = new ElectricVehicle("Prince Raj",22);
        electricVehicle.vehicleDetails();
        electricVehicle.recharge();

       
    }
}
