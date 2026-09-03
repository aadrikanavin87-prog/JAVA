package demo.Strings;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "Kunal kushwaha" ;

        System.out.println(name.toCharArray());  // simply print name

        System.out.println(Arrays.toString(name.toCharArray()));  //  name print like array

        System.out.println(name.toUpperCase());

        System.out.println(name.toLowerCase()); // convert in lower case

        System.out.println(name.indexOf('a'));  // tell the index

        System.out.println("      kunal    ".strip());  // ignore extra spaces

    }
}
