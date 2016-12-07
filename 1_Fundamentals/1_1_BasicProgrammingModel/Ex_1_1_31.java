import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdRandom;

import java.awt.*;

/**
 * 1.1.31 Random connections.
 * Write a program that takes as command-line arguments
 * an integer N
 * and a double value p (between 0 and 1),
 * plots N equally spaced dots of size .05 on the circumference of a circle,
 * and then,
 * with probability p for each pair of points, draws a gray line connecting them.
 */
public class Ex_1_1_31 {

    public static void main(String[] args) {
        int N = StdIn.readInt();
        double p = Math.max(0, Math.min(1, StdIn.readDouble()));
        plot(N, p);
    }

    private static void plot(int n, double p) {
        StdDraw.setCanvasSize(500, 500);
        StdDraw.setXscale(-1.1, 1.1);
        StdDraw.setYscale(-1.1, 1.1);
        StdDraw.setPenRadius(0.05);

        // table with points
        double[][] points = new double[n][2];

        // calculates points
        for (int i=0; i<n; i++) {
            double angle = 2 * Math.PI * i / n;
            points[i][0] = Math.sin(angle);
            points[i][1] = Math.cos(angle);
            StdDraw.point(points[i][0], points[i][1]);
        }
        StdDraw.setPenRadius(0.001);
        StdDraw.setPenColor(Color.GRAY);

        // randomly draw lines between points depending on given probability
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if (i!=j && StdRandom.bernoulli(p)) {
                    StdDraw.line(points[i][0], points[i][1], points[j][0], points[j][1]);
                }
            }
        }
    }

}
