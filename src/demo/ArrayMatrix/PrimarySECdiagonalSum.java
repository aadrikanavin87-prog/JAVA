package demo.ArrayMatrix;

public class PrimarySECdiagonalSum {
//    Q. to find the sum of primary(where i==j) and secindary(op diagonal of i==j) diagonal
    public static void main(String[] args) {
        int[][] arr = {
                {2,4,3},
                {3,6,8},
                {2,6,9}
        };
        int n =3;
        int sum =0;
        for(int i=0;i<n;i++){
            for(int j =0;j<n;j++){
                if(i == j){  // 2+6+9
                    sum += arr[i][j];
                }
            }
        }
        System.out.println("Sum of primary diagonal is: " +sum);
        int sum1 = 0;
        for(int i=0;i<n;i++){
            for(int j =0;j<n;j++){
                if(j == n-i-1){     // 3+6+2
                    sum1 += arr[i][j];
                }
            }
        }
        System.out.println("Sum of secondary diagonal is: " +sum1);
    }
}
