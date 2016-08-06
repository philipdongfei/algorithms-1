package ch_1_1;

import edu.princeton.cs.algs4.StdOut;

/**
 * 1.1.18 Consider the following recursive function:
 * public static int mystery(int a, int b)
 * {
 * if (b == 0)
 * return 0;
 * if (b % 2 == 0) return mystery(a+a, b/2);
 * return mystery(a+a, b/2) + a;
 * }
 * What are the values of mystery(2, 25) and mystery(3, 11) ? Given positive integers
 * a and b , describe what value mystery(a, b) computes. Answer the same question, but
 * replace + with * and replace return 0 with return 1 .
 */
public class Ex_1_1_18 {

    public static void main(String[] args) {
        // mystery(2, 25) = mystery(2+2, 12) + 2 = mystery(8, 6) + 2 = mystery(16, 3) + 2 = mystery(32, 1) + 16 + 2
        // = mystery(64, 0) + 32 + 16 + 2 = 0 + 32 + 16 + 2 = 50
        StdOut.println("mystery(2, 25) == 50 is " + (mystery(2, 25) == 50));
        // mystery(3, 11) = mystery(6, 5) + 3 = mystery(12, 2) + 6 + 3 = mystery(24, 1) + 6 + 3
        // = mystery(48, 0) + 24 + 6 + 3 = 0 + 24 + 6 + 3 = 33
        StdOut.println("mystery(3, 11) == 33 is " + (mystery(3, 11) == 33));

        // mystery1(2, 25) = mystery1(4, 12) * 2 = mystery1(16, 6) * 2 = mystery1(256, 3) * 2
        // = mystery1(256*256, 1) * 256 * 2 = mystery1(256^4, 0) * 256 ^2 * 256* 2 = 1 * 256^2 * 256 * 2 = 33554432
        StdOut.println("mystery1(2, 25) == 33554432 is " + (mystery1(2, 25) == 33554432));
        // mystery1(3, 11) = mystery1(9, 5) * 3 = mystery1(81, 2) * 9 * 3 = mystery1(81^2, 1) * 9 * 3
        // = mystery1(81^4, 0) * 81^2 * 9 * 3 = 1 * 81^2 * 9 * 3 = 177147
        StdOut.println("mystery1(3, 11) == 177147 is " + (mystery1(3, 11) == 177147));

    }

    public static int mystery(int a, int b) {
        if (b == 0)
            return 0;
        if (b % 2 == 0) return mystery(a + a, b / 2);
        return mystery(a + a, b / 2) + a;
    }

    public static int mystery1(int a, int b) {
        if (b == 0)
            return 1;
        if (b % 2 == 0) return mystery1(a * a, b / 2);
        return mystery1(a * a, b / 2) * a;
    }

}
