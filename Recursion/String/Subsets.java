package Recursion.String;
//str="abc"
//ans = ["a", "b","c","ab", "ac", "bc", "abc"]
//pick/non pick

//https://leetcode.com/problems/subsets/description/
//https://leetcode.com/problems/subsets-ii/description/
//BEST: REFER TO MY LEETCODE SOLUTION

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<List<Integer>> ans = subsets(arr);
//        for (List<Integer> list : ans) {
//            System.out.println(list);
//        }
        System.out.println(ans);
    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();

        helper(nums, 0, ans, output);
        return ans;
    }

    private static void helper(int[] nums, int index, List<List<Integer>> ans, List<Integer> output) {
        if (index == nums.length) {
            ans.add(new ArrayList<>(output));
            return;
        }

//        //take nums[index]
//        output.add(nums[index]);
//        helper(nums, index + 1, ans, output);
//
//        //backtrack
//        output.remove(output.size() - 1);
//        //ignore nums[index]
//        helper(nums, index + 1, ans, output);

        helper(nums, index + 1, ans, output);

                output.add(nums[index]);
        helper(nums, index + 1, ans, output);

        output.remove(output.size() - 1);




    }

}


