package demo.LinearSearching;

public class SearchInRange {
    public static void main(String[] args) {
//        only search an element in a particular range
        int []arr = { 10,29,39,-4,13,99};
        int target = 39;
        System.out.println(linearSearch(arr, target, 1 , 4));
    }
    static int linearSearch(int[]arr, int target, int start , int end ) {
        if (arr.length == 0) { // if target is of out of range
            return -1; // so it will return -1 .  eg : 18,99 (bcz it is out of range of 1 to 4 index)
        }
        // run for a loop
        for (int i = start; i <= end; i++) {
            // check for element at every  index  if it is = target
            int element = arr[i];
            if (element == target) {
                return i;
            }

        }
        return -1;
    }
}
