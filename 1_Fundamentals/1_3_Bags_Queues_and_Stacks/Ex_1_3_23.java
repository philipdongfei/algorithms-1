/**
 * 1.3.23 Why does the following code fragment not do the same thing as in the previous question?
 *
 *  x.next = t;
 *  t.next = x.next;
 *
 * Answer: When it comes time to update t.next, x.next is no longer the original node following x,
 * but is instead t itself!
 *
 * @author <a href="mailto:piotr@piotrovski.com">Piotr Piotrowski</a>
 */
public class Ex_1_3_23 {

    public static void main(String[] args) {
    }

}