package BinarySearch;
//https://leetcode.com/problems/search-in-rotated-sorted-array/

//bruteforce
//    public int search(int[] nums, int target) {
//        int i, n=nums.length;
//        for(i=0;i<n;i++)
//        {
//            if(nums[i]==target)
//            {
//                return i;
//            }
//
//        }
//        return -1;
//
//    }

//use pivot
//1. find pivot
//2. serach in first half (start, pivot)
//3. search in second half (pivot+1, end)

public class SearchInRotatedSortedArray {
    public static void main(String[] args){
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(func(arr, 0));
    }

    static int func(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[start] <= nums[mid]) { // Left part is sorted
                if (nums[start] <= target && target <= nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else { // Right part is sorted
                if (nums[mid] <= target && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
