package Sorting;

//https://leetcode.com/problems/set-mismatch/description/
//cyclic sort (dup+missing)

public class FindDupMissingORSetMismatch {
    public int[] findErrorNums(int[] nums) {
        int i = 0;

        // Step 1: Cyclic sort
        while (i < nums.length) {
            int correct = nums[i] - 1;

            if (nums[i] != nums[correct]) {
                // swap nums[i] with nums[correct]
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            } else {
                i++;
            }
        }

        // Step 2: Find duplicate and missing
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                return new int[]{nums[index], index + 1};
            }
        }

        return new int[]{-1, -1};
    }
}

// n , n
//class Solution {
//    public int[] findErrorNums(int[] nums) {
//
//        HashSet<Integer> h = new HashSet<>();
//        int dup=0;
//        for(int n : nums){
//            if(h.contains(n)){
//                dup=n;
//            } else {
//                h.add(n);
//            }
//        }
//
//        for(int i=1;i<=nums.length;i++){
//            if(!h.contains(i))
//                return new int[]{dup,i};
//        }
//
//        return new int[]{};
//    }
//}

//class Solution {
//    public int[] findErrorNums(int[] nums) {
//     int x[] = new int[nums.length+1];
//
//     for(int i:nums){
//         x[i]++;
//     }
//
//     int dup=0 , miss=0;
//
//     for(int i=1;i<x.length;i++){
//         if(x[i]==2){
//             dup=i;
//         }
//         if(x[i] ==0){
//             miss=i;
//         }
//     }
//
//return new int[]{dup,miss};
//
//
//    }
//}
