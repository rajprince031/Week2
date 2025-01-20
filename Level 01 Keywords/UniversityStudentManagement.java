public class  UniversityStudentManagement{
    public static void main(String[] agrs){

        // Creating Student objects
        Student student = new Student("Prince Raj","Software Engineer", 'A');



        //Checking the instance
        if(student instanceof Student)
        {  
            System.out.println("student is an instance of Student");

            System.out.println("Before updating University Name");
            // Displaying Student details
            student.displayStudentDetails();
            // Updating the Company name for all Student
            Student.updateUniversityName("VKSU university");

            // Displaying Student details after updating the University name
            System.out.println("\nAfter updating University Name");
            student.displayStudentDetails();
        }else{
            System.out.println("Student is not an instance of Student");
        }

        //Print the total Number of Students
        Student.getTotalStudents();
    }
}