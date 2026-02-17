package Sorting;

//takes min at the front
// n --> rounds = n-1
//unstable
// TC = best = worst = n2
//sc= 1

public class SelectionSort {
    public static void main(String[] args){
        int[] arr = {1,3,5,2,4};
        selectionSort(arr);
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // Traverse through all array elements
        for (int i = 0; i < n ; i++) {
            int minIndex = i; // Assume current index holds the minimum

            // Find the minimum element in the remaining array
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j; // Update minIndex if smaller is found
                }
            }

            // Swap the found minimum element with the first element of unsorted part
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        // Print the sorted array
        System.out.println("After selection sort:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
