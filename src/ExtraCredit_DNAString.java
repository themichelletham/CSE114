// SBU ID: 111810145

/*  This program will print a combination of "ATGC" characters 100 times
    using the method Math.random()
*/
public class ExtraCredit_DNAString {
    public static void main(String[] args){
        String sample = "ATGC";
        String DNA = "";
        int index;
        
        // Loop 100 times for the 100 characters
        for(int i = 0; i < 100; i++){
            index = (int)(Math.random() * 4); // Index will be [0,3]
            DNA += sample.charAt(index); // Adds the specific character to the String DNA
        }
        
        // Display the DNA sample
        System.out.println(DNA);
    }
}
