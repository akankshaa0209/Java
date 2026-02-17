package Recursion;

//https://leetcode.com/problems/reverse-integer/description/

import java.util.Arrays;

//1234 = 4 + f(234) = 2 + f(34) = 3 + f(4)

public class ReverseANumber {
    public static void main(String[] args){
        int n = 1234;
        func(n);
    }

    //using str d, d
    static int revUsingStr(int n){
        boolean isneg= n<0;

        String s = Integer.toString(Math.abs(n));
        String reversed = new StringBuilder(s).reverse().toString();

        int result = Integer.parseInt(reversed);

        return isneg ? -result : result;
    }

    static void func(int n){  //d, 1
        int sum = 0;

        //to handle negative case
        int sign = n<0 ? -1:0;
        n=Math.abs(n);

        while(n>0){
            int rem = n%10;
            sum = sum*10 + rem;
            n=n/10;
        }
        System.out.println(sum*sign);
    }
}

//recursive approach
//static void rev1(int n) {
//        if (n == 0) {
//            return;
//        }
//        int rem = n % 10;
//        sum = sum * 10 + rem;
//        rev1(n/10);
//    }
