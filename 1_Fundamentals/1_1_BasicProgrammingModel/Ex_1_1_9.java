/**
 * 1.1.9 Write a code fragment that puts the binary representation of a positive integer N
 * into a String s .
 * Solution: Java has a built-in method Integer.toBinaryString(N) for this job, but
 * the point of the exercise is to see how such a method might be implemented. Here is a
 * particularly concise solution:
 * String s = "";
 * for (int n = N; n > 0; n /= 2)
 * s = (n % 2) + s;
 *
 * @author <a href="mailto:piotr@piotrovski.com">Piotr Piotrowski</a>
 */
public class Ex_1_1_9 {

    public static void main(String[] args) {
        int N = 9;
        System.out.println(toBinaryString(N));
    }

    private static String toBinaryString(int decimalNumber) {
        String s = "";
        int n = decimalNumber;
        while (n > 0) {
            s = (n % 2) + s;
            n = n / 2;
        }
        // or
//        for (int n = decimalNumber; n > 0; n /= 2) {
//            s = (n % 2) + s;
//        }
        return s;
    }

}
