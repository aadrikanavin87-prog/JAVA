package demo.Strings;
public class Comparison {
    public static void main(String[] args) {
        String a = "Aadrika";
        String b = "Aadrika";
        // here both variable pointing to same object

//        ==
//        if reference variable are pointing to the same object then it will give u  a true
//        false if  both are not pointing to the same.

        System.out.println(a==b);


//        if we want to create a new two different  object
        String c = new String("Aadrika");
        String d = new String("Aadrika");

//         here it shows two different object  class so both ref varible denote two diff. object
        System.out.println(c==d);   // it give (FALSE)


        System.out.println(c.equals(d));  // it give (TRUE) ,
        // bcz it is the "STRING METHOD " which point the object name which is same here

        System.out.println(c.charAt(0)); // charAt()  it is use for pointing like array in the string
    }
}
