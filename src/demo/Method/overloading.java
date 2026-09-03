package demo.Method;

public class overloading {
    static void foo() {
        System.out.println("good morning bro");
    }

    static void foo(int a) {
        System.out.println("gud mrng,");
    }

    static void foo(int a, int b) {
        System.out.println("gud mrng " + a + "bro!");
        System.out.println(" gud " + b + "");
    }
}
//    foo();
//    foo(  a:300);
//    foo(int a: 3000 ,int b: 400);
//     arguments are actual