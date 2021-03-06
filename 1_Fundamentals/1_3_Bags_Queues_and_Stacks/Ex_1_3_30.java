/**
 * 1.3.30
 * Write a function that takes the first Node in a linked list as argument and (destructively) reverses the list,
 * returning the first Node in the result.
 *
 * Iterative solution: To accomplish this task, we maintain references to three consecutive nodes in the linked list,
 * reverse, first, and second. At each iteration, we extract the node first from the original linked list
 * and insert it at the beginning of the reversed list.
 * We maintain the invariant that first is the first node of what’s left of the original list,
 * second is the second node of what’s left of the original list,
 * and reverse is the first node of the resulting reversed list.
 *
 *  public Node reverse(Node x) {
 *      Node first = x;
 *      Node reverse = null;
 *      while (first != null) {
 *          Node second = first.next;
 *          first.next = reverse;
 *          reverse = first;
 *          first = second;
 *      }
 *      return reverse;
 *  }
 *
 * When writing code involving linked lists, we must always be careful to properly handle the exceptional cases
 * (when the linked list is empty, when the list has only one or two nodes)
 * and the boundary cases (dealing with the first or last items).
 * This is usually much trickier than handling the normal cases.
 *
 * Recursive solution: Assuming the linked list has N nodes, we recursively reverse the last N – 1 nodes,
 * and then carefully append the first node to the end.
 *
 *  public Node reverse(Node first) {
 *      if (first == null) return null;
 *      if (first.next == null) return first;
 *      Node second = first.next;
 *      Node rest = reverse(second);
 *      second.next = first;
 *      first.next = null;
 *      return rest;
 *  }
 *
 * @author <a href="mailto:piotr@piotrovski.com">Piotr Piotrowski</a>
 */
public class Ex_1_3_30 {

    public static void main(String[] args) {
    }
}
