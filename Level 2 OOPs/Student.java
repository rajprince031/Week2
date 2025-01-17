
//Create Student class to store the details of Student
public class Student{

    //Create Student attribute
    private String name;
    private String rollNumber;
    private double marks;
    private char grade;

    
    //Create a constructor to assign the value of Student
    public Student(String name, String rollNumber, double marks){
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    //Create a method to calculate the grade
    public void calculateGrade(){

        // Determine the grade based on the marks
        if (marks >= 80) {
            this.grade = 'A'; // Assign grade 'A' for marks >= 80
        } else if (marks >= 70) {
            this.grade = 'B'; // Assign grade 'B' for marks >= 70
        } else if (marks >= 60) {
            this.grade = 'C'; // Assign grade 'C' for marks >= 60
        } else if (marks >= 50) {
            this.grade = 'D'; // Assign grade 'D' for marks >= 50
        } else if (marks >= 40) {
            this.grade = 'E'; // Assign grade 'E' for marks >= 40
        } else {
            this.grade = 'R'; // Assign grade 'R' for marks < 40 (Fail)
        }
    }

    //Display the student details
    public void display(){
        System.out.println("\nStudent Details\n");
        System.out.println("Name : "+this.name);
        System.out.println("Roll Number : "+this.rollNumber);
        System.out.println("Marks : "+this.marks);
        System.out.println("Grade : "+this.grade);
    }
}