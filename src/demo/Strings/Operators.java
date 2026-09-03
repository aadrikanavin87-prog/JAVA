package demo.Strings;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args){
        System.out.println('a' + 'b');  // add ASCII value i.e 97+98 = 195
        System.out.println("a" + "b");  // concatinate this two i.e ab
        System.out.println('a' + 3);    // 97+3 = 100
        System.out.println("a" + 1);    // a1

        System.out.println((char)('a' + 3));  // type casting  100 in char  =  i.e "d"

        System.out.println("kunal" + new ArrayList<>()); // call toString()
        System.out.println("Aadrika" + new Integer(56));

//        System.out.println(new Integer(56)  + new ArrayList<>());  // this will give error
//        bcz two complex object cant operate with each other , it must need atleast 1 string like...
        System.out.println(new Integer(56) + " " + new ArrayList<>());
        // one of these three must be of string and ans is also of string type

        // + operator only works on primitives datatypes


        System.out.println("a" + 'b'); // ans is of string type
        // if a single string is present it always give ans in a string
    }
}
