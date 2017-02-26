import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdOut;

import java.util.NoSuchElementException;

/**
 * 1.3.7
 * Add a method peek() to Stack that returns the most recently inserted item on the stack (without popping it).
 *
 * @author <a href="mailto:piotr@piotrovski.com">Piotr Piotrowski</a>
 */
public class Ex_1_3_7 {

    public static void main(String[] args) {
        StackWithPeek<String> stack = new StackWithPeek<>();
        stack.push("first");
        stack.push("second");
        StdOut.println(stack.peek());
        StdOut.println(stack.peek());
    }

}

class StackWithPeek<Item> extends Stack<Item> {

    /**
     * Returns the item most recently added to this stack without removing it.
     *
     * @return the item most recently added
     * @throws NoSuchElementException if this stack is empty
     */
    public Item peek() {
        // there are different way to do this task
        Item item = pop();
        push(item);
        return item;
    }
}
