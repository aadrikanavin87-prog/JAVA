package demo.RECURSION;

public class FibonacciusingRecursion {
     public static void main(String[] args) {
         System.out.println(fibo(4));  // 4rth fibonacci no.
         System.out.println(fibo(5));
//         System.out.println(fibo(50));  // it does not give any ans
     }
    static int fibo(int n ) {
        //base condition ( when n = 0,1, = fibo = 0,1 )
        if (n < 2) {
            return n;
        }
        return fibo(n - 1) + fibo(n - 2);
    }
}
