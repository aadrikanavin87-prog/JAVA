package demo.Method;

public class name {
    public static void main(String[] args) {
        String name ="kunal";
        changeName(name);
        System.out.println(name);
    }
    static void changeName(String naam){
        naam ="rahul"; // here we only creating new object
        System.out.println(naam);
    }
}
//here we can not  modify strings .