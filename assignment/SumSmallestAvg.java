package assignment;

import java.util.Scanner;

public class SumSmallestAvg {

    // Method to calculate sum
    static int findSum(int a, int b, int c) {
        return a + b + c;
    }

    // Method to find smallest number
    static int findSmallest(int a, int b, int c) {
        int min = a;
        if (b < min) min = b;
        if (c < min) min = c;
        return min;
    }

    // Method to calculate average
    static double findAverage(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int n1 = in.nextInt();

        System.out.print("Enter second number: ");
        int n2 = in.nextInt();

        System.out.print("Enter third number: ");
        int n3 = in.nextInt();

        int sum = findSum(n1, n2, n3);
        int smallest = findSmallest(n1, n2, n3);
        double avg = findAverage(n1, n2, n3);

        System.out.println("Sum = " + sum);
        System.out.println("Smallest = " + smallest);
        System.out.println("Average = " + avg);
    }
}


//=======2 numbers======
//package assignment;
//
//import java.util.Scanner;
//
//public class sum {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//
//        System.out.print("Enter first number: ");
//        int a = in.nextInt();
//
//        System.out.print("Enter second number: ");
//        int b = in.nextInt();
//
//        int sum = a + b;
//        int smallest = Math.min(a, b);
//        double average = sum / 2.0;
//
//        System.out.println("Sum = " + sum);
//        System.out.println("Smallest = " + smallest);
//        System.out.println("Average = " + average);
//    }
//}
