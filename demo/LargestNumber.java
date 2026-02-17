package demo;

import java.util.Scanner;

public class LargestNumber {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

//        ======1st=====
//        int max = a;
//        if (b > max){
//            max = b;
//        }
//        if (c > max){
//            max = c;
//        }
//        System.out.println(max);

//        ======2nd=======
//        int max = 0;
//        if ( a > max){
//            max = a;
//        }
//        else {
//            max = b;
//        }
//
//        if (c > max) {
//            max = c;
//        }
//        System.out.println(max);

//        =====Using Math library======
        int max = Math.max(c, Math.max(a, b));
        System.out.println(max);
    }
}

//==========largest num till user enters 0=========
//import java.util.Scanner;
//
//public class LargestTillZero {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int largest = Integer.MIN_VALUE;
//        int num;
//
//        System.out.println("Enter numbers (0 to stop):");
//
//        while (true) {
//            num = sc.nextInt();
//
//            if (num == 0) {
//                break;
//            }
//
//            if (num > largest) {
//                largest = num;
//            }
//        }
//
//        System.out.println("Largest Number = " + largest);
//    }
//}

