package Encapsulation;

public class Rectangle {
    private int length;
    private int breadth;
    
    // Constructor
    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    
    // Getter for length
    public int getLength() {
        return length;
    }
    
    // Setter for length
    public void setLength(int length) {
        this.length = length;
    }
    
    // Getter for breadth
    public int getBreadth() {
        return breadth;
    }
    
    // Setter for breadth
    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }
}
