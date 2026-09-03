package demo.practice;

public class sumeven {
    public static void main(String[] args) {
//        Q. program to sum first n even number?
        int sum = 0;
        int n =4;
        for(int i =0;i<n;i++){
            sum = sum + (2*i);
        }
        System.out.println(" sum of even num is : " +sum);
//       first 4 even numbers are : 0, 2,4,6
    }
}
