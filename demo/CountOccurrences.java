package demo;

// n = 1233335633
// how many times 3 occurs? 6

import java.util.Scanner;

public class CountOccurrences {
    public static void main(String[] args) {
        int n = 45565;

//        int count = 0;
//        while (n>0) {
//            int rem = n % 10;
//            if (rem == 5) {
//                count ++;
//            }
//            n = n/10;
//        }

        String str = String.valueOf(n);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
           if (str.charAt(i) == '5') {
               count++;
           }
        }

        System.out.println(count);
    }
}
