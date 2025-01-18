public class Course {

    // Instance Variables
    private String courseName;
    private int duration;
    private double fee;


    // Class Variable (shared among all products)
    private static String instituteName = "Technocrats Institute Of Technology";

    public String getCourseName() {
        return courseName;
    }

    //Getter and Setters
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    
    public static void updateInstituteName(String instituteName) {
        Course.instituteName = instituteName;
    }

    // Constructor to initialize course details
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method to display course details
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Fee: Rs" + fee);
        System.out.println("Institute: " + instituteName);
    }


}
