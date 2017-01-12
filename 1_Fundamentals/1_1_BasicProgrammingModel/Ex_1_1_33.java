import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * 1.1.33 Matrix library. Write a library Matrix that implements the following API:
 * public class Matrix
 *  static double dot(double[] x, double[] y) vector dot product
 *  static double[][] mult(double[][] a, double[][] b) matrix-matrix product
 *  static double[][] transpose(double[][] a) transpose
 *  static double[] mult(double[][] a, double[] x) matrix-vector product
 *  static double[] mult(double[] y, double[][] a) vector-matrix product
 *
 *  Develop a test client that reads values from standard input and tests all the methods.
 */
public class Ex_1_1_33 {

    static double dot(double[] x, double[] y) {
        if (x == null || y == null || x.length != y.length) {
            throw new IllegalArgumentException("wrong input");
        }
        double result = 0.0;
        for(int i = 0; i<x.length; i++) {
            result += x[i] * y[i];
        }
        return result;
    }

    static double[][] mult(double[][] a, double[][] b) {
        throw new NotImplementedException();
    }

    static double[][] transpose(double[][] a) {
        throw new NotImplementedException();
    }

    static double[] mult(double[][] a, double[] x) {
        throw new NotImplementedException();
    }

    static double[] mult(double[] y, double[][] a) {
        throw new NotImplementedException();
    }

    public static void main(String[] args) {
        if (args.length != 2) {
            throw new IllegalArgumentException("pass two files as args");
        }
        double[] x = new In("1_Fundamentals/1_1_BasicProgrammingModel/" + args[0]).readAllDoubles();
        double[] y = new In("1_Fundamentals/1_1_BasicProgrammingModel/" + args[1]).readAllDoubles();

        StdOut.println("dot result of x and y is ==" + dot(x, y) + "==");

        x = new double[] {1.0, 2.0};
        y = new double[] {3.0, 4.0};
        StdOut.println("dot result of x and y should be 11.0 and is " + dot(x, y));
     }

}
