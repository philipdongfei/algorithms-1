package ch_1_1;

import edu.princeton.cs.algs4.StdOut;

/**
 * 1.1.20 Write a recursive static method that computes the value of ln (N !)
 */
public class Ex_1_1_20 {

    public static void main(String[] args) {
        int N = 5;
        StdOut.println("ln(" + N + "!) = " + lnFactorial(N));
        StdOut.println(Math.log(120));
    }

    private static double lnFactorial(int n) {
        if (n < 1) return 0;
        return lnFactorial(n - 1) + Math.log(n);
    }

}
