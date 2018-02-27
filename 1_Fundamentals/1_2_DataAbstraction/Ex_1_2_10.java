/**
 * 1.2.10
 * Develop a class VisualCounter that allows both increment and decrement
 * operations. Take two arguments N and max in the constructor, where N specifies the
 * maximum number of operations and max specifies the maximum absolute value for
 * the counter. As a side effect, create a plot showing the value of the counter each time its
 * tally changes.
 *
 * @author <a href="mailto:piotr@piotrovski.com">Piotr Piotrowski</a>
 */
public class Ex_1_2_10 {

    public static void main(String[] args) {

    }

}

class VisualCounter {

    private final int N;
    private final int max;
    private final String name;
    private int count = 0;

    public VisualCounter(String name, int N, int max) {
        this.N = N;
        this.max = max;
        this.name = name;
    }

    public void increment() {
        count++;
    }

    public void decrement(){
        count--;
    }

    public int tally() {
        return count;
    }

    public String toString() {
        return count + " " + name;
    }

}