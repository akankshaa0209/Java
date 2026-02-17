package Sorting;

//https://leetcode.com/problems/find-all-duplicates-in-an-array/submissions/

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//O(1) space
//public List<Integer> findDuplicates(int[] nums) {
//        int i = 0;
//
//        while (i < nums.length) {
//            int correct = nums[i] - 1;
//
//            // place number at its correct index
//            if (nums[i] != nums[correct]) {
//                swap(nums, i, correct);
//            } else {
//                i++;
//            }
//        }
//
//        List<Integer> result = new ArrayList<>();
//
//        // numbers not at correct index are duplicates
//        for (int index = 0; index < nums.length; index++) {
//            if (nums[index] != index + 1) {
//                result.add(nums[index]);
//            }
//        }
//
//        return result;
//    }
//
//    static void swap(int[] arr, int i, int j) {
//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//    }

public class FindAllDupInArr {

    public static void main(String[] args){
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(arr));
    }

        static List<Integer> findDuplicates(int[] nums) {
            Set<Integer> set = new HashSet<>();
            List<Integer> result = new ArrayList<>();

            for (int i = 0; i < nums.length; i++) {
                if (set.contains(nums[i])) {
                    // element already present → duplicate
                    result.add(nums[i]);
                } else {
                    // element not present → insert
                    set.add(nums[i]);
                }
            }
            return result;
        }

}


//brute
//public List<Integer> findDuplicates(int[] nums) {
//        List<Integer> result = new ArrayList<>();
//
//        for (int i = 0; i < nums.length; i++) {
//            // Check if nums[i] appears again
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[i] == nums[j]) {
//                    // Avoid adding same duplicate multiple times
//                    if (!result.contains(nums[i])) {
//                        result.add(nums[i]);
//                    }
//                    break;
//                }
//            }
//        }
//        return result;
//    }

