import edu.princeton.cs.algs4.StdOut;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * 1.3.14
 * Develop a class ResizingArrayQueueOfStrings that implements the queue abstraction with a fixed-size array,
 * and then extend your implementation to use array resizing to remove the size restriction.
 *
 * @author <a href="mailto:piotr@piotrovski.com">Piotr Piotrowski</a>
 */
public class Ex_1_3_14 {

    public static void main(String[] args) {
        ResizingArrayQueueOfStrings queue = new ResizingArrayQueueOfStrings();

        StdOut.println(queue.size());
        queue.enqueue("first");
        StdOut.println(queue.size());
        queue.enqueue("second");
        StdOut.println(queue.size() + " " + queue.dequeue());
        queue.enqueue("third");
        StdOut.println(queue.size());
        queue.enqueue("fourth");
        StdOut.println(queue.size() + " " + queue.dequeue());
        StdOut.println(queue.size() + " " + queue.dequeue());
        StdOut.println(queue.size() + " " + queue.dequeue());
    }

}

class ResizingArrayQueueOfStrings implements Iterable<String> {

    private int first;
    private int last;
    private int n;

    private String[] a;

    public ResizingArrayQueueOfStrings() {
         a = new String[2];
         first = 0;
         last = 0;
         n = 0;
    }

//    public ResizingArrayQueueOfStrings(int capacity) {
//         a = new String[capacity];
//         first = 0;
//         last = 0;
//         n = 0;
//    }

    void enqueue(String item) {
        if (n == a.length) {
            resize(2*a.length);
        }
        a[last++] = item;
        if (last == a.length) {
            last = 0;
        }
        n++;
    }

    private void resize(int capacity) {
        String[] temp = new String[capacity];
        for (int i = 0; i < n; i++) {
            temp[i] = a[(first+i) % a.length];
        }
        a = temp;
        first = 0;
        last = n;
    }

    String dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        String item = a[first];
        a[first] = null;
        n--;
        first++;
        if (first == a.length) {
            first = 0;
        }
        if ( n > 0 && n == a.length/4) {
            resize(a.length/2);
        }
        return item;
    }

    boolean isEmpty() {
        return n == 0;
    }

    int size() {
        return n;
    }

    @Override
    public Iterator<String> iterator() {
        return new ArrayIterator();
    }

    private class ArrayIterator implements Iterator<String> {
        int i = 0;
        @Override
        public boolean hasNext() {
            return i < n;
        }

        @Override
        public String next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            String item = a[(i+first)%a.length];
            i++;
            return item;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }

    }
}
