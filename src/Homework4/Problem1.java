package Homework4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args){
        File f = new File("integerFile.txt");
        
        try{
            FileWriter fw = new FileWriter(f, true);
            PrintWriter pw = new PrintWriter(fw);
            
            // Create an array of int
            int[] a = new int[100];
            // Assign each index a random integer
            for(int i = 0; i < a.length; i++){
                a[i] = (int)(Math.random() * (100 - 0 + 1));
            }
            
            // Display each index, separated with a single space
            for(int i = 0; i < a.length; i++){
                pw.print(a[i] + " ");
            }
            pw.flush();
            
            Scanner input = new Scanner(f);
            
            ArrayList<Integer> b = new ArrayList<>();
            while(input.hasNext()){
                b.add(input.nextInt());
            }
            
            // Bubble Sort
            for(int i = 0; i < b.size(); i++){
                for(int j = 0; j < b.size() - i - 1; j++){
                    if(b.get(j) > b.get(j + 1)){
                        int temp = b.get(j);
                        b.set(j, b.get(j + 1));
                        b.set(j + 1, temp);
                    }
                }
            }
            
            // Display sorted values
            pw.println();
            for(int i = 0; i < b.size(); i++){
                pw.print(b.get(i) + " ");
            }
            pw.flush();
        }
        
        catch(IOException ex){
            System.out.println("IOException");
        }
    }
}
