package demo;

import java.util.Scanner;

public class SwapNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        int temp = a;
        a = b;
        b = temp;
        System.out.println("a " + a + ",b " + b);
    }

    // Using bitwise XOR
//    a = a ^ b;
//    b = a ^ b;
//    a = a ^ b;
//        System.out.println("\nAfter swapping using XOR:");
//        System.out.println("a = " + a + ", b = " + b);
}
