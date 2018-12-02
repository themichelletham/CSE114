// SBU ID: 111810145

/*  Matrix Multiplication
    Every element in a row of matrix A is mulitplied
    by every element in a column of matrix B (summed)
    the resulting matrix C should have the same number of columns of A
    and the same number of rows of B
*/
package Homework2;
import java.util.Scanner;
public class Homework02_4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        // Initialize matrix A and matrix B
        double[][] a = new double[3][3];
        double[][] b = new double[3][3];
        
        // Prompt user to enter maxtrix1
        System.out.print("Enter matrix1: ");
        // for loop to enter values in each index
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                a[i][j] = input.nextDouble();
            }
        }
        
        // Prompt user to enter matrix2
        System.out.print("Enter matrix2: ");
        // for loop to enter values in each index
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                b[i][j] = input.nextDouble();
            }
        }
        
        // Call method to multiply matrix A and B
        double[][] c = multiplyMatrix(a,b);
        
        // Displays matrix C
        System.out.println("Multiplication of the matrices is:");
        for(int i = 0; i < c.length; i++){
            for(int j = 0; j < c[i].length; j++){
                System.out.printf("%.1f\t", c[i][j]);
            }
            System.out.println();
        }
        
    }
    
    // Method that returns matrix C (matrix A * matrix B)
    public static double[][] multiplyMatrix(double[][] a, double[][] b){
        double[][] c = new double[3][3];
        
        // Loop to multiply matrix A and matrix B
        for(int i = 0; i < c.length; i++){
            for(int j = 0; j < c[i].length; j++){
                double sum = 0;
                for(int k = 0; k < 3; k++){
                    // Matrix multiplication
                    sum += a[i][k] * b[k][j];
                }
                c[i][j] = sum;
            }
        }
        
        return c;
    }
}
