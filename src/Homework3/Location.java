// SBU ID: 111810145
package Homework3;

public class Location {
    public int row;
    public int column;
    public double maxValue;
    
    // default constructor
    Location(){
        row = 0;
        column = 0;
        maxValue = 0;
    }
    
    // specific constructor
    Location(int newRow, int newCol, double newMax){
        row = newRow;
        column = newCol;
        maxValue = newMax;
    }
    
    // getter methods
    public int getRow(){
        return row;
    }
    
    public int getCol(){
        return column;
    }
    
    public double getMaxValue(){
        return maxValue;
    }
    
    // setter methods
    public void setRow(int newRow){
        row = newRow;
    }
    
    public void setColumn(int newColumn){
        column = newColumn;
    }
    
    public void setMaxValue(double newMax){
        maxValue = newMax;
    }
    
    // method creates the object and locates where the max value
    // and returns the object
    public static Location locateLargest(double[][] a){
        Location loc = new Location();
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                if(loc.getMaxValue() < a[i][j]){
                    loc.setMaxValue(a[i][j]);
                    loc.setRow(i);
                    loc.setColumn(j);
                }
            }
        }
        return loc;
    }
    
    public String toString(){
        return "(" + row + ", " + column + ")"; 
    }
    
}
