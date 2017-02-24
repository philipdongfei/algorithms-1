import edu.princeton.cs.algs4.StdOut;

/**
 * 1.3.1
 * Add a method isFull() to FixedCapacityStackOfStrings
 *
 * @author <a href="mailto:piotr@piotrovski.com">Piotr Piotrowski</a>
 */
public class Ex_1_3_1 {

    public static final String FIRST = "first";

    public static void main(String[] args) {
        FixedCapacityStackOfStrings s = new FixedCapacityStackOfStrings(1);

        if (s.isFull()) {
            StdOut.println("stack should not be full");
        }

        s.push(FIRST);

        if (s.isFull()) {
            StdOut.println("stack is full");
        }

        if (!FIRST.equals(s.pop())) {
            StdOut.println("stack should contain element: " + FIRST);
        }

        if (s.isFull()) {
            StdOut.println("stack should not be full");
        }
    }

}