package demo.ArrayMatrix;

public class Sum {
    public static void main(String[] args) {
//        Q. individual sum of row and individual sum of column
        int[][] arr = {
                {2,4,3},
                {3,6,8},
                {2,6,9}
        };
        int n = 3;


        System.out.println("Row sums:");
        for(int i=0;i<3;i++){
            int RowSum = 0;
            for(int j=0;j<3;j++){
                RowSum = RowSum + arr[i][j];
            }
            System.out.println("Row " + (i + 1) + " = " + RowSum);
        }

        System.out.println("Column sums:");
        for(int i=0;i<3;i++){
            int ColSum = 0;
            for(int j=0;j<3;j++){
                ColSum = ColSum + arr[i][j];
            }
            System.out.println("Column" + (i + 1) + " = " + ColSum);
        }
    }
}
