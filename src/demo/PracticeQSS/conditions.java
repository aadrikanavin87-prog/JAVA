package demo.pari;

import java.util.Scanner;

public class conditions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the salary: ");
        int salary = input.nextInt();
        //     syntax of if
//       if(boolean expression T or F){
//            BODY
//        }else{
//          }
//        int salary = 34500;
//        1.
//        if(salary>30000){
//        salary = salary + 1000;
//        }else{
//            salary = salary + 2000;
//        }
//        System.out.println(salary);
//       2.
        if (salary>20000){
            salary +=30000;
        }else if (salary<20000){
            salary+=40000;
        }else {
            salary +=35000;
        }
        System.out.println(salary);
    }
}
