package demo.Method;

import java.sql.SQLOutput;

public class introMethod {
    static int logic (int x,int y){
        int z;
        if(x>y){
            z=x+y;
        }
        else{
            z=(x+y)*5;
        }
        return z ;
    }

    public static void main(String[] args){
        int a = 5;
        int b = 7;
        int c = logic(a, b); // here method is call
        System.out.println(c);
        int p =6;
        int q = 7;
        int k = logic(p,q);
        System.out.println(k);
    }
}
//static keyword is used to associate a method of
//a give n class within class rather than the object.
//static method is a class which is shared by all the object//