// SBU ID: 111810145
package Homework1;
import java.util.Scanner;
public class Homework01_4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        // Prompt user to enter a string
        System.out.print("Enter a string: ");
        String message = input.nextLine(); // Inputs the whole message
        
        // Counter for uppercase letters
        int upperCount = 0;
        
        // Checks in each individual character
        for(int i = 0; i < message.length(); i++){
            if(message.charAt(i) >= 65 && message.charAt(i) <= 90){
                   upperCount++; 
            }
        }
        
        //Displays the number of uppercase letters in message
        System.out.println("The number of uppercase letters is " + upperCount);
    }
}
