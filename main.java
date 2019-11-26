import cracking.chapter1.test.*;
public class main {
    public static void main(String[] args) {
        UnitTest.runTests();
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0 ; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
