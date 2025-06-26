//You are building a shape hierarchy for a drawing application. Design an abstract class named "Draw" with the following abstract methods:
//calculateVolume(): This method should calculate and return the area of the shape
//calculateArea(): This method should calculate and return the area of the shape.
//calculatePerimeter(): This method should calculate and return the perimeter of the shape.

// Abstract class Draw
abstract class Draw {

    // Abstract method to calculate volume (for 3D shapes)
    public abstract double calculateVolume();

    // Abstract method to calculate area (for 2D/3D shapes)
    public abstract double calculateArea();

    // Abstract method to calculate perimeter (for 2D/3D shapes)
    public abstract double calculatePerimeter();
}

// Rectangle class (2D)
class Rectangle extends Draw {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateVolume() {
        return 0; // 2D shape has no volume
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

// Cube class (3D)
class Cube extends Draw {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    public double calculateVolume() {
        return side * side * side;
    }

    @Override
    public double calculateArea() {
        return 6 * side * side; // Surface area
    }

    @Override
    public double calculatePerimeter() {
        return 12 * side; // Sum of all edges
    }
}

// Main class to test the shapes
public class DrawTest {
    public static void main(String[] args) {
        // Rectangle Test
        Draw rect = new Rectangle(5, 4);
        System.out.println("=== Rectangle ===");
        System.out.println("Area: " + rect.calculateArea());
        System.out.println("Perimeter: " + rect.calculatePerimeter());
        System.out.println("Volume: " + rect.calculateVolume());

        System.out.println();

        // Cube Test
        Draw cube = new Cube(3);
        System.out.println("=== Cube ===");
        System.out.println("Surface Area: " + cube.calculateArea());
        System.out.println("Perimeter (sum of edges): " + cube.calculatePerimeter());
        System.out.println("Volume: " + cube.calculateVolume());
    }
}

