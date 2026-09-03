package demo.Method;

import java.sql.SQLOutput;
import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
//     Q. USING third variable swap two number (using function/ method)
//        int a = 10;
//        int b = 29;
        Scanner in = new Scanner(System.in);

        System.out.println("enter first number: ");
        int a = in.nextInt();

        System.out.println("enter second number: ");
        int b = in.nextInt();

        System.out.print("value before swapping :  ");
        System.out.println("a = "+a);
        System.out.println("b = " +b);
        new swap(a, b);
    }
//
//    swap(int a, int b) {
//        int temp = a;
//        a= b ;
//        b= temp;
//        System.out.println("value after swapping is:  " );
//        System.out.println(" a = "+a);
//        System.out.println(" b = "+b);
//    }
//}


// Q. swap two number by using third variable(normal method)
//        int a = 10;
//        int b = 30;
////        swap number code
//        int temp=a;
//        a=b;
//        b=temp;
//        System.out.println(a);
////        System.out.println(b);
//    }
//}
// Q. without using third variable swap teo number
    swap(int a,int b ){
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("after swapping: ");
        System.out.println("a= "+a);
        System.out.println("b= "+b);
    }
}