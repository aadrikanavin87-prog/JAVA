package demo.Stringbuilder;

public class SB {
    public static void main(String[] args){
//     here StringBuilder is used to print a to z using less time complexity
//         and is the  better way to print this
        StringBuilder builder = new StringBuilder();
        for(int i = 0 ; i<26 ; i++){
            char ch = (char)('a' + i);
            builder.append(ch);  // for add // it  does not creating new object it only change in original object
        }
        System.out.println(builder.toString());
        builder.deleteCharAt(0);  // dlt char at 0
        System.out.println(builder);

        System.out.println(builder.delete(0,2)); // dlt from 0 to 2th index
        System.out.println(builder.reverse());
    }
}
