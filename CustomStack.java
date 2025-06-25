public class CustomStack {
    private int[] stackArray;   // Array to store stack elements
    private int top;            // Index of the top element
    private int capacity;       // Maximum size of the stack

    // Constructor to initialize the stack
    public CustomStack(int size) {
        capacity = size;
        stackArray = new int[capacity];
        top = -1; // Stack is initially empty
    }

    // Pushes an element onto the stack
    public void push(int val) {
        if (isFull()) {
            System.out.println("Stack Overflow! Cannot push " + val);
            return;
        }
        stackArray[++top] = val;
    }

    // Pops the top element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! Cannot pop");
            return -1;
        }
        return stackArray[top--];
    }

    // Returns the top element without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty! Nothing to peek.");
            return -1;
        }
        return stackArray[top];
    }

    // Checks if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Checks if the stack is full
    public boolean isFull() {
        return top == capacity - 1;
    }

    // Optional: Display the stack contents
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }

        System.out.print("Stack elements: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();
    }
}
