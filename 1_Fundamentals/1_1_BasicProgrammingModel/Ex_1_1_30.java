import edu.princeton.cs.algs4.StdOut;

/**
 * 1.1.30 Array exercise.
 * Write a code fragment that
 * creates an N-by-N boolean array a[][] such that a[i][j] is true
 * if i and j are relatively prime (have no common factors), and false otherwise.
 */
public class Ex_1_1_30 {

    private static int gcd(int p, int q) {
        if (q == 0) return p;
        int r = p % q;
        return gcd(q, r);
    }

    public static void main(String[] args) {
        int N = 10;
        boolean[][] array = new boolean[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                int gcd = gcd(i, j);
                if ( i != 0 && j != 0 && i != j && (gcd != i && gcd != j)) {
                    array[i][j] = true;
                }
            }
        }

        for (int i = 0; i<N; i++) {
            for (int j = 0; j<N; j++) {
                StdOut.print("" + (array[i][j] ? 1 : 0) + " ");
            }
            StdOut.println();
        }
    }
}
