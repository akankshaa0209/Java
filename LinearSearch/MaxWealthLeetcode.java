package LinearSearch;
//https://leetcode.com/problems/richest-customer-wealth/
public class MaxWealthLeetcode {
    public static void main (String[] args) {
        int[][] arr = {{1,2,3},{2,3,4}};
        System.out.println(maximumWealth(arr));
    }
    static int maximumWealth(int[][] accounts) {

        int max = Integer.MIN_VALUE;
        for (int row = 0;  row < accounts.length; row++){
            int sum = 0;
            for (int col = 0; col < accounts[row].length ; col++){
                sum += accounts[row][col];
            }
            if (sum > max) max =  sum;
            // max = Math.max(max, sum);
        }
        return max;
    }
}
