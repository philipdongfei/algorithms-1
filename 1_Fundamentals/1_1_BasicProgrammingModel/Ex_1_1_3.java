/**
 * 1.1.3 Write a program that takes three integer command-line arguments and prints
 * equal if all three are equal, and not equal otherwise.
 */
public class Ex_1_1_3 {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println(false);
            System.exit(0);
        }
        if (Integer.valueOf(args[0]).equals(Integer.valueOf(args[1]))
                && Integer.valueOf(args[1]).equals(Integer.valueOf(args[2]))) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}