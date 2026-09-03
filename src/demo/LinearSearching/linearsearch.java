package demo.Searching;

import java.util.Scanner;

public class linearsearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no. of element in an arr: ");
        int n = sc.nextInt();

        int [] arr = new int[n];
        System.out.println("enter the element in an arr: ");
        for(int i =0 ; i<n ; i++){
             arr[i] = sc.nextInt();
        }

        System.out.println("enter the element to be searched:  ");
        int key = sc.nextInt();

        boolean isfound =false;
        for(int i = 0 ; i<n ; i++){
            if ( arr[i] == key){
                System.out.println("element found  at index : " + i);
                isfound = true;
                break;
            }
        }
        if (!isfound){
            System.out.println("element not found");
        }
    }
}
