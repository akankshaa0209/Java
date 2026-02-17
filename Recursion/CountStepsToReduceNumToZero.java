package Recursion;

// https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero

public class CountStepsToReduceNumToZero {
    public static void main(String[] args) { //logn
        int n = 1200406;
        System.out.println(numberOfSteps(n));
    }

    public static int numberOfSteps(int num) {
        return helper(num, 0);
    }

    private static int helper(int num, int steps) {
        if (num == 0) {
            return steps;
        }

        if (num % 2 == 0) {
            return helper(num/2, steps+1);
        }
        return helper(num-1, steps+1);
    }
}

//ITERATIVE
//    public static int numberOfSteps(int num) {
//
//        int count = 0;
//        while (num > 0) {
//            num = num % 2 == 0 ? num / 2 : num - 1;
//            count++;
//        }
//        return count;
//    }
