import edu.princeton.cs.algs4.*;

/**
 * 1.2.3 Write an Interval2D client that takes command-line arguments N, min, and max
 * and generates N random 2D intervals whose width and height are uniformly distributed
 * between min and max in the unit square. Draw them on StdDraw and print the number
 * of pairs of intervals that intersect and the number of intervals that are contained in one
 * another.
 *
 * @author <a href="mailto:piotr@piotrovski.com">Piotr Piotrowski</a>
 */
public class Ex_1_2_3 {

    public static void main(String[] args) {
        int N = StdIn.readInt();
        double min = StdIn.readDouble();
        double max = StdIn.readDouble();
        Interval1D[] interval1DSX = new Interval1D[N];
        Interval1D[] interval1DSY = new Interval1D[N];

        for (int i=0; i<N; i++) {
            double width = StdRandom.uniform(min, max);
            double height = StdRandom.uniform(min, max);
            interval1DSX[i] = new Interval1D(0.5-width/2, 0.5+width/2);
            interval1DSY[i] = new Interval1D(0.5-height/2, 0.5+height/2);
            new Interval2D(interval1DSX[i], interval1DSY[i]).draw();
        }

        Counter intersect = new Counter("intersect");
        Counter contain = new Counter("contain");
        for (int i=0; i<N; i++) {
            for (int j=i+1; j<N; j++) {
                if (new Interval2D(interval1DSX[i], interval1DSY[i]).intersects(new Interval2D(interval1DSX[j], interval1DSY[j]))) {
                    intersect.increment();
                }
            }
            for (int j=0; j<N; j++) {
                if (interval1DSX[i].min() < interval1DSX[j].min()
                        && interval1DSY[i].min() < interval1DSY[j].min()
                        && interval1DSX[i].max() > interval1DSX[j].max()
                        && interval1DSY[i].max() > interval1DSY[j].max()
                        ) {
                    contain.increment();
                }
            }
        }
        StdOut.println(intersect);
        StdOut.println(contain);
    }

}