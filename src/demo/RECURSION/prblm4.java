
package demo.RECURSION;
import java.util.Scanner;

public class prblm4 {

//    count the ways to reach the nth stairs
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of stairs: ");
        int n = sc.nextInt();
        System.out.println(stairs(n));

    }

    static int stairs(int n){
        while( n != 0){
            if(n==2) return 2;
            if(n==1) return 1;
            return stairs(n-1) + stairs(n-2);
        }
        return stairs(n-1) + stairs(n-2);
    }
}
