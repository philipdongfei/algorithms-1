/**
 * 1.1.2 Give the type and value of each of the following expressions:
 * a. (1 + 2.236)/2
 * b. 1 + 2 + 3 + 4.0
 * c. 4.1 >= 4
 * d. 1 + 2 + "3"
 *
 * @author <a href="mailto:piotr@piotrovski.com">Piotr Piotrowski</a>
 */
public class Ex_1_1_2 {
    public static void main(String[] args) {
        System.out.println("(1 + 2.236)/2 = " + ((1 + 2.236) / 2));
        System.out.println("type of ((1 + 2.236)/2) is " + ((Object) ((1 + 2.236) / 2)).getClass().getName());

        System.out.println("1 + 2 + 3 + 4.0 = " + (1 + 2 + 3 + 4.0));
        System.out.println("type of (1 + 2 + 3 + 4.0) is " + ((Object) (1 + 2 + 3 + 4.0)).getClass().getName());

        System.out.println("4.1 >= 4 = " + (4.1 >= 4));
        System.out.println("type of (4.1 >= 4) is " + ((Object) (4.1 >= 4)).getClass().getName());

        System.out.println("1 + 2 + \"3\" = " + (1 + 2 + "3"));
        System.out.println("type of (1 + 2 + \"3\") is " + ((Object) (1 + 2 + "3")).getClass().getName());

    }
}