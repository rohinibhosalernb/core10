package Overloading;

public class Area {

    // Method to calculate area of circle
    public double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    // Method to calculate area of triangle
    public double calculateArea(double base, double height) {
        return 0.5 * base * height;
    }

    // Method to calculate area of rectangle
    public double calculateArea(int length, int width) {
        return length * width;
    }

    public static void main(String[] args) {
        Area calculator = new Area();

        // Calculate area of circle
        double circleArea = calculator.calculateArea(5.0);
        System.out.println("Area of circle: " + circleArea);

        // Calculate area of triangle
        double triangleArea = calculator.calculateArea(4.0, 3.0);
        System.out.println("Area of triangle: " + triangleArea);

        // Calculate area of rectangle
        double rectangleArea = calculator.calculateArea(6.0, 8.0);
        System.out.println("Area of rectangle: " + rectangleArea);
    }
}
