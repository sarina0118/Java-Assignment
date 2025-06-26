//Create an abstract class called Vehicle with abstract methods startEngine() and stopEngine(). 
//Implement two subclasses called Car and Motorcycle that inherit from Vehicle. Implement the 
//startEngine() and stopEngine() methods in both subclasses to start and stop the engines of a car and 
//a motorcycle, respectively. 

// Abstract class Vehicle
abstract class Vehicle {
    // Abstract methods to be implemented by subclasses
    public abstract void startEngine();
    public abstract void stopEngine();
}

// Car subclass
class Car extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Car engine started with a key turn.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Car engine stopped.");
    }
}

// Motorcycle subclass
class Motorcycle extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Motorcycle engine started with a kick or button.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Motorcycle engine stopped.");
    }
}

// Main class to test the behavior
public class VehicleTest {
    public static void main(String[] args) {
        // Create Car object
        Vehicle car = new Car();
        car.startEngine();
        car.stopEngine();

        System.out.println();

        // Create Motorcycle object
        Vehicle motorcycle = new Motorcycle();
        motorcycle.startEngine();
        motorcycle.stopEngine();
    }
}

