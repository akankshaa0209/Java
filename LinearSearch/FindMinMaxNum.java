package LinearSearch;

public class FindMinMaxNum {
    public static void main (String[] args) {
        int[] nums = {1,2,6, -7,8,9};
        System.out.println(func(nums));

    }

    static int func(int[] arr) {
        if(arr.length == 0) return Integer.MAX_VALUE;
        int min = Integer.MAX_VALUE;

        //Assume array is non-empty
        //int min = arr[0];

        for (int i=0; i<arr.length; i++) {
            if (arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
}
