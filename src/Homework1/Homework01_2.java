// SBU ID: 111810145
package Homework1;
import java.util.Scanner;
public class Homework01_2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a letter: ");
        char letter = input.next().charAt(0);
        
        // checks if the input is a letter
        if((letter >= 65 && letter <= 90) || (letter >= 97 && letter <= 122)){
            switch(letter){
                case 'a': case 'A': //
                case 'e': case 'E': //
                case 'i': case 'I': // checks if its a vowel
                case 'o': case 'O': //
                case 'u': case 'U': //
                case 'y': case 'Y': // y is sometimes a vowel
                    System.out.println(letter + " is a vowel"); break;
                default: System.out.println(letter + " is a consonant");
            }
        }
        else{ // case where it's invalid
            System.out.println(letter + " is an invalid input");
        }
    }
}
