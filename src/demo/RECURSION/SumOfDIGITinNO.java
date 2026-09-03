package demo.RECURSION;

public class SumOfDIGITinNO {
//    sum of digits in any NUMBER
    public static void main(String[] args) {
        System.out.println(digitSUM(1987));
    }
    static int digitSUM(int n ){
        if(n ==0){        // base condition
            return 0;
        }
        return( (n % 10)  + digitSUM(n / 10)); // recurence formula


    }
}
