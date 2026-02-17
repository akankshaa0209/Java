package Sorting;
//All the questions where we need to find the repeating numbers,
// or missing numbers can easily be solved with the help of a pattern
// that is cyclic sort.
// In this pattern we simply place the elements of the array on their positions
// ( or at least try to ), like 1 should be at 1st position and 2 at the second position,
// and then we iterate again and check if for any index we have an element
// whose value is not equal to index + 1, then that is the missing number.

//https://leetcode.com/problems/first-missing-positive/description/

//approach: positioning the ele at the correct index

public class FirstMssingPositive {
    class Solution {
        public int firstMissingPositive(int[] nums) {
            int i = 0;
            int n = nums.length;

            // Step 1: Place numbers at correct indices
            while (i < n) {
                int correct = nums[i] - 1;

                if (nums[i] > 0 && nums[i] <= n && nums[i] != nums[correct]) {
                    // swap nums[i] and nums[correct]
                    int temp = nums[i];
                    nums[i] = nums[correct];
                    nums[correct] = temp;
                } else {
                    i++;
                }
            }

            // Step 2: Find first index where value is incorrect
            for (int index = 0; index < n; index++) {
                if (nums[index] != index + 1) {
                    // Input: nums = [7,8,9,11,12]
                    // Output: 1
                    return index + 1;
                }
            }

            // Step 3: If all correct
            return n + 1;
        }
    }
}

///class Solution {
///     public int firstMissingPositive(int[] nums) {
///
///         int ans[] = new int[nums.length+1];
///
///         // mark the presence of each positive integer in the input array
///         for(int i = 0; i < nums.length; i++){
///             int val = nums[i];
///             if(val > 0 && val <= nums.length) { // check to avoid index out of bounds
///                 ans[val] = 1;
///             }
///         }
///
///         // find the smallest missing positive integer by checking the array of marked integers
///         for(int i = 1; i < ans.length; i++){
///             if(ans[i] == 0){
///                 return i;
///             }
///         }
///
///         // if no missing positive integer is found, return the length of the array
///     return ans.length;
///     }
/// }
