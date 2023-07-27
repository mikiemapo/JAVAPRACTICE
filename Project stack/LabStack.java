package LabStack;

public class LabStack {
    private int lastItem = 0;
    private int[] items = new int[10]; // Increased the initial size of the array to 10 for demonstration purposes.

    // Add items to the stack
    public void push(int newItem) {
        if (lastItem >= items.length) {
            // If the array is full, create a new array with double the size and copy the
            // elements.
            int[] newItems = new int[items.length * 2];
            System.arraycopy(items, 0, newItems, 0, items.length);
            items = newItems;
        }

        items[lastItem] = newItem;
        lastItem++;
    }

    // Remove items from the stack
    public int pop() {
        if (lastItem == 0) {
            throw new IllegalStateException("Stack is empty. Cannot pop.");
        }

        lastItem--;
        return items[lastItem];
    }

    // View last item
    public int peek() {
        if (lastItem == 0) {
            throw new IllegalStateException("Stack is empty. Cannot peek.");
        }

        return items[lastItem - 1];
    }
}
