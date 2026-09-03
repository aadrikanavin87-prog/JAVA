package demo.Array;
public class intro {
    public static void main(String[] args) {
//        classroom of 500 students - you have to store marks
//        of these 500 students
//         you have two options
//     1. create 500 variable
//      2. use arrays(recomended)

//        there are three way to declare (create)the java

//     1.  declaration and  then memory allocation
//     int[]marks ; // declaration !
//        marks=new int[5]; //memory allocation !

//     2.declaration and memory allocation
//        int[] marks = new int[5];

//        3. initialization , declaration and memory allocation together
        int marks [] = {23,48,85,99,90};
        marks[0]=49;
        marks[4]=49;
        marks[1]=79;
        marks[2]=90;
        marks[3]=99;
        System.out.println(marks[4]);
    }
}
