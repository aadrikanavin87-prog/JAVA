package demo.Strings;

public class PassingStringToMethod {
    public static void change (String x) {
        x="Aadrika";
//        System.out.println(x);
    }
    public static void main(String[] args) {
        String x = "Pari";
        System.out.println(x);
        change(x);
        System.out.println(x);
    }
}
// string pass by value
