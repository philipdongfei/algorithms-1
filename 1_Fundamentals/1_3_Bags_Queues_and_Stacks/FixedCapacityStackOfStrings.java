/**
 * FixedCapacityStackOfString with isFull method.
 *
 * @author <a href="mailto:piotr@piotrovski.com">Piotr Piotrowski</a>
 */
public class FixedCapacityStackOfStrings {

    private final String[] a;   // stack entries
    private int N;              // size

    public FixedCapacityStackOfStrings(int cap) {
        a = new String[cap];
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return N;
    }

    public void push(String item) {
        a[N++] = item;
    }

    public String pop() {
        return a[--N];
    }

    public boolean isFull() {
        return a.length == N;
    }

}
