package ArrayAssignment;
//https://leetcode.com/problems/container-with-most-water/

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int maxArea=0;
        int left=0;
        int right=height.length-1;

        while(left<right){
            maxArea= Math.max(maxArea, (right-left)* Math.min(height[left], height[right]));

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
}

//brute
// O(n^2) space: O(1)
// public static int maxArea_bf(int[] height) {
//     int len = height.length;
//     int max = 0;
//     for (int i = 0; i < len - 1; i++) {
//         for (int j = i + 1; j < len; j++) {
//             int area = Math.min(height[i], height[j]) * (j - i);
//             max = Math.max(max, area);
//         }
//     }

//     return max;
// }

