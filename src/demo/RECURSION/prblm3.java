package demo.RECURSION;

import java.util.Scanner;

public class prblm3 {
    public static void main(String[] args) {

//        Q. a raised to power b

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Base: ");
        int a = sc.nextInt();
        System.out.print("Enter Power: ");
        int b = sc.nextInt();
        int ans = (int) Math.pow(a,b);
//        System.out.println("a raised to the power b is : "+Math.pow(a,b));
        System.out.println("a raised to the power is: " + pow(a, b));
    }

    public static int pow(int a, int b) {
        if (b == 0) return 1;
        return a * pow(a, b - 1);
    }
}
