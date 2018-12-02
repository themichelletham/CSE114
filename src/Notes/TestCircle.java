package Notes;

public class TestCircle {
    public static void main(String[] args){
        // instantiate an object of MyCircle type
        MyCircle c1 = new MyCircle();
        System.out.println(c1.getRadius());
        System.out.println(c1.getArea());
    }
}

class MyCircle{
    private double radius; // declare the data member radius
    
    // complete the default constructor
    public MyCircle(){
        radius = 1;
    }
    
    // complete the default constructor with the given radius r
    public MyCircle(double r){
        radius = r;
    }
    
    // complete the method getRadius() to return the radius
    public double getRadius(){
        return radius;
    }
    
    // complete the method getArea() to return the are of the circle
    public double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }
}
