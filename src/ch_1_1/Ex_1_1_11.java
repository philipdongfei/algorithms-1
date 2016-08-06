package ch_1_1;

/**
 * 1.1.11 Write a code fragment that prints the contents of a two-dimensional boolean
 * array, using * to represent true and a space to represent false . Include row and column
 * numbers.
 */
public class Ex_1_1_11 {

    public static void main(String[] args) {
        boolean[][] boleanTable = new boolean[10][10];
        printBooleanTable(boleanTable);
    }

    private static void printBooleanTable(boolean[][] boleanTable) {
        for (int row = 0; row < boleanTable.length; row++) {
            for (int column = 0; column < boleanTable[row].length; column++) {
                if (boleanTable[row][column]) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
