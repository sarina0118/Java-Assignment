//You are building a shape hierarchy for a drawing application. Design an abstract class named "Shape" with the following abstract methods:
//calculateArea(): This method should calculate and return the area of the shape.
//calculatePerimeter(): This method should calculate and return the perimeter of the shape.
// Abstract base class
abstract class Shape {
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}
