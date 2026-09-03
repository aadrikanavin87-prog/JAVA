package demo.RECURSION;


public class preINpost {
    public static void main(String[] args) {
        pip(3);
    }
    public static void pip(int n){
        if(n==0) return;
        System.out.print(n+" "); // pre
        pip(n-1);
        System.out.print(n+" ");  //in
        pip(n-1);
        System.out.print(n+" ");  //post
    }
}
//1 1 1     (at n:1)
//2 1 1 1 2 1 1 1 2         (at n:2)
//3 2 1 1 1 2 1 1 1 2 3 2 1 1 1 2 1 1 1 2 3    (at n:3)

