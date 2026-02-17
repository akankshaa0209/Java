package BinarySearch;

//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

//sorted arr --> Binary search

// brute force : start(i) / end(j); i++ j--; O(N)
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

import java.util.Arrays;

public class FirstLastPositionSortedArr {
    public static void main (String[] args) {
        int[] arr = {5,7,7,7,8,8,10};
//        System.out.println(func(arr,7));
        int[] ans = func(arr,7);
        System.out.println(Arrays.toString(ans));
    }

    static int[] func(int[] arr, int target){
        int[] ans = {-1,-1};

        int start = search(arr, target, true);
        int end = search(arr, target, false);

//        ans[0] = search(arr, target, true);
//        if (ans[0] != -1){
//            ans[1] = search(arr, target, true);
//        }

        ans[0] = start;
        ans[1] = end;

        return ans;
    }

    static int search(int[] arr, int target, boolean fisrtIndex){
        int ans = -1;
        int start = 0;
        int end = arr.length;

        while(start<=end){
            int mid = start + (end - start) / 2;

            if (target<arr[mid]) {
                end = mid -1 ;
            } else if (target>arr[mid]) {
                start=mid+1;
            } else {
                ans = mid;
                if (fisrtIndex) {
                    end = mid -1;
                } else {
                    start =  mid + 1;
                }
            }
        }
        return ans;
    }
}
