class BankAccount{
    //instance variable
    private String accountNumber;
    private double balance;

    //Constructor to initialize Class details
    BankAccount(String accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    //Instance method to display the  details of BankAccount
    public void bankAccountDetails(){
        System.out.println("Bank Account Details");
        System.out.println("Account Number : "+this.accountNumber);
        System.out.println("Balance : "+this.balance);
    }
}
class SavingAccount extends BankAccount{
    //instance variable
    private double interestRate;

    //Constructor to initialize Class details
    SavingAccount(String accountNumber, double balance, double interestRate){
        // Calling the parent class constructor
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void bankAccountDetails(){
        super.bankAccountDetails();
        System.out.println("Interest Rate : "+this.interestRate);
    }   
}
class checkingAccount extends BankAccount{
    //instance variable
    private double withdrawalLimit;

    //Constructor to initialize Class details
    checkingAccount(String accountNumber, double balance, double withdrawalLimit){
        // Calling the parent class constructor
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    public void bankAccountDetails(){
        super.bankAccountDetails();
        System.out.println("Withdrawal limit : "+this.withdrawalLimit);
    }
}
class FixedDepositeAccount extends BankAccount{
    //instance variable
    private double compoundRate;

    //Constructor to initialize Class details
    FixedDepositeAccount(String accountNumber, double balance, double compoundRate){
        // Calling the parent class constructor
        super(accountNumber, balance);
        this.compoundRate = compoundRate;
    }

    @Override
    public void bankAccountDetails(){
        super.bankAccountDetails();
        System.out.println("Compound rate : "+this.compoundRate);
    }
}

public class BankAccountTypes{
    public static void main(String[] agrs){
        //Creating object of SavingAccount class
        SavingAccount savingAccount = new SavingAccount("2398235409",150000,7);
        savingAccount.bankAccountDetails();

       //Creating object of CheckingAccount class
       checkingAccount checkingAccount = new checkingAccount("235626335253",902348,100000);
       checkingAccount.bankAccountDetails();

       //Creating object of FixedDepositeAccount class
       FixedDepositeAccount fixedDepositeAccount = new FixedDepositeAccount("23523625623",98523,10);
       fixedDepositeAccount.bankAccountDetails();
    }
}