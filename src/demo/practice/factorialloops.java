package demo.practice;

import java.util.Scanner;
public class factorialloops {
    public static void main(String[] args) {


////        Q. factorial using for loop
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a no: ");
        int n = sc.nextInt();
        int fact=1;
        if (n>0){
            for( int i=1;i<=n;i++){
            fact=fact*i;
            }
        }
        System.out.print(" factorial of n  is : " +fact);

    }
}
//    Q. using while loop?
//        int n = 5;
//        int  fact = 1;
//        int i = 1;
//        while (i <= n) {
//            fact = fact * i;
//            i++;
//        }
//        System.out.println(fact);
//    }
//}
