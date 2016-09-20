/**
 * 1.1.14 Write a static method lg() that takes an int value N as argument and returns
 * the largest int not larger than the base-2 logarithm of N . Do not use Math .
 */
public class Ex_1_1_14 {

    public static void main(String[] args) {
        System.out.println("lg(1) == 0 is " + (lg(1) == 0));
        System.out.println("lg(2) == 1 is " + (lg(2) == 1));
        System.out.println("lg(3) == 1 is " + (lg(3) == 1));
        System.out.println("lg(15) == 3 is " + (lg(15) == 3));
        System.out.println("lg(16) == 4 is " + (lg(16) == 4));
        System.out.println("lg(17) == 4 is " + (lg(17) == 4));
        System.out.println("lg(255) == 7 is " + (lg(255) == 7));
    }

    private static int lg(int n) {
        int result = 0, pow_2 = 1;
        while ((pow_2 *= 2) <= n) {
            result++;
        }
        return result;
    }

}
