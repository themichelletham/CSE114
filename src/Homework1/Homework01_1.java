// SBU ID: 111810145

package Homework1;
import java.util.Scanner;
public class Homework01_1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        // Prompts user to enter sides of the triangle
        System.out.println("This program will solve for the perimeter of a triangle");
        System.out.print("Enter the length of edge 1: ");
        double edge1 = input.nextDouble();
        
        System.out.print("Enter the length of edge 2: ");
        double edge2 = input.nextDouble();
        
        System.out.print("Enter the length of edge 3: ");
        double edge3 = input.nextDouble();
        
        
        // Initialize perimeter
        double perimeter;
        
        // Only displays perimeter if sides are valid
        if ((edge1 + edge2 > edge3) && (edge2 + edge3 > edge1) && (edge3 + edge1 > edge2)){
            perimeter = edge1 + edge2 + edge3;
            System.out.println("The perimeter of the triangle is " + perimeter);
        }
        else{
            System.out.println("Invalid triangle");
        }     
    }
}
