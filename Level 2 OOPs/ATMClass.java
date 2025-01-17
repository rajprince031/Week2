
//Create  ATMClass to display the details of    BankAccount 
public class ATMClass {
    public static void main(String[] agrs){

        //Create object of  BankAccount class and pass the detials of    BankAccount     using constructor.
        BankAccount BankAccount1 = new BankAccount("Prince Raj","011CS211120",95000);

        BankAccount BankAccount2 = new BankAccount("Kancha Kumari","0199AL211020",49);

        BankAccount BankAccount3 = new BankAccount("virani Kumari","0199AL211064",94000);


        //Calculate the grade of the    BankAccount 
        BankAccount1.withdrawBalance(1000);
        BankAccount2.withdrawBalance(1000);
        BankAccount3.withdrawBalance(10000);

        //Display the details of all the    BankAccount s
        BankAccount1.display();
        BankAccount2.display();
        BankAccount3.display();

    }
}