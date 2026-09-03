package demo.RECURSION;

public class GloableLocalVARIABLE {

    static int x=10;         // Globle variable
    public static void main(String[] args) {
        fun();
        System.out.println(x); // print value of x whatever is wriitten in fun()
        // always local variable priorities more
        x=80;
        System.out.println(x);
    }
    static void fun(){
        x=20;
    }
}
