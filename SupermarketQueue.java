import java.util.Scanner;

public class SupermarketQueue {
    private String[] queue;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    // Constructor
    public SupermarketQueue(int capacity) {
        this.capacity = capacity;
        queue = new String[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    // a. Add customer to the queue
    public void addCustomer(String name) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot add more customers.");
            return;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = name;
        size++;
        System.out.println(name + " joined the queue.");
    }

    // b. Serve next customer
    public void serveCustomer() {
        if (isEmpty()) {
            System.out.println("Queue is empty. No customers to serve.");
            return;
        }
        String served = queue[front];
        front = (front + 1) % capacity;
        size--;
        System.out.println(served + " has been served.");
    }

    // c. Display the current queue
    public void displayQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Current queue: ");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % capacity;
            System.out.print(queue[index] + " ");
        }
        System.out.println();
    }

    // d. Number of customers in the queue
    public int numberOfCustomers() {
        return size;
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Check if queue is full
    public boolean isFull() {
        return size == capacity;
    }

    
}

