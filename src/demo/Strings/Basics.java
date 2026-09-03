package demo.Strings;

import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        System.out.println(s);
//
//        String t = sc.next();
//        System.out.println(t);

        String p = "Aadrika and pari";
        String a = "Chaitanya and Shruti";
        System.out.println(p.charAt(3));
        for(int i=0;i<p.length();i++){
            System.out.print(p.charAt(i));
        }
        System.out.println(" ");
        System.out.println(p.length());
        System.out.println(a.length());



    }
}
