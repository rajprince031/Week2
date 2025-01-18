public class Vehicle {

    // Instance Variables
    private String ownerName;
    private String vehicleType;


    // Class Variable (shared among all products)
    private static double registrationFee = 1000;

   
    public static void updateRegistrationFee(double registrationFee) {
        Vehicle.registrationFee = registrationFee;
    }

    // Getter and setters
    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public static double getRegistrationFee() {
        return registrationFee;
    }

    public static void setRegistrationFee(double registrationFee) {
        Vehicle.registrationFee = registrationFee;
    }

    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method to display course details
    public void displayVehicleDetails() {
        System.out.println("Ower Name: " + this.ownerName);
        System.out.println("Vehicle Type: " + this.vehicleType);
        System.out.println("Registration fee: "+ Vehicle.registrationFee);
    }

}
