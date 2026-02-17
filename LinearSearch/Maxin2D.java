package LinearSearch;

import java.util.Arrays;
import java.util.Scanner;

public class Maxin2D {
    public static void main (String[] args) {
        int[][] arr = {
                {1,2,3}, // 0th
                {4,5}, //1st
                {6,7,8,9} //2nd
        }; //each arr itself is a different object

        int ans = search(arr);
        System.out.println(ans);
        System.out.println(Integer.MIN_VALUE);
    }

    static int search(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int row =0; row<arr.length; row++){
            for (int col = 0; col<arr[row].length; col++) {
                if (arr[row][col] >max){
                    max = arr[row][col];
                }
            }
        }
        return max;
    }

}
