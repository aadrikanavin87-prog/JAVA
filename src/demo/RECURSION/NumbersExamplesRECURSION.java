package demo.RECURSION;

public class NumbersExamplesRECURSION{
    static void main(String[] args) {
        // write a function that takes in a number and print them
        // print first 5 no.(using recursion . it  do not need to call every function)

//        by using recursion here(recursion = which call itself);

        print(1);

    }
    static void print(int n){
        if(n == 5){                  // base condition  (it is necessary bcz  without
            // BS it calls again & again it take a separate memory and cause stack overflow)
            System.out.println(5);
            return;
        }
        System.out.println(n);

        // recursive call
        //if u calling a function again and again , you can treat it as a separate call in stack like number example

        // this is called tail recursion
        // this is last function call
        print(n+1);
    }
}

// here if codintion is a [BASE CONDITION]
// FOR RECURSION
//it is the condition where recursion stops to calling itself;
