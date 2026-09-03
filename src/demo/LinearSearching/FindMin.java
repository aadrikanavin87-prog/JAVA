package demo.LinearSearching;

public class FindMin {
    public static void main(String[] args) {
        // USING FUNCTION
        int []arr = {10,30,48,49,50,-2,3,45};
        System.out.println(min(arr));
    }
    // assume arr.length !=0
    // return minimun value in the array
    static int min (int[]arr){
        int ans = arr[0];
        for( int i=0; i<arr.length;i++){
            if(arr[i]<ans) {
                ans = arr[i];
            }
        }
        return ans;
    }
}
