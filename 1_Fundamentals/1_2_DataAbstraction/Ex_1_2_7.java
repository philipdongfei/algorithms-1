import edu.princeton.cs.algs4.StdOut;

/**
 * 1.2.7 What does the following recursive function return?
 *
 * public static String mystery(String s) {
 *      int N = s.length();
 *      if (N <= 1) return s;
 *      String a = s.substring(0, N/2);
 *      String b = s.substring(N/2, N);
 *      return mystery(b) + mystery(a);
 * }
 *
 * @author <a href="mailto:piotr@piotrovski.com">Piotr Piotrowski</a>
 */
public class Ex_1_2_7 {

    public static void main(String[] args) {
        // function mystery returns as expected - reverse string
        StdOut.println(mystery("mystery"));
    }

    public static String mystery(String s) {
        int N = s.length();
        if (N <= 1) return s;
        String a = s.substring(0, N/2);
        String b = s.substring(N/2, N);
        return mystery(b) + mystery(a);
    }

}
