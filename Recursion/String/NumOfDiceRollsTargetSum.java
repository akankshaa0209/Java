package Recursion.String;

//https://leetcode.com/problems/number-of-dice-rolls-with-target-sum/description/

import java.util.Arrays;

public class NumOfDiceRollsTargetSum {
    public static void main(String[] args){
        int ans=CountWays(2,6,7);
        System.out.println(ans);


        int dice = 2, faces = 6, target = 7;
        int[][] dp = new int[dice + 1][target + 1];

        // Fill dp with -1
//        for (int i = 0; i <= n; i++) {
//            for (int j = 0; j <= target; j++) {
//                dp[i][j] = -1;
//            }
//        }

        for (int[] row : dp)
            Arrays.fill(row, -1);

        System.out.println(countWaysDP(dice, faces, target, dp));
    }

    //recursion
    public static int CountWays(int dice, int faces, int target){
        if(dice==0) return target==0?1:0;
        if(target<0) return 0;

        int ways=0;
        for (int i = 1; i <= faces; i++) {
            ways+= CountWays(dice-1,faces,target-i);
        }
        return ways;
    }

    //memoization
    static int countWaysDP(int dice, int faces, int target, int[][] dp) {
        if (target < 0) return 0;
        if (dice == 0) return target == 0 ? 1 : 0;



        if (dp[dice][target] != -1) return dp[dice][target];

        int ways = 0;
        for (int i = 1; i <= faces; i++) {
            ways += countWaysDP(dice - 1, faces, target - i, dp);
        }

        return dp[dice][target] = ways;
    }

}
