package Arrays;

public class Max {
    public static void main (String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(max(arr));
//        System.out.println(maxRangeInGivenIdx(arr, 1,3));
    }

    static int max(int[] arr) {
        int n = arr.length;
        int maxi = arr[0];

        if (n==0) {
            return -1;
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] > maxi) {
                maxi = arr[i];
            }
        }
        return maxi;
    }

    static int maxRangeInGivenIdx(int[] arr, int start, int end) {
        int n = arr.length;
        int maxi = arr[start];

        if (end>start) {
            return -1;
        }

        if (arr == null){
            return  -1;
        }

        for (int i = start; i < end; i++) {
            if (arr[i] > maxi) {
                maxi = arr[i];
            }
        }
        return maxi;
    }
}
