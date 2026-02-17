package Arrays;

public class rowColWiseSumMatrix {
    public static void main (String[] args) {
        int[][] arr = {
                {1,2,3}, // 0th
                {4,5}, //1st
                {6,7,8,9} //2nd
        };
        rowWise(arr);
    }

    static void rowWise(int[][] arr) {
        int n = arr.length;

        for (int row = 0 ; row < arr.length; row++) {
            int sum = 0;
            for (int col =0; col< arr[row].length; col++) {
                sum += arr[row][col];
            }
            System.out.println("Row " + row + " sum = " + sum);
        }
    }
}

//public class rowColWiseSumMatrix {
//    public static void main(String[] args) {
//        int[][] arr = {
//                {1, 2, 3},
//                {4, 5},
//                {6, 7, 8, 9}
//        };
//
//        System.out.println(Arrays.toString(rowWise(arr)));
//    }
//
//    static int[] rowWise(int[][] arr) {
//        int[] result = new int[arr.length];
//
//        for (int row = 0; row < arr.length; row++) {
//            int sum = 0;
//            for (int col = 0; col < arr[row].length; col++) {
//                sum += arr[row][col];
//            }
//            result[row] = sum;
//        }
//
//        return result;
//    }
//}

