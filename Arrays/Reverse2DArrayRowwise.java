package Arrays;

//int[][] matrix = {  INPUT
//    {1, 2, 3},
//    {4, 5, 6},
//    {7, 8, 9}
//};

//{3, 2, 1}  OUTPUT
//{6, 5, 4}
//{9, 8, 7}

//(m*n), 1(in place)
public class Reverse2DArrayRowwise {
    public static void reverseRowWise(int[][] matrix) {

//        for (int i = 0; i < matrix.length; i++) {
//            int[] row = matrix[i];

        for (int[] row : matrix) {
            int left = 0;
            int right = row.length - 1;

            while (left < right) {
                int temp = row[left];
                row[left] = row[right];
                row[right] = temp;
                left++;
                right--;
            }
        }
    }
}

//extra space
//public static int[][] reverseRowWise(int[][] matrix) {
//    int[][] result = new int[matrix.length][matrix[0].length];
//
//    for (int i = 0; i < matrix.length; i++) {
//        for (int j = 0; j < matrix[0].length; j++) {
//            result[i][j] = matrix[i][matrix[0].length - j - 1];
//        }
//    }
//    return result;
//}
