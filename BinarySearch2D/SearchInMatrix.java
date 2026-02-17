package BinarySearch2D;
//row col wise sorted matrix

//brute force | O(N2)
//static Boolean isPresent(int[][] arr, int target) {
//    for (int row = 0; row < arr.length; row++){
//        for (int col = 0; col< arr[row].length; col++){
//            if(arr[row][col] == target){
//                return true;
//                  //return new int[]{row, col};
//            }

import java.util.Arrays;

////                return false;
//        }
//    };
//    return false;
//    //return new int[]{-1, -1};
//}

//Ques: matrix is sorted in rowwise  and colwise manner
//[[10,20,30,40],
// [11,25,35,45],
// [28,29,37,49],
// [33,34,38,50]]  target=37
    //brute--> above
//    lb=10, ub=40 || row 0, col last
//    O(n+n)= O(2n)= O(n)

//when you are given large search spaces, try to see how you can minimize that search:
    //by eliminating rows and columns

public class SearchInMatrix {
   public static void main(String[] args) {
        int[][] arr = {
                {10,20,30,40},
                {11,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };

       System.out.println(Arrays.toString(search(arr, 37)));
   }

   static int[] search(int[][] matrix, int target){
       int r = 0;
       int c = matrix.length-1;

       while(r < matrix.length && c>=0){
           if(matrix[r][c] == target){
               return new int[]{r,c};
           }
           if(matrix[r][c] < target){
               r++;
           } else {
               c--;
           }
       }
       return new int[]{-1,-1};
   }
}
