import edu.princeton.cs.algs4.Point2D;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

/**
 * 1.2.1 Write a Point2D client that takes an integer value N from the command line,
 * generates N random points in the unit square, and computes the distance separating
 * the closest pair of points.
 *
 * @author <a href="mailto:piotr@piotrovski.com">Piotr Piotrowski</a>
 */
public class Ex_1_2_1 {

    public static void main(String[] args) {
        int N = StdIn.readInt();
        Point2D[] points = new Point2D[N];
        for (int i=0; i<N; i++) {
            points[i] = new Point2D(StdRandom.uniform(), StdRandom.uniform());
        }
        double minDistance = 1.0;
        for (int i=0; i<N; i++) {
            for (int j=i+1;j<N; j++) {
                double distance = points[i].distanceTo(points[j]);
                if (distance < minDistance) {
                    minDistance = distance;
                }
            }
        }
        for (int i=0; i<N; i++) {
            StdOut.println(points[i]);
        }
        StdOut.println(minDistance);

    }

}