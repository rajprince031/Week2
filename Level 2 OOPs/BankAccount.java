
//Create BankAccount class to store the details of BankAccount
public class BankAccount{

    //Create BankAccount attribute
    private String accountHolder;
    private String accountNumber;
    private double balance;


    //Create a constructor to assign the value of Bank Account
    public BankAccount(String accountHolder, String accountNumber, double balance){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    //Create a method to calculate the bank balance
    public void withdrawBalance(double amount){
        if(amount > this.balance){
            System.out.println("Insufficient Balance");
            return;
        }

        this.balance = this.balance - amount;
    }

    //Display the BankAccount details
    public void display(){
        System.out.println("\nBankAccount Details\n");
        System.out.println("Name : "+this.accountHolder);
        System.out.println("Account Number : "+this.accountNumber);
        System.out.println("Balance : "+this.balance);
    }
}