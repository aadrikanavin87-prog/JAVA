package demo.ArrayMatrix;

import java.util.Scanner;

public class IdentityORnot {
//    Check whether the given matrix is idenyity or not
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m ,n;
        System.out.println("Enter the no. of rows:");
        m = sc.nextInt();
        System.out.println("Enter the no. of col:");
        n = sc.nextInt();

        int[][] Mat = new int[m][n];
        System.out.println("Enter the element in matrix");
        for(int i=0;i<m;i++){
            for(int j =0;j<n;j++){
                Mat[i][j] = sc.nextInt();
            }
        }
        boolean isIdentity = true;
        if(m != n){
            isIdentity = false;
        }else{
            for(int i=0;i<m;i++){
                for(int j =0;j<n;j++){
                    if(i==j && Mat[i][j] !=1) {
                        isIdentity=false;
                    }
                    if (i != j  && Mat[i][j] != 0){
                        isIdentity = false;
                    }
                }
            }
        }
        if(isIdentity){
            System.out.println("Identity Matrix");
        }else{
            System.out.println("Not a Identity Matrix");
        }
    }
}
