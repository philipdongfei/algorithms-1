import edu.princeton.cs.algs4.StdOut;

/**
 * 1.3.2
 * Give the output printed by java Stack for the input
 *      it was - the best - of times - - - it was - the - -
 *
 * @author <a href="mailto:piotr@piotrovski.com">Piotr Piotrowski</a>
 */
public class Ex_1_3_2 {
    public static void main(String[] args) {
        FixedCapacityStackOfStrings s = new FixedCapacityStackOfStrings(100);
        String input = "it was - the best - of times - - - it was - the - -";
        for (String item :  input.split(" ")) {
            if (!"-".equals(item)) {
                s.push(item);
            } else if (!s.isEmpty()) {
                StdOut.print(s.pop() + " ");
            }
        }
        StdOut.println("(" + s.size() + " left on stack)");
    }
}