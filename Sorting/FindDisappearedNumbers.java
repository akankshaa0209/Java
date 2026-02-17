package Sorting;

//cyclic sort

//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/

import java.util.ArrayList;
import java.util.List;

public class FindDisappearedNumbers {
    public static void main(String[] args){
        int[] arr = {4,3,2,7,8,2,3,1};
//        int res= sort(arr);
//        System.out.println(res);
        System.out.println(sort(arr));
    }
    static List<Integer> sort(int[] arr){
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

        List<Integer> ans= new ArrayList<>();
        for(int idx = 0; idx<arr.length; idx++){
            if(arr[idx]!=idx+1){
                ans.add(idx+1);
            }
        }
        return ans;
    }

    private static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}

//class Solution {
//    public List<Integer> findDisappearedNumbers(int[] nums) {
//        boolean[] isAvailable = new boolean[nums.length];
//        for(int i=0;i<nums.length;i++){
//            isAvailable[nums[i]-1] = true;
//        }
//        List<Integer> ans = new ArrayList<>();
//        for(int i=0;i<isAvailable.length;i++){
//            if(!isAvailable[i]){
//                ans.add(i+1);
//            }
//        }
//        return ans;
//    }
//}

//class Solution {
//    public List<Integer> findDisappearedNumbers(int[] nums) {
//        List<Integer> ans = new ArrayList<>();
//        Set<Integer> set = new HashSet<>();
//        for(int num: nums) set.add(num);
//
//        for(int i = 1; i <= nums.length; i++) {
//            if(!set.contains(i)) ans.add(i);
//        }
//        return ans;
//    }
//}

//brute
//static List<Integer> findDisappeared(int[] arr) {
//        List<Integer> result = new ArrayList<>();
//
//        for (int i = 1; i <= arr.length; i++) {
//            boolean found = false;
//
//            for (int num : arr) {
//                if (num == i) {
//                    found = true;
//                    break;
//                }
//            }
//
//            if (!found) {
//                result.add(i);
//            }
//        }
//        return result;
//    }