package demo.LinearSearching;

public class PRACTICE {
    public static void main(String[] args) {
        // Q. given an array nums of integers,i.e {12,345,2,6,7896}
        // and return how many of them contains an even no. of digits
        int []nums ={12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }
//  Check the no. of nums whose digit is even
    static int findNumbers(int [] nums){
        int count = 0 ;
        for(int num: nums){
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    // count number of digits in a number
    static int digits(int num){
        if (num<0){
            num = num * -1 ;
        }
        //return (int) (Math.log10(num)) +1;
        // it is one single step for line  to 34.

//                OR

        if(num==0){   // return int (Math.log10(num))+1;
            return  1;    // it is one single step for line 31 to 39.
        }
        int count =0;
        while (num > 0) {
            count++;
            num = num/10;
        }
        return count;
    }


    // function to check a no. contains even digit or not
    static  boolean even(int nums){
        int  numberofdigits =digits(nums);
        /*if( numberofdigits % 2 == 0 ){
            return true;
        }
        return false;
        */
        return numberofdigits % 2== 0;
    }
}
//  ans is 2
// means there is only two num in given that contains even no. of digit