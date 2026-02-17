package Recursion.Array;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 1, 2, 3};
        System.out.println(search(arr, 4, 0, arr.length - 1));
    }

    static int search(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        }

        int m = s + (e-s) / 2;
        if (arr[m] == target) {
            return m;
        }

        //case1
        if (arr[s] <= arr[m]) { //sorted
            if (target >= arr[s] && target <= arr[m]) {
                return search(arr, target, s, m-1);
            } else {
                return search(arr, target, m+1, e);
            }
        }

        //case2 eg {6,1,2,3,4}  key 2
        //if not sorted, does target lies in second sorted part
        if (target >= arr[m] && target <= arr[e]) {
            return search(arr, target, m+1, e);
        }

        //case3 key =6
        return search(arr, target, s, m-1);
    }
}
