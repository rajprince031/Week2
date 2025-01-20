public class BankAccount {
    // Instance Variables
    private String accountHolderName;
    final String ACCOUNT_NUMBER;
    private static int totalAccounts = 0;

    // Class Variable (shared among all products)
    private static String bankName = "State Bank Of India";

    //Create a method to update the bank name
    public static void updateBankName(String bankName){
        BankAccount.bankName = bankName;
    }

    // Constructor to initialize course details
    BankAccount(String accountHolderName, String ACCOUNT_NUMBER){
        this.accountHolderName = accountHolderName;
        this.ACCOUNT_NUMBER = ACCOUNT_NUMBER;
        totalAccounts++;
    }

    //Create a static method to print the total accounts
    public static void getTotalAccount(){
        System.out.println("Total Accounts : "+ totalAccounts);
    }

    // Instance method to display Bank details
    public void displayBankDetails(){
        System.out.println("\nBank Account Details\n");
        System.out.println("Account Number : "+ACCOUNT_NUMBER);
        System.out.println("Account Holder name : "+this.accountHolderName);
        System.out.println("Bank Name : "+bankName);
    }

}
