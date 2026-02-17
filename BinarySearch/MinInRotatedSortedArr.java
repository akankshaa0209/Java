package BinarySearch;
//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/submissions/1864447501/
//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/submissions/1864453290/

public class MinInRotatedSortedArr {
    class Solution {
        public int findMin(int[] nums) {
            int left = 0, right = nums.length - 1;
            while(left < right) {
                int mid = left + (right - left) / 2;

                if(nums[mid] < nums[right]) {
                    right = mid;
                } else {
                    left = mid + 1;
                }
            }

            return nums[left];
        }
    }
}
