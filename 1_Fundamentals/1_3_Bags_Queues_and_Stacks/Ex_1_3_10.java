import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * 1.3.10
 * Write a filter InfixToPostfix that converts an arithmetic expression from infix to postfix.
 *
 * @author <a href="mailto:piotr@piotrovski.com">Piotr Piotrowski</a>
 */
public class Ex_1_3_10 {

    public static void main(String[] args) {
        Stack<String> ops = new Stack<>();
        Stack<String> vals = new Stack<>();

        while (!StdIn.isEmpty()) {
            String s = StdIn.readString();
            if ("(".equals(s)) {
                // do nothing
            } else if ("+".equals(s)) { ops.push(s);
            } else if ("-".equals(s)) { ops.push(s);
            } else if ("*".equals(s)) { ops.push(s);
            } else if ("/".equals(s)) { ops.push(s);
            } else if ("sqrt".equals(s)) { ops.push(s);
            } else if (")".equals(s)) {
                String op = ops.pop();
                String val1 = vals.pop();
                String val2 = vals.pop();
                vals.push(val2 + " " + val1 + " " + op + " ");
            } else { vals.push(s);};
        }
        for (String val : vals) {
            StdOut.print(val);
        }
    }

}
