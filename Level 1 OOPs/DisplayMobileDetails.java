
//Create  DisplayMobileDetails to display the details of mobile
public class DisplayMobileDetails{
    public static void main(String[] agrs){

        //Create object of mobile class and pass the detials of mobile using constructor.
        Mobile mobile1 = new Mobile("Apple","12 Pro Max",110000);

        Mobile mobile2 = new Mobile("Samsung","s23",75000);

        Mobile mobile3 = new Mobile("Motorola","98sw",9000);


        //Display the details of all the mobiles
        mobile1.display();
        mobile2.display();
        mobile3.display();

    }
}