class Person{
    //instance variable
    private String name;
    private int age;

    //Constructor to initialize Class details
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    //Instance method to display the  details of Person
    public void personDetails(){
        System.out.println("Name : "+this.name);
        System.out.println("Age : "+this.age);
    }
}

class Teacher extends Person{
    //instance variable
    private String subject;

    //Constructor to initialize Class details
    Teacher(String name, int age, String subject){
        // Calling the parent class constructor
        super(name, age);
        this.subject = subject;
    }

    @Override
    public void personDetails(){
        System.out.println("Teachers Details");
        super.personDetails();
        System.out.println("Subject : "+ this.subject);
    }
}

class Student extends Person{
    //instance variable
    private char grade;

    //Constructor to initialize Class details
    Student(String name, int age, char grade){
        // Calling the parent class constructor
        super(name, age);
        this.grade = grade;
    }

    @Override
    public void personDetails(){
        System.out.println("Students Details");
        super.personDetails();
        System.out.println("Grade : "+ this.grade);
    }
}

class Staff extends Person{
    //instance variable
    private String workingArea;

    //Constructor to initialize Class details
    Staff(String name, int age, String workingArea){
        // Calling the parent class constructor
        super(name, age);
        this.workingArea = workingArea;
    }

    @Override
    public void personDetails(){
        System.out.println("Staff Details");
        super.personDetails();
        System.out.println("Area Of Working : "+ this.workingArea);
    }
}

public class SchoolSystemWithDifferentRoles {
    public static void main(String[] agrs){
        //Creating object of Teacher class
       Teacher teacher = new Teacher("Bittu Kumar",27,"Maths");
       teacher.personDetails();

       //Creating object of Student class
       Student student = new Student("Prince Raj",22,'A');
       student.personDetails();

       //Creating object of Staff class
       Staff staff = new Staff("Akash Kumar",27,"cleaning");
       staff.personDetails();
    }
}
