package linkedList;


public class circularLL {
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

	public int search(int value) {
		Node current = head;
		int index = 0;
		do {
			if (current.value == value) {
				return index;
			}
			index++;
			current = current.next;
		} while (current != head);
		return -1;
	}

	public int getSize() {
		return size;
	}

	public void display() {
		if (isEmpty()) {
			System.out.println("[]");
			return;
		}

		Node temp = head;
		StringBuilder sb = new StringBuilder("[");
		do {
			sb.append(temp.value);
			temp = temp.next;
			if (temp != head) {
				sb.append(",");
			}
		} while (temp != head);

		sb.append("]");
		System.out.println(sb);
	}

	public boolean prepend(int value) {
		Node node = new Node(value);
		if (isEmpty()) {
			head = node;
			tail = node;
			tail.next = head;
		} else {
			node.next = head;
			head = node;
			tail.next = head;
		}
		size++;
		return true;
	}

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

	public boolean append(int value) {
		Node node = new Node(value);
		if (isEmpty()) {
			head = node;
			tail = node;
			node.next = head;
		} else {
			tail.next = node;
			tail = node;
			tail.next = head;
		}
		size++;
		return true;
	}

	public boolean update(int oldValue, int newValue) {
		Node current = head;
		do {
			if (current.value == oldValue) {
				current.value = newValue;
				return true;
			}
			current = current.next;
		} while (current != head);
		return false;
	}

	private boolean isEmpty() {
		return head == null && tail == null;
	}

	public boolean delete(int value) {
		if (isEmpty()) {
			return false;
		}

		if (head.value == value) {
			if (head == tail) { // Only one node
				head = tail = null;
			} else {
				head = head.next;
				tail.next = head;
			}
			size--;
			return true;
		}

		Node temp = head;
		while (temp.next != head) {
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

	public boolean deletelast(int value) {
		if (isEmpty()) {
			return false;
		}

		if (head == tail && head.value == value) {
			head = tail = null;
			size--;
			return true;
		}

		Node temp = head;
		while (temp.next != head) {
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

	public boolean deleteAtIndex(int index) {
		if (isEmpty() || index < 0 || index >= size) {
			return false;
		}

		if (index == 0) {
			head = head.next;
			if (head == null) {
				tail = null;
			}
			size--;
			return true;
		}

		Node temp = head;
		for (int i = 0; i < index - 1; i++) {
			temp = temp.next;
		}

		if (temp.next == tail) {
			tail = temp;
		}
		temp.next = temp.next.next;
		size--;
		return true;
	}

}
