
import java.util.Scanner;

//Create the PersonDetails to print the details of Person
public class DisplayPersonDetails{
    public static void main(String[] agrs){

        //Create a Person object to store the person details using constructor.
        Person person1 = new Person("Prince Raj",22);
        Person person2 = new Person("virani",22);
        Person person3 = new Person("Dhani",21);
        Person person4 = new Person("Kanchaaaa",250);

        Person person5 = new Person(person4); // it copy the person4 value in person5

        //Display all person Details
        person1.display();
        person2.display();
        person3.display();
        person4.display();
        person5.display();

    }
}