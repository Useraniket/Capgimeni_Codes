package linkedList;

public class listDriver {
    public static void main(String[] args) {
        singlell1 list = new singlell1();

        // Append elements
        list.append(10);
        list.append(20);
        list.append(30);
        list.append(40);
        list.append(50);
        System.out.println("List after appending elements:");
        list.display();

        // Prepend an element
        list.prepend(90);
        System.out.println("\nList after prepending 90:");
        list.display();

        // Insert an element at index 3
        list.insert(90, 3);
        System.out.println("\nList after inserting 90 at index 3:");
        list.display();

        // Print size of the list
        System.out.println("\nSize of the list: " + list.getSize());

        // Delete a specific element
        list.delete(10);
        System.out.println("\nList after deleting element 10:");
        list.display();

        // Delete last occurrence of a specific element
        list.delete(50);
        System.out.println("\nList after deleting last occurrence of 50:");
        list.display();

        // Search for an element
        int found = list.search(30);
        System.out.println("\nIs 30 present in the list? " + found);
    }
}
