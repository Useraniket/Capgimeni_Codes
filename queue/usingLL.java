package queue;

import java.util.NoSuchElementException;

import linkedList.singlell1;

public class usingLL {
    private singlell1 list;
    private int size = 0;

    public usingLL() {
        list = new singlell1();
    }

   
    public boolean enqueue(int value) {
        size++;
        return list.append(value); 
    }

  
    public int dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        int data = list.search(0);
        list.deleteAtFirst(); 
        size--;
        return data;
    }

   
    public boolean isEmpty() {
        return list.isEmpty();
    }

    
    public int peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return list.search(0); 
    }

  
    public int size() {
        return size;
    }
	public static void main(String[] args) {
		usingLL queue = new usingLL();

		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
	    // Peek at the top of the stack
        System.out.println("Top of the stack (peek): " + queue.peek());

        // Pop values from the stack
        System.out.println("\nPopping values from the stack:");
        System.out.println("Popped: " + queue.dequeue());

        // Peek after popping
        System.out.println("\nTop of the stack after popping two elements: " + queue.peek());


	}
}
