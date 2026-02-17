package BinarySearch;

//https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
// medium:https://leetcode.com/problems/find-peak-element/description/
// https://leetcode.com/problems/find-in-mountain-array/submissions/
//hard: find in mountain array

public class PeakIdxInMountainArray {
    public static void main(String[] args) {
        int[] arr = {0, 1,3, 0};
        System.out.println(func(arr));
    }

//    static int func(int[] arr) {
//        int n = arr.length;
//        int peak = 0;
//        int idx = -1;
//
//        for (int i = 0; i < n; i++) {
//            if (arr[i] > peak) {
//                peak = arr[i];
//                idx = i;
//            }
//        }
//        return idx;
//    }

    static int func(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start<end){ //no = as we are comparing m , m+1
            int mid = start+(end-start)/2;

            if(arr[mid]>arr[mid+1]){
                end = mid;
            } else if(arr[mid]<arr[mid+1]){
                start=mid+1;
            }
        }
//        return arr[start];
        return start;
    }
}