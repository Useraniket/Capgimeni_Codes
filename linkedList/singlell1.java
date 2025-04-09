package linkedList;

public class singlell1 {
	private Node head;
	private Node tail;
	private int size = 0;

	private class Node {
		int value;
		Node next;

		Node(int value) {
			this.value = value;
		}
	}

	// Delete the first node
	public boolean deleteAtFirst() {
		if (isEmpty()) {
			return false; // Return false if the list is empty
		}
		if (head == tail) { // Only one element in the list
			head = tail = null;
		} else {
			head = head.next; // Move the head to the next node
		}
		size--; // Decrease the size of the list
		return true;
	}

	// Delete a node with a specific value
	public boolean delete(int value) {
		if (isEmpty()) {
			return false;
		}
		if (head.value == value) {
			if (head == tail) {
				head = tail = null;
			} else {
				head = head.next;
			}
			size--;
			return true;
		}

		Node temp = head;
		while (temp != null && temp.next != null) {
			if (temp.next.value == value) {
				if (temp.next == tail) {
					tail = temp;
				}
				temp.next = temp.next.next;
				size--;
				return true;
			}
			temp = temp.next;
		}

		return false;
	}

	// Delete the last node
	public boolean deleteAtLast() {
		if (isEmpty()) {
			return false;
		}
		if (head == tail) {
			head = tail = null;
		} else {
			Node temp = head;
			while (temp.next != tail) {
				temp = temp.next;
			}
			temp.next = null; // Remove the reference to the last node
			tail = temp; // Update the tail to the previous node
		}
		size--;
		return true;
	}

	// Get size of the list
	public int getSize() {
		int count = 0;
		Node temp = head;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}

	// Insert value at a specific index
	public boolean insert(int value, int index) {
		if (index <= 0) {
			return prepend(value);
		} else if (index >= size) {
			return append(value);
		}
		Node node = new Node(value);
		Node temp = head;
		Node prev = null;
		int i = 0;
		while (i != index) {
			prev = temp;
			temp = temp.next;
			i++;
		}
		prev.next = node;
		node.next = temp;
		size++;
		return true;
	}

	// Reverse the list
	public boolean reverse() {
		if (isEmpty()) {
			return false;
		}
		Node prev = null;
		Node current = head;
		Node next = null;
		tail = head;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
		return true;
	}

	// Search for value and return index
	public int search(int value) {
		Node current = head;
		int index = 0;
		while (current != null) {
			if (current.value == value) {
				return index;
			}
			index++;
			current = current.next;
		}
		return -1;
	}

	// Prepend value at the beginning
	public boolean prepend(int value) {
		Node node = new Node(value);
		if (isEmpty()) {
			head = node;
			tail = node;
		} else {
			node.next = head;
			head = node;
		}
		size++;
		return true;
	}

	// Display the list
	public void display() {
		Node temp = head;
		StringBuffer sb = new StringBuffer("[");
		while (temp != null) {
			sb.append(temp == tail ? temp.value : temp.value + ",");
			temp = temp.next;
		}
		sb.append("]");
		System.out.println(sb);
	}

	// Append value at the end
	public boolean append(int value) {
		Node node = new Node(value);
		if (isEmpty()) {
			head = node;
			tail = node;
		} else {
			tail.next = node;
			tail = node;
		}
		size++;
		return true;
	}

	// Check if the list is empty
	public boolean isEmpty() {
		return head == null && tail == null;
	}

	// Update value of a node
	public boolean update(int oldValue, int newValue) {
		Node current = head;
		while (current != null) {
			if (current.value == oldValue) {
				current.value = newValue;
				return true;
			}
			current = current.next;
		}
		return false;
	}
}
