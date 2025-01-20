public class Patient {
    // Instance Variables
    private String name;
    private int age;
    private boolean ailment;
    private final String PATIENT_ID;
    private static int totalPatients = 0; 

    // Class Variable (shared among all Patients)
    private static String hospitalName = "AIIMS";

    //Create a method to update the Patient name
    public static void updateHospitalName(String hospitalName){
        Patient.hospitalName = hospitalName;
    }

    // Constructor to initialize Patient details
    Patient(String name, int age, String PATIENT_ID, boolean ailment){
        this.name = name;
        this.age = age;
        this.PATIENT_ID = PATIENT_ID;
        this.ailment = ailment;
        totalPatients++;
    }

    //Create a static method to print the total number of patients
    public static void getTotalPatients(){
        System.out.println("Total Patient : "+ totalPatients);
    }

    // Instance method to display Patient details
    public void displayPatientDetails(){
        System.out.println("\nPatient Details\n");
        System.out.println("Name : "+this.name);
        System.out.println("Patient ID : "+PATIENT_ID);
        System.out.println("Age : "+this.age);
        System.out.println("ailment : "+(this.ailment ? "Out of Danger" : "In Danger"));
        System.out.println("Hospital Name : "+Patient.hospitalName);
    }

}
