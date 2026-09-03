package demo.Binarysearch;

import java.util.Scanner;

public class Binarysearch {
    public static void main (String[]args){

        // binary search technique always works on shorted array.(in ascending order)

//        both case lies in function (function part)

        // case1.  when arr is given :::

//        int[]arr ={-20,-11,-1,2,9,22,39,37,47,58,90,99};
//        int target = 47;
//        int ans =Binarysearch(arr,target);
//        System.out.println(ans);


        // case 2. when arr is given by user ::
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no. of element in an arr :  " );
        int n = sc.nextInt();

        int arr []= new int[n];
        System.out.println("enter the element in an array :  ");
        for(int i = 0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("enter the no. to be searched :  ");
        int target= sc.nextInt();

        System.out.println("target is present at index :  ");
        int ans = Binarysearch(arr , target);
        System.out.println(ans);

    }
    //return the index
    // return -1 if  target is not found

    // body part ::

    static int Binarysearch(int[]arr , int target){
        int start = 0 ;
        int end = arr.length-1;
        while(start <=end){
            int mid = start+(end - start) / 2;

            if (target<arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1 ;
            }else {
                target = mid ;
                return mid;
            }
        }
        return -1 ;
    }
}

//is there is a shorted array in descending oreder then ..
//the change have to made is
// if (target >middle) then
//     end = mid -1
//if (target < middle) the
//     start = mid +1


// if there is a shorted array but we don't know that..
// it is ascending or descending ...
//then firstly we have to identify this by comparision b/w first and lst element