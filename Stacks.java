import java.util.Stack;
public class Stacks {
    private int[] stackArray;   // Array to store stack elements
    private int top;            // Index of the top element
    private int capacity;       // Maximum size of the stack

    // Constructor to initialize stack
    public Stacks(int size) {
        capacity = size;
        stackArray = new int[capacity];
        top = -1;  // Stack is initially empty
    }

    // Pushes an element onto the stack
    public void push(int element) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow! Cannot push " + element);
            return;
        }
        stackArray[++top] = element;
    }

    // Pops the top element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! Cannot pop");
            return -1; // You can also throw an exception here
        }
        return stackArray[top--];
    }

    // Returns the top element without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty! Nothing to peek");
            return -1; // You can also throw an exception here
        }
        return stackArray[top];
    }

    // Checks if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Returns the number of elements in the stack
    public int size() {
        return top + 1;
    }

    // Optional: Display stack contents (for testing)
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("Stack elements: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();
    }
    public class Stack {
    private int[] stackArray;
    private int top;
    private int capacity;

    public Stack(int size) {
        capacity = size;
        stackArray = new int[capacity];
        top = -1;
    }

    public void push(int element) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow! Cannot push " + element);
            return;
        }
        stackArray[++top] = element;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! Cannot pop");
            return -1;
        }
        return stackArray[top--];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty! Nothing to peek");
            return -1;
        }
        return stackArray[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("Stack elements: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();
    }

    
    public static void main(String[] args) {
        Stacks stack = new Stacks(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();

        System.out.println("Top element is: " + stack.peek());
        System.out.println("Stack size is: " + stack.size());

        System.out.println("Popped element: " + stack.pop());
        stack.display();

        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}

}

