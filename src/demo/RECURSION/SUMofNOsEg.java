package demo.RECURSION;

public class SUMofNOsEg {
    public static void main(String[] args) {
//        sum of n numbers like sum of 4 no. (means 1+2+3+4)
        System.out.println(sum(10));
    }
    static int sum(int n){
        if(n<=1){     // base condition
            return 1;
        }
        return(n + sum(n-1));
    }
}
