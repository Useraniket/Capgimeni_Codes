package stack;

import java.util.Arrays;

public class StackImplementation {
    private int[] data;
    private int pointer = -1;

    // Constructor accepts size
    public StackImplementation(int size) {
        data = new int[size];
    }

    // Push method to add an element to the stack
    public boolean push(int value) {
        if (isFull()) {
            // Resize array if stack is full
            data = Arrays.copyOf(data, data.length * 2);  // Doubling the size
        }
        data[++pointer] = value;
        return true;
    }

    // Pop method to remove and return the top element of the stack
    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return data[pointer--];  // Decrement pointer after popping
    }

    // Peek method to view the top element without removing it
    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return data[pointer];
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return pointer == -1;
    }

    // Check if the stack is full
    private boolean isFull() {
        return pointer == data.length - 1;
    }

    // Get current size of the stack
    public int size() {
        return pointer + 1;
    }

    // Display the elements of the stack
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        
        System.out.print("Stack elements: ");
        for (int i = 0; i <= pointer; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();  // Move to the next line after displaying the stack
    }

    public static void main(String[] args) {
        StackImplementation stack = new StackImplementation(3);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Display stack contents
        stack.display();  // Output: Stack elements: 10 20 30

        stack.push(40);  // Resizing should occur here

        System.out.println("Stack size after resizing: " + stack.size());  // Should be 4
        
        stack.display();  // Output: Stack elements: 10 20 30 40

        stack.pop();  // Pop 40

        System.out.println("Top element after pop: " + stack.peek());  // Should be 30
        
        // Display stack contents after popping
        stack.display();  // Output: Stack elements: 10 20 30
    }
}
