package demo.LinearSearching;

import java.util.Arrays;

public class StringCharArray {
    public static void main(String[] args) {
//        USING  METHOD(FUNCTION)
        String name = "Kunal";
        char target = 'u';
        System.out.println(Arrays.toString(name.toCharArray()));

    }
    static boolean search (String str , char target){
        if (str.length()== 0){   // here we use () bcz it is is function or method in string but the same thing to find length in int we use arr.length  bcs this is the variable.
            return false;
        }
        for(char ch : str.toCharArray()){
            if (ch == target){
                return true ;
            }
        }
        return false;
    }
}

