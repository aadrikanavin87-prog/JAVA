package demo.practice;

public class tablereverse {
//    Q. program to print multiplication table of 10 in reverse order
    public static void main(String[] args) {
        int n = 10;
        for (int i = 10; i >= 1; i--) {
            System.out.printf("%d X %d = %d\n", n, i, n * i);
        }
    }
}

