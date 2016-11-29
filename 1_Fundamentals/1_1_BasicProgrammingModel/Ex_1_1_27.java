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

    static long count = 0;

    private static double binomial[][] = new double[101][52];

    public static void main(String[] args) {
        double result = binomial(100, 50, 0.51);
        StdOut.println(result);
        StdOut.println(count);
    }

    private static double binomial(int N, int k, double p) {
        count++;
        if (count % 1000000000 == 0)
            StdOut.println(count + " " + N  + " " + k);
        if ((N == 0) || (k < 0)) return 1.0;
        return (1.0 - p) * binomial(N-1, k, p) + p * binomial(N-1, k-1, p);
    }

    private static double betterBinomial(int N, int k, double p) {
        count++;
        StdOut.println(count);
        if ((N == 0) || (k < 0)) return 1.0;
        if (binomial[N-1][k+1] == 0.0) {
            binomial[N-1][k+1] = betterBinomial(N-1, k, p);
        }
        if (binomial[N-1][k] == 0.0) {
            binomial[N-1][k] = betterBinomial(N-1, k-1, p);
        }
        return (1.0 - p) * binomial[N-1][k+1] + p * binomial[N-1][k];
    }

}
