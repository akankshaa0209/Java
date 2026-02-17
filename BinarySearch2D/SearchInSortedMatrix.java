package BinarySearch2D;

//[[1,2,3,4],
// [5,6,7,8],
// [9,10,11,12],
// [13,14,15,16]]  target=2

//1. brute n*n
//2. convert it to 1d array, then apply BS
//3. BS log(n) + log(m)
// auxiliary space = O(1)

import java.util.Arrays;

public class SearchInSortedMatrix {
    public static void main(String[] args){
//        int[][] arr = {
//                {10,20,30,40},
//                {11,25,35,45},
//                {28,29,37,49},
//                {33,34,38,50}
//        };

        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        System.out.println(searchMatrix(arr, 8));
    }

    static boolean binarySearch(int[] nums, int target) {
        // Get the length of the array
        int n = nums.length;

        // Initialize low and high pointers
        int low = 0, high = n - 1;

        // Perform binary search
        while (low <= high) {
            // Calculate the middle index
            int mid = (low + high) / 2;

            // If the middle element is the target, return true
            if (nums[mid] == target)
                return true;

                // If target is greater, search in the right half
            else if (target > nums[mid])
                low = mid + 1;

                // Otherwise, search in the left half
            else
                high = mid - 1;
        }

        // Return false if target is not found
        return false;
    }

    // Function to search for target in a 2D matrix
    static boolean searchMatrix(int[][] matrix, int target) {
        // Get the number of rows
        int n = matrix.length;

        // Get the number of columns
        int m = matrix[0].length;

        // Traverse each row
        for (int i = 0; i < n; i++) {
            // Check if target could be in this row
            if (matrix[i][0] <= target && target <= matrix[i][m - 1]) {
                // Perform binary search on this row
                return binarySearch(matrix[i], target);
            }
        }

        // Return false if target is not found
        return false;
    }
}

