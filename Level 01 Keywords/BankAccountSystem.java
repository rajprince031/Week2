public class BankAccountSystem{
    public static void main(String[] agrs){

        // Creating BankAccount objects
        BankAccount bankAccount = new BankAccount("Prince Raj", "0111CS211120");



        //Checking the instance
        if(bankAccount instanceof BankAccount)
        {  
            System.out.println("bankAccount is an instance of BankAccount");

            System.out.println("Before updating Institute Name");
            // Displaying Bank details
            bankAccount.displayBankDetails();
            // Updating the Bank name for all Accounts
            BankAccount.updateBankName("Panjab National Bank");

            // Displaying bank details after updating the Bank name
            System.out.println("\nAfter updating Institute Name\n");
            bankAccount.displayBankDetails();
        }else{
            System.out.println("bankAccount is not an instance of BankAccount");
        }

        //Print the total Number of Account
        BankAccount.getTotalAccount();
    }
}