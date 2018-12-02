// SBU ID: 111810145
package Homework1;
import java.util.Scanner;
public class Homework01_3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String message = input.nextLine();
        
        //counts for vowels
        int vowelCount = 0;
        //counts for consonants
        int consCount = 0;
        
        // using the charAt method, it will check each char individually
        
        for(int i = 0; i < message.length(); i++){
            if((message.charAt(i) >= 65 && message.charAt(i) <= 90) || (message.charAt(i) >= 97 && message.charAt(i) <= 122)){
                switch(message.charAt(i)){
                    case 'a': case 'A': //
                    case 'e': case 'E': //
                    case 'i': case 'I': // checks if its a vowel
                    case 'o': case 'O': // in most cases y is not a vowel,
                    case 'u': case 'U': // for that convenience, it is ommitted
                        vowelCount++; break;
                    default: consCount++; break;
                }
            }
        }
        
        System.out.println("The number of vowels is " + vowelCount);
        System.out.println("The number of consonants is " + consCount);
    }
}
