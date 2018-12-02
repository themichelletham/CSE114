// SBU ID: 111810145

/*  EXTRA CREDIT ASSIGNMENT
    Create a file with 100 random Strings (or names)
    Each String should not be with the same length
    SORT the Strings and put it back in a new file
*/

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class ExtraCredit_StringFile {
    public static void main(String[] args){
        File f = new File("StringFile.txt");
        
        try{
            FileWriter fw = new FileWriter(f, true);
            PrintWriter pw = new PrintWriter(fw);
            
            // Create an array of 100 Strings
            String[] a = new String[100];
            
            for(int i = 0; i < a.length; i++){
                a[i] = "";
            }
            
            // Declare values for each index of the array
            for(int i = 0; i < a.length; i++){
                // The length of the String will vary
                int length = (int)(Math.random() * (8 - 1 + 1) + 1);
                for(int j = 0; j < length; j++){
                    // To obtain the length of the String, characters will be
                    // added until it fulfills the specified length
                    int caps = (int)(Math.random() * (1 - 0 + 1));
                    if(caps == 0){
                        a[i] += (char)(Math.random() * (90 - 65 + 1) + 65);
                    }
                    else if (caps == 1){
                        a[i] += (char)(Math.random() * (122 - 97 + 1) + 97);
                    }
                }
            }
            
            // Display the Strings
            for(int i = 0; i < a.length; i++){
                pw.print(a[i] + " ");
            }
            pw.flush();
            
            Scanner input = new Scanner(f);
            
            // Create an ArrayList (as practice if the size of the array changes)
            ArrayList<String> b = new ArrayList<>();
            String total = input.nextLine();
            int space = total.indexOf(" ");
            int indexN = space;
            int start = 0;
            int length = total.length();
            int last = total.lastIndexOf(" ");
            while(start != last){ // when there is not another space, space will equal to -1
                String word = total.substring(start, space);
                b.add(word); // each element is added to the corresponding index
                start = space + 1;
                total = total.substring(start, length - 1); // the total string is altered to what is left
                space = total.indexOf(" "); // the next space
                indexN += word.length();
            }
            
            /*String[] b = new String[100];
            String total = input.nextLine();
            int space = total.indexOf(" ");
            int start = 0;
            for(int i = 0; i < b.length; i++){
                String word = total.substring(start+1, space);
                b[i] = word;
                start += word.length();
                total = total.substring(space + 1);
                space = total.indexOf(" ");
            }*/
            
            /*
            // Bubble Sort
            for(int i = 0; i < b.size(); i++){
                for(int j = 0; j < b.size() - i - 1; j++){
                    if(b.get(j).compareToIgnoreCase(b.get(j + 1)) > 1){
                        String temp = b.get(j);
                        b.set(j, b.get(j + 1));
                        b.set(j + 1, temp);
                    }
                } 
            } */
            
            // Display sorted Strings
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
