package demo.Strings;

public class BuiltInMethods {
    public static void main(String[] args) {

        String s = "Aadrika Navin";
        System.out.println(s.indexOf(' '));
        System.out.println(s.charAt(2));
        System.out.println(s.length());
        System.out.println(s.indexOf('a'));
        System.out.println(s.lastIndexOf('a'));
        System.out.println(s.indexOf('a',3));
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s.indexOf('y'));

        String a = "Harshita";
        System.out.println(a.contains("Harsh"));
        if(a.contains("arsh")){
            System.out.println("happy");
        }
        System.out.println(a.startsWith("Harsh"));
        System.out.println(a.startsWith("arsh"));
    }
}
