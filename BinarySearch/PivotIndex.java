package BinarySearch;

//// arr = [4,5,6,7,0,1,2]===3
//static int findPivotBrute(int[] arr) {
//    for (int i = 0; i < arr.length - 1; i++) {
//        if (arr[i] > arr[i + 1]) {
//            return i;   // pivot found
//        }
//    }
//    return -1; // array not rotated
//}

//////If You Want Pivot as Smallest Element Index
//static int findMinIndexBrute(int[] arr) {
//    int min = arr[0];
//    int index = 0;
//
//    for (int i = 1; i < arr.length; i++) {
//        if (arr[i] < min) {
//            min = arr[i];
//            index = i;
//        }
//    }
//    return index;
//}


public class PivotIndex {
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
