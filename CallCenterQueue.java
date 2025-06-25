public class CallCenterQueue {
    private String[] callQueue;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    // Constructor
    public CallCenterQueue(int capacity) {
        this.capacity = capacity;
        callQueue = new String[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    // a. Add an incoming call to the queue
    public void addCall(String caller) {
        if (isFull()) {
            System.out.println("Call queue is full. Cannot accept more calls right now.");
            return;
        }
        rear = (rear + 1) % capacity;
        callQueue[rear] = caller;
        size++;
        System.out.println("Incoming call from " + caller + " added to the queue.");
    }

    // b. Serve and handle the next call
    public void handleNextCall() {
        if (isEmpty()) {
            System.out.println("No calls in the queue to handle.");
            return;
        }
        String caller = callQueue[front];
        front = (front + 1) % capacity;
        size--;
        System.out.println("Now handling call from: " + caller);
    }

    // c. Display the current call queue
    public void displayCallQueue() {
        if (isEmpty()) {
            System.out.println("Call queue is empty.");
            return;
        }
        System.out.print("Current Call Queue: ");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % capacity;
            System.out.print(callQueue[index] + " ");
        }
        System.out.println();
    }

    // d. Display the number of pending calls
    public int pendingCalls() {
        return size;
    }

    // Check if the queue is empty
    private boolean isEmpty() {
        return size == 0;
    }

    // Check if the queue is full
    private boolean isFull() {
        return size == capacity;
    }
}
