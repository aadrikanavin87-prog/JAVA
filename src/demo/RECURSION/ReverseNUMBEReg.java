package demo.RECURSION;

public class ReverseNUMBEReg {
    public static void main(String[] args) {
        // to print no. in reverse from 5 to 1; only first para is working

//        entire code is used to print 5432112345;

        printNo(5);
        printRev(5);

    }
    static void printNo(int n ){
        if (n == 1){
            System.out.println(1);
            return;
        }
        System.out.println(n);
        printNo(n-1);
    }


//  AGAIN REVERSE 54321 into 12345 ;
    static void printRev(int n){
        if(n == 1){
            System.out.println(1);
            return ;
        }
        printRev(n-1);
        System.out.println(n);
    }
}
