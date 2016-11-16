import edu.princeton.cs.algs4.StdOut;

/**
 * Binomial distribution.
 * Estimate the number of recursive calls that would be used by the code
 *
 * public static double binomial(int N, int k, double p) {
 *     if ((N == 0) || (k < 0)) return 1.0;
 *     return (1.0 - p)*binomial(N-1, k) +  p*binomial(N-1, k-1);
 * }
 *
 * to compute binomial(100, 50).
 * Develop a better implementation that is based on saving computed values in array.
 */
public class Ex_1_1_27 {

    static int count = 0;

    public static void main(String[] args) {
        double result = binomial(100, 50, 0.51);
        StdOut.println(result);
        StdOut.println(count);
    }

    private static double binomial(int N, int k, double p) {
        count++;
        if ((N == 0) || (k < 0)) return 1.0;
        return (1.0 - p) * binomial(N-1, k, p) + p*binomial(N-1, k-1, p);
    }

}
