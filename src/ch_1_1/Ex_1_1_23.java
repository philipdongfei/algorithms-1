package ch_1_1;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;


/**
 * 1.1.23 Add to the BinarySearch test client the ability to respond to a second argu-
 * ment: + to print numbers from standard input that are not in the whitelist, - to print
 * numbers that are in the whitelist.
 */
public class Ex_1_1_23 {

    public static int rank(int key, int[] a) { // Array must be sorted.
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) { // Key is in a[lo..hi] or not present.
            int mid = lo + (hi - lo) / 2;
            if
                    (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else
                return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        In inWhitelist = new In(args[0]);
        int[] whitelist = inWhitelist.readAllInts();
        Arrays.sort(whitelist);
        while (!StdIn.isEmpty()) { // Read key, print if not in whitelist.
            int key = StdIn.readInt();
//            printKey(whitelist, printInWhitelist, key);
        }
    }

    private static boolean getPrintInWhiteList(String input) {
        switch (input) {
            case "+":
                return false;
            case "-":
                return true;
            default:
                throw new IllegalArgumentException("second arg must be + or -");
        }
    }

    private static void printKey(int[] whitelist, boolean printInWhitelist, int key) {
        final boolean isInWhitelist = (rank(key, whitelist) < 0);
        if (isInWhitelist && printInWhitelist) {
            StdOut.println(key);
        } else if (!isInWhitelist && !printInWhitelist){
            StdOut.println(key);
        }
    }
}