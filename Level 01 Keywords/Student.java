public class Student {
    // Instance Variables
    private String name;
    private final String ROLL_NUMBER;
    private char grade;
    private static int totalStudent = 0;

    // Class Variable (shared among all Students)
    private static String universityName = "RGPV university";

    //Create a method to update the Student name
    public static void updateUniversityName(String universityName){
        Student.universityName = universityName;
    }

    // Constructor to initialize Student details
    Student(String name, String ROLL_NUMBER, char grade){
        this.name = name;
        this.ROLL_NUMBER = ROLL_NUMBER;
        this.grade = grade;
        totalStudent++;
    }
    //Create a static method to print the total number of student
    public static void getTotalStudents(){
        System.out.println("Total Students : "+ totalStudent);
    }

    // Instance method to display Student details
    public void displayStudentDetails(){
        System.out.println("\nStudent Details\n");
        System.out.println("Student Name : "+this.name);
        System.out.println("Roll Number : "+this.ROLL_NUMBER);
        System.out.println("University Name : "+Student.universityName);
        System.out.println("Grade : "+this.grade);
    }

}
