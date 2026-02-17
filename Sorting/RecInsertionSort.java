package Sorting;

//tc n2
//sc n

public class RecInsertionSort {
    static void sort(int[] arr, int i) {
        int n = arr.length;

        // Base condition
        if (i == n) return;

        int j = i;
        while (j > 0 && arr[j] < arr[j - 1]) {
            int temp = arr[j];
            arr[j] = arr[j - 1];
            arr[j - 1] = temp;
            j--;
        }

        sort(arr, i + 1);
    }
}
