import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * 1.2.6 A string s is a circular rotation of a string t if it matches when the characters
 * are circularly shifted by any number of positions; e.g., ACTGACG is a circular shift of
 * TGACGAC, and vice versa. Detecting this condition is important in the study of genomic
 * sequences. Write a program that checks whether two given strings s and t are circular
 * shifts of one another.
 *
 * Hint : The solution is a one-liner with indexOf(), length(), and string concatenation.
 *
 * @author <a href="mailto:piotr@piotrovski.com">Piotr Piotrowski</a>
 */
public class Ex_1_2_6 {

    public static void main(String[] args) {
        String s = StdIn.readString();
        String t = StdIn.readString();

        StdOut.println(checkCircularRotation(s, t));
    }

    private static boolean checkCircularRotation(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        for (int i=0; i<s.length(); i++) {
            String concat = s.substring(i, s.length()).concat(s.substring(0, i));
            if (t.contains(concat)) {
                return true;
            }
        }
        return false;
    }

}
