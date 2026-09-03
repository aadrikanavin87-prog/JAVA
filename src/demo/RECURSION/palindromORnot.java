package demo.RECURSION;

public class palindromORnot {
    public static void main(String[] args) {
        System.out.println(pallin(101));
        System.out.println(pallin(198891));
        System.out.println(pallin(16728));

    }
    static boolean pallin(int n){
        return n == rev(n,0);
    }

    static int  rev(int n , int sum) {
        if (n == 0) {
            return sum ;
        }
        int rem = n % 10;
        return rev(n/10 , sum*10+rem );
    }
}
