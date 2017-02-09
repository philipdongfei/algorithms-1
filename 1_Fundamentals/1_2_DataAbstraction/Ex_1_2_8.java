/**
 * 1.2.8 Suppose that a[] and b[] are each integer arrays consisting of millions of integers.
 * What does the follow code do? Is it reasonably efficient?
 *      int[] t = a; a = b; b = t;
 *
 * Answer.
 * It swaps them. It could hardly be more efficient because it does so by copying
 * references, so that it is not necessary to copy millions of elements.
 *
 * @author <a href="mailto:piotr@piotrovski.com">Piotr Piotrowski</a>
 */
public class Ex_1_2_8 {

    public static void main(String[] args) {
    }

}
