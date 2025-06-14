//Create an abstract class called Shape with an abstract 
//method called calculateArea(). Implement two subclasses 
//called Rectangle and Circle that inherit from Shape. Override 
//the calculateArea() method in both subclasses to calculate and 
//return the area of a rectangle and a circle, respectively. Write 
//the Java code to implement this scenario with Scanner Input.
import java.util.Scanner;

// Abstract class Shape
abstract class Shape {
    // Abstract method to be implemented by subclasses
    public abstract double calculateArea();
}

// Rectangle subclass
class Rectangle extends Shape {
    private double length;
    private double width;

    // Constructor to initialize dimensions
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Override calculateArea for rectangle
    @Override
    public double calculateArea() {
        return length * width;
    }
}

// Circle subclass
class Circle extends Shape {
    private double radius;

    // Constructor to initialize radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Override calculateArea for circle
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Main class to test
public class ShapeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for Rectangle
        System.out.print("Enter length of rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter width of rectangle: ");
        double width = scanner.nextDouble();

        Shape rectangle = new Rectangle(length, width);
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());

        // Input for Circle
        System.out.print("\nEnter radius of circle: ");
        double radius = scanner.nextDouble();

        Shape circle = new Circle(radius);
        System.out.println("Area of Circle: " + circle.calculateArea());

        scanner.close();
    }
}
