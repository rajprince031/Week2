public class Vehicle {
    // Instance Variables
    private String ownerName;
    private String vehicleType;
    private final String REGISTRATION_NUMBER;

    // Class Variable (shared among all Vehicles)
    private static double registrationFee = 1000;

    //Create a method to update the Vehicle ownerName
    public static void updateRegistrationFee(double registrationFee){
        Vehicle.registrationFee = registrationFee;
    }

    // Constructor to initialize Vehicle details
    Vehicle(String ownerName, String vehicleType, String REGISTRATION_NUMBER){
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.REGISTRATION_NUMBER = REGISTRATION_NUMBER;
    }
    // Instance method to display Vehicle details
    public void displayVehicleDetails(){
        System.out.println("\nVehicle Details\n");
        System.out.println("Vehicle Ower Name : "+this.ownerName);
        System.out.println("Vehicle Type : "+this.vehicleType);
        System.out.println("Registration Number : "+this.REGISTRATION_NUMBER);
        System.out.println("Registration Fee : "+Vehicle.registrationFee);
    }

}
