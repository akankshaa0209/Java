package assignment;

import java.util.Scanner;

public class SimpleInterest {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter values: ");
        int P = in.nextInt();
        int T = in.nextInt();
        int R = in.nextInt();

        System.out.println("SI is " + (P*T*R)/100);
    }
}
