package demo.LinearSearching;

public class PRACTICE2 {
    public static void main(String[] args) {
        //person=row
        //account = col
        int ans  = Integer.MIN_VALUE;
        int [][] accounts = {
                {1, 2, 3},
                {3, 2, 1}
        };
        for(int person=0;person<accounts.length;person++) {
            // when you start a new col , take a new sum for that row
            int sum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                sum = sum + accounts[person][account];
            }
            //now we have sum of accounts of person
            //check overall ans
            if (sum > ans) {
                ans = sum;
            }
        }
        System.out.println(ans);
    }
}
