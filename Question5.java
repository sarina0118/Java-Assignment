// Base class
class Shape {
    public void calculateArea() {
        System.out.println("Calculating area...");
    }
}

// Rectangle class
class Rectangle extends Shape {
    double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void calculateArea() {
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }

    public void calculatePerimeter() {
        double perimeter = 2 * (length + width);
        System.out.println("Perimeter of Rectangle: " + perimeter);
    }
}

// Circle class
class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        double pi = 3.14;  // Approximate value
        double area = pi * radius * radius;
        System.out.println("Area of Circle: " + area);
    }

    public void calculateCircumference() {
        double pi = 3.14;  // Approximate value
        double circumference = 2 * pi * radius;
        System.out.println("Circumference of Circle: " + circumference);
    }
}

// Main class
public class Question5 {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5, 3);
        System.out.println("Rectangle:");
        rect.calculateArea();
        rect.calculatePerimeter();
        Circle circle = new Circle(4);
        System.out.println("Circle:");
        circle.calculateArea();
        circle.calculateCircumference();
    }
}

        

