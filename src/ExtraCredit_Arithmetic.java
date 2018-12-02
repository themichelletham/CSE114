public class ExtraCredit_Arithmetic {
    public static void main(String[] args){
        double x = 6.99;
        int y = (int)x;
        
        System.out.println("Initial Values:");
        System.out.println("x = " + x + "\ny = " + y);
        
        double z = x - x % 1;
        if (z >= 0.5){
            x += 0.5;
        }
        
        y = (int)x;
        System.out.println("\nFinal Values:");
        System.out.println("y = " + y);
    }
}
