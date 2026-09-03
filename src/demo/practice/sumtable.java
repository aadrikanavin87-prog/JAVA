package demo.practice;

public class sumtable {
    public static void main(String[] args) {
//        Q. program to calculate the sum of no. ocurring
//        in multiplication table of 8.
        int n =8;
        int sum=0;
        for(int i =0; i<=10;i++){
          sum = sum+ (n*i);
        }
        System.out.println(sum);
    }
}
