package LinearSearch;

import java.util.Arrays;
import java.util.Scanner;

public class Searchin2D {
    public static void main (String[] args) {
        int[][] arr = {
                {1,2,3}, // 0th
                {4,5}, //1st
                {6,7,8,9} //2nd
        }; //each arr itself is a different object

        int target = 1;
        int[] ans = search(arr,target);
        System.out.println(ans);
        System.out.println(Arrays.toString(ans));
//        System.out.println(search(arr, target));
    }

    static int[] search(int[][] arr, int target) {
        for (int row =0; row<arr.length; row++){
            for (int col = 0; col<arr[row].length; col++) {
                if (arr[row][col] == target){
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }

}
