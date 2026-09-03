package demo.RECURSION;

import java.util.Scanner;

public class FactorialEg {
    public static void main(String[] args) {
        //factorial of a no. using RECURSION
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the no: ");
        int n = sc.nextInt();
        if(n<0){
            System.out.println("Fact of this no. is not possible!!");
        }else{
            System.out.println(fact(n));
        }
    }
    static int fact(int n ) {
        if (n <= 1) {
            return 1;
        }
        return (n * fact(n - 1));
    }
}
