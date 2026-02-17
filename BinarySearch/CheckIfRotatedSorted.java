package BinarySearch;

//count no. of breaks in order
//https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/

public class CheckIfRotatedSorted {
    class Solution {
        public boolean check(int[] nums) {
            int count = 0, n = nums.length;

            for (int i = 0; i < n; i++) {
                if (nums[i] > nums[(i + 1) % n])
                    count++;
                if (count > 1)
                    return false;
            }

            return true;
        }
    }
}
