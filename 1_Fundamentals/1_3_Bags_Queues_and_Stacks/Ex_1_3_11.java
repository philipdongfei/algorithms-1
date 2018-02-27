import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;

/**
 * 1.3.11 Write a program EvaluatePostfix that takes a postfix expression
 * from standard input, evaluates it, and prints the value.
 * (Piping the output of your program from the previous exercise
 * to this program gives equivalent behavior to Evaluate.)
 *
 * @author <a href="mailto:piotr@piotrovski.com">Piotr Piotrowski</a>
 */
public class Ex_1_3_11 {

    public static void main(String[] args) {
        Stack<Double> vals = new Stack<>();
        while(!StdIn.isEmpty()) {
            String item = StdIn.readString();
            if ("+".equals(item)) {
                // add two items
                Double val1 = vals.pop();
                vals.push(val1 + vals.pop());
            } else if ("-".equals(item)) {
                // subtract two items
                Double val1 = vals.pop();
                vals.push(vals.pop() - val1);
            } else if ("*".equals(item)) {
                // multiply two items
                Double val1 = vals.pop();
                vals.push(val1 * vals.pop());
            } else if ("/".equals(item)) {
                // divide two items
                Double val1 = vals.pop();
                vals.push(vals.pop() / val1);
            } else {
                vals.push(Double.parseDouble(item));
            }
        }
    }

}
