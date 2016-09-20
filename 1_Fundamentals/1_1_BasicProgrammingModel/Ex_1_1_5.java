/**
 * 1.1.5 Write a code fragment that prints true if the double variables x and y are both
 * strictly between 0 and 1 and false otherwise.
 */
public class Ex_1_1_5 {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.exit(0);
        }
        checkDouble(Double.valueOf(args[0]), Double.valueOf(args[1]));
    }

    public static void checkDouble(double x, double y) {
        if (x > 0 && x < 1 && y > 0 && y < 1) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
