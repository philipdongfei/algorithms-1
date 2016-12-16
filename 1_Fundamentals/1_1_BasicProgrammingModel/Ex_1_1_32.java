import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdStats;

/**
 * 1.1.32 Histogram.
 * Suppose that the standard input stream is a sequence of double values.
 * Write a program that takes an integer N and two double values l and r from the command line
 * and uses StdDraw to plot a histogram of the count of the numbers in the standard input stream
 * that fall in each of the N intervals defined by dividing (l , r) into N equal-sized intervals.
 */
public class Ex_1_1_32 {

    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        double l = Double.parseDouble(args[1]);
        double r = Double.parseDouble(args[2]);
        System.out.println("N=" + N + " l=" + l + " r=" + r);

        double[] values = StdIn.readAllDoubles();

        drawHistogram(N, l, r, values);
    }

    private static void drawHistogram(int N, double l, double r, double[] values) {
        int[] counts = new int[N+1];
        for (double value: values) {
            if (value <= r && value >= l) {
                counts[getInteval(value, N, l, r)]++;
            }
        }
        int maxCount = StdStats.max(counts);

        double w = (r - l) / N;
        double rw = 0.5 * w;

        StdDraw.setCanvasSize(1024, 512);
        StdDraw.setXscale(l, r+w);
        StdDraw.setYscale(0, maxCount);

        for (int i = 0; i <= N; i++) {
            double x = l + (i + 0.5) * w,
                    y = counts[i] / 2.0,
                    rh = counts[i] / 2.0;
            StdDraw.filledRectangle(x, y, rw, rh);
        }
    }

    private static int getInteval(double value, int N, double l, double r) {
        return (int) (N*(value - l)/(r-l));
    }

}
