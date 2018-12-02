// SBU ID: 111810145

/*  Checks if string is a palindrome
    - Requires method
    - Case insensitive --> use IgnoreCase() or change all to lower/upper case
    - Ignore space --> temp that takes out " "

*/
package Homework2;
import java.util.Scanner;
public class Homework02_1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        // Prompt user to enter a string, can include spaces
        System.out.print("Enter the input string: ");
        String str = input.nextLine();
        
        
        if(isPalindrome(str)){ // calls method isPalindrome and displays message
            System.out.println("Input string " + str + " is a palindrome");
        }
        else
            System.out.println("Input string " + str + " is NOT a palindrome");
    }
    
    public static boolean isPalindrome(String str){
        boolean pal = true; // returns pal (default true)
        
        // Takes out the spaces of the string
        String removeSpace = str.replaceAll("\\s", "");
        // Changes to lower case
        String newString = removeSpace.toLowerCase();
        
        for(int i = 0; i < newString.length() / 2; i++){
            if(newString.charAt(i) == newString.charAt(newString.length() - 1 - i)){
                pal = true;
            }
            else{
                pal = false;
                break; // if the characters do not match, for loop is broken
            }    
        }
        return pal; //returns if string is palindrome back to main
    }
}
