package demo.Array;

public class arrayexample {
    public static void main(String[] args) {
        int [] marks = {90,39,40,50,20,47,49,40};
        float [] rate={39,40.9f,49.0f,89.9f};
        String [] students = {"Aadrika","Pari","Priya","Ritika"};

////      {displaying array using Naive way}
//        System.out.println(marks[5]);
//        System.out.println(marks.length);//
//        System.out.println(rate[2]);
//        System.out.println(rate.length);
//        System.out.println(students.length);
//        System.out.println(students[4]);

//        {to display all marks using for loop.}(array traversal)
        System.out.println("in sequence");
        for(int i =0 ; i<marks.length; i++){
            System.out.println(marks[i]);
        }

        //        for(int i =0;i<rate.length; i++){
//            System.out.println(rate[i]);
//        }

//        {to display all marks using for loop in Reverse order.}
        System.out.println("reverse order");
        for(int i =marks.length-1 ; i>0; i--){
            System.out.println(marks[i]);
        }


//            Displaying the array (for-each loop)
        System.out.println(" printing using for-each loop");
        for(int element : marks){
            System.out.println(element);
        }
    }
}
