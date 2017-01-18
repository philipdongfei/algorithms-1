import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

/**
 * 1.1.35 Dice simulation.
 * The following code computes the exact probability distribution for the sum of two dice:
 * <p>
 * int SIDES = 6;
 * double[] dist = new double[2*SIDES+1];
 * for (int i = 1; i <= SIDES; i++)
 * for (int j = 1; j <= SIDES; j++)
 * dist[i+j] += 1.0;
 * for (int k = 2; k <= 2*SIDES; k++)
 * dist[k] /= 36.0;
 * <p>
 * The value dist[i] is the probability that the dice sum to k.
 * Run experiments to validate this calculation simulating N dice throws,
 * keeping track of the frequencies of occurrence of each value
 * when you compute the sum of two random integers between 1 and 6.
 * How large does N have to be before your empirical results match
 * the exact results to three decimal places?
 *
 * @author <a href="mailto:piotr@piotrovski.com">Piotr Piotrowski</a>
 */
public class Ex_1_1_35 {

    private static int SIDES = 6;

    public static double[] calculateExactValue() {
        double[] dist = new double[2 * SIDES + 1];
        for (int i = 1; i < SIDES; i++) {
            for (int j = 1; j < SIDES; j++) {
                dist[i + j] += 1.0;
            }
        }
        for (int k = 2; k <= 2 * SIDES; k++) {
            dist[k] /= SIDES * SIDES;
        }
        return dist;
    }

    private static int throwDice() {
        return StdRandom.uniform(1, SIDES + 1) + StdRandom.uniform(1, SIDES + 1);
    }

    public static double[] getExperiment(int N) {
        double[] dist = new double[2 * SIDES + 1];
        for (int i = 1; i < N; i++) {
            dist[throwDice()] += 1.0;
        }
        for (int k = 2; k <= 2; k++) {
            dist[k] /= SIDES * SIDES;
        }
        return dist;
    }

    public static void main(String[] args) {
        final int N = Integer.parseInt(args[0]);

        double[] exact = calculateExactValue();
        double[] experiment = getExperiment(N);

        for (int i = 1; i<= 2*SIDES; i++) {
            StdOut.printf("%7d  ", i);
            StdOut.printf("%7.3e  ", exact[i]);
            StdOut.printf("%7.3e\n", experiment[i]);
        }
    }

}
