import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * 1.1.26 Sorting three numbers. Suppose that the variables a, b, c, and t are all of the
 * same numeric primitive type. Show that the following code puts a, b, and c in ascending
 * order:
 * if (a > b) { t = a; a = b; b = t; }
 * if (a > c) { t = a; a = c; c = t; }
 * if (b > c) { t = b; b = c; c = t; }
 *
 * @author <a href="mailto:piotr@piotrovski.com">Piotr Piotrowski</a>
 */
public class Ex_1_1_26 {
    public static void main(String[] args) {

        int a = StdIn.readInt();
        int b = StdIn.readInt();
        int t = 0;
        int c = StdIn.readInt();

        if (a > b) {
            t = a;
            a = b;
            b = t;
        }
        if (a > c) {
            t = a;
            a = c;
            c = t;
        }
        if (b > c) {
            t = b;
            b = c;
            c = t;
        }

        StdOut.print("a=" + a);
        StdOut.print(", b=" + b);
        StdOut.println(" c=" + c);
    }
}
