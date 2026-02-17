package Sorting;

import java.util.Arrays;

//Time Complexity: O(N2) for the worst and average cases and O(N) for the best case. Here, N = size of the array.
//
//Space Complexity: O(N) auxiliary stack space.

public class RecursiveBubbleSort {
    public static void main(String[] args){
        int[] arr ={2,3,5,8,1};
        bubbleSort(arr,5);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr, int n) {
        // Base case: array of size 1 is already sorted
        if (n == 1) return;

        // Push the largest element to the end
        for (int j = 0; j <= n - 2; j++) {
            if (arr[j] > arr[j + 1]) {
                // Swap arr[j] and arr[j + 1]
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }

        // Recurse for the remaining unsorted array
        bubbleSort(arr, n - 1);
    }
}
