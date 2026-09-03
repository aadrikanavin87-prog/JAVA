package demo.Array;

import java.util.Scanner;

public class practiceset {
    public static void main(String[] args) {

//        Q.1. creating an array if 5 floats and calculate their suum
//        float[] arr = {48.9f,78.9f,38,89.9f};
//        float sum = 0;
//
//        for(int i =0;i<arr.length;i++){
//            sum = sum+arr[i];
//        }
//        OR
//        for(float element:arr){
//            sum = sum + element;
//        }
//        System.out.println(sum);


//        Q.2. program to find out whether a given integer is present or not in an array
//         int[] arr={20,39,49,40,20,40};
//         int key = 39;
//         boolean isInArray=false;
//         for(float element:arr) {
//             if (key == element) {
//                  isInArray = true;
//                 break;
//             }
//         }
//         if (isInArray){
//           System.out.println("key is present");
//         }
//         else{
//            System.out.println("key is not present");

//                            OR

//        int[] arr={20,39,49,40,20,40};
//        int key = 39;
//        for(int i=0; i<arr.length; i++) {
//            if (arr[i]== key) {
//                System.out.println("key is present at index:  " + i);
//                break;
//          } else {
//                System.out.println("key is not present");
//          }
//    }
//}


//         Q.3. calculate the avg marks of an array containing marks of all students in physics using for each loop
       Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number  of students:  ");
        int n = sc.nextInt();

        double sum =0;

        for (int i =1; i <=n ;i++){
           System.out.println("enter the marks of stuents " + i + ":");
           double marks = sc.nextDouble();
           sum = sum + marks;
        }

        double average = sum/n;

        System.out.println("Average marks = "+ average);
        sc.close();
    }

    public static class multidimensional {
        public static void main(String[] args) {
    //        int [] marks; //1D array
    //        int [][] Flats; //2D array
            int [][] Flats = new int [2][3];
            Flats[0][0]=101;
            Flats[0][1]=102;
            Flats[0][2]=103;
            Flats[1][0]=201;
            Flats[1][1]=202;
            Flats[1][2]=203;
            System.out.println("displaying 2 d array using for");
            for(int i =0;i<Flats.length ; i++){
                for (int j = 0;j<Flats[i].length;j++){
                System.out.print(Flats[i][j]);
                    System.out.print(" ");
                }
                System.out.println("");
            }
        }
    }
}

