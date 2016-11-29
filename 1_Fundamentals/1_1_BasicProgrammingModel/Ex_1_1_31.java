import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * 1.1.31 Random connections.
 * Write a program that takes as command-line arguments
 * an integer N
 * and a double value p (between 0 and 1),
 * plots N equally spaced dots of size .05 on the circumference of a circle,
 * and then,
 * with probability p for each pair of points, draws a gray line connecting them.
 */
public class Ex_1_1_31 {

    public static void main(String[] args) {
        int N = StdIn.readInt();
        double p = Math.max(0, Math.min(1, StdIn.readDouble()));
        StdOut.println(p);
    }

}
