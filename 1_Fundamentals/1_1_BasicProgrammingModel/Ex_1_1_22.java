import edu.princeton.cs.algs4.StdOut;

/**
 * 1.1.22 Write a version of BinarySearch that uses the recursive rank() given on page
 * 25 and traces the method calls. Each time the recursive method is called, print the argu-
 * ment values lo and hi , indented by the depth of the recursion. Hint: Add an argument
 * to the recursive method that keeps track of the depth.
 *
 * @author <a href="mailto:piotr@piotrovski.com">Piotr Piotrowski</a>
 */
public class Ex_1_1_22 {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 7, 8, 9, 10};
        int key = 9;
        StdOut.println("result = " + rank(key, a));
    }

    public static int rank(int key, int[] a) {
        return rank(key, a, 0, a.length - 1, 1);
    }

    private static int rank(int key, int[] a, int lo, int hi, int depth) {
        StdOut.println("lo = " + lo + ", hi = " + hi + ", depth = " + depth);

        // Index of key in a[], if present, is not smaller than lo and not larger than hi.
        if (lo > hi) {
            return -1;
        }
        int mid = lo + (hi - lo) / 2;
        if (key < a[mid]) {
            return rank(key, a, lo, mid - 1, ++depth);
        } else if (key > a[mid]) {
            return rank(key, a, mid + 1, hi, ++depth);
        } else {
            return mid;
        }
    }

}
