class Person{
    //instance variable
    private String name;
    private int id;

    //Constructor to initialize Class details
    Person(String name, int id){
        this.name = name;
        this.id = id;
    }

    //Instance method to display the  details of Person
    public void personDetails(){
        System.out.println("Name : "+this.name);
        System.out.println("Id : "+this.id);
    }
}

// Worker interface: Interface for performDuties method
interface Worker{
    void performDuties();  // Abstract method
} 

class Chef extends Person implements Worker{
    //Constructor to initialize Class details
    Chef(String name, int id){
        // Calling the parent class constructor
        super(name,id);
    }

    // Implementing performDuties() from Worker interface
    public void performDuties() {
        System.out.println(" (Chef) is cooking food!");
    }

    @Override
    public void personDetails(){
        System.out.println(" Chef Details");
        super.personDetails();
    }
}

class Waiter extends Person implements Worker{
    //Constructor to initialize Class details
    Waiter(String name, int id){
        // Calling the parent class constructor
        super(name,id);
    }

    // Implementing performDuties() from Worker interface
    public void performDuties() {
        
        System.out.println(" (Waiter) is serving water!");
    }

    @Override
    public void personDetails(){
        System.out.println(" Waiter Details");
        super.personDetails();
    }
}

public class RestaurantManagementSystem{
    public static void main(String[] agrs){
        //Creating object of Chef class
       Chef chef = new Chef("Prince Raj",22);
       chef.personDetails();
       chef.performDuties();

       //Creating object of Waiter class
       Waiter waiter = new Waiter("Viraj",21);
       waiter.personDetails();
       waiter.performDuties();

       
    }
}