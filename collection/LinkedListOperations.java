package collection;

import java.util.*;

public class LinkedListOperations {
    private LinkedList<Integer> list = new LinkedList<>();

    // Add operations
    public void add(int value) {
        list.add(value);
    }

    public void addFirst(int value) {
        list.addFirst(value);
    }

    public void addLast(int value) {
        list.addLast(value);
    }

    public void addAt(int index, int value) {
        if (index >= 0 && index <= list.size()) {
            list.add(index, value);
        } else {
            System.out.println("Invalid index.");
        }
    }

    // Remove operations
    public void removeAt(int index) {
        if (index >= 0 && index < list.size()) {
            list.remove(index);
        } else {
            System.out.println("Invalid index.");
        }
    }

    public void removeValue(int value) {
        if (!list.remove((Integer) value)) {
            System.out.println("Value not found.");
        }
    }

    public void removeFirst() {
        if (!list.isEmpty()) list.removeFirst();
    }

    public void removeLast() {
        if (!list.isEmpty()) list.removeLast();
    }

    // Search
    public boolean contains(int value) {
        return list.contains(value);
    }

    public int indexOf(int value) {
        return list.indexOf(value);
    }

    // Update
    public void update(int index, int newValue) {
        if (index >= 0 && index < list.size()) {
            list.set(index, newValue);
        } else {
            System.out.println("Invalid index.");
        }
    }

    // Sort
    public void sortAscending() {
        Collections.sort(list);
    }

    public void sortDescending() {
        list.sort(Collections.reverseOrder());
    }

    // Reverse
    public void reverse() {
        Collections.reverse(list);
    }

    // Clear
    public void clear() {
        list.clear();
    }

    // Display
    public void display() {
        System.out.println("LinkedList: " + list);
    }

    // Main method for testing
    public static void main(String[] args) {
        LinkedListOperations ll = new LinkedListOperations();

        ll.add(10);
        ll.add(50);
        ll.addFirst(5);
        ll.addAt(2, 20);
        ll.display();

        ll.removeValue(50);
        ll.display();

        ll.sortAscending();
        ll.display();

        ll.sortDescending();
        ll.display();

        ll.reverse();
        ll.display();

        ll.update(1, 99);
        ll.display();

        System.out.println("Contains 99? " + ll.contains(99));
        System.out.println("Index of 99: " + ll.indexOf(99));
    }
}
