import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;
//import sun.reflect.generics.reflectiveObjects.NotImplementedException;

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
 *
 * @author <a href="mailto:piotr@piotrovski.com">Piotr Piotrowski</a>
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
        if (isEmpty(a) || isEmpty(b) || checkMultMatrix(a, b)) {
            throw new IllegalArgumentException("wrong input");
        }
        double[][] result = new double[a.length][b[0].length];
        for(int i=0; i<result.length; i++) {
            computerRow(a, b, result, i);
        }
        return result;
    }

    private static void computerRow(double[][] a, double[][] b, double[][] result, int i) {
        for (int j=0; j<result[0].length; j++) {
            result[i][j] = computeCell(a, b, i, j);
        }
    }

    private static double computeCell(double[][] a, double[][] b, int i, int j) {
        double sum = 0.0;
        for (int row=0; row < a[0].length; row++) {
            sum += a[i][row] * b[row][j];
        }
        return sum;
    }

    private static boolean checkMultMatrix(double[][] a, double[][] b) {
        return a.length != b[0].length;
    }

    private static boolean checkMatrixVector(double[][] matrix, double[] vector) {
        return vector.length != matrix[0].length;
    }

    private static boolean checkVectorMatrix(double[] vector, double[][] matrix) {
        return vector.length != matrix.length;
    }

    private static boolean isEmpty(double[][] matrix) {
        return matrix == null || matrix.length < 1 || matrix[0].length < 1;
    }

    private static boolean isEmpty(double[] vector) {
        return vector == null || vector.length < 1;
    }

    static double[][] transpose(double[][] a) {
        double[][] result = new double[a[0].length][a.length];
        for (int i=0; i<a.length; i++) {
            for (int j=0; j<a[0].length; j++) {
                result[j][i] = a[i][j];
            }
        }
        return result;
    }

    static double[] mult(double[][] a, double[] x) {
        if (isEmpty(a) || isEmpty(x) || checkMatrixVector(a, x)) {
            throw new IllegalArgumentException("wrong input");
        }
        double[] result = new double[a.length];
        for (int i=0; i<result.length; i++) {
            double sum = 0.0;
            for (int j=0; j<x.length; j++) {
                sum += a[i][j] * x[j];
            }
            result[i] = sum;
        }
        return result;
    }

    static double[] mult(double[] y, double[][] a) {
        if (isEmpty(a) || isEmpty(y) || checkVectorMatrix(y, a)) {
            throw new IllegalArgumentException("wrong input");
        }
        double[] result = new double[a[0].length];
        for (int i=0; i<result.length; i++) {
            double sum = 0.0;
            for (int j=0; j<y.length; j++) {
                sum += a[j][i] * y[j];
            }
            result[i] = sum;
        }
        return result;
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

        double[][] a = new double[][] {{1.0, 2.0}, {3.0, 4.0}, {5.0, 6.0}};
        double[][] b = new double[][] {{1.0, 2.0, 3.0}, {4.0, 5.0, 6.0}};
        double[][] expectedMultResult = {{9.0, 12.0, 15.0},{19.0, 26.0, 33.0},{29.0, 40.0, 51.0}};
        double[][] mutlResult = mult(a, b);
        for (double[] row : mutlResult) {
            for (double cell : row) {
                StdOut.print(cell + " ");

            }
            StdOut.println();
        }
        for (int i = 0; i<expectedMultResult.length; i++) {
            for (int j = 0; j<expectedMultResult[i].length; j++) {
                if (expectedMultResult[i][j] != mutlResult[i][j]) {
                    StdOut.println("something wrong for i=" + i + " j=" + j);
                }
            }
        }

        double[][] transposedA = transpose(a);
        double[][] expectedTransposedA = new double[][] {{1.0, 3.0, 5.0},{2.0, 4.0, 6.0}};
        for (int i=0; i<transposedA.length; i++) {
            for (int j=0; j<transposedA[0].length; j++) {
                if (transposedA[i][j] != expectedTransposedA[i][j]) {
                    StdOut.println("something wrong after transpose for i=" + i + " j=" + j);
                }
            }
        }

        double[] vector = new double[] {1, 2, 3};
        double[][] matrix = new double[][] {{1, 2, 3}, {4, 5, 6}};
        double[] expectedResult = new double[] {14, 32};
        double[] result = mult(matrix, vector);
        for (int i=0; i<result.length; i++) {
            StdOut.print(result[i] + " ");
            if (expectedResult[i] != result[i]) {
                StdOut.println("something went wrong for i = " + i);
            }
        }
        StdOut.println();

        vector = new double[] {1, 2};
        expectedResult = new double[] {9, 12, 15};
        result = mult(vector, matrix);
        for (int i=0; i<result.length; i++) {
            StdOut.print(result[i] + " ");
            if (expectedResult[i] != result[i]) {
                StdOut.println("something went wrong for i = " + i);
            }
        }
     }

}
