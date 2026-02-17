package LinearSearch;

public class Basic {
    public static void main (String[] args) {
        int[] nums = {1,2,3,4};
        int target = 12;
//        int ans = func1(nums, target);
        Boolean ans = func2(nums, target);
        System.out.println(ans);
    }

    //return the index, else return -1
//    static int func(int[] arr, int target) {
//        if (arr.length == 0) {
//            return -1;
//        }
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == target) {
//                return i;
//            }
//        }
//        return -1;
//    }

    //return the element itself
//    static int func1(int[] arr, int target) {
//        if (arr.length == 0) {
//            return -1;
//        }
//        for (int i =0; i<arr.length; i++) {
//            if (arr[i] == target) {
//                return arr[i];
//            }
//        }
//        return Integer.MAX_VALUE;
//    }

    //return true false
        static boolean func2(int[] arr, int target) {
        if (arr.length == 0) {
            return false;
        }
        for (int i =0; i<arr.length; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        return false;
//            return Integer.MAX_VALUE;
    }

}
