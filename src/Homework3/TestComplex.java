// SBU ID: 111810145
package Homework3;
import java.util.Scanner;
public class TestComplex {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        // Prompt user to enter data members of num 1
        System.out.print("Enter the real part of the first complex number: ");
        double real1 = input.nextDouble();
        System.out.print("Enter the imaginary part of the first complex number: ");
        double imaginary1 = input.nextDouble();
        // Create num1
        Complex num1 = new Complex(real1, imaginary1);
        
        // Prompt user to enter data members of num2
        System.out.print("Enter the real part of the second complex number: ");
        double real2 = input.nextDouble();
        System.out.print("Enter the imaginary part of the second complex number: ");
        double imaginary2 = input.nextDouble();
        // Create num2
        Complex num2 = new Complex(real2, imaginary2); 
        
        // Display first complex number
        System.out.println("First complex number: " + num1.getComplex());
        // Display second complex number
        System.out.println("Second complex number: " + num2.getComplex());
        
        // Display the added numbers
        System.out.println("Addition of the complex numbers: " + 
                Complex.add(num1,num2).getComplex());
        // Display the subtracted numbers
        System.out.println("Subtraction of the complex numbers: " + 
                Complex.subtract(num1, num2).getComplex()); 
    }
}
