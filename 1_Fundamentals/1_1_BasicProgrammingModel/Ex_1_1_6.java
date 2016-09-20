import edu.princeton.cs.algs4.StdOut;

/**
 * 1.1.6 What does the following program print?
 * int f = 0;
 * int g = 1;
 * for (int i = 0; i <= 15; i++)
 * {
 * StdOut.println(f);
 * f = f + g;
 * g = f - g;
 * }
 */
public class Ex_1_1_6 {

    public static void main(String[] args) {
        int f = 0;
        int g = 1;
        for (int i = 0; i <= 15; i++) {
            StdOut.println(f);
            f = f + g;
            g = f - g;
        }

        //  output:
        //  1: 0 (f=1,g=0)
        //  2: 1 (f=1,g=1)
        //  3: 1 (f=2,g=1)
        //  4: 2 (f=3,g=2)
        //  5: 3 (f=5,g=3)
        //  6: 5 (f=8,g=5)
        //  7: 8 (f=13,g=8)
        //  8: 13 (f=21,g=13)
        //  9: 21 (f=34,g=21)
        // 10: 34 (f=55,g=34)
        // 11: 55 (f=89,g=55)
        // 12: 89 (f=144,g=89)
        // 13: 144 (f=233,g=144)
        // 14: 233 (f=377,g=233)
        // 15: 377 (f=610,g=377)
        // 16: 610 (f=987,g=610)
    }

}
