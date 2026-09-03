package demo.RECURSION;

public class DigitProduct {
    // product of digit in a no
        public static void main(String[] args) {
            System.out.println(digitProduct(55));
        }
        static int digitProduct(int n ){
            if(n%10 == n){        // base condition
                return n;
            }
            return( (n % 10)  *  digitProduct(n / 10)); // recurence formula


        }
}
