package ArrayAssignment;

//https://leetcode.com/problems/move-zeroes/description/

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args){
        int[] arr = {0,1,0,3,12};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void moveZeroes(int[] nums) { //n,1
        int left = 0;

        for(int right =0; right < nums.length; right++){
            if(nums[right] != 0){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
            }
        }
    }
}

//brute force
//class Solution { n, n
//        public void moveZeroes(int[] nums) {
//            int[] temp = new int[nums.length];
//            int idx = 0;
//
//            for (int num : nums) {
//                if (num != 0) {
//                    temp[idx++] = num;
//                }
//            }
//
//            // copy back
//            for (int i = 0; i < nums.length; i++) {
//                nums[i] = temp[i];
//            }
//        }
//    }
