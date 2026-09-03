package demo.Array;

public class practice {
    public static void main(String[] args) {
        //array is shorted or not
        int []arr = {1,39,499,4989,70};
        boolean isSorted = true;
        for(int i=0;i<arr.length-1 ;i++){
            if(arr[i]>arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("array is sorted");
        }else{
            System.out.println("array is not sorted");
        }
    }
}
