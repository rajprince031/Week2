
//Create  StudentDetails to display the details of Student
public class StudentDetails{
    public static void main(String[] agrs){

        //Create object of Student class and pass the detials of Student using constructor.
        Student Student1 = new Student("Prince Raj","011CS211120",95);

        Student Student2 = new Student("Kancha Kumari","0199AL211020",49);

        Student Student3 = new Student("virani Kumari","0199AL211064",94);


        //Calculate the grade of the student
        Student1.calculateGrade();
        Student2.calculateGrade();
        Student3.calculateGrade();

        //Display the details of all the Students
        Student1.display();
        Student2.display();
        Student3.display();

    }
}