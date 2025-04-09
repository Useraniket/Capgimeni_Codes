package queue;

import java.util.Arrays;

public class QueueImplementation {
    private int[] data;
    private int pointer = 0;  // The only pointer we need
    private int capacity;

    // Constructor initializes the queue with the given capacity
    public QueueImplementation(int capacity) {
        this.capacity = capacity;
        data = new int[capacity];
    }

    // Enqueue method: Adds an element to the queue
    public boolean enqueue(int value) {
        if (pointer == capacity) {
            // Resize the array if the queue is full
            data = Arrays.copyOf(data, data.length * 2);  // Double the size of the array
            capacity = data.length;
            System.out.println("Queue resized to " + capacity);
        }

        // Insert the element at the pointer position
        data[pointer++] = value;
        return true;
    }

    // Dequeue method: Removes and returns the front element of the queue
    public int dequeue() {
        if (pointer == 0) {
            throw new IllegalStateException("Queue is empty");
        }

        // The front element is at position 0, move the pointer forward and shift the array
        int value = data[0];
        for (int i = 0; i < pointer - 1; i++) {
            data[i] = data[i + 1];  // Shift elements left
        }
        pointer--;  // Decrease pointer as we've removed one element
        return value;
    }

    // Peek method: Returns the front element without removing it
    public int peek() {
        if (pointer == 0) {
            throw new IllegalStateException("Queue is empty");
        }
        return data[0];  // The front element is always at position 0
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return pointer == 0;
    }

    // Display the elements of the queue
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }

        System.out.print("Queue elements: ");
        for (int i = 0; i < pointer; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QueueImplementation queue = new QueueImplementation(3);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        // Display queue contents
        queue.display();  // Output: Queue elements: 10 20 30

        queue.enqueue(40);  // Resizing will occur here

        System.out.println("Queue after resizing:");
        queue.display();  // Output: Queue elements: 10 20 30 40

        queue.dequeue();  // Removes 10

        System.out.println("Front element after dequeue: " + queue.peek());  // Should be 20

        // Display queue contents after dequeuing
        queue.display();  // Output: Queue elements: 20 30 40
    }
}
