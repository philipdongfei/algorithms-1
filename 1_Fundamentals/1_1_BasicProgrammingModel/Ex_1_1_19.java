import edu.princeton.cs.algs4.StdOut;

import java.math.BigInteger;

/**
 * 1.1.19 Run the following program on your computer:
 * public class Fibonacci
 * {
 * public static long F(int N)
 * {
 * if (N == 0) return 0;
 * if (N == 1) return 1;
 * return F(N-1) + F(N-2);
 * }
 * public static void main(String[] args)
 * {
 * for (int N = 0; N < 100; N++)
 * StdOut.println(N + " " + F(N));
 * }
 * }
 * What is the largest value of N for which this program takes less 1 hour to compute the
 * value of F(N) ? Develop a better implementation of F(N) that saves computed values in
 * an array.
 */
public class Ex_1_1_19 {
    private static int M = 387389;

    private static BigInteger[] fibonacci = new BigInteger[M];


    public static long F(int N) {
        if (N == 0) return 0;
        if (N == 1) return 1;
        return F(N - 1) + F(N - 2);
    }

    public static BigInteger FImproved(int N) {
        if (N == 0) return (fibonacci[0] = new BigInteger("0"));
        if (N == 1) return (fibonacci[1] = new BigInteger("1"));
        return (fibonacci[N] = fibonacci[N - 1].add(fibonacci[N - 2]));
    }

    public static void main(String[] args) {
        for (int N = 0; N < M; N++) {
//            StdOut.println(N + " " + F(N));
            StdOut.println(N + " " + FImproved(N));
        }
        System.out.println(fibonacci[M - 1].toString().length());
    }

}
