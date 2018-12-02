// SBU ID: 111810145
package Homework3;
public class Rational {
    private int numerator;
    private int denominator;
    
    // Default constructor
    Rational(){
        numerator = 0;
        denominator = 1;
    }
    
    // Specified constructor -- also simplifies
    Rational(int num, int denom){
        // If fraction is negative, the numerator is negative
        numerator = (denom < 0 ? -num : num);
        denominator = (denom < 0 ? -denom : denom);
        reduce();
    }
    
    public int getNumerator(){
        return numerator;
    }
    
    public int getDenominator(){
        return denominator;
    }
            
            
    // Find greatest common denominator and factoring that out
    public void reduce(){
        int num = numerator;
        int denom = denominator;
        int greatest;
        
        // Find the greater of numerator and denominator
        if(numerator < 0){
            num = -numerator;
        }
        if(num > denom){
            greatest = num;
        }
        else
            greatest = denom;
        
        // Find the GCD
        int gcd = 0;
        // starting from the largest
        for(int i = greatest; i > 1; i--){
            if((numerator % i == 0) && (denominator % i == 0)){
                gcd = i;
                break;
            }
        }
        // factor out the gcd in both the numerator and denominator
        if(gcd != 0){
            numerator /= gcd;
            denominator /= gcd;
        }
    }
    
    // Method that adds two rational numbers
    public static Rational add(Rational num1, Rational num2){
        Rational sum = new Rational();
        // add common denominator
        sum.denominator = num1.getDenominator() * num2.getDenominator();
        sum.numerator = (num1.getNumerator() * num2.getDenominator()) + 
                (num1.getDenominator() * num2.getNumerator());
        
        sum.reduce();
        
        return sum;
    }
    
    // Method that subtracts two rational numbers
    public static Rational subtract(Rational num1, Rational num2){
        Rational difference = new Rational();
        
        // subtract common denominator
        difference.denominator = num1.getDenominator() * num2.getDenominator();
        difference.numerator = (num1.getNumerator() * num2.getDenominator()) -
                (num2.getNumerator() * num1.getDenominator());
        
        difference.reduce();
        return difference;
    }
    
    // Method that multiplies two rational numbers
    public static Rational multiply(Rational num1, Rational num2){
        Rational product = new Rational();
        
        // multiply throughout
        product.denominator = num1.getDenominator() * num2.getDenominator();
        product.numerator = num1.getNumerator() * num2.getNumerator();
        
        product.reduce();
        return product;
    }
    
    // Method that divides two rational numbers
    public static Rational divide(Rational num1, Rational num2){
        Rational quotient = new Rational();
        // keep change flip
        
        quotient.numerator = num1.getNumerator() * num2.getDenominator();
        quotient.denominator = num1.getDenominator() * num2.getNumerator();
        
        quotient.reduce();
        return quotient;
    }
    
    @Override
    public String toString(){
        return numerator + "/" + denominator;
    }
}
