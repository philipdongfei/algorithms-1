package ch_1_1;

/**
 * 1.1.8 What do each of the following print?
 * a. System.out.println('b');
 * b. System.out.println('b' + 'c');
 * c. System.out.println((char) ('a' + 4));
 * Explain each outcome.
 */
public class Ex_1_1_8 {

    public static void main(String[] args) {
        System.out.println('b'); // letter b
        System.out.println('b' + 'c'); // sum of representation 'b' and 'c' = 197
        System.out.println((char) ('a' + 4)); // letter e
    }

}
