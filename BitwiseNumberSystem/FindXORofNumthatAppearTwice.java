package BitwiseNumberSystem;
//https://leetcode.com/problems/single-number-ii/description/

import java.util.Arrays;

//nlogn, 1
public class FindXORofNumthatAppearTwice {
    public int duplicateNumbersXOR(int[] nums) {
        int xor=0;
        Arrays.sort(nums);

        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                xor=xor^nums[i];
                i++;
            }
        }
        return xor;
    }
}

//n,n
//class Solution {
//    public int duplicateNumbersXOR(int[] nums) {
//        HashMap<Integer, Integer> countMap = new HashMap<>();
//        for (int num : nums) {
//            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
//        }
//        int result = 0;
//        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
//            if (entry.getValue() == 2) {
//                result ^= entry.getKey();
//            }
//        }
//        return result;
//    }
//}
