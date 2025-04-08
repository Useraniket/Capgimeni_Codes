package linkedList;

public class dLL {
    private Node head;
    private Node tail;
    private int size = 0;

    private class Node {
        int value;
        Node next;
        Node prev;
        

        Node(int value) {
            this.value = value;
        }
    }

    private boolean isEmpty() {
        return head == null && tail == null;
    }

    public boolean append(int value) {
        Node node = new Node(value);
        if (isEmpty()) {
            head = tail = node;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
        size++;
        return true;
    }

    public boolean prepend(int value) {
        Node node = new Node(value);
        if (isEmpty()) {
            head = tail = node;
        } else {
            node.next = head;
            head.prev = node;
            head = node;
        }
        size++;
        return true;
    }

    public boolean insert(int value, int index) {
        if (index <= 0) return prepend(value);
        if (index >= size) return append(value);

        Node node = new Node(value);
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        node.prev = temp.prev;
        node.next = temp;
        temp.prev.next = node;
        temp.prev = node;
        size++;
        return true;
    }

    public boolean delete(int value) {
        if (isEmpty()) return false;

        if (head.value == value) {
            if (head == tail) {
                head = tail = null;
            } else {
                head = head.next;
                head.prev = null;
            }
            size--;
            return true;
        }

        Node current = head;
        while (current != null) {
            if (current.value == value) {
                if (current == tail) {
                    tail = tail.prev;
                    tail.next = null;
                } else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }
                size--;
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public boolean deletelast(int value) {
        if (isEmpty()) return false;

        Node current = tail;
        while (current != null) {
            if (current.value == value) {
                if (current == head && current == tail) {
                    head = tail = null;
                } else if (current == tail) {
                    tail = tail.prev;
                    if (tail != null) tail.next = null;
                } else if (current == head) {
                    head = head.next;
                    if (head != null) head.prev = null;
                } else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }
                size--;
                return true;
            }
            current = current.prev;
        }
        return false;
    }

    public boolean deleteAtIndex(int index) {
        if (isEmpty() || index < 0 || index >= size) return false;

        if (index == 0) {
            head = head.next;
            if (head != null) head.prev = null;
            else tail = null;
            size--;
            return true;
        }

        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        if (temp == tail) {
            tail = tail.prev;
            tail.next = null;
        } else {
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }
        size--;
        return true;
    }

    public boolean reverse() {
        if (isEmpty()) return false;

        Node current = head;
        Node temp = null;

        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }

        if (temp != null) {
            head = temp.prev;
        }
        return true;
    }

    public int search(int value) {
        Node current = head;
        int index = 0;
        while (current != null) {
            if (current.value == value) return index;
            index++;
            current = current.next;
        }
        return -1;
    }

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

    public int getSize() {
        return size;
    }

    public void display() {
        Node temp = head;
        StringBuilder sb = new StringBuilder("[");
        while (temp != null) {
            sb.append(temp == tail ? temp.value : temp.value + ", ");
            temp = temp.next;
        }
        sb.append("]");
        System.out.println(sb);
    }
}
