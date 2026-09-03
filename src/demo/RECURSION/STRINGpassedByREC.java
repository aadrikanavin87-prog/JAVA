package demo.RECURSION;

import java.util.ArrayList;
//import java.util.*;      // no need to import each thing * take everything


public class STRINGpassedByREC {
    public static void main(String[] args) {
        String s = "Kartikey";  // copy of string is paassed not a value
        change(s);
        System.out.println(s);

        String[] arr = {"pari", "riya", "priya"};  // string array
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }


        ArrayList<String> al = new ArrayList<>();  // create a array list
        al.add("Shravan");
        al.add("Aadrika");      // Array list
        al.add("Priya");
        al.add("Sam");
//        System.out.print(al);  // it directly print list of any array!
        change2(al);               // here samridhhi add in the array list
        System.out.println(al);
    }

    public static void change2(ArrayList<String> al) {
        al.add("Smaridhhi");
    }

    public static void change(String s) {
        s = "lavish";
    }
}

//string array and string list can be only passed by reference not value

