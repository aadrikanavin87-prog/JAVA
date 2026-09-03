package demo.RECURSION;

import java.util.ArrayList;

// SEARCH ELEMENT whether it is present or not in an array using Recursion??
public class LinearSearch {
    public static void main(String[] args) {
        int []arr={3,9,4,90,99,99,89};
        System.out.println(Search(arr, 999, 0));
        System.out.println(findindex(arr , 999, 0));
        System.out.println(findindexLast(arr,999, arr.length-1));
         findALLindex(arr,999,0) ;
        System.out.println(list);

    }
//    whether target element is present or not
    static boolean Search (int[]arr , int target ,int index){
        if(index == arr.length){
            return false;
        }
        return (arr[index] == target ) ||  Search(arr,target,index+1) ;
    }
//     present at which index
        static int findindex ( int[] arr, int target, int index){
        if (index == -1) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return findindex(arr, target, index + 1);
        }
    }
//   INDEX FROM LAST
        static int findindexLast ( int[] arr, int target, int index){
        if (index == -1) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return findindexLast(arr, target, index - 1);
        }
    }

// If target is present at many indeces and u want to print all index at target is present
        static ArrayList<Integer> list = new ArrayList<>();
        static void findALLindex ( int[] arr, int target, int index){
        if (index == arr.length) {
            return;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        findALLindex(arr, target, index + 1);
    }

}
