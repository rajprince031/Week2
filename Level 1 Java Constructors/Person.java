public class Person {
    private String name;
    private int age;

    //Create a copy constructor
    public Person(Person person){
        this.name = person.name;
        this.age = person.age;
    }
    
    //Getter and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //Create a constructor to assign the value of the radius
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    //Display the Person details
    public void display(){
        System.out.println("\nPerson Details\n");
        System.out.println("Name : "+this.name);
        System.out.println("Age : "+this.age);
    }
}
