public class Notes09_05 {
    public static void main(String[] args){
       
        // Print Statement
        System.out.println("hello");
        
        
        //Variable
        /*A variable gets a value in an assignment statement:
         variable = some_value or an expression;
         it must be initialized before being referenced
         the type and the value must MATCH
        */
        double salary;  // declaration -- giving the NAME and TYPE to the variable
        salary = 20000.0;  //initialize -- giving the VALUE to the variable
        System.out.println("Salary is " + salary);
        
        // It can be declared and initialized at once:
        char yesChar = 'y';  // character literal
        String num = "123"; // String because it's in double quotations
        String a = "A"; //String because it's in double quotations
        
        // Cannot use the same variable name to different types:
        double t = 500.0;
        int t = 200;
        
        //Variables solves and evaluates expression first. it assigns 
        // resulting value to the variable
        int b = 5;
        b = b + b + b + b + 10; // b is now 30
        
        /* Variables can only be used inside the block {..} or scope
        that they themselves are declared*/
        public void methodWithGoodScope(){
            double x = 5.0;
            if(x > 0.0){
                System.out.println("x is " + x);
            } // x is in the scope
        }
        public void methodWithBadScope(){
            double y = 100.0;
            if(y>0.0){
                double x = 5.0;
            }
            System.out.println("x " + x); // x is not in the scope since it is
            // outside of the block (curly braces)
        }
        
        
        //Mixing numeric types (from small to big, not vice versa)
        //this wont work:
        double a =5;
        int c = a;
    }
}
