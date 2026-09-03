package demo.RECURSION;

public class BinarySearchusingRECURSION {
    static void main(String[] args) {
        int[]arr = {1, 3, 9 , 49 , 59, 60 , 88 , 90};
        int target = 90 ;
//        int target = 99 ;   // give -1

        System.out.println(search(arr , target , 0, arr.length-1));

    }
    static int search(int[]arr , int target , int s , int e){
        if(s>e){
            return -1;
        }
        int m = s+(e-s)/2;

        if(arr[m] == target){
            return m;
        }

        if(target < arr[m]){
            e = m -1 ;
            return  search(arr, target , s,m-1 );
        }
        // else case(if(target > arr[m]))
        return search(arr,target , m+1 , e );
    }
}
