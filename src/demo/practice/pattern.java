package demo.practice;

public class pattern {
    public static void main(String[] args) {
//       Q. program to print the pattern?
        int n = 4;
        for(int i = n;i>0;i--){
            for(int j=0 ; j<i;j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
