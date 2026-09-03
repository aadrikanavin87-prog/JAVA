package demo.RECURSION;

import java.util.Scanner;

public class REVERSENUMBER {
//    public static void main(String[] args) {
//        // reverse any no. like 1986 to 6891
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a no  need to be reversed: ");
//        int n = sc.nextInt();
//        REV1(n);
//        System.out.println(sum);
//
//
//    }
//    static int  sum =0;
//    static void REV1(int n){
//        if(n==0){
//            return;
//        }
//        int rem = n % 10;
//        sum = sum *10 +rem;
//        n=n/10;
//        REV1(n);
//    }

//    ANOTHER WAY(OR)
    public static void main(String[] args){
//        int n = 2696;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. : ");
        int n = sc.nextInt();
        System.out.println(reverse(n,0));
    }

    public static  int  reverse(int n , int r) {
        if (n == 0) return r;
        return reverse(n / 10, r * 10 + n % 10);      // 22,23,24 line done here
    }
}
