package demo.Array;

import java.util.Scanner;

public class multidimensionpractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = 2, col=3;
        int [][]sum = new int[2][3];
        int[][] A = new int[2][3];
        int[][] B = new int[2][3];
//        input first matrix.
        System.out.println("enter elements of matrix A(2*3 ): ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                A[i][j]=sc.nextInt();
            }
        }
//        input second matrix.
        System.out.println("enter the value of matrix B: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                B[i][j]=sc.nextInt();
            }
        }
//        add matrices
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++){
                sum[i][j] = A[i][j] + B[i][j];
            }
        }
//        display result
        System.out.println("sum of the matrics is : ");
         for (int i = 0; i < 2; i++) {
             for (int j = 0; j < 3; j++) {
                 System.out.print(sum[i][j] + " ");
             }
                System.out.println();
         }
         sc.close();
    }
}
