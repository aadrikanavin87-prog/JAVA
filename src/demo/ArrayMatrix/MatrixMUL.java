package demo.ArrayMatrix;

public class MatrixMUL {
    public static void main(String[] args) {
//        MATRIX MULTIPLICATION
        int[][] A = {
                {2, 3, 5},
                {3, 5, 7},
                {2, 1, 1}
        };
        int[][] B = {
                {2, 4},
                {2, 5},
                {1, 1}
        };

        int rowA = A.length;
        int colA = A[0].length;
        int rowB = B.length;
        int colB = B[0].length;

        if (colA != rowB) {
            System.out.println("Matrix multiplication is not possible");
            return;
        }
        int[][] C = new int[rowA][colB];

        for (int i = 0; i < rowA; i++) {
            for (int j = 0; j < colB; j++) {
                for (int k = 0; k < colA; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        System.out.println("Resultant Matrix");
        for (int i = 0; i < rowA; i++) {
            for (int j = 0; j < colB; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}
