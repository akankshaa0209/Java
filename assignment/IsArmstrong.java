package assignment;

import java.util.Scanner;

public class IsArmstrong {
    public static void main (String[] args) {
//        Scanner in = new Scanner(System.in);
//        int num = in.nextInt();
//
//        if (isArmstrong(num)) {
//            System.out.println("Yes");
//        } else {
//            System.out.println("no");
//        }

        for (int i= 100; i < 1000; i++) {
            if(isArmstrong(i)){
                System.out.println(i + " ");
            }
        }
    }

    static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;

        // Count digits
//        int digits = String.valueOf(n).length();

        String str = String.valueOf(n);
        int digits = str.length();

        // Calculate sum of digit^digits
        while (n > 0) {
            int digit = n % 10;
//            sum += Math.pow(digit, digits);
            sum += digit * digit * digit;
            n /= 10;
        }

        return sum == original;
    }

}

//import java.util.Scanner;
//
//public class Armstrong {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//        int temp = n;
//        int sum = 0;
//
//        while (temp > 0) {
//            int digit = temp % 10;
//            sum += digit * digit * digit;
//            temp /= 10;
//        }
//
//        if (sum == n) System.out.println("Armstrong");
//        else System.out.println("Not Armstrong");
//    }
//}

