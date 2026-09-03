package demo.RECURSION;

public class GCD {
     public static void main(String[] args) {
         GCD(16,20);
         System.out.println(GCD(16,20));
    }
    public static int GCD(int a,int b){
       if(a==0) return b;
       return GCD(b%a,a);
     }
}
