package assignment;

import java.util.Scanner;

public class SumAvgArrays {

    // Method to calculate sum
    static int findSum(int[] arr) {
        int sum = 0;
        for (int n : arr) {
            sum += n;
        }
        return sum;
    }

    // Method to find smallest number
    static int findSmallest(int[] arr) {
        int min = arr[0];
        for (int n : arr) {
            if (n < min) {
                min = n;
            }
        }
        return min;
    }

    // Method to calculate average
    static double findAverage(int[] arr) {
        return (double) findSum(arr) / arr.length;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("How many numbers do you want to enter? ");
        int n = in.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " numbers:");

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int sum = findSum(arr);
        int smallest = findSmallest(arr);
        double avg = findAverage(arr);

        System.out.println("Sum = " + sum);
        System.out.println("Smallest = " + smallest);
        System.out.println("Average = " + avg);
    }
}
