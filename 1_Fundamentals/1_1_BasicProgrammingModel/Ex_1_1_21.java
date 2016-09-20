import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * 1.1.21 Write a program that reads in lines from standard input with each line containing
 * a name and two integers and then uses printf() to print a table with a column of
 * the names, the integers, and the result of dividing the first by the second, accurate to
 * three decimal places. You could use a program like this to tabulate batting averages for
 * baseball players or grades for students.
 */
public class Ex_1_1_21 {

    public static void main(String[] args) {
        while (!StdIn.isEmpty()) {
            String name = StdIn.readString();
            Integer firstInteger = StdIn.readInt();
            Integer secondInteger = StdIn.readInt();
            StdOut.printf("%s %d %d %.3f", name, firstInteger, secondInteger, (float) firstInteger / (float) secondInteger);
        }
    }

}
