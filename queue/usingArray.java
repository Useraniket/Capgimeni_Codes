package queue;

import java.util.Arrays;

public class usingArray {
	private int[] data;
	private int pointer = 0;
	private int capacity;

	public usingArray(int capacity) {
		this.capacity = capacity;
		data = new int[capacity];
	}

	public usingArray() {
		this(10);
	}

	public boolean enqueue(int value) {
		if (pointer == capacity) {
			data = Arrays.copyOf(data, data.length * 2);
			capacity = data.length;
		}
		data[pointer++] = value;
		return true;
	}

	public int dequeue() {
		if (pointer == 0) {
			throw new IllegalStateException("Queue is empty");
		}

		int value = data[0];
		for (int i = 0; i < pointer - 1; i++) {
			data[i] = data[i + 1];
		}
		pointer--;
		return value;
	}

	public int peek() {
		if (pointer == 0) {
			throw new IllegalStateException("Queue is empty");
		}
		return data[0];
	}

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

	private boolean isEmpty() {
		return pointer == 0;
	}

	public static void main(String[] args) {
		usingArray queue = new usingArray();

		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);

		queue.display();

		queue.dequeue();
		queue.display();

		queue.peek();
		queue.display();
	}
}
