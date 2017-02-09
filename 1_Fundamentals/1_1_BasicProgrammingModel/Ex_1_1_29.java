import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

/**
 * 1.1.29 Equal keys.
 * Add to BinarySearch a static method rank() that takes a key
 * and a sorted array of int values (some of which may be equal) as arguments
 * and returns the number of elements that are smaller than the key
 * and a similar method count()
 * that returns the number of elements equal to the key.
 *
 * Note : If i and j are the values returned by rank(key, a) and count(key, a) respectively,
 * then a[i..i+j-1] are the values in the array that are equal to key
 *
 * @author <a href="mailto:piotr@piotrovski.com">Piotr Piotrowski</a>
 */
public class Ex_1_1_29 {

    public static int rank(int key, int[] elements) {
        int result = 0;
        for (int element: elements) {
            if (element < key) {
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] list = new In(args[0]).readAllInts();
        Arrays.sort(list);
        int key = 48;
        int countSmaller = rank(key, list);
        int countEqual = count(key, list);
        for (int i = countSmaller; i<= countSmaller + countEqual - 1; i++) {
            StdOut.println(i + " " + list[i]);
        }
    }

    private static int count(int key, int[] elements) {
        int result = 0;
        for (int element: elements) {
            if (element == key) {
                result++;
            }
        }
        return result;
    }
}
