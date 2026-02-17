package ArrayAssignment;

import java.util.Arrays;

public class KidsWithGreatestNumOfCandies {
    public static void main (String[] args) {
        int[] arr = {2,3,5,1,3};
//        int[] result = func(arr, 3);
        Boolean[] result = func(arr, 3);
        System.out.println(Arrays.toString(result));
    }

    static Boolean[] func(int[] arr, int extra) {
        int n = arr.length;
        int max = Integer.MIN_VALUE;

//        int[] res = new int[n];
        Boolean[] res = new Boolean[n];

        for (int i = 0; i<n;i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }

        for (int i = 0; i <n; i++){
            if(arr[i] + extra >= max){
//                res[i] = 1;
                res[i] = true;
            } else {
//                res[i] = 0;
                res[i] = false;
            }
        }
        return res;
    }
}
