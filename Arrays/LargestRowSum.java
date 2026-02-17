package Arrays;

public class LargestRowSum {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 12, 11}, {7, 8, 9}};

        func(arr);

//        int rowIndex = func(arr);
//        System.out.println(rowIndex);
//
//        int[] result = func(arr);
//        System.out.println("Row: " + result[0] + ", Sum: " + result[1]);

    }


    static void func(int[][] nums) {
        int max = Integer.MIN_VALUE;
        int idx = -1;

        for (int row =0; row< nums.length; row++) {
            int sum = 0;
            for (int col =0; col < nums[row].length; col++) {
                sum += nums[row][col];
            }
            if(sum > max){
                max = sum;
                idx= row;
            }
        }
        System.out.println("Row: " + idx + ", Sum: " + max);
    }

//    static int func(int[][] nums) {
//        int max = Integer.MIN_VALUE;
//        int idx = -1;
//
//        for (int row = 0; row < nums.length; row++) {
//            int sum = 0;
//            for (int col = 0; col < nums[row].length; col++) {
//                sum += nums[row][col];
//            }
//            if (sum > max) {
//                max = sum;
//                idx = row;
//            }
//        }
//        return idx;
//    }

//    static int[] func(int[][] nums) {
//        int max = Integer.MIN_VALUE;
//        int idx = -1;
//
//        for (int row = 0; row < nums.length; row++) {
//            int sum = 0;
//            for (int col = 0; col < nums[row].length; col++) {
//                sum += nums[row][col];
//            }
//            if (sum > max) {
//                max = sum;
//                idx = row;
//            }
//        }
//        return new int[]{idx, max};
//    }


}
