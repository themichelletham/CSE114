// SBU ID: 111810145
package Homework4;

public class Problem2 {
    public static void main(String[] args){
        // Create an array of Shapes
        Shape[] shapes = {new Circle(1.0), new Square(1.0),
            new Triangle(1.0,1.0,1.0), new Sphere(1.0), new Cube(1.0),
            new Tetrahedron(1.0)};
        
        // Loop that will check whether shape is 2D or 3D and displays the
        // corresponding values
        for(int i = 0; i < shapes.length; i++){
            if(shapes[i] instanceof TwoDimensionalShape){
                System.out.printf("%s\n\tArea: %.2f\n\n", shapes[i].toString(),
                        ((TwoDimensionalShape) shapes[i]).getArea());            
            }
            else if(shapes[i] instanceof ThreeDimensionalShape){
                System.out.printf("%s\n\tSurface Area: %.2f, Volume: %.2f\n\n", 
                        shapes[i].toString(),
                        ((ThreeDimensionalShape) shapes[i]).getArea(),
                        ((ThreeDimensionalShape) shapes[i]).getVolume());
            }
        }
    }
}

class Shape{
    Shape(){
    }
    
    @Override
    public String toString(){
        return "Shape ";
    }
}

class TwoDimensionalShape extends Shape{
    private double area;
    
    TwoDimensionalShape(){
        super();
    }
    public double getArea(){
        return this.area;
    }
    @Override
    public String toString(){
        return "Two Dimensional " + super.toString();
    }
}


class Circle extends TwoDimensionalShape{
    private double radius;
    Circle(double radius){
        super();
        this.radius = radius;
    }
    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    @Override
    public double getArea(){
        return 2 * Math.PI * this.radius;
    }
    
    @Override
    public String toString(){
        return super.toString() + " Circle\tRadius: " + this.getRadius();
    }
}

class Square extends TwoDimensionalShape{
    private double side;
    Square(double side){
        super();
        this.side = side;
    }
    public double getSide(){
        return this.side;
    }
    public void setSide(double side){
        this.side = side;
    }
    @Override
    public double getArea(){
        return Math.pow(this.side, 2);
    }
    @Override
    public String toString(){
        return super.toString() + " Square\tSide: " + this.getSide();
    }
}

class Triangle extends TwoDimensionalShape{
    private double side1;
    private double side2;
    private double side3;
    private double p;
    
    Triangle(double side1, double side2, double side3){
        super();
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.p = (side1 + side2 + side3) / 2;
    }
    
    public double getSide1(){
        return this.side1;
    }
    public double getSide2(){
        return this.side2;
    }
    public double getSide3(){
        return this.side3;
    }
    public void setSide1(double side1){
        this.side1 = side1;
    }
    public void setSide2(double side2){
        this.side2 = side2;
    }
    public void setSide3(double side3){
        this.side3 = side3;
    }
    
    @Override
    public double getArea(){
        return Math.sqrt(this.p * (this.p - this.side1) * (this.p - this.side2)
            * (this.p - this.side3));
    }
    @Override
    public String toString(){
        return super.toString() + " Triangle\tSide1: " + this.getSide1() + 
                ", Side2: " + this.getSide2() + ", Side3: " + this.getSide3();
    }
}

class ThreeDimensionalShape extends Shape{
    private double area;
    private double volume;
    
    ThreeDimensionalShape(){
        super();
    }
    public double getArea(){
        return this.area;
    }
    public double getVolume(){
        return this.volume;
    }
    
    @Override
    public String toString(){
        return "Three Dimensional " + super.toString();
    }
}
class Sphere extends ThreeDimensionalShape{
    private double radius;
    
    Sphere(double radius){
        super();
        this.radius = radius;
    }
    
    public double getRadius(){
        return this.radius;
    }
    
    public void setRadius(double radius){
        this.radius = radius;
    }
    
    @Override
    public double getArea(){
        return 4 * Math.PI * Math.pow(this.radius, 2);
    }
    
    @Override
    public double getVolume(){
        return (4.0 / 3.0) * Math.PI * Math.pow(this.radius, 3);
    }
    
    @Override
    public String toString(){
        return super.toString() + " Sphere\tRadius: " + this.getRadius();
    }
}
class Cube extends ThreeDimensionalShape{
    private double side;
    
    Cube(double side){
        super();
        this.side = side;
    }
    
    public double getSide(){
        return this.side;
    }
    
    public void setSide(double side){
        this.side = side;
    }
    
    @Override
    public double getArea(){
        return 6 * Math.pow(this.side, 2);
    }
    @Override
    public double getVolume(){
        return Math.pow(this.side, 3);
    }
    @Override
    public String toString(){
        return super.toString() + " Cube\tSide: " + this.getSide();
    }
}


class Tetrahedron extends ThreeDimensionalShape{
    public double side;
    
    Tetrahedron(double side){
        super();
        this.side = side;
    }
    
    public double getSide(){
        return this.side;
    }
    
    public void setSide(double side){
        this.side = side;
    }
    
    @Override
    public double getArea(){
        return Math.pow(3, 0.5) * Math.pow(side, 2);
    }
    @Override
    public double getVolume(){
        return (1.0 / 12.0) * Math.pow(2, 0.5) * Math.pow(side, 3);
    }
    @Override
    public String toString(){
        return super.toString() + " Tetrahedron\tSide: " + this.getSide();
    }
}