package demo.ArrayMatrix;

import java.util.Scanner;

public class Add2dArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n;
        System.out.println("Enter the no. of rows: ");
        m = sc.nextInt();
        System.out.println("Enter the no. of column: ");
        n = sc.nextInt();
        int[][] arr1 = new int[m][n];
        int[][] arr2 = new int[m][n];
        int[][] SumArr = new int[m][n];
        System.out.println("enter elements in 1st array: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println("enter elements in 2nd array: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                SumArr[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        System.out.println("Sum of two array is: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(SumArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}