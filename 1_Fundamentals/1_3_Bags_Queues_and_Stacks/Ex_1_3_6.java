import edu.princeton.cs.algs4.Queue;
import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdOut;

/**
 * 1.3.6
 * What does the following code fragment do to the queue q?
 *
 *  Stack<String> stack = new Stack<String>();
 *  while (!q.isEmpty())
 *      stack.push(q.dequeue());
 *  while (!stack.isEmpty())
 *      q.enqueue(stack.pop());
 *
 * @author <a href="mailto:piotr@piotrovski.com">Piotr Piotrowski</a>
 */
public class Ex_1_3_6 {

    public static void main(String[] args) {
        Queue<String> q = new Queue<>();
        q.enqueue("first");
        q.enqueue("second");

        Stack<String> stack = new Stack<>();
        while (!q.isEmpty())
            stack.push(q.dequeue());
        while (!stack.isEmpty())
            q.enqueue(stack.pop());
        StdOut.println();

        // this piece of code reverse the elements on q.
    }

}
