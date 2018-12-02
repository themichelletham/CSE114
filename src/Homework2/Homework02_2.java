// SBU ID: 111810145
package Homework2;
import java.util.Scanner;
public class Homework02_2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        // Prompt user to enter two strings
        System.out.print("Enter the first string: ");
        String str1 = input.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = input.nextLine();
        
        // Calls method to check whether the strings are anagrams of each other
        // then displays the result to the user
        if(isAnagram(str1, str2)){
            System.out.println(str1 + " and " + str2 + " are anagrams");
        }
        else
            System.out.println(str1 + " and " + str2 + " are NOT anagrams");
    }
    
    // Method that checks whether the strings are anagrams of each other
    public static boolean isAnagram(String str1, String str2){
        str1 = str1.toLowerCase().replaceAll("\\s", ""); // Removes the spaces in each string
        str2 = str2.toLowerCase().replaceAll("\\s", "");
        
        // If strings are at different lengths, they are not anagrams
        if(str1.length() != str2.length()){
            return false;
        }
        
        // Initialize arrays to count how many times each characters appear in the string
        final int NUM_CHAR = 256;
        int[] count1 = new int [NUM_CHAR]; 
        int[] count2 = new int[NUM_CHAR];
        
        // Loop that goes through the two strings
        for(int i = 0; i < str1.length() && i < str2.length(); i++){
            // The corresponding ASCII to the character at index i is incremented in the array
            count1[str1.charAt(i)]++; 
            count2[str2.charAt(i)]++;
        }
        
        // Loop that checks each index whether they match
        for(int i = 0; i < NUM_CHAR; i++){
            if(count1[i] != count2[i]){
                return false;
            }
        }
        
        return true;
    }
}
