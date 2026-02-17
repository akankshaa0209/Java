package BinarySearch;

//do dry run
//if no ans found in ceil, return start
//if no ans found in floor, return end
// O(N)
// O(N)

public class FloorCeilArray {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        System.out.println(ceil(arr, 19));
        System.out.println(ceil(arr, 15));
        System.out.println(ceil(arr, 15));
        System.out.println(floor(arr, 1));
    }

    //smallest no in arr >= target
    static int ceil(int[] arr, int target) {
        int n = arr.length;

        //edge case
        if(target > arr[n-1]) {
            return -1;
        }

        int start = 0;
        int end = n - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return start;
    }

    static int floor(int[] arr, int target) {
        int n = arr.length;

        //edge case
        if(target < arr[0]) {
            return -1;
        }

        int start = 0;
        int end = n - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return end;
    }
}
