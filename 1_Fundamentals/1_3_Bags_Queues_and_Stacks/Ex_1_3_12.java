import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdOut;

/**
 * 1.3.12
 * Write an iterable Stack client that has a static method copy() that takes a stack of strings as argument
 * and returns a copy of the stack.
 * Note: This ability is a prime example of the value of having an iterator,
 * because it allows development of such functionality without changing the basic API.
 *
 * @author <a href="mailto:piotr@piotrovski.com">Piotr Piotrowski</a>
 */
public class Ex_1_3_12 {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("first");
        stack.push("second");
        Stack<String> copyOfStack = copy(stack);
        for (String item:stack) {
            boolean found = false;
            for (String copyOfStackItem: copyOfStack) {
                if (item.equals(copyOfStackItem)) {
                    found = true;
                }
            }
            if (!found) {
                StdOut.println("something went wrong while copying stack. copy does not contain element" + item);
            }
        }
    }

    static Stack<String> copy(Stack<String> stack) {
        Stack<String> result = new Stack<>();
        for (String item: stack) {
            result.push(item);
        }
        return result;
    }

}