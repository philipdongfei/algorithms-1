import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

/**
 * 1.1.28 Remove duplicates.
 * Modify the test client in BinarySearch to remove any duplicate keys in the whitelist after the sort.
 */
public class Ex_1_1_28 {

    public static int rank(int key, int[] a)
    { // Array must be sorted.
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi)
        { // Key is in a[lo..hi] or not present.
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else return mid;
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int[] whitelist = removeDuplicates(new In(args[0]).readAllInts());
        Arrays.sort(whitelist);
        while (!StdIn.isEmpty()) { // Read key, print if not in whitelist.
            int key = StdIn.readInt();
            if (rank(key, whitelist) < 0)
                StdOut.println(key);
        }
    }

    // remove duplicates without Set
    private static int[] removeDuplicates(int[] ints) {
        if (ints == null || ints.length <= 0) {
            return new int[] {};
        }
        boolean[] bools = new boolean[ints.length];
        for (int i = 0; i < ints.length; i++) {
            boolean found = false;
            for (int j=0; j<i && !found; j++) {
                if (ints[i] == ints[j]) {
                    found = true;
                }
            }
            bools[i] = !found;
        }
        int count = 0;
        for(int i = 0; i < ints.length; i++)
            if (bools[i]) count++;
        int[] result = new int[count];
        int counter = 0;
        for (int i = 0; i < ints.length; i++) {
            if (bools[i]) {
                result[counter++] = ints[i];
            }
        }
        return result;
    }

}
