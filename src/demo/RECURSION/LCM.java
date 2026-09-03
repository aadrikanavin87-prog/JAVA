package demo.RECURSION;

public class LCM {
    public static void main(String[] args) {
        System.out.println(LCM(5,35));
        System.out.println(LCM(15,25));
    }
    public static int GCD(int a,int b){
        if(a==0) return b;
        return GCD(b%a,a);
    }
    static int LCM(int a, int b){
        while(a==0){
            return 0;
        }
        return  a*b/GCD(b%a, a);
    }

}


//FORMULA  (GCD is nothing but HCF)
//so( LCM* HCF = PRODUCT OF NUMS)!!
//LCM(a,b) = a*b / GCD(a,b)
