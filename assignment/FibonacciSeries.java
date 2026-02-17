package assignment;

import java.util.Scanner;

/*
//======ITERATIVE O(N) TIME, O(1) SPACE===========
public class FibonacciSeries {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int a = 0, b=1; int c=0;

        if (n>=0) System.out.println(a);
        if (n>=1) System.out.println(b);

        for (int i =2; i<=n; i++){
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
//        System.out.println(c);
    }
}
 */


//===========RECURSIVE O(2^N) TIME, O(N) SPACE=========
public class FibonacciSeries {

    public static void main(String[] args) {
        int n = 4; // print first 10 numbers

        for (int i = 0; i < n; i++) {
            System.out.print(fib(i) + " ");
        }
    }

    static int fib(int n) {
        if (n <= 1) return n; //n=0 -->0...n=1 --> 1
        return fib(n - 1) + fib(n - 2);  // two recursive calls
    }
}


//========dp n, n========
//import java.util.Arrays;
//
//public class FibonacciDP {
//
//    static int[] dp = new int[1000];
//
//    public static void main(String[] args) {
//        Arrays.fill(dp, -1);
//
//        int n = 10;
//        for (int i = 0; i < n; i++) {
//            System.out.print(fib(i) + " ");
//        }
//    }
//
//    static int fib(int n) {
//        if (n <= 1) return n;
//        if (dp[n] != -1) return dp[n];
//        return dp[n] = fib(n-1) + fib(n-2);
//    }
//}
