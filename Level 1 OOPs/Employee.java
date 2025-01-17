//Create Employee class to store the details of Employee
public class Employee{

    //Create Employee attribute
    private String name;
    private String id;
    private double salary;


    //Create a constructor to assign the value of Employee
    public Employee(String name, String id, double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

//Display the item details
    public void display(){
        System.out.println("\nEmployee Details\n");
        System.out.println("Name : "+this.name);
        System.out.println("Id : "+this.id);
        System.out.println("Salary : "+this.salary);
    }
}