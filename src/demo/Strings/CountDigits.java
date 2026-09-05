package DSA.Strings;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double n1 = sc.nextDouble();

//        count no of digits without using loops
        String s = "" + n;
        System.out.println(s.length());

        String s1 = ""+n1;
        System.out.println(s1);
        System.out.println(s1.length()); // if  n= 00.009600 = count = 5(from 0.0096)

    }
}
