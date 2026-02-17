package Sorting;

public class RecSelectionSort {

        public static void main(String[] args) {
            int[] arr = {64, 25, 12, 22, 11};
            selectionSort(arr, 0);

            for (int num : arr) {
                System.out.print(num + " ");
            }
        }

        static void selectionSort(int[] arr, int i) {
            int n = arr.length;

            // Base case: array sorted
            if (i == n ) return;

            // Find minimum index from i to n-1
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;

            // Recursive call for remaining array
            selectionSort(arr, i + 1);
        }
    }


