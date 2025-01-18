public class VehicleRegistration {
    public static void main(String[] agrs){

        // Creating Vehicle objects
        Vehicle vehicle1 = new Vehicle("Pulsar", "As 160");
        Vehicle vehicle2 = new Vehicle("Hero Honda", "125cc");
        Vehicle vehicle3 = new Vehicle("BMW", "1000cc");

        // Displaying Vehicle details
        System.out.println("Before updating Vehicle Details:");
        vehicle1.displayVehicleDetails();
        vehicle2.displayVehicleDetails();
        vehicle3.displayVehicleDetails();

        // Updating the institute name for all Vehicles
        Vehicle.updateRegistrationFee(2000);

        // Displaying Vehicle details after updating the institute name
        System.out.println("\nAfter updating Vehicle Details:");
        vehicle1.displayVehicleDetails();
        vehicle1.displayVehicleDetails();
        vehicle2.displayVehicleDetails();
        vehicle3.displayVehicleDetails();
    }
}
