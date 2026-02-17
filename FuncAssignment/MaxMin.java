package FuncAssignment;

import java.util.Scanner;

public class MaxMin {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int maximum = largest(a,b,c);
        System.out.println(maximum);

        int minimum = smallest(a,b,c);
        System.out.println(minimum);


    }

    static int largest(int x, int y, int z) {
        int max = x;
        if (y>x){
            max = y;
        }

        if (z>x) {
            max = z;
        }
        return max;
    }

    static int smallest(int x, int y, int z) {
        int min = x;
        if (y<x){
            min = y;
        }

        if (z<x) {
            min = z;
        }
        return min;
    }
}
