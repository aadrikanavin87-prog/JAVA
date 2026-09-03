package demo.ArrayMatrix;

import java.util.Scanner;

public class Implementationof2Darr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m ,n;
        System.out.println("Enter the no. of rows: ");
        m = sc.nextInt();
        System.out.println("Enter the no. of column: ");
        n = sc.nextInt();
        int[][] arr = new int[m][n];
        System.out.println("enter elements in 2d array: ");
        for(int i =0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(" 2d array is: ");
        for(int i =0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
