package BitwiseNumberSystem;

public class FlipImage {
    // https://leetcode.com/problems/flipping-an-image
        public int[][] flipAndInvertImage(int[][] image) {
            for(int[] row : image) {
                // reverse this array

                for (int i = 0; i < (image[0].length ) / 2; i++) {
                    // swap
                    int temp = row[i] ^ 1;
                    row[i] = row[image[0].length - i - 1] ^ 1;
                    row[image[0].length - i - 1] = temp;
                }
            }
            return image;
        }
}

//public int[][] flipAndInvertImage(int[][] image) {
//    for (int[] row : image) {
//        int left = 0;
//        int right = row.length - 1;
//
//        while (left < right) {
//            int temp = invert(row[left]);
//            row[left] = invert(row[right]);
//            row[right] = temp;
//
//            left++;
//            right--;
//        }
//
//        // if odd length, invert middle element
//        if (left == right) {
//            row[left] = invert(row[left]);
//        }
//    }
//    return image;
//}
//
//private int invert(int val) {
//    if (val == 0) return 1;
//    return 0;
//}
