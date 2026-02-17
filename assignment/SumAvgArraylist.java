package assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class SumAvgArraylist {

    // Method to calculate sum
    static int findSum(ArrayList<Integer> list) {
        int sum = 0;
        for (int n : list) {
            sum += n;
        }
        return sum;
    }

    // Method to find smallest number
    static int findSmallest(ArrayList<Integer> list) {
        int min = list.get(0);
        for (int n : list) {
            if (n < min) {
                min = n;
            }
        }
        return min;
    }

    // Method to calculate average
    static double findAverage(ArrayList<Integer> list) {
        return (double) findSum(list) / list.size();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("How many numbers do you want to enter? ");
        int n = in.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter " + n + " numbers:");

        for (int i = 0; i < n; i++) {
            list.add(in.nextInt());
        }

        int sum = findSum(list);
        int smallest = findSmallest(list);
        double avg = findAverage(list);

        System.out.println("Sum = " + sum);
        System.out.println("Smallest = " + smallest);
        System.out.println("Average = " + avg);
    }
}
