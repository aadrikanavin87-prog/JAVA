package demo.LeetcodeQS;

import java.util.Arrays;

class MissingPositive {

//    same qs to find missing no. in a fixed range of array

//    leetcode qs.41
//    https://leetcode.com/problems/first-missing-positive/?envType=problem-list-v2&envId=array

    public static void main(String[] args) {
        int[] arr = {1,-1, 3, 4, 5};
        System.out.println(firstMissingPositive(arr));
    }

    public static int firstMissingPositive(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctindex = arr[i] - 1;
            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correctindex]) {
                swap(arr, i, correctindex);
            } else {
                i++;
            }
        }
        // search for  missing no.
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                return index + 1;
            }
        }
        //case 2
        return arr.length + 1;


    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
