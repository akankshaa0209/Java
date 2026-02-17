package assignment;

import java.util.Scanner;

public class SubtractProductSum {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = 1;
        int s = 0;

        while (n>0){
            int digit = n%10;
            p *= digit;
            s += digit;
            n = n/10;
        }
        int d = p-s;
//        return p-s;
        System.out.println("Difference = " + d);
    }
}
