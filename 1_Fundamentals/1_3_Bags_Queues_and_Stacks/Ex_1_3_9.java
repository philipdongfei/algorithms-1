import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * 1.3.9
 * Write a program that takes from standard input an expression without left parentheses
 * and prints the equivalent infix expression with the parentheses inserted. For example, given the input:
 *
 *  1 + 2 ) * 3 - 4 ) * 5 - 6 ) ) )
 * your program should print
 *  ( ( 1 + 2 ) * ( ( 3 - 4 ) * ( 5 - 6 ) ) )
 *
 * @author <a href="mailto:piotr@piotrovski.com">Piotr Piotrowski</a>
 */
public class Ex_1_3_9 {

    public static void main(String[] args) {
        Stack<String> expression = new Stack<>();

        while(!StdIn.isEmpty()) {
            String item = StdIn.readString();

            if (item.equals(")")) {
                String ex1 = expression.pop();
                String op = expression.pop();
                String ex2 = expression.pop();
                expression.push("( " + ex2 + " " + op + " " + ex1 + " )");
            } else {
                expression.push(item);
            }
        }
        for (String ex : expression) {
            StdOut.print(ex);
        }
    }

}
