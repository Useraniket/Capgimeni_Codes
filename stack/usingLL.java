package stack;

import java.util.EmptyStackException;

import linkedList.singlell1;

public class usingLL {
	private singlell1 list;
	private int pointer = -1;

	public usingLL() {
		list = new singlell1();
	}

	// Push a value onto the stack
	public boolean push(int value) {
		pointer++; // Increment pointer (this is the index of the top element)
		return list.prepend(value); // Add to the beginning (top of the stack)
	}

	// Pop the top value from the stack
	public int pop() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		int data = list.search(0); // Get the value at the top of the stack (head of the list)
		list.deleteAtFirst(); // Remove the first node (top of the stack)
		pointer--; // Decrease the pointer
		return data;
	}

	// Check if the stack is empty
	private boolean isEmpty() {
		return list.isEmpty();
	}

	// Peek at the top value of the stack without removing it
	public int peek() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		return list.search(0); // Get the value at the top of the stack
	}
}
