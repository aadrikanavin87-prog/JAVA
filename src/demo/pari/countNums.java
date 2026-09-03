package demo.pari;

import java.util.Scanner;

public class countNums {
    public static void main(String[] args) {
//       int n = 45675859;
//        Q.how many times 5 is come in a number??
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int count = 0;

        while (n>0){
            int rem = n%10;
            if (rem == 5) {
                count++;
            }
            n = n/10;
        }
        System.out.println(count);
    }
}
