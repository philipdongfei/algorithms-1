/**
 * 1.2.5 What does the following code fragment print?
 *
 *      String s = "Hello World";
 *      s.toUpperCase();
 *      s.substring(6, 11);
 *      StdOut.println(s);
 *
 * Answer : "Hello World". String objects are immutable—string methods return
 * a new String object with the appropriate value (but they do not change the value
 * of the object that was used to invoke them). This code ignores the objects returned
 * and just prints the original string. To print "WORLD", use s = s.toUpperCase() and
 * s = s.substring(6, 11).
 *
 * @author <a href="mailto:piotr@piotrovski.com">Piotr Piotrowski</a>
 */
public class Ex_1_2_5 {

    public static void main(String[] args) {
    }

}
