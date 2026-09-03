package demo.SORTING;

import java.util.Arrays;
import java.util.Scanner;

public class bubbleSort {
    public static void main(String[]args) {

        //given input
//        int [] arr = {19,38,1,8,29,12};
//        bubbleSort(arr);
//        System.out.println(Arrays.toString(arr));


//         user defined input

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no. of element in an array : ");
        int n = sc.nextInt();

        System.out.println("enter the elements in an array : ");
        int []arr = new int[n];
        for(int i = 0; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("sorted array is : ");
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void bubbleSort(int []arr){
        //run to n-1 times
        for(int i = 0 ; i < arr.length ; i++){
            // for each step , max item will come at last respective index
            for(int j = 1 ; j < arr.length-i ; j++ ){
//          swap if the item is smaller than the previous one
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
}
