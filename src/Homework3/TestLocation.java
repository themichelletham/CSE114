// SBU ID: 111810145
package Homework3;
import java.util.Scanner;
public class TestLocation {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        // prompt user for rows and col of array
        System.out.print("Enter the number of rows and columns in the array: ");
        int row = input.nextInt();
        int col = input.nextInt();
        
        // create array
        double[][] arr = new double[row][col];
        
        System.out.println("Enter the array:");
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = input.nextDouble();
            }
        }
        
        /* display the largest element and its location
            has to call locateLargest in order to create the "object" in order
            print out maxValue */
        System.out.println("The location of the largest element " 
                + Location.locateLargest(arr).getMaxValue() + " is at " + 
                Location.locateLargest(arr).toString());
    }
}
