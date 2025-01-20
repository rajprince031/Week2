public class  VehicleRegistrationSystem{
    public static void main(String[] agrs){

        // Creating Vehicle objects
        Vehicle vehicle = new Vehicle("Prince Raj","Two Weeler", "MP04QA1219");



        //Checking the instance
        if(vehicle instanceof Vehicle)
        {  
            System.out.println("vehicle is an instance of Vehicle");

            System.out.println("Before updating University Name");
            // Displaying Vehicle details
            vehicle.displayVehicleDetails();
            // Updating the Registration Fee for all Vehicle
            Vehicle.updateRegistrationFee(2000);

            // Displaying Vehicle details after updating the Registration Fee
            System.out.println("\nAfter updating University Name");
            vehicle.displayVehicleDetails();
        }else{
            System.out.println("Vehicle is not an instance of Vehicle");
        }


    }
}