package BinarySearch;

//https://leetcode.com/problems/find-in-mountain-array/
//1. find peak element
//2. search in left
//3. search in right

public class FindInMountainArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3, 1};
        System.out.println(search(arr, 3));
    }

    static int search(int[] arr, int target) {
        int peak = func(arr);
        int leftSearch = orderAgnosticBS(arr, target, 0, peak);
        if (leftSearch != -1) {
            return leftSearch;
        } else {
            return orderAgnosticBS(arr, target, peak + 1, arr.length - 1);
        }
    }

    static int func(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) { //no = as we are comparing m , m+1
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            }
        }
//        return arr[start];
        return start;
    }


    static int orderAgnosticBS(int[] arr, int target, int start, int end) {
//    int start = 0;
//    int end = arr.length - 1;

        Boolean isAsc;
        if (arr[start] < arr[end]) {
            isAsc = true;
        } else {
            isAsc = false;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2; //to avoid exceeding raneg of integers

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }

        }
        return -1;

    }
}
