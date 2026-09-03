package demo.Strings;

public class BasicString {
    public static void main(String[] args) {
        String name = "Aadrika navin";
//      Datatype-refvariable - object
        System.out.println(name);
        String a = " kunal ";
        System.out.println(a);
        a =  "kushwaha";
        System.out.println(a);

        char[] arr = {'o' , 'p' , 'k', 'a', 'h'};
        for(char  ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println(" ");
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
}
