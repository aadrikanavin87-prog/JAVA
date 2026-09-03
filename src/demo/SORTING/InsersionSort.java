package demo.SORTING;

import java.util.Arrays;

public class InsersionSort {
     public static void main(String[] args) {
         int[]arr ={19,20,30,49,99};
         Insertion(arr);
         System.out.println(Arrays.toString(arr));
     }
    static void Insertion(int[]arr){
         for(int i =0;i< arr.length -1 ; i++){;
             for(int j =i+1 ; j>0 ;j--){
                 if(arr[j]<arr[j-1]){
                     arr[j]=arr[j-1];
                 }else{
                     break;
                 }

             }
         }
    }
}
