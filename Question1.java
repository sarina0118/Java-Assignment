class Vehicle {
    public void drive() {
        System.out.println("People can drive");
    }
}

class Car extends Vehicle {
    String brand;
    String color;
    int year;

    public Car(String brand, String color, int year) {
        this.brand = brand;
        this.color = color;
        this.year = year;
    }

    public void display() {
        System.out.println("Car details");
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
    }
}

public class Question1 {
    public static void main(String[] args) {
        Car vehicle = new Car("BMW", "Black", 2022);
        vehicle.drive();
        vehicle.display();
    }
}
