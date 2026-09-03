package demo.pari;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int value = 0;
        while (true) {
//        take operator as input
            System.out.println("enter the operator: ");
            char op = in.next().trim().charAt(0);
            System.out.println();
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
//          input two numbers
                System.out.print("enter the numbers: ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();
                System.out.println();

                if (op == '+') {
                    value = num1 + num2;
                }
                if (op == '-') {
                    value = num1 - num2;
                }
                if (op == '*') {
                    value = num1 * num2;
                }
                if (op == '/') {
                    value = num1 / num2;
                }
                if (op == '%') {
                    value = num1 % num2;
                }
            } else if (op == 'x'|| op=='X') {
                break;
            }else{
            System.out.println("invalid operation!!");
            }
            System.out.println(value);
        }
    }
}
