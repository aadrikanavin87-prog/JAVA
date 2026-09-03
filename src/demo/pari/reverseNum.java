package demo.pari;

import java.util.Scanner;

public class reverseNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int rev = 0;
        while(n!=0){
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n/10;
        }
        System.out.println(rev);
    }
}
