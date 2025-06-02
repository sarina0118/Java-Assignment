// Base class
class Vehicle {
    public void startEngine() {
        System.out.println("Engine started.");
    }

    public void stopEngine() {
        System.out.println("Engine stopped.");
    }
}

// Subclass Car inherits from Vehicle
class Car extends Vehicle {
    public void drive() {
        System.out.println("Car is being driven.");
    }
}

// Subclass Motorcycle inherits from Vehicle
class Motorcycle extends Vehicle {
    public void ride() {
        System.out.println("Motorcycle is being ridden.");
    }
}

// Main class to demonstrate
public class Question4 {
    public static void main(String[] args) {
        // Create a Car object
        Car myCar = new Car();
        System.out.println("Car:");
        myCar.startEngine();
        myCar.drive();
        myCar.stopEngine();

       

        // Create a Motorcycle object
        Motorcycle myBike = new Motorcycle();
        System.out.println("Motorcycle:");
        myBike.startEngine();
        myBike.ride();
        myBike.stopEngine();
    }
}
