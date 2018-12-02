// SBU ID: 111810145

package Homework2;
import java.util.Scanner;
public class Homework02_3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        String[] strArray = new String[10];
        
        // Prompt user to enter 10 strings (notice how the example is separated
        // with commas
        System.out.print("Enter 10 strings: ");
        String message = input.nextLine();
        
        // Extracts each string between the commas
        strArray = message.split("\\s*,\\s*");
        
        // Calls method to sort array
        sort(strArray);
        
        // Displays sorted array
        System.out.print("Sorted strings: ");
        for(int i = 0; i < strArray.length; i++){
            System.out.print(strArray[i] + ", ");
        }
        System.out.println();
    }
    
    // Method that bubble-sorts string array
    public static String[] sort(String[] array){
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length - i - 1; j++){
                // The array should be sorted from smallest to largest
                // if the current is greater than the next, switch
                if(array[j].compareTo(array[j + 1]) > 0){
                    String temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
}
