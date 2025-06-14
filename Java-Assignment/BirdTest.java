// Create an abstract class called Bird with an abstract method called fly(). Implement two
// subclasses called Eagle and Penguin that inherit from Bird. Override the fly() method in both subclasses,
// ensuring Eagle can fly while Penguin cannot. Implement the Java code for this scenario.
// Abstract class Bird
abstract class Bird {
    // Abstract method fly()
    public abstract void fly();
}

// Subclass Eagle
class Eagle extends Bird {
    @Override
    public void fly() {
        System.out.println("Eagle soars high in the sky!");
    }
}

// Subclass Penguin
class Penguin extends Bird {
    @Override
    public void fly() {
        System.out.println("Penguins cannot fly, but they swim really well!");
    }
}

// Main class to test
public class BirdTest {
    public static void main(String[] args) {
        Bird eagle = new Eagle();
        Bird penguin = new Penguin();

        eagle.fly();    // Output: Eagle soars high in the sky!
        penguin.fly();  // Output: Penguins cannot fly, but they swim really well!
    }
}
