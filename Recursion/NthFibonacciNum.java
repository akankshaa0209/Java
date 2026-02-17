package Recursion;

//https://leetcode.com/problems/fibonacci-number/description/

//0,1,1,2,3,5,8,13....
//0th, 1st,...
//fib(n)=fib(n-1)+fib(n-2) //recurrence rel

//see c++ notes (recursion topic)

//will be stuck for 50. cz so many similar rec calls, stuck
//DP= no need to compute same rec calls again and again

public class NthFibonacciNum {

    public static void main(String[] args) {
        int amswer = fibo(4);
        System.out.println(amswer);
           System.out.println(fiboFormula(50));
}

static int fiboFormula(int n){
    // just for demo, use long instead
    return (int) ((Math.pow(((1+Math.sqrt(5))/2),n)-Math.pow(((1-Math.sqrt(5))/2),n))/Math.sqrt(5));
}

    static int fibo(int n) {
        // base condition
        if (n ==0) {
            return 0;
        }
        if(n==1){
            return 1;
        }

        //this is not tail rec,
        // as fib(n-1)
        //then fib(n-2)
        //then sum
        int ans= fibo(n - 1) + fibo(n - 2);
        return ans;
    }

    static int fiboDP(int n) {  //tabulation
        if (n == 0) return 0;
        if (n == 1) return 1;

        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }
}
