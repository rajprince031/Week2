
//Create PalindromeChecker class to check the text is Palindrome or not
public class PalindromeChecker{

    //Create PalindromeChecker attribute
    private String text;
    private Boolean isPalindrome;
    
    //Create a constructor to assign the value of PalindromeChecker
    public PalindromeChecker(String text){
        this.text = text;
    }

     // Check if the text is a palindrome using an iterative approach
    public void checkIsPalindrome() {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {

                // If characters don't match, it's not a palindrome
                isPalindrome = false;
                return;  
            }
            start++;  // Move towards the middle
            end--;    // Move towards the middle
        }

        isPalindrome = true;// All characters match, it's a palindrome
        return;
    }

    //Display the PalindromeChecker details
    public void display(){
        if(isPalindrome){
            System.out.printf("text %s is Palindrome.\n",this.text);
        }else{
            System.out.printf("text %s is not Palindrome.\n",this.text);
        }   
    }
}