/**
 * 1.1.10 What is wrong with the following code fragment?
 * int[] a;
 * for (int i = 0; i < 10; i++)
 * a[i] = i * i;
 * Solution: It does not allocate memory for a[] with new . This code results in a
 * variable a might not have been initialized compile-time error.
 */
public class Ex_1_1_10 {

    public static void main(String[] args) {
        int[] a;
        // there is lack of allocation memory.
        for (int i = 0; i < 10; i++) {
//            a[i] = i * i;
        }
    }

}
