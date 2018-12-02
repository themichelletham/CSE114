// SBU ID: 111810145
package Homework3;
public class Complex {
    // variables in the Complex Class
    public double real;
    public double imaginary;
    
    // default constructor: real = 1, imaginary = 1
    Complex(){
        real = 1;
        imaginary = 1;
    }
    
    // constructor with initialized variables
    Complex(double newReal, double newImaginary){
        real = newReal;
        imaginary = newImaginary;
    }
    
    // Add
    public static Complex add(Complex num1, Complex num2){
        Complex temp = new Complex(0,0);
        
        temp.real = num1.real + num2.real;
        temp.imaginary = num1.imaginary + num2.imaginary;
        
        return temp;
    }
    
    // Subtract
    public static Complex subtract(Complex num1, Complex num2){
        Complex temp = new Complex(0,0);
        
        temp.real = num1.real - num2.real;
        temp.imaginary = num1.imaginary - num2.imaginary;
        
        return temp;
    }
    
    public String getComplex(){
        return ("(" + real + ", " + imaginary + ")");
    }
}
