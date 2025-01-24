class Employee {
    //instance variable
    private String name;
    private int id;
    private double salary;


    //Constructor to initialize Employee details 
    Employee(String name, int id, double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Instance method
    public void displayDetails(){
        System.out.println("Name : "+this.name);
        System.out.println("ID : "+this.id);
        System.out.println("salary : "+this.salary);
    }

}

class Manager extends Employee{
    //instance variable
    private int teamSize;

    //Constructor to initialize Manager details 
    public Manager(String name, int id, double salary, int teamSize){
        // Calling the parent class constructor
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    @Override
    public void displayDetails(){
        System.out.println("Display the details of Manager");
        super.displayDetails();
        System.out.println("Team size :"+ this.teamSize);

    }
}

class Developer extends Employee{

    //instance variable
    private String programmingLanguage;

    //Constructor to initialize Class details 
    Developer(String name, int id, double salary, String programmingLanguage){
        // Calling the parent class constructor
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void displayDetails(){
        System.out.println("Display the details of Developer");
        super.displayDetails();
        System.out.println("Team size :"+ this.programmingLanguage);

    }
}

class Intern extends Employee{
    //Constructor to initialize Class details 
    Intern(String name, int id, double salary){
        // Calling the parent class constructor
        super(name, id, salary);
    }

    @Override
    public void displayDetails(){
        System.out.println("Display the details of Intern");
        super.displayDetails();
    }
}


public class EmployeeManagementSystem{
    public static void main(String[] agrs){

        //Creating object of Manager class
        Manager manager = new Manager("Viraj", 123, 100000,12);
        manager.displayDetails();

        //Creating object of Developer class
        Developer developer = new Developer("Prince", 123, 100000,"java");
        developer.displayDetails();

        //Creating object of Intern class
        Intern intern = new Intern("Kanchaa", 120, 100000);
        intern.displayDetails();

    }
}


