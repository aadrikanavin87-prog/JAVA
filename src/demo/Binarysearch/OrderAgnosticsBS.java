package demo.Binarysearch;


//          this is the situation when we don't know that the given shorted
//         array is in ascending or descending order

public class OrderAgnosticsBS {
     public static void main(String[]args) {
//         int arr[] = { 28,20,19,16,15,12,9,8,4,2,1};
         int arr[] = {1,28,39,40,50,58,90,98,99,110 };
         int target = 28;
         int ans = OrderAgnosticBS(arr, target);     // call the funct.
         System.out.println(ans);
     }

    static int OrderAgnosticBS(int []arr , int target ){
         int start = 0;
         int end = arr.length - 1;

//         find whether the array is sorted in ascending or descending order
         boolean isAsc;
        if (arr[start] < arr[end]){
            isAsc = true;
        }else{
            isAsc = false;
        }

        while (start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                return mid ;
            }
            if(isAsc){
                if(target < arr[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }else{
                if(target < arr[mid]){
                    start = mid + 1 ;
                }else{
                    end = mid - 1 ;
                }
            }
        }
        return -1;
     }

}
