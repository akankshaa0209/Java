package ArrayAssignment;

import java.util.Arrays;

public class HowManyNumLessThanCurr {
    public static void main (String[] args) {
        int[] arr = {8,1,2,2,3};
        System.out.println(Arrays.toString(func(arr)));
    }

    static int[] func(int[] nums){
        int n = nums.length;
        int[] temp = new int[n];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if (nums[i]>nums[j]) {
                    temp[i]++;
                }
            }
        }
        return temp;
    }
}
