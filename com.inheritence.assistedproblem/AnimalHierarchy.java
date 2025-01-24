class Animal{

    //instance variable
    private String name;
    private int age;

    //Default constructor
    Animal(){

    }

    //Constructor to initialize Animal details 
    Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    // Instance method
    public void makeSound(){
        System.out.println("Animal makes a sound");
    }
}



class Dog extends Animal{
    Dog(String name, int age){
        // Calling the parent class constructor
        super(name,age);
    }

    @Override
    public void makeSound(){
        System.out.println("Dog Barks");
    }
}

class Cat extends Animal{
    Cat(String name, int age){
        // Calling the parent class constructor
        super(name,age);
    }

    @Override
    public void makeSound(){
        System.out.println("Cat meow");
    }
}

class Bird extends Animal{
        // Calling the parent class constructor
        Bird(String name, int age){
        super(name,age);
    }

    @Override
    public void makeSound(){
        System.out.println("Bird chu chu");
    }
}


public class AnimalHierarchy{
    public static void main(String[] agrs){

        //Creating Animal class object
        Animal animal = new Animal();
        animal.makeSound();

        //Creating Dog class object
        Dog dog = new Dog("Dog",11);
        dog.makeSound(); 

        //Creating Cat class object
        Cat cat = new Cat("Cat",5);
        cat.makeSound();

        //Creating Bird class object
        Bird bird = new Bird("Bird",1);
        bird.makeSound();
    }
}