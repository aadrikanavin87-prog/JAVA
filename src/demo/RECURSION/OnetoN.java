package demo.RECURSION;

import java.util.Scanner;

public class OnetoN {
//     if i want to print 8 no. from 1 to 8 then


//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        print (1,n);
//    }
//    public static  void print(int x , int n ){
//        if(x>n) return;
//        System.out.println(x);
//        print(x+1,n);
//    }


//     ANOTHER WAY

//    static int n ;
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        n = sc.nextInt();
//        print (1);
//    }
//    public static void print(int x ){
//        if(x>n) return;
//        System.out.println(x);
//        print(x+1);
//    }

//     ANOTHER WAY

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print (n);
    }
    public static  void print(int n ){
        if(n==0) return;
        print(n-1);
//        System.out.print(n+" ");    // side by side  print hoga
        System.out.println(n);   // from top to down print hoga
    }
}
