package BinarySearch;
//https://leetcode.com/problems/find-pivot-index/description/

public class PivotIndexUnsorted {
    public static void main(String[] args) {
        int[] arr = {1,7,3,6,5,6};
        System.out.println(func(arr));
    }

    static int func(int[] arr) {
        int total = 0;
        for (int num : arr) {
            total += num;
        }

        if(arr.length<1){
            return -1;
        }

        int leftTotal = 0;
        for (int i = 0; i < arr.length; i++) {
            int rightTotal = total - leftTotal - arr[i];
            if (rightTotal == leftTotal) {
                return i;
            }
            leftTotal += arr[i];
        }

        return -1;

    }
}
