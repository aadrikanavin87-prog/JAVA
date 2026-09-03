package demo.LeetcodeQS;

public class DuplicateNO {
    public static void main (String[] args){
        int[] arr = {1,4,3,2,3,5,3};
        System.out.println(findDuplicate(arr));

    }

    // qs.287
    //https://leetcode.com/problems/find-the-duplicate-number/?envType=problem-list-v2&envId=array
    public static  int findDuplicate(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if(arr[i]!=i+1) {
                int correct = arr[i] -1 ;
                if (arr[i] != arr[correct]) {
                    swap(arr, i, correct);
                } else {
                    return arr[i];
                }
            }else {
                i++;
            }
        }
        return -1 ;
    }

    static void swap(int[]arr , int first , int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
