package Sorting;

//https://leetcode.com/problems/missing-number/description/

//[0,n], O(n) tc, O(1) SC ==hint use cyclic sort

//cyclic sort approach:
//0 to N means N+1 no.s
//in sorted version, ele=idx here

//case1 normal
//case2 if N is the missing number, return n

public class MissingNumber {
    public static void main(String[] args){
        int[] arr = {4,0,2,1};
//        int res= sort(arr);
//        System.out.println(res);
        System.out.println(sort(arr));
    }

    static int sort(int[] arr){
        int i =0;
        while (i<arr.length){
            int correct = arr[i] ;
            if(arr[i]<arr.length && arr[i]!=arr[correct] ){
                swap(arr, i, correct);
            }
            else{
                i++;
            }
        }
        for(int idx = 0; idx<arr.length; idx++){
            if(arr[idx]!=idx){
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

//1st approach
//import java.util.Arrays;
//class Solution {
//    public int missingNumber(int[] nums) {
//        Arrays.sort(nums);
//        int n = nums.length;
//        // Case 1
//        if (nums[0] != 0) return 0;
//        // Case 2
//        if (nums[n - 1] != n) return n;
//        // Case 3
//        for (int i = 1; i < nums.length; i++) {
//            if (nums[i] != i) return i;
//        }
//        return 0;
//    }
//}

//2nd approach
//public int missingNumber(int[] nums) { //sum
//    int len = nums.length;
//    int sum = (0+len)*(len+1)/2;
//    for(int i=0; i<len; i++)
//        sum-=nums[i];
//    return sum;
//}

//3rd approach
//public int missingNumber(int[] nums) { //binary search
//    Arrays.sort(nums);
//    int left = 0, right = nums.length, mid= (left + right)/2;
//    while(left<right){
//        mid = (left + right)/2;
//        if(nums[mid]>mid) right = mid;
//        else left = mid+1;
//    }
//    return left;
//}

//4th appproach:
//class Solution {
//    public int missingNumber(int[] nums) {
//        Set<Integer> set = new HashSet<>();
//        for (int num : nums) {
//            set.add(num);
//        }
//        for (int i = 0; i <= nums.length; i++) {
//            if (!set.contains(i)) {
//                return i;
//            }
//        }
//        return -1;
//    }
//}