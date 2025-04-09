package stack;

public class StackDriver {
    public static void main(String[] args) {
        // Create a new stack using the linked list implementation
        usingLL stack = new usingLL();

        // Push values onto the stack
        System.out.println("Pushing values onto the stack:");
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        // Peek at the top of the stack
        System.out.println("Top of the stack (peek): " + stack.peek());

        // Pop values from the stack
        System.out.println("\nPopping values from the stack:");
        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());

        // Peek after popping
        System.out.println("\nTop of the stack after popping two elements: " + stack.peek());

        // Push more values onto the stack
        System.out.println("\nPushing more values onto the stack:");
        stack.push(50);
        stack.push(60);

        // Pop remaining values
        System.out.println("\nPopping remaining values from the stack:");
        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());
    }
}

