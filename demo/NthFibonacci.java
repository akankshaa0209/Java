package demo;

import java.util.Scanner;

/*
//====ITERATIVE O(n) TIME, O(1) SPACE======
public class NthFibonacci {

    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
//        System.out.println(fib(n));
        fib(n);
    }

// if int fib(n), then use return not sout.
    static void fib(int n) {
//        if (n <= 1) return n;
        if (n <= 1) System.out.println(n);

        int a = 0, b = 1;
        int c = 0;

        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println(c);
//        return c;
    }
}
 */

/*
public class FibIterative {
    public static int fib(int n) {
        if (n <= 1) return n;

        int a = 0, b = 1, c = 0;

        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Nth Fibonacci = " + fib(n));
    }
}
 */

/*
//=======RECURSIVE O(n) space, 2^n time=============
public class NthFibonacci {
    public static int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("Nth Fibonacci = " + fib(n));
    }
}
 */

//==========DP Tabulation O(n) both============
public class NthFibonacci {
    public static int fib(int n) {
        if (n <= 1) return n;

        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Nth Fibonacci = " + fib(n));
    }
}



