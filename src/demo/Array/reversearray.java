package demo.Array;

import java.util.Scanner;

public class reversearray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []A = new int [6];

//        INPUT ELEMENTS
        System.out.println("enter the 6 element  of an array(6): ");
        for(int i =0;i<6;i++) {
            A[i] = sc.nextInt();
        }
        int l=A.length;
        int n = Math.floorDiv(l,2);
        int temp;
//  /       REVERSE ARRAY
        for(int i =0;i<n;i++){
//            swap A[i] and A[l-i-1] replace it with opposite side
//            eg. if we want to reverse 0th element with 5th element
//            so if i=0 , so (6-0-1) = 5th term { a[0] = a[5]}
//            if i=1 , so (6-1-1) = 4th term { a[1] = a[4] }
//           A   B   temp
//           |3| |4|  | |
            temp = A[i];
            A[i] = A[l-i-1];
            A[l-i-1] = temp;
        }
        System.out.println("reversed array: ");
        for(int i=0;i<l;i++){
            System.out.println(A[i] + " ");
        }

//              OR

//        int []arr = {1,3,4,5,7,5,4,};
//        int l = arr.length;
//        int n =l/2;
//        int temp;
//
//        for(int i =0;i<n;i++){
//            temp = arr[i];
//            arr[i] = arr[l-i-1];
//            arr[l-i-1] = temp;
//        }
//        System.out.println("reversed array: ");
//        for(int i=0;i<l;i++) {
//            System.out.println(arr[i] + " ");
//        }
    }
}
