package BinarySearch;
//https://www.geeksforgeeks.org/dsa/find-rotation-count-rotated-sorted-array/
//pivot times = ans= index[pivot]+1

public class RotationCount {
    public static void main(String[] args){
        int[] arr = {3,4,5,1,2};
        System.out.println(func(arr));
    }

    static int func(int[] arr) {
        int pivot = findPivot(arr);
        int ans = pivot+1;
        return ans;
    }

    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Case 1: mid > mid+1 → pivot found
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            // Case 2: mid < mid-1 → pivot is mid-1
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            /// in case of duplicates
//            if (arr[start] == arr[mid] && arr[mid] == arr[end]) {
//                start++;
//                end--;
//            } else if (arr[start] <= arr[mid]) {
//                start = mid + 1;
//            } else {
//                end = mid - 1;
//            }

            // Decide which side to go
            if (arr[start] <= arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1; // not rotated
    }
}
