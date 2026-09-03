package demo.Searching;

public class linearsearchusingfunction {
    public static void main(String[] args) {
        int[] nums = {23, 45, 67, 89, 90, -2, -4, -99, -44, -4894};
        int target = -99;
        int ans = linearsearch(nums, target);
        System.out.println(ans);
    }
    // searching the array : return index if it is found
    //otherwise if the item not found return -1
    static int linearsearch(int[]arr , int target) {
        if (arr.length == 0) {
            return -1;
        }
        // run a for loop
         for (int index = 0; index < arr.length; index++) {
            //check for element at every index if it is = target
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        // when target is not found
        return -1;
    }
}
