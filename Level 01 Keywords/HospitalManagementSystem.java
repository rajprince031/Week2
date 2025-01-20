public class  HospitalManagementSystem{
    public static void main(String[] agrs){

        // Creating Patient objects
        Patient patient = new Patient("Kanchaa Thakur",19, "0111CS211120", false);



        //Checking the instance
        if(patient instanceof Patient)
        {  
            System.out.println("patient is an instance of Patient");

            System.out.println("Before updating Hospital Name:");
            // Displaying Patient details
            patient.displayPatientDetails();
            // Updating the Hospital name for all Patient
            Patient.updateHospitalName("PIIMS");

            // Displaying Patient details after updating the Hospital name
            System.out.println("\nAfter updating Hospital Name");
            patient.displayPatientDetails();
        }else{
            System.out.println("Patient is not an instance of Patient");
        }

        //Print the total Number of Patients
        Patient.getTotalPatients();
    }
}