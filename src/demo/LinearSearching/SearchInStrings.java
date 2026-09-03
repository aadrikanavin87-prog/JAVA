package demo.LinearSearching;

public class SearchInStrings {
    public static void main(String[] args) {
//        USING  METHOD(FUNCTION)
        String name = "Kunal";
        char target = 'u';
        System.out.println(search(name, target));

    }
    static boolean search (String str , char target){
        if (str.length()== 0){   // here we use () bcz it is is function or method in string but the same thing to find length in int we use arr.length  bcs this is the variable.
            return false;
        }
        for(int i =0 ; i<str.length() ; i++){
            if(target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}

