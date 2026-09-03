package demo.RECURSION;

public class ConceptDecrement {
    public static void main(String[] args) {
        fun(5);
    }
    static void fun(int n ){
        if(n==0){
            return;
        }
        System.out.println(n);
//        fun(n--);   its get a stack overflow bcz always 5 print & there is no condition
//        to break it;

        fun(--n);
    }
}
