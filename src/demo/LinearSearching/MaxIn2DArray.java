package demo.LinearSearching;

public class MaxIn2DArray {
    public static void main(String[] args) {
        int [][]arr = {
                {23,59,40},  //(0,0) , (0,1), (0,2)
                {19,30,48,50},  // (1,0), (1,1),(1,2),(1,3)
                {20,49},
                {4,60,38}
        };
        System.out.println(max(arr));
    }
    static int max (int [][] arr){
        int max = arr[0][0];
        for(int i =0;i<arr.length; i++){
            for(int j =0;j<arr[i].length ; j++){
                if(arr[i][j]>max){
                    max= arr[i][j];
                }
            }
        }
        return max;
    }
}
