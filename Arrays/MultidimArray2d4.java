package Arrays;

//matrix

import java.util.Scanner;

public class MultidimArray2d4 {
    public static void main (String[] args) {
        /*
        1 2 3
        4 5 6
        7 8 9
        new int[rows][col]
         */
// specifying rows is mandatory.
        Scanner in = new Scanner(System.in);
//        int[][] arr = new int[3][3];
//        int[][] arr = new int[3][];

        int[][] arr = {
                {1,2,3}, // 0th
                {4,5}, //1st
                {6,7,8,9} //2nd
        }; //each arr itself is a different object

//        int[][] arr = new int[3][3];
//        System.out.println(arr.length); //rows

//        // input (row-wise)
//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++ ) {
//                arr[row][col] = in.nextInt();
//            }
//        }

        // input (column-wise)
//        for (int col = 0; col < 3; col++){
//            for (int row = 0; row < 3; row++){
//                arr[row][col] = in.nextInt();
//            }
//        }

        //output
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++ ) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println(); //to print as matrix
        }

//        for (int row = 0; row < arr.length; row++) {
//            System.out.println(Arrays.toString(arr[row]));
//        }
//
//        for ( int[] a : arr ){
//            System.out.println(Arrays.toString(a));
//        }


        System.out.println("enter target");
        int target = in.nextInt();
        if(isPresent(arr, target)) System.out.println("yes");
        else System.out.println("no");

    }

    static Boolean isPresent(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++){
            for (int col = 0; col< arr[row].length; col++){
                if(arr[row][col] == target){
                    return true;
                }
//                return false;
            }
        }
        return false;
    }

}
