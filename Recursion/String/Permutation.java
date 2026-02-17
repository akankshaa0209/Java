package Recursion.String;
////O(n*n!), n
//Time Complexity: O(n × n!)
//Space Complexity: O(n × n!) (because of result storage)
//Auxiliary Space: O(n) (recursion stack)


//https://leetcode.com/problems/permutations/description/
//https://leetcode.com/problems/permutations-ii/

import java.util.ArrayList;
import java.util.Arrays;

public class Permutation {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};

        ArrayList<ArrayList<Integer>> ans = permute(nums);

        System.out.println(ans);

        int count = countPermutations(0, nums);
        System.out.println("Total permutations = " + count);

    }

    //return permutation arraylist
    static ArrayList<ArrayList<Integer>> permute(int[] nums) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        recurPermute(0, nums, res);
        return res;
    }

    static void recurPermute(int index, int[] nums, ArrayList<ArrayList<Integer>> ans) {
        if (index == nums.length) {
            ArrayList<Integer> temp = new ArrayList<>();
            for (int num : nums) temp.add(num);
            ans.add(temp);
            return;
        }

        for (int i = index; i < nums.length; i++) {
            swap(nums, index, i);        // FIXED
            recurPermute(index + 1, nums, ans);
            swap(nums, index, i);        // BACKTRACK
        }
    }

    //count permutations
    static int countPermutations(int index, int[] nums) {

        if (index == nums.length) {
            return 1;   // one valid permutation found
        }

        int count = 0;

        for (int i = index; i < nums.length; i++) {
            swap(nums, index, i);
            count += countPermutations(index + 1, nums);
            swap(nums, index, i); // backtrack
        }

        return count;
    }

    static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
