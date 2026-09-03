package demo.RECURSION;

public class ArraySortingQS {
    public static void main(String[] args) {
//        qs>. check entire is shorted or not using recursion
          int []arr = {1,2,3,9,6,8};
        System.out.println(sorted(arr , 0));
    }
    static  boolean sorted(int[]arr , int index){
        // base condition
        if(index == arr.length-1 ){
            return true ;
        }
        return arr[index] < arr[index + 1] && sorted(arr , index+1);
    }
}
