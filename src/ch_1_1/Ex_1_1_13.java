package ch_1_1;

/**
 * 1.1.13 Write a code fragment to print the transposition (rows and columns changed)
 * of a two-dimensional array with M rows and N columns.
 */
public class Ex_1_1_13 {

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        int[][] transposedMatrix = transposeMatrix(matrix);
        printMatrix(matrix);
        printMatrix(transposedMatrix);
    }

    private static int[][] transposeMatrix(int[][] matrix) {
        if (matrix.length <= 0) {
            throw new IllegalArgumentException("param must be matrix");
        }
        int[][] transposedMatrix = new int[matrix[0].length][matrix.length];
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                transposedMatrix[column][row] = matrix[row][column];
            }
        }
        return transposedMatrix;
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

}
