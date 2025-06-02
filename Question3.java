// Base class
class Shape {
    public void display() {
        System.out.println("Calculating area of shapes...");
    }
}

// Rectangle inherits Shape
class Rectangle extends Shape {
    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }
}

// Square inherits Rectangle
class Square extends Rectangle {

    public Square(double side) {
        super(side, side); // Pass side as both length and width
    }
}

// Circle is separate (not part of the multilevel chain)
class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}

// Test class
public class Question3 {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.display();

        Rectangle rect = new Rectangle(5, 3);
        System.out.println("Area of Rectangle: " + rect.getArea());

        Square square = new Square(4);
        System.out.println("Area of Square: " + square.getArea());

        Circle circle = new Circle(2.5);
        System.out.println("Area of Circle: " + circle.getArea());
    }
}
