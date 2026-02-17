package Sorting;

//https://leetcode.com/problems/find-the-duplicate-number/

import java.util.HashSet;
import java.util.Set;

public class FindDupNum {
    static int sort(int[] arr){
        int i =0;
        while (i<arr.length){
            int correct = arr[i] -1;
            if(arr[i]!=arr[correct] ){
                swap(arr, i, correct);
            }
            else{
                i++;
            }
        }
        for(int idx = 0; idx<arr.length; idx++){
            if(arr[idx]!=idx+1){
                return idx;
            }
        }
        //return N(case2)
        return arr.length;
    }

    private static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}

//public static int func(int[] nums) {
//        Set<Integer> set = new HashSet();
//        for (int i = 0; i < nums.length; i++) {
//            if (set.contains(nums[i])) return nums[i];
//            set.add(nums[i]);
//        }
//        return -1;
//    }

//    // 2 Loops brute
//    public static int findDuplicate_2loops(int[] nums) {
//        int len = nums.length;
//        for (int i = 0; i < len; i++) {
//            for (int j = i + 1; j < len; j++) {
//                if (nums[i] == nums[j]) {
//                    return nums[i];
//                }
//            }
//        }
//
//        return len;
//    }

//A HashSet stores unique elements only
//If you try to add a duplicate, it fails
//public static int findDuplicate_set(int[] nums) {
// Set<Integer> set = new HashSet<>();
// int len = nums.length;
// for (int i = 0; i < len; i++) {
// if (!set.add(nums[i])) {
// return nums[i]; } }
// return len;
// }

//Sort the array and check adjacent elements
//Time Complexity: O(n*logn)
//Space Complexity: O(1)
//
//class Solution {
//    public int findDuplicate(int[] nums) {
//        Arrays.sort(nums);
//        for(int i=0;i<nums.length-1;i++)
//            if(nums[i] == nums[i+1]) return nums[i];
//        return -1;
//    }
//}