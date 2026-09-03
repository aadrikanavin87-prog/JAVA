package demo.Array;

import java.util.Scanner;

public class minelement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no. of element :");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("enter the element in an array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int min = arr[0];

        for (int i = 0; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("min element : " + min);
    }


    //            min and max value that integer can hold
//    System.out.println(Integer.MAX_VALUE);
//    System.out.println(Integer.MIN_VALUE);
////        // min and max value that double can hold
//    System.out.println(Double.MIN_VALUE);
//    System.out.println(Double.MAX_VALUE);
//    //  min and max value that a float can hold
//    System.out.println(Float.MIN_VALUE);
//    System.out.println(Float.MAX_VALUE);


//                       OR


//        int []arr = {29,40,30,20,1,20};
//        int min = arr[0];
//        int n = arr.length;
//        for(int i=0;i<n;i++) {
//            if (arr[i] < min) {
//                min = arr[i];
//            }
//        }
//        System.out.println("min element of an array: "+min);
//    }
//}


//            min and max value that integer can hold
//    System.out.println(Integer.MAX_VALUE);
//    System.out.println(Integer.MIN_VALUE);
////        // min and max value that double can hold
//    System.out.println(Double.MIN_VALUE);
//    System.out.println(Double.MAX_VALUE);
//    //  min and max value that a float can hold
//    System.out.println(Float.MIN_VALUE);
//    System.out.println(Float.MAX_VALUE);
}
