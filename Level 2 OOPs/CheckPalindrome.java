
//Create  CheckPalindrome to check the text is Palindrome
public class CheckPalindrome{
    public static void main(String[] agrs){

        //Create object of PalindromeChecker class and pass the detials of PalindromeChecker using constructor.
        PalindromeChecker PalindromeChecker1 = new PalindromeChecker("Prince Raj");

        PalindromeChecker PalindromeChecker2 = new PalindromeChecker("Kancha Kumari");

        PalindromeChecker PalindromeChecker3 = new PalindromeChecker("virani Kumari");


        //Calculate the grade of the PalindromeChecker
        PalindromeChecker1.checkIsPalindrome();
        PalindromeChecker2.checkIsPalindrome();
        PalindromeChecker3.checkIsPalindrome();

        //Display the details of all the PalindromeCheckers
        PalindromeChecker1.display();
        PalindromeChecker2.display();
        PalindromeChecker3.display();

    }
}