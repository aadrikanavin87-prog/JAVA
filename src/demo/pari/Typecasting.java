package demo.pari;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int num = input.nextInt();
//        System.out.println(num);
//        type casting
        int num = (int)(67.89f);
        System.out.println(num);
//           compressing bigger number into smaller type kn as type casting.
//        automatic type promotion in expressions
        int a = 257;
        byte b =(byte)(a);  //257 % 256 = 1

        System.out.println(b);

        byte c = 40;
        byte d = 50;
        byte e = 100;
        int z = (c*d)/e;
        System.out.println(z);

    int number = 'A';
        System.out.println(number);
        System.out.println(3 * 9.34);
     byte g = 42;
     char h ='d';
     short s = 1024;
     int i = 23;
     float f = 56.23f;
     double j = 0.123;
     double result = (f * g)+ (i/h)-(j*s);
     // float + int - double = double
        System.out.println(result);



    }
}
