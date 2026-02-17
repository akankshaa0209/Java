package assignment;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        while (true) {
            int n = in.nextInt();

            if (n == 0) {
                break;
            }

            sum += n;
            count ++;
        }

        System.out.println(sum);
        System.out.println(count);
    }
}


//=====sum of 2 numbers======
//import java.util.Scanner;
//
//public class AddTwoNumbers {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter first number: ");
//        int a = sc.nextInt();
//
//        System.out.print("Enter second number: ");
//        int b = sc.nextInt();
//
//        int sum = a + b;
//
//        System.out.println("Sum = " + sum);
//    }
//}

//====sum n numbers//
//import java.util.Scanner;
//
//public class sum {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//        int sum = 0;
//
//        for (int i = 0; i < n; i++) {
//            sum += sc.nextInt();
//        }
//
//        System.out.println("Sum = " + sum);
//    }
//}

