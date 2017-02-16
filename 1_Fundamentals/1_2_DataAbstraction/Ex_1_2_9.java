import edu.princeton.cs.algs4.Counter;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

/**
 * 1.2.9
 * Instrument BinarySearch (page 47) to use a Counter to count the total number
 * of keys examined during all searches and then print the total after all searches are complete.
 *
 * Hint : Create a Counter in main() and pass it as an argument to rank().
 *
 * @author <a href="mailto:piotr@piotrovski.com">Piotr Piotrowski</a>
 */
public class Ex_1_2_9 {

    public static int rank(int key, int[] a, Counter counter)
    { // Array must be sorted.
//        counter.increment();
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi)
        { // Key is in a[lo..hi] or not present.
            counter.increment();
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else return mid;
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int[] whitelist = new In(args[0]).readAllInts();
        Arrays.sort(whitelist);
        Counter counter = new Counter("binary_search counter");
        In in = new In(args[1]);
        while (!in.isEmpty())
        { // Read key, print if not in whitelist.
            int key = in.readInt();
            if (rank(key, whitelist, counter) < 0)
                StdOut.println(key);
        }
        StdOut.println(counter);
    }
}
