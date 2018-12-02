package Homework3;
import java.util.Scanner;
public class TestRational {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        // Prompt for num1 data members
        System.out.print("Enter numerator for the first rational number: ");
        int numerator1 = input.nextInt();
        System.out.print("Enter a non-zero denominator for the first rational number: ");
        int denominator1 = input.nextInt();
        // Create num1
        Rational num1 = new Rational(numerator1, denominator1);
        
        // Prompt for num2 data members
        System.out.print("Enter numerator for the second rational number: ");
        int numerator2 = input.nextInt();
        System.out.print("Enter a non-zero denominator for the second rational number: ");
        int denominator2 = input.nextInt();
        Rational num2 = new Rational(numerator2, denominator2);
        
        // Display each num using toString
        System.out.println("First rational number is: " + num1.toString());
        System.out.println("Second rational number is: " + num2.toString());
        
        // Display mathematical methods
        System.out.println("Addition of the rational numbers: " + 
                Rational.add(num1,num2).toString());
        System.out.println("Subtraction of the rational numbers: " + 
                Rational.subtract(num1,num2).toString());
        System.out.println("Multiplication of the rational numbers: " + 
                Rational.multiply(num1,num2).toString());
        System.out.println("Division of the rational numbers: " + 
                Rational.divide(num1,num2).toString());
    }
}
