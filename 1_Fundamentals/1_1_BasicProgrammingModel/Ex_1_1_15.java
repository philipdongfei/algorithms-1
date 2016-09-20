/**
 * 1.1.15 Write a static method histogram() that takes an array a[] of int values and
 * an integer M as arguments and returns an array of length M whose i th entry is the num-
 * ber of times the integer i appeared in the argument array. If the values in a[] are all
 * between 0 and M–1 , the sum of the values in the returned array should be equal to
 * a.length .
 */
public class Ex_1_1_15 {

    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 4, 4, 2, 1, 0, 0};
        int M = 5;
        int[] output = histogram(values, M);

        checkResult(values, output);

        int[] values1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        output = histogram(values1, M);
        checkResult(values1, output);
    }

    private static void checkResult(int[] values, int[] output) {
        int count = 0;
        for (int value : output) {
            System.out.print(value + " ");
            count += value;
        }
        System.out.println();
        System.out.println("values.length == count is " + (values.length == count));
    }

    private static int[] histogram(int[] values, int M) {
        int[] result = new int[M];
        for (int value : values) {
            if (value >= M) continue;
            result[value]++;
        }
        return result;
    }

}
