package demo.RECURSION;

public class TowerofHanoi {
    public static void main(String[] args) {
        hanoi(3,'A','B','C');

    }
    // src = source(A) , helper= via B , dest = destination (C);
   public static void hanoi(int n , char A, char B , char C){
        if(n==0) return ; // base case
       hanoi(n-1 , A , C , B);         // n-1 disk from A to B via C
       System.out.println(A + "->" + C);      // largest disk from A to B == 1st result
       hanoi(n-1 , B , A , C);          // n-1 from B to C via A

   }
}
