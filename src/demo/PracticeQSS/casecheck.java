package demo.pari;

import java.util.Scanner;

public class casecheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        System.out.println(in.next().trim((5);
//    trim() is used to ignore extra spaces

        char ch = in.next().trim().charAt(0);
//        here charAt(0) means character at 0th index
//        System.out.println(ch);

//    Q. to check the word or a letter is in upper case or lower case?
         if(ch>='a'&& ch<='z'){
             System.out.println("lower case");
         }
         else {
             System.out.println("Upper case");
         }
    }
}
