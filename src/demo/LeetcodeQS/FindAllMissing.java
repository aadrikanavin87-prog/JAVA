package demo.LeetcodeQS;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/?envType=problem-list-v2&envId=array
// asked by Google
// qs. no. 448
class FindAllMissing {
    public List<Integer> findDisappearedNumbers(int[] arr) {
        int i=0 ;
        while(i<arr.length){
            int correctindex = arr[i] - 1;
            if(arr[i] != arr[correctindex]){
                swap(arr , i , correctindex);
            }else{
                i++;
            }

        }
        //just find missing numbers
        List<Integer>ans = new ArrayList<>();
        for(int index =0; index<arr.length ; index++){
            if(arr[index] != index+1){
               ans.add(index+1);
            }
        }
        return ans;
    }
     static void swap(int[]arr ,int first , int second){
        int temp =arr[first];
        arr[first] = arr[second];
        arr[second]= temp;
    }
}
