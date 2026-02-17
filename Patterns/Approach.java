package Patterns;

//STEP 1
//1.) Run the outer for loop, the number of times you see lines= lines=rows
//2.) 4 rows

//STEP 2
//identify for every row no, how many cols are there
//or types of ele in col
//1st row=1col, 2nd row=2cols, 3rd row=3cols and so on (row=col)
//star type

//STEP 3
//what do you need to print

public class Approach {
    public static void main(String[] args){
        pattern1(4);
        System.out.println();
        pattern2(4);
        System.out.println();
        pattern3(4);
        System.out.println();
        pattern4(5);
        System.out.println();
        pattern5(5);
        System.out.println();
        pattren6(5);
        System.out.println();
        pattren7(5);
        System.out.println();
        pattern8(5);
        System.out.println();
        pattern9(5);
        System.out.println();
        pattern10(5);
        System.out.println();
        pattern30(5);
    }

//1.      *****
//        *****
//        *****
//        *****
//        *****

    static void pattern1(int n){
        for (int row = 1; row <= n ; row++) {
            for (int col = 1; col <= n ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

//2.      *
//        **
//        ***
//        ****


    static void pattern2(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row ; col++) {
                System.out.print("* ");
            }
            //when one row is printed, we need to add new line
            System.out.println();
        }
    }

//3.      *****
//        ****
//        ***
//        **
//        *

    static void pattern3(int n){
//        for (int row = 1; row <= n; row++) {
//            for (int col = 1; col <= n-row+1 ; col++) {
//                System.out.print("* ");
//            }
//            //when one row is printed, we need to add new line
//            System.out.println();
//        }
        for (int row = n; row >= 1; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

//4.      1
//        1 2
//        1 2 3
//        1 2 3 4
//        1 2 3 4 5

    static void pattern4(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row ; col++) {
//                System.out.print("col ");
                System.out.print(col + " ");
            }
            //when one row is printed, we need to add new line
            System.out.println();
        }
    }

//5.      *
//        **
//        ***
//        ****
//        *****
//        ****
//        ***
//        **
//        *


    static void pattern5(int n){
        // upper half (including middle)
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // lower half
        for (int row = n - 1; row >= 1; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

//6.       *
//        **
//       ***
//      ****
//     *****
    //Spaces = n − row , stars=row
    static void pattren6(int n){
        for (int row = 1; row <= n; row++) {

            // print spaces
            for (int col = 1; col <= n - row; col++) {
                System.out.print(" ");
            }

            // print stars
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

//    7.   *****
//          ****
//           ***
//            **
//             *

    //space=row-1,  stars=n-row+1
    static void pattren7(int n){
        for (int row = 1; row <= n; row++) {

            // print spaces
            for (int col = 1; col <= row-1; col++) {
                System.out.print(" ");
            }

            // print stars
            for (int col = 1; col <= n-row+1; col++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

//        *
//       ***
//      *****
//     *******
//    *********
//   spaces=n-row, stars=2*row-1

    static void pattern8(int n){
        for (int row = 1; row <= n; row++) {

            // spaces
            for (int col = 1; col <= n - row; col++) {
                System.out.print(" ");
            }

            // stars
            for (int col = 1; col <= 2 * row - 1; col++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    //inverted pyramid
    //Spaces = row - 1,  Stars = 2 * (n - row) + 1

    static void pattern9(int n){
        for (int row = 1; row <= n; row++) {

        // spaces
        for (int col = 1; col <= row - 1; col++) {
            System.out.print(" ");
        }

        // stars
        for (int col = 1; col <= 2 * (n - row) + 1; col++) {
            System.out.print("*");
        }

        System.out.println();
    }
    }

    //Diamond pattern
//    Upper half → Pattern 8 (increasing pyramid)
//    Lower half → Pattern 9 (decreasing pyramid)
//    Stars = 2 * row - 1
//    Spaces = n - row

    static void pattern10(int n){
//             Upper half
        for (int row = 1; row <= n; row++) {

        // spaces
        for (int col = 1; col <= n - row; col++) {
            System.out.print(" ");
        }

        // stars
        for (int col = 1; col <= 2 * row - 1; col++) {
            System.out.print("*");
        }

        System.out.println();
    }

    // Lower half
        for (int row = n - 1; row >= 1; row--) {

        // spaces
        for (int col = 1; col <= n - row; col++) {
            System.out.print(" ");
        }

        // stars
        for (int col = 1; col <= 2 * row - 1; col++) {
            System.out.print("*");
        }

        System.out.println();
    }
    }



    //number pyramid
    
    static void pattern30(int n){
        for (int row = 1; row <= n; row++) {

            // Print spaces
            for (int col = 1; col <= n - row; col++) {
                System.out.print(" ");
            }

            // Print numbers
            for (int num = 1; num <= row; num++) {
                System.out.print(num + " ");
            }

            System.out.println();
        }
    }
    
}
