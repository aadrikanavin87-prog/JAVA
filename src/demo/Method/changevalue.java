package demo.Method;

import java.util.Arrays;

public class changevalue {
    public static void main(String[] args) {
        int[] arr ={1,2,4,67,8};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change (int [] nums){
        nums[0]=99;// if you make a change  to the object via this ref variable , same object will be changed.
    }
}
