package Arrays;

import java.util.Arrays;

public class SwapArray {
    public static void main (String[] args) {
        int[] arr = {1,2,3};
        swap(arr, 1, 2);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int id1, int id2) {
        int temp = arr[id1];
        arr[id1] = arr[id2];
        arr[id2] = temp;
    }
}
