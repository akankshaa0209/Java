package ArrayAssignment;
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/

public class FirstLastPositionOfAnEleInSortedArray {
    //two pointer approach
    class Solution {
        public int[] searchRange(int[] nums, int target) {
            int left = 0, right = nums.length - 1;
            int first = -1, last = -1;

            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (nums[mid] == target) {
                    first = mid;
                    last = mid;
                    while (first > 0 && nums[first - 1] == target) {
                        first--;
                    }
                    while (last < nums.length - 1 && nums[last + 1] == target) {
                        last++;
                    }
                    break;
                } else if (nums[mid] < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

            return new int[]{first, last};
        }
    }
}


//brute
//class Solution {
//    public int[] searchRange(int[] nums, int target) {
//        int first = -1, last = -1;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == target) {
//                if (first == -1) {
//                    first = i;
//                }
//                last = i;
//            }
//        }
//        return new int[]{first, last};
//    }
//}